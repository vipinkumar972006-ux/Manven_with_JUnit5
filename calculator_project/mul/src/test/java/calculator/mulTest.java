package calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class mulTest 
{
    @Test
    public void mulTest()
    {
        int result=mul.muloperation(1,2,3);
        assertEquals(6,result);
    }
}
