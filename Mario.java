import java.util.*;

public class MyClass {
    public static void main(String args[]) {
       
      //prompts user to input num 1-8
    Scanner sc= new Scanner(System.in);
    int height;
     do {
        System.out.println("height (1-8): ");
        height = sc.nextInt();
    }
    while (height < 1 || height > 8);
   
    //asks user for a block
    System.out.println("pick a symbol (#):  ");
        char block = sc.next().charAt(0);
   
    //prints pyramid
    for (int i=0; i < height; i++) {
        for (int k=0; k < (height - i -1); k++) {
            System.out.print(" ");
        }
       
        for (int j=0; j < (i + 1); j++) {
            System.out.print(block);
        }
        System.out.print(" ");
       
        for (int l=0; l < (i + 1); l++) {
            System.out.print(block);
        }
       
        System.out.print("\r\n");
    }
   
   
   
    }
}
