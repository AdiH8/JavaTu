package Library;

public class Book {
    private int id;
    private String title;

    private String author;

    private int copies;

    public Book(int id,String title,String author, int copies){
        setId(id);
        setTitle(title);
        setAuthor(author);
        setCopies(copies);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
            this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public void displayBookInfo(){
        System.out.println("Id: "+ getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: "+ getAuthor());
        System.out.println("Copies: "+ getCopies()
        );
    }

}
