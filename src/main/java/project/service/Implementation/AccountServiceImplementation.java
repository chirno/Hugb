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
    public  Account save(Account entity) {
        return repository.save(entity);
    }
    
    @Override
    public void delete(String username){
    	repository.delete(username);
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
    	Account temp = repository.findOne(username);
    	if(password.equals(temp.getPassword())){
    		return true;
    	}
    	return false;
    }
    
    public Account findOne(String username){
    	return repository.findOne(username);
    }
}