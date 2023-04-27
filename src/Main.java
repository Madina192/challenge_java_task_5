public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "Husky", 8);
        dog1.run();
        System.out.println();
        System.out.println(dog1.printInfo());

        System.out.println("TASK 6 ----------------");
        Rect rectangle = new Rect();
        rectangle.setParameters(20, 15);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateSquare());

        System.out.println("TASK 7 ------------------");
        Employee employee = new Employee("Madina", "android developer", 1200);
        System.out.println(employee.printInfo(3));
    }
}