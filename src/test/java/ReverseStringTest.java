import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void emptyString_returnsEmptyString() {
        ReverseString str = new ReverseString("");

        assertEquals("", str.getStr());

    }

    @Test
    public void null_returnsNull() {
        ReverseString str = new ReverseString(null);

        assertEquals(null, str.getStr());

    }

    @Test
    public void stringJoe_returnsEoj_UsingStringBuilder() {
        ReverseString str = new ReverseString("Joe");
        str.reverseWithStringBuilder();
        assertEquals("eoJ", str.getStr());

    }

    @Test
    public void stringJoe_returnsEoj_UsingStringBuilderReverseMethod() {
        ReverseString str = new ReverseString("Shamus");
        str.reverseWithStringBuilderReverse();
        assertEquals("sumahS", str.getStr());

    }

}
