package DSA_in_Java.Practice.Bit_Manipulation.Level1;

public class Count_Set_Bits {
//    public static int countSetBits(int n){
//        int count = 0;
//        for (int i = 1; i <= n ; i++) {
//            int num = i;
//            while (num!=0){
//                num = num & (num-1);
//                count++;
//            }
//        }
//        return count;
//    }

    public static int countSetBits(int n) {
        if (n==0) return 0;
        int x = maxPower(n);                       // x -> maxPowerof2
        int a = x * (1<<(x-1));                    // a -> sum_of_setBits_till_max_Pow_of_2
        int b = n - (1<<x);                        // b -> total no of elements after max pow of 2 (on which the function will be called recursively)
        int c = b + 1;                             // c -> total no of set bits in first column after max power of 2

        int ans = a + countSetBits(b) + c;
        return ans;
    }

    public static int maxPower(int n){
        int num = 1;
        int count = 0;
        while (num<=n){
            num = num<<1;
            count++;
        }
        return count-1;
    }

        public static void main(String[] args) {
        System.out.println(countSetBits(4));
        System.out.println(countSetBits(1));
        System.out.println(countSetBits(17));
        System.out.println(countSetBits(16));
    }
}
