package w0;

import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e1;
import c1.g1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import f2.z;
import h2.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n2.a;
import o1.f;
import r2.d;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    private static final vz.p<List<a.b<n2.p>>, List<a.b<h00.q<String, c1.i, Integer, vz.b0>>>> f55059a;

    /* loaded from: classes.dex */
    public static final class a implements f2.z {

        /* renamed from: a */
        public static final a f55060a = new a();

        /* renamed from: w0.h$a$a */
        /* loaded from: classes.dex */
        static final class C1248a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

            /* renamed from: a */
            final /* synthetic */ List<f2.m0> f55061a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1248a(List<? extends f2.m0> list) {
                super(1);
                this.f55061a = list;
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo12invoke(m0.a aVar) {
                invoke2(aVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke */
            public final void invoke2(m0.a layout) {
                kotlin.jvm.internal.s.g(layout, "$this$layout");
                List<f2.m0> list = this.f55061a;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    m0.a.n(layout, list.get(i11), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
                }
            }
        }

        a() {
        }

        @Override // f2.z
        public int a(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.d(this, kVar, list, i11);
        }

        @Override // f2.z
        public final f2.a0 b(f2.b0 Layout, List<? extends f2.y> children, long j11) {
            kotlin.jvm.internal.s.g(Layout, "$this$Layout");
            kotlin.jvm.internal.s.g(children, "children");
            ArrayList arrayList = new ArrayList(children.size());
            int size = children.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(children.get(i11).X(j11));
            }
            return b0.a.b(Layout, x2.b.n(j11), x2.b.m(j11), null, new C1248a(arrayList), 4, null);
        }

        @Override // f2.z
        public int c(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.b(this, kVar, list, i11);
        }

        @Override // f2.z
        public int d(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.a(this, kVar, list, i11);
        }

        @Override // f2.z
        public int e(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.c(this, kVar, list, i11);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ n2.a f55062a;

        /* renamed from: b */
        final /* synthetic */ List<a.b<h00.q<String, c1.i, Integer, vz.b0>>> f55063b;

        /* renamed from: c */
        final /* synthetic */ int f55064c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n2.a aVar, List<a.b<h00.q<String, c1.i, Integer, vz.b0>>> list, int i11) {
            super(2);
            this.f55062a = aVar;
            this.f55063b = list;
            this.f55064c = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            h.a(this.f55062a, this.f55063b, iVar, this.f55064c | 1);
        }
    }

    static {
        List i11;
        List i12;
        i11 = wz.w.i();
        i12 = wz.w.i();
        f55059a = new vz.p<>(i11, i12);
    }

    public static final void a(n2.a text, List<a.b<h00.q<String, c1.i, Integer, vz.b0>>> inlineContents, c1.i iVar, int i11) {
        kotlin.jvm.internal.s.g(text, "text");
        kotlin.jvm.internal.s.g(inlineContents, "inlineContents");
        c1.i h11 = iVar.h(710796807);
        int size = inlineContents.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            a.b<h00.q<String, c1.i, Integer, vz.b0>> bVar = inlineContents.get(i12);
            h00.q<String, c1.i, Integer, vz.b0> a11 = bVar.a();
            int b11 = bVar.b();
            int c11 = bVar.c();
            a aVar = a.f55060a;
            h11.x(1376089394);
            f.a aVar2 = o1.f.f42062f1;
            x2.d dVar = (x2.d) h11.A(androidx.compose.ui.platform.l0.d());
            x2.q qVar = (x2.q) h11.A(androidx.compose.ui.platform.l0.i());
            y1 y1Var = (y1) h11.A(androidx.compose.ui.platform.l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            h00.q<g1<h2.a>, c1.i, Integer, vz.b0> b12 = f2.u.b(aVar2);
            int i14 = size;
            if (!(h11.k() instanceof c1.e)) {
                c1.h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a12);
            } else {
                h11.o();
            }
            h11.E();
            c1.i a13 = a2.a(h11);
            a2.c(a13, aVar, c0551a.d());
            a2.c(a13, dVar, c0551a.b());
            a2.c(a13, qVar, c0551a.c());
            a2.c(a13, y1Var, c0551a.f());
            h11.c();
            b12.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-1487999349);
            a11.invoke(text.subSequence(b11, c11).g(), h11, 0);
            h11.N();
            h11.N();
            h11.q();
            h11.N();
            size = i14;
            i12 = i13;
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(text, inlineContents, i11));
    }

    public static final vz.p<List<a.b<n2.p>>, List<a.b<h00.q<String, c1.i, Integer, vz.b0>>>> b(n2.a text, Map<String, l> inlineContent) {
        kotlin.jvm.internal.s.g(text, "text");
        kotlin.jvm.internal.s.g(inlineContent, "inlineContent");
        if (inlineContent.isEmpty()) {
            return f55059a;
        }
        int i11 = 0;
        List<a.b<String>> f11 = text.f("androidx.compose.foundation.text.inlineContent", 0, text.length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = f11.size();
        while (i11 < size) {
            int i12 = i11 + 1;
            a.b<String> bVar = f11.get(i11);
            l lVar = inlineContent.get(bVar.e());
            if (lVar != null) {
                arrayList.add(new a.b(lVar.b(), bVar.f(), bVar.d()));
                arrayList2.add(new a.b(lVar.a(), bVar.f(), bVar.d()));
            }
            i11 = i12;
        }
        return new vz.p<>(arrayList, arrayList2);
    }

    public static final d0 c(d0 current, n2.a text, n2.a0 style, x2.d density, d.a resourceLoader, boolean z11, int i11, int i12, List<a.b<n2.p>> placeholders) {
        kotlin.jvm.internal.s.g(current, "current");
        kotlin.jvm.internal.s.g(text, "text");
        kotlin.jvm.internal.s.g(style, "style");
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(resourceLoader, "resourceLoader");
        kotlin.jvm.internal.s.g(placeholders, "placeholders");
        if (kotlin.jvm.internal.s.c(current.k(), text) && kotlin.jvm.internal.s.c(current.j(), style)) {
            if (current.i() == z11) {
                if (w2.k.d(current.f(), i11)) {
                    if (current.c() == i12 && kotlin.jvm.internal.s.c(current.a(), density) && kotlin.jvm.internal.s.c(current.g(), placeholders)) {
                        return current;
                    }
                    return new d0(text, style, i12, z11, i11, density, resourceLoader, placeholders, null);
                }
                return new d0(text, style, i12, z11, i11, density, resourceLoader, placeholders, null);
            }
        }
        return new d0(text, style, i12, z11, i11, density, resourceLoader, placeholders, null);
    }

    public static final d0 e(d0 current, String text, n2.a0 style, x2.d density, d.a resourceLoader, boolean z11, int i11, int i12) {
        kotlin.jvm.internal.s.g(current, "current");
        kotlin.jvm.internal.s.g(text, "text");
        kotlin.jvm.internal.s.g(style, "style");
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(resourceLoader, "resourceLoader");
        if (kotlin.jvm.internal.s.c(current.k().g(), text) && kotlin.jvm.internal.s.c(current.j(), style)) {
            if (current.i() == z11) {
                if (w2.k.d(current.f(), i11)) {
                    if (current.c() == i12 && kotlin.jvm.internal.s.c(current.a(), density)) {
                        return current;
                    }
                    return new d0(new n2.a(text, null, null, 6, null), style, i12, z11, i11, density, resourceLoader, null, 128, null);
                }
                return new d0(new n2.a(text, null, null, 6, null), style, i12, z11, i11, density, resourceLoader, null, 128, null);
            }
        }
        return new d0(new n2.a(text, null, null, 6, null), style, i12, z11, i11, density, resourceLoader, null, 128, null);
    }
}