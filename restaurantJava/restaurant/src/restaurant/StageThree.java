/* ●	Un cop hem acabat de demanar el menjar, haurem de comparar la llista amb l’array 
 que hem fet al principi. En el cas que la informació que hem introduït a la List coincideixi 
 amb la del array, haurem de sumar el preu del producte demanat; en el cas contrari haurem
 de mostrar un missatge que digui que el producte que hem demanat no existeix.
 */
package restaurant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class StageThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); // Creo lector

		int banknote5 = 5;
		int banknote10 = 10;
		int banknote20 = 20;
		int banknote50 = 50;
		int banknote100 = 100;
		int banknote200 = 200;
		int banknote500 = 500; 
		// Variable precio total de la comida,
		int totalPrice =0;
		
		Boolean isOrdering=true;

		String[] menu = {"beef","chicken","tuna","salmon","salad"};
		int[] price = {20,10,15,25,7};
		ArrayList <String> orderedFood=new ArrayList<String>();


		// Crear dos arrays (menu y precio)
		// String [] menu = new String [5];
		//int [] price = new int [5];
		
		// Bucle ampliar arrays
		
		// Lista con lo que quieres comer
		
			
			do {
			//ShowMenu(menu,price);
			System.out.println(" What would you like to eat today?"  );//pido comida al usuario
			String eat = keyboard.next();// se lee el nombre con nextline que retorna un string con el dato
			orderedFood.add(eat);
			System.out.println(" Would you like anything more? (yes/no)");
			String response = keyboard.next().toLowerCase();// se lee el nombre con nextline que retorna un string con el dato
			if(response.equals("yes")) 
				isOrdering=true;
			else if(response.equals("no")) 
				isOrdering=false;
			
			
			}while (isOrdering);
			

	        System.out.println(orderedFood);
	        
	   // public static void ShowMenu(String[] menu,int[] price) {
	    		for(int i = 0; i < orderedFood.size(); i++) {
	    			System.out.println("We have " + menu[i] + " and the price " + price[i] + " €");	
	    		if(Arrays.asList(menu).contains(orderedFood.get(i))) { // si coincide el producto lo sumamos
	    			totalPrice = totalPrice + price[Arrays.asList(menu).indexOf(orderedFood.get(i))];
	    		} else  {
	    			System.out.println("We don´t have" + orderedFood.get(i)+ "in the menu"); // producto que no esta en el menu
	    		}
	    	
	    	
	    	}
	        
	        System.out.println("The price for your menu is "+ totalPrice); // precio total del menu

		}
	}

	



