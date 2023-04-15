// 2) Если необходимо, исправьте данный код
public class Ex2 {
    public static void main(String[] args) {
        try {
            int d = 2;
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Перехват исключения: " + e);
         }
    }
}
