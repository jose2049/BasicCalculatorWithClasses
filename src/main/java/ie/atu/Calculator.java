package ie.atu;

public class Calculator {
    public int add(int a,int b){
        return a+b;
    }   //Addition

    public int sub(int a, int b){return a-b; }  //subtraction

    public int mul(int a, int b){return a*b;}   //multiplication

    public float div(float a, float b){return a/b;}   //division

    public static double pow(double a, double b){return Math.pow(a,b);}

    public float modulo(float a, float b){return a%b;}
}
