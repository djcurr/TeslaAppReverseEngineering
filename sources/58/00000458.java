package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;

/* loaded from: classes.dex */
final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f2850a = new b0();

    private b0() {
    }

    public final Typeface a(Context context, int i11) {
        kotlin.jvm.internal.s.g(context, "context");
        Typeface font = context.getResources().getFont(i11);
        kotlin.jvm.internal.s.f(font, "context.resources.getFont(resourceId)");
        return font;
    }
}