package y50;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.z;
import u50.g0;
import u50.h0;

/* loaded from: classes5.dex */
public class i implements z {

    /* renamed from: g  reason: collision with root package name */
    private final b f59157g = new b();

    /* renamed from: h  reason: collision with root package name */
    private boolean f59158h;

    /* renamed from: i  reason: collision with root package name */
    private g0 f59159i;

    /* renamed from: j  reason: collision with root package name */
    private h0 f59160j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b extends ByteArrayOutputStream {
        private b() {
        }

        synchronized byte[] a(g0 g0Var) {
            byte[] bArr;
            bArr = new byte[64];
            g0Var.c(0, null, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, bArr, 0);
            reset();
            return bArr;
        }

        synchronized boolean g(h0 h0Var, byte[] bArr) {
            if (64 != bArr.length) {
                reset();
                return false;
            }
            boolean W = t60.a.W(bArr, 0, h0Var.getEncoded(), 0, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            reset();
            return W;
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            org.bouncycastle.util.a.z(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
            ((ByteArrayOutputStream) this).count = 0;
        }
    }

    public void a() {
        this.f59157g.reset();
    }

    @Override // org.bouncycastle.crypto.z
    public byte[] generateSignature() {
        g0 g0Var;
        if (!this.f59158h || (g0Var = this.f59159i) == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for signature generation.");
        }
        return this.f59157g.a(g0Var);
    }

    @Override // org.bouncycastle.crypto.z
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        this.f59158h = z11;
        if (z11) {
            this.f59159i = (g0) iVar;
            this.f59160j = null;
        } else {
            this.f59159i = null;
            this.f59160j = (h0) iVar;
        }
        a();
    }

    @Override // org.bouncycastle.crypto.z
    public void update(byte b11) {
        this.f59157g.write(b11);
    }

    @Override // org.bouncycastle.crypto.z
    public void update(byte[] bArr, int i11, int i12) {
        this.f59157g.write(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.z
    public boolean verifySignature(byte[] bArr) {
        h0 h0Var;
        if (this.f59158h || (h0Var = this.f59160j) == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for verification");
        }
        return this.f59157g.g(h0Var, bArr);
    }
}