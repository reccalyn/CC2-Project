package fibo;
import java.util.*;

public class Fibo{
    public static int x;
    public static void main(String[] args) {

        userInput();
        display();    
    }
    public static void userInput(){
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter a number: ");
        x = sc.nextInt();
    }
    
    public static void display(){
        
        for(int s=0; s<=x; s++){
            System.out.print("f("+ s +")\t");
         } 
        
        for(int i= 0; i <=x; i++){
            System.out.println("");
                for(int r=0; r<=i; r++){
            System.out.print("" + fibo2(r)+"\t");
                }
        }
        
    }
    public static int fibo2(int num){
        if(num == 0){
            return 0;
        }else if(num == 1){
            return 1;
        }else{
            return fibo2(num-1)+fibo2(num-2);
        }
        
    }
}
