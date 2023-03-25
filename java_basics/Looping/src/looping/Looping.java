/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

/**
 *
 * @author FASILKOM
 */
public class Looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //For Loop
        for (int counter = 0; counter <=10;counter++){
            System.out.println("Loop ke-"+ counter);
        }
        
        //While Loop
        int counterLoop=0;
        while(counterLoop<=5){
            System.out.println("While Loop ke-"+counterLoop);
            counterLoop++;
        }
        
        //Do While Loop
        do{
            System.out.println("Do While Loop ke-"+counterLoop);
            counterLoop++;
        }while(counterLoop<=10);
        
        //Array
        Number[] myNumbers ={90,10,11,20};
        for(int counter =0; counter <=myNumbers.length;counter++){
            System.out.println(myNumbers[counter]);
        }
            
    }
    
}
