package hj;

/* loaded from: classes3.dex */
public abstract class m extends e {

    /* renamed from: j  reason: collision with root package name */
    public final long f29304j;

    public m(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, ci.i iVar, int i11, Object obj, long j11, long j12, long j13) {
        super(aVar, bVar, 1, iVar, i11, obj, j11, j12);
        ak.a.e(iVar);
        this.f29304j = j13;
    }

    public long g() {
        long j11 = this.f29304j;
        if (j11 != -1) {
            return 1 + j11;
        }
        return -1L;
    }

    public abstract boolean h();
}