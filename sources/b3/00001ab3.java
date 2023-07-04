package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes3.dex */
public class SoLoader {

    /* renamed from: a */
    static final boolean f12866a;

    /* renamed from: b */
    static p f12867b;

    /* renamed from: f */
    private static s[] f12871f;

    /* renamed from: g */
    private static com.facebook.soloader.b f12872g;

    /* renamed from: m */
    private static int f12878m;

    /* renamed from: c */
    private static final ReentrantReadWriteLock f12868c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private static q[] f12869d = null;

    /* renamed from: e */
    private static final AtomicInteger f12870e = new AtomicInteger(0);

    /* renamed from: h */
    private static final HashSet<String> f12873h = new HashSet<>();

    /* renamed from: i */
    private static final Map<String, Object> f12874i = new HashMap();

    /* renamed from: j */
    private static final Set<String> f12875j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k */
    private static r f12876k = null;

    /* renamed from: l */
    private static final String[] f12877l = {System.mapLibraryName("breakpad")};

    /* renamed from: n */
    private static int f12879n = 0;

    @e
    /* loaded from: classes3.dex */
    public static class Api14Utils {
        Api14Utils() {
        }

        public static String a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader != null && !(classLoader instanceof BaseDexClassLoader)) {
                throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
            }
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
            } catch (Exception e11) {
                throw new RuntimeException("Cannot call getLdLibraryPath", e11);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class a implements p {

        /* renamed from: a */
        final /* synthetic */ boolean f12880a;

        /* renamed from: b */
        final /* synthetic */ String f12881b;

        /* renamed from: c */
        final /* synthetic */ String f12882c;

        /* renamed from: d */
        final /* synthetic */ Runtime f12883d;

        /* renamed from: e */
        final /* synthetic */ Method f12884e;

        a(boolean z11, String str, String str2, Runtime runtime, Method method) {
            this.f12880a = z11;
            this.f12881b = str;
            this.f12882c = str2;
            this.f12883d = runtime;
            this.f12884e = method;
        }

        private String c(String str) {
            try {
                File file = new File(str);
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read > 0) {
                            messageDigest.update(bArr, 0, read);
                        } else {
                            String format = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                            fileInputStream.close();
                            return format;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException | SecurityException | NoSuchAlgorithmException e11) {
                return e11.toString();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:114:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0035, code lost:
            if (r1 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0037, code lost:
            android.util.Log.e("SoLoader", "Error when loading lib: " + r1 + " lib hash: " + c(r9) + " search path is " + r10);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:103:0x009e  */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // com.facebook.soloader.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(java.lang.String r9, int r10) {
            /*
                Method dump skipped, instructions count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.a.a(java.lang.String, int):void");
        }

        @Override // com.facebook.soloader.p
        public void b(String str, f fVar, int i11) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends UnsatisfiedLinkError {
        b(Throwable th2, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.j()) + " error: " + str);
            initCause(th2);
        }
    }

    static {
        boolean z11 = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z11 = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        f12866a = z11;
    }

    private static void a(Context context, ArrayList<q> arrayList, int i11) {
        if ((f12878m & 8) != 0) {
            f12871f = null;
            File r11 = s.r(context, "lib-main");
            try {
                SysUtil.c(r11);
                return;
            } catch (IOException e11) {
                Log.w("SoLoader", "Failed to delete " + r11.getCanonicalPath(), e11);
                return;
            }
        }
        File file = new File(context.getApplicationInfo().sourceDir);
        ArrayList arrayList2 = new ArrayList();
        com.facebook.soloader.a aVar = new com.facebook.soloader.a(context, file, "lib-main", i11);
        arrayList2.add(aVar);
        if (Log.isLoggable("SoLoader", 3)) {
            Log.d("SoLoader", "adding backup source from : " + aVar.toString());
        }
        d(context, i11, arrayList2);
        f12871f = (s[]) arrayList2.toArray(new s[arrayList2.size()]);
        arrayList.addAll(0, arrayList2);
    }

    private static void b(ArrayList<q> arrayList, String[] strArr) {
        String str = SysUtil.k() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str + ":" + str2;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(":")))) {
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "adding system library source: " + str3);
            }
            arrayList.add(new d(new File(str3), 2, strArr));
        }
    }

    private static void c(Context context, ArrayList<q> arrayList, int i11) {
        if (Build.VERSION.SDK_INT <= 17) {
            i11 |= 1;
        }
        f12872g = new com.facebook.soloader.b(context, i11);
        if (Log.isLoggable("SoLoader", 3)) {
            Log.d("SoLoader", "adding application source: " + f12872g.toString());
        }
        arrayList.add(0, f12872g);
    }

    private static void d(Context context, int i11, ArrayList<s> arrayList) {
        if (Build.VERSION.SDK_INT < 21 || context.getApplicationInfo().splitSourceDirs == null) {
            return;
        }
        if (Log.isLoggable("SoLoader", 3)) {
            Log.d("SoLoader", "adding backup sources from split apks");
        }
        String[] strArr = context.getApplicationInfo().splitSourceDirs;
        int length = strArr.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            File file = new File(strArr[i12]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("lib-");
            int i14 = i13 + 1;
            sb2.append(i13);
            com.facebook.soloader.a aVar = new com.facebook.soloader.a(context, file, sb2.toString(), i11);
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "adding backup source: " + aVar.toString());
            }
            arrayList.add(aVar);
            i12++;
            i13 = i14;
        }
    }

    private static void e(Context context, ArrayList<q> arrayList) {
        if (Build.VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "adding directApk sources from split apks");
            }
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                c cVar = new c(new File(str));
                if (Log.isLoggable("SoLoader", 3)) {
                    Log.d("SoLoader", "adding directApk source: " + cVar.toString());
                }
                arrayList.add(0, cVar);
            }
        }
        c cVar2 = new c(context);
        if (Log.isLoggable("SoLoader", 3)) {
            Log.d("SoLoader", "adding directApk source: " + cVar2.toString());
        }
        arrayList.add(0, cVar2);
    }

    private static void f() {
        if (!o()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    private static void g(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        boolean z11;
        int i12;
        ReentrantReadWriteLock reentrantReadWriteLock;
        s[] sVarArr;
        ReentrantReadWriteLock reentrantReadWriteLock2 = f12868c;
        reentrantReadWriteLock2.readLock().lock();
        try {
            if (f12869d != null) {
                reentrantReadWriteLock2.readLock().unlock();
                int i13 = 0;
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (f12866a) {
                    Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
                }
                try {
                    reentrantReadWriteLock2.readLock().lock();
                    i12 = 0;
                    int i14 = 0;
                    while (i12 == 0) {
                        q[] qVarArr = f12869d;
                        if (i14 < qVarArr.length) {
                            i12 = qVarArr[i14].a(str, i11, threadPolicy);
                            if (i12 != 3 || f12871f == null) {
                                i14++;
                            } else {
                                if (Log.isLoggable("SoLoader", 3)) {
                                    Log.d("SoLoader", "Trying backup SoSource for " + str);
                                }
                                for (s sVar : f12871f) {
                                    sVar.t(str);
                                    int a11 = sVar.a(str, i11, threadPolicy);
                                    if (a11 == 1) {
                                        i12 = a11;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    if (f12866a) {
                        Api18TraceUtils.b();
                    }
                    if (z11) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    if (i12 == 0 || i12 == 3) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("couldn't find DSO to load: ");
                        sb2.append(str);
                        reentrantReadWriteLock.readLock().lock();
                        while (i13 < f12869d.length) {
                            sb2.append("\n\tSoSource ");
                            sb2.append(i13);
                            sb2.append(": ");
                            sb2.append(f12869d[i13].toString());
                            i13++;
                        }
                        com.facebook.soloader.b bVar = f12872g;
                        if (bVar != null) {
                            File e11 = com.facebook.soloader.b.e(bVar.f());
                            sb2.append("\n\tNative lib dir: ");
                            sb2.append(e11.getAbsolutePath());
                            sb2.append("\n");
                        }
                        f12868c.readLock().unlock();
                        sb2.append(" result: ");
                        sb2.append(i12);
                        String sb3 = sb2.toString();
                        Log.e("SoLoader", sb3);
                        throw new UnsatisfiedLinkError(sb3);
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    i13 = i12;
                    if (f12866a) {
                        Api18TraceUtils.b();
                    }
                    if (z11) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    if (i13 == 0 || i13 == 3) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("couldn't find DSO to load: ");
                        sb4.append(str);
                        String message = th.getMessage();
                        if (message == null) {
                            message = th.toString();
                        }
                        sb4.append(" caused by: ");
                        sb4.append(message);
                        th.printStackTrace();
                        sb4.append(" result: ");
                        sb4.append(i13);
                        String sb5 = sb4.toString();
                        Log.e("SoLoader", sb5);
                        UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(sb5);
                        unsatisfiedLinkError.initCause(th);
                        throw unsatisfiedLinkError;
                    }
                    return;
                }
            }
            Log.e("SoLoader", "Could not load: " + str + " because no SO source exists");
            throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
        } finally {
            f12868c.readLock().unlock();
        }
    }

    private static int h(Context context, int i11) {
        int i12 = f12879n;
        if (i12 != 0) {
            return i12;
        }
        if ((i11 & 32) == 0 && context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i13 = applicationInfo.flags;
            r0 = (i13 & 1) != 0 ? (i13 & 128) != 0 ? 3 : 2 : 1;
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + r0);
            }
        }
        return r0;
    }

    private static int i() {
        int i11 = f12879n;
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return 1;
            }
            throw new RuntimeException("Unsupported app type, we should not reach here");
        }
        return 0;
    }

    public static void init(Context context, int i11) {
        k(context, i11, null, f12877l);
    }

    private static Method j() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && i11 <= 27) {
            try {
                Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException | SecurityException e11) {
                Log.w("SoLoader", "Cannot get nativeLoad method", e11);
            }
        }
        return null;
    }

    public static void k(Context context, int i11, p pVar, String[] strArr) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            if (SysUtil.l(context)) {
                i11 |= 8;
            }
            f12879n = h(context, i11);
            m(pVar);
            n(context, i11, strArr);
            yg.a.b(new o());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    public static void l(Context context, boolean z11) {
        try {
            k(context, z11 ? 1 : 0, null, f12877l);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static synchronized void m(p pVar) {
        synchronized (SoLoader.class) {
            if (pVar == null) {
                if (f12867b != null) {
                    return;
                }
            }
            if (pVar != null) {
                f12867b = pVar;
                return;
            }
            Runtime runtime = Runtime.getRuntime();
            Method j11 = j();
            boolean z11 = j11 != null;
            String a11 = z11 ? Api14Utils.a() : null;
            f12867b = new a(z11, a11, v(a11), runtime, j11);
        }
    }

    private static void n(Context context, int i11, String[] strArr) {
        if (f12869d != null) {
            return;
        }
        f12868c.writeLock().lock();
        try {
            f12878m = i11;
            ArrayList arrayList = new ArrayList();
            b(arrayList, strArr);
            if (context != null) {
                if ((i11 & 1) != 0) {
                    f12871f = null;
                    if (Log.isLoggable("SoLoader", 3)) {
                        Log.d("SoLoader", "adding exo package source: lib-main");
                    }
                    arrayList.add(0, new i(context, "lib-main"));
                } else {
                    if (SysUtil.m(context, f12879n)) {
                        e(context, arrayList);
                    }
                    c(context, arrayList, i());
                    a(context, arrayList, 1);
                }
            }
            q[] qVarArr = (q[]) arrayList.toArray(new q[arrayList.size()]);
            int w11 = w();
            int length = qVarArr.length;
            while (true) {
                int i12 = length - 1;
                if (length <= 0) {
                    break;
                }
                if (Log.isLoggable("SoLoader", 3)) {
                    Log.d("SoLoader", "Preparing SO source: " + qVarArr[i12]);
                }
                qVarArr[i12].b(w11);
                length = i12;
            }
            f12869d = qVarArr;
            f12870e.getAndIncrement();
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "init finish: " + f12869d.length + " SO sources prepared");
            }
        } finally {
            f12868c.writeLock().unlock();
        }
    }

    public static boolean o() {
        ReentrantReadWriteLock reentrantReadWriteLock = f12868c;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z11 = f12869d != null;
            reentrantReadWriteLock.readLock().unlock();
            return z11;
        } catch (Throwable th2) {
            f12868c.readLock().unlock();
            throw th2;
        }
    }

    public static boolean p(String str) {
        return q(str, 0);
    }

    public static boolean q(String str, int i11) {
        r rVar;
        Boolean u11 = u(str);
        if (u11 != null) {
            return u11.booleanValue();
        }
        int i12 = f12879n;
        if ((i12 == 2 || i12 == 3) && (rVar = f12876k) != null) {
            rVar.a(str);
            return true;
        }
        String b11 = l.b(str);
        return s(System.mapLibraryName(b11 != null ? b11 : str), str, b11, i11, null);
    }

    public static void r(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        t(str, null, null, i11, threadPolicy);
    }

    private static boolean s(String str, String str2, String str3, int i11, StrictMode.ThreadPolicy threadPolicy) {
        boolean z11;
        boolean z12 = false;
        do {
            try {
                z12 = t(str, str2, str3, i11, threadPolicy);
                z11 = false;
                continue;
            } catch (UnsatisfiedLinkError e11) {
                int i12 = f12870e.get();
                f12868c.writeLock().lock();
                try {
                    try {
                        if (f12872g == null || !f12872g.d()) {
                            z11 = false;
                        } else {
                            Log.w("SoLoader", "sApplicationSoSource updated during load: " + str + ", attempting load again.");
                            f12870e.getAndIncrement();
                            z11 = true;
                        }
                        f12868c.writeLock().unlock();
                        if (f12870e.get() == i12) {
                            throw e11;
                        }
                    } catch (IOException e12) {
                        throw new RuntimeException(e12);
                    }
                } catch (Throwable th2) {
                    f12868c.writeLock().unlock();
                    throw th2;
                }
            }
        } while (z11);
        return z12;
    }

    private static boolean t(String str, String str2, String str3, int i11, StrictMode.ThreadPolicy threadPolicy) {
        boolean z11;
        Object obj;
        boolean z12 = false;
        if (TextUtils.isEmpty(str2) || !f12875j.contains(str2)) {
            synchronized (SoLoader.class) {
                HashSet<String> hashSet = f12873h;
                if (!hashSet.contains(str)) {
                    z11 = false;
                } else if (str3 == null) {
                    return false;
                } else {
                    z11 = true;
                }
                Map<String, Object> map = f12874i;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj2 = new Object();
                    map.put(str, obj2);
                    obj = obj2;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = f12868c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        if (!z11) {
                            synchronized (SoLoader.class) {
                                if (hashSet.contains(str)) {
                                    if (str3 == null) {
                                        reentrantReadWriteLock.readLock().unlock();
                                        return false;
                                    }
                                    z11 = true;
                                }
                                if (!z11) {
                                    try {
                                        if (Log.isLoggable("SoLoader", 3)) {
                                            Log.d("SoLoader", "About to load: " + str);
                                        }
                                        g(str, i11, threadPolicy);
                                        if (Log.isLoggable("SoLoader", 3)) {
                                            Log.d("SoLoader", "Loaded: " + str);
                                        }
                                        synchronized (SoLoader.class) {
                                            hashSet.add(str);
                                        }
                                    } catch (UnsatisfiedLinkError e11) {
                                        String message = e11.getMessage();
                                        if (message != null && message.contains("unexpected e_machine:")) {
                                            throw new b(e11, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                        }
                                        throw e11;
                                    }
                                }
                            }
                        }
                        if ((i11 & 16) == 0) {
                            if (!TextUtils.isEmpty(str2) && f12875j.contains(str2)) {
                                z12 = true;
                            }
                            if (str3 != null && !z12) {
                                boolean z13 = f12866a;
                                if (z13) {
                                    Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                }
                                try {
                                    if (Log.isLoggable("SoLoader", 3)) {
                                        Log.d("SoLoader", "About to merge: " + str2 + " / " + str);
                                    }
                                    l.a(str2);
                                    f12875j.add(str2);
                                    if (z13) {
                                        Api18TraceUtils.b();
                                    }
                                } catch (UnsatisfiedLinkError e12) {
                                    throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e12);
                                }
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return !z11;
                    }
                } catch (Throwable th2) {
                    f12868c.readLock().unlock();
                    throw th2;
                }
            }
        }
        return false;
    }

    private static Boolean u(String str) {
        Boolean valueOf;
        if (f12869d == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = f12868c;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (f12869d == null) {
                    if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        f();
                    } else {
                        synchronized (SoLoader.class) {
                            boolean z11 = !f12873h.contains(str);
                            if (z11) {
                                r rVar = f12876k;
                                if (rVar != null) {
                                    rVar.a(str);
                                } else {
                                    System.loadLibrary(str);
                                }
                            }
                            valueOf = Boolean.valueOf(z11);
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return valueOf;
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                return null;
            } catch (Throwable th2) {
                f12868c.readLock().unlock();
                throw th2;
            }
        }
        return null;
    }

    public static String v(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    private static int w() {
        ReentrantReadWriteLock reentrantReadWriteLock = f12868c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i11 = (f12878m & 2) != 0 ? 1 : 0;
            reentrantReadWriteLock.writeLock().unlock();
            return i11;
        } catch (Throwable th2) {
            f12868c.writeLock().unlock();
            throw th2;
        }
    }

    public static File x(String str) {
        f();
        try {
            return y(System.mapLibraryName(str));
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    static File y(String str) {
        f12868c.readLock().lock();
        try {
            for (q qVar : f12869d) {
                File c11 = qVar.c(str);
                if (c11 != null) {
                    return c11;
                }
            }
            f12868c.readLock().unlock();
            throw new FileNotFoundException(str);
        } finally {
            f12868c.readLock().unlock();
        }
    }
}