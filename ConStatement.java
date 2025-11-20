import java.util.*;

public class ConStatement{

    Scanner sc = new Scanner(System.in);

    void ageViwer(){
        System.out.print("Enter Age:");
        int age = sc.nextInt();
        
        
        if (age < 18){
            System.out.println("Minor");
        }
        else if(age>=18 && age<=60){
            System.out.println("Adult");

        }
        else{
            System.out.println("Senior Citizen");
        }

    };

    void calculator(){
        System.out.print("Enter Num1:");
        int num1 = sc.nextInt();
        System.out.print("\nEnter Num2:");
        int num2 = sc.nextInt();
        System.out.print("Enter Operator (+,-,*,/):");
        String operator = sc.next();
        

        switch(operator){

            case "+" ->System.out.println(num1 + num2);
            
            
            case "-"-> System.out.println(num1 - num2);
            

            case "*"-> System.out.println(num1 * num2);
            

            case "/"-> System.out.println(num1 / num2);
        }


        

    }
    
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
        
        
            System.out.println("Select One:");
            System.out.println("1. Age-Comparision ");
            System.out.println("2. Calculator");
            System.out.print("Your Input:");
            int input = sc.nextInt();
            

            ConStatement condition = new ConStatement();

            switch (input) {
                case 1 -> condition.ageViwer();
                case 2 -> condition.calculator();
                default -> { /* no action */ }
            }
        }

    }
};