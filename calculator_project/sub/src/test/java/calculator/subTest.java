package calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class subTest 
{
    @Test
    public void subTest()
    {
        int result=sub.suboperation(1,2);
        assertEquals(-1,result);
    }
}
