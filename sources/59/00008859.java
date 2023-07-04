package n0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f39701a = new d();

    private d() {
    }

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        kotlin.jvm.internal.s.g(context, "context");
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float b(EdgeEffect edgeEffect) {
        kotlin.jvm.internal.s.g(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public final float c(EdgeEffect edgeEffect, float f11, float f12) {
        kotlin.jvm.internal.s.g(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(f11, f12);
        } catch (Throwable unused) {
            edgeEffect.onPull(f11, f12);
            return BitmapDescriptorFactory.HUE_RED;
        }
    }
}