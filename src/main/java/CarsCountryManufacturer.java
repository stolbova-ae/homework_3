public enum CarsCountryManufacturer {
    CHINA ("КНР"), RUSSIA("Россия"), USA("США");

    // Приватное поле для хранения названия страны
    private final String countryName;

    // Приватный конструктор
    private CarsCountryManufacturer(String countryName) {
        this.countryName = countryName;
    }

    // Геттер для получения названия страны
    public String getRussianName() {
        return countryName;
    }
}
