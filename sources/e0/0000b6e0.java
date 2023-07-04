package u2;

import android.text.SpannableString;
import java.util.List;
import n2.a;
import n2.a0;
import n2.p;
import n2.s;

/* loaded from: classes.dex */
public final class c {
    public static final CharSequence a(String text, float f11, a0 contextTextStyle, List<a.b<s>> spanStyles, List<a.b<p>> placeholders, x2.d density, j typefaceAdapter) {
        kotlin.jvm.internal.s.g(text, "text");
        kotlin.jvm.internal.s.g(contextTextStyle, "contextTextStyle");
        kotlin.jvm.internal.s.g(spanStyles, "spanStyles");
        kotlin.jvm.internal.s.g(placeholders, "placeholders");
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(typefaceAdapter, "typefaceAdapter");
        if (spanStyles.isEmpty() && placeholders.isEmpty() && kotlin.jvm.internal.s.c(contextTextStyle.u(), w2.i.f55424c.a()) && x2.s.g(contextTextStyle.n())) {
            return text;
        }
        SpannableString spannableString = new SpannableString(text);
        v2.e.l(spannableString, contextTextStyle.n(), f11, density);
        v2.e.s(spannableString, contextTextStyle.u(), f11, density);
        v2.e.q(spannableString, contextTextStyle, spanStyles, density, typefaceAdapter);
        v2.c.d(spannableString, placeholders, density);
        return spannableString;
    }
}