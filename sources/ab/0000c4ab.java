package z8;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public String f60378a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f60379b;

    public void a(boolean z11) {
        this.f60379b = Boolean.valueOf(z11);
    }

    public boolean b() {
        return this.f60379b != null;
    }

    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.f60378a, str);
    }

    public void d(String str) {
        this.f60378a = str;
    }

    public boolean e() {
        Boolean bool = this.f60379b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}