package com.test;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.checkRecord("AL"));
    }

    public boolean checkRecord(String s) {
        boolean flag = false;
        int count =0;
        char[] c = s.toCharArray();
        int i;
        for (i = 0; i <c.length-2 ; i++) {
            if(c[i]==c[i+1] && c[i+1]==c[i+2] && c[i+2]=='L'){
                return false;
            }else if(c[i]=='A'){
                count++;
            }
        }
        for (int j = i; j < c.length ; j++) {
            if(c[j]=='A'){
                count++;
            }
        }
        if(count>1){
            return false;
        }
        return true;
    }
}

