package ei;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class t {
    public static List<byte[]> a(byte[] bArr) {
        long e11 = e(d(bArr));
        long e12 = e(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(e11));
        arrayList.add(b(e12));
        return arrayList;
    }

    private static byte[] b(long j11) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j11).array();
    }

    public static int c(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static int d(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    private static long e(long j11) {
        return (j11 * 1000000000) / 48000;
    }
}