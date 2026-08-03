public class FictionBook extends Book {
    private String  genre ;

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
    @Override
    public void issueBook(){
        System.out.println(" Fiction book Issued book succesfully");
    }
    public void displayFictionbook(){
        displayBook();
        System.out.println("Genre : " + genre);

    }
}
