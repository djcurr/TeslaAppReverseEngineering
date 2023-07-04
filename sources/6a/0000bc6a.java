package w6;

import com.adyen.checkout.card.api.model.AddressItem;
import java.util.List;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import wz.w;

/* loaded from: classes.dex */
public final class a extends com.adyen.checkout.core.api.b<List<? extends AddressItem>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.adyen.checkout.core.api.d environment, c dataType, String localeString, String str) {
        super(b.b(environment, dataType, localeString, str));
        s.g(environment, "environment");
        s.g(dataType, "dataType");
        s.g(localeString, "localeString");
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: i */
    public List<AddressItem> call() {
        String str;
        String str2;
        List<AddressItem> i11;
        str = b.f55654a;
        o7.b.f(str, s.p("call - ", d()));
        byte[] b11 = b(com.adyen.checkout.core.api.b.f9573c);
        s.f(b11, "get(CONTENT_TYPE_JSON_HEADER)");
        JSONArray jSONArray = new JSONArray(new String(b11, kotlin.text.d.f35187b));
        str2 = b.f55654a;
        o7.b.f(str2, s.p("response: ", p7.b.d(jSONArray)));
        List<AddressItem> c11 = p7.d.c(jSONArray, AddressItem.Companion.a());
        if (c11 != null) {
            return c11;
        }
        i11 = w.i();
        return i11;
    }
}