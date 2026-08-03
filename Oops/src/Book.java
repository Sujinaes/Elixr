public  abstract class Book {
    private int  bookId;
    private String  title;
    private  String author;

    public int getBookId() {
        return bookId;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public abstract void issueBook();
    public void displayBook(){
        System.out.println("Book_id : " + bookId);
        System.out.println("Author : " + author);
        System.out.println("Title : " + title);
    }
}
