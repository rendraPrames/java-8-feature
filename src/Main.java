import model.Car;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        System.out.println("================ Menggunakan Stream API untuk memfilter dan mencetak elemen yang panjangnya lebih dari 4 karakter ================");
        // Contoh penggunaan Lambda Expressions dan Stream API
        // Menggunakan Stream API untuk memfilter dan mencetak elemen yang panjangnya lebih dari 4 karakter.
        names.stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);

        // Contoh penggunaan Default Methods pada Interface
        System.out.println("================ Contoh penggunaan Default Methods pada Interface ================");
        Car car = new Car();
        car.start();
        car.honk(); // Menggunakan metode default dari antarmuka.

        // Contoh penggunaan Date and Time API
        System.out.println("================ Contoh penggunaan Date and Time API ================");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        // Contoh penggunaan Optional
        System.out.println("================ Contoh penggunaan Optional ================");
        String name = "John";
        Optional<String> optionalName = Optional.of(name);

        // Mengambil nilai jika ada, atau mengembalikan nilai default jika tidak.
        String result = optionalName.orElse("Unknown");
        System.out.println("Result: " + result);
    }
}