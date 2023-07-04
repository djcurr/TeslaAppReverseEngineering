package o2;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f42130a = new a();

    private a() {
    }

    public final BoringLayout a(CharSequence text, TextPaint paint, int i11, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z11, TextUtils.TruncateAt truncateAt, int i12) {
        s.g(text, "text");
        s.g(paint, "paint");
        s.g(metrics, "metrics");
        s.g(alignment, "alignment");
        if (i11 >= 0) {
            if (i12 >= 0) {
                if (truncateAt == null) {
                    return new BoringLayout(text, paint, i11, alignment, 1.0f, BitmapDescriptorFactory.HUE_RED, metrics, z11);
                }
                return new BoringLayout(text, paint, i11, alignment, 1.0f, BitmapDescriptorFactory.HUE_RED, metrics, z11, truncateAt, i12);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final BoringLayout.Metrics b(CharSequence text, TextPaint textPaint, TextDirectionHeuristic textDir) {
        s.g(text, "text");
        s.g(textDir, "textDir");
        if (textDir.isRtl(text, 0, text.length())) {
            return null;
        }
        return BoringLayout.isBoring(text, textPaint, null);
    }
}