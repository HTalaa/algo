package algo;

public class exo06 {
    public static void main(String[] args) {
       int A = 3, B = 9,E = 9;
       boolean C = false,D;
       D = !C;

        // 1. (A > 8)
        System.out.println(A > 8);
        //false
        //2. (B == 9)
        System.out.println(B == 9);
        //true
       // 3. (NON(A != 3))
        System.out.println(!(A != 3));
        //true
       //4. (NON(C))
        System.out.println(!(C));
        //true
        //  5. ((A < B) OU C)
        System.out.println((A < B) || C);
        //true
        //6. NON((A + B) != 12)
        System.out.println(!((A + B) != 12));
        //true
        //7. ((B == 5) OU ( (E > 10) ET (A < 8) ))
        System.out.println((B == 5) || ( (E > 10) && (A < 8) ));
        //false
        //8. ((((B == 5) OU ((E > 10) ET (A < 8))) OU (A < B) OU C) ET C)
        System.out.println((((B == 5) || ((E > 10) && (A < 8))) || (A < B) || C) && C);
        //false

        //9. A != 3
        System.out.println(A != 3);
        // false
        //10.  !(D) || C
        System.out.println(!(D) || C);
         // false

        // 11.  ((A + B) == 12) && D
        System.out.println( ((A + B) == 12) && D);
        //true
    }
}
