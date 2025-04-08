import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        int totalIncome = 0, totalExpenditure = 0;
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> expense = new HashMap<>();
        while (true) {
            System.out.print("Enter income (or 'done' to finish) : ");
            String input = sc.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            int income = Integer.parseInt(input);
            totalIncome += income;
            System.out.print("Enter type of material: ");
            String material = sc.next();

            System.out.print("Enter expenditure on " + material + ": ");
            int expenditure = sc.nextInt();

            totalExpenditure += expenditure;
            expense.put(material, expense.getOrDefault(material, 0)+ expenditure);
        }

        System.out.println("\nTotal Income: " + totalIncome);
        System.out.println("Total Expenditure: "+ totalExpenditure);
        System.out.println("Total Savings: "+ (totalIncome - totalExpenditure));

        System.out.println("\n Expenditures:");
        for(Map.Entry<String, Integer> entry : expense.entrySet()){
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }
        sc.close();
    }


}
