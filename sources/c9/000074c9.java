package i50;

import ch.qos.logback.core.joran.action.ActionConst;
import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public class q implements org.bouncycastle.crypto.p {

    /* renamed from: a  reason: collision with root package name */
    private b f30105a = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b extends ByteArrayOutputStream {
        private b() {
        }

        void a(byte[] bArr, int i11) {
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArr, i11, size());
        }

        @Override // java.io.ByteArrayOutputStream
        public void reset() {
            super.reset();
            org.bouncycastle.util.a.g(((ByteArrayOutputStream) this).buf);
        }
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        int size = this.f30105a.size();
        this.f30105a.a(bArr, i11);
        reset();
        return size;
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return ActionConst.NULL;
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return this.f30105a.size();
    }

    @Override // org.bouncycastle.crypto.p
    public void reset() {
        this.f30105a.reset();
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte b11) {
        this.f30105a.write(b11);
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte[] bArr, int i11, int i12) {
        this.f30105a.write(bArr, i11, i12);
    }
}