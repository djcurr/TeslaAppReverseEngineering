package y50;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.z;
import u50.j0;
import u50.k0;

/* loaded from: classes5.dex */
public class j implements z {

    /* renamed from: g  reason: collision with root package name */
    private final b f59161g = new b();

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f59162h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f59163i;

    /* renamed from: j  reason: collision with root package name */
    private j0 f59164j;

    /* renamed from: k  reason: collision with root package name */
    private k0 f59165k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b extends ByteArrayOutputStream {
        private b() {
        }

        synchronized byte[] a(j0 j0Var, byte[] bArr) {
            byte[] bArr2;
            bArr2 = new byte[114];
            j0Var.c(0, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, bArr2, 0);
            reset();
            return bArr2;
        }

        synchronized boolean g(k0 k0Var, byte[] bArr, byte[] bArr2) {
            if (114 != bArr2.length) {
                reset();
                return false;
            }
            boolean R = t60.b.R(bArr2, 0, k0Var.getEncoded(), 0, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            reset();
            return R;
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            org.bouncycastle.util.a.z(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
            ((ByteArrayOutputStream) this).count = 0;
        }
    }

    public j(byte[] bArr) {
        this.f59162h = org.bouncycastle.util.a.h(bArr);
    }

    public void a() {
        this.f59161g.reset();
    }

    @Override // org.bouncycastle.crypto.z
    public byte[] generateSignature() {
        j0 j0Var;
        if (!this.f59163i || (j0Var = this.f59164j) == null) {
            throw new IllegalStateException("Ed448Signer not initialised for signature generation.");
        }
        return this.f59161g.a(j0Var, this.f59162h);
    }

    @Override // org.bouncycastle.crypto.z
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        this.f59163i = z11;
        if (z11) {
            this.f59164j = (j0) iVar;
            this.f59165k = null;
        } else {
            this.f59164j = null;
            this.f59165k = (k0) iVar;
        }
        a();
    }

    @Override // org.bouncycastle.crypto.z
    public void update(byte b11) {
        this.f59161g.write(b11);
    }

    @Override // org.bouncycastle.crypto.z
    public void update(byte[] bArr, int i11, int i12) {
        this.f59161g.write(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.z
    public boolean verifySignature(byte[] bArr) {
        k0 k0Var;
        if (this.f59163i || (k0Var = this.f59165k) == null) {
            throw new IllegalStateException("Ed448Signer not initialised for verification");
        }
        return this.f59161g.g(k0Var, this.f59162h, bArr);
    }
}