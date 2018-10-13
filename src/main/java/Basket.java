

import java.util.*;

public class Basket {
    private String[][] books;
    private List<String> listOfBooks;
    private static final int BOOK_PRICE_PER_UNIT = 8;

    Basket(){
//        BasketlistOfBooks = new int[10][10];
//        listOfBooks = new ArrayList<>();
//        listOfBooks.add(new ArrayList<>());
    }

    Basket(String[] books) {
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < books.length; i++) {
            set.add(books[i]);
        }
        Arrays.sort(books);
        String prevBook = "";
        int duplicateCount = 0;
        int numBooks = 0;
        for (int i = 0; i < books.length; i++) {
            //new book

            if(!books[i].equals(prevBook)) {
                numBooks++;
                if(numBooks > duplicateCount){
                    duplicateCount = numBooks;
                }
                numBooks = 1;
                prevBook = books[i];
            } else {
               //same book
                numBooks++;
                prevBook = books[i];

            }
        }
        if(numBooks > duplicateCount){
            duplicateCount = numBooks;
        }
        this.books = new String[duplicateCount][set.size()];
        //sort books
        Arrays.sort(books);
        prevBook = "";
        int sameBook = 0;
        int newBook = 0;
        int up = -1;
        for(int i=0; i<books.length; i++) {
            //new book
            if(!books[i].equals(prevBook)) {
                sameBook = 0;
                this.books[sameBook][newBook++] = books[i];
                prevBook = books[i];
                up++;
            } else {
                //same
                this.books[++sameBook][up] = books[i];
                prevBook = books[i];
            }
        }
        System.out.println("this.books" + Arrays.deepToString(this.books));
    };


    public double getTotalPrice() {
        double totalPrice = 0.00;
        for (int i=0; i<this.books.length; i++) {
            int numBooks = 0;
            for(int x=0; x<this.books[i].length; x++ ) {
                if(this.books[i][x] != null) {
                    numBooks++;
                }
            }
            if (numBooks == 1) {totalPrice += BOOK_PRICE_PER_UNIT; }
            else if (numBooks == 2) {totalPrice += (numBooks * BOOK_PRICE_PER_UNIT) * .95; }
            else if (numBooks == 3) {totalPrice += (numBooks * BOOK_PRICE_PER_UNIT) * .90; }
            else if (numBooks == 4) {totalPrice += (numBooks * BOOK_PRICE_PER_UNIT) * .80; }
            else if (numBooks >= 5) {totalPrice += (numBooks * BOOK_PRICE_PER_UNIT) * .75; }

        }
        return totalPrice;

    }

    public void addBook(String book) {
        listOfBooks.add(book);
    }

//    public int getBasket() {
//        return basket;
//    }

//    public String getPrice() {
////        return price;
//    }
}
