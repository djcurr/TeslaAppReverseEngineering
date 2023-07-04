package o50;

import java.io.FilterInputStream;
import java.io.InputStream;
import org.bouncycastle.crypto.p;

/* loaded from: classes5.dex */
public class a extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    protected p f42286a;

    public a(InputStream inputStream, p pVar) {
        super(inputStream);
        this.f42286a = pVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            this.f42286a.update((byte) read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        int read = ((FilterInputStream) this).in.read(bArr, i11, i12);
        if (read > 0) {
            this.f42286a.update(bArr, i11, read);
        }
        return read;
    }
}