public class App {

    public static void quadraticFormula(double a, double b, double c) {
        if ((Math.pow(b, 2)) - (4 * a * c) < 0) {
            System.out.println("Error:solution is an imaginary number");
            return;
        }

        double x1 = (-b + Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);
        double x2 = (-b - Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);

        System.out.println("First Root = " + x1);
        System.out.println("Second Root = " + x2);

        // printout the solution according to the hw problem


    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        quadraticFormula(1, -7, 12);
        quadraticFormula(1, 3, 2);
        quadraticFormula(5, 0, 12);
    }
}
