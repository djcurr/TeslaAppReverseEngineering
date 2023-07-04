package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;

/* loaded from: classes3.dex */
public class b extends q {

    /* renamed from: a  reason: collision with root package name */
    private Context f12889a;

    /* renamed from: b  reason: collision with root package name */
    private int f12890b;

    /* renamed from: c  reason: collision with root package name */
    private d f12891c;

    public b(Context context, int i11) {
        Context applicationContext = context.getApplicationContext();
        this.f12889a = applicationContext;
        if (applicationContext == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
            this.f12889a = context;
        }
        this.f12890b = i11;
        this.f12891c = new d(new File(this.f12889a.getApplicationInfo().nativeLibraryDir), i11);
    }

    public static File e(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // com.facebook.soloader.q
    public int a(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        return this.f12891c.a(str, i11, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.q
    public void b(int i11) {
        this.f12891c.b(i11);
    }

    @Override // com.facebook.soloader.q
    public File c(String str) {
        return this.f12891c.c(str);
    }

    public boolean d() {
        File file = this.f12891c.f12895a;
        Context f11 = f();
        File e11 = e(f11);
        if (file.equals(e11)) {
            return false;
        }
        Log.d("SoLoader", "Native library directory updated from " + file + " to " + e11);
        int i11 = this.f12890b | 1;
        this.f12890b = i11;
        d dVar = new d(e11, i11);
        this.f12891c = dVar;
        dVar.b(this.f12890b);
        this.f12889a = f11;
        return true;
    }

    public Context f() {
        try {
            Context context = this.f12889a;
            return context.createPackageContext(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.facebook.soloader.q
    public String toString() {
        return this.f12891c.toString();
    }
}