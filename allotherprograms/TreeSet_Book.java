package allotherprograms;

import java.util.*;

class Book implements Comparable<Book> {
    int id;
    String Name, Author, publisher;
    int qunti;

    public Book(int id, String Name, String Author, String Publisher, int qunti) {
        this.id = id;
        this.Name = Name;
        this.Author = Author;
        this.publisher = publisher;
        this.qunti = qunti;
    }

    @Override
    public int compareTo(Book b) {
        if (id > b.id) {
            return 1;
        } else if (id < b.id) {
            return -1;

        } else {
            return 0;
        }

    }


    public class TreeSet_Book {

        public static void main(String[] args) {
            TreeSet<Book> book = new TreeSet<Book>();
            Book b1 = new Book(123, "symonds", "A", "lisha", 9);
            Book b2 = new Book(13, "nds", "B", "li", 19);
            Book b3 = new Book(123, "ymonds", "C", "lsha", 80);

            book.add(b1);
            book.add(b2);
            book.add(b3);
            for (Book b : book) {
                System.out.println(b.id + "" + b.Name + "" + b.Author + " " + b.qunti + b.publisher);
            }
        }
    }
}
