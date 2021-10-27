package kts2.tichmatran;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    private int n,m;
    private int a[][];
    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public Matrix(int n, int m, int[][] a) {
        this.n = n;
        this.m = m;
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public int[][] getA() {
        return a;
    }

    public void nextMatrix(Scanner sc) {
        a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix b) {
        int c[][] = new int[n][b.getM()];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < b.getM(); j++) {
                c[i][j]=0;
                for (int k = 0; k < m; k++) {
                    c[i][j]+=a[i][k]*b.getA()[k][j];
                }
            }
        }
        return new Matrix(n,b.getM(),c);
    }

    @Override
    public String toString() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        return "";
    }
}
