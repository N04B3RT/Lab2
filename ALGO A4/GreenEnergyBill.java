import java.util.Scanner;

public class GreenEnergyBill extends EnergyBill {
    private double solarEnergyContribution; // in kWh

    // Constructor
    public GreenEnergyBill(String customerName, String customerAddress, double electricityUsage, double gasUsage, double solarEnergyContribution) {
        super(customerName, customerAddress, electricityUsage, gasUsage);
        this.solarEnergyContribution = solarEnergyContribution;
    }

    // Overriding the method to calculate electricity charges with solar deduction
    @Override
    public double calculateElectricityCharges() {
        double netElectricityUsage = super.calculateElectricityCharges() - (solarEnergyContribution * solarEnergyContribution);
        return netElectricityUsage < 0 ? 0 : netElectricityUsage;
    }

    // Overriding the method to display bill
    @Override
    public void displayBill() {
        super.displayBill();
        System.out.println("Solar Energy Contribution: " + solarEnergyContribution + " kWh");
        System.out.println("Net Electricity Charges after Solar Contribution: $" + calculateElectricityCharges());
        System.out.println("Total Charges: $" + (calculateElectricityCharges() + calculateGasCharges()));
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
            
            System.out.print("Enter solar energy contribution in kWh: ");
            double solarEnergyContribution = scanner.nextDouble();
            
            // Creating an instance of GreenEnergyBill
            GreenEnergyBill greenBill = new GreenEnergyBill(name, address, electricityUsage, gasUsage, solarEnergyContribution);
            
            // Displaying the bill
            greenBill.displayBill();
        }
    }

    public double getSolarEnergyContribution() {
        return solarEnergyContribution;
    }

    public void setSolarEnergyContribution(double solarEnergyContribution) {
        this.solarEnergyContribution = solarEnergyContribution;
    }
}
