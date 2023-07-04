package wl;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Context f56100a;

    /* renamed from: b  reason: collision with root package name */
    private b f56101b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f56102a;

        /* renamed from: b  reason: collision with root package name */
        private final String f56103b;

        private b(e eVar) {
            int q11 = com.google.firebase.crashlytics.internal.common.g.q(eVar.f56100a, "com.google.firebase.crashlytics.unity_version", "string");
            if (q11 == 0) {
                if (eVar.c("flutter_assets")) {
                    this.f56102a = "Flutter";
                    this.f56103b = null;
                    f.f().i("Development platform is: Flutter");
                    return;
                }
                this.f56102a = null;
                this.f56103b = null;
                return;
            }
            this.f56102a = "Unity";
            String string = eVar.f56100a.getResources().getString(q11);
            this.f56103b = string;
            f f11 = f.f();
            f11.i("Unity Editor version is: " + string);
        }
    }

    public e(Context context) {
        this.f56100a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        String[] list;
        try {
            if (this.f56100a.getAssets() == null || (list = this.f56100a.getAssets().list(str)) == null) {
                return false;
            }
            return list.length > 0;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f56101b == null) {
            this.f56101b = new b();
        }
        return this.f56101b;
    }

    public static boolean g(Context context) {
        return com.google.firebase.crashlytics.internal.common.g.q(context, "com.google.firebase.crashlytics.unity_version", "string") != 0;
    }

    public String d() {
        return f().f56102a;
    }

    public String e() {
        return f().f56103b;
    }
}