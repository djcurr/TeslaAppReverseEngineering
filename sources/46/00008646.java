package m50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.e;
import r70.i;
import u50.q0;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final e f38417a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f38418b;

    /* renamed from: c  reason: collision with root package name */
    protected q0 f38419c;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(e eVar) {
        this.f38417a = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] f(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        for (int i11 = 0; i11 != sArr.length; i11++) {
            i.A(sArr[i11], bArr, i11 * 2);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static short[] g(byte[] bArr) {
        if ((bArr.length & 1) == 0) {
            int length = bArr.length / 2;
            short[] sArr = new short[length];
            for (int i11 = 0; i11 != length; i11++) {
                sArr[i11] = i.e(bArr, i11 * 2);
            }
            return sArr;
        }
        throw new IllegalArgumentException("data must be an even number of bytes for a wide radix");
    }

    protected abstract int a(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);

    protected abstract int b(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);

    public abstract String c();

    public abstract void d(boolean z11, org.bouncycastle.crypto.i iVar);

    public int e(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (this.f38419c != null) {
            if (i12 >= 0) {
                if (bArr == null || bArr2 == null) {
                    throw new NullPointerException("buffer value is null");
                }
                if (bArr.length >= i11 + i12) {
                    if (bArr2.length >= i13 + i12) {
                        return this.f38418b ? b(bArr, i11, i12, bArr2, i13) : a(bArr, i11, i12, bArr2, i13);
                    }
                    throw new OutputLengthException("output buffer too short");
                }
                throw new DataLengthException("input buffer too short");
            }
            throw new IllegalArgumentException("input length cannot be negative");
        }
        throw new IllegalStateException("FPE engine not initialized");
    }
}