import java.util.*;
public class Lab11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BlueRayCollection collection = new BlueRayCollection();
        boolean running = true;
        while(running){
            System.out.println("[BlueRay Disk Collection]");
            System.out.println("1. Add to collection");
            System.out.println("2. See collection");
            System.out.println("3. Quit");
            System.out.print("Enter option: ");
            byte choice = input.nextByte();
            input.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter disk title: ");
                    String diskTitle = input.nextLine();
                    System.out.print("Enter director name: ");
                    String directorName = input.nextLine();
                    System.out.print("Enter year of release: ");
                    try {
                        int yearOfRelease = Integer.parseInt(input.nextLine());
                        System.out.print("Enter price of disk: $");
                        double price = Double.parseDouble(input.nextLine());
                        collection.addDisk(diskTitle,directorName,yearOfRelease,price);
                        System.out.println("BlueRay Disk added to collection");
                    }catch(NumberFormatException e){
                        System.out.println("Error: Year of release must be a whole number and price must be a number");
                    }
                    break;
                case 2:
                    System.out.println("\nHere's your current collection: ");
                    System.out.println(collection.showAll());
                    break;
                case 3:
                    System.out.println("Shutting down...");
                    input.close();
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option: please try again.");
                    break;
            }
        }
    }
}