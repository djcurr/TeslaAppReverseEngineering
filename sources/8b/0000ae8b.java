package qu;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class b {
    public static final Uri a(File file, Context context) {
        s.g(file, "<this>");
        s.g(context, "context");
        Uri uriForFile = FileProvider.getUriForFile(context, "com.teslamotors.tesla-fileprovider", file);
        s.f(uriForFile, "getUriForFile(\n    conte…leprovider\",\n    this\n  )");
        return uriForFile;
    }
}