package DSA_in_Java.Practice.Stacks_and_Queues.Monotonic_Stack;

import java.util.Arrays;
import java.util.Stack;

public class Asteroid_Collision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length ; i++) {
            int num1 = asteroids[i];
            while (!stack.isEmpty() && (stack.peek() > 0 && num1 < 0)){
                int num2 = stack.peek();
                if (Math.abs(num1)==Math.abs(num2)){    // Both explode
                    stack.pop();
                    num1 = 0;   // Mark num1 as destroyed
                    break;  //no further checking
                } else if (Math.abs(num1) > Math.abs(num2)) {
                    stack.pop();
                } else {
                    num1 = 0;
                    break;
                }
            }
            if (num1!=0){
                stack.push(num1);
            }
        }

        int stack_size = stack.size();
        int[] ansArray = new int[stack_size];
        for (int i = stack_size-1; i >=0 ; i--) {
            ansArray[i] = stack.pop();
        }
        return ansArray;
    }

    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));

        int[] asteroids2 = {8,-8};
        System.out.println(Arrays.toString(asteroidCollision(asteroids2)));

        int[] asteroids3 = {10,2,-5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids3)));

        int[] asteroids4 = {4 , 7 , 1, 1, 2, -3, -7, 17, 15, -16};
        System.out.println(Arrays.toString(asteroidCollision(asteroids4)));

        int[] asteroids5 = {-2,-1,1,2};
        System.out.println(Arrays.toString(asteroidCollision(asteroids5)));
    }
}
