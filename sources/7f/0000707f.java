package gm;

/* loaded from: classes3.dex */
public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public final a f28020a;

    /* renamed from: b  reason: collision with root package name */
    public final c f28021b;

    /* renamed from: c  reason: collision with root package name */
    public final b f28022c;

    /* renamed from: d  reason: collision with root package name */
    public final long f28023d;

    public e(long j11, a aVar, c cVar, b bVar, int i11, int i12) {
        this.f28023d = j11;
        this.f28020a = aVar;
        this.f28021b = cVar;
        this.f28022c = bVar;
    }

    @Override // gm.d
    public b a() {
        return this.f28022c;
    }

    @Override // gm.d
    public c b() {
        return this.f28021b;
    }

    public a c() {
        return this.f28020a;
    }

    public long d() {
        return this.f28023d;
    }

    public boolean e(long j11) {
        return this.f28023d < j11;
    }
}