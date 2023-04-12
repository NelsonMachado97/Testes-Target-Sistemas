package TesteJobRotation;

import javax.swing.JOptionPane;

public class Fibonacci_App {

	public static void main(String[] args) {
	
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		if (fibonacci(num)) {
			
			JOptionPane.showMessageDialog(null,num + " pertence à sequencia Fibonacci");
			}
		else {
			JOptionPane.showMessageDialog(null, num + " não pertence à seguencia Fibonacci");}
		}
	
		public static boolean fibonacci(int num) {
		    if (num == 0 || num == 1) {
		        return false;
		    }

		    int a = 0;
		    int b = 1;

		
		    while (b < num) {
		        int soma = a + b;
		        a = b;
		        b = soma;
		    }

		  
		    if (b == num) {
		        return true;
		    }

		    return false;
		}

	        
	
	}


	