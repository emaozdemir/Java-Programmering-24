package SingleResponsibility.Good;

class PriceCalculator {
    private static final double PRICE_PER_PAGE = 0.05;
    private static final double HARDCOVER_MULTIPLIER = 1.5;
    
    public double calculatePrice(Book book, boolean isHardcover) {
        double basePrice = book.getPages() * PRICE_PER_PAGE;
        return isHardcover ? basePrice * HARDCOVER_MULTIPLIER : basePrice;
    }
}