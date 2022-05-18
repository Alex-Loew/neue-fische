public class Add {
    public static void main(String[] args) {


    }

    public static int add (int Num1, int Num2){
        compare100(Num1, Num2);
        return Num1 + Num2;
    }

    public static boolean compare100 (int Num1, int Num2){
        return (Num1 > 100) || (Num2 >100);
    }
}
