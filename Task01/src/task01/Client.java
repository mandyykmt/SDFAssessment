package task01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    
    public static void main(String[] args) throws IOException {

        // Variables


        // open a socket to connect to the server on port 5000
        Socket socket = new Socket("localhost", 5000);

        // prompt user for name 
        System.out.print("What is your name as appears on your NRIC: "); 
        Scanner name = new Scanner(System.in); 
        String nameInput = name.next(); 

        // prompt user for email    
        System.out.print("What is your email: ");
        Scanner email = new Scanner(System.in); 
        String emailInput = email.next(); 

        InputStream is = socket.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is); 
        ObjectInputStream ois = new ObjectInputStream(bis); 
        
        System.out.println("The Server has generated the following string of numbers:"); 
        String randomNumbers = ois.readUTF(); 
        System.out.println(randomNumbers); 
        
        // to do : generate mean and standard deviation
        
        // pseudo numbers
        double mean = 100.50;
        double std = 20.0; 

        // String[] array = randomNumbers.split(","); 
        // ArrayList<Integer> result = new ArrayList<>(); 
        
        System.out.println("The average of the generated numbers is: " + mean); 
        System.out.println("The standard deviation of the generated numbers is : " + std);

        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
        ObjectOutputStream oos = new ObjectOutputStream(bos); 

        

        // nameOutput = oos.writeUTF(nameInput);
        // emailOutput = oos.writeUTF(emailInput);
        // float meanOutput = oos.writeFloat();
        // float stdOutput = oos.writeFloat();        

        // System.out.print("Received name: " + nameOutput);
        // System.out.print("Received email: " + emailOutput);
        // System.out.print("Received mean: " + meanOutput);
        // System.out.print("Received standard deviation: " + stdOutput);

        //dos.flush(); 
                
        oos.close();
        bos.close();
        os.close();
        ois.close();
        bis.close();
        is.close();
        socket.close();
    }
}
