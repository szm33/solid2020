package pl.zzpj2020.solid.srp.book.violation;

import java.util.Map;

public class Printer {
    private Book book;

    public Printer(Book book) {
        this.book = book;
    }

    /**
     * Prints the current page.
     */
    public void printCurrentPage() {

        System.out.println(book.getCurrentPageContents());
    }

    /**
     * Prints all pages
     *
     * @return
     */
    public String printAllPages() {

        String allPages = new String();
        for(Map.Entry<Integer, String> page : book.getPages()){
            allPages += (page.getKey() + " " + page.getValue());
        }
        return allPages;
    }
}
