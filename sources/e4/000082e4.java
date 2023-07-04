package l9;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f37116a;

    /* renamed from: b  reason: collision with root package name */
    public final String f37117b;

    public b(String str, String str2) {
        this.f37116a = str;
        this.f37117b = str2;
    }

    public String a() {
        return this.f37117b;
    }

    public String b() {
        return this.f37116a;
    }

    public JSONObject c() {
        if (TextUtils.isEmpty(this.f37117b)) {
            return null;
        }
        try {
            return new JSONObject(this.f37117b);
        } catch (Exception e11) {
            t9.e.d(e11);
            return null;
        }
    }

    public String toString() {
        return String.format("<Letter envelop=%s body=%s>", this.f37116a, this.f37117b);
    }
}