package repository;

import domain.Expenditure;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ExpensesRepository extends ReactiveCrudRepository<Expenditure, String> {

    @Query("SELECT * FROM test.expenditure")
    Flux<Expenditure> findAllExpenses();
}
