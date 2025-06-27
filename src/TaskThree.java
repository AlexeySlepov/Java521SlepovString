public class TaskThree {
//TODO: Напишите метод isPalindrome с помощью регулярных выражений и методов String.
// Можете пользоваться своими наработками, а можете создать с нуля и посмотреть, как вы выросли.
// Вызывать в главном методе, передавая строчку на проверку
// Выражения для проверки: «Madam, I'm Adam!», «Иди, Сеня, не сиди!»


    public static void isPalindrome(String string) {

        String original = string.replaceAll("[^a-zA-Zа-я-А-Я0-9]", "").toLowerCase();
        String modified = new StringBuilder(original).reverse().toString();

        //System.out.println(original);
        //System.out.println(modified);
        String palindrome = original.equals(modified) ? " - является палиндромом" : " - не является палиндромом";

        System.out.println(string + palindrome);
    }


    public static void main(String[] args) {
        String firstLine = "Madam, I'm Adam!";
        isPalindrome(firstLine);
        String secondLine = "Иди, Сеня, не сиди!";
        isPalindrome(secondLine);
    }
}
