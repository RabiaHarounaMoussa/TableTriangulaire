package code;
import java.io.*;
import java.util.*;


public class TableTriangulaire {

	public static void main(String[] args) {
		
		int longueurMax;
		
		//Cr�er une nouvelle instance de Scanner pour lire les entr�es clavier
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer un entier inf�rieur � 100: ");
		//R�cup�rer la valeur saisie de la longueur max
		longueurMax = sc.nextInt();
		 
		//V�rifier que la longueur max est inf�rieure � 100
		while (longueurMax >= 100) {
			System.out.println("Veuillez entrer un entier inf�rieur � 100: ");
			longueurMax = sc.nextInt();
		}
		
		//Trouver le triplet pythagoricien en v�rifiant la formule a�+b�=c�
		for(int a=1; a<=longueurMax; a++){
			for(int b=1; b<=longueurMax; b++){
				for(int c=1; c<=longueurMax; c++){
					if(Math.pow(a, 2.0)+Math.pow(b, 2.0) == Math.pow(c, 2.0)){
					
						System.out.println(a+" "+b+" "+c);
						
					}
				
			     }	
			
			}	

		}
	
	}
	
	

}
