package atd.x;

import atd.r0.f;
import com.adyen.threeds2.parameters.ConfigParameters;
import com.adyen.threeds2.util.AdyenConfigParameters;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {
    public static atd.g0.b a(String str, ConfigParameters configParameters) {
        if (str != null && !str.isEmpty()) {
            return a(str);
        }
        return a(configParameters);
    }

    private static atd.g0.b a(ConfigParameters configParameters) {
        f.a(configParameters, atd.y.a.CONFIG_PARAMETERS);
        try {
            return a(atd.r0.a.a().b(AdyenConfigParameters.getParamValue(configParameters, AdyenConfigParameters.DIRECTORY_SERVER_PUBLIC_KEY)), AdyenConfigParameters.getParamValue(configParameters, AdyenConfigParameters.DIRECTORY_SERVER_ID));
        } catch (IllegalArgumentException unused) {
            throw atd.y.a.CONFIG_PARAMETERS.a();
        } catch (JSONException e11) {
            throw atd.y.c.UNKNOWN_DIRECTORY_SERVER.a(e11);
        }
    }

    private static atd.g0.b a(String str) {
        f.a(str, atd.y.a.DIRECTORY_SERVER_ID);
        try {
            return a(new JSONObject(d.b(str)), str);
        } catch (JSONException e11) {
            throw atd.y.c.UNKNOWN_DIRECTORY_SERVER.a(e11);
        }
    }

    private static atd.g0.b a(JSONObject jSONObject, String str) {
        if (!jSONObject.has(atd.s0.a.a(-582151416113728L))) {
            jSONObject.put(atd.s0.a.a(-582168595982912L), str);
        }
        return atd.g0.b.a(jSONObject);
    }
}