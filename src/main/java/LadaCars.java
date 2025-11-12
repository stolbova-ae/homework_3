public class LadaCars extends Car {

    public LadaCars(int year, Color color, int price) {
        super(year, CarsCountryManufacturer.RUSSIA, "Жигули", color, price);
    }

    @Override
    public double servicePrice() {
        if (yearOfManufacture < 2009) {
            return super.servicePrice() * 0.5;
        }
        return super.servicePrice();
    }
}
