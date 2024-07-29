import java.util.*;
public class burger {
    Scanner sc = new Scanner(System.in);
    int burgerchoice=0;
    int burgerprice = 0;

    public void burgertype(){


        System.out.println("Sr.no       Type            Price");
        System.out.println("1.          Aloo Tikki      Rs.200" );
        System.out.println("2.          Veggie          Rs.300" );
        System.out.println("3.          Maharaja        Rs.500");
        burgerchoice = sc.nextInt();
        if(burgerchoice==1){
            burgerprice = 200;
        }
        else if (burgerchoice==2){
            burgerprice = 300;
        }
        else if (burgerchoice == 3) {
            burgerprice = 500;
        }
        System.out.println("The following are the toppings if you would like to add: \n Every toppings would add Rs.30 each");
    }
}
