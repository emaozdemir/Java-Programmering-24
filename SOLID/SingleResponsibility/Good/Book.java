package SingleResponsibility.Good;

class Book {
    private String title;
    private String author;
    private int pages;
    private String content;
    
    public Book(String title, String author, int pages, String content) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.content = content;
    }
    
    // Simple getters for book data
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }
    public String getContent() { return content; }
}