// Base class for PC components
class PCComponent {
    protected String name;
    protected double price;

    public PCComponent(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

// Subclasses for different types of components
class CPU extends PCComponent {
    public CPU(String name, double price) {
        super(name, price);
    }
}

class GPU extends PCComponent {
    public GPU(String name, double price) {
        super(name, price);
    }
}

class RAM extends PCComponent {
    public RAM(String name, double price) {
        super(name, price);
    }
}

class Storage extends PCComponent {
    public Storage(String name, double price) {
        super(name, price);
    }
}

// Class representing the PC setup
class PCSetup {
    private PCComponent[] components;
    private String caseSize;
    private boolean rgbLighting;
    private boolean liquidCooling;
    private static final double SMALL_CASE_PREMIUM = 30.0;
    private static final double MEDIUM_CASE_PREMIUM = 50.0;
    private static final double LARGE_CASE_PREMIUM = 70.0;
    private static final double RGB_COST = 20.0;
    private static final double LIQUID_COOLING_COST = 100.0;

    public PCSetup(PCComponent[] components, String caseSize, boolean rgbLighting, boolean liquidCooling) {
        this.components = components;
        this.caseSize = caseSize;
        this.rgbLighting = rgbLighting;
        this.liquidCooling = liquidCooling;
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (PCComponent component : components) {
            totalCost += component.getPrice();
        }
        totalCost += getCaseSizePremium();
        if (rgbLighting) {
            totalCost += RGB_COST;
        }
        if (liquidCooling) {
            totalCost += LIQUID_COOLING_COST;
        }
        return totalCost;
    }

    private double getCaseSizePremium() {
        return switch (caseSize.toLowerCase()) {
            case "small" -> SMALL_CASE_PREMIUM;
            case "medium" -> MEDIUM_CASE_PREMIUM;
            case "large" -> LARGE_CASE_PREMIUM;
            default -> 0.0;
        };
    }

    public void displaySetup() {
        System.out.println("PC Setup:");
        for (PCComponent component : components) {
            System.out.println(component.getName() + ": $" + component.getPrice());
        }
        System.out.println("Case Size: " + caseSize + " (+" + getCaseSizePremium() + ")");
        System.out.println("RGB Lighting: " + (rgbLighting ? "Yes (+" + RGB_COST + ")" : "No"));
        System.out.println("Liquid Cooling: " + (liquidCooling ? "Yes (+" + LIQUID_COOLING_COST + ")" : "No"));
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public boolean isRgbLighting() {
        return rgbLighting;
    }

    public void setRgbLighting(boolean rgbLighting) {
        this.rgbLighting = rgbLighting;
    }

    public boolean isLiquidCooling() {
        return liquidCooling;
    }

    public void setLiquidCooling(boolean liquidCooling) {
        this.liquidCooling = liquidCooling;
    }

    public PCComponent[] getComponents() {
        return components;
    }

    public void setComponents(PCComponent[] components) {
        this.components = components;
    }

    public String getCaseSize() {
        return caseSize;
    }

    public void setCaseSize(String caseSize) {
        this.caseSize = caseSize;
    }
}

public class CustomPCBuilder {
    public static void main(String[] args) {
        // Example setup 1
        PCComponent[] components1 = {
            new CPU("Intel i9", 500.0),
            new GPU("NVIDIA RTX 3080", 700.0),
            new RAM("16GB DDR4", 150.0),
            new Storage("1TB SSD", 100.0)
        };
        PCSetup setup1 = new PCSetup(components1, "large", true, true);
        setup1.displaySetup();

        System.out.println();

        // Example setup 2
        PCComponent[] components2 = {
            new CPU("AMD Ryzen 7", 300.0),
            new GPU("AMD Radeon RX 6800", 600.0),
            new RAM("32GB DDR4", 250.0),
            new Storage("2TB HDD", 80.0)
        };
        PCSetup setup2 = new PCSetup(components2, "medium", false, false);
        setup2.displaySetup();
    }
}
