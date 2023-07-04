package oa;

import java.io.InputStream;
import java.net.URL;
import na.g;
import na.n;
import na.o;
import na.r;

/* loaded from: classes.dex */
public class e implements n<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final n<g, InputStream> f42348a;

    /* loaded from: classes.dex */
    public static class a implements o<URL, InputStream> {
        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<URL, InputStream> c(r rVar) {
            return new e(rVar.d(g.class, InputStream.class));
        }
    }

    public e(n<g, InputStream> nVar) {
        this.f42348a = nVar;
    }

    @Override // na.n
    /* renamed from: c */
    public n.a<InputStream> b(URL url, int i11, int i12, ha.e eVar) {
        return this.f42348a.b(new g(url), i11, i12, eVar);
    }

    @Override // na.n
    /* renamed from: d */
    public boolean a(URL url) {
        return true;
    }
}