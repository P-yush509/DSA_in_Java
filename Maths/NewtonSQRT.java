package DSA_in_Java.Maths;

public class NewtonSQRT {
    public static void main(String[] args) {
        int n=40;
        System.out.println(sqrt(n));
    }
    static double sqrt(int n ){
        double root;
        double x=n;
        while (true){
            root=(x+(n/x))/2;
            double error = Math.abs(root-x);
            if(error<0.5){
                break;
            }
            x=root;
        }
        return root;
    }
}
