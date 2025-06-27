public class TaskFive {
//TODO: Напишите метод для замены всех чисел в строке на символ "X".
// Было: "There are 3 cats and 2 dogs in the yard."
// Стало: There are X cats and X dogs in the yard

    public static String replaceSymbol(String string, String symbol) {
      return string.replaceAll("\\d", symbol);
    }

    public static void main(String[] args) {
        String string = "There are 3 cats and 2 dogs in the yard";
        System.out.println(string);
        String newString = replaceSymbol(string,"X");
        System.out.println(newString);
    }
}
