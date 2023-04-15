import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

// 1) Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//  и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
//  вместо этого, необходимо повторно запросить у пользователя ввод данных.
/**
 * Ex1
 */
public class Ex1 {

    public static void main(String[] args) {
        boolean Error = true;
        do{
            try {
                returnFloat();
                Error = false;
            } 
            catch (InputMismatchException e) {
                System.out.println("Вы ввели не дробное число!!!");
            }
        }
        while (Error);
    }
        
    public static void returnFloat() {  
        System.out.println("Введите дробное число: ");
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        System.out.println(number);
    }
}