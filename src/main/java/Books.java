import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<Integer> booklist;

    public Books() {
        booklist = new ArrayList<>();
    }

    public void add(String book) {
        Integer count = 0;
        if(book == "Book1") {
            try {
                booklist.set(0, booklist.get(0) + 1);
            } catch (IndexOutOfBoundsException e) {
                booklist.add(0, 1);
            }
        } else if(book == "Book2") {
            try {
                booklist.set(1, booklist.get(1) + 1);
            } catch (IndexOutOfBoundsException e) {
                booklist.add(1, 1);
            }
        } else if(book == "Book3") {
            try {
                booklist.set(2, booklist.get(2) + 1);
            } catch (IndexOutOfBoundsException e) {
                booklist.add(2, 1);
            }
        } else if(book == "Book4") {
            try {
                booklist.set(3, booklist.get(3) + 1);
            } catch (IndexOutOfBoundsException e) {
                booklist.add(3, 1);
            }
        } else if(book == "Book5") {
            try {
                booklist.set(4, booklist.get(4) + 1);
            } catch (IndexOutOfBoundsException e) {
                booklist.add(4, 1);
            }
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        while(booklist.size() > 0) {
            //remove any books with zero counts
            List<Integer> finalBooks = removeZeroCountBooks(booklist);

            //get discount percent
            double discountPercent = getDiscount(finalBooks.size());

            //calculate total price
            totalPrice += calculateTotalPrice(finalBooks, discountPercent);
        }
        return totalPrice;
    }

    private double calculateTotalPrice(List<Integer> books, double discount){
        for (int i=0; i<books.size(); i++){
            if(booklist.get(i) > 0) {
                booklist.set(i,books.get(i) -1);
            } else {
                booklist.remove(i);
                break;
            }
        }
        return (8 * books.size()) * discount;
    }

    private List<Integer> removeZeroCountBooks(List<Integer> books) {

        int size = books.size();
        while (size > 0) {
            for (int i=0; i<books.size(); i++){
                if(books.get(i) == 0) {
                    books.remove(i);
                    break;
                }
            }
            size--;
        }
        return books;
    }

    private double getDiscount(int size) {

        if (size == 2) {
            return .95;
        } else if (size == 3) {
            return .90;
        } else if (size == 4) {
            return .80;
        } else if (size >= 5) {
            return .75;
        } else {
            return 1;
        }
    }
}
