class EvenOddPrinter implements Runnable {
    private int maxNumber;
    private boolean isEven;

    public EvenOddPrinter(int maxNumber, boolean isEven) {
        this.maxNumber = maxNumber;
        this.isEven = isEven;
    }

    public void run() {
        int startNumber = isEven ? 2 : 1;

        for (int i = startNumber; i <= maxNumber; i += 2) {
            if (isEven) {
                System.out.println(Thread.currentThread().getName() + ": Even - " + i);
            } else {
                System.out.println(Thread.currentThread().getName() + ": Odd - " + i);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int maxNumber = 20;

        // Create two instances of the EvenOddPrinter, one for even numbers and one for odd numbers
        EvenOddPrinter evenPrinter = new EvenOddPrinter(maxNumber, true);
        EvenOddPrinter oddPrinter = new EvenOddPrinter(maxNumber, false);

        // Create two threads, one for even numbers and one for odd numbers
        Thread evenThread = new Thread(evenPrinter, "EvenThread");
        Thread oddThread = new Thread(oddPrinter, "OddThread");

        // Start both threads
        evenThread.start();
        oddThread.start();
    }
}
