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
    @Test
    public void Testfrominternet() {

        String[] books = {"Book1", "Book1", "Book1", "Book2", "Book2", "Book3", "Book3", "Book3",
                "Book3", "Book4", "Book4", "Book5" };
        Basket basket = new Basket(books);
        double totalPrice = basket.getTotalPrice();

//        assertEquals(15.20, totalPrice);  junit depricated for double double, use hamcrest assertThat
        assertThat(totalPrice, equalTo(78.80));
    }

//    @Test
//    public void testAddBook() {
//
//        Basket basket = new Basket();
//        basket.addBook("Book1");
////        assertEquals(1, basket.getBasket());
//
////        assertEquals(15.20, totalPrice);  junit depricated for double double, use hamcrest assertThat
//        assertThat(basket.getPrice(), equalTo(8));
//    }

    @Test
    public void anotherTestfrominternet() {

        String[] books = {"Book1", "Book1", "Book1", "Book1", "Book1", "Book1", "Book2", "Book2",
                "Book2", "Book2", "Book2", "Book2" };
        Basket basket = new Basket(books);
        double totalPrice = basket.getTotalPrice();

//        assertEquals(15.20, totalPrice);  junit depricated for double double, use hamcrest assertThat
        assertThat(totalPrice, equalTo(91.20));
    }


}
