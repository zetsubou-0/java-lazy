package solution.andrei;
/*
1. Создать класс Машина с полями марка, год выпуска, пробег (подумать какой лучше модификатор доступа сделать)

2. Определить 3 конструктора вызывающих друг друга:
    1-й без параметров, создающий новый авто с маркой по умолчанию(любую марку поставить)
    2-й с одним параметром: марка авто
    3-й с тремя параметрами

3. Создать для всех переменных геттеры и сеттеры

4. Переопределить метод toString() в котором отоброжать все характеристики авто

5. Создать статическую переменную класса "Минимальный год выпуска" и инициализировать её в статическом блоке

6. Создать метод который выводит в консоль "машина старая", если год выпуска меньше
 "Минимального год выпуска"(статической переменной из 5-го пункта), иначе "нормальная машина"

7. Создать класс Магазин Автомобилей у которого в методе main создать 7 авто разных видов(используя разные конструкторы)
,вывести объект в консоль, вызвать у каждого авто после создания метод из 6-го пункта

P.S для выполнения задания лучше создать пакет task04 в своём пакете с решениями
 */
public class Car {

    public String mark;
    public int year;
    public int mileage;

public Car() {
    mark = "citroen";
}
public Car(String mark){
    this.mark = mark;
}
public Car(String mark, int year, int mileage){
    this.mark = mark;
    this.year = year;
    this.mileage = mileage;
}
public String getMark(){
    return mark;
}
public void setMark(String mark){
    this.mark = mark;
}
public int year(){
    return year;
}
public void setYear(int year){
    this.year = year;
}
public int getMileage(){
    return mileage;
}
public void setMileage(int mileage){
    this.mileage = mileage;
}
}
