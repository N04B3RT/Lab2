import java.util.Scanner;

public class EnergyBill {
    private String customerName;
    private String customerAddress;
    private double electricityUsage; // in kWh
    private double gasUsage; // in units

    // Predefined rates
    private static final double ELECTRICITY_RATE = 0.12; // per kWh
    private static final double GAS_RATE = 0.09; // per unit

    // Constructor
    public EnergyBill(String customerName, String customerAddress, double electricityUsage, double gasUsage) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.electricityUsage = electricityUsage;
        this.gasUsage = gasUsage;
    }

    // Method to calculate electricity charges
    public double calculateElectricityCharges() {
        return electricityUsage * ELECTRICITY_RATE;
    }

    // Method to calculate gas charges
    public double calculateGasCharges() {
        return gasUsage * GAS_RATE;
    }

    // Method to calculate total charges
    public double calculateTotalCharges() {
        return calculateElectricityCharges() + calculateGasCharges();
    }

    // Method to display bill
    public void displayBill() {
        System.out.println("Customer: " + customerName);
        System.out.println("Address: " + customerAddress);
        System.out.println("Electricity Usage: " + electricityUsage + " kWh");
        System.out.println("Gas Usage: " + gasUsage + " units");
        System.out.println("Electricity Charges: $" + calculateElectricityCharges());
        System.out.println("Gas Charges: $" + calculateGasCharges());
        System.out.println("Total Charges: $" + calculateTotalCharges());
    }

    public static void main(String[] args) {
        // Prompting user for input
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompting user for input
            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter customer address: ");
            String address = scanner.nextLine();
            
            System.out.print("Enter electricity usage in kWh: ");
            double electricityUsage = scanner.nextDouble();
            
            System.out.print("Enter gas usage in units: ");
            double gasUsage = scanner.nextDouble();
            
            // Creating an instance of EnergyBill
            EnergyBill bill = new EnergyBill(name, address, electricityUsage, gasUsage);
            
            // Displaying the bill
            bill.displayBill();
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public double getElectricityUsage() {
        return electricityUsage;
    }

    public void setElectricityUsage(double electricityUsage) {
        this.electricityUsage = electricityUsage;
    }

    public double getGasUsage() {
        return gasUsage;
    }

    public void setGasUsage(double gasUsage) {
        this.gasUsage = gasUsage;
    }
}
