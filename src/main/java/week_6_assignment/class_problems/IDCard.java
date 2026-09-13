class IDCard {

    String name;
    int booksIssued;

    public IDCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {

        IDCard card1 = new IDCard("Ravi", 2);

        IDCard card2 = card1;

        card2.booksIssued = 5;

        System.out.println("Books issued through card1: " + card1.booksIssued);

        System.out.println("card1 == card2: " + (card1 == card2));

        IDCard card3 = new IDCard("Ravi", 5);

        System.out.println("card1 == card3: " + (card1 == card3));
    }
}
