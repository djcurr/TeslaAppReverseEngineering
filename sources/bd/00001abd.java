package com.facebook.soloader;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.soloader.SoLoader;
import java.io.File;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes3.dex */
public class c extends q {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f12892a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12893b;

    /* renamed from: c  reason: collision with root package name */
    private final File f12894c;

    public c(Context context) {
        this.f12892a = Collections.synchronizedSet(new HashSet());
        this.f12893b = e("");
        this.f12894c = new File(context.getApplicationInfo().sourceDir);
    }

    private static String[] d(String str, f fVar) {
        boolean z11 = SoLoader.f12866a;
        if (z11) {
            Api18TraceUtils.a("SoLoader.getElfDependencies[", str, "]");
        }
        try {
            String[] a11 = n.a(str, fVar);
            if (z11) {
                Api18TraceUtils.b();
            }
            return a11;
        } catch (Throwable th2) {
            if (SoLoader.f12866a) {
                Api18TraceUtils.b();
            }
            throw th2;
        }
    }

    private static String e(String str) {
        String[] split;
        String a11 = Build.VERSION.SDK_INT >= 14 ? SoLoader.Api14Utils.a() : null;
        if (a11 != null) {
            for (String str2 : a11.split(":")) {
                if (str2.contains(str + ".apk!/")) {
                    return str2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        r2 = new com.facebook.soloader.h(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        r8 = d(r8, r2);
        r3 = r8.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r4 >= r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        r5 = r8[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r7.f12892a.contains(r5) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r5.startsWith("/") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        com.facebook.soloader.SoLoader.r(r5, r9 | 1, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        r2.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(java.lang.String r8, int r9, android.os.StrictMode.ThreadPolicy r10) {
        /*
            r7 = this;
            java.lang.String r0 = "/"
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile
            java.io.File r2 = r7.f12894c
            r1.<init>(r2)
            java.util.Enumeration r2 = r1.entries()     // Catch: java.lang.Throwable -> L6c
        Ld:
            boolean r3 = r2.hasMoreElements()     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L68
            java.lang.Object r3 = r2.nextElement()     // Catch: java.lang.Throwable -> L6c
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto Ld
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r5.<init>()     // Catch: java.lang.Throwable -> L6c
            r5.append(r0)     // Catch: java.lang.Throwable -> L6c
            r5.append(r8)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6c
            boolean r4 = r4.endsWith(r5)     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto Ld
            com.facebook.soloader.h r2 = new com.facebook.soloader.h     // Catch: java.lang.Throwable -> L6c
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.String[] r8 = d(r8, r2)     // Catch: java.lang.Throwable -> L5e
            int r3 = r8.length     // Catch: java.lang.Throwable -> L5e
            r4 = 0
        L3f:
            if (r4 >= r3) goto L5a
            r5 = r8[r4]     // Catch: java.lang.Throwable -> L5e
            java.util.Set<java.lang.String> r6 = r7.f12892a     // Catch: java.lang.Throwable -> L5e
            boolean r6 = r6.contains(r5)     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L57
            boolean r6 = r5.startsWith(r0)     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L52
            goto L57
        L52:
            r6 = r9 | 1
            com.facebook.soloader.SoLoader.r(r5, r6, r10)     // Catch: java.lang.Throwable -> L5e
        L57:
            int r4 = r4 + 1
            goto L3f
        L5a:
            r2.close()     // Catch: java.lang.Throwable -> L6c
            goto L68
        L5e:
            r8 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L63
            goto L67
        L63:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> L6c
        L67:
            throw r8     // Catch: java.lang.Throwable -> L6c
        L68:
            r1.close()
            return
        L6c:
            r8 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L71
            goto L75
        L71:
            r9 = move-exception
            r8.addSuppressed(r9)
        L75:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.c.f(java.lang.String, int, android.os.StrictMode$ThreadPolicy):void");
    }

    @Override // com.facebook.soloader.q
    public int a(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        if (SoLoader.f12867b != null) {
            if (this.f12892a.contains(str) && !TextUtils.isEmpty(this.f12893b)) {
                f(str, i11, threadPolicy);
                int i12 = i11 | 4;
                try {
                    p pVar = SoLoader.f12867b;
                    pVar.a(this.f12893b + File.separator + str, i12);
                    Log.d("SoLoader", str + " found on DirectAPKSoSource: " + i12);
                    return 1;
                } catch (UnsatisfiedLinkError e11) {
                    Log.w("SoLoader", str + " not found on DirectAPKSoSource: " + i12, e11);
                    return 0;
                }
            }
            Log.d("SoLoader", str + " not found on " + this.f12893b);
            return 0;
        }
        throw new IllegalStateException("SoLoader.init() not yet called");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.q
    public void b(int i11) {
        int indexOf;
        int i12;
        String substring = (TextUtils.isEmpty(this.f12893b) || (indexOf = this.f12893b.indexOf(33)) < 0 || (i12 = indexOf + 2) >= this.f12893b.length()) ? null : this.f12893b.substring(i12);
        if (substring == null) {
            return;
        }
        ZipFile zipFile = new ZipFile(this.f12894c);
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (nextElement != null && nextElement.getName().startsWith(substring) && nextElement.getName().endsWith(".so") && nextElement.getMethod() == 0) {
                    this.f12892a.add(nextElement.getName().substring(substring.length() + 1));
                }
            }
            zipFile.close();
        } catch (Throwable th2) {
            try {
                zipFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // com.facebook.soloader.q
    public File c(String str) {
        throw new UnsupportedOperationException("DirectAPKSoSource doesn't support unpackLibrary");
    }

    @Override // com.facebook.soloader.q
    public String toString() {
        return c.class.getName() + "[root = " + this.f12893b + ']';
    }

    public c(File file) {
        this.f12892a = Collections.synchronizedSet(new HashSet());
        this.f12893b = e(SysUtil.h(file.getName()));
        this.f12894c = file;
    }
}