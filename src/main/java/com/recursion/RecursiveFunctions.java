package com.recursion;

import java.util.List;
import java.util.Objects;

public class RecursiveFunctions {

    public static int recursiveIndexOf(List<String> list, String target) {
        return recursiveIndexOf(list, target, 0);
    }
        private static int recursiveIndexOf(List<String> list,String target, int index){

        if(index >= list.size()){
            return -1;
        }

        if (Objects.equals(list.get(index),target)) {
            return index;
        }

        return recursiveIndexOf(list,target,index+1);
        }

    public static int recursiveIndexOfByIndex(List<String> list, String target, int index) {
        if (index >= list.size()) {
            return -1;
        }
        if (Objects.equals(list.get(index),target)) {
        }

        return recursiveIndexOfByIndex(list,target,index + 1);
    }

    public static int recursiveIndexOfEmpty(List<String> list) {
        return recursiveIndexOfEmpty(list,0);
    }

        private static int recursiveIndexOfEmpty(List<String> list, int index){

            if (index >= list.size()) {
                return -1;
            }
            if (Objects.equals(list.get(index),"")) {
                return index;
            }

            return recursiveIndexOfEmpty(list,index + 1);
        }


    public static int recursivePut(String target, List<String> list) {
        return recursivePut(target, list, 0);
    }
        private static int recursivePut(String target, List<String> list, int index){
            if(index >= list.size()){
                return -1;
            }
            if(Objects.equals(list.get(index),"")){
                list.set(index,target);//Uso de Set que reemplaza sin cambiar el tamaño de la lista (mejor para este caso)
                return index;
            }
            return recursivePut(target,list,index+1);
        }



    public static int recursiveRemove(List<String> list, String target) {
        if (list.isEmpty()) {
            return 0;
        }
        if (list.get(0).equals(target)){
            list.remove(0);
            return 1 + recursiveRemove(list,target);
        }
        else {
            list.remove(0);  // Elimino el primer elemento aunque no coincida modificando la lista
            return 0 + recursiveRemove(list, target);
        }

    }

    public static int recursiveSum(List<Integer> list) {
        return recursiveSum(list,0);
    }
        private static int recursiveSum(List<Integer> list, int index){
            if (index>= list.size()){
                return 0;
            }
            else{
                return list.get(index) + recursiveSum(list,index + 1);
            }
        }

    public static int recursiveFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }

    public static int recursivePow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }

        return base * recursivePow(base,exponent-1);
    }

    public static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static boolean recursivePalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }
        String newWord =word.substring(1,word.length()-1);
        if(word.charAt(0) != word.charAt(word.length() - 1)){
            return false;
        }
        else{
            return recursivePalindrome(newWord);
        }
    }


}
