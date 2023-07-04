package t1;

import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class d {
    public static final b0 a(long j11, int i11) {
        BlendModeColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            porterDuffColorFilter = q.f51499a.a(j11, i11);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c0.j(j11), a.b(i11));
        }
        return new b0(porterDuffColorFilter);
    }

    public static final ColorFilter b(b0 b0Var) {
        kotlin.jvm.internal.s.g(b0Var, "<this>");
        return b0Var.a();
    }
}