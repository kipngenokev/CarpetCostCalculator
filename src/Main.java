public class Main {
    public static void main(String[] args) {
        Carpet carpet =new Carpet(1.5);
        Floor floor = new Floor(5.4,4.5);
        System.out.println(carpet.getCost());
        System.out.println(floor.getArea());
        Calculator calculator=new Calculator(floor,carpet);
        System.out.println(calculator.getTotalCost());
    }
}