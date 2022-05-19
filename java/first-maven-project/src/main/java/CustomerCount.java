public class CustomerCount {

    public static void main(String[] args) {

    }

    public static String counter(int Num1){
        String costumerCount;
        if (Num1>30) {
            costumerCount = "Zu viele Personen";
        }else{
            costumerCount = "Maximale Personenanzahl nicht überschritten";
        }
        return costumerCount;
    }
//werde ich nochmal neu und ausführlicher schreiben
    public static int alarm(String stufe){
        String ausgabe;
        switch (stufe){
            case "rot":
                return 0;
            case "gelb":
                return 30;
            case "grün":
                return 60;
            default:
                System.out.println("Ungültige Eingabe");
                return 0;
        }
    }
}
