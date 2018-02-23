
package example;

import java.util.Scanner;


public class FizzBuzz {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Añade una cantidad: ");
        int amount = input.nextInt();
        String [] resultado = fizzBuzz(amount);
        for (int i = 0; i < resultado.length ; i++) {
            if (resultado [i]== null){
                System.out.print(i+", ");
            }else{
                System.out.print(resultado[i] + ", ");
            }
        }
    }
    
    public static String [] fizzBuzz (int n){
        String [] result = new String[n+1];
        for (int i = 1; i <= n; i++){
            if ( (i % 3 == 0) && (i % 5 == 0)){
                result[i]="FizzBuzz";
            }else{ 
                if ( i % 3 == 0){
                     result[i]="Fizz";
                     continue;
                }
                if ( i % 5 == 0){
                    result[i]="Buzz";
                }
            }
        }
       return result; 
    }
}
