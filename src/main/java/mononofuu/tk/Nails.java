package mononofuu.tk;

/**
 * created by Alekseichenko Sergey <mononofuu@gmail.com>
 */
public class Nails {

    // N - int within the range [1..10000]
    // K - int within the range [0..N], K - number of nails that can be hammered at any height
    // returns the maximal numbers of nails that can be positioned at the same height
    // EXAMPLE:
    // A[1,1,3,3,3,4,5,5,5,5] and K=2 ---> returns 5

    static int solution(int[] A, int K) {
        int n = A.length;
        int best = 0;
        int count = 1;
        for (int i = 0; i < n - K - 1; i++) {
            if (A[i] == A[i + 1])
                count = count + 1;
            else
                count = 1;
            if (count > best)
                best = count;
        }

        return K < n ? best + K : n;
    }
}
