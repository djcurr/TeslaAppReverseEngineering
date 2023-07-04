package fm;

import com.google.firebase.crashlytics.internal.common.q;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final q f26688a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(q qVar) {
        this.f26688a = qVar;
    }

    private static g a(int i11) {
        if (i11 != 3) {
            return new b();
        }
        return new h();
    }

    public gm.e b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f26688a, jSONObject);
    }
}