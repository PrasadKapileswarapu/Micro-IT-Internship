import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		
		while(true) {
		int operator,n1,n2;
		System.out.println("Choose an operator: \n 1.Add \n 2.Subtract\n 3.Multiplication\n 4.Division\n ");
		System.out.print("Enter an operator: ");
		Scanner sc = new Scanner(System.in);
		operator = sc.nextInt();
		System.out.print("Enter first number: ");
		n1 = sc.nextInt();
		System.out.println("enter second number: ");
		n2 = sc.nextInt();
	
		int result=0;
        switch(operator) {
        case 1:
        	result=n1+n2;
        	break;
        case 2:
        	result=n1-n2;
        	break;
        case 3:
        	result=n1*n2;
        	break;
        case 4:
        	result=n1/n2;
        	break;
        default:
        	System.out.println("Invalid Choice!!");
        }
        System.out.println("Result is:"+result);
        
        
		
	    }
	} 
}
