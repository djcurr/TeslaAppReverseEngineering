package hj;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.Loader;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class e implements Loader.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f29254a = fj.g.a();

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.b f29255b;

    /* renamed from: c  reason: collision with root package name */
    public final int f29256c;

    /* renamed from: d  reason: collision with root package name */
    public final ci.i f29257d;

    /* renamed from: e  reason: collision with root package name */
    public final int f29258e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f29259f;

    /* renamed from: g  reason: collision with root package name */
    public final long f29260g;

    /* renamed from: h  reason: collision with root package name */
    public final long f29261h;

    /* renamed from: i  reason: collision with root package name */
    protected final zj.m f29262i;

    public e(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, int i11, ci.i iVar, int i12, Object obj, long j11, long j12) {
        this.f29262i = new zj.m(aVar);
        this.f29255b = (com.google.android.exoplayer2.upstream.b) ak.a.e(bVar);
        this.f29256c = i11;
        this.f29257d = iVar;
        this.f29258e = i12;
        this.f29259f = obj;
        this.f29260g = j11;
        this.f29261h = j12;
    }

    public final long c() {
        return this.f29262i.o();
    }

    public final long d() {
        return this.f29261h - this.f29260g;
    }

    public final Map<String, List<String>> e() {
        return this.f29262i.q();
    }

    public final Uri f() {
        return this.f29262i.p();
    }
}