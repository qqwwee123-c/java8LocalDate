package com.ywb.lambda;

public class testLambda {
    public static void main(String[] args) {
        MathOperation add = (a,b) -> a+b;
        MathOperation sub = (int a,int b) -> a-b;
        MathOperation mul = (a,b) -> a*b;
        MathOperation div = (a,b) -> a/b;
        int addresult = operate(1, 2, add);
        System.out.println("add result = " +addresult);
        int a = 2;
        int b = 1;
        int subresult = operate(a,b,sub);
        System.out.println("sub result = " +subresult);

        int mulresult = operate(1,3,mul);
        System.out.println("mul result = " +mulresult);

        int divresult = operate(6,2,div);
        System.out.println("div result = "+ divresult);
    }

    private static int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

}
interface MathOperation{
    int operation(int a, int b);
}


