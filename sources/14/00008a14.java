package n9;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends l9.e {
    @Override // l9.e
    public String d(r9.a aVar, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        hashMap2.putAll(t9.a.a(aVar));
        t9.e.h("mspl", "cf " + hashMap2);
        return super.d(aVar, hashMap, hashMap2);
    }

    @Override // l9.e
    public JSONObject j() {
        return l9.e.k("sdkConfig", "obtain");
    }

    @Override // l9.e
    public String n() {
        return "5.0.0";
    }

    @Override // l9.e
    public boolean o() {
        return true;
    }
}