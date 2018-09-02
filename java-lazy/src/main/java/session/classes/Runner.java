package session.classes;

import session.classes.impl.NewsPaperDataProvider;

public class Runner {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        System.out.println("Age: " + cat.age);
//        System.out.println("Name: " + cat.name);
//        System.out.println(cat.getCatEyeColors());
////        Cat.CatEye catEye = cat.new CatEye("red");
//        Cat.CatEye catEye = new Cat.CatEye("red");
//
//        Cat fatCat = new FatCat();
//        System.out.println(fatCat.getCatEyeColors());
//
//        CatProvider provider = new FatCatProvider();
//        Cat cat2 = provider.createCat(true, new Cat.CatEye("yellow"), new Cat.CatEye("green"));
//        System.out.println(cat2);

//        Neko neko = new Neko();
//        Neko neko2 = new Neko();
//
//        System.out.println(neko.word_2);    // nya 2                    nya 2
//        System.out.println(neko2.word_2);   // nya 2                    nya 2
//
//        neko.word_2 = "new nya";
//        System.out.println(neko.word_2);    // new nya                  new nya
//        System.out.println(neko2.word_2);   // new nya                  new nya
//
//        System.out.println(Neko.word);      // nya                      nya
//        System.out.println(Neko.word);     // nya                      nya
//
//        Neko.word = "new nya static";
//        System.out.println(Neko.word);      // new nya static           new nya static
//        System.out.println(Neko.word);     // new nya static           nya

//        Human vadim = new Human();
//        vadim.age = 29;
//
//        Human kiryl = new Human();
//        kiryl.age = 30;
//
//        System.out.println(vadim);
//        System.out.println(kiryl);
//
//        Human.averageAge = 98;
//
//        System.out.println(vadim);
//        System.out.println(kiryl);
//
//        Cat lazyCat = new Cat();
//        Neko neko = new Neko(lazyCat);
//        neko.sayNya();

//        NewsPaper newsPaper = new NewsPaper("Pravda", new Data());
//        System.out.println(newsPaper.getName());

        DataProvider newsPaperDataProvider = new NewsPaperDataProvider();
        Data dataPravda = new Data();
        dataPravda.data = "Pravda text";
        Data dataCat = new Data();
        dataCat.data = "Nya nyanyan";

        newsPaperDataProvider.save("Pravda", dataPravda);
        newsPaperDataProvider.save("Cat newspaper", dataCat);
        newsPaperDataProvider.save("Cat newspaper", dataCat);
        newsPaperDataProvider.save("Cat newspaper", dataCat);
        newsPaperDataProvider.save("Cat newspaper", dataCat);
        newsPaperDataProvider.save("Cat newspaper", dataCat);
        newsPaperDataProvider.save("Cat newspaper", dataCat);
        newsPaperDataProvider.save("Cat newspaper", dataCat);
        newsPaperDataProvider.save("Cat newspaper", dataCat);
        newsPaperDataProvider.save("Cat newspaper", dataCat);
        newsPaperDataProvider.save("Cat newspaper", dataCat);
        newsPaperDataProvider.save("Pravda 2", dataPravda);

        System.out.println(newsPaperDataProvider.read("Cat newspaper"));
        System.out.println(newsPaperDataProvider.read("Trud"));
        System.out.println(newsPaperDataProvider.read("Pravda"));
        System.out.println(newsPaperDataProvider.read("Pravda 2"));
    }
}
