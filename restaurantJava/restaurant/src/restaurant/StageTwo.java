/*●	Amb un bucle for haurem d’omplir els dos arrays anteriorment creats. 
 Afegirem el nom del plat i després el preu. (1 punt)
●	Un cop plens els dos arrays haurem de mostrar-los i preguntar que es vol per menjar, 
guardarem la informació en una List fent servir un bucle while. (1 punt)
●	Haurem de preguntar si es vol seguir demanant menjar. 
Podeu fer servir el sistema (1:Si / 0:No), per tant haureu de crear un altre variable int
per guardar la informació. (1 punt)*/

package restaurant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class StageTwo {

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
			ShowMenu(menu,price);
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
	}
	
	public static void ShowMenu(String[] menu,int[] price) {
		for(int i = 0; i < menu.length; i++) {
			System.out.println("We have " + menu[i] + " and the price " + price[i] + " €");	
		}
	}

}
