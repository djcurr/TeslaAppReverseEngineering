package org.spongycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes6.dex */
class StreamUtil {
    private static final long MAX_MEMORY = Runtime.getRuntime().maxMemory();

    StreamUtil() {
    }

    public static int calculateBodyLength(int i11) {
        int i12 = 1;
        if (i11 > 127) {
            int i13 = 1;
            while (true) {
                i11 >>>= 8;
                if (i11 == 0) {
                    break;
                }
                i13++;
            }
            for (int i14 = (i13 - 1) * 8; i14 >= 0; i14 -= 8) {
                i12++;
            }
        }
        return i12;
    }

    public static int calculateTagLength(int i11) {
        if (i11 >= 31) {
            if (i11 < 128) {
                return 2;
            }
            byte[] bArr = new byte[5];
            int i12 = 4;
            do {
                i11 >>= 7;
                i12--;
                bArr[i12] = (byte) ((i11 & 127) | 128);
            } while (i11 > 127);
            return 1 + (5 - i12);
        }
        return 1;
    }

    public static int findLimit(InputStream inputStream) {
        if (inputStream instanceof LimitedInputStream) {
            return ((LimitedInputStream) inputStream).getRemaining();
        }
        if (inputStream instanceof ASN1InputStream) {
            return ((ASN1InputStream) inputStream).getLimit();
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                long size = channel != null ? channel.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        long j11 = MAX_MEMORY;
        if (j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j11;
    }
}