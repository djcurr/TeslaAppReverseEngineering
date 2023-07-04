package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public abstract class a0 implements e, b0 {

    /* renamed from: a  reason: collision with root package name */
    private final e f43124a;

    /* JADX INFO: Access modifiers changed from: protected */
    public a0(e eVar) {
        this.f43124a = eVar;
    }

    protected abstract byte a(byte b11);

    public e b() {
        return this.f43124a;
    }

    @Override // org.bouncycastle.crypto.b0
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i13 + i12 <= bArr2.length) {
                while (i11 < i14) {
                    bArr2[i13] = a(bArr[i11]);
                    i13++;
                    i11++;
                }
                return i12;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too small");
    }
}