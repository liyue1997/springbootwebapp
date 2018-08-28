package guru.springframework.repositories;

import guru.springframework.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

}
