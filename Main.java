//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.* ;
public class Main {
    Scanner sc = new Scanner(System.in);
    String cusName;
    int choice;

    public static void main(String[] args) {
        Main dublin;
        dublin = new Main();

        dublin.customersetup();
        dublin.order();
//        dublin.menu();
    }

    public void customersetup(){
        System.out.print("Please enter your name: ");
        cusName = sc.nextLine();
        System.out.println("Hello "+cusName+" have a nice day!");

    }

    public void order(){
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("May I know your order please?");
        System.out.println("The following are some suggestion for you");
        System.out.println("1: The Signature Stack\nIt comprises of the following items:");
        System.out.println("A Aloo Tikki burger, a small coke and fries. It charges Rs.500");
        System.out.println("2: The customizable Platter\n It comprises of various items and toppings that can be customized according to your taste");
        System.out.println("3: The Deluxe Platter\n Here you can have your favourite toppings without any extra charges.It charges Rs.1000");

        choice = sc.nextInt();
        if(choice==1){
            System.out.println("Order: The Signature stack meal\nPrice: Rs.500");
        } else if (choice==2) {
            System.out.println("The following is the menu: ");
            burger b1= new burger();
            b1.burgertype();

        } else if (choice==3) {
            System.out.println("You can add any of the toppings. The following is the menu: ");
        }

    }
//    public void menu(){
//
//    }
}