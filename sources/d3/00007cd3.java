package k2;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.z;
import c1.i;
import java.util.Arrays;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class e {
    private static final Resources a(i iVar, int i11) {
        iVar.A(z.f());
        Resources resources = ((Context) iVar.A(z.g())).getResources();
        s.f(resources, "LocalContext.current.resources");
        return resources;
    }

    public static final String b(int i11, i iVar, int i12) {
        String string = a(iVar, 0).getString(i11);
        s.f(string, "resources.getString(id)");
        return string;
    }

    public static final String c(int i11, Object[] formatArgs, i iVar, int i12) {
        s.g(formatArgs, "formatArgs");
        String string = a(iVar, 0).getString(i11, Arrays.copyOf(formatArgs, formatArgs.length));
        s.f(string, "resources.getString(id, *formatArgs)");
        return string;
    }
}