package y0;

import android.content.Context;
import android.content.res.Resources;
import y0.z0;

/* loaded from: classes.dex */
public final class a1 {
    public static final String a(int i11, c1.i iVar, int i12) {
        String str;
        iVar.x(-845575816);
        iVar.A(androidx.compose.ui.platform.z.f());
        Resources resources = ((Context) iVar.A(androidx.compose.ui.platform.z.g())).getResources();
        z0.a aVar = z0.f58722a;
        if (z0.g(i11, aVar.e())) {
            str = resources.getString(o1.h.f42097h);
            kotlin.jvm.internal.s.f(str, "resources.getString(R.string.navigation_menu)");
        } else if (z0.g(i11, aVar.a())) {
            str = resources.getString(o1.h.f42090a);
            kotlin.jvm.internal.s.f(str, "resources.getString(R.string.close_drawer)");
        } else if (z0.g(i11, aVar.b())) {
            str = resources.getString(o1.h.f42091b);
            kotlin.jvm.internal.s.f(str, "resources.getString(R.string.close_sheet)");
        } else if (z0.g(i11, aVar.c())) {
            str = resources.getString(o1.h.f42092c);
            kotlin.jvm.internal.s.f(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (z0.g(i11, aVar.d())) {
            str = resources.getString(o1.h.f42094e);
            kotlin.jvm.internal.s.f(str, "resources.getString(R.string.dropdown_menu)");
        } else {
            str = "";
        }
        iVar.N();
        return str;
    }
}