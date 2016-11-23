package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Account;
import project.persistence.repositories.AccountRepository;
import project.service.AccountService;

import java.util.Collections;
import java.util.List;


@Service
public class AccountServiceImplementation implements AccountService {

    // Instance Variables
    AccountRepository repository;

    // Dependency Injection
    @Autowired
    public AccountServiceImplementation(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public  Account save(Account Account) {
        return repository.save(Account);
    }

    @Override
    public List<Account> findAll() {
        return repository.findAll();
    }
    
    public boolean exists(String username){
    	if(repository.exists(username)){
    		return true;
    	}
    	return false;
    }
    
    public boolean login(String username, String password){
    	Account temp = repository.getOne(username);
    	if((temp.getUsername()==username) && (temp.getPassword()==password)){
    		return true;
    	}
    	return false;
    }
    
    public Account getOne(String username){
    	return repository.getOne(username);
    }
}
