public class AppMain {
    public static void main(String[] args) {
        System.out.println("Hallo an alle!");

        int Num1 = 1;
        int Num2 = 2;

        var Summe = Num1 + Num2;

        System.out.println(Summe);

        System.out.println("Summe: "+Summe);

        boolean result = Num1 > Num2;
        System.out.println(Num1 + " ist größer als " + Num2 + ": " + result);
        result = Num1 < Num2;
        System.out.println(Num1 + " ist kleiner als " + Num2 + ": " + result);
        result = Num1 == Num2;
        System.out.println(Num1 + " ist gleich " + Num2 + ": " + result);
    }
}
