package Jogo;


import java.util.Scanner;
import java.lang.Math;

public class Jogo
{
	public static void main(String[] args) 
	{
	    Scanner ler = new Scanner(System.in);
	    
	    int numsorteado,numdigitado;
	    
	    numsorteado=(int)(Math.random()*10);
	    System.out.println("numsorteado:"+numsorteado);
	    
	    do{
	        System.out.println("Digite um numero de 1 a 100:");
	        numdigitado=ler.nextInt();
	        
	        
	         if(numdigitado==numsorteado)
	         {System.out.println("você acertou!!"); }
	            	       
	         else if(numdigitado>numsorteado) 
	         {System.out.println("O numero e menor");}
	        
	         else {System.out.println("O numero e maior");}
	        
	      } while(numdigitado!=numsorteado);
	      
		   
	}
}