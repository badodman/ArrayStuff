/*
 * Programmer:
 * Date:
 * Purpose:
 */

import java.util.Scanner;

public class ArrayStuff {
    public static void main (String[] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // PART A

        //created a new array that is called ages and has a length of 5
        int [] ages = new int [5];

        //  Change the 3rd element of "ages" to be 18
        ages[2] = 18;

        //  Change the first element of "ages" to be an integer entered by the user
        System.err.println("Enter an integer:");
        ages[0] = input.nextInt();

        //  Change the last element of "ages" to be the first element squared
        ages[4] = ages[0] * ages[0];

        //  Print all of the elements of "ages", one per line
        System.out.println(ages[0]);	
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);


        // PART B
        
        // Create AND initialize an array called "planets" that holds the
        // names of the planets in order from closest to the sun to farthest.
        // NOTE: Pluto is NOT a planet.
        String [] planets = new String [8];
        
        planets[0] = "Mercury";
        planets[1] = "Venus";
        planets[2] = "Earth";
        planets[3] = "Mars";
        planets[4] = "Jupiter";
        planets[5] = "Saturn"; 
        planets[6] = "Uranus";
        planets[7] = "Neptune";
        
        		
        //  Print the first letter of the 7th planet from the sun
        System.out.println("U");

        //  Change the name of our planet to be a line of text that the user inputs
        System.err.println("What do you want to rename Earth to be?");
        planets[2] = input.next();

        //  Replace the first planet with the planet at index 2, but with all
        // upper case letters.
        planets[0] = planets[2].toUpperCase();;
        
       
       
        //  Print all of the elements of "planets" in reverse order.
        System.out.println(planets[7] );
        System.out.println(planets[6] );
        System.out.println(planets[5] );
        System.out.println(planets[4] );
        System.out.println(planets[3] );
        System.out.println(planets[2] );
        System.out.println(planets[1] );
        System.out.println(planets[0] );
    }
}
