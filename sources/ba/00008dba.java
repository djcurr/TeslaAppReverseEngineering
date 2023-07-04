package o50;

import java.io.OutputStream;
import org.bouncycastle.crypto.p;

/* loaded from: classes5.dex */
public class b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    protected p f42287a;

    public b(p pVar) {
        this.f42287a = pVar;
    }

    public byte[] a() {
        byte[] bArr = new byte[this.f42287a.getDigestSize()];
        this.f42287a.doFinal(bArr, 0);
        return bArr;
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.f42287a.update((byte) i11);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        this.f42287a.update(bArr, i11, i12);
    }
}