package fu;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.tesla.logging.g;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final g f27033a = g.f21878b.a("NavigationProvider");

    public static final /* synthetic */ g a() {
        return f27033a;
    }

    public static final Intent b() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(268435456);
        return intent;
    }

    public static final boolean c(Context context, String pkg) {
        s.g(context, "<this>");
        s.g(pkg, "pkg");
        try {
            context.getPackageManager().getPackageInfo(pkg, 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}