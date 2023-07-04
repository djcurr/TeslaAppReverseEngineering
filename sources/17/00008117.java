package kz;

import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.android.core.a0;
import io.sentry.d0;
import io.sentry.f3;
import java.io.File;
import java.nio.charset.Charset;
import org.jetbrains.annotations.ApiStatus;
import rz.j;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: g  reason: collision with root package name */
    private static final Charset f35926g = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final Context f35927a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f35928b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f35929c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f35930d;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f35931e;

    /* renamed from: f  reason: collision with root package name */
    private final Runtime f35932f;

    public f(Context context, a0 a0Var, d0 d0Var) {
        this(context, a0Var, d0Var, new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    private boolean a() {
        String[] strArr;
        for (String str : this.f35930d) {
            try {
            } catch (RuntimeException e11) {
                this.f35929c.a(f3.ERROR, e11, "Error when trying to check if root file %s exists.", str);
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    private boolean b() {
        PackageManager packageManager = this.f35927a.getPackageManager();
        if (packageManager != null) {
            for (String str : this.f35931e) {
                try {
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (0 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c() {
        /*
            r6 = this;
            java.lang.String r0 = "/system/xbin/which"
            java.lang.String r1 = "su"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = 0
            java.lang.Runtime r3 = r6.f35932f     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            java.lang.Process r2 = r3.exec(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            java.io.InputStream r4 = r2.getInputStream()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            java.nio.charset.Charset r5 = kz.f.f35926g     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = r1
        L29:
            r0.close()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
            r2.destroy()
            return r3
        L30:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
        L39:
            throw r3     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L4a
        L3a:
            r0 = move-exception
            io.sentry.d0 r3 = r6.f35929c     // Catch: java.lang.Throwable -> L59
            io.sentry.f3 r4 = io.sentry.f3.DEBUG     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "Error when trying to check if SU exists."
            r3.b(r4, r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L58
        L46:
            r2.destroy()
            goto L58
        L4a:
            io.sentry.d0 r0 = r6.f35929c     // Catch: java.lang.Throwable -> L59
            io.sentry.f3 r3 = io.sentry.f3.DEBUG     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "SU isn't found on this Device."
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L59
            r0.c(r3, r4, r5)     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L58
            goto L46
        L58:
            return r1
        L59:
            r0 = move-exception
            if (r2 == 0) goto L5f
            r2.destroy()
        L5f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kz.f.c():boolean");
    }

    private boolean d() {
        String a11 = this.f35928b.a();
        return a11 != null && a11.contains("test-keys");
    }

    public boolean e() {
        return d() || a() || c() || b();
    }

    f(Context context, a0 a0Var, d0 d0Var, String[] strArr, String[] strArr2, Runtime runtime) {
        this.f35927a = (Context) j.a(context, "The application context is required.");
        this.f35928b = (a0) j.a(a0Var, "The BuildInfoProvider is required.");
        this.f35929c = (d0) j.a(d0Var, "The Logger is required.");
        this.f35930d = (String[]) j.a(strArr, "The root Files are required.");
        this.f35931e = (String[]) j.a(strArr2, "The root packages are required.");
        this.f35932f = (Runtime) j.a(runtime, "The Runtime is required.");
    }
}