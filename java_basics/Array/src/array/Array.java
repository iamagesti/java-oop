/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author FASILKOM
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO c public static void main(String[] args) {
    String [] cars = { "Volvo", "BMW", "Ford", "Mazda"};
    Number[] myNum = new Number[4];
    myNum[0] =10;
    myNum[1] =20;
    myNum[2] =30;
    myNum[3] =40;
    System.out.println(cars[0]);
    System.out.println(myNum[1]);
    
    //Manipulasi elemen Array
    myNum[1]=100;
    myNum[2]=null;
    
    System.out.println(myNum[1]);
    System.out.println(myNum[2]);   
  
    cars [0] ="Opel";
    System.out.println(cars[0]);
    }
    }
    

