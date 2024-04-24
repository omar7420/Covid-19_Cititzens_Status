package tma251;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class TMA251 {
    
    static int count = 0;
    static ArrayList<Doses> dosesList = new ArrayList<>();
    
    static Citizen[] citizensList = new Citizen[7];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        HealthProfessional hp1 = new HealthProfessional(1, "Ahmed", 3);
        HealthProfessional hp2 = new HealthProfessional(2, "Amr", 2);
        HealthProfessional hp3 = new HealthProfessional(3, "Omar", 4);
        
        Doses dose1 = new Doses(1, "Man1", "12:00", "Cairo ", hp1);
        Doses dose2 = new Doses(2, "Man2", "01:00", "Alex ", hp2);
        Doses dose3 = new Doses(3, "Man3", "02:00", "Giza ", hp3);

        dosesList.add(dose1);
        dosesList.add(dose2);
        dosesList.add(dose3);
        
        do {
            System.out.println("********** Employee Menu **********");
            System.out.println("   1) Add Citizen To The List.");
            System.out.println("   2) Add New Dose To specified Citizen.");
            System.out.println("   3) Display all Citizens.");
            System.out.println("   4) Exit.");
            System.out.println("       What is your choice?");
            choice = sc.nextInt();
            switch (choice) {
                
                case 1:
                    System.out.println("Enter a unique civil ID number (national number): ");
                    sc.nextLine();
                    int civilId = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter Name : ");
                    String name = sc.nextLine();
                    System.out.println("Enter City : ");
                    String city = sc.nextLine();
                    System.out.println("Enter Country : ");
                    String country = sc.nextLine();

                    citizensList[count] = new Citizen(civilId, name, city, country);
                    count++;

                    System.out.println("Citizen Added!!");
                    break;
                case 2:
                    System.out.println("ADD NEW DOSE TO A SPECIFIED CITIZEN.");

                    System.out.println("DOSES LIST :");

                    dosesList.forEach((doses) -> {
                        System.out.println(doses.toString());
                });
                    sc.nextLine();
                    System.out.println("Enter a citizen civil ID number (national number): ");
                    int cvID = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < count; i++) {
                        if (citizensList[i].getCivilIdNumber() == cvID) {
                            System.out.println("Enter Doz ID : ");
                            int dozID = Integer.parseInt(sc.nextLine());

                            for (Doses doses : dosesList) {
                                if (doses.getDoseID() == dozID) {
                                    citizensList[i].setDose(doses);
                                    System.out.println("Dose Added!!");
                                }
                            }
                            break;
                        }
                    }
            break;
                case 3:
                    for (int i = 0; i < count; i++) {
                        System.out.println(citizensList[i].toString());
                    }
                    break;

                case 4:
                    
                    System.out.println("Exiting..........");
                    savetoFile();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;

            }
        } while (choice != 4);

    }

    /**
      Function for saving data to a textfile.
     */
    private static void savetoFile() {

       
        Arrays.sort(citizensList,0,count);
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("CitizenDoses.txt");

            for (int i = 0; i < count; i++) {
                myWriter.write(citizensList[i].toString());

            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        } finally {

            if (myWriter != null) {

                try {
                    myWriter.close();
                } catch (IOException iOException) {
                    System.out.println(iOException.getMessage());
                }
            }

            System.out.println("Data written to file successfully.....");
        }

            
        
        
        
        
    }
}
