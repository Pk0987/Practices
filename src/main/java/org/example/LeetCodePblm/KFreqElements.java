package org.example.LeetCodePblm;

import java.util.*;

public class KFreqElements {
    public static int[] topKFrequent(int[] nums, int k) {
        int count = 0;
        int x =0;
        int y= 0;
        int len =0;


        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int m : nums){
            if(!map.containsKey(m)){
                map.put(m,1);
            }else {
                count = map.get(m);
                map.put(m,count+1);
            }
        }
       for(Map.Entry<Integer,Integer> entry: map.entrySet()){
           x = entry.getKey();
           y = entry.getValue();
           if(k<=y){
               list.add(x);
           }
       }
       if(list.isEmpty()){
           return nums;
       }
       if(list.size()!=1){ len = 2;}
       else { len =1;}
        int[] ans = new int[len];

        for (int i = 0; i < len; i++) {
            ans[i]=list.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums ={1,2};
        int k = 2;
        int[] ll = topKFrequent(nums,k);
        System.out.println(Arrays.toString(ll));
    }
}
