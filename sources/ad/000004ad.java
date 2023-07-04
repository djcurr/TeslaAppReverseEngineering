package androidx.compose.ui.platform;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import n2.a;

/* loaded from: classes.dex */
public final class m {
    public static final n2.a a(CharSequence charSequence) {
        int L;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new n2.a(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i11 = 0;
        Annotation[] annotations = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        kotlin.jvm.internal.s.f(annotations, "annotations");
        L = wz.p.L(annotations);
        if (L >= 0) {
            while (true) {
                int i12 = i11 + 1;
                Annotation annotation = annotations[i11];
                if (kotlin.jvm.internal.s.c(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    int spanStart = spanned.getSpanStart(annotation);
                    int spanEnd = spanned.getSpanEnd(annotation);
                    String value = annotation.getValue();
                    kotlin.jvm.internal.s.f(value, "span.value");
                    arrayList.add(new a.b(new m0(value).k(), spanStart, spanEnd));
                }
                if (i11 == L) {
                    break;
                }
                i11 = i12;
            }
        }
        return new n2.a(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence b(n2.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        if (aVar.e().isEmpty()) {
            return aVar.g();
        }
        SpannableString spannableString = new SpannableString(aVar.g());
        t0 t0Var = new t0();
        List<a.b<n2.s>> e11 = aVar.e();
        int i11 = 0;
        int size = e11.size();
        while (i11 < size) {
            int i12 = i11 + 1;
            a.b<n2.s> bVar = e11.get(i11);
            int b11 = bVar.b();
            int c11 = bVar.c();
            t0Var.q();
            t0Var.e(bVar.a());
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", t0Var.p()), b11, c11, 33);
            i11 = i12;
        }
        return spannableString;
    }
}