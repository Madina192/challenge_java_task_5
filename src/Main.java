public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "Husky", 8);
        dog1.run();
        System.out.println();
        System.out.println(dog1.printInfo());

        System.out.println("----------------");
        Rect rectangle = new Rect();
        rectangle.setParameters(20, 15);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateSquare());
    }
}