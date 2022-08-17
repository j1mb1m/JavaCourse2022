package by.itacademy.hw6;

import java.util.Scanner;

/*3. Поменяйте местами первое самое длинное слово с последним самым коротким.*/
public class Task3 {

    public static void main(String[] args) {
        test();
    }

    public static void test() {

        String str = "day and night";
        System.out.println("Original: " + str);
        System.out.println("Modified: " + swapFirstBigAndLastSmallWord(str));

        String str1 = "It is me";
        System.out.println("Original: " + str1);
        System.out.println("Modified: " + swapFirstBigAndLastSmallWord(str1));

        String str2 = "It is just me";
        System.out.println("Original: " + str2);
        System.out.println("Modified: " + swapFirstBigAndLastSmallWord(str2));

        String str3 = enterFromScanner();
        System.out.println("Original: " + str3);
        System.out.println("Modified: " + swapFirstBigAndLastSmallWord(str3));

    }

    public static String getFirstBigWord(String str) {

        String[] arrayStrings = str.replaceAll("\\W+", " ").split(" ");
        StringBuilder stringBuilder = new StringBuilder(); //поместим все найденные цифровые слова с максимальным количеством цифр, чтобы сделать один проход

        int maxLength = 0;

        for (String string :
                arrayStrings) {
            if (string.length() > maxLength) {
                stringBuilder.delete(0, stringBuilder.length());
                stringBuilder.append(string).append(" ");
                maxLength = string.length();
            }
        }

        return stringBuilder.toString().trim();
    }

    public static String getLastSmallWord(String str) {

        String[] arrayStrings = str.replaceAll("\\W+", " ").split(" ");
        StringBuilder stringBuilder = new StringBuilder(); //поместим все найденные цифровые слова с максимальным количеством цифр, чтобы сделать один проход

        int minLength = arrayStrings[0].length();

        for (String string :
                arrayStrings) {
            if (string.length() <= minLength) {
                stringBuilder.delete(0, stringBuilder.length());
                stringBuilder.append(string).append(" ");
                minLength = string.length();
            }
        }

        return stringBuilder.toString().trim();
    }

    public static String swapFirstBigAndLastSmallWord(String str) {
        String firstWord = getFirstBigWord(str);
        String lastWord = getLastSmallWord(str);

        //если слова равны, то ничего не делаем
        if (firstWord.equals(lastWord)) return str;

        int indexFirstWord = str.indexOf(firstWord);
        int indexLastWord = str.lastIndexOf(lastWord);

        // заменим первое самое длинное слово последним самым коротким
        String newString = str.replaceFirst(firstWord, lastWord);

        // сдвинем индекс, если размеры слов разные и короткое следует за длинным
        if (indexFirstWord < indexLastWord) {
            indexLastWord += lastWord.length() - firstWord.length();
        }
        //получим длину новой строки после первой замены
        int newStringLength = newString.length();
        //выполним замену последнего самого короткого слова первым самым длинным в подстроке, начинающейся с короткого слова
        newString = newString.substring(0, indexLastWord).concat(newString.substring(indexLastWord, newStringLength).replaceFirst(lastWord, firstWord));

        return newString;
    }

    public static String enterFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text: ");

        return scanner.nextLine();
    }
}
