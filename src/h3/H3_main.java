package h3;

public class H3_main {
    public static void main(String[] args) {
        float celsiusFloat = 14.2f, fahrenheitFloat = 1;
        double celsiusDouble = 14.2, fahrenheitDouble = 1;

        fahrenheitFloat = celsiusFloat * 9 / 5 + 32;
        fahrenheitDouble = celsiusDouble * 9 / 5 + 32;

        System.out.println("Benutzt man 'float' zur Umrechnung von Celsius in Fahrenheit, entsprechen " + celsiusFloat + "°C = " + fahrenheitFloat + "°F");
        System.out.println("Benutzt man 'double' zur Umrechnung von Celsius in Fahrenheit, entsprechen " + celsiusDouble + "°C = " + fahrenheitDouble + "°F");

    }
}
