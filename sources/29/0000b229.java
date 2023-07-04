package s7;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.browser.customtabs.a;
import androidx.browser.customtabs.d;
import kotlin.jvm.internal.s;
import s7.d;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f50305a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final String f50306b;

    static {
        String c11 = o7.a.c();
        s.f(c11, "getTag()");
        f50306b = c11;
    }

    private c() {
    }

    private final Intent a(Context context, Uri uri) {
        androidx.browser.customtabs.a a11 = new a.C0040a().c(l7.a.b(context)).a();
        s.f(a11, "Builder()\n            .setToolbarColor(ThemeUtil.getPrimaryThemeColor(context))\n            .build()");
        androidx.browser.customtabs.d b11 = new d.a().i(true).d(a11).b();
        s.f(b11, "Builder()\n            .setShowTitle(true)\n            .setDefaultColorSchemeParams(defaultColors)\n            .build()");
        b11.f2065a.setData(uri);
        Intent intent = b11.f2065a;
        s.f(intent, "customTabsIntent.intent");
        return intent;
    }

    public static final Intent b(Context context, Uri uri) {
        s.g(context, "context");
        s.g(uri, "uri");
        if (Build.VERSION.SDK_INT >= 30) {
            return f50305a.a(context, uri);
        }
        c cVar = f50305a;
        if (cVar.c(context, uri).a() == d.a.APPLICATION) {
            return new Intent("android.intent.action.VIEW", uri);
        }
        return cVar.a(context, uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[Catch: Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:3:0x0003, B:16:0x0038, B:18:0x0040, B:19:0x0048, B:21:0x004e, B:23:0x0058, B:24:0x0060, B:12:0x0031, B:15:0x0036, B:6:0x0026, B:9:0x002b), top: B:29:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[Catch: Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:3:0x0003, B:16:0x0038, B:18:0x0040, B:19:0x0048, B:21:0x004e, B:23:0x0058, B:24:0x0060, B:12:0x0031, B:15:0x0036, B:6:0x0026, B:9:0x002b), top: B:29:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final s7.d c(android.content.Context r5, android.net.Uri r6) {
        /*
            r4 = this;
            java.lang.String r0 = "android.intent.action.VIEW"
            r1 = 0
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> L68
            r2.<init>(r0, r6)     // Catch: java.lang.Exception -> L68
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Exception -> L68
            java.lang.String r3 = "http://"
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> L68
            r6.<init>(r0, r3)     // Catch: java.lang.Exception -> L68
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Exception -> L68
            r0 = 0
            android.content.pm.ResolveInfo r0 = r5.resolveActivity(r2, r0)     // Catch: java.lang.Exception -> L68
            r2 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r5 = r5.resolveActivity(r6, r2)     // Catch: java.lang.Exception -> L68
            if (r0 != 0) goto L26
        L24:
            r6 = r1
            goto L2d
        L26:
            android.content.pm.ActivityInfo r6 = r0.activityInfo     // Catch: java.lang.Exception -> L68
            if (r6 != 0) goto L2b
            goto L24
        L2b:
            java.lang.String r6 = r6.packageName     // Catch: java.lang.Exception -> L68
        L2d:
            if (r5 != 0) goto L31
        L2f:
            r5 = r1
            goto L38
        L31:
            android.content.pm.ActivityInfo r5 = r5.activityInfo     // Catch: java.lang.Exception -> L68
            if (r5 != 0) goto L36
            goto L2f
        L36:
            java.lang.String r5 = r5.packageName     // Catch: java.lang.Exception -> L68
        L38:
            java.lang.String r2 = "android"
            boolean r2 = kotlin.jvm.internal.s.c(r6, r2)     // Catch: java.lang.Exception -> L68
            if (r2 == 0) goto L48
            s7.d r5 = new s7.d     // Catch: java.lang.Exception -> L68
            s7.d$a r6 = s7.d.a.RESOLVER_ACTIVITY     // Catch: java.lang.Exception -> L68
            r5.<init>(r6, r0)     // Catch: java.lang.Exception -> L68
            goto L77
        L48:
            boolean r5 = kotlin.jvm.internal.s.c(r6, r5)     // Catch: java.lang.Exception -> L68
            if (r5 == 0) goto L56
            s7.d r5 = new s7.d     // Catch: java.lang.Exception -> L68
            s7.d$a r6 = s7.d.a.DEFAULT_BROWSER     // Catch: java.lang.Exception -> L68
            r5.<init>(r6, r0)     // Catch: java.lang.Exception -> L68
            goto L77
        L56:
            if (r6 != 0) goto L60
            s7.d r5 = new s7.d     // Catch: java.lang.Exception -> L68
            s7.d$a r6 = s7.d.a.UNKNOWN     // Catch: java.lang.Exception -> L68
            r5.<init>(r6, r1)     // Catch: java.lang.Exception -> L68
            goto L77
        L60:
            s7.d r5 = new s7.d     // Catch: java.lang.Exception -> L68
            s7.d$a r6 = s7.d.a.APPLICATION     // Catch: java.lang.Exception -> L68
            r5.<init>(r6, r0)     // Catch: java.lang.Exception -> L68
            goto L77
        L68:
            r5 = move-exception
            java.lang.String r6 = s7.c.f50306b
            java.lang.String r0 = "determineResolveResult exception"
            o7.b.d(r6, r0, r5)
            s7.d r5 = new s7.d
            s7.d$a r6 = s7.d.a.UNKNOWN
            r5.<init>(r6, r1)
        L77:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.c.c(android.content.Context, android.net.Uri):s7.d");
    }
}