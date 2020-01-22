package bank.repository.impl;

import bank.domain.Account;
import bank.repository.AccountRepository;

import java.util.*;

public class AccountRepositoryImpl implements AccountRepository {
    Map<Integer, Account> accountMap = new HashMap<>();

    @Override
    public void save(Account entity) {
        accountMap.put(entity.getId(), entity);
    }

    @Override
    public Optional<Account> findById(Integer id) {

        return Optional.of(accountMap.get(id));
    }

    @Override
    public List<Account> findAll() {
        return new ArrayList<>(accountMap.values());
    }

    @Override
    public void update(Account entity) {
        accountMap.replace(entity.getId(), entity);

    }

    @Override
    public void deleteById(Integer id) {
        accountMap.remove(id);

    }
}
