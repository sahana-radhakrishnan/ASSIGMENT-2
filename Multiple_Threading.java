class Part1Download extends Thread {
    public void run() {
        try {
            System.out.println("Part 1 downloading...");
            Thread.sleep(2000); // Simulate download time
            System.out.println("Part 1 completed.");
        } catch (InterruptedException e) {
            System.out.println("Part 1 interrupted.");
        }
    }
}

class Part2Download extends Thread {
    public void run() {
        try {
            System.out.println("Part 2 downloading...");
            Thread.sleep(2000); // Simulate download time
            System.out.println("Part 2 completed.");
        } catch (InterruptedException e) {
            System.out.println("Part 2 interrupted.");
        }
    }
}

public class FileDownloadSimulation {
    public static void main(String[] args) {

        Part1Download t1 = new Part1Download();
        Part2Download t2 = new Part2Download();

        t1.start();   // Start downloading first half
        t2.start();   // Start downloading second half

        try {
            t1.join(); // Wait for part 1 to finish
            t2.join(); // Wait for part 2 to finish
        } catch (InterruptedException e) {
            System.out.println("Download interrupted.");
        }

        System.out.println("File download completed.");
    }
}
