package g60;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* loaded from: classes5.dex */
class d extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private Signature f27813a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Signature signature) {
        this.f27813a = signature;
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        try {
            this.f27813a.update((byte) i11);
        } catch (SignatureException e11) {
            throw new IOException(e11.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.f27813a.update(bArr);
        } catch (SignatureException e11) {
            throw new IOException(e11.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        try {
            this.f27813a.update(bArr, i11, i12);
        } catch (SignatureException e11) {
            throw new IOException(e11.getMessage());
        }
    }
}