package n2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import n2.a;
import r2.d;

/* loaded from: classes.dex */
public final class e implements k {

    /* renamed from: a  reason: collision with root package name */
    private final n2.a f40298a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a.b<p>> f40299b;

    /* renamed from: c  reason: collision with root package name */
    private final vz.k f40300c;

    /* renamed from: d  reason: collision with root package name */
    private final vz.k f40301d;

    /* renamed from: e  reason: collision with root package name */
    private final List<j> f40302e;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<Float> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Float invoke() {
            int k11;
            j jVar;
            k b11;
            List<j> e11 = e.this.e();
            if (e11.isEmpty()) {
                jVar = null;
            } else {
                j jVar2 = e11.get(0);
                float b12 = jVar2.b().b();
                k11 = wz.w.k(e11);
                int i11 = 1;
                if (1 <= k11) {
                    while (true) {
                        int i12 = i11 + 1;
                        j jVar3 = e11.get(i11);
                        float b13 = jVar3.b().b();
                        if (Float.compare(b12, b13) < 0) {
                            jVar2 = jVar3;
                            b12 = b13;
                        }
                        if (i11 == k11) {
                            break;
                        }
                        i11 = i12;
                    }
                }
                jVar = jVar2;
            }
            j jVar4 = jVar;
            float f11 = BitmapDescriptorFactory.HUE_RED;
            if (jVar4 != null && (b11 = jVar4.b()) != null) {
                f11 = b11.b();
            }
            return Float.valueOf(f11);
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<Float> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Float invoke() {
            int k11;
            j jVar;
            k b11;
            List<j> e11 = e.this.e();
            if (e11.isEmpty()) {
                jVar = null;
            } else {
                j jVar2 = e11.get(0);
                float a11 = jVar2.b().a();
                k11 = wz.w.k(e11);
                int i11 = 1;
                if (1 <= k11) {
                    while (true) {
                        int i12 = i11 + 1;
                        j jVar3 = e11.get(i11);
                        float a12 = jVar3.b().a();
                        if (Float.compare(a11, a12) < 0) {
                            jVar2 = jVar3;
                            a11 = a12;
                        }
                        if (i11 == k11) {
                            break;
                        }
                        i11 = i12;
                    }
                }
                jVar = jVar2;
            }
            j jVar4 = jVar;
            float f11 = BitmapDescriptorFactory.HUE_RED;
            if (jVar4 != null && (b11 = jVar4.b()) != null) {
                f11 = b11.a();
            }
            return Float.valueOf(f11);
        }
    }

    public e(n2.a aVar, a0 style, List<a.b<p>> placeholders, x2.d density, d.a resourceLoader) {
        vz.k b11;
        vz.k b12;
        n2.a i11;
        List b13;
        n2.a annotatedString = aVar;
        kotlin.jvm.internal.s.g(annotatedString, "annotatedString");
        kotlin.jvm.internal.s.g(style, "style");
        kotlin.jvm.internal.s.g(placeholders, "placeholders");
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(resourceLoader, "resourceLoader");
        this.f40298a = annotatedString;
        this.f40299b = placeholders;
        kotlin.b bVar = kotlin.b.NONE;
        b11 = vz.m.b(bVar, new b());
        this.f40300c = b11;
        b12 = vz.m.b(bVar, new a());
        this.f40301d = b12;
        n x11 = style.x();
        List<a.b<n>> h11 = n2.b.h(annotatedString, x11);
        ArrayList arrayList = new ArrayList(h11.size());
        int size = h11.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            a.b<n> bVar2 = h11.get(i12);
            i11 = n2.b.i(annotatedString, bVar2.f(), bVar2.d());
            n g11 = g(bVar2.e(), x11);
            String g12 = i11.g();
            a0 v11 = style.v(g11);
            List<a.b<s>> e11 = i11.e();
            b13 = f.b(f(), bVar2.f(), bVar2.d());
            arrayList.add(new j(l.a(g12, v11, e11, b13, density, resourceLoader), bVar2.f(), bVar2.d()));
            annotatedString = aVar;
            i12 = i13;
        }
        this.f40302e = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n g(n nVar, n nVar2) {
        n nVar3;
        w2.f e11 = nVar.e();
        if (e11 == null) {
            nVar3 = null;
        } else {
            e11.l();
            nVar3 = nVar;
        }
        return nVar3 == null ? n.b(nVar, null, nVar2.e(), 0L, null, 13, null) : nVar3;
    }

    @Override // n2.k
    public float a() {
        return ((Number) this.f40300c.getValue()).floatValue();
    }

    @Override // n2.k
    public float b() {
        return ((Number) this.f40301d.getValue()).floatValue();
    }

    public final n2.a d() {
        return this.f40298a;
    }

    public final List<j> e() {
        return this.f40302e;
    }

    public final List<a.b<p>> f() {
        return this.f40299b;
    }
}