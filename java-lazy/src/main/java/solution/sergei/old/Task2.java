package solution.sergei.old;
/*
Все методы, которые вы будите создавать должны быть private static

1. Реализовать метод, котовый возвращалет дробное представление процентов
Например:
Если входным чслом будет 12.5 (т.е. 12.5%), то вернуться должно 0.125

2. Реализовать метод, который принимает число типа int и возвращает -
true, если число положительное
false - в остальных случаях
0 - считать положительным

3. Реализовать метод, который принимает число типа long и возвращает текст -
"positive", если число положительное
"negative", если отрицательное
"zero" - если 0

4. Реализовать похожий метод, как в пункте 3, но на вход принимется переменная типо int. Внутри тела метода не использовать if, if-else или тернарный оператор.

5. Реализовать метод, используя цикл, который былет выводить цифры в промужутке от start до stop

6. Реализовать метод который выводит все элементы массива типа double

7. Реализовать метод который выводит все нечетные элементы массива или отрицательные.

8. Реализовать метод, который находит сумму всех элементов массива и возвращает ее.

9. Реализовать метод, который находит произвведени всех элементов массива и возвращает его.

10. Реализовать метод, который выводит все элементы цилочисленного массива. При этом в консоле должно выводится не само число, а его квадрат. Реализовать, использую цикл for.

11. Аналогично подзадаче №9, но через цикл 'for-each' и не квадрат, а куб числа.
*/
public class Task2 {
    public static void main(String[] args) {



        double i = 12.5;                                                                            // 1
        System.out.println(procent(i));                                                             //

        int a = 13;                                                                                 // 2
        System.out.println(positive(a));                                                            //

        long b = 14;                                                                                // 3
        System.out.println(negative(b));                                                            //

        int c = 15;                                                                                 // 4
        System.out.println((c > 0) ? "positive" : ((c<0) ? "negative": "zero"));                    //

        array (-10, 4);                                                                      // 5

        double[] mass1 = new double[4];                                                             // 6
        mass1[0] = 5.0;                                                                             //
        mass1[1] = 3.2;                                                                             //
        mass1[2] = 0.3;                                                                             //
        mass1[3] = -1.2;                                                                            //
        conclusion(mass1);                                                                          //

        int[] mass2 = new int[5];                                                                   // 7
        mass2[0] = 3;                                                                               //
        mass2[1] = 2;                                                                               //
        mass2[2] = 1;                                                                               //
        mass2[3] = -1;                                                                              //
        mass2[4] = -5;                                                                              //
        conclusion2(mass2);                                                                         //

        int[] mass3 = new int[5];                                                                   // 8
        mass2[0] = 3;                                                                               //
        mass2[1] = 2;                                                                               //
        mass2[2] = 1;                                                                               //
        mass2[3] = -1;                                                                              //
        mass2[4] = -5;                                                                              //
        summ(mass3);                                                                                //

        multiplication(mass3);                                                                      // 9

        multiplication2(mass3);                                                                     // 10

        multiplication3(mass3);                                                                     // 11
    }


    private static double procent(double i){                                                        // 1
        return i/100;                                                                               //
    }                                                                                               //

    private  static boolean positive(int a){                                                        // 2
        if (a>=0)                                                                                   //
            {                                                                                       //
                return true;                                                                        //
            }                                                                                       //
        else                                                                                        //
            {                                                                                       //
                return false;                                                                       //
            }                                                                                       //
    }                                                                                               //

    private static String negative(long b){                                                         // 3
        if (b>0){                                                                                   //
            return "positive";                                                                      //
        }                                                                                           //
        else                                                                                        //
            if(b<0){                                                                                //
            return "negative";                                                                      //
        }                                                                                           //
        else                                                                                        //
            return "zero";                                                                          //
    }                                                                                               //

    private static void array(int d, int e){                                                        // 5
        System.out.println("start");                                                                //
        if (d<e){                                                                                   //
            while (d<e){                                                                            //
                System.out.println(d + " ");                                                        //
                d++;                                                                                //
            }                                                                                       //
        }                                                                                           //
        else{                                                                                       //
            while (d>e){                                                                            //
                System.out.println(d + " ");                                                        //
                d--;                                                                                //
            }                                                                                       //
        }                                                                                           //
        System.out.println("stop");                                                                 //
    }                                                                                               //

    private static void conclusion(double[] mass1) {                                                // 6
        for (int i = 0; i < mass1.length; i++){                                                     //
            System.out.println(mass1[i] + " ");                                                     //
        }                                                                                           //
    }                                                                                               //

    private static void conclusion2(int[] mass2) {                                                  // 7
        for (int i = 0; i < mass2.length; i++){                                                     //
            if (mass2[i]%2 !=0){                                                                    //
                System.out.println(mass2[i] + " ");                                                 //
            }                                                                                       //
            if (mass2[i]<0){                                                                        //
                System.out.println(mass2[i] + " ");                                                 //
            }                                                                                       //
        }                                                                                           //
    }                                                                                               //

    private static int summ(int [] mass3) {                                                         // 8
        int f = 0;                                                                                  //
        for (int i = 0; i < mass3.length; i++){                                                     //
            f += mass3[i];                                                                          //
        }                                                                                           //
        System.out.println("Сумма всех элементов массива равна: " + f);                             //
        return f;                                                                                   //
    }                                                                                               //

    private static int multiplication(int[] mass3){                                                 // 9
        int f = 0;                                                                                  //
        for (int i = 0; i< mass3.length; i++){                                                      //
            f *= mass3[i];                                                                          //
        }                                                                                           //
        System.out.println("Произведение всех элементов массива равна: " + f);                   //
        return f;                                                                                   //
    }                                                                                               //

    private static void multiplication2(int[] mass3){                                               // 10
        for (int i = 0; i< mass3.length; i++){                                                      //
            int f = mass3[i];                                                                       //
            System.out.println(f*f);
        }                                                                                           //
    }                                                                                               //

    private static void multiplication3(int[] mass3){                                               // 11
        for (int g : mass3){                                                                        //
            System.out.println(g*g*g);                                                             //
        }                                                                                           //
    }                                                                                               //

}

