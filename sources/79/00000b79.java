package ax;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    protected final byte f7084a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7085b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7086c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f7087d;

    /* renamed from: e  reason: collision with root package name */
    private final int f7088e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f7089a;

        /* renamed from: b  reason: collision with root package name */
        long f7090b;

        /* renamed from: c  reason: collision with root package name */
        byte[] f7091c;

        /* renamed from: d  reason: collision with root package name */
        int f7092d;

        /* renamed from: e  reason: collision with root package name */
        int f7093e;

        /* renamed from: f  reason: collision with root package name */
        boolean f7094f;

        /* renamed from: g  reason: collision with root package name */
        int f7095g;

        /* renamed from: h  reason: collision with root package name */
        int f7096h;

        a() {
        }

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", a.class.getSimpleName(), Arrays.toString(this.f7091c), Integer.valueOf(this.f7095g), Boolean.valueOf(this.f7094f), Integer.valueOf(this.f7089a), Long.valueOf(this.f7090b), Integer.valueOf(this.f7096h), Integer.valueOf(this.f7092d), Integer.valueOf(this.f7093e));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(int i11, int i12, int i13, int i14) {
        this(i11, i12, i13, i14, (byte) 61);
    }

    protected static byte[] i(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String m(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        }
    }

    private byte[] o(a aVar) {
        byte[] bArr = aVar.f7091c;
        if (bArr == null) {
            aVar.f7091c = new byte[j()];
            aVar.f7092d = 0;
            aVar.f7093e = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            aVar.f7091c = bArr2;
        }
        return aVar.f7091c;
    }

    int a(a aVar) {
        if (aVar.f7091c != null) {
            return aVar.f7092d - aVar.f7093e;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b11 : bArr) {
            if (this.f7084a == b11 || l(b11)) {
                return true;
            }
        }
        return false;
    }

    abstract void c(byte[] bArr, int i11, int i12, a aVar);

    public byte[] d(String str) {
        return e(i(str));
    }

    public byte[] e(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = new a();
        c(bArr, 0, bArr.length, aVar);
        c(bArr, 0, -1, aVar);
        int i11 = aVar.f7092d;
        byte[] bArr2 = new byte[i11];
        n(bArr2, 0, i11, aVar);
        return bArr2;
    }

    abstract void f(byte[] bArr, int i11, int i12, a aVar);

    public byte[] g(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = new a();
        f(bArr, 0, bArr.length, aVar);
        f(bArr, 0, -1, aVar);
        int i11 = aVar.f7092d - aVar.f7093e;
        byte[] bArr2 = new byte[i11];
        n(bArr2, 0, i11, aVar);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] h(int i11, a aVar) {
        byte[] bArr = aVar.f7091c;
        return (bArr == null || bArr.length < aVar.f7092d + i11) ? o(aVar) : bArr;
    }

    protected int j() {
        return PKIFailureInfo.certRevoked;
    }

    public long k(byte[] bArr) {
        int length = bArr.length;
        int i11 = this.f7085b;
        long j11 = (((length + i11) - 1) / i11) * this.f7086c;
        int i12 = this.f7087d;
        return i12 > 0 ? j11 + ((((i12 + j11) - 1) / i12) * this.f7088e) : j11;
    }

    protected abstract boolean l(byte b11);

    int n(byte[] bArr, int i11, int i12, a aVar) {
        if (aVar.f7091c == null) {
            return aVar.f7094f ? -1 : 0;
        }
        int min = Math.min(a(aVar), i12);
        System.arraycopy(aVar.f7091c, aVar.f7093e, bArr, i11, min);
        int i13 = aVar.f7093e + min;
        aVar.f7093e = i13;
        if (i13 >= aVar.f7092d) {
            aVar.f7091c = null;
        }
        return min;
    }

    protected b(int i11, int i12, int i13, int i14, byte b11) {
        this.f7085b = i11;
        this.f7086c = i12;
        this.f7087d = i13 > 0 && i14 > 0 ? (i13 / i12) * i12 : 0;
        this.f7088e = i14;
        this.f7084a = b11;
    }
}