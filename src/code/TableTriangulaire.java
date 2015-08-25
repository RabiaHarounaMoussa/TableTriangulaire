package code;
import java.io.*;
import java.util.*;


public class TableTriangulaire {

	public static void main(String[] args) {
		
		int longueurMax;
		
		//Créer une nouvelle instance de Scanner pour lire les entrées clavier
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer un entier inférieur à 100: ");
		//Récupérer la valeur saisie de la longueur max
		longueurMax = sc.nextInt();
		 
		//Vérifier que la longueur max est inférieure à 100
		while (longueurMax >= 100) {
			System.out.println("Veuillez entrer un entier inférieur à 100: ");
			longueurMax = sc.nextInt();
		}
		
		//Trouver le triplet pythagoricien en vérifiant la formule a²+b²=c²
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
