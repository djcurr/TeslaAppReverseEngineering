package p50;

import l50.g1;
import org.bouncycastle.crypto.v;

/* loaded from: classes5.dex */
public final class q implements v {

    /* renamed from: b  reason: collision with root package name */
    private int f46320b;

    /* renamed from: d  reason: collision with root package name */
    private g1 f46322d;

    /* renamed from: e  reason: collision with root package name */
    private int f46323e;

    /* renamed from: f  reason: collision with root package name */
    private int f46324f;

    /* renamed from: a  reason: collision with root package name */
    private final b f46319a = new b();

    /* renamed from: c  reason: collision with root package name */
    private final int[] f46321c = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b extends g1 {
        private b() {
        }

        int t() {
            return super.p();
        }
    }

    private int a() {
        if (this.f46324f != 0) {
            return this.f46319a.t();
        }
        int[] iArr = this.f46321c;
        int length = (this.f46323e + 1) % iArr.length;
        this.f46323e = length;
        return iArr[length];
    }

    private int b(int i11) {
        int[] iArr = this.f46321c;
        int i12 = this.f46323e;
        int i13 = iArr[i12];
        if (i11 == 0) {
            return i13;
        }
        int i14 = iArr[(i12 + 1) % iArr.length];
        return (i14 >>> (32 - i11)) | (i13 << i11);
    }

    private void c() {
        int i11 = 0;
        this.f46320b = 0;
        while (true) {
            int[] iArr = this.f46321c;
            if (i11 >= iArr.length - 1) {
                this.f46323e = iArr.length - 1;
                this.f46324f = 3;
                return;
            }
            iArr[i11] = this.f46319a.t();
            i11++;
        }
    }

    private void d() {
        int i11 = (this.f46324f + 1) % 4;
        this.f46324f = i11;
        if (i11 == 0) {
            this.f46321c[this.f46323e] = this.f46319a.t();
            this.f46323e = (this.f46323e + 1) % this.f46321c.length;
        }
    }

    private void e(int i11) {
        this.f46320b = b(i11) ^ this.f46320b;
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        d();
        int b11 = this.f46320b ^ b(this.f46324f * 8);
        this.f46320b = b11;
        int a11 = b11 ^ a();
        this.f46320b = a11;
        g1.m(a11, bArr, i11);
        reset();
        return getMacSize();
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return "Zuc128Mac";
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return 4;
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f46319a.init(true, iVar);
        this.f46322d = (g1) this.f46319a.copy();
        c();
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        g1 g1Var = this.f46322d;
        if (g1Var != null) {
            this.f46319a.a(g1Var);
        }
        c();
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        d();
        int i11 = this.f46324f * 8;
        int i12 = 128;
        int i13 = 0;
        while (i12 > 0) {
            if ((b11 & i12) != 0) {
                e(i11 + i13);
            }
            i12 >>= 1;
            i13++;
        }
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            update(bArr[i11 + i13]);
        }
    }
}