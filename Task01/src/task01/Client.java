package task01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    
    public static void main(String[] args) throws IOException {

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

        // to do : check for email format

        InputStream is = socket.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is); 
        ObjectInputStream ois = new ObjectInputStream(bis); 
        
        System.out.println("The Server has generated the following string of numbers:"); 
        String randomNumbers = ois.readUTF(); 
        System.out.println(randomNumbers); 
        
        // to do : generate mean and standard deviation
        // String[] array = randomNumbers.split(","); 
        // ArrayList<Integer> result = new ArrayList<>(); 
        
        // pseudo values for mean and standard deviation 
        double mean = 100.50;
        double std = 20.0;         
        System.out.println("The average of the generated numbers is: " + mean); 
        System.out.println("The standard deviation of the generated numbers is : " + std);

        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
        ObjectOutputStream oos = new ObjectOutputStream(bos); 

        oos.writeUTF(nameInput);
        oos.writeUTF(emailInput);
        oos.writeFloat((float) mean);
        oos.writeFloat((float) std); 

        System.out.println("Received name: " + nameInput);
        System.out.println("Received email: " + emailInput);
        System.out.println("Received mean: " + mean);
        System.out.println("Received standard deviation: " + std);

        oos.flush(); 
                
        oos.close();
        bos.close();
        os.close();
        ois.close();
        bis.close();
        is.close();
        socket.close();
    }
}
