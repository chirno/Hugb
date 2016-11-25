package project.service;

import project.persistence.entities.Post;
import project.persistence.entities.Account;
import project.persistence.entities.Category;

import java.util.List;

public interface PostService {

    /**
     * Save a {@link Post}
     * @param Post {@link Post} to be saved
     * @return {@link Post} that was saved
     */
    boolean save(Post post);

    /**
     * Delete {@link Post}
     * @param Post {@link Post.id} to be deleted
     */
    boolean delete(Long id);
    
    boolean exists(Long id);

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

    
    List<Post> findPostsByAccount(Account account);
    
    List<Post> findPostsByCategory(Category category);

}
