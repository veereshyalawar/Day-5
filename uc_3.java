import java.util.Scanner;

public class uc_3 {

	public static void main(String[] args) {

int b, e;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the base: ");  
b = sc.nextInt();  
System.out.print("Enter the exponent: ");  
e = sc.nextInt();  
 
double power = Math.pow(b, e);  
 
System.out.println(b +" to the power " +e + " is: "+power);  
}  
}  