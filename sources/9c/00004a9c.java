package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import ch.qos.logback.core.util.FileSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    static final StringBuilder f20690a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    private static final okio.i f20691b = okio.i.f("RIFF");

    /* renamed from: c  reason: collision with root package name */
    private static final okio.i f20692c = okio.i.f("WEBP");

    /* loaded from: classes2.dex */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    /* loaded from: classes2.dex */
    private static class b extends Thread {
        b(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* loaded from: classes2.dex */
    static class c implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new b(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(File file) {
        long j11;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            int i11 = Build.VERSION.SDK_INT;
            j11 = ((i11 < 18 ? statFs.getBlockCount() : statFs.getBlockCountLong()) * (i11 < 18 ? statFs.getBlockSize() : statFs.getBlockSizeLong())) / 50;
        } catch (IllegalArgumentException unused) {
            j11 = 5242880;
        }
        return Math.max(Math.min(j11, 52428800L), 5242880L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) n(context, "activity");
        return (int) ((((context.getApplicationInfo().flags & PKIFailureInfo.badCertTemplate) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * FileSize.MB_COEFFICIENT) / 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        if (!q()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T d(T t11, String str) {
        Objects.requireNonNull(t11, str);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File e(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(w wVar) {
        StringBuilder sb2 = f20690a;
        String g11 = g(wVar, sb2);
        sb2.setLength(0);
        return g11;
    }

    static String g(w wVar, StringBuilder sb2) {
        String str = wVar.f20781f;
        if (str != null) {
            sb2.ensureCapacity(str.length() + 50);
            sb2.append(wVar.f20781f);
        } else {
            Uri uri = wVar.f20779d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb2.ensureCapacity(uri2.length() + 50);
                sb2.append(uri2);
            } else {
                sb2.ensureCapacity(50);
                sb2.append(wVar.f20780e);
            }
        }
        sb2.append('\n');
        if (wVar.f20789n != BitmapDescriptorFactory.HUE_RED) {
            sb2.append("rotation:");
            sb2.append(wVar.f20789n);
            if (wVar.f20792q) {
                sb2.append('@');
                sb2.append(wVar.f20790o);
                sb2.append('x');
                sb2.append(wVar.f20791p);
            }
            sb2.append('\n');
        }
        if (wVar.c()) {
            sb2.append("resize:");
            sb2.append(wVar.f20783h);
            sb2.append('x');
            sb2.append(wVar.f20784i);
            sb2.append('\n');
        }
        if (wVar.f20785j) {
            sb2.append("centerCrop:");
            sb2.append(wVar.f20786k);
            sb2.append('\n');
        } else if (wVar.f20787l) {
            sb2.append("centerInside");
            sb2.append('\n');
        }
        List<c0> list = wVar.f20782g;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                sb2.append(wVar.f20782g.get(i11).key());
                sb2.append('\n');
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(Bitmap bitmap) {
        int allocationByteCount = Build.VERSION.SDK_INT >= 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String j(com.squareup.picasso.c cVar) {
        return k(cVar, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String k(com.squareup.picasso.c cVar, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        com.squareup.picasso.a h11 = cVar.h();
        if (h11 != null) {
            sb2.append(h11.f20617b.d());
        }
        List<com.squareup.picasso.a> i11 = cVar.i();
        if (i11 != null) {
            int size = i11.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (i12 > 0 || h11 != null) {
                    sb2.append(", ");
                }
                sb2.append(i11.get(i12).f20617b.d());
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(Resources resources, w wVar) {
        Uri uri;
        int i11 = wVar.f20780e;
        if (i11 != 0 || (uri = wVar.f20779d) == null) {
            return i11;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            List<String> pathSegments = wVar.f20779d.getPathSegments();
            if (pathSegments != null && !pathSegments.isEmpty()) {
                if (pathSegments.size() == 1) {
                    try {
                        return Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                        throw new FileNotFoundException("Last path segment is not a resource ID: " + wVar.f20779d);
                    }
                } else if (pathSegments.size() == 2) {
                    return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                } else {
                    throw new FileNotFoundException("More than two path segments: " + wVar.f20779d);
                }
            }
            throw new FileNotFoundException("No path segments: " + wVar.f20779d);
        }
        throw new FileNotFoundException("No package provided: " + wVar.f20779d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Resources m(Context context, w wVar) {
        Uri uri;
        if (wVar.f20780e == 0 && (uri = wVar.f20779d) != null) {
            String authority = uri.getAuthority();
            if (authority != null) {
                try {
                    return context.getPackageManager().getResourcesForApplication(authority);
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new FileNotFoundException("Unable to obtain resources for package: " + wVar.f20779d);
                }
            }
            throw new FileNotFoundException("No package provided: " + wVar.f20779d);
        }
        return context.getResources();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T n(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean o(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean p(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            return Build.VERSION.SDK_INT < 17 ? Settings.System.getInt(contentResolver, "airplane_mode_on", 0) != 0 : Settings.Global.getInt(contentResolver, "airplane_mode_on", 0) != 0;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    static boolean q() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r(okio.h hVar) {
        return hVar.V(0L, f20691b) && hVar.V(8L, f20692c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void s(String str, String str2, String str3) {
        t(str, str2, str3, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void t(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }
}