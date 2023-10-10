import java.util.Scanner;
import java.lang.Math;
public class Calculator{
    public static void main (String[]args){
        Scanner scan =new Scanner (System.in);
        double result=0;
        System.out.print("Введите n");
        double n= scan.nextDouble();
        
        System.out.print("Введите m");
        double m= scan.nextDouble();
        
        System.out.print("Введите любой из вышеперечисленных операторов (+, -, *, /,^): ");
        char i = scan.next().charAt(0);
        switch(i){
            case '+': result=n+m;
            break;
            case '-': result=n-m;
            break;
            case '*': result=n*m;
            break;
            case '^': result=Math.pow(n,m);
            break;
            case '/': result=n/m;
            break;
            
        }
        System.out.println ("Ответ : " + result);
    }
}
