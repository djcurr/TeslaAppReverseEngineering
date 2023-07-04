package wb;

import cc.e;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class a {
    public static e a(InputStream inputStream) {
        if (inputStream.markSupported()) {
            inputStream.mark(512);
            byte[] bArr = new byte[512];
            int read = inputStream.read(bArr);
            if (read != -1) {
                inputStream.reset();
                int i11 = 0;
                while (true) {
                    if (i11 >= read - 2) {
                        break;
                    } else if (bArr[i11] == -1 && bArr[i11 + 1] == -40 && bArr[i11 + 2] == -1) {
                        long j11 = i11;
                        if (inputStream.skip(j11) != j11) {
                            throw new IOException("Skipping stream bytes failed");
                        }
                    } else {
                        i11++;
                    }
                }
                return qb.a.c(inputStream);
            }
            throw new IOException("Stream is empty");
        }
        throw new IOException("Stream must support mark/reset");
    }
}