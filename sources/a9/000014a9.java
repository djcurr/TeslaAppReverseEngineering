package com.android.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import com.android.volley.toolbox.e;
import java.io.File;

/* loaded from: classes.dex */
public class q {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements e.c {

        /* renamed from: a  reason: collision with root package name */
        private File f10354a = null;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f10355b;

        a(Context context) {
            this.f10355b = context;
        }

        @Override // com.android.volley.toolbox.e.c
        public File get() {
            if (this.f10354a == null) {
                this.f10354a = new File(this.f10355b.getCacheDir(), "volley");
            }
            return this.f10354a;
        }
    }

    public static com.android.volley.j a(Context context) {
        return c(context, null);
    }

    private static com.android.volley.j b(Context context, com.android.volley.f fVar) {
        com.android.volley.j jVar = new com.android.volley.j(new e(new a(context.getApplicationContext())), fVar);
        jVar.g();
        return jVar;
    }

    public static com.android.volley.j c(Context context, b bVar) {
        c cVar;
        c cVar2;
        String str;
        if (bVar == null) {
            if (Build.VERSION.SDK_INT >= 9) {
                cVar2 = new c((b) new j());
                return b(context, cVar2);
            }
            try {
                String packageName = context.getPackageName();
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                str = packageName + "/" + packageInfo.versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "volley/0";
            }
            cVar = new c(new f(AndroidHttpClient.newInstance(str)));
        } else {
            cVar = new c(bVar);
        }
        cVar2 = cVar;
        return b(context, cVar2);
    }
}