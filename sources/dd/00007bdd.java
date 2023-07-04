package ji;

import ak.k0;
import ji.v;

/* loaded from: classes3.dex */
public final class t implements v {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f33766a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f33767b;

    /* renamed from: c  reason: collision with root package name */
    private final long f33768c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f33769d;

    public t(long[] jArr, long[] jArr2, long j11) {
        ak.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z11 = length > 0;
        this.f33769d = z11;
        if (z11 && jArr2[0] > 0) {
            int i11 = length + 1;
            long[] jArr3 = new long[i11];
            this.f33766a = jArr3;
            long[] jArr4 = new long[i11];
            this.f33767b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f33766a = jArr;
            this.f33767b = jArr2;
        }
        this.f33768c = j11;
    }

    @Override // ji.v
    public v.a f(long j11) {
        if (!this.f33769d) {
            return new v.a(w.f33775c);
        }
        int i11 = k0.i(this.f33767b, j11, true, true);
        w wVar = new w(this.f33767b[i11], this.f33766a[i11]);
        if (wVar.f33776a != j11 && i11 != this.f33767b.length - 1) {
            int i12 = i11 + 1;
            return new v.a(wVar, new w(this.f33767b[i12], this.f33766a[i12]));
        }
        return new v.a(wVar);
    }

    @Override // ji.v
    public boolean h() {
        return this.f33769d;
    }

    @Override // ji.v
    public long i() {
        return this.f33768c;
    }
}