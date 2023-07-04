package hb;

/* loaded from: classes.dex */
public class c extends mp.d {
    static {
        pp.f.a(c.class);
    }

    public static byte[] J(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i11 = 0; i11 < Math.min(4, str.length()); i11++) {
                bArr[i11] = (byte) str.charAt(i11);
            }
        }
        return bArr;
    }

    @Override // mp.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f38678b.close();
    }

    @Override // mp.d
    public String toString() {
        return "model(" + this.f38678b.toString() + ")";
    }
}