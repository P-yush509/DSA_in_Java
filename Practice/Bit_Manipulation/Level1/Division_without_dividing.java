package DSA_in_Java.Practice.Bit_Manipulation.Level1;

public class Division_without_dividing {
    // WITH MULTIPLICATION AND WITHOUT EDGE-CASE HANDLED
//    public int divide(int dividend, int divisor) {
//        int count = 0;
//        int sign = 1;
//        if ((dividend>0 && divisor<0) || (dividend<0 && divisor>0)){
//            sign=-1;
//        }
//        dividend = Math.abs(dividend);
//        divisor = Math.abs(divisor);
//        while (dividend>=divisor){
//            int highest_multiple = 0;
//            while (dividend >= divisor * Math.pow(2,highest_multiple)){
//                highest_multiple++;
//            }
//            dividend -= (int) (divisor * Math.pow(2,highest_multiple-1));
//            count += (int) Math.pow(2,highest_multiple-1);
//        }
//        return sign * count;
//    }

    public static int divide(int dividend, int divisor) {
        long count = 0;
        int sign = 1;
        if ((dividend>0 && divisor<0) || (dividend<0 && divisor>0)){
            sign=-1;
        }

        long dividend1 =  dividend;
        long divisor1 = divisor;
         dividend1 = Math.abs(dividend1);
         divisor1 = Math.abs(divisor1);

        while (dividend1>=divisor1){
            int highest_multiple = 0;
            while (dividend1 >= (divisor1 << highest_multiple)){
                highest_multiple++;
            }
            dividend1 -= (divisor1 << highest_multiple-1);
            count += (1L << highest_multiple-1);
        }

        if (count>Integer.MAX_VALUE && sign==1){
            return Integer.MAX_VALUE;
        } else if (count>Integer.MAX_VALUE && sign==-1) {
            return Integer.MIN_VALUE;
        }else {
            return (int)(sign * count);
        }
    }

    public static void main(String[] args) {
        System.out.println(divide(10 , 3));
        System.out.println(divide(7 , -3));
        System.out.println(divide(2147483647 , -1));
    }
}
