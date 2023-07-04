package df;

import android.net.Uri;
import hf.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import md.j;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final gd.d f23968a;

    /* renamed from: b  reason: collision with root package name */
    private final i<gd.d, nf.c> f23969b;

    /* renamed from: d  reason: collision with root package name */
    private final LinkedHashSet<gd.d> f23971d = new LinkedHashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final i.b<gd.d> f23970c = new a();

    /* loaded from: classes3.dex */
    class a implements i.b<gd.d> {
        a() {
        }

        @Override // hf.i.b
        /* renamed from: b */
        public void a(gd.d dVar, boolean z11) {
            c.this.f(dVar, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b implements gd.d {

        /* renamed from: a  reason: collision with root package name */
        private final gd.d f23973a;

        /* renamed from: b  reason: collision with root package name */
        private final int f23974b;

        public b(gd.d dVar, int i11) {
            this.f23973a = dVar;
            this.f23974b = i11;
        }

        @Override // gd.d
        public String a() {
            return null;
        }

        @Override // gd.d
        public boolean b(Uri uri) {
            return this.f23973a.b(uri);
        }

        @Override // gd.d
        public boolean c() {
            return false;
        }

        @Override // gd.d
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f23974b == bVar.f23974b && this.f23973a.equals(bVar.f23973a);
            }
            return false;
        }

        @Override // gd.d
        public int hashCode() {
            return (this.f23973a.hashCode() * 1013) + this.f23974b;
        }

        public String toString() {
            return j.c(this).b("imageCacheKey", this.f23973a).a("frameIndex", this.f23974b).toString();
        }
    }

    public c(gd.d dVar, i<gd.d, nf.c> iVar) {
        this.f23968a = dVar;
        this.f23969b = iVar;
    }

    private b e(int i11) {
        return new b(this.f23968a, i11);
    }

    private synchronized gd.d g() {
        gd.d dVar;
        dVar = null;
        Iterator<gd.d> it2 = this.f23971d.iterator();
        if (it2.hasNext()) {
            dVar = it2.next();
            it2.remove();
        }
        return dVar;
    }

    public qd.a<nf.c> a(int i11, qd.a<nf.c> aVar) {
        return this.f23969b.d(e(i11), aVar, this.f23970c);
    }

    public boolean b(int i11) {
        return this.f23969b.contains(e(i11));
    }

    public qd.a<nf.c> c(int i11) {
        return this.f23969b.get(e(i11));
    }

    public qd.a<nf.c> d() {
        qd.a<nf.c> f11;
        do {
            gd.d g11 = g();
            if (g11 == null) {
                return null;
            }
            f11 = this.f23969b.f(g11);
        } while (f11 == null);
        return f11;
    }

    public synchronized void f(gd.d dVar, boolean z11) {
        if (z11) {
            this.f23971d.add(dVar);
        } else {
            this.f23971d.remove(dVar);
        }
    }
}