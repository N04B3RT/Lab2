// Class definition for Bookshelf
class Bookshelf {
    // Private fields
    private heightInCm
    private widthInCm
    private numOfShelves
    private material
    
    // Constructor to initialize the bookshelf
    constructor(heightInCm, widthInCm, numOfShelves, material) {
        setHeight(heightInCm)
        setWidth(widthInCm)
        setNumOfShelves(numOfShelves)
        setMaterial(material)
    }

    // Setter methods
    setHeight(heightInCm) {
        this.heightInCm = heightInCm
    }

    setWidth(widthInCm) {
        this.widthInCm = widthInCm
    }

    setNumOfShelves(numOfShelves) {
        this.numOfShelves = numOfShelves
    }

    setMaterial(material) {
        this.material = material
    }

    // Getter methods
    getHeight() {
        return heightInCm
    }

    getWidth() {
        return widthInCm
    }

    getNumOfShelves() {
        return numOfShelves
    }

    getMaterial() {
        return material
    }

    // Method to convert cm to inches
    convertCmToInches(cm) {
        return cm * 0.393701
    }

    // Method to calculate surface area in square inches
    calculateSurfaceArea() {
        heightInInches = convertCmToInches(heightInCm)
        widthInInches = convertCmToInches(widthInCm)
        return heightInInches * widthInInches
    }

    // Method to calculate material cost
    calculateMaterialCost() {
        if material == "Walnut" {
            return 175
        } else if material == "Cherry Wood" {
            return 150
        } else {
            return 0
        }
    }

    // Method to calculate shelf cost
    calculateShelfCost() {
        return numOfShelves * 25
    }

    // Method to calculate the total price of the bookshelf
    calculateTotalPrice() {
        basePrice = 120
        surfaceArea = calculateSurfaceArea()

        if surfaceArea > 900 {
            basePrice = basePrice + 60
        }

        materialCost = calculateMaterialCost()
        shelfCost = calculateShelfCost()
        totalPrice = basePrice + materialCost + shelfCost

        return totalPrice
    }
}

// Main method to test the Bookshelf class
main() {
    // Create instances of Bookshelf
    bookshelf1 = Bookshelf(180, 80, 4, "Walnut")
    bookshelf2 = Bookshelf(150, 60, 3, "Cherry Wood")
    bookshelf3 = Bookshelf(200, 70, 5, "Laminate")

    // Print details and cost of each bookshelf
    print("Bookshelf 1:")
    print("Height: " + bookshelf1.getHeight() + " cm")
    print("Width: " + bookshelf1.getWidth() + " cm")
    print("Material: " + bookshelf1.getMaterial())
    print("Number of shelves: " + bookshelf1.getNumOfShelves())
    print("Total Price: $" + bookshelf1.calculateTotalPrice())

    print("Bookshelf 2:")
    print("Height: " + bookshelf2.getHeight() + " cm")
    print("Width: " + bookshelf2.getWidth() + " cm")
    print("Material: " + bookshelf2.getMaterial())
    print("Number of shelves: " + bookshelf2.getNumOfShelves())
    print("Total Price: $" + bookshelf2.calculateTotalPrice())

    print("Bookshelf 3:")
    print("Height: " + bookshelf3.getHeight() + " cm")
    print("Width: " + bookshelf3.getWidth() + " cm")
    print("Material: " + bookshelf3.getMaterial())
    print("Number of shelves: " + bookshelf3.getNumOfShelves())
    print("Total Price: $" + bookshelf3.calculateTotalPrice())
}
