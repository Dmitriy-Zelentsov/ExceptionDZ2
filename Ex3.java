import java.io.FileNotFoundException;

// 3) Дан следующий код, исправьте его там, где требуется
public class Ex3 {
    public static void main(String[] args) {
            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = { 1, 2 };
                abc[1] = 9;
            } 
            catch (NullPointerException ex) {
                System.out.println("Указатель не может указывать на null!");
                ex.printStackTrace();
            } 
            catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера!");
                ex.printStackTrace();
            }
            catch (Throwable ex) {
                System.out.println("Что-то пошло не так...");
                ex.printStackTrace();
            } 
         }

    public static void printSum (Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
         
 }
