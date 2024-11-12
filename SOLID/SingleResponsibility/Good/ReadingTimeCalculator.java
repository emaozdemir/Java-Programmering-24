package SingleResponsibility.Good;

class ReadingTimeCalculator {
    public int calculateReadingTime(Book book, int wordsPerMinute) {
        int wordCount = book.getContent().split("\\s+").length;
        return wordCount / wordsPerMinute;
    }
    
    public String getReadingTimeDescription(Book book, int wordsPerMinute) {
        int minutes = calculateReadingTime(book, wordsPerMinute);
        return String.format("This book will take approximately %d minutes to read.", minutes);
    }
}