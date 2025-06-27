public class TaskOne {
    //TODO: Напишите метод для переворота строки задом наперед с помощью массива символов.
    public static String revers(String string) {
        char[] array = string.toCharArray();

        for (int i = 0; i <= (array.length - 1) / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        return new String(array);
    }

    public static void main(String[] args) {
        String string = "Java TOP1";
        String newString = revers(string);
        System.out.println(newString);
    }
}
