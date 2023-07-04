package f9;

/* loaded from: classes.dex */
public class c {
    public static byte[] a(int i11) {
        byte[] bArr = {(byte) ((r3 >> 8) % 256), (byte) (r3 % 256), (byte) (r3 % 256), (byte) (i11 % 256)};
        int i12 = i11 >> 8;
        int i13 = i12 >> 8;
        return bArr;
    }
}