package tdd_testing.bt.bt3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzz {
    @Test
    @DisplayName("đọc số")
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0||number / 10 ==3 || number % 10 ==3 ;
        boolean isBuzz = number % 5 == 0|| number / 10 ==5 || number % 10 ==5;
        if (isFizz && isBuzz)
            return "FizzBuzz";
        if (isFizz)
            return "Fizz";
        if (isBuzz)
            return "Buzz";
        return readNumberSmaller100(number);
    }
    @Test
    @DisplayName("đọc số 10")
    public static String readNumberSmaller100(int number) {
        boolean isNUmSmaller10 = number < 10;
        boolean is10 = number == 10;
        boolean isNumDivision10AndBigger10 = number % 10 == 0 && number != 10;
        boolean isNum11To19 = number > 10 && number < 20 ;
        if (isNUmSmaller10)
            return readNumSmaller10(number);
        if(is10)
            return "mười" ;
        if(isNum11To19)
            return "mười " + readNumSmaller10(number%10) ;
        if (isNumDivision10AndBigger10)
            return readNumSmaller10(number / 10) + " mươi";
        return readNumSmaller10(number / 10) +" muoi  "+ readNumSmaller10(number);
    }
    @Test
    @DisplayName("đọc số từ 1 - 9")
    private static String readNumSmaller10(int number) {
        String str ="" ;
        switch (number) {
            case 1:
                str = "một";
                break;
            case 2:
                str = "hai";
                break;
            case 3:
                str = "ba";
                break;
            case 4:
                str = "bốn";
                break;
            case 5:
                str = "năm";
                break;
            case 6:
                str = "sáu";
                break;
            case 7:
                str = "bảy";
                break;
            case 8:
                str = "tám";
                break;
            case 9:
                str = "chín";
                break;
        }
        return str ;
    }
}
