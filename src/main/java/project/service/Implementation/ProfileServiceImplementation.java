package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Profile;
import project.persistence.repositories.ProfileRepository;
import project.service.ProfileService;

import java.util.List;

@Service
public class ProfileServiceImplementation implements ProfileService {

    // Instance Variables
    ProfileRepository repository;

    // Dependency Injection
    @Autowired
    public ProfileServiceImplementation(ProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public  Profile save(Profile Profile) {
        return repository.save(Profile);
    }

    @Override
    public List<Profile> findAll() {
        return repository.findAll();
    }
}
