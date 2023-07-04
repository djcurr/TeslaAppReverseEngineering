package ud;

import java.io.InputStream;
import md.k;

/* loaded from: classes.dex */
public class c {
    public static long a(InputStream inputStream, long j11) {
        k.g(inputStream);
        k.b(Boolean.valueOf(j11 >= 0));
        long j12 = j11;
        while (j12 > 0) {
            long skip = inputStream.skip(j12);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return j11 - j12;
                }
                skip = 1;
            }
            j12 -= skip;
        }
        return j11;
    }
}