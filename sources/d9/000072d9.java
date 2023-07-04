package h9;

import android.content.Context;
import android.content.SharedPreferences;
import f9.f;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f29004a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f29005b;

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences.Editor f29006c = null;

    /* renamed from: d  reason: collision with root package name */
    public Context f29007d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f29008e;

    public a(Context context, String str, String str2, boolean z11, boolean z12) {
        this.f29004a = "";
        this.f29005b = null;
        this.f29007d = null;
        this.f29008e = false;
        this.f29008e = z12;
        this.f29004a = str2;
        this.f29007d = context;
        if (context != null) {
            this.f29005b = context.getSharedPreferences(str2, 0);
        }
    }

    private void d() {
        SharedPreferences sharedPreferences;
        if (this.f29006c != null || (sharedPreferences = this.f29005b) == null) {
            return;
        }
        this.f29006c = sharedPreferences.edit();
    }

    public String a(String str) {
        SharedPreferences sharedPreferences = this.f29005b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!f.b(string)) {
                return string;
            }
        }
        return "";
    }

    public void b(String str, String str2) {
        if (f.b(str) || str.equals("t")) {
            return;
        }
        d();
        SharedPreferences.Editor editor = this.f29006c;
        if (editor != null) {
            editor.putString(str, str2);
        }
    }

    public boolean c() {
        boolean z11;
        Context context;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.f29006c;
        if (editor != null) {
            if (!this.f29008e && this.f29005b != null) {
                editor.putLong("t", currentTimeMillis);
            }
            if (!this.f29006c.commit()) {
                z11 = false;
                if (this.f29005b != null && (context = this.f29007d) != null) {
                    this.f29005b = context.getSharedPreferences(this.f29004a, 0);
                }
                return z11;
            }
        }
        z11 = true;
        if (this.f29005b != null) {
            this.f29005b = context.getSharedPreferences(this.f29004a, 0);
        }
        return z11;
    }

    public void e(String str) {
        if (f.b(str) || str.equals("t")) {
            return;
        }
        d();
        SharedPreferences.Editor editor = this.f29006c;
        if (editor != null) {
            editor.remove(str);
        }
    }
}