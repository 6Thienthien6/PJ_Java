package TDD_Testing.BT.bt2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kiemtra {
    @Test
    @DisplayName("tam giác đều")
    public void TestTamGiacDeu() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam giác đều ";
        String result = TriangleClassifier.sideLength(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Tam giác cân")
        public void TestTamGiaccan() {
            int a = 2;
            int b = 2;
            int c = 3;
            String expected = "Tam giác cân ";
            String result = TriangleClassifier.sideLength(a, b, c);
            assertEquals(expected, result);
        }
            @Test
            @DisplayName("tam giác thường")
            public void TestTamGiacThuong(){
                int a = 3;
                int b = 4;
                int c = 5;
                String expected = "Tam giác thường ";
                String result =TriangleClassifier.sideLength(a, b, c);
                assertEquals(expected, result);



    }
}
