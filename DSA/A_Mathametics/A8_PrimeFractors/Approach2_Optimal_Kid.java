package A_Mathametics.A8_PrimeFractors;

public class Approach2_Optimal_Kid {
    public static void primeFactors(int n){
        if(n<=1) return;
        for (int i = 2; i*i <=n ; i++) {
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
        }
        if(n>1) System.out.println(n);
    }

    public static void main(String[] args) {
        primeFactors(120);
    }
}
