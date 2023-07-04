package hb;

import java.nio.ByteBuffer;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public final class e {
    public static void a(ByteBuffer byteBuffer, double d11) {
        int i11 = (int) (d11 * 1.073741824E9d);
        byteBuffer.put((byte) (((-16777216) & i11) >> 24));
        byteBuffer.put((byte) ((16711680 & i11) >> 16));
        byteBuffer.put((byte) ((65280 & i11) >> 8));
        byteBuffer.put((byte) (i11 & 255));
    }

    public static void b(ByteBuffer byteBuffer, double d11) {
        int i11 = (int) (d11 * 65536.0d);
        byteBuffer.put((byte) (((-16777216) & i11) >> 24));
        byteBuffer.put((byte) ((16711680 & i11) >> 16));
        byteBuffer.put((byte) ((65280 & i11) >> 8));
        byteBuffer.put((byte) (i11 & 255));
    }

    public static void c(ByteBuffer byteBuffer, double d11) {
        short s11 = (short) (d11 * 256.0d);
        byteBuffer.put((byte) ((65280 & s11) >> 8));
        byteBuffer.put((byte) (s11 & 255));
    }

    public static void d(ByteBuffer byteBuffer, String str) {
        if (str.getBytes().length == 3) {
            int i11 = 0;
            for (int i12 = 0; i12 < 3; i12++) {
                i11 += (str.getBytes()[i12] - 96) << ((2 - i12) * 5);
            }
            e(byteBuffer, i11);
            return;
        }
        throw new IllegalArgumentException("\"" + str + "\" language string isn't exactly 3 characters long!");
    }

    public static void e(ByteBuffer byteBuffer, int i11) {
        int i12 = i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        i(byteBuffer, i12 >> 8);
        i(byteBuffer, i12 & 255);
    }

    public static void f(ByteBuffer byteBuffer, int i11) {
        int i12 = i11 & 16777215;
        e(byteBuffer, i12 >> 8);
        i(byteBuffer, i12);
    }

    public static void g(ByteBuffer byteBuffer, long j11) {
        byteBuffer.putInt((int) j11);
    }

    public static void h(ByteBuffer byteBuffer, long j11) {
        byteBuffer.putLong(j11);
    }

    public static void i(ByteBuffer byteBuffer, int i11) {
        byteBuffer.put((byte) (i11 & 255));
    }

    public static void j(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(f.b(str));
        i(byteBuffer, 0);
    }
}