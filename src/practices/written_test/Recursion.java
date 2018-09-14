package bishi;

public class Recursion {

    public static int recursion(int n){
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return recursion(n - 1) + recursion(n - 2);
    }
}
