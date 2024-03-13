package com.revature.pyramids;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        int[] dice1 = {1, 2, 3,4,5,6};
        int[] dice2 = {1,2,3,4,5, 6};

        List<List<Integer>> combinations = generateCombinations(dice1, dice2);

        // Print the combinations
        for (List<Integer> combination : combinations) {
//            for (Integer in:combination)
                 System.out.println(combination);
        }
        System.out.println("probability of value is : "+getProbability(combinations,6));
    }

    public static List<List<Integer>> generateCombinations(int[] dice1, int[] dice2) {
        int totalCombinations = dice1.length * dice2.length;
//        int[][] combinations = new int[totalCombinations][2];
         List<List<Integer>> combinations=new ArrayList();
        int index = 0;
        for (int value1 : dice1) {
            for (int value2 : dice2) {
                ArrayList<Integer> ar=new ArrayList<>();
                ar.add(value1);
                ar.add(value2);
                combinations.add(ar);
            }
        }

        return combinations;
    }
    public static float getProbability(List<List<Integer>> list,int value){
        int count=0;
         for(List<Integer> com:list){
             int val=com.get(0)+com.get(1);
             if(val==value)count++;
         }
        System.out.println("number of combinations : "+count);

        return (float)count/list.size();
    }
}
