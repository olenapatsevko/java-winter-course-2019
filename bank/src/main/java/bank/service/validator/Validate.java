package bank.service.validator;

import bank.exception.ValidationException;

public interface Validate<T> {

    void validate(T entity) throws ValidationException;

    // regular expression for login and password
    //cover with tests
}
