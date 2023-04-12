package TesteJobRotation;

import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Faturamento_App {
	    public static void main(String[] args) {
	    	double[][] dados = {
	                {1, 22174.1664},
	                {2, 24537.6698},
	                {3, 26139.6134},
	                {4, 0.0},
	                {5, 0.0},
	                {6, 26742.6612},
	                {7, 0.0},
	                {8, 42889.2258},
	                {9, 46251.174},
	                {10, 11191.4722},
	                {11, 0.0},
	                {12, 0.0},
	                {13, 3847.4823},
	                {14, 373.7838},
	                {15, 2659.7563},
	                {16, 48924.2448},
	                {17, 18419.2614},
	                {18, 0.0},
	                {19, 0.0},
	                {20, 35240.1826},
	                {21, 43829.1667},
	                {22, 18235.6852},
	                {23, 4355.0662},
	                {24, 13327.1025},
	                {25, 0.0},
	                {26, 0.0},
	                {27, 25681.8318},
	                {28, 1718.1221},
	                {29, 13220.495},
	                {30, 8414.61}
	            };

	        double[] valoresFaturamento = new double[dados.length];
	        for (int i = 0; i < dados.length; i++) {
	            valoresFaturamento[i] = dados[i][1];
	        }
	        
	        // Cálculo do menor valor de faturamento
	        double menorValor = Arrays.stream(valoresFaturamento).min().getAsDouble();
	        
	        // Cálculo do maior valor de faturamento
	        double maiorValor = Arrays.stream(valoresFaturamento).max().getAsDouble();
	        
	        // Cálculo da média mensal
	        double mediaMensal = Arrays.stream(valoresFaturamento).average().getAsDouble();
	        
	        // Cálculo do número de dias com faturamento acima da média mensal
	        long numDiasAcimaMedia = Arrays.stream(valoresFaturamento).filter(valor -> valor > mediaMensal).count();
	        
	        DecimalFormat df = new DecimalFormat("#.00");
	        String maiorValorF = df.format(maiorValor);
	      
	        
	        
	        // Resultados
	        JOptionPane.showMessageDialog(null, "Menor valor de faturamento: R$" + menorValor +
	        		"\nMaior valor de faturamento: R$" + maiorValorF + 
	        		"\nNúmero de dias com faturamento acima da média mensal: " + numDiasAcimaMedia);
	         
	         
	    }
	}

