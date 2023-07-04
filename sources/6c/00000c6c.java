package be;

import android.content.Context;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.a;
import ge.b;
import java.util.Set;
import md.o;
import nf.h;

/* loaded from: classes.dex */
public class e extends ge.b<e, com.facebook.imagepipeline.request.a, qd.a<nf.c>, h> {

    /* renamed from: t  reason: collision with root package name */
    private final jf.h f7631t;

    /* renamed from: u  reason: collision with root package name */
    private final g f7632u;

    /* renamed from: v  reason: collision with root package name */
    private md.f<mf.a> f7633v;

    /* renamed from: w  reason: collision with root package name */
    private de.b f7634w;

    /* renamed from: x  reason: collision with root package name */
    private de.f f7635x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7636a;

        static {
            int[] iArr = new int[b.c.values().length];
            f7636a = iArr;
            try {
                iArr[b.c.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7636a[b.c.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7636a[b.c.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(Context context, g gVar, jf.h hVar, Set<ge.d> set, Set<xe.b> set2) {
        super(context, set, set2);
        this.f7631t = hVar;
        this.f7632u = gVar;
    }

    public static a.c G(b.c cVar) {
        int i11 = a.f7636a[cVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return a.c.BITMAP_MEMORY_CACHE;
                }
                throw new RuntimeException("Cache level" + cVar + "is not supported. ");
            }
            return a.c.DISK_CACHE;
        }
        return a.c.FULL_FETCH;
    }

    private gd.d H() {
        com.facebook.imagepipeline.request.a n11 = n();
        hf.f k11 = this.f7631t.k();
        if (k11 == null || n11 == null) {
            return null;
        }
        if (n11.i() != null) {
            return k11.c(n11, f());
        }
        return k11.a(n11, f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ge.b
    /* renamed from: I */
    public com.facebook.datasource.c<qd.a<nf.c>> i(me.a aVar, String str, com.facebook.imagepipeline.request.a aVar2, Object obj, b.c cVar) {
        return this.f7631t.g(aVar2, obj, G(cVar), J(aVar), str);
    }

    protected pf.e J(me.a aVar) {
        if (aVar instanceof d) {
            return ((d) aVar).p0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ge.b
    /* renamed from: K */
    public d w() {
        d c11;
        if (tf.b.d()) {
            tf.b.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            me.a p11 = p();
            String e11 = ge.b.e();
            if (p11 instanceof d) {
                c11 = (d) p11;
            } else {
                c11 = this.f7632u.c();
            }
            c11.r0(x(c11, e11), e11, H(), f(), this.f7633v, this.f7634w);
            c11.s0(this.f7635x, this, o.f38489a);
            return c11;
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }

    public e L(de.f fVar) {
        this.f7635x = fVar;
        return r();
    }

    @Override // me.d
    /* renamed from: M */
    public e a(Uri uri) {
        if (uri == null) {
            return (e) super.C(null);
        }
        return (e) super.C(ImageRequestBuilder.s(uri).F(p001if.e.b()).a());
    }
}