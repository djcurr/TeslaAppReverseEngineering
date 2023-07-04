package d7;

import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h extends com.adyen.checkout.core.api.b<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.adyen.checkout.core.api.d environment, String clientKey) {
        super(environment.a() + "v1/clientKeys/" + clientKey);
        s.g(environment, "environment");
        s.g(clientKey, "clientKey");
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: i */
    public String call() {
        String str;
        String str2;
        str = i.f23772a;
        o7.b.f(str, s.p("call - ", d()));
        byte[] a11 = a();
        s.f(a11, "get()");
        String str3 = new String(a11, kotlin.text.d.f35187b);
        JSONObject jSONObject = new JSONObject(str3);
        str2 = i.f23772a;
        o7.b.f(str2, s.p("result: ", str3));
        String string = jSONObject.getString("publicKey");
        s.f(string, "jsonObject.getString(PUBLIC_KEY_JSON_KEY)");
        return string;
    }
}