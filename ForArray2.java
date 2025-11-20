import java.util.*;
public class ForArray2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        
        
        for (int i =0; i<5;i++){
            System.out.printf("Enter Number %d: ",i+1);
            numbers[i]=sc.nextInt();
        }
        System.out.print("Enter the Number You want to Find: ");
        int x = sc.nextInt();
        int index = -1; // initialize to sentinel value meaning "not found"
        for (int i =0; i<5;i++){
            if (x==numbers[i]){
                index = i;
                break; // stop after first match
            }
        }
        if (index != -1){
            System.out.printf("Found the Number %d at index %d%n", x, index);
        } else {
            System.out.println("Not in the List");
        }
        sc.close();
        
    }
}
