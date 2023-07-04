package cf;

import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.common.memory.PooledByteBuffer;
import df.d;
import gf.f;
import java.util.ArrayList;
import java.util.List;
import md.k;
import nf.i;

/* loaded from: classes3.dex */
public class e implements d {

    /* renamed from: c  reason: collision with root package name */
    static c f9070c = g("com.facebook.animated.gif.GifImage");

    /* renamed from: d  reason: collision with root package name */
    static c f9071d = g("com.facebook.animated.webp.WebPImage");

    /* renamed from: a  reason: collision with root package name */
    private final df.b f9072a;

    /* renamed from: b  reason: collision with root package name */
    private final f f9073b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements d.b {
        a(e eVar) {
        }

        @Override // df.d.b
        public void a(int i11, Bitmap bitmap) {
        }

        @Override // df.d.b
        public qd.a<Bitmap> b(int i11) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f9074a;

        b(e eVar, List list) {
            this.f9074a = list;
        }

        @Override // df.d.b
        public void a(int i11, Bitmap bitmap) {
        }

        @Override // df.d.b
        public qd.a<Bitmap> b(int i11) {
            return qd.a.m((qd.a) this.f9074a.get(i11));
        }
    }

    public e(df.b bVar, f fVar) {
        this.f9072a = bVar;
        this.f9073b = fVar;
    }

    private qd.a<Bitmap> c(int i11, int i12, Bitmap.Config config) {
        qd.a<Bitmap> d11 = this.f9073b.d(i11, i12, config);
        d11.J().eraseColor(0);
        if (Build.VERSION.SDK_INT >= 12) {
            d11.J().setHasAlpha(true);
        }
        return d11;
    }

    private qd.a<Bitmap> d(bf.c cVar, Bitmap.Config config, int i11) {
        qd.a<Bitmap> c11 = c(cVar.getWidth(), cVar.getHeight(), config);
        new df.d(this.f9072a.a(bf.e.b(cVar), null), new a(this)).g(i11, c11.J());
        return c11;
    }

    private List<qd.a<Bitmap>> e(bf.c cVar, Bitmap.Config config) {
        bf.a a11 = this.f9072a.a(bf.e.b(cVar), null);
        ArrayList arrayList = new ArrayList(a11.a());
        df.d dVar = new df.d(a11, new b(this, arrayList));
        for (int i11 = 0; i11 < a11.a(); i11++) {
            qd.a<Bitmap> c11 = c(a11.getWidth(), a11.getHeight(), config);
            dVar.g(i11, c11.J());
            arrayList.add(c11);
        }
        return arrayList;
    }

    private nf.c f(p001if.b bVar, bf.c cVar, Bitmap.Config config) {
        List<qd.a<Bitmap>> list;
        qd.a<Bitmap> aVar = null;
        try {
            int a11 = bVar.f30364d ? cVar.a() - 1 : 0;
            if (bVar.f30366f) {
                nf.d dVar = new nf.d(d(cVar, config, a11), i.f41655d, 0);
                qd.a.C(null);
                qd.a.p(null);
                return dVar;
            }
            if (bVar.f30365e) {
                list = e(cVar, config);
                try {
                    aVar = qd.a.m(list.get(a11));
                } catch (Throwable th2) {
                    th = th2;
                    qd.a.C(aVar);
                    qd.a.p(list);
                    throw th;
                }
            } else {
                list = null;
            }
            if (bVar.f30363c && aVar == null) {
                aVar = d(cVar, config, a11);
            }
            nf.a aVar2 = new nf.a(bf.e.e(cVar).j(aVar).i(a11).h(list).g(bVar.f30370j).a());
            qd.a.C(aVar);
            qd.a.p(list);
            return aVar2;
        } catch (Throwable th3) {
            th = th3;
            list = null;
        }
    }

    private static c g(String str) {
        try {
            return (c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // cf.d
    public nf.c a(nf.e eVar, p001if.b bVar, Bitmap.Config config) {
        bf.c e11;
        if (f9070c != null) {
            qd.a<PooledByteBuffer> m11 = eVar.m();
            k.g(m11);
            try {
                PooledByteBuffer J = m11.J();
                if (J.i() != null) {
                    e11 = f9070c.d(J.i(), bVar);
                } else {
                    e11 = f9070c.e(J.getNativePtr(), J.size(), bVar);
                }
                return f(bVar, e11, config);
            } finally {
                qd.a.C(m11);
            }
        }
        throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
    }

    @Override // cf.d
    public nf.c b(nf.e eVar, p001if.b bVar, Bitmap.Config config) {
        bf.c e11;
        if (f9071d != null) {
            qd.a<PooledByteBuffer> m11 = eVar.m();
            k.g(m11);
            try {
                PooledByteBuffer J = m11.J();
                if (J.i() != null) {
                    e11 = f9071d.d(J.i(), bVar);
                } else {
                    e11 = f9071d.e(J.getNativePtr(), J.size(), bVar);
                }
                return f(bVar, e11, config);
            } finally {
                qd.a.C(m11);
            }
        }
        throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
    }
}