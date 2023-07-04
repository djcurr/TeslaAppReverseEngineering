package v2;

import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h00.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u;
import n2.a;
import n2.a0;
import n2.s;
import q2.h;
import q2.i;
import r2.k;
import r2.l;
import t1.a1;
import t1.c0;
import u2.j;
import vz.b0;
import w2.e;
import wz.o;
import x2.r;
import x2.t;

/* loaded from: classes.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends u implements q<s, Integer, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Spannable f53883a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f53884b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Spannable spannable, j jVar) {
            super(3);
            this.f53883a = spannable;
            this.f53884b = jVar;
        }

        public final void a(s spanStyle, int i11, int i12) {
            kotlin.jvm.internal.s.g(spanStyle, "spanStyle");
            Spannable spannable = this.f53883a;
            j jVar = this.f53884b;
            r2.e d11 = spanStyle.d();
            l i13 = spanStyle.i();
            if (i13 == null) {
                i13 = l.f49091b.d();
            }
            r2.j g11 = spanStyle.g();
            int b11 = g11 == null ? r2.j.f49081b.b() : g11.i();
            k h11 = spanStyle.h();
            spannable.setSpan(new q2.k(jVar.b(d11, i13, b11, h11 == null ? k.f49085b.a() : h11.m())), i11, i12, 33);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ b0 invoke(s sVar, Integer num, Integer num2) {
            a(sVar, num.intValue(), num2.intValue());
            return b0.f54756a;
        }
    }

    private static final MetricAffectingSpan a(long j11, x2.d dVar) {
        long g11 = r.g(j11);
        t.a aVar = t.f56961b;
        if (t.g(g11, aVar.b())) {
            return new q2.d(dVar.M(j11));
        }
        if (t.g(g11, aVar.a())) {
            return new q2.c(r.h(j11));
        }
        return null;
    }

    public static final void b(s sVar, List<a.b<s>> spanStyles, q<? super s, ? super Integer, ? super Integer, b0> block) {
        kotlin.jvm.internal.s.g(spanStyles, "spanStyles");
        kotlin.jvm.internal.s.g(block, "block");
        if (spanStyles.size() <= 1) {
            if (!spanStyles.isEmpty()) {
                block.invoke(d(sVar, spanStyles.get(0).e()), Integer.valueOf(spanStyles.get(0).f()), Integer.valueOf(spanStyles.get(0).d()));
                return;
            }
            return;
        }
        int size = spanStyles.size();
        int i11 = size * 2;
        Integer[] numArr = new Integer[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            numArr[i12] = 0;
        }
        int size2 = spanStyles.size();
        for (int i13 = 0; i13 < size2; i13++) {
            a.b<s> bVar = spanStyles.get(i13);
            numArr[i13] = Integer.valueOf(bVar.f());
            numArr[i13 + size] = Integer.valueOf(bVar.d());
        }
        o.x(numArr);
        int intValue = ((Number) wz.l.G(numArr)).intValue();
        int i14 = 0;
        while (i14 < i11) {
            int intValue2 = numArr[i14].intValue();
            i14++;
            if (intValue2 != intValue) {
                int size3 = spanStyles.size();
                s sVar2 = sVar;
                int i15 = 0;
                while (i15 < size3) {
                    int i16 = i15 + 1;
                    a.b<s> bVar2 = spanStyles.get(i15);
                    if (n2.b.g(intValue, intValue2, bVar2.f(), bVar2.d())) {
                        sVar2 = d(sVar2, bVar2.e());
                    }
                    i15 = i16;
                }
                if (sVar2 != null) {
                    block.invoke(sVar2, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                }
                intValue = intValue2;
            }
        }
    }

    private static final boolean c(a0 a0Var) {
        return f.c(a0Var.y()) || a0Var.k() != null;
    }

    private static final s d(s sVar, s sVar2) {
        return sVar == null ? sVar2 : sVar.o(sVar2);
    }

    public static final void e(Spannable setBackground, long j11, int i11, int i12) {
        kotlin.jvm.internal.s.g(setBackground, "$this$setBackground");
        if (j11 != t1.a0.f51365b.f()) {
            o(setBackground, new BackgroundColorSpan(c0.j(j11)), i11, i12);
        }
    }

    private static final void f(Spannable spannable, w2.a aVar, int i11, int i12) {
        if (aVar == null) {
            return;
        }
        o(spannable, new q2.a(aVar.h()), i11, i12);
    }

    public static final void g(Spannable setColor, long j11, int i11, int i12) {
        kotlin.jvm.internal.s.g(setColor, "$this$setColor");
        if (j11 != t1.a0.f51365b.f()) {
            o(setColor, new ForegroundColorSpan(c0.j(j11)), i11, i12);
        }
    }

    private static final void h(Spannable spannable, a0 a0Var, List<a.b<s>> list, j jVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            a.b<s> bVar = list.get(i11);
            a.b<s> bVar2 = bVar;
            if (f.c(bVar2.e()) || bVar2.e().h() != null) {
                arrayList.add(bVar);
            }
            i11 = i12;
        }
        b(c(a0Var) ? new s(0L, 0L, a0Var.l(), a0Var.j(), a0Var.k(), a0Var.g(), null, 0L, null, null, null, 0L, null, null, 16323, null) : null, arrayList, new a(spannable, jVar));
    }

    private static final void i(Spannable spannable, String str, int i11, int i12) {
        if (str == null) {
            return;
        }
        o(spannable, new q2.b(str), i11, i12);
    }

    public static final void j(Spannable setFontSize, long j11, x2.d density, int i11, int i12) {
        int c11;
        kotlin.jvm.internal.s.g(setFontSize, "$this$setFontSize");
        kotlin.jvm.internal.s.g(density, "density");
        long g11 = r.g(j11);
        t.a aVar = t.f56961b;
        if (t.g(g11, aVar.b())) {
            c11 = j00.c.c(density.M(j11));
            o(setFontSize, new AbsoluteSizeSpan(c11, false), i11, i12);
        } else if (t.g(g11, aVar.a())) {
            o(setFontSize, new RelativeSizeSpan(r.h(j11)), i11, i12);
        }
    }

    private static final void k(Spannable spannable, w2.g gVar, int i11, int i12) {
        if (gVar == null) {
            return;
        }
        o(spannable, new ScaleXSpan(gVar.b()), i11, i12);
        o(spannable, new i(gVar.c()), i11, i12);
    }

    public static final void l(Spannable setLineHeight, long j11, float f11, x2.d density) {
        kotlin.jvm.internal.s.g(setLineHeight, "$this$setLineHeight");
        kotlin.jvm.internal.s.g(density, "density");
        long g11 = r.g(j11);
        t.a aVar = t.f56961b;
        if (t.g(g11, aVar.b())) {
            o(setLineHeight, new q2.e((int) Math.ceil(density.M(j11))), 0, setLineHeight.length());
        } else if (t.g(g11, aVar.a())) {
            o(setLineHeight, new q2.e((int) Math.ceil(r.h(j11) * f11)), 0, setLineHeight.length());
        }
    }

    public static final void m(Spannable spannable, t2.f fVar, int i11, int i12) {
        Object localeSpan;
        kotlin.jvm.internal.s.g(spannable, "<this>");
        if (fVar == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            localeSpan = b.f53879a.a(fVar);
        } else {
            localeSpan = new LocaleSpan(v2.a.a(fVar.isEmpty() ? t2.e.f51561b.a() : fVar.e(0)));
        }
        o(spannable, localeSpan, i11, i12);
    }

    private static final void n(Spannable spannable, a1 a1Var, int i11, int i12) {
        if (a1Var == null) {
            return;
        }
        o(spannable, new h(c0.j(a1Var.c()), s1.f.l(a1Var.d()), s1.f.m(a1Var.d()), a1Var.b()), i11, i12);
    }

    public static final void o(Spannable spannable, Object span, int i11, int i12) {
        kotlin.jvm.internal.s.g(spannable, "<this>");
        kotlin.jvm.internal.s.g(span, "span");
        spannable.setSpan(span, i11, i12, 33);
    }

    private static final void p(Spannable spannable, a.b<s> bVar, x2.d dVar, ArrayList<d> arrayList) {
        int f11 = bVar.f();
        int d11 = bVar.d();
        s e11 = bVar.e();
        f(spannable, e11.b(), f11, d11);
        g(spannable, e11.c(), f11, d11);
        r(spannable, e11.m(), f11, d11);
        j(spannable, e11.f(), dVar, f11, d11);
        i(spannable, e11.e(), f11, d11);
        k(spannable, e11.n(), f11, d11);
        m(spannable, e11.k(), f11, d11);
        e(spannable, e11.a(), f11, d11);
        n(spannable, e11.l(), f11, d11);
        MetricAffectingSpan a11 = a(e11.j(), dVar);
        if (a11 == null) {
            return;
        }
        arrayList.add(new d(a11, f11, d11));
    }

    public static final void q(Spannable spannable, a0 contextTextStyle, List<a.b<s>> spanStyles, x2.d density, j typefaceAdapter) {
        kotlin.jvm.internal.s.g(spannable, "<this>");
        kotlin.jvm.internal.s.g(contextTextStyle, "contextTextStyle");
        kotlin.jvm.internal.s.g(spanStyles, "spanStyles");
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(typefaceAdapter, "typefaceAdapter");
        h(spannable, contextTextStyle, spanStyles, typefaceAdapter);
        ArrayList arrayList = new ArrayList();
        int size = spanStyles.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            a.b<s> bVar = spanStyles.get(i11);
            int f11 = bVar.f();
            int d11 = bVar.d();
            if (f11 >= 0 && f11 < spannable.length() && d11 > f11 && d11 <= spannable.length()) {
                p(spannable, bVar, density, arrayList);
            }
            i11 = i12;
        }
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d dVar = (d) arrayList.get(i13);
            o(spannable, dVar.a(), dVar.b(), dVar.c());
        }
    }

    public static final void r(Spannable spannable, w2.e eVar, int i11, int i12) {
        kotlin.jvm.internal.s.g(spannable, "<this>");
        if (eVar == null) {
            return;
        }
        e.a aVar = w2.e.f55408b;
        o(spannable, new q2.j(eVar.d(aVar.d()), eVar.d(aVar.b())), i11, i12);
    }

    public static final void s(Spannable spannable, w2.i iVar, float f11, x2.d density) {
        float h11;
        kotlin.jvm.internal.s.g(spannable, "<this>");
        kotlin.jvm.internal.s.g(density, "density");
        if (iVar == null) {
            return;
        }
        if ((r.e(iVar.b(), x2.s.f(0)) && r.e(iVar.c(), x2.s.f(0))) || x2.s.g(iVar.b()) || x2.s.g(iVar.c())) {
            return;
        }
        long g11 = r.g(iVar.b());
        t.a aVar = t.f56961b;
        boolean g12 = t.g(g11, aVar.b());
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if (g12) {
            h11 = density.M(iVar.b());
        } else {
            h11 = t.g(g11, aVar.a()) ? r.h(iVar.b()) * f11 : 0.0f;
        }
        long g13 = r.g(iVar.c());
        if (t.g(g13, aVar.b())) {
            f12 = density.M(iVar.c());
        } else if (t.g(g13, aVar.a())) {
            f12 = r.h(iVar.c()) * f11;
        }
        o(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(h11), (int) Math.ceil(f12)), 0, spannable.length());
    }
}