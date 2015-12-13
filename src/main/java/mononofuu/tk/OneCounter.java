package mononofuu.tk;

import java.math.BigInteger;

/**
 * created by Alekseichenko Sergey <mononofuu@gmail.com>
 */
public class OneCounter {

    //Returns number of '1' in the result of 11^N
    //N is an integer within the range [0..1000]
    //EXAMPLE: N=3, 11^3=1331, returns 2
    static int count(int N) {
        int res = 0;
        BigInteger big = BigInteger.valueOf(11).pow(N);
        for (char c : big.toString().toCharArray()) {
            if (c == '1') {
                res++;
            }
        }

        return res;
    }
}
