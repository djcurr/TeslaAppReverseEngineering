package sx;

import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes5.dex */
public class b {
    public static long a(long j11) {
        short s11 = (short) (j11 & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        short s12 = (short) ((j11 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        short s13 = (short) (s12 ^ s11);
        return ((b(s13, 10) | (((short) (b((short) (s11 + s12), 9) + s11)) << 16)) << 16) | ((short) (((short) (b(s11, 13) ^ s13)) ^ (s13 << 5)));
    }

    private static short b(short s11, int i11) {
        return (short) ((s11 >>> (32 - i11)) | (s11 << i11));
    }

    public static long c(long j11) {
        long j12 = (j11 ^ (j11 >>> 33)) * 7109453100751455733L;
        return ((j12 ^ (j12 >>> 28)) * (-3808689974395783757L)) >>> 32;
    }
}