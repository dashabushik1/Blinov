/**
 * 9. Найти корни квадратного уравнения. Параметры уравнения передавать с командной строкой.
 */
package chapter2.variantA;

public class RootsOfQuadraticEquation {   // квадратное уравнение: ax2 + bx + c = 0

    public static void main(String[] args) {

        int[] value = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            value[i] = Integer.parseInt(args[i]);
        }

        double a = value[0];
        double b = value[1];
        double c = value[2];
        double root1, root2, root;

        double D = b * b - 4 * a * c;  // формула дискриминанта: D = b2 − 4ac

        if (D > 0) {  // если D > 0, есть два различных корня
            root1 = (-b - Math.sqrt(D)) / (2 * a);
            root2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("The equation has two roots: root1 = " + root1 + ", root2 = " + root2);
        } else if (D == 0) {  // если D = 0, есть один корень
            root = -b / (2 * a);
            System.out.println("The equation has only one root: root3 = " + root);
        } else {  //если D < 0, корней нет
            System.out.println("The equation has no real roots");
        }
    }
}


