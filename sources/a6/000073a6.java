package hq;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class d extends HashMap<String, Object> implements c, f {
    public static String a(Map<String, ? extends Object> map) {
        return h(map, i.f29395a);
    }

    public static String h(Map<String, ? extends Object> map, g gVar) {
        StringBuilder sb2 = new StringBuilder();
        try {
            i(map, sb2, gVar);
        } catch (IOException unused) {
        }
        return sb2.toString();
    }

    public static void i(Map<String, ? extends Object> map, Appendable appendable, g gVar) {
        if (map == null) {
            appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else {
            kq.d.f35680i.a(map, appendable, gVar);
        }
    }

    public static void j(String str, Object obj, Appendable appendable, g gVar) {
        if (str == null) {
            appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else if (!gVar.h(str)) {
            appendable.append(str);
        } else {
            appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            i.a(str, appendable, gVar);
            appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
        appendable.append(CoreConstants.COLON_CHAR);
        if (obj instanceof String) {
            gVar.p(appendable, (String) obj);
        } else {
            i.b(obj, appendable, gVar);
        }
    }

    @Override // hq.e
    public void b(Appendable appendable) {
        i(this, appendable, i.f29395a);
    }

    @Override // hq.f
    public void c(Appendable appendable, g gVar) {
        i(this, appendable, gVar);
    }

    @Override // hq.b
    public String e() {
        return h(this, i.f29395a);
    }

    @Override // hq.c
    public String f(g gVar) {
        return h(this, gVar);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return h(this, i.f29395a);
    }
}