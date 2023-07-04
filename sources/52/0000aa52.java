package p50;

import l50.g1;
import l50.i1;
import org.bouncycastle.crypto.v;

/* loaded from: classes5.dex */
public final class r implements v {

    /* renamed from: a  reason: collision with root package name */
    private final a f46325a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46326b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f46327c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f46328d;

    /* renamed from: e  reason: collision with root package name */
    private i1 f46329e;

    /* renamed from: f  reason: collision with root package name */
    private int f46330f;

    /* renamed from: g  reason: collision with root package name */
    private int f46331g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a extends i1 {
        public a(int i11) {
            super(i11);
        }

        int u() {
            return super.p();
        }
    }

    public r(int i11) {
        this.f46325a = new a(i11);
        this.f46326b = i11;
        int i12 = i11 / 32;
        this.f46327c = new int[i12];
        this.f46328d = new int[i12 + 1];
    }

    private int a(int i11, int i12) {
        int[] iArr = this.f46328d;
        int i13 = this.f46330f;
        int i14 = iArr[(i13 + i11) % iArr.length];
        if (i12 == 0) {
            return i14;
        }
        int i15 = iArr[((i13 + i11) + 1) % iArr.length];
        return (i15 >>> (32 - i12)) | (i14 << i12);
    }

    private void b() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f46327c;
            if (i12 >= iArr.length) {
                break;
            }
            iArr[i12] = this.f46325a.u();
            i12++;
        }
        while (true) {
            int[] iArr2 = this.f46328d;
            if (i11 >= iArr2.length - 1) {
                this.f46330f = iArr2.length - 1;
                this.f46331g = 3;
                return;
            }
            iArr2[i11] = this.f46325a.u();
            i11++;
        }
    }

    private void c() {
        int i11 = (this.f46331g + 1) % 4;
        this.f46331g = i11;
        if (i11 == 0) {
            this.f46330f = (this.f46330f + 1) % this.f46328d.length;
        }
    }

    private void d() {
        int i11 = (this.f46331g + 1) % 4;
        this.f46331g = i11;
        if (i11 == 0) {
            this.f46328d[this.f46330f] = this.f46325a.u();
            this.f46330f = (this.f46330f + 1) % this.f46328d.length;
        }
    }

    private void e(int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f46327c;
            if (i12 >= iArr.length) {
                return;
            }
            iArr[i12] = iArr[i12] ^ a(i12, i11);
            i12++;
        }
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        c();
        e(this.f46331g * 8);
        int i12 = 0;
        while (true) {
            int[] iArr = this.f46327c;
            if (i12 >= iArr.length) {
                reset();
                return getMacSize();
            }
            g1.m(iArr[i12], bArr, (i12 * 4) + i11);
            i12++;
        }
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return "Zuc256Mac-" + this.f46326b;
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return this.f46326b / 8;
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f46325a.init(true, iVar);
        this.f46329e = (i1) this.f46325a.copy();
        b();
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        i1 i1Var = this.f46329e;
        if (i1Var != null) {
            this.f46325a.a(i1Var);
        }
        b();
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        d();
        int i11 = this.f46331g * 8;
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