package bank.repository;


import java.util.List;
import java.util.Optional;

public interface CrudRepository<E> {
    //create
    void save(E entity);

    //read
    Optional<E> findById(Integer id);

    List<E> findAll();

    //update
    void update(E entity);

    //
    void deleteById(Integer id);
}
