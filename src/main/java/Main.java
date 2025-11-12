import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = List.of(
                new LadaCars(2018, Color.GREY, 1000000),
                new FordCars(2020, Color.BLACK, 4_500_000),
                new GeelyCars(2024, Color.RED, 3000000),
                new LadaCars(2025, Color.WHITE, 2000000),
                new GeelyCars(2025, Color.WHITE, 4000000),
                new FordCars(2025, Color.WHITE, 7000000)
        );
        cars.forEach(car -> {
            car.printCarInfo();
            System.out.println("\n");
        });
    }

}