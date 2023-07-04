package com.google.firebase.crashlytics.ndk;

import am.c0;
import android.content.Context;
import com.google.firebase.crashlytics.ndk.g;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f16616d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final Context f16617a;

    /* renamed from: b  reason: collision with root package name */
    private final f f16618b;

    /* renamed from: c  reason: collision with root package name */
    private final dm.f f16619c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, f fVar, dm.f fVar2) {
        this.f16617a = context;
        this.f16618b = fVar;
        this.f16619c = fVar2;
    }

    private static File b(File file, String str) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    private static void h(dm.f fVar, String str, String str2, String str3) {
        j(new File(fVar.h(str), str3), str2);
    }

    private static void j(File file, String str) {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f16616d));
            try {
                bufferedWriter2.write(str);
                com.google.firebase.crashlytics.internal.common.g.e(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                com.google.firebase.crashlytics.internal.common.g.e(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                com.google.firebase.crashlytics.internal.common.g.e(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public g a(String str) {
        File h11 = this.f16619c.h(str);
        File file = new File(h11, "pending");
        wl.f f11 = wl.f.f();
        f11.i("Minidump directory: " + file.getAbsolutePath());
        File b11 = b(file, ".dmp");
        wl.f f12 = wl.f.f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Minidump file ");
        sb2.append((b11 == null || !b11.exists()) ? "does not exist" : "exists");
        f12.i(sb2.toString());
        g.b bVar = new g.b();
        if (h11 != null && h11.exists() && file.exists()) {
            bVar.l(b(file, ".dmp")).k(b(h11, ".device_info")).n(new File(h11, "session.json")).h(new File(h11, "app.json")).j(new File(h11, "device.json")).m(new File(h11, "os.json"));
        }
        return bVar.i();
    }

    public boolean c(String str) {
        File file = a(str).f16631a;
        return file != null && file.exists();
    }

    public boolean d(String str, String str2, long j11, c0 c0Var) {
        File h11 = this.f16619c.h(str);
        if (h11 != null) {
            try {
                if (this.f16618b.a(h11.getCanonicalPath(), this.f16617a.getAssets())) {
                    e(str, str2, j11);
                    f(str, c0Var.a());
                    i(str, c0Var.d());
                    g(str, c0Var.c());
                    return true;
                }
                return false;
            } catch (IOException e11) {
                wl.f.f().e("Error initializing Crashlytics NDK", e11);
                return false;
            }
        }
        return false;
    }

    public void e(String str, String str2, long j11) {
        h(this.f16619c, str, i.b(str, str2, j11), "session.json");
    }

    public void f(String str, c0.a aVar) {
        h(this.f16619c, str, i.c(aVar.a(), aVar.f(), aVar.g(), aVar.e(), aVar.c(), aVar.d().d(), aVar.d().e()), "app.json");
    }

    public void g(String str, c0.b bVar) {
        h(this.f16619c, str, i.d(bVar.a(), bVar.g(), bVar.b(), bVar.j(), bVar.d(), bVar.e(), bVar.i(), bVar.f(), bVar.h()), "device.json");
    }

    public void i(String str, c0.c cVar) {
        h(this.f16619c, str, i.e(cVar.d(), cVar.c(), cVar.b()), "os.json");
    }
}