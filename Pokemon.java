/**
 *Vasav Shah
 *05/01/2014
 *Pokemon.java
 *This classis used to store the data for a pokemon
 *I know i was suppose to do the attack in this class but i finished the program andthen realized which was far too late
 *Most this methods are just getters and setters, which are self explainatory, so i will not be commenting on them a lot
 */

import java.util.*;
public class Pokemon {
	//ok so this class is used to keep track of all the stats of one pokemon
	private String name;
	private int hp;
	private int maxhp;
	private	int energy;
    private String type;
	private String resistance;
	private String weakness;
	private boolean alive;
	private String state;
	ArrayList <Attack> attacks=new ArrayList <Attack>();
    public Pokemon(String stats){
    	//this just starts everyone of according to the textfile and the energy always starts at 50
    	String [] pokestats=stats.split(",");
    	name=pokestats[0];
    	hp=Integer.parseInt(pokestats[1]);
    	maxhp=Integer.parseInt(pokestats[1]);
    	energy=50;
    	type=pokestats[3];
    	resistance=pokestats[3];
    	weakness=pokestats[4];
    	alive=true;
    	state="";
    	for (int i=0;i<Integer.parseInt(pokestats[5]);i++){
    		attacks.add(new Attack(pokestats[i*4+6],pokestats[i*4+9],Integer.parseInt(pokestats[i*4+7]),Integer.parseInt(pokestats[i*4+8])));
    	}
    }

}
