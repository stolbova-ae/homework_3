public class FordCars extends Car {

    public FordCars(int year, Color color, int price) {
        super(year, CarsCountryManufacturer.USA, "Ford", color, price);
    }

    @Override
    public double servicePrice() {
        if (yearOfManufacture < 2020) {
            return super.servicePrice() * 2;
        }
        return super.servicePrice();
    }
}
