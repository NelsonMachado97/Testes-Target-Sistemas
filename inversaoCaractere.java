package TesteJobRotation;

import javax.swing.JOptionPane;

public class inversaoCaractere {

	public static void main(String[] args) {
		String stringOriginal = JOptionPane.showInputDialog("Digite uma frase ou palavra: ");
        String stringInvertida = inverterString(stringOriginal);
        JOptionPane.showMessageDialog(null, "String original: " + stringOriginal);
        JOptionPane.showMessageDialog(null,"String invertida: " + stringInvertida);
		    }

	private static String inverterString(String stringOriginal) {

		char[] caracteres = stringOriginal.toCharArray();
        int inicio = 0;
        int fim = stringOriginal.length() - 1;

        while (inicio < fim) {

        	char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;


            inicio++;
            fim--;
        }

        String stringInvertida = new String(caracteres);

        return stringInvertida;
	}

}
