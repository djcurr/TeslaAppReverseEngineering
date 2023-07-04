package q3;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b {
    public static final File a(Uri uri) {
        s.g(uri, "<this>");
        if (s.c(uri.getScheme(), Action.FILE_ATTRIBUTE)) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(s.p("Uri path is null: ", uri).toString());
        }
        throw new IllegalArgumentException(s.p("Uri lacks 'file' scheme: ", uri).toString());
    }
}