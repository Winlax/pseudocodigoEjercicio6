import java.util.*;

public class Arreglo6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int sumaMayores = 0;
        int sumaMenores = 0;
        int Adultos = 0;
        int Menores = 0;
        int edad;

        for (int i = 1; i <= 100; i++) {

            System.out.println("Ingresa tu edad:");
            edad = teclado.nextInt();

            if (edad >= 25) {
                sumaMayores += edad;
                Adultos += 1;
            } else {
                sumaMenores += edad;
                Menores += 1;
            }

        }

        double promMayores = sumaMayores / (double)Adultos;
        double promMenores = sumaMenores / (double)Menores;

        System.out.println("El promedio de edades mayores o iguales a 25 años es: "+promMayores);
        System.out.println("El promedio de edades menores a 25 años es: "+promMenores);
        
    }
}