public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos a convertir Escalas de temperatura");

        double tempC = 273;
        double tempF = (tempC*1.8)+32;

        System.out.println(String.format("Convertimos la temperatura de tempC %.2f grados Celcius a una temperatura tempF %.2f grados Farhenheit", tempC,tempF));
    }

}
