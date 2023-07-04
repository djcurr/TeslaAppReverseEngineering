package xl;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d implements b, yl.b {

    /* renamed from: a  reason: collision with root package name */
    private yl.a f57598a;

    private static String b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // yl.b
    public void a(yl.a aVar) {
        this.f57598a = aVar;
        wl.f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // xl.b
    public void g(String str, Bundle bundle) {
        yl.a aVar = this.f57598a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                wl.f.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}