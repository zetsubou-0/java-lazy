package solution.sergei;
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
    public static void main(){
        double i = 12.5;                                                    // 1
        System.out.println(procent(i));                                     //

        int a = 13;                                                         // 2
        System.out.println(positive(a));                                    //

        long b = 14;                                                        // 3
        System.out.println(negative(b));                                               //
    }



    private static double procent(double i){                                // 1
        return i/100;                                                       //
    }                                                                       //

    private  static boolean positive(int a){                                // 2
        if (a>=0)                                                           //
            {                                                               //
                return true;                                                //
            }                                                               //
        else                                                                //
            {                                                               //
                return false;                                               //
            }                                                               //
    }                                                                       //

    private static String negative(long b){                                 // 3
        if (b>0){                                                           //
            return "positive";                                              //
        }                                                                   //
        else{                                                               //
            return "negative";                                              //
        }                                                                   //
    }                                                                       //


}
