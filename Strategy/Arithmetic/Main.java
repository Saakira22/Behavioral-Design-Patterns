import java.util.*;
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();


        
        System.out.println("Operation: ");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
            context.setStrategy(new ConcreteStrategyAdd());
            break;

            case 2:
            context.setStrategy(new ConcreteStrategySubtract());
            break;

            case 3:
            context.setStrategy(new ConcreteStrategyMultiply());
            break;

            

        }
   
    int res = context.execute(a, b);
    System.out.println("Result: "+res);



    }
}
