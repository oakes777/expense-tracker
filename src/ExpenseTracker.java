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

    //Prints all expenses
    public void printAllExpenses() {
        //for loop runs through keys (expense categories) in map expenses
        for (String category : expenses.keySet()) {
            //prints out the expense categories
            System.out.println("Expenses for " + category + ":");
            //entrySet is a method of HashMap class; entrySet returns
            //the set view of the key/value pairs in the map as a
            //Map.Entry object
            for (Map.Entry<String, List<Double>> entry : expenses.get(category).entrySet()) {
                //entry.getKey() will be the inner map key (expense date)
                //entry.getValue() will be the inner map value (list
                //of expenditures made on that date)
                //S-out prints out the dates and expenditures for
                //each category
                System.out.println("Date: " + entry.getKey() + ", Amounts: " + entry.getValue());
            }
        }
    }


}
