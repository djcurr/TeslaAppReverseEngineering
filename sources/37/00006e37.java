package fj;

/* loaded from: classes3.dex */
public class b implements com.google.android.exoplayer2.source.u {

    /* renamed from: a  reason: collision with root package name */
    protected final com.google.android.exoplayer2.source.u[] f26291a;

    public b(com.google.android.exoplayer2.source.u[] uVarArr) {
        this.f26291a = uVarArr;
    }

    @Override // com.google.android.exoplayer2.source.u
    public final long b() {
        long j11 = Long.MAX_VALUE;
        for (com.google.android.exoplayer2.source.u uVar : this.f26291a) {
            long b11 = uVar.b();
            if (b11 != Long.MIN_VALUE) {
                j11 = Math.min(j11, b11);
            }
        }
        if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.u
    public boolean c() {
        for (com.google.android.exoplayer2.source.u uVar : this.f26291a) {
            if (uVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.u
    public boolean e(long j11) {
        com.google.android.exoplayer2.source.u[] uVarArr;
        boolean z11;
        boolean z12 = false;
        do {
            long b11 = b();
            if (b11 == Long.MIN_VALUE) {
                break;
            }
            z11 = false;
            for (com.google.android.exoplayer2.source.u uVar : this.f26291a) {
                long b12 = uVar.b();
                boolean z13 = b12 != Long.MIN_VALUE && b12 <= j11;
                if (b12 == b11 || z13) {
                    z11 |= uVar.e(j11);
                }
            }
            z12 |= z11;
        } while (z11);
        return z12;
    }

    @Override // com.google.android.exoplayer2.source.u
    public final long g() {
        long j11 = Long.MAX_VALUE;
        for (com.google.android.exoplayer2.source.u uVar : this.f26291a) {
            long g11 = uVar.g();
            if (g11 != Long.MIN_VALUE) {
                j11 = Math.min(j11, g11);
            }
        }
        if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.u
    public final void h(long j11) {
        for (com.google.android.exoplayer2.source.u uVar : this.f26291a) {
            uVar.h(j11);
        }
    }
}