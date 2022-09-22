import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
       
        Car [] cars = new Car[]{
            new Car("Nissan",5000,2020,"Red",new String[]{"tires","keys"}),
            new Car("Dodge",11000,2019,"Blue",new String[]{"tires","keys"}),
            new Car("Nissan",5000,2020,"yellow",new String[]{"tires","filter"}),
            new Car("Honda",7000,2019,"orange",new String[]{"tires","filter"}),
            new Car("Mercedes",15000,2017,"jet-black",new String[]{"tires","filter"}),
        };
        Dealership dealership =new Dealership(cars);
        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
        String make=scan.nextLine();
        System.out.print("Enter your budget: ");
        int budget=scan.nextInt();
        scan.nextLine();

        int search=dealership.search(make, budget);

        if (search==404){
            System.out.println("Feel free to browse through our collection of cars.\n");
            System.out.println(dealership);
        }
        else  {
            String yesNo =scan.nextLine();
            if (yesNo.equalsIgnoreCase("yes")){
                dealership.sellCar(search);
            }

        }
        
        
        //System.out.println(dealership);
        
        
        
       
       
        
        
        //System.out.println(Arrays.toString(nissan.parts));
       
        
        
        
    }
}
