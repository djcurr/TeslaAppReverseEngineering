package pi;

import ak.k0;
import ak.o;
import ak.v;
import ei.s;
import ji.v;
import ji.w;

/* loaded from: classes3.dex */
final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f46568a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f46569b;

    /* renamed from: c  reason: collision with root package name */
    private final long f46570c;

    /* renamed from: d  reason: collision with root package name */
    private final long f46571d;

    private h(long[] jArr, long[] jArr2, long j11, long j12) {
        this.f46568a = jArr;
        this.f46569b = jArr2;
        this.f46570c = j11;
        this.f46571d = j12;
    }

    public static h a(long j11, long j12, s.a aVar, v vVar) {
        int C;
        vVar.P(10);
        int m11 = vVar.m();
        if (m11 <= 0) {
            return null;
        }
        int i11 = aVar.f25181d;
        long I0 = k0.I0(m11, 1000000 * (i11 >= 32000 ? 1152 : 576), i11);
        int I = vVar.I();
        int I2 = vVar.I();
        int I3 = vVar.I();
        vVar.P(2);
        long j13 = j12 + aVar.f25180c;
        long[] jArr = new long[I];
        long[] jArr2 = new long[I];
        int i12 = 0;
        long j14 = j12;
        while (i12 < I) {
            int i13 = I2;
            long j15 = j13;
            jArr[i12] = (i12 * I0) / I;
            jArr2[i12] = Math.max(j14, j15);
            if (I3 == 1) {
                C = vVar.C();
            } else if (I3 == 2) {
                C = vVar.I();
            } else if (I3 == 3) {
                C = vVar.F();
            } else if (I3 != 4) {
                return null;
            } else {
                C = vVar.G();
            }
            j14 += C * i13;
            i12++;
            j13 = j15;
            I2 = i13;
        }
        if (j11 != -1 && j11 != j14) {
            StringBuilder sb2 = new StringBuilder(67);
            sb2.append("VBRI data size mismatch: ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j14);
            o.h("VbriSeeker", sb2.toString());
        }
        return new h(jArr, jArr2, I0, j14);
    }

    @Override // pi.g
    public long c(long j11) {
        return this.f46568a[k0.i(this.f46569b, j11, true, true)];
    }

    @Override // ji.v
    public v.a f(long j11) {
        int i11 = k0.i(this.f46568a, j11, true, true);
        w wVar = new w(this.f46568a[i11], this.f46569b[i11]);
        if (wVar.f33776a < j11 && i11 != this.f46568a.length - 1) {
            int i12 = i11 + 1;
            return new v.a(wVar, new w(this.f46568a[i12], this.f46569b[i12]));
        }
        return new v.a(wVar);
    }

    @Override // pi.g
    public long g() {
        return this.f46571d;
    }

    @Override // ji.v
    public boolean h() {
        return true;
    }

    @Override // ji.v
    public long i() {
        return this.f46570c;
    }
}