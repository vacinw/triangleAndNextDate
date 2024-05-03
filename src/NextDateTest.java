import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class NextDateTest {
    @Test
    public void testThangCo31Ngay(){
        assertEquals("2024/4/23", NextDate.nextDate(2024, 3, 22));
    }

    @Test
    public void testThangCo30Ngay(){
        assertEquals("2024/4/23", NextDate.nextDate(2024, 4, 22));
    }

    @Test
    public void testThang2_2(){
        assertEquals("2024/2/29", NextDate.nextDate(2024, 2, 28));
    }

    @Test
    public void test3(){
        assertEquals("2024/3/1", NextDate.nextDate(2024, 2, 29));
    }

    @Test
    public void test4(){
        assertEquals("2024/4/1", NextDate.nextDate(2024, 3, 31));
    }

    @Test
    public void test5(){
        assertEquals("2025/1/1", NextDate.nextDate(2024, 12, 31));
    }
}
