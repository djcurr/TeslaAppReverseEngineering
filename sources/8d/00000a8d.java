package atd.g0;

import java.security.PrivateKey;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c extends b implements atd.f0.b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(JSONObject jSONObject) {
        super(jSONObject);
    }

    public void c() {
        try {
            PrivateKey d11 = d();
            if (d11 != null) {
                d11.destroy();
            }
        } catch (Throwable unused) {
        }
    }

    public abstract PrivateKey d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str, String str2) {
        super(str, str2);
    }
}