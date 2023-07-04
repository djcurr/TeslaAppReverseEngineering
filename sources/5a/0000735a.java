package hj;

/* loaded from: classes3.dex */
public abstract class a extends m {

    /* renamed from: k  reason: collision with root package name */
    public final long f29230k;

    /* renamed from: l  reason: collision with root package name */
    public final long f29231l;

    /* renamed from: m  reason: collision with root package name */
    private c f29232m;

    /* renamed from: n  reason: collision with root package name */
    private int[] f29233n;

    public a(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, ci.i iVar, int i11, Object obj, long j11, long j12, long j13, long j14, long j15) {
        super(aVar, bVar, iVar, i11, obj, j11, j12, j15);
        this.f29230k = j13;
        this.f29231l = j14;
    }

    public final int i(int i11) {
        return ((int[]) ak.a.h(this.f29233n))[i11];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final c j() {
        return (c) ak.a.h(this.f29232m);
    }

    public void k(c cVar) {
        this.f29232m = cVar;
        this.f29233n = cVar.a();
    }
}