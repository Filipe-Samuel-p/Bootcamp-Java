package sintaxeAndLogic.estruturaSequencial;

public class LinearEquation {
        private double a;
        private double b;
        private double c;
        private double d;
        private double e;
        private double f;

        public LinearEquation(double a, double b, double c, double d, double e, double f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getD() {
            return d;
        }

        public double getE() {
            return e;
        }

        public double getF() {
            return f;
        }

        public boolean isSolvable() {
            return a * d - b * c != 0;
        }

        public double getX() {
            if (!isSolvable()) {
                throw new ArithmeticException("The equation has no solution.");
            }
            return (e * d - b * f) / (a * d - b * c);
        }

        public double getY() {
            if (!isSolvable()) {
                throw new ArithmeticException("The equation has no solution.");
            }
            return (a * f - e * c) / (a * d - b * c);
        }

        public static void main(String[] args) {
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("Enter a, b, c, d, e, f: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double d = input.nextDouble();
            double e = input.nextDouble();
            double f = input.nextDouble();

            LinearEquation eq = new LinearEquation(a, b, c, d, e, f);
            if (eq.isSolvable()) {
                System.out.println("x is " + eq.getX() + " and y is " + eq.getY());
            } else {
                System.out.println("The equation has no solution.");
            }
        }
}
