package org.example;

public class SumCalculator {
    int sum(int n){
        if (n < 1) throw new IllegalArgumentException();
        else {
            int res = n;
            for (int i = 1; i < n; i++) res += i;
            return res;
        }
    }
}
