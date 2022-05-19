public class Fibu {


    public static int callFibuIt(int input) {

        if (input == 0){
            return 0;

        }else if(input == 1){
            return 1;

        }else{
            int[] FibuArray = new int[input];
            FibuArray[0] = 1;
            FibuArray[1] = 1;

            for (int i=2; i < input; i++){
                FibuArray[i]=FibuArray[i-1]+FibuArray[i-2];
            }
            return FibuArray[input-1];
        }

    }

    public static int callFibuRec(int input) {

        if (input == 0) {
            return 0;

        }else if(input == 1){
            return 1;

        }else{
            return (callFibuRec(input-1)+callFibuRec(input-2));
        }
    }
}
