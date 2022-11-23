package ap.sortalgos;

public class Recursion {

    public static void RecursionFactorial(){
        System.out.println("Factorial methods in action: \n");
        System.out.println("Recursive: " + recursiveFactorial(3));
        System.out.println("Iterative: " + iterativeFactorial(4));
    }

    public static int recursiveFactorial(int num){

        if (num == 0){
            return 1;
        }
        return num * recursiveFactorial(num - 1);

    }

    public static int iterativeFactorial(int num){

        if (num == 0){
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }
}
