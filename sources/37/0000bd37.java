package wu;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f56203a;

    /* renamed from: b  reason: collision with root package name */
    private final String f56204b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f56205c;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public e(String contentType, String locale) {
        s.g(contentType, "contentType");
        s.g(locale, "locale");
        this.f56203a = contentType;
        this.f56204b = locale;
        this.f56205c = new JSONObject();
    }

    private final void c(String str, JSONObject jSONObject) {
        try {
            this.f56205c.put(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    private final void d(String str, String str2) {
        try {
            this.f56205c.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    public final void a(Context context, Intent intent) {
        h hVar = h.f56208a;
        s.e(context);
        s.e(intent);
        JSONObject a11 = hVar.a(context, intent);
        if (a11 != null) {
            c("android.intent.extra.STREAM", a11);
        }
    }

    public final void b(Intent intent) {
        s.g(intent, "intent");
        String scheme = intent.getScheme();
        String action = intent.getAction();
        String dataString = intent.getDataString();
        String type = intent.getType();
        if (scheme != null) {
            d("android.intent.SCHEME", scheme);
        }
        if (action != null) {
            d("android.intent.ACTION", action);
        }
        if (dataString != null) {
            d("android.intent.DATA", dataString);
        }
        if (type != null) {
            d("android.intent.TYPE", type);
        }
    }

    public final void e(Intent intent) {
        s.g(intent, "intent");
        String stringExtra = intent.getStringExtra("android.intent.extra.SUBJECT");
        if (stringExtra != null) {
            d("android.intent.extra.SUBJECT", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
        if (stringExtra2 != null) {
            d("android.intent.extra.TEXT", stringExtra2);
        }
    }

    public final boolean f() {
        return this.f56205c.length() > 0;
    }

    public final JSONObject g() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", this.f56203a);
            jSONObject.put("value", this.f56205c);
            jSONObject.put("locale", this.f56204b);
            jSONObject.put("timestamp_ms", String.valueOf(System.currentTimeMillis()));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}