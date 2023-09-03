package Algoritmus;

public class CharacterCount2 {

    //### Итеративный способ:

    public static int countOccurrencesIterative(String str, char targetChar) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == targetChar) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "hello world";
        char targetChar = 'l';
        int count = countOccurrencesIterative(input, targetChar);
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


