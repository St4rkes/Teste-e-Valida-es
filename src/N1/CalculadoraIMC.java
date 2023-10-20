package N1;

public class CalculadoraIMC {

    
    public static double calcularIMC(double pesoKg, double alturaM) {
        if (pesoKg <= 0 || alturaM <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser valores positivos.");
        }
        double imc = pesoKg / (alturaM * alturaM);
        return imc;
    }
}
