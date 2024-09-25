import java.util.ArrayList;

public class Store {
    private  ArrayList<Book> books;
public Store(){
    this.books = new ArrayList<>();
}
 
public Book getBook(int index){
    Book book =new Book(books.get(index));
    return book;

}

public void setBook(int index, Book newBook){

    this.books.set(index, new Book(newBook));

}

public void addBook(Book newBook){
    this.books.add(new Book(newBook));

}

public void sellBook(String title){
    for (int i = 0; i < this.books.size(); i++) {
        if(this.books.get(i).getTitle().equals(title))
        {
            this.books.remove(i);
        }
        
    }
}

public boolean contains(Book book) {
    return this.books.contains(book);
}
public void printBooks() {
    // Printing the list of books
    System.out.println(books);
}


}
