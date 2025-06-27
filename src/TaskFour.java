import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskFour {
//TODO: Напишите метод для проверки правильности формата даты в строке (например, "гггг-мм-дд")

    public static boolean checkFormat(String string){

        return string.matches("\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[01])");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дату:");
        String dareString = scan.nextLine();

        String format = checkFormat(dareString) ? "Верный" : "Не верный";
        System.out.println("Формат " + format);
    }
}
