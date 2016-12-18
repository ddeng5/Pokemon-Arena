/**
 *Vasav Shah
 *05/01/2014
 *PokemonArena.java
 *
 *
 *This program is used to play a visual text based pokemon game
 *This file does 3 major things
 *	-It creates the data using the textfile
 *	-It runs the main game
 *	-It does the damaging and figthing
 *
 */

import java.util.*;
import java.io.*;
public class PokemonArena {
	public static ArrayList <String> stat;//might have to change this later on
	private static Scanner kb=new Scanner(System.in);//so i don't have to make a new object for each method
	private static ArrayList <Pokemon> stuffchosen=new ArrayList <Pokemon> ();//keeps track of the pokemons chosen by the player
	private static ArrayList <Pokemon> enemies=new ArrayList <Pokemon>();//keeps track of the enemies, they are put in a random order
	private static int option;//numbers that are chosen
	private static int pokenum;//keeps track of the pokmon you are using
	private static int attnumber;//keeps track of what attack you want to do
	public static String choose(){
		//this method is used to first choose the four pokemons the player starts of with
		int num;
		for (int i=1; i<stat.size();i++){
			System.out.println(i+") "+stat.get(i).split(",")[0]);
		}
		while (true){//in order to make sure his number doesn't go out of bounds i put it in a loop till the user gets it right
			num=kb.nextInt();
			if (num>0 && num<stat.size()){
				break;
			}
			else{
				System.out.println("please pick a valid number using the options given");
			}
		}

		String pokemonchosen=stat.get(num);
		stat.remove(num);//to avoid choosing the same pokemon twice i remove the pokemon and show the user the options agian
		return pokemonchosen;

	}//easier and looks nicer in the main code, choses the main pokemons that the user wanted
    public static double getSpecialDamage(Pokemon a, Pokemon d){
   	//decides the speical damage by resistance and weakness
   	// a means the attacking pokemon and d means the defending pokemon
    	double specialdamage=1;//this the amount the overall damage will multiply by
    	if (a.getType().equals(d.getWeakness())){
    		specialdamage=2.0;
    		return specialdamage;
    	}
    	else if (a.getType().equals(d.getResistance())){
    		specialdamage=0.5;
    		return specialdamage;
    	}
    	else{
    		return specialdamage;
    	}
    }

}
