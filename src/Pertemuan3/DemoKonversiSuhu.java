package Pertemuan3;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();

        double celcius = 25;
        double fahrenheit = konversi.celciusToFahrenheit(celcius);
        double reamur = konversi.celciusToReamur(celcius);
        double reamurFromFahrenheit = konversi.fahrenheitToReamur(fahrenheit);

        System.out.println("Celcius to Fahrenheit: " + celcius + "C = " + fahrenheit + "F");
        System.out.println("Celcius to Reamur: " + celcius + "C = " + reamur + "R");
        System.out.println("Fahrenheit to Reamur: " + fahrenheit + "F = " + reamurFromFahrenheit + "R");
    }
}