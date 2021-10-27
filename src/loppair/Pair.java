package loppair;

public class Pair {
    private int a,b;
    public Pair() {
    }

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public boolean isPrime(){
        if(nt(a) && nt(b)) return true;
        else return false;
    }
    public boolean nt(int x){
        if(x<2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if(x%i==0) return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return a+" "+b;
    }
}
