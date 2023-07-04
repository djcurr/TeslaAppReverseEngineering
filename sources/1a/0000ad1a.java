package q6;

import com.adyen.checkout.adyen3ds2.model.SubmitFingerprintRequest;
import com.adyen.checkout.adyen3ds2.model.SubmitFingerprintResponse;
import com.adyen.checkout.core.api.d;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends com.adyen.checkout.core.api.b<SubmitFingerprintResponse> {

    /* renamed from: e  reason: collision with root package name */
    private final SubmitFingerprintRequest f47785e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SubmitFingerprintRequest request, d environment, String clientKey) {
        super(environment.a() + "v1/submitThreeDS2Fingerprint?token=" + clientKey);
        s.g(request, "request");
        s.g(environment, "environment");
        s.g(clientKey, "clientKey");
        this.f47785e = request;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: i */
    public SubmitFingerprintResponse call() {
        String str;
        String str2;
        String str3;
        str = b.f47786a;
        o7.b.f(str, s.p("call - ", d()));
        JSONObject b11 = SubmitFingerprintRequest.Companion.a().b(this.f47785e);
        s.f(b11, "SubmitFingerprintRequest.SERIALIZER.serialize(request)");
        str2 = b.f47786a;
        o7.b.f(str2, s.p("request - ", p7.b.e(b11)));
        Map<String, String> map = com.adyen.checkout.core.api.b.f9573c;
        String jSONObject = b11.toString();
        s.f(jSONObject, "requestJson.toString()");
        Charset charset = kotlin.text.d.f35187b;
        byte[] bytes = jSONObject.getBytes(charset);
        s.f(bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] h11 = h(map, bytes);
        s.f(h11, "post(CONTENT_TYPE_JSON_HEADER, requestJson.toString().toByteArray(Charsets.UTF_8))");
        JSONObject jSONObject2 = new JSONObject(new String(h11, charset));
        str3 = b.f47786a;
        o7.b.f(str3, s.p("response: ", p7.b.e(jSONObject2)));
        SubmitFingerprintResponse a11 = SubmitFingerprintResponse.Companion.a().a(jSONObject2);
        s.f(a11, "SubmitFingerprintResponse.SERIALIZER.deserialize(resultJson)");
        return a11;
    }
}