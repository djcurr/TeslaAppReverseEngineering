package hm;

import android.text.TextUtils;
import cm.c;
import com.google.firebase.crashlytics.internal.common.l;
import com.stripe.android.core.networking.NetworkConstantsKt;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import wl.f;

/* loaded from: classes3.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f29340a;

    /* renamed from: b  reason: collision with root package name */
    private final cm.b f29341b;

    /* renamed from: c  reason: collision with root package name */
    private final f f29342c;

    public a(String str, cm.b bVar) {
        this(str, bVar, f.f());
    }

    private cm.a b(cm.a aVar, gm.f fVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", fVar.f28024a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", l.l());
        c(aVar, NetworkConstantsKt.HEADER_ACCEPT, "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", fVar.f28025b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", fVar.f28026c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", fVar.f28027d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", fVar.f28028e.a());
        return aVar;
    }

    private void c(cm.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e11) {
            f fVar = this.f29342c;
            fVar.l("Failed to parse settings JSON from " + this.f29340a, e11);
            f fVar2 = this.f29342c;
            fVar2.k("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(gm.f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fVar.f28031h);
        hashMap.put("display_version", fVar.f28030g);
        hashMap.put(Stripe3ds2AuthParams.FIELD_SOURCE, Integer.toString(fVar.f28032i));
        String str = fVar.f28029f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // hm.b
    public JSONObject a(gm.f fVar, boolean z11) {
        if (z11) {
            try {
                Map<String, String> f11 = f(fVar);
                cm.a b11 = b(d(f11), fVar);
                f fVar2 = this.f29342c;
                fVar2.b("Requesting settings from " + this.f29340a);
                f fVar3 = this.f29342c;
                fVar3.i("Settings query params were: " + f11);
                return g(b11.c());
            } catch (IOException e11) {
                this.f29342c.e("Settings request failed.", e11);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    protected cm.a d(Map<String, String> map) {
        cm.a a11 = this.f29341b.a(this.f29340a, map);
        return a11.d(NetworkConstantsKt.HEADER_USER_AGENT, "Crashlytics Android SDK/" + l.l()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(c cVar) {
        int b11 = cVar.b();
        f fVar = this.f29342c;
        fVar.i("Settings response code was: " + b11);
        if (h(b11)) {
            return e(cVar.a());
        }
        f fVar2 = this.f29342c;
        fVar2.d("Settings request failed; (status: " + b11 + ") from " + this.f29340a);
        return null;
    }

    boolean h(int i11) {
        return i11 == 200 || i11 == 201 || i11 == 202 || i11 == 203;
    }

    a(String str, cm.b bVar, f fVar) {
        if (str != null) {
            this.f29342c = fVar;
            this.f29341b = bVar;
            this.f29340a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}