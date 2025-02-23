package DSA_in_Java.Practice.Arrays.L2Medium;

import java.util.ArrayList;

public class Product_Last_K_Nos {
    ArrayList<Integer> al;
    public Product_Last_K_Nos() {
        al = new ArrayList<>();
    }

    public void add(int num) {
        //instead of normal list we'll store prefix Product List
        if (num==0){    //clear the list if we encounter a 0
            al.clear();
            return;
        }
        if (al.isEmpty()){
            al.add(num);
            return;
        }
        al.add(num * al.get(al.size()-1));
    }

    public int getProduct(int k) {
        if (k > al.size())    return 0;   //it means that a 0 had encountered so we removed it in order to maintain prefixMultiplication.
        if (k == al.size()){
            return al.getLast();
        }else {
            return al.getLast()/al.get(al.size()-k-1);
        }
    }

    public static void main(String[] args) {
        Product_Last_K_Nos productOfNumbers = new Product_Last_K_Nos();
        productOfNumbers.add(3);        // [3]
        productOfNumbers.add(0);        // []
        productOfNumbers.add(2);        // [2]
        productOfNumbers.add(5);        // [2,10]
        productOfNumbers.add(4);        // [2,10,40]
        productOfNumbers.getProduct(2); // return 20. (40/2)
        productOfNumbers.getProduct(3); // return 40.
        productOfNumbers.getProduct(4); // return 0. as k>al.size()
        productOfNumbers.add(8);        // [2,10,40,320]
        productOfNumbers.getProduct(2); // return 32. (320/10)
    }
}
