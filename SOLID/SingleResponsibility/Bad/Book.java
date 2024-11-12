package SingleResponsibility.Bad;

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
    

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    

    public String formatForPrinting() {
        return String.format("Title: %s\nAuthor: %s\nPages: %d\n\nContent:\n%s",
            title, author, pages, content);
    }
    
    public String formatForEReader() {
        return String.format("<book><title>%s</title><author>%s</author><pages>%d</pages><content>%s</content></book>",
            title, author, pages, content);
    }
    

    public int calculateReadingTime(int wordsPerMinute) {
        int wordCount = content.split("\\s+").length;
        return wordCount / wordsPerMinute;
    }
    

    public double calculatePrice(boolean isHardcover) {
        double basePrice = pages * 0.05; // 5 cents per page
        return isHardcover ? basePrice * 1.5 : basePrice;
    }
}
