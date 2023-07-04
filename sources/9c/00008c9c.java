package nq;

/* loaded from: classes2.dex */
public class h {
    public static byte[] a(int i11) {
        return new byte[]{(byte) (i11 >>> 24), (byte) ((i11 >>> 16) & 255), (byte) ((i11 >>> 8) & 255), (byte) (i11 & 255)};
    }
}