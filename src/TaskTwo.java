import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    //TODO: Напишите метод для проверки areAnagrams, принимающего 2 строки,
    // являются ли они анаграммами (имеют одни и те же символы в разном порядке).

    public static void searchAnagram(String firstString, String secondString) {
        char[] firstArray = firstString.replace(" ", "").toLowerCase().toCharArray();
        char[] secondArray = secondString.replace(" ", "").toLowerCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        boolean isAnagram = Arrays.equals(firstArray, secondArray);
        System.out.println("Являются ли две строки анаграммами? - " + isAnagram);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String firstStr = scan.nextLine();
        System.out.println("Введите вторую строку");
        String secondStr = scan.nextLine();

        searchAnagram(firstStr, secondStr);
    }
}
