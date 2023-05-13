package exception.app.application;

import java.util.Scanner;

import exception.app.data.LoginRequest;
import exception.app.exceptions.MyCustomException;
import exception.app.utils.ValidationUtils;

public class LoginApp {
    public static void main(String[] args) {
        DatabaseApp.ConnectDB("root", "12");
        Scanner inputScanner = new Scanner(System.in);

        try{
        System.out.println("===========LOGIN FORM=============");
        System.out.println("Input Username : ");
        String Username = inputScanner.nextLine();
        

        System.out.println("Input Password : ");
        String Password = inputScanner.nextLine();

        //validasi Login
        LoginRequest request = new LoginRequest();
        request.username = Username;
        request.password = Password;
        ValidationUtils.LoginValidate(request);
        HomepageApp.Homepage();
        
        System.out.println(Username);
        System.out.println(Password);
        System.out.println("LOGIN BERHASIL");
        } catch (MyCustomException ex){
            System.out.println("Login Invalid - "+ ex.getMessage());
            ex.printStackTrace();
        }finally{
            inputScanner.close();
        }

        
        inputScanner.close();
        

        
    }
}
