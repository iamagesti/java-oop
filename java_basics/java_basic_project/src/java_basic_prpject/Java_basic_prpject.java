/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basic_prpject;

/**
 *
 * @author FASILKOM
 */
public class Java_basic_prpject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("=====Primitive Data Type=====");
        byte varByte = 100;
        short varShort = 10000;
        int varInt = 1000000;
        long varLong = 1000000000;
        long varLong_ = 1_000_000_000;
        
        float varFloat = 10.001f;
        double varDouble = 10.0001;
        
        boolean varBoolean = true;
        char varZ = 'z';
        
        System.out.println("varByte");
        System.out.println("varShort");
        System.out.println("varInt");
        System.out.println("varLong");
        System.out.println("varLong_");
        System.out.println("varFloat");
        System.out.println("varDouble");
        System.out.println("varBoolean");
        System.out.println("varZ");
        
        
        System.out.println("=====Object Data Type======");
        
        Byte varByteObj = 100;
        short varShortObj = 10000;
        int varIntObj = 1000000;
        long varLongObj = 1000000000L;
        long varLongObj_ = 1_000_000_000L;
        float varFloatObj = 10.001f;
        double varDoubleObj = 10.0001f;
        boolean varBoolObj = false;
        String varString = "Nia";
        
        
        System.out.println(varByteObj);
        System.out.println(varShortObj);
        System.out.println(varIntObj);
        System.out.println(varLongObj);
        System.out.println(varLongObj_);
        System.out.println(varFloatObj);
        System.out.println(varDoubleObj);
        System.out.println(varBoolObj);
        System.out.println(varString);
        
        System.out.println("=====Casting Daya Type=====");
        
        Integer myInt =9;
        Double myDouble = myInt.doubleValue();
        
        System.out.println("myInt");
        System.out.println("myDouble");
        
        int myIntP = 9;
        double myDoubleP = myIntP;
        System.out.println(myIntP);
        System.out.println(myDoubleP);
    }
    
    
}
