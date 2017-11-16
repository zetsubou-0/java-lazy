package session.session04.classesAndObjects;

public class ClassesAndObjects {
   /*
    Класс - шаблон или образец, по которому будет создан объект.
    В одном java файле может содержаться только один публичный класс и любое количество классов пакетного(по умолчанию) уровня доступа

    Члены класса:
        1)Поля
        2)Методы
        3)Вложенные классы
        4)Вложенные интерфейсы
    Кроме членов класса в классе можно определить:
        1)Конструкторы
        2)Логические блоки {код}
        3)Статические блоки static{код}

Схема класса без наследования и реализации интерфейсов:

    [public] [final] [abstract] class ИмяКласса {
        {}логические блоки
        внутренние классы
        поля
                private // закрытые
                public // открытые
                package-private (по умолчанию)
                protected // защищенные
        конструкторы
                public // открытые
                package-private (по умолчанию)
                protected // защищенные
                private // закрытые
        методы
                public // открытые
                package-private (по умолчанию)
                protected // защищенные
                private // закрытые
    }

            Переменные:
    схема:
    [модификатор] Тип имя;

            Методы:
    схема:
    [доступ] [static] [abstract] [final] [synchronized] [native] [<параметризация>] ВозвращаемыйТип имяМетода(список параметров) [throws список исключений]

    Сигнатура метода : имя метода + параметры(порядок имеет значение)

            Конструкторы:
    Конструктор — особого вида метод, который по имени автоматически вызывается при создании экземпляра класса с помощью оператора new.
    Предназначение: инициализация полей класса
    схема:
    [модификатор доступа] имя класса(список параметров){ инициализация переменных }
    Конструктор не имеет возвращающего типа
    this(список параметров) - вызов другого конструктора, определенного в данном классе.
    super(список параметров) - вызов другого конструктора, определенного в родительском классе.

            Логические и статические блоки

    Логический блок
    {
        //do something
    }
    Статический блок
    static{
        //do something
    }
    используются чаще всего для инициализации полей(нестатических и статических соответственно)


        Создание экземпляра класса:
    Этапы:
    1) объявление  ссылки на объект
        String s;
    2) создание экземпляра объекта с помощью оператора new и выделение памяти
    3) Инициализация созданного объекта , сопровождаемая вызовом конструктора
        s = new String("hello");

        Обращение к переменным и методам класса:
    Обращение к переменным объекта:
        имя_объекта.имя_переменной;
            Пример:
        exampleClass.doubleNumber;
    Обращение к переменным класса(статическим) производится через имя класса:
        имя_класса.имя_статической_переменной;
            Пример:
        ExampleClass.CONSTANT_LINE;
    Обращение к методам:
        имя_объекта.имя_метода(параметры если требуются);
            Пример:
        exampleClass.getLine();
    */
   public static void main(String[] args) {
       ExampleClass exampleClass = new ExampleClass(5, "line", 4.8, "secondLine");
       Man man = new Man("Vadim", 74, 176);
       Man.skin = "black";
       Man man1 = new Man();

       System.out.println(man);
   }
}
