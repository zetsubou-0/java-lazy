package solution.andrei.javaKid;

public class FishMaster {
    public static void main(String[] args) {
        Fish myFish= new Fish(10);
        myFish.dive(20);
        myFish.dive(50);
        myFish.sleep();
        System.out.println(myFish.say("Привет"));
    }
}
