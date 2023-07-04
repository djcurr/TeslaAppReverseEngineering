package p6;

import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.threeds2.CompletionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import r6.a;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
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

    public final JSONObject a(CompletionEvent completionEvent) {
        s.g(completionEvent, "completionEvent");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("threeds2.challengeResult", a.C1075a.b(r6.a.f49254b, completionEvent, null, 2, null).a());
            return jSONObject;
        } catch (JSONException e11) {
            throw new ComponentException("Failed to create challenge details", e11);
        }
    }

    public final JSONObject b(String encodedFingerprint) {
        s.g(encodedFingerprint, "encodedFingerprint");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("threeds2.fingerprint", encodedFingerprint);
            return jSONObject;
        } catch (JSONException e11) {
            throw new ComponentException("Failed to create fingerprint details", e11);
        }
    }

    public final JSONObject c(CompletionEvent completionEvent, String authorisationToken) {
        s.g(completionEvent, "completionEvent");
        s.g(authorisationToken, "authorisationToken");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("threeDSResult", r6.a.f49254b.a(completionEvent, authorisationToken).a());
            return jSONObject;
        } catch (JSONException e11) {
            throw new ComponentException("Failed to create ThreeDS Result details", e11);
        }
    }
}