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
}
