package sintaxeAndLogic.estruturaSequencial;
//Prof - Ausberto S. Castro Vera
// UENF - CCT - LCMAT - Ciencia da computacao
//Aluno: Filipe Samuel Pires Dos Santos

public class QuadraticEquation {
        private double a;
        private double b;
        private double c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
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

        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }

        public double getRoot1() {
            double discriminant = getDiscriminant();
            if (discriminant < 0) {
                return 0;
            }
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        }

        public double getRoot2() {
            double discriminant = getDiscriminant();
            if (discriminant < 0) {
                return 0;
            }
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        }

        public static void main(String[] args) {
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.println("ALUNO: Filipe Samuel Pires Dos Santos");
            System.out.print("Enter whit coef  a, b, c: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();

            QuadraticEquation eq = new QuadraticEquation(a, b, c);
            double discriminant = eq.getDiscriminant();
            if (discriminant > 0) {
                System.out.println("The roots are " + eq.getRoot1() + " and " + eq.getRoot2());
            } else if (discriminant == 0) {
                System.out.println("The root is " + eq.getRoot1());
            } else {
                System.out.println("The equation has no roots.");
            }
        }

}
