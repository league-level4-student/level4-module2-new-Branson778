package _06_Console_Store;

public abstract class NonFood {
    String item;
    protected double price;
    protected int pieceCount;
    public abstract double getPrice();
    public abstract int getTotalPieceCount();
}
