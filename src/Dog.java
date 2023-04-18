public class Dog {
    private String name;
    private String breed;
    private int speed;

    public Dog(String name, String breed, int speed) {
        this.name = name;
        this.breed = breed;
        this.speed = speed;
    }

    public void run(){
        for (int i = 0; i < speed; i++) {
            System.out.print("run! ");
        }
    }

    public String printInfo(){
        return "Dog: " + name + ", breed: " + breed + ", speed: " +speed;
    }
}
