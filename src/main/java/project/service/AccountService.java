package project.service;

import project.persistence.entities.Account;

import java.util.List;

public interface AccountService{

	/**
     * Save a {@link Account}
     * @param Account {@link Account} to be saved
     * @return {@link Account} that was saved
     */
    boolean save(Account entity);
    
    boolean delete(String username);

    /**
     * Get all {@link Account}s
     * @return A list of {@link Account}s
     */
    List<Account> findAll();
    
    /**
     * Check if {@link Account} exists.
     * @return A list of {@link Account}s
     */
    boolean exists(String username);
    
    /**
     * Check if {@link Account} exists that
     * corresponds to username and password.
     * @return A list of {@link Account}s
     */
    boolean login(String username, String password);
    
    Account findOne(String username);
    
}