package lopinsert;

import java.util.Arrays;

public class IntSet {
    private int a[];

    public IntSet(int a[]) {
        this.a = a;
    }
    public int getLength(){
        return a.length;
    }

    public int[] getA() {
        return a;
    }

    public IntSet union(IntSet x){
        int z[]= new int[1000];
        boolean A[] = new boolean[1000];
        boolean B[] = new boolean[1000];
        for(int i=0;i<a.length;i++){
            if(a[i]!=0) A[a[i]] = true;
        }
        for(int i=0;i<x.getLength();i++){
            if(x.getA()[i]!=0) B[x.getA()[i]] = true;
        }
        for(int i=0;i<1000;i++){
            if(A[i] || B[i]) z[i]=i;
        }
        return new IntSet(z);
    }

    @Override
    public String toString() {
        Arrays.sort(a);
        String x="";
        for(int i=0;i<a.length;i++){
            if(a[i]!=0) x=x+a[i] +" ";
        }
        return x;
    }
}
