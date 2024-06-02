/**
 * Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке.
 * Если цифр нет, то возвращаемая сумма должна быть равна 0.
 */

package com.Ravil391.tasks.Number1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution1 {
    public static void main(String[] args) {
        // Строка
        String inputString = """
                123503524523fgdkgjfkgkf123Ddsfdgfdsdfdsvjfkgjdfg
                12356934524jjjdfsdfksdfhHGGFGDFJDSFDFJSIDFD.....123
                """; // Строка
        // Расчет суммы
        int result = getSum(inputString);
        assert (result == 24);
        System.out.println(result);         // Печать
    }

    private static int getSum(String string) {     // Расчета суммы 

        int sum = 0;
        Pattern pattern = Pattern.compile("\\d"); // Паттерн для поиска 
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) { // Проходим по каждой цифре
            sum += Integer.parseInt(matcher.group());
        }
        // Возвращаем сумму чисел
        return sum;
    }
}
