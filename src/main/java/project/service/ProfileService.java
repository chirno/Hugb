package project.service;

import project.persistence.entities.Profile;

import java.util.List;

public interface ProfileService{

	/**
     * Save a {@link Profile}
     * @param Profile {@link Profile} to be saved
     * @return {@link Profile} that was saved
     */
    Profile save(Profile Profile);

    /**
     * Get all {@link Profile}s
     * @return A list of {@link Profile}s
     */
    List<Profile> findAll();
}