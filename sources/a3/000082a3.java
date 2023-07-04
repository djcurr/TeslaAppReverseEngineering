package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes5.dex */
public abstract class v0 implements org.bouncycastle.crypto.e {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f36929a;

    /* renamed from: b  reason: collision with root package name */
    protected int[] f36930b;

    /* renamed from: c  reason: collision with root package name */
    protected int f36931c;

    /* renamed from: d  reason: collision with root package name */
    protected int f36932d;

    /* renamed from: e  reason: collision with root package name */
    protected int f36933e;

    /* renamed from: f  reason: collision with root package name */
    protected int f36934f;

    /* JADX INFO: Access modifiers changed from: protected */
    public static int n(int i11, int i12) {
        return (i11 >>> (-i12)) | (i11 << i12);
    }

    protected static int o(int i11, int i12) {
        return (i11 << (-i12)) | (i11 >>> i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a() {
        int n11 = n(this.f36931c, 13);
        int n12 = n(this.f36933e, 3);
        this.f36932d = n((this.f36932d ^ n11) ^ n12, 1);
        int n13 = n((this.f36934f ^ n12) ^ (n11 << 3), 7);
        this.f36934f = n13;
        this.f36931c = n((n11 ^ this.f36932d) ^ n13, 5);
        this.f36933e = n((this.f36934f ^ n12) ^ (this.f36932d << 7), 22);
    }

    protected abstract void b(byte[] bArr, int i11, byte[] bArr2, int i12);

    protected abstract void c(byte[] bArr, int i11, byte[] bArr2, int i12);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(int i11, int i12, int i13, int i14) {
        int i15 = ~i11;
        int i16 = i12 ^ i11;
        int i17 = (i15 | i16) ^ i14;
        int i18 = i13 ^ i17;
        int i19 = i16 ^ i18;
        this.f36933e = i19;
        int i21 = (i16 & i14) ^ i15;
        int i22 = (i19 & i21) ^ i17;
        this.f36932d = i22;
        int i23 = (i11 & i17) ^ (i22 | i18);
        this.f36934f = i23;
        this.f36931c = i23 ^ (i21 ^ i18);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(int i11, int i12, int i13, int i14) {
        int i15 = i14 ^ i12;
        int i16 = i11 ^ (i12 & i15);
        int i17 = i15 ^ i16;
        int i18 = i13 ^ i17;
        this.f36934f = i18;
        int i19 = i12 ^ (i15 & i16);
        int i21 = i16 ^ (i18 | i19);
        this.f36932d = i21;
        int i22 = ~i21;
        int i23 = i19 ^ i18;
        this.f36931c = i22 ^ i23;
        this.f36933e = (i22 | i23) ^ i17;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(int i11, int i12, int i13, int i14) {
        int i15 = i12 ^ i14;
        int i16 = ~i15;
        int i17 = i11 ^ i13;
        int i18 = i13 ^ i15;
        int i19 = (i12 & i18) ^ i17;
        this.f36931c = i19;
        int i21 = (((i11 | i16) ^ i14) | i17) ^ i15;
        this.f36934f = i21;
        int i22 = ~i18;
        int i23 = i21 | i19;
        this.f36932d = i22 ^ i23;
        this.f36933e = (i23 ^ i17) ^ (i14 & i22);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(int i11, int i12, int i13, int i14) {
        int i15 = i11 | i12;
        int i16 = i12 ^ i13;
        int i17 = i11 ^ (i12 & i16);
        int i18 = i13 ^ i17;
        int i19 = i14 | i17;
        int i21 = i16 ^ i19;
        this.f36931c = i21;
        int i22 = (i19 | i16) ^ i14;
        this.f36933e = i18 ^ i22;
        int i23 = i15 ^ i22;
        int i24 = i17 ^ (i21 & i23);
        this.f36934f = i24;
        this.f36932d = i24 ^ (i23 ^ i21);
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "Serpent";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(int i11, int i12, int i13, int i14) {
        int i15 = i12 ^ ((i13 | i14) & i11);
        int i16 = i13 ^ (i11 & i15);
        int i17 = i14 ^ i16;
        this.f36932d = i17;
        int i18 = ~i11;
        int i19 = (i16 & i17) ^ i15;
        this.f36934f = i19;
        int i21 = i14 ^ (i17 | i18);
        this.f36931c = i19 ^ i21;
        this.f36933e = (i18 ^ i17) ^ (i15 & i21);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(int i11, int i12, int i13, int i14) {
        int i15 = ~i13;
        int i16 = (i12 & i15) ^ i14;
        int i17 = i11 & i16;
        int i18 = (i12 ^ i15) ^ i17;
        this.f36934f = i18;
        int i19 = i18 | i12;
        this.f36932d = i16 ^ (i11 & i19);
        int i21 = i14 | i11;
        this.f36931c = (i15 ^ i19) ^ i21;
        this.f36933e = ((i11 ^ i13) | i17) ^ (i12 & i21);
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof u50.b1) {
            this.f36929a = z11;
            this.f36930b = m(((u50.b1) iVar).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to " + getAlgorithmName() + " init - " + iVar.getClass().getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(int i11, int i12, int i13, int i14) {
        int i15 = ~i11;
        int i16 = i11 ^ i12;
        int i17 = i13 ^ i16;
        int i18 = (i13 | i15) ^ i14;
        this.f36932d = i17 ^ i18;
        int i19 = i16 ^ (i17 & i18);
        int i21 = i18 ^ (i12 | i19);
        this.f36934f = i21;
        int i22 = i12 | i21;
        this.f36931c = i19 ^ i22;
        this.f36933e = (i14 & i15) ^ (i22 ^ i17);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(int i11, int i12, int i13, int i14) {
        int i15 = (i11 & i12) | i13;
        int i16 = (i11 | i12) & i14;
        int i17 = i15 ^ i16;
        this.f36934f = i17;
        int i18 = i12 ^ i16;
        int i19 = ((i17 ^ (~i14)) | i18) ^ i11;
        this.f36932d = i19;
        int i21 = (i18 ^ i13) ^ (i14 | i19);
        this.f36931c = i21;
        this.f36933e = ((i11 & i17) ^ i21) ^ (i15 ^ i19);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l() {
        int o11 = (o(this.f36933e, 22) ^ this.f36934f) ^ (this.f36932d << 7);
        int o12 = o(this.f36931c, 5) ^ this.f36932d;
        int i11 = this.f36934f;
        int i12 = o12 ^ i11;
        int o13 = o(i11, 7);
        int o14 = o(this.f36932d, 1);
        this.f36934f = (o13 ^ o11) ^ (i12 << 3);
        this.f36932d = (o14 ^ i12) ^ o11;
        this.f36933e = o(o11, 3);
        this.f36931c = o(i12, 13);
    }

    protected abstract int[] m(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(int i11, int i12, int i13, int i14) {
        int i15 = i11 ^ i14;
        int i16 = i13 ^ i15;
        int i17 = i12 ^ i16;
        int i18 = (i14 & i11) ^ i17;
        this.f36934f = i18;
        int i19 = i11 ^ (i12 & i15);
        this.f36933e = (i13 | i19) ^ i17;
        int i21 = (i16 ^ i19) & i18;
        this.f36932d = (~i16) ^ i21;
        this.f36931c = (~i19) ^ i21;
    }

    @Override // org.bouncycastle.crypto.e
    public final int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.f36930b == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i11 + 16 <= bArr.length) {
            if (i12 + 16 <= bArr2.length) {
                if (this.f36929a) {
                    c(bArr, i11, bArr2, i12);
                    return 16;
                }
                b(bArr, i11, bArr2, i12);
                return 16;
            }
            throw new OutputLengthException("output buffer too short");
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(int i11, int i12, int i13, int i14) {
        int i15 = (~i11) ^ i12;
        int i16 = (i11 | i15) ^ i13;
        int i17 = i14 ^ i16;
        this.f36933e = i17;
        int i18 = i12 ^ (i14 | i15);
        int i19 = i17 ^ i15;
        int i21 = (i16 & i18) ^ i19;
        this.f36934f = i21;
        int i22 = i18 ^ i16;
        this.f36932d = i21 ^ i22;
        this.f36931c = i16 ^ (i22 & i19);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(int i11, int i12, int i13, int i14) {
        int i15 = ~i11;
        int i16 = i12 ^ i14;
        int i17 = (i13 & i15) ^ i16;
        this.f36931c = i17;
        int i18 = i13 ^ i15;
        int i19 = i12 & (i13 ^ i17);
        int i21 = i18 ^ i19;
        this.f36934f = i21;
        int i22 = i11 ^ ((i19 | i14) & (i17 | i18));
        this.f36933e = i22;
        this.f36932d = (i22 ^ (i14 | i15)) ^ (i16 ^ i21);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(int i11, int i12, int i13, int i14) {
        int i15 = i11 ^ i12;
        int i16 = i11 & i13;
        int i17 = i11 | i14;
        int i18 = i13 ^ i14;
        int i19 = i16 | (i15 & i17);
        int i21 = i18 ^ i19;
        this.f36933e = i21;
        int i22 = (i17 ^ i12) ^ i19;
        int i23 = i15 ^ (i18 & i22);
        this.f36931c = i23;
        int i24 = i23 & i21;
        this.f36932d = i22 ^ i24;
        this.f36934f = (i12 | i14) ^ (i18 ^ i24);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(int i11, int i12, int i13, int i14) {
        int i15 = i11 ^ i14;
        int i16 = i13 ^ (i14 & i15);
        int i17 = i12 | i16;
        this.f36934f = i15 ^ i17;
        int i18 = ~i12;
        int i19 = (i15 | i18) ^ i16;
        this.f36931c = i19;
        int i21 = i18 ^ i15;
        int i22 = (i17 & i21) ^ (i19 & i11);
        this.f36933e = i22;
        this.f36932d = (i11 ^ i16) ^ (i21 & i22);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(int i11, int i12, int i13, int i14) {
        int i15 = ~i11;
        int i16 = i11 ^ i12;
        int i17 = i11 ^ i14;
        int i18 = (i13 ^ i15) ^ (i16 | i17);
        this.f36931c = i18;
        int i19 = i14 & i18;
        int i21 = (i16 ^ i18) ^ i19;
        this.f36932d = i21;
        int i22 = i17 ^ (i18 | i15);
        this.f36933e = (i16 | i19) ^ i22;
        this.f36934f = (i22 & i21) ^ (i12 ^ i19);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(int i11, int i12, int i13, int i14) {
        int i15 = ~i11;
        int i16 = i11 ^ i14;
        int i17 = i12 ^ i16;
        int i18 = i13 ^ (i15 | i16);
        int i19 = i12 ^ i18;
        this.f36932d = i19;
        int i21 = (i16 | i19) ^ i14;
        int i22 = (i18 & i21) ^ i17;
        this.f36933e = i22;
        int i23 = i21 ^ i18;
        this.f36931c = i22 ^ i23;
        this.f36934f = (i23 & i17) ^ (~i18);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(int i11, int i12, int i13, int i14) {
        int i15 = i12 ^ i13;
        int i16 = (i13 & i15) ^ i14;
        int i17 = i11 ^ i16;
        int i18 = i12 ^ ((i14 | i15) & i17);
        this.f36932d = i18;
        int i19 = (i11 & i17) ^ i15;
        this.f36934f = i19;
        int i21 = (i18 | i16) ^ i17;
        int i22 = i16 ^ (i19 & i21);
        this.f36933e = i22;
        this.f36931c = (i19 & i22) ^ (~i21);
    }
}