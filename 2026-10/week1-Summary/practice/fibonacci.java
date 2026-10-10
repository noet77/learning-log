public class fibonacci {
    public static void main(String[] args) {
        int[] fib=new int[20];
        fib[0]=1;
        fib[1]=1;
        for (int i = 2; i < fib.length ; i++) {
            fib [i]=fib[i-1]+fib[i-2];
        }
        System.out.println("Fibonacci的前20项为:");
        for (int i = 0; i < fib.length ; i++) {
            System.out.println(fib[i]+"");
        }
    }
}