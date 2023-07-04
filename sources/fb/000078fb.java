package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.DisplayMetrics;
import expo.modules.interfaces.permissions.PermissionsResponse;
import io.sentry.b3;
import io.sentry.d2;
import io.sentry.f3;
import io.sentry.protocol.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import kz.a;

/* loaded from: classes5.dex */
public final class d0 implements io.sentry.r {

    /* renamed from: a */
    final Context f32059a;

    /* renamed from: b */
    final Future<Map<String, Object>> f32060b;

    /* renamed from: c */
    private final a0 f32061c;

    /* renamed from: d */
    private final kz.f f32062d;

    /* renamed from: e */
    private final SentryAndroidOptions f32063e;

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32064a;

        static {
            int[] iArr = new int[a.EnumC0686a.values().length];
            f32064a = iArr;
            try {
                iArr[a.EnumC0686a.NOT_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32064a[a.EnumC0686a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d0(Context context, a0 a0Var, SentryAndroidOptions sentryAndroidOptions) {
        this(context, a0Var, new kz.f(context, a0Var, sentryAndroidOptions.getLogger()), sentryAndroidOptions);
    }

    private ActivityManager.MemoryInfo A() {
        try {
            ActivityManager activityManager = (ActivityManager) this.f32059a.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            this.f32063e.getLogger().c(f3.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            this.f32063e.getLogger().b(f3.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    private Long B(ActivityManager.MemoryInfo memoryInfo) {
        if (Build.VERSION.SDK_INT >= 16) {
            return Long.valueOf(memoryInfo.totalMem);
        }
        return Long.valueOf(Runtime.getRuntime().totalMemory());
    }

    private io.sentry.protocol.j C() {
        io.sentry.protocol.j jVar = new io.sentry.protocol.j();
        jVar.j("Android");
        jVar.m(Build.VERSION.RELEASE);
        jVar.h(Build.DISPLAY);
        try {
            Object obj = this.f32060b.get().get("kernelVersion");
            if (obj != null) {
                jVar.i((String) obj);
            }
            Object obj2 = this.f32060b.get().get("rooted");
            if (obj2 != null) {
                jVar.k((Boolean) obj2);
            }
        } catch (Throwable th2) {
            this.f32063e.getLogger().b(f3.ERROR, "Error getting OperatingSystem.", th2);
        }
        return jVar;
    }

    private e.b D() {
        e.b bVar;
        Throwable th2;
        try {
            bVar = kz.c.a(this.f32059a.getResources().getConfiguration().orientation);
            if (bVar == null) {
                try {
                    this.f32063e.getLogger().c(f3.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    this.f32063e.getLogger().b(f3.ERROR, "Error getting device orientation.", th2);
                    return bVar;
                }
            }
        } catch (Throwable th4) {
            bVar = null;
            th2 = th4;
        }
        return bVar;
    }

    private Map<String, String> E() {
        String str;
        try {
            PackageInfo b11 = b0.b(this.f32059a, this.f32063e.getLogger());
            PackageManager packageManager = this.f32059a.getPackageManager();
            if (b11 != null && packageManager != null) {
                str = b11.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    HashMap hashMap = new HashMap();
                    if (installerPackageName != null) {
                        hashMap.put("isSideLoaded", "false");
                        hashMap.put("installerStore", installerPackageName);
                    } else {
                        hashMap.put("isSideLoaded", "true");
                    }
                    return hashMap;
                } catch (IllegalArgumentException unused) {
                    this.f32063e.getLogger().c(f3.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    private TimeZone F() {
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = this.f32059a.getResources().getConfiguration().getLocales();
            if (!locales.isEmpty()) {
                return Calendar.getInstance(locales.get(0)).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    private Long G(StatFs statFs) {
        try {
            return Long.valueOf(m(statFs) * o(statFs));
        } catch (Throwable th2) {
            this.f32063e.getLogger().b(f3.ERROR, "Error getting total external storage amount.", th2);
            return null;
        }
    }

    private Long H(StatFs statFs) {
        try {
            return Long.valueOf(m(statFs) * o(statFs));
        } catch (Throwable th2) {
            this.f32063e.getLogger().b(f3.ERROR, "Error getting total internal storage amount.", th2);
            return null;
        }
    }

    private Long I(StatFs statFs) {
        try {
            return Long.valueOf(h(statFs) * o(statFs));
        } catch (Throwable th2) {
            this.f32063e.getLogger().b(f3.ERROR, "Error getting unused external storage amount.", th2);
            return null;
        }
    }

    private Long J(StatFs statFs) {
        try {
            return Long.valueOf(h(statFs) * o(statFs));
        } catch (Throwable th2) {
            this.f32063e.getLogger().b(f3.ERROR, "Error getting unused internal storage amount.", th2);
            return null;
        }
    }

    private Boolean K(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z11 = true;
            if (intExtra != 1 && intExtra != 2) {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        } catch (Throwable th2) {
            this.f32063e.getLogger().b(f3.ERROR, "Error getting device charging state.", th2);
            return null;
        }
    }

    private boolean L() {
        String externalStorageState = Environment.getExternalStorageState();
        return ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && !Environment.isExternalStorageEmulated();
    }

    /* renamed from: N */
    public Map<String, Object> M() {
        HashMap hashMap = new HashMap();
        hashMap.put("rooted", Boolean.valueOf(this.f32062d.e()));
        String z11 = z();
        if (z11 != null) {
            hashMap.put("kernelVersion", z11);
        }
        hashMap.put("emulator", this.f32061c.f());
        Map<String, String> E = E();
        if (E != null) {
            hashMap.put("sideLoaded", E);
        }
        return hashMap;
    }

    private void O(d2 d2Var) {
        String str;
        io.sentry.protocol.j c11 = d2Var.B().c();
        d2Var.B().l(C());
        if (c11 != null) {
            String g11 = c11.g();
            if (g11 == null || g11.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + g11.trim().toLowerCase(Locale.ROOT);
            }
            d2Var.B().put(str, c11);
        }
    }

    private void P(d2 d2Var) {
        io.sentry.protocol.w O = d2Var.O();
        if (O == null) {
            d2Var.b0(q());
        } else if (O.g() == null) {
            O.l(s());
        }
    }

    private void Q(d2 d2Var) {
        io.sentry.protocol.a a11 = d2Var.B().a();
        if (a11 == null) {
            a11 = new io.sentry.protocol.a();
        }
        R(a11);
        Y(d2Var, a11);
        d2Var.B().h(a11);
    }

    private void R(io.sentry.protocol.a aVar) {
        aVar.k(e());
        aVar.l(y.c().b());
    }

    private void S(io.sentry.protocol.a aVar, PackageInfo packageInfo) {
        aVar.j(packageInfo.packageName);
        aVar.m(packageInfo.versionName);
        aVar.i(b0.c(packageInfo));
        if (this.f32061c.d() >= 16) {
            HashMap hashMap = new HashMap();
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    String str = strArr[i11];
                    hashMap.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i11] & 2) == 2 ? PermissionsResponse.GRANTED_KEY : "not_granted");
                }
            }
            aVar.n(hashMap);
        }
    }

    private void T(io.sentry.protocol.e eVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            eVar.J(Build.SUPPORTED_ABIS);
        } else {
            eVar.J(new String[]{c(), d()});
        }
    }

    private void U(d2 d2Var, boolean z11, boolean z12) {
        P(d2Var);
        V(d2Var, z11, z12);
        O(d2Var);
        Z(d2Var);
    }

    private void V(d2 d2Var, boolean z11, boolean z12) {
        if (d2Var.B().b() == null) {
            d2Var.B().j(r(z11, z12));
        }
    }

    private void W(io.sentry.protocol.e eVar, boolean z11) {
        Boolean bool;
        Intent i11 = i();
        if (i11 != null) {
            eVar.K(j(i11));
            eVar.O(K(i11));
            eVar.L(k(i11));
        }
        int i12 = a.f32064a[kz.a.b(this.f32059a, this.f32063e.getLogger()).ordinal()];
        if (i12 != 1) {
            bool = i12 != 2 ? null : Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        eVar.e0(bool);
        ActivityManager.MemoryInfo A = A();
        if (A != null) {
            eVar.a0(B(A));
            if (z11) {
                eVar.T(Long.valueOf(A.availMem));
                eVar.Y(Boolean.valueOf(A.lowMemory));
            }
        }
        File externalFilesDir = this.f32059a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs = new StatFs(externalFilesDir.getPath());
            eVar.l0(H(statFs));
            eVar.U(J(statFs));
        }
        StatFs x11 = x(externalFilesDir);
        if (x11 != null) {
            eVar.R(G(x11));
            eVar.Q(I(x11));
        }
        if (eVar.F() == null) {
            eVar.P(kz.a.c(this.f32059a, this.f32063e.getLogger(), this.f32061c));
        }
    }

    private void X(d2 d2Var, String str) {
        if (d2Var.C() == null) {
            d2Var.Q(str);
        }
    }

    private void Y(d2 d2Var, io.sentry.protocol.a aVar) {
        PackageInfo a11 = b0.a(this.f32059a, 4096, this.f32063e.getLogger());
        if (a11 != null) {
            X(d2Var, b0.c(a11));
            S(aVar, a11);
        }
    }

    private void Z(d2 d2Var) {
        try {
            Object obj = this.f32060b.get().get("sideLoaded");
            if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    d2Var.Z((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.f32063e.getLogger().b(f3.ERROR, "Error getting side loaded info.", th2);
        }
    }

    private void a0(b3 b3Var) {
        if (b3Var.p0() != null) {
            for (io.sentry.protocol.u uVar : b3Var.p0()) {
                if (uVar.j() == null) {
                    uVar.l(Boolean.valueOf(kz.d.c(uVar)));
                }
            }
        }
    }

    public static /* synthetic */ Map b(d0 d0Var) {
        return d0Var.M();
    }

    private boolean b0(d2 d2Var, io.sentry.t tVar) {
        if (rz.h.q(tVar)) {
            return true;
        }
        this.f32063e.getLogger().c(f3.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", d2Var.E());
        return false;
    }

    private String c() {
        return Build.CPU_ABI;
    }

    private String d() {
        return Build.CPU_ABI2;
    }

    private String e() {
        try {
            ApplicationInfo applicationInfo = this.f32059a.getApplicationInfo();
            int i11 = applicationInfo.labelRes;
            if (i11 == 0) {
                CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                if (charSequence != null) {
                    return charSequence.toString();
                }
                return this.f32059a.getPackageManager().getApplicationLabel(applicationInfo).toString();
            }
            return this.f32059a.getString(i11);
        } catch (Throwable th2) {
            this.f32063e.getLogger().b(f3.ERROR, "Error getting application name.", th2);
            return null;
        }
    }

    private int f(StatFs statFs) {
        return statFs.getAvailableBlocks();
    }

    private long h(StatFs statFs) {
        if (Build.VERSION.SDK_INT >= 18) {
            return statFs.getAvailableBlocksLong();
        }
        return f(statFs);
    }

    private Intent i() {
        return this.f32059a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    private Float j(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th2) {
            this.f32063e.getLogger().b(f3.ERROR, "Error getting device battery level.", th2);
            return null;
        }
    }

    private Float k(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th2) {
            this.f32063e.getLogger().b(f3.ERROR, "Error getting battery temperature.", th2);
            return null;
        }
    }

    private int l(StatFs statFs) {
        return statFs.getBlockCount();
    }

    private long m(StatFs statFs) {
        if (Build.VERSION.SDK_INT >= 18) {
            return statFs.getBlockCountLong();
        }
        return l(statFs);
    }

    private int n(StatFs statFs) {
        return statFs.getBlockSize();
    }

    private long o(StatFs statFs) {
        if (Build.VERSION.SDK_INT >= 18) {
            return statFs.getBlockSizeLong();
        }
        return n(statFs);
    }

    private Date p() {
        try {
            return io.sentry.g.c(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e11) {
            this.f32063e.getLogger().a(f3.ERROR, e11, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    private io.sentry.protocol.e r(boolean z11, boolean z12) {
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        eVar.d0(t());
        eVar.Z(Build.MANUFACTURER);
        eVar.N(Build.BRAND);
        eVar.S(y());
        eVar.b0(Build.MODEL);
        eVar.c0(Build.ID);
        T(eVar);
        if (z11 && this.f32063e.isCollectAdditionalContext()) {
            W(eVar, z12);
        }
        eVar.f0(D());
        try {
            Object obj = this.f32060b.get().get("emulator");
            if (obj != null) {
                eVar.k0((Boolean) obj);
            }
        } catch (Throwable th2) {
            this.f32063e.getLogger().b(f3.ERROR, "Error getting emulator.", th2);
        }
        DisplayMetrics u11 = u();
        if (u11 != null) {
            eVar.j0(Integer.valueOf(u11.widthPixels));
            eVar.i0(Integer.valueOf(u11.heightPixels));
            eVar.g0(Float.valueOf(u11.density));
            eVar.h0(Integer.valueOf(u11.densityDpi));
        }
        eVar.M(p());
        eVar.m0(F());
        if (eVar.G() == null) {
            eVar.V(s());
        }
        Locale locale = Locale.getDefault();
        if (eVar.H() == null) {
            eVar.W(locale.getLanguage());
        }
        if (eVar.I() == null) {
            eVar.X(locale.toString());
        }
        return eVar;
    }

    private String s() {
        try {
            return h0.a(this.f32059a);
        } catch (Throwable th2) {
            this.f32063e.getLogger().b(f3.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    private String t() {
        if (Build.VERSION.SDK_INT >= 17) {
            return Settings.Global.getString(this.f32059a.getContentResolver(), "device_name");
        }
        return null;
    }

    private DisplayMetrics u() {
        try {
            return this.f32059a.getResources().getDisplayMetrics();
        } catch (Throwable th2) {
            this.f32063e.getLogger().b(f3.ERROR, "Error getting DisplayMetrics.", th2);
            return null;
        }
    }

    private File[] v() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f32059a.getExternalFilesDirs(null);
        }
        File externalFilesDir = this.f32059a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            return new File[]{externalFilesDir};
        }
        return null;
    }

    private File w(File file) {
        File[] v11 = v();
        if (v11 != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : v11) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.f32063e.getLogger().c(f3.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    private StatFs x(File file) {
        if (!L()) {
            File w11 = w(file);
            if (w11 != null) {
                return new StatFs(w11.getPath());
            }
            this.f32063e.getLogger().c(f3.INFO, "Not possible to read external files directory", new Object[0]);
            return null;
        }
        this.f32063e.getLogger().c(f3.INFO, "External storage is not mounted or emulated.", new Object[0]);
        return null;
    }

    private String y() {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th2) {
            this.f32063e.getLogger().b(f3.ERROR, "Error getting device family.", th2);
            return null;
        }
    }

    private String z() {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                return readLine;
            } catch (IOException e11) {
                this.f32063e.getLogger().b(f3.ERROR, "Exception while attempting to read kernel information", e11);
                return property;
            }
        }
        return property;
    }

    @Override // io.sentry.r
    public b3 a(b3 b3Var, io.sentry.t tVar) {
        boolean b02 = b0(b3Var, tVar);
        if (b02) {
            Q(b3Var);
            a0(b3Var);
        }
        U(b3Var, true, b02);
        return b3Var;
    }

    @Override // io.sentry.r
    public io.sentry.protocol.v g(io.sentry.protocol.v vVar, io.sentry.t tVar) {
        boolean b02 = b0(vVar, tVar);
        if (b02) {
            Q(vVar);
        }
        U(vVar, false, b02);
        return vVar;
    }

    public io.sentry.protocol.w q() {
        io.sentry.protocol.w wVar = new io.sentry.protocol.w();
        wVar.l(s());
        return wVar;
    }

    d0(Context context, a0 a0Var, kz.f fVar, SentryAndroidOptions sentryAndroidOptions) {
        this.f32059a = (Context) rz.j.a(context, "The application context is required.");
        this.f32061c = (a0) rz.j.a(a0Var, "The BuildInfoProvider is required.");
        this.f32062d = (kz.f) rz.j.a(fVar, "The RootChecker is required.");
        this.f32063e = (SentryAndroidOptions) rz.j.a(sentryAndroidOptions, "The options object is required.");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f32060b = newSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.c0
            {
                d0.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d0.b(d0.this);
            }
        });
        newSingleThreadExecutor.shutdown();
    }
}