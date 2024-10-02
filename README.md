# expense-tracker
Track personal expenses by category and date.
This project will use maps and compound data structures which are the two topics I chose to review the most from the list of available topics in week 2 of SDEV301.
The data structure of this class will consist of an outer map (key 1) (expense category eg. "Entertainment", "Food") and an inner map where dates are keys and values are lists of expenses for each date.
This Java class will function to track daily expenses by category and will be able to generate monthly reports.
If time allows I may add a budget tracking feature which will function to warn the user if they exceed a preset budget.
I bit off more than I can chew. For the purposes of this homework which is due Thursday, I only have tomorrow to work on it. I don't think I'll have time to develop it to the point where it can generate monthly reports. For now I will plan to write a printAllExpenses method and test this plus the addExpense method I coded tonight in the main method by delivering categories with corresponding dates/expenditures to addExpense() then printing out results with printAllExpenses().