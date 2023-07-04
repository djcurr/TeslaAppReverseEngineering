package oa;

import com.bumptech.glide.load.data.j;
import java.io.InputStream;
import na.g;
import na.m;
import na.n;
import na.o;
import na.r;

/* loaded from: classes.dex */
public class a implements n<g, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final ha.d<Integer> f42324b = ha.d.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a  reason: collision with root package name */
    private final m<g, g> f42325a;

    /* renamed from: oa.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0840a implements o<g, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final m<g, g> f42326a = new m<>(500);

        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<g, InputStream> c(r rVar) {
            return new a(this.f42326a);
        }
    }

    public a(m<g, g> mVar) {
        this.f42325a = mVar;
    }

    @Override // na.n
    /* renamed from: c */
    public n.a<InputStream> b(g gVar, int i11, int i12, ha.e eVar) {
        m<g, g> mVar = this.f42325a;
        if (mVar != null) {
            g a11 = mVar.a(gVar, 0, 0);
            if (a11 == null) {
                this.f42325a.b(gVar, 0, 0, gVar);
            } else {
                gVar = a11;
            }
        }
        return new n.a<>(gVar, new j(gVar, ((Integer) eVar.c(f42324b)).intValue()));
    }

    @Override // na.n
    /* renamed from: d */
    public boolean a(g gVar) {
        return true;
    }
}