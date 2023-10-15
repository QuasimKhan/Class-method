public class ClassMethod {
    public void fullThroatal() {
        System.out.println("The car is in full throatal");
    }

    public void maxSpeed(int x) {
        System.out.println("The full speed of the car is : " + x + " KM/h");
    }

    public static void main(String[] args) {
        ClassMethod car = new ClassMethod();
        car.fullThroatal();
        car.maxSpeed(200);
    }
}
