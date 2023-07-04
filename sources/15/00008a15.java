package n9;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.godotengine.godot.BuildConfig;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends l9.e {
    @Override // l9.e
    public String b(r9.a aVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("api_name", "/sdk/log");
        hashMap.put("api_version", "1.0.0");
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("log_v", BuildConfig.VERSION_NAME);
        return d(aVar, hashMap, hashMap2);
    }

    @Override // l9.e
    public String c(r9.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // l9.e
    public Map<String, String> e(boolean z11, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("msp-gzip", String.valueOf(z11));
        hashMap.put("content-type", "application/octet-stream");
        hashMap.put("des-mode", "CBC");
        return hashMap;
    }

    @Override // l9.e
    public l9.b g(r9.a aVar, Context context, String str) {
        return i(aVar, context, str, "https://mcgw.alipay.com/sdklog.do", true);
    }

    @Override // l9.e
    public JSONObject j() {
        return null;
    }

    @Override // l9.e
    public boolean o() {
        return false;
    }
}