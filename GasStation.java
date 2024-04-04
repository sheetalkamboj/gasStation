 import java.util.Scanner;

public class GasStation {
    private String name;
    private String address;
    private double price;

    public GasStation() {
        name = "";
        address = "";
        price = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void outputReport() {
        System.out.println(name + ", " + address + ", " + String.format("%.2f", price));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GasStation[] gasStations = new GasStation[3];

        System.out.println("Welcome to Gas Station Program Version 1");
        System.out.println("Enter data for three gas stations");

        for (int i = 0; i < gasStations.length; i++) {
            System.out.println("Enter name");
            String name = scanner.nextLine();

            System.out.println("Enter address");
            String address = scanner.nextLine();

            System.out.println("Enter price");
            double price = scanner.nextDouble();
            scanner.nextLine();

            gasStations[i] = new GasStation();
            gasStations[i].setName(name);
            gasStations[i].setAddress(address);
            gasStations[i].setPrice(price);
        }

        double average = (gasStations[0].getPrice() + gasStations[1].getPrice() + gasStations[2].getPrice()) / 3.0;

        for (GasStation gasStation : gasStations) {
            gasStation.outputReport();
        }

        System.out.println("Average " + String.format("%.2f", average));
        System.out.println("Program by sheetal");

        scanner.close();
    }
}
