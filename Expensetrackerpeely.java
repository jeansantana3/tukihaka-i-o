import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Expense {
    private String description;
    private double amount;

    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}

class ExpenseManager {
    private List<Expense> expenses;

    public ExpenseManager() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(String description, double amount) {
        Expense expense = new Expense(description, amount);
        expenses.add(expense);
    }

    public void listExpenses() {
        System.out.println("Expenses List:");
        for (int i = 0; i < expenses.size(); i++) {
            Expense expense = expenses.get(i);
            System.out.println("Description: " + expense.getDescription() + ", Amount: $" + expense.getAmount());
        }
    }

    public void calculateTotalExpenses() {
        double total = 0;
        for (int i = 0; i < expenses.size(); i++) {
            Expense expense = expenses.get(i);
            total += expense.getAmount();
        }
        System.out.println("Total Expenses: $" + total);
    }
}

public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome al Jeansa Expense tracker!");

        while (true) {
            System.out.println("\n1. Agrega Expenses \n2. List Expenses\n3. Calculate Total Expenses peely\n4. Vete de aqui");
            System.out.print("Enter your choice: ");
            String choiceStr = scanner.nextLine();
            int choice = 0;
            try {
                choice = Integer.parseInt(choiceStr); 
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter expense description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter expense amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // aqui el newline charter de la pagina
                    manager.addExpense(description, amount);
                    System.out.println("Expense added successfully!");
                    break;
                case 2:
                    manager.listExpenses();
                    break;
                case 3:
                    manager.calculateTotalExpenses();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
