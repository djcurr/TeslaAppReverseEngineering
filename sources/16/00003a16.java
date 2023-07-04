package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import ezvcard.property.Kind;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final sm.b<sl.a> f17163a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f17164b = Collections.synchronizedMap(new HashMap());

    public q(sm.b<sl.a> bVar) {
        this.f17163a = bVar;
    }

    public void a(String str, e eVar) {
        JSONObject optJSONObject;
        sl.a aVar = this.f17163a.get();
        if (aVar == null) {
            return;
        }
        JSONObject f11 = eVar.f();
        if (f11.length() < 1) {
            return;
        }
        JSONObject d11 = eVar.d();
        if (d11.length() >= 1 && (optJSONObject = f11.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString("choiceId");
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.f17164b) {
                if (optString.equals(this.f17164b.get(str))) {
                    return;
                }
                this.f17164b.put(str, optString);
                Bundle bundle = new Bundle();
                bundle.putString("arm_key", str);
                bundle.putString("arm_value", d11.optString(str));
                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                bundle.putString(Kind.GROUP, optJSONObject.optString(Kind.GROUP));
                aVar.a("fp", "personalization_assignment", bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putString("_fpid", optString);
                aVar.a("fp", "_fpc", bundle2);
            }
        }
    }
}