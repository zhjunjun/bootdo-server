package com.bootdo.testDemo;


/**
 * <p>User: Zhang Junjun
 * <p>Date: 18/7/26
 * <p>Version: 1.0
 */
public class Reverse {

    /**
     * 时间复杂度是O(N)
     * 空间复杂度是O(N)
     * @param str
     */
    public static void reverse(String str){
        char[] arr = str.toCharArray();
        for(int i = 0 ; i < arr.length / 2; ++i){
            char tmp =arr[arr.length -i-1];
            arr[arr.length -i -1] = arr[i];
            arr[i] = tmp;
        }
        String r = String.valueOf(arr);
        System.out.println(r);
    }


    /**
     * 递归实现
     * 时间复杂度是O(N)
     * 空间复杂度是O(N)
     * 最长字符串?
     * @param str
     */
    static StringBuilder sb = new StringBuilder();

    public static void reverse_cur(String str){
        if(str != null && str.length() > 0) {
            sb.append(str.charAt(str.length() - 1));
            reverse_cur(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args){
        reverse("hello");
        reverse("zhangjunjun");
        reverse("javacppscala");
        reverse_cur("zhangjunjun");
        System.out.println(sb.toString());
    }
}
