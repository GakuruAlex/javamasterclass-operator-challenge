public class OperatorChallenge {

    public static void main(String[]args){
        double myDouble = 20.00d ;

        double mySecondDouble = 80.00d ;

        double result = (myDouble + mySecondDouble ) * 100.00 ;

        double myModuloResult = result % 40.00 ;

        boolean myResult = myModuloResult == 0;
        System.out.println(myResult);

        if(!myResult){
            System.out.println("Got some remainder");
        }

    }
}
