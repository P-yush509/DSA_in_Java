package DSA_in_Java.Practice.Bit_Manipulation.Level1;

public class Get_Set_Clear {
    public static void bitManipulation(int num, int i) {
        //  TO GET
        System.out.print(get_ith(num,i));
        //  TO SET
        System.out.print(" "+set_ith(num,i));
        // TO CLEAR
        System.out.println(" "+clear_ith(num,i));
    }
    public static int get_ith(int num , int i){
        int ith_index;
        if ((num & 1<<(i-1))==0){
            ith_index=0;
        }else {
            ith_index=1;
        }
        return ith_index;
    }
    public static int set_ith(int num, int i){
        num = (num | 1<<(i-1));
        return num;
    }
    public static int clear_ith(int num , int i){
        num = (num & ~(1<<(i-1)));
        return num;
    }

    public static void main(String[] args) {
        int num = 70 , position = 3;
        bitManipulation(num,position);

        int num2 = 8 , position2 = 1;
        bitManipulation(num2,position2);
        bitManipulation(129909780 , 17);
    }
}
