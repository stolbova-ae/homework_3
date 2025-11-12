public abstract class Car {

    protected int yearOfManufacture;
    protected CarsCountryManufacturer countryName;
    protected String brand;
    protected Color color;
    protected int price;

    public Car(int yearOfManufacture, CarsCountryManufacturer countryName, String brand, Color color, int price) {
        this.yearOfManufacture = yearOfManufacture;
        this.countryName = countryName;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public CarsCountryManufacturer getCountryName() {
        return countryName;
    }

    public void setCountryName(CarsCountryManufacturer countryName) {
        this.countryName = countryName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    protected boolean isSecondHand() {
        if (yearOfManufacture <= 2023) {
            System.out.println("Это подержанный автомобиль");
            return true;
        } else {
            System.out.println("Это новый автомобиль");
            return false;
        }
    }

    public double servicePrice() {
        return price * 0.5;
    }


    public void printCarInfo() {
        System.out.println("Марка: " + this.getBrand());
        System.out.println("Год производства: " + this.getYearOfManufacture());
        System.out.println("Страна производства: " + this.getCountryName().getRussianName());
        System.out.println("Цвет: " + this.getColor().getRussianColorName());
        System.out.println("Цена: " + this.getPrice());
        if (this.isSecondHand()) {
            System.out.println("Машина требует обслуживание. Цена ремонта: " + this.servicePrice());
        } else System.out.println("Машина врожений не требует.");
    }
}
