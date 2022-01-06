package handler;/*
 * @project: spring-boot-postgres
 * @created: 2022/01/05 - 23:05
 * @author:  Luis Kevin Huaman Bolanger
 * @email:   lk.huaman@gmail.com
 */

import domain.Expenditure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import repository.ExpensesRepository;

@Component
public class ExpenseHandler {

    @Autowired
    private ExpensesRepository repository;

    public Mono<ServerResponse> getAll (ServerRequest serverRequest) {

        Flux<Expenditure> expenses = repository.findAllExpenses();

        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(expenses, Expenditure.class);
    }
}
