package project.persistence.repositories;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import project.persistence.entities.Category;

import java.util.List;

/**
 * By extending the {@link JpaRepository} we have access to powerful methods.
 * For detailed information, see:
 * http://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
 * http://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html
 * http://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html
 * CrudRepository is a superinterface of JpaRepository so no worries there.
 *
 */

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	/*---------------------Inherited from CrudRepository---------------------*/
	
	/*Saves a given entity.*/
	<Test extends Category>Test save(Test entity);
	
	/*Retrieves an entity by it's id.*/
	Category findOne(Long id);
	
	/*Returns whether an entity with the given id exists.*/
	boolean exists(Long id);

	/*Returns the number of entities available*/
	long count();
	
	/*Deletes the entity with the given id.*/
	void delete(Long id);
	
	/*Deletes the given entity.*/
	void delete(Category entity);
	
	/*Deletes the given entities.*/
	void delete(Iterable<? extends Category> entities);
	
	/*Deletes all entities managed by the repository*/
	void deleteAll();
	
	/*---------------JpaRepository Methods-------------------------*/
	
	/*Returns all instances of the type.*/
	List<Category> findAll();
	
	/*Returns a Page of entities meeting the paging restriction provided in the pageable object.*/
	List<Category> findAll(Sort sort);
	
	/*Returns all instances of the type with the given IDs.*/
	List<Category> findAll(Iterable<Long> ids);
	
	/*Saves all given entities.*/
	<Test extends Category>List<Test> save(Iterable<Test> entities);
	
	/*Flushes all pending changes to the database.*/
	void flush();
	
	/*Saves an entity and flushes changes instantly.*/
	<Test extends Category> Test saveAndFlush(Test entity);
	
	/*Deletes the given entities in a batch which means it will create a single{@link Query].
	 * Assume that we will clear the {@link javax.persistence.EntityManager} after the call.*/
	void deleteInBatch(Iterable<Category> entities);
	
	/*Deletes all entities in a batch call.*/
	void deleteAllInBatch();
	
	/*Returns a reference to the entity with the given identifier.*/
	Category getOne(Long id);
}