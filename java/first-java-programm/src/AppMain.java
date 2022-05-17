import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {
        System.out.println("Hallo an alle!");

        //Aufgabe von Folie 55
        int Num1 = 1;
        int Num2 = 2;

        var Summe = Num1 + Num2;

        System.out.println(Summe);

        System.out.println("Summe: "+Summe);

        //Aufgabe von Folie 59
        boolean result = Num1 > Num2;
        System.out.println(Num1 + " ist größer als " + Num2 + ": " + result);
        result = Num1 < Num2;
        System.out.println(Num1 + " ist kleiner als " + Num2 + ": " + result);
        result = Num1 == Num2;
        System.out.println(Num1 + " ist gleich " + Num2 + ": " + result);

        //Aufruf von Aufgabe 63
        System.out.println(IntSum(add(2,3)));

        //Aufruf von Aufgabe 65
        CheckString("Hakuna matata fancy");

    }
// Aufgabe von Folie 63
    public static int add (int Num1, int Num2){

        if ((Num1 > 100) || (Num2 >100)){
            System.out.println("Einer der Werte ist größer als 100");
        }
        else{
            System.out.println("Keiner der Werte ist größer als 100");
        }

        return Num1 + Num2;
    }

    public static String IntSum (int Num1){
        return ("Summe : " + Num1);
    }

    //Aufgabe von Folie 65
    public static void CheckString(String Eingabe){
        int laenge=Eingabe.length();

        if (laenge>20){
            System.out.println("Der Eingabetext ist länger als 20 Zeichen");
        }
        else{
            System.out.println("Der Eingabetext ist kürzer oder gleich 20 Zeichen");
        }

        System.out.println(Eingabe.contains("fancy"));
    }
}
