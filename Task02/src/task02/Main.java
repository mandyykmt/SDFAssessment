package task02;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static String dirName = "Task02";
    
    public static String dirFileName = dirName + File.separator;

    public static void main(String[] args) {

        // assign a number to each file name
        // e.g. 1 = Cat in the hat

        // show user which number corresponds to which file
        // To do : Print number+filename instead of hardcoding 
        System.out.println("Files available"); 
        System.out.println();
        System.out.println("1. Cat in the hat");
        System.out.println("2. Fox in socks");
        System.out.println("3. Happy birthday to you");
        System.out.println("4. Oh the places you'll go");
        System.out.println("Q to quit program"); 
        System.out.println();

        // prompt user to select file 
        Scanner fileNumber = new Scanner(System.in); 
        System.out.print("Please select file (e.g 1 ): "); 

        // remove all punctuations of selected file and replace with a space

        // ignore casing for all words in selected file

        // identify all unique words in the selected file

        // assign a number to each unique word

        // store the maximum number of unique words as an int max

        // use a loop function to count
        for (int i = 1; i <= max; i++) {
            System.out.println(); // print word corresponding to i
            for ()
                System.out.println("tab_word_count"); 
        }

        

        // System.out.print(dirFileName); 
        
    }

//     public static void main(String[] args)  {

//         if (args.length > 0) {
//             if (args[0].equalsIgnoreCase("kill")) {
//                 System.out.println("Ending program...");
//                 System.exit(0);
//             }
//         }

//         FileService fs = new FileService();
//         Boolean directoryCreated = fs.createDirectory(dirName);

//         if (directoryCreated) {
//             System.out.println("directory created:" + dirName);
//         } else {
//             System.out.println("directory already exists:" + dirName);
//         }

//         Boolean fileCreated = fs.createFile(dirName, fileName);

//         if (fileCreated) {
//             System.out.println("file created:" + fileName);
//         } else {
//             System.out.println("file already exists:" + fileName);
//         }

//         Console con = System.console();
//         String conInput = "";

//         IdiomService idiomSvc = new IdiomService();
//         List<String> idioms = null;

//         ProfileService ps = new ProfileService();

//         while (!conInput.equalsIgnoreCase("Q")) {
//             String randomIdiom = "";

//             displayMenu();
//             conInput = con.readLine("Enter your selection:");

//             switch (conInput) {
//                 case "1":
//                     CSVExample();
//                     break;
//                 case "2":
//                     idioms = new ArrayList<String>();
//                     idioms = idiomSvc.readFile(dirFileName);
//                     break;
//                 case "3":
//                     randomIdiom = idiomSvc.randomIdiom(idioms);
//                     message(randomIdiom);
//                     break;
//                 case "4":
//                     idiomSvc.showAllIdioms(idioms);
//                     break;
//                 case "5":
//                     ps.readFile();
//                     break;
//                 case "Q":
//                 case "q":
//                     message("Bye... bye...");
//                     break;
//                 default:
//                     break;
//             }
//         }

//     }

//     public static void CSVExample() throws IOException {
//         try {
//             // FileOutputStream fos = new FileOutputStream(dirFileName);

//             // for (int i = 0; i < 20; i++) {
//             // // writing string in char array
//             // fos.write(Integer.toString(i).getBytes());
//             // fos.write('\n');
//             // }

//             // clear the outputstream
//             // force data to store to file
//             // fos.flush();
//             // fos.close();

//             EmployeeService es = new EmployeeService();
//             List<Employee> empList = es.generateEmployees();

//             CSVService csvSvc = new CSVService();
//             csvSvc.writeToCSV(empList, dirFileName);

//             List<Employee> csvEmpList = csvSvc.readFromCSV(dirFileName);
//             csvEmpList.forEach(emp -> System.out.println(emp));

//         } catch (FileNotFoundException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//     }

//     public static void displayMenu() {
//         message("Welcome to My App");
//         message("=============================");
//         message("1. CSV Read and Write Test");
//         message("2. Read Idioms File");
//         message("3. Pick an idiom randomly");
//         message("4. List all idioms");
//         message("5. Read text file and check for word");
//         message("Q  Quit the program");
//     }

//     public static void message(String line) {
//         System.out.println(line);
    
}