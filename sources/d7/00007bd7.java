package ji;

import ak.k0;
import ji.p;
import ji.v;

/* loaded from: classes3.dex */
public final class o implements v {

    /* renamed from: a  reason: collision with root package name */
    private final p f33745a;

    /* renamed from: b  reason: collision with root package name */
    private final long f33746b;

    public o(p pVar, long j11) {
        this.f33745a = pVar;
        this.f33746b = j11;
    }

    private w a(long j11, long j12) {
        return new w((j11 * 1000000) / this.f33745a.f33751e, this.f33746b + j12);
    }

    @Override // ji.v
    public v.a f(long j11) {
        ak.a.h(this.f33745a.f33757k);
        p pVar = this.f33745a;
        p.a aVar = pVar.f33757k;
        long[] jArr = aVar.f33759a;
        long[] jArr2 = aVar.f33760b;
        int i11 = k0.i(jArr, pVar.j(j11), true, false);
        w a11 = a(i11 == -1 ? 0L : jArr[i11], i11 != -1 ? jArr2[i11] : 0L);
        if (a11.f33776a != j11 && i11 != jArr.length - 1) {
            int i12 = i11 + 1;
            return new v.a(a11, a(jArr[i12], jArr2[i12]));
        }
        return new v.a(a11);
    }

    @Override // ji.v
    public boolean h() {
        return true;
    }

    @Override // ji.v
    public long i() {
        return this.f33745a.g();
    }
}