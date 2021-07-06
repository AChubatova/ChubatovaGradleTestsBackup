package my;

//import junit.framework.TestCase;
//import org.junit.Assert;
//import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class mytest {

    @Test
    public void foo1() {
        if (System.currentTimeMillis()%3==1){
        }
        else {
            assertEquals(2, 1);
        };

    };
    @Test
    public void foo2() {
        if (System.currentTimeMillis()%3==1){
        }
        else {
            assertEquals(2, 1);
        };

    };
    @Test
    public void foo3() {
        if (System.currentTimeMillis()%3==1){
        }
        else {
            assertEquals(2, 1);
        };

    };

}
