package bl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.vending.licensing.ValidationException;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f7872a;

    /* renamed from: b  reason: collision with root package name */
    private final h f7873b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences.Editor f7874c = null;

    public j(SharedPreferences sharedPreferences, h hVar) {
        this.f7872a = sharedPreferences;
        this.f7873b = hVar;
    }

    public void a() {
        SharedPreferences.Editor editor = this.f7874c;
        if (editor != null) {
            editor.commit();
            this.f7874c = null;
        }
    }

    public String b(String str, String str2) {
        String string = this.f7872a.getString(str, null);
        if (string != null) {
            try {
                return this.f7873b.b(string, str);
            } catch (ValidationException unused) {
                Log.w("PreferenceObfuscator", "Validation error while reading preference: " + str);
                return str2;
            }
        }
        return str2;
    }

    public void c(String str, String str2) {
        if (this.f7874c == null) {
            SharedPreferences.Editor edit = this.f7872a.edit();
            this.f7874c = edit;
            edit.apply();
        }
        this.f7874c.putString(str, this.f7873b.a(str2, str));
    }
}