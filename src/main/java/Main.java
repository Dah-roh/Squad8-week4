import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {


//FUNCTIONAL
//        String[] functionalCountries = {"India", "Australia", "England", "South Africa", "Srilanka", "Newzealand", "West Indies", "Scotland"};
//        Function<String[], String> converter = (all) -> {
//            String names = "";
//            for(String n : all) {
//                String result = n.substring(0, n.indexOf(""));
//                result = n.substring(n.indexOf("")) + " " + result;
//                names += result + "\n";
//            }
//            return names;
//        };
//        System.out.println(converter.apply(functionalCountries));
//


//SUPPLIER
        String product = "together";
//        double price = 133.342;
        Supplier<Boolean> boolSupplier = () ->  product.length() == 10;
//        Supplier<Integer> integerSupplier = () -> product.length() - 2;
//        Supplier<String> supplier = () -> product.toUpperCase();
        BooleanSupplier booleanSupplier = () -> product.length() == 10;
//        IntSupplier intSupplier = () -> product.length() - 2;
//        DoubleSupplier doubleSupplier = () -> price -20;
        LongSupplier longSupplier = () -> new Date().getTime();
//
//
//        System.out.println(booleanSupplier.getAsBoolean());
//        System.out.println(integerSupplier.get());
//        System.out.println(doubleSupplier.getAsDouble());
        System.out.println(longSupplier.getAsLong());
//        System.out.println(supplier.get());
//
//        System.out.println(boolSupplier.get());
//        System.out.println(intSupplier.getAsInt());
//        System.out.println(supplier.get());



////CONSUMER
//
//        Consumer<Integer> multiplyValue = i -> System.out.println(5*i);
//        Consumer<Integer> addValue = i -> System.out.println(5+i);
//
//        multiplyValue.andThen(addValue).accept(4);
//        System.out.println("");
//        addValue.andThen(multiplyValue).accept(5);
//        System.out.println("");
//        multiplyValue.andThen(i -> System.out.println(3*i)).accept(4);




        
//PREDICATE

        Predicate<Integer> p = number -> (number % 2 == 0);
        System.out.println(p.test(10));
        System.out.println(p.test(11));

        List<String> names = Arrays.asList(
                "Peter",
                "Martin",
                "Alex",
                "Philip",
                "Piyush",
                "Mike"
        );

        Predicate<String> predicate = name -> name.startsWith("P");

        names.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
