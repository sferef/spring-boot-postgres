package service;

import lombok.val;
import model.Expenditure;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ExpensesRepository;

import java.util.List;
import java.util.Optional;

public class ExpenseServiceimpl implements ExpenseServices{

    @Autowired
    private ExpensesRepository repository;

    @Override
    public Optional<List<Expenditure>> findAllExpenses() {
        val expenses = (List<Expenditure>) repository.findAll();
        return Optional.of(expenses);
    }

}
