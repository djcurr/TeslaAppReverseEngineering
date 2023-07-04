package o50;

import java.io.OutputStream;
import org.bouncycastle.crypto.v;

/* loaded from: classes5.dex */
public class d extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    protected v f42289a;

    public d(v vVar) {
        this.f42289a = vVar;
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.f42289a.update((byte) i11);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        this.f42289a.update(bArr, i11, i12);
    }
}