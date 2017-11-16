package session.session04.classesAndObjects;

public class Man {
    {
        weight = 89;
    }

    static {
        skin = "white";
    }

    public static String skin;

    public String name = "Andrey";
    private int weight;
    int height;


    public Man(){
        //super();
        this("Valik", 70, 175);
    }

    public Man(String name, int weight, int height) {
       // this.name = "Kirill";
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public Man(int weight, String name, int height) {
        // this.name = "Kirill";
        this.name = name;
        this.weight = weight;
        this.height = height;
    }


    public int getNumber(){
        return 1;
    }
}
