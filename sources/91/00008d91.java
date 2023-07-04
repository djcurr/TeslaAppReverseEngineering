package o2;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f42152a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final l f42153b;

    static {
        l mVar;
        if (Build.VERSION.SDK_INT >= 23) {
            mVar = new h();
        } else {
            mVar = new m();
        }
        f42153b = mVar;
    }

    private k() {
    }

    public final StaticLayout a(CharSequence text, int i11, int i12, TextPaint paint, int i13, TextDirectionHeuristic textDir, Layout.Alignment alignment, int i14, TextUtils.TruncateAt truncateAt, int i15, float f11, float f12, int i16, boolean z11, boolean z12, int i17, int i18, int[] iArr, int[] iArr2) {
        s.g(text, "text");
        s.g(paint, "paint");
        s.g(textDir, "textDir");
        s.g(alignment, "alignment");
        return f42153b.a(new n(text, i11, i12, paint, i13, textDir, alignment, i14, truncateAt, i15, f11, f12, i16, z11, z12, i17, i18, iArr, iArr2));
    }
}