package service;

import javafx.util.Pair;
import model.Expenditure;

import java.util.List;
import java.util.Optional;

public interface ExpenseServices {

    Optional<List<Expenditure>> findAllExpenses();

    //Optional<Expenditure> getById(String expenseName);

    //Optional<Double> getTotalExpense();

    //Optional<Double> getSavings();

    //Optional<Pair<String, Double>> sumByCategory();

}
