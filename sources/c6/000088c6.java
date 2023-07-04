package n0;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f40103a = new o();

    private o() {
    }

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        kotlin.jvm.internal.s.g(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            return d.f39701a.a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public final float b(EdgeEffect edgeEffect) {
        kotlin.jvm.internal.s.g(edgeEffect, "<this>");
        return Build.VERSION.SDK_INT >= 31 ? d.f39701a.b(edgeEffect) : BitmapDescriptorFactory.HUE_RED;
    }

    public final void c(EdgeEffect edgeEffect, int i11) {
        kotlin.jvm.internal.s.g(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i11);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i11);
        }
    }

    public final float d(EdgeEffect edgeEffect, float f11, float f12) {
        kotlin.jvm.internal.s.g(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return d.f39701a.c(edgeEffect, f11, f12);
        }
        edgeEffect.onPull(f11, f12);
        return f11;
    }
}