package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import r2.d;

/* loaded from: classes.dex */
public final class a0 implements d.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2847a;

    public a0(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        this.f2847a = context;
    }

    @Override // r2.d.a
    /* renamed from: b */
    public Typeface a(r2.d font) {
        kotlin.jvm.internal.s.g(font, "font");
        if (font instanceof r2.p) {
            if (Build.VERSION.SDK_INT >= 26) {
                return b0.f2850a.a(this.f2847a, ((r2.p) font).d());
            }
            Typeface g11 = l3.h.g(this.f2847a, ((r2.p) font).d());
            kotlin.jvm.internal.s.e(g11);
            kotlin.jvm.internal.s.f(g11, "{\n                    Re…esId)!!\n                }");
            return g11;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Unknown font type: ", font));
    }
}