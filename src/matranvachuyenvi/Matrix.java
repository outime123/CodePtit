package matranvachuyenvi;

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

    public Matrix trans() {
        int b[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = a[j][i];
            }
        }
        return new Matrix(m,n,b);
    }

    public Matrix mul(Matrix b) {
        int c[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j]=0;
                for (int k = 0; k < m; k++) {
                    c[i][j] += a[i][k]*b.getA()[k][j];
                }
            }
        }
        return new Matrix(n,n,c);
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

    @Override
    public String toString() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");;
            }
            System.out.println();
        }
        return "";
    }
}
