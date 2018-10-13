import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class HarryPotterBookTest2 {
    @Test
    public void oneBookReturnsTotalPriceWithNoDiscount() {
        Books books = new Books();
        books.add("Book1");
        double totalPrice = books.getTotalPrice();
        assertThat(totalPrice, equalTo(8.00));
    }

    @Test
    public void twoCopiesOfTheSameBookReturnsTotalPriceWithNoDiscount() {

        Books books = new Books();
        books.add("Book1");
        books.add("Book1");
        double totalPrice = books.getTotalPrice();
        assertThat(totalPrice, equalTo(16.00));

    }

    @Test
    public void twoCopiesOfDifferentBooksReturnsTotalPriceWithFivePercentDiscount() {

        Books books = new Books();
        books.add("Book1");
        books.add("Book2");
        double totalPrice = books.getTotalPrice();
        assertThat(totalPrice, equalTo(15.20));
    }

    @Test
    public void fiveCopiesOfDifferentBooksReturnsTotalPriceWithTwentyPercentDiscount() {

        Books books = new Books();
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
        books.add("Book4");
        books.add("Book5");
        double totalPrice = books.getTotalPrice();

        assertThat(totalPrice, equalTo(30.00));
    }

    @Test
    public void fiveCopiesOfDifferentBooksPlusTwoTheSameReturnsTotalPriceWithTwentyPercentDiscountAndFullPriceForOneBook() {

        Books books = new Books();
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
        books.add("Book4");
        books.add("Book5");
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
        double totalPrice = books.getTotalPrice();
        assertThat(totalPrice, equalTo(51.60));
    }

    @Test
    public void Testfrominternet() {

        Books books = new Books();
        books.add("Book1");
        books.add("Book1");
        books.add("Book1");
        books.add("Book2");
        books.add("Book2");
        books.add("Book3");
        books.add("Book3");
        books.add("Book3");
        books.add("Book3");
        books.add("Book4");
        books.add("Book4");
        books.add("Book5");
        double totalPrice = books.getTotalPrice();
        assertThat(totalPrice, equalTo(78.80));
    }

    @Test
    public void anotherTestfrominternet() {

//        String[] books = {"Book1", "Book1", "Book1", "Book1", "Book1", "Book1", "Book2", "Book2",
//                "Book2", "Book2", "Book2", "Book2" };
//        Basket basket = new Basket(books);
//        double totalPrice = basket.getTotalPrice();
        Books books = new Books();
        books.add("Book1");
        books.add("Book1");
        books.add("Book1");
        books.add("Book1");
        books.add("Book1");
        books.add("Book1");
        books.add("Book2");
        books.add("Book2");
        books.add("Book2");
        books.add("Book2");
        books.add("Book2");
        books.add("Book2");

        double totalPrice = books.getTotalPrice();

        assertThat(totalPrice, equalTo(91.20));
    }


}
