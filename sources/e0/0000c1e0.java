package y5;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a implements b<Uri, File> {
    @Override // y5.b
    /* renamed from: c */
    public boolean a(Uri data) {
        s.g(data, "data");
        if (s.c(data.getScheme(), Action.FILE_ATTRIBUTE)) {
            String c11 = g6.e.c(data);
            return c11 != null && (s.c(c11, "android_asset") ^ true);
        }
        return false;
    }

    @Override // y5.b
    /* renamed from: d */
    public File b(Uri data) {
        s.g(data, "data");
        return q3.b.a(data);
    }
}