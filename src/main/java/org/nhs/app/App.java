public class App {
    public static void mystery3() {
       int foo = 3;
       for (int number = 0; foo > number; number += 2) {
          foo++;
          System.out.println(foo + " " + number + " ");
        }
    }
    
    public static void nestedForLoops() {
        for (int number = 1; number <= 5; number++) {
            for (int counter = 1; counter <= 4; counter++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }

    public static void practice1() {
        for (int number = 1; number <= 5; number++) {
           for (int counter = 1; counter <= number; counter++) {
              System.out.print(number);
           }
        System.out.println();
        }
     }
     
     public static void practice2() {
        for (int number = 1; number <= 5; number++) {
           int counter = 0;
           for (counter = 5 - number; counter > 0; counter--) {
              System.out.print(".");
           }
           for (int count = 1; count <= number; count++) {
              System.out.print(number);
           }
           System.out.println(" ");
        }
     }

    public static void practice3() {
        for (int i = 1; i <= 5; i++) {
            for (int count = 5; count > i; count--) {
                System.out.print(".");
            }
            System.out.print(i);

            for (int count2 = 1; count2 < i; count2++) {
                System.out.print(".");
            }
            System.out.println("");
        }
    }



     
    public static void main(String[] args) {
       mystery3();
       nestedForLoops();
       System.out.println(" ");
       practice1();
       System.out.println("");
       practice2();
       System.out.println("");
       practice3();
       
    }
}
