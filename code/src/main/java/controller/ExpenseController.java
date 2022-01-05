package controller;

import lombok.val;
import model.Expenditure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.ExpenseServices;

import java.util.Collections;
import java.util.List;

@Controller
public class ExpenseController {

    @Autowired
    private ExpenseServices expenseServices;

    @GetMapping("/expenses")
    public String findAllExpenses (Model model){

        val allExpenses = (List<Expenditure>) expenseServices.findAllExpenses().orElse(Collections.emptyList());

        model.addAttribute("Expenses", allExpenses);

        return "showExpenses";
    }
}
