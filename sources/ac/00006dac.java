package f70;

import java.util.Objects;

/* loaded from: classes5.dex */
final class n {

    /* renamed from: a  reason: collision with root package name */
    private final byte[][] f25980a;

    /* JADX INFO: Access modifiers changed from: protected */
    public n(m mVar, byte[][] bArr) {
        Objects.requireNonNull(mVar, "params == null");
        Objects.requireNonNull(bArr, "publicKey == null");
        if (a0.k(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != mVar.a()) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != mVar.c()) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.f25980a = a0.d(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[][] a() {
        return a0.d(this.f25980a);
    }
}