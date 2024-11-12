package SingleResponsibility.Good;

class BookFormatter {
    public String formatForPrinting(Book book) {
        return String.format("Title: %s\nAuthor: %s\nPages: %d\n\nContent:\n%s",
            book.getTitle(), book.getAuthor(), book.getPages(), book.getContent());
    }
    
    public String formatForEReader(Book book) {
        return String.format("<book><title>%s</title><author>%s</author><pages>%d</pages><content>%s</content></book>",
            book.getTitle(), book.getAuthor(), book.getPages(), book.getContent());
    }
}