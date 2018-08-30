import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;

public class HarryPotterBookTest {
    @Test
    public void oneBookReturnsTotalPriceWithNoDiscount() {

        String[] books = {"Book1"};
        Basket basket = new Basket(books);
        double totalPrice = basket.getTotalPrice();
//        assertEquals(8, totalPrice);
        assertThat(totalPrice, equalTo(8.00));

    }

    @Test
    public void twoCopiesOfOneBooksReturnsTotalPriceWithNoDiscount() {

        String[] books = {"Book1", "Book1"};
        Basket basket = new Basket(books);
        double totalPrice = basket.getTotalPrice();

//        assertEquals(15.20, totalPrice);  junit depricated for double double, use hamcrest assertThat
        assertThat(totalPrice, equalTo(16.00));

    }

    @Test
    public void twoCopiesOfDifferentBooksReturnsTotalPriceWithFivePercentDiscount() {

        String[] books = {"Book1", "Book2"};
        Basket basket = new Basket(books);
        double totalPrice = basket.getTotalPrice();

//        assertEquals(15.20, totalPrice);  junit depricated for double double, use hamcrest assertThat
        assertThat(totalPrice, equalTo(15.20));
    }

    @Test
    public void fiveCopiesOfDifferentBooksReturnsTotalPriceWithTwentyPercentDiscount() {

        String[] books = {"Book1", "Book2", "Book3", "Book4", "Book5"};
        Basket basket = new Basket(books);
        double totalPrice = basket.getTotalPrice();

//        assertEquals(15.20, totalPrice);  junit depricated for double double, use hamcrest assertThat
        assertThat(totalPrice, equalTo(30.00));
    }

    @Test
    public void fiveCopiesOfDifferentBooksPlusTwoTheSameReturnsTotalPriceWithTwentyPercentDiscountAndFullPriceForOneBook() {

        String[] books = {"Book1", "Book2", "Book3", "Book4", "Book5",
                "Book1", "Book2", "Book3" };
        Basket basket = new Basket(books);
        double totalPrice = basket.getTotalPrice();

//        assertEquals(15.20, totalPrice);  junit depricated for double double, use hamcrest assertThat
        assertThat(totalPrice, equalTo(51.60));
    }

//    @Test
//    public void null_returnsNull() {
//        ReverseString str = new ReverseString(null);
//
//        assertEquals(null, str.getStr());
//
//    }
//
//    @Test
//    public void stringJoe_returnsEoj_UsingStringBuilder() {
//        ReverseString str = new ReverseString("Joe");
//        str.reverseWithStringBuilder();
//        assertEquals("eoJ", str.getStr());
//
//    }
//
//    @Test
//    public void stringShamus_returns_sumahS_UsingStringBuilderReverseMethod() {
//        ReverseString str = new ReverseString("Shamus");
//        str.reverseWithStringBuilderReverse();
//        assertEquals("sumahS", str.getStr());
//
//    }
//
//    @Test
//    public void stringClare_returns_eralC_usingStaticMethod(){
//        assertEquals("eralC", ReverseString.reverseWithStaticMethod("Clare"));
//    }

}
