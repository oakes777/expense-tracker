import java.util.*;

public class ExpenseTracker {

    //create complex data structure where outer HashMap contains key
    //(expense category) and value (second HashMap) and the inner
    //HashMap contains key(expense date) and value(list of 
    //expenditures for a given date within a specific category)
    private HashMap<String, HashMap<String, List<Double>>> expenses = new HashMap<>();

    //Adds an expense
    public void addExpense(String category, String date, double amount) {
        //Checks if the category exists in expenses map
        //If not, creates new entry for that category initializing
        //it with empty HashMap to later store dates/expenditures
        if (!expenses.containsKey(category)) {
            expenses.put(category, new HashMap<>());
        }
    
        //Checks if the date exists within the category
        //If not, adds the date and initializes an empty
        //ArrayList to store expenditures
        if (!expenses.get(category).containsKey(date)) {
            expenses.get(category).put(date, new ArrayList<>()); 
        }
    
        //Add the amount to the list of expenses for that date
        expenses.get(category).get(date).add(amount);
    }
}
