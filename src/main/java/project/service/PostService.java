package project.service;

import project.persistence.entities.Post;

import java.util.List;

public interface PostService {

    /**
     * Save a {@link Post}
     * @param Post {@link Post} to be saved
     * @return {@link Post} that was saved
     */
    Post save(Post post);

    /**
     * Delete {@link Post}
     * @param Post {@link Post} to be deleted
     */
    void delete(Post post);

    /**
     * Get all {@link Post}s
     * @return A list of {@link Post}s
     */
    List<Post> findAll();

    /**
     * Get all {@link Post}s in a reverse order
     * @return A reversed list of {@link Post}s
     */
    List<Post> findAllReverseOrder();

    /**
     * Find a {@link Post} based on {@link Long id}
     * @param id {@link Long}
     * @return A {@link Post} with {@link Long id}
     */
    Post findOne(Long id);

    /**
     * Find all {@link Post}s with {@link String name}
     * @param name {@link String}
     * @return All {@link Post}s with the {@link String name} passed
     */
    //List<Post> findByName(String name);

}
