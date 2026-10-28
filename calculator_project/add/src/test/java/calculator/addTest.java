package calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class addTest 
{
    @Test
   void addTest()
   {
        add a=new add();
        int result=a.addoperation(1,5,6,8);
        assertEquals(20,result);
   }
}
