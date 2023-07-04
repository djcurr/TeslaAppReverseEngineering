package hf;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;

/* loaded from: classes3.dex */
public class b implements gd.d {

    /* renamed from: a  reason: collision with root package name */
    private final String f29135a;

    /* renamed from: b  reason: collision with root package name */
    private final p001if.d f29136b;

    /* renamed from: c  reason: collision with root package name */
    private final p001if.e f29137c;

    /* renamed from: d  reason: collision with root package name */
    private final p001if.b f29138d;

    /* renamed from: e  reason: collision with root package name */
    private final gd.d f29139e;

    /* renamed from: f  reason: collision with root package name */
    private final String f29140f;

    /* renamed from: g  reason: collision with root package name */
    private final int f29141g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f29142h;

    public b(String str, p001if.d dVar, p001if.e eVar, p001if.b bVar, gd.d dVar2, String str2, Object obj) {
        this.f29135a = (String) md.k.g(str);
        this.f29136b = dVar;
        this.f29137c = eVar;
        this.f29138d = bVar;
        this.f29139e = dVar2;
        this.f29140f = str2;
        this.f29141g = ud.a.d(Integer.valueOf(str.hashCode()), Integer.valueOf(dVar != null ? dVar.hashCode() : 0), Integer.valueOf(eVar.hashCode()), bVar, dVar2, str2);
        this.f29142h = obj;
        RealtimeSinceBootClock.get().now();
    }

    @Override // gd.d
    public String a() {
        return this.f29135a;
    }

    @Override // gd.d
    public boolean b(Uri uri) {
        return a().contains(uri.toString());
    }

    @Override // gd.d
    public boolean c() {
        return false;
    }

    @Override // gd.d
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f29141g == bVar.f29141g && this.f29135a.equals(bVar.f29135a) && md.j.a(this.f29136b, bVar.f29136b) && md.j.a(this.f29137c, bVar.f29137c) && md.j.a(this.f29138d, bVar.f29138d) && md.j.a(this.f29139e, bVar.f29139e) && md.j.a(this.f29140f, bVar.f29140f);
        }
        return false;
    }

    @Override // gd.d
    public int hashCode() {
        return this.f29141g;
    }

    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", this.f29135a, this.f29136b, this.f29137c, this.f29138d, this.f29139e, this.f29140f, Integer.valueOf(this.f29141g));
    }
}