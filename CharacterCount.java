package Algoritmus;

public class CharacterCount {
//    Рекурсивный способ:

    public static int countOccurrencesRecursive(String str, char targetChar) {
        return countOccurrencesRecursiveHelper(str, targetChar, 0);
    }

    private static int countOccurrencesRecursiveHelper(String str, char targetChar, int index) {
        if (index == str.length()) {
            return 0;
        }

        int count = (str.charAt(index) == targetChar) ? 1 : 0;
        return count + countOccurrencesRecursiveHelper(str, targetChar, index + 1);
    }

    public static void main(String[] args) {
        String input = "hello world";
        char targetChar = 'l';
        int count = countOccurrencesRecursive(input, targetChar);
        System.out.println("Количество вхождений символа '" + targetChar + "': " + count);
    }
}
/*
Подсчет количества вхождений символа в строку (рекурсивно и итеративно)
Напишите рекурсивную функцию, которая принимает строку и символ, а затем возвращает количество вхождений этого символа в строку.
Например:“hello world”, “l” -> 3





ИЛИ


Ханойская башня (рекурсивно и итеративно)
Задача заключается в следующем. Имеется три стержня — левый, средний и правый.
На левом стержне находятся n дисков, диаметры которых различны.
Диски упорядочены по размеру диаметра, сверху лежит наименьший, снизу — наибольший.
Требуется перенести диски с левого стержня на правый, используя средний стержень как вспомогательный.
Головоломка имеет следующие два правила:
      1. Вы не можете поместить больший диск на меньший диск.
      2. За один раз можно перемещать только один диск.

 */


