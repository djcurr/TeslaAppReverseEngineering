package w6;

import com.adyen.checkout.card.api.model.BinLookupRequest;
import com.adyen.checkout.card.api.model.BinLookupResponse;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d extends com.adyen.checkout.core.api.b<BinLookupResponse> {

    /* renamed from: e  reason: collision with root package name */
    private final BinLookupRequest f55656e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BinLookupRequest request, com.adyen.checkout.core.api.d environment, String clientKey) {
        super(environment.a() + "v2/bin/binLookup?clientKey=" + clientKey);
        s.g(request, "request");
        s.g(environment, "environment");
        s.g(clientKey, "clientKey");
        this.f55656e = request;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: i */
    public BinLookupResponse call() {
        String str;
        String str2;
        String str3;
        str = e.f55657a;
        o7.b.f(str, s.p("call - ", d()));
        str2 = e.f55657a;
        BinLookupRequest.b bVar = BinLookupRequest.Companion;
        JSONObject b11 = bVar.a().b(this.f55656e);
        s.f(b11, "BinLookupRequest.SERIALIZER.serialize(request)");
        o7.b.f(str2, s.p("request - ", p7.b.e(b11)));
        String jSONObject = bVar.a().b(this.f55656e).toString();
        s.f(jSONObject, "BinLookupRequest.SERIALIZER.serialize(request).toString()");
        Map<String, String> map = com.adyen.checkout.core.api.b.f9573c;
        Charset charset = kotlin.text.d.f35187b;
        byte[] bytes = jSONObject.getBytes(charset);
        s.f(bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] h11 = h(map, bytes);
        s.f(h11, "post(CONTENT_TYPE_JSON_HEADER, requestString.toByteArray(Charsets.UTF_8))");
        JSONObject jSONObject2 = new JSONObject(new String(h11, charset));
        str3 = e.f55657a;
        o7.b.f(str3, s.p("response: ", p7.b.e(jSONObject2)));
        BinLookupResponse a11 = BinLookupResponse.Companion.a().a(jSONObject2);
        s.f(a11, "BinLookupResponse.SERIALIZER.deserialize(resultJson)");
        return a11;
    }
}