package u2;

import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import n2.a;
import n2.c0;
import n2.s;
import r2.d;
import r2.l;
import r2.n;
import w2.e;

/* loaded from: classes.dex */
public final class a {
    private static final void a(SpannableString spannableString, s sVar, int i11, int i12, x2.d dVar, j jVar) {
        v2.e.g(spannableString, sVar.c(), i11, i12);
        v2.e.j(spannableString, sVar.f(), dVar, i11, i12);
        if (sVar.i() != null || sVar.g() != null) {
            l i13 = sVar.i();
            if (i13 == null) {
                i13 = l.f49091b.d();
            }
            r2.j g11 = sVar.g();
            spannableString.setSpan(new StyleSpan(j.f53025c.b(i13, g11 == null ? r2.j.f49081b.b() : g11.i())), i11, i12, 33);
        }
        if (sVar.d() != null) {
            if (sVar.d() instanceof n) {
                spannableString.setSpan(new TypefaceSpan(((n) sVar.d()).c()), i11, i12, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                r2.e d11 = sVar.d();
                r2.k h11 = sVar.h();
                spannableString.setSpan(i.f53024a.a(j.c(jVar, d11, null, 0, h11 == null ? r2.k.f49085b.a() : h11.m(), 6, null)), i11, i12, 33);
            }
        }
        if (sVar.m() != null) {
            w2.e m11 = sVar.m();
            e.a aVar = w2.e.f55408b;
            if (m11.d(aVar.d())) {
                spannableString.setSpan(new UnderlineSpan(), i11, i12, 33);
            }
            if (sVar.m().d(aVar.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i11, i12, 33);
            }
        }
        if (sVar.n() != null) {
            spannableString.setSpan(new ScaleXSpan(sVar.n().b()), i11, i12, 33);
        }
        v2.e.m(spannableString, sVar.k(), i11, i12);
        v2.e.e(spannableString, sVar.a(), i11, i12);
    }

    public static final SpannableString b(n2.a aVar, x2.d density, d.a resourceLoader) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(resourceLoader, "resourceLoader");
        SpannableString spannableString = new SpannableString(aVar.g());
        j jVar = new j(null, resourceLoader, 1, null);
        List<a.b<s>> e11 = aVar.e();
        int size = e11.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            a.b<s> bVar = e11.get(i11);
            a(spannableString, bVar.a(), bVar.b(), bVar.c(), density, jVar);
            i11 = i12;
        }
        List<a.b<c0>> h11 = aVar.h(0, aVar.length());
        int size2 = h11.size();
        for (int i13 = 0; i13 < size2; i13++) {
            a.b<c0> bVar2 = h11.get(i13);
            spannableString.setSpan(v2.g.a(bVar2.a()), bVar2.b(), bVar2.c(), 33);
        }
        return spannableString;
    }
}