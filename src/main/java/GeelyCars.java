public class GeelyCars extends Car {

    public GeelyCars(int year, Color color, int price) {
        super(year, CarsCountryManufacturer.CHINA, "Geely", color, price);
    }

    @Override
    public double servicePrice() {
        if (yearOfManufacture < 2021) {
            return super.servicePrice() * 1.5;
        }
        return super.servicePrice();
    }
}
