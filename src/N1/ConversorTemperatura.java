package N1;

public class ConversorTemperatura {
	//Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    //converter Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

}
