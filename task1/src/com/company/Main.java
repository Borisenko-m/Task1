package com.company;

public class Main {

    public static void main(String[] args) {
	    Main main = new Main();
	    main._main(args);
    }
    
    void _main(String[] args)
    {
        println(
            "" +
            "1)  remainder: "        +  remainder(1, 3) + '\n' +
            "2)  triArea: "          +  triArea(3, 2) + '\n' +
            "3)  animals: "          +  animals(2, 3, 5) + '\n' +
            "4)  profitableGamble: " +  profitableGamble(0.2, 50, 9) + '\n' +
            "5)  operation: "        +  operation(24, 15, 9) + '\n' +
            "6)  ctoa: "             +  ctoa('A') + '\n' +
            "7)  addUpTo: "          +  addUpTo(10) + '\n' +
            "8)  nextEdge: "         +  nextEdge(8, 10) + '\n' +
            "9)  sumOfCubes: "       +  sumOfCubes(new int[] {3, 4, 5}) + '\n' +
            "10) abcmath: "          +  abcmath(1, 2, 3) + '\n'
        );
    }
    void println(Object object) { System.out.println(object); }
    int remainder(int a, int b) { return a % b; }
    int triArea(int w, int h) { return w * h / 2; }
    int animals(int ch, int c, int p) { return 2 * ch + 4 * (c + p); }
    boolean profitableGamble(double prob, double prize, double pay) { return prob * prize > pay; }
    String operation(int n, int a, int b)
    {
        return
        a + b == n ? "added" :
        a - b == n ? "subtracted" :
        a / b == n ? "divided" :
        a * b == n ? "multiplied" :
        "none";
    }
    int ctoa(char c) { return c; }
    int addUpTo(int count) { int a = 0; while (count > 0) a += count--; return a; }
    int nextEdge(int a, int b) { return a + b - 1; }
    int sumOfCubes(int[] a) { int res = 0; for(int b : a) res += Math.pow(b,3); return res; }
    boolean abcmath(int a, int b, int c) { while (b-- > 0) a += a; return a % c == 0; }
}
