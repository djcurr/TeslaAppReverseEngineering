package o2;

import android.text.Spanned;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g {
    public static final boolean a(Spanned spanned, Class<?> clazz) {
        s.g(spanned, "<this>");
        s.g(clazz, "clazz");
        return spanned.nextSpanTransition(-1, spanned.length(), clazz) != spanned.length();
    }
}