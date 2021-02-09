public class Book {
    private String title;
    private String author;
    private String genre;
    private Boolean available;

    public Book(String title, String author, String genre, Boolean available){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getGenre(){
        return this.genre;
    }
}
