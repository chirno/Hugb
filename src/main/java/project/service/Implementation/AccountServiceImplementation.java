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
    public boolean save(Account entity) {
        if(!this.exists(entity.getUsername())){
        	repository.save(entity);
        	return true;
        }
        return false;
    }
    
    @Override
    public boolean delete(String username){
    	if(this.exists(username)){
    		repository.delete(username);
    		return true;
    	}
    	return false;
    }

    @Override
    public List<Account> findAll() {
        return repository.findAll();
    }
    
    public boolean exists(String username){
    	if(username == null){
    		return false;
    	}
    	return repository.exists(username);
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