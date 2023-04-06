package chapter12.variantA.task1;

import java.util.concurrent.locks.ReentrantLock;

public class ReadingRoom implements Room {
    ReentrantLock lock = new ReentrantLock();
    private int readersInRoom = 0;

    public void enter(Reader reader) {
        lock.lock();
        int maxReadersInRoom = 4;
        while (readersInRoom >= maxReadersInRoom) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        readersInRoom++;
        reader.setLocation("reading room");
        System.out.println("Reader " + reader.getName() + " entered to reading room");
        System.out.println("Readers in reading room: " + readersInRoom);
    }

    public void leave(Reader reader) {
        lock.lock();
        int minReadersInRoom = 0;
        while (readersInRoom <= minReadersInRoom) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        readersInRoom--;
        reader.setLocation("building");
        System.out.println("Reader " + reader.getName() + " leaved reading room");
        System.out.println("Readers in reading room: " + readersInRoom);
    }
}