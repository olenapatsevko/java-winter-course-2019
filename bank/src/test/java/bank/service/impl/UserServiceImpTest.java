package bank.service.impl;

import bank.dao.UserDao;
import bank.domain.User;
import bank.exception.ValidationException;
import bank.service.PasswordEncryption;
import bank.service.validator.Validate;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImpTest {
    private static final String ENCODED_PASSWORD = "encoded_password";
    private static final String PASSWORD = "password";
    private static final String USER_EMAIL = "user@gmail.com";
    private static final String INCORRECT_PASSWORD = "INCORRECT_PASSWORD";
    private static final String ENCODE_INCORRECT_PASSWORD = "encode_incorrect_password";

    private static final User USER =
            User.builder()
                    .withEmail(USER_EMAIL)
                    .withPassword(ENCODED_PASSWORD)
                    .build();

    @Mock
    private UserDao userRepository = mock(UserDao.class);
    @Mock
    private PasswordEncryption passwordEncryption;
    @Mock
    private Validate<User> userValidator;

    @InjectMocks
    private UserServiceImp userService;

    @After
    public void resetMocks() {
        reset(userRepository, passwordEncryption, userValidator);
    }

    @Test
    public void userShouldLoginSuccessfully() throws InvalidKeySpecException, NoSuchAlgorithmException {
        when(passwordEncryption.encrypt(eq(PASSWORD))).thenReturn(ENCODED_PASSWORD);
        when(userRepository.findByEmail(anyString())).thenReturn(Optional.of(USER));

        final boolean isLogin = userService.login(USER_EMAIL, PASSWORD);

        assertTrue(isLogin);
        verify(passwordEncryption).encrypt(eq(PASSWORD));
        verify(userRepository).findByEmail(eq(USER_EMAIL));
        verifyZeroInteractions(userValidator);
    }

    @Test
    public void userShouldNotLoginAsThereIsNotUserWithSuchEmail() throws InvalidKeySpecException, NoSuchAlgorithmException {
        when(passwordEncryption.encrypt(eq(PASSWORD))).thenReturn(ENCODED_PASSWORD);
        when(userRepository.findByEmail(anyString())).thenReturn(Optional.empty());

        final boolean isLogin = userService.login(USER_EMAIL, PASSWORD);

        assertFalse(isLogin);
        verify(passwordEncryption).encrypt(eq(PASSWORD));
        verify(userRepository).findByEmail(eq(USER_EMAIL));
        verifyZeroInteractions(userValidator);
    }

    @Test
    public void userShouldNotLoginAsPasswordIsIncorrect() throws InvalidKeySpecException, NoSuchAlgorithmException {
        when(passwordEncryption.encrypt(eq(INCORRECT_PASSWORD))).thenReturn(ENCODE_INCORRECT_PASSWORD);
        when(userRepository.findByEmail(anyString())).thenReturn(Optional.of(USER));

        final boolean isLogin = userService.login(USER_EMAIL, INCORRECT_PASSWORD);

        assertFalse(isLogin);
        verify(passwordEncryption).encrypt(eq("INCORRECT_PASSWORD"));
        verify(userRepository).findByEmail(eq(USER_EMAIL));
        verifyZeroInteractions(userValidator);
    }

    @Test
    public void userShouldRegisterSuccessfully() {
        doNothing().when(userValidator).validate(any(User.class));
        when(userRepository.findByEmail(anyString())).thenReturn(Optional.empty());
        doNothing().when(userRepository).save(any(User.class));

        final User actual = userService.register(USER);

        assertEquals(USER, actual);
        verify(userValidator).validate(any(User.class));
        verify(userRepository).findByEmail(anyString());
        verify(userRepository).save(any(User.class));
    }

    @Test(expected = ValidationException.class)
    public void userShouldNotRegisterWithInvalidPasswordOrEmail() {
        doThrow(ValidationException.class).when(userValidator).validate(any(User.class));

        userService.register(USER);
    }

    @Test(expected = RuntimeException.class)
    public void userShouldNotRegisterAsEmailIsAlreadyUsed() {
        doNothing().when(userValidator).validate(any(User.class));
        when(userRepository.findByEmail(anyString())).thenReturn(Optional.of(USER));
        doNothing().when(userRepository).save(any(User.class));

        userService.register(USER);
    }
}