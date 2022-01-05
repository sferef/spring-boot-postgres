package repository;

import model.Expenditure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpensesRepository extends CrudRepository<Expenditure, String> {

}
