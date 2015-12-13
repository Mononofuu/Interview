package mononofuu.tk;

/**
 * created by Alekseichenko Sergey <mononofuu@gmail.com>
 */
public class Staircase {
    static void print(int N) {
        StringBuilder s = new StringBuilder(String.format("%1$" + N + "s", ""));
        for (int i = N - 1; i >= 0; i--) {
            s.setCharAt(i, '#');
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        print(17);
    }
}