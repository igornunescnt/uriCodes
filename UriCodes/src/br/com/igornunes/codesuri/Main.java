package br.com.igornunes.codesuri;
import java.util.Scanner;
  
public class Main {
      
    public static void main(String[] ags) {
          
        Scanner s = new Scanner(System.in);
        double N = s.nextDouble();   
        double valor[] = {100.00,50.00,20.00,10.00,5.00,2.00,1.00,0.50,0.25,0.10,0.05,0.01};
        
        System.out.println("NOTAS:");
        for(int i = 0; i < 6; i++){
        	System.out.printf("%.0f nota(s) de R$ %.2f\n",Math.floor(N/valor[i]),valor[i]);
        	N = N % valor[i];
        }
        
        System.out.println("MOEDAS:");
        for(int j = 6; j < 12; j++){
        	System.out.printf("%.0f moeda(s) de R$ %.2f\n",Math.floor(N/valor[j]),valor[j]);
        	N = N % valor[j];
        }
        
        
    }
}