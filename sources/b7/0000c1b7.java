package y30;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class a implements b, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final List<z30.a<String, Object>> f59082a = new ArrayList();

    @Override // y30.b
    public String a(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder(256);
        if (str != null) {
            sb2.append(str);
        }
        if (!this.f59082a.isEmpty()) {
            if (sb2.length() > 0) {
                sb2.append('\n');
            }
            sb2.append("Exception Context:\n");
            int i11 = 0;
            for (z30.a<String, Object> aVar : this.f59082a) {
                sb2.append("\t[");
                i11++;
                sb2.append(i11);
                sb2.append(CoreConstants.COLON_CHAR);
                sb2.append(aVar.getKey());
                sb2.append("=");
                Object value = aVar.getValue();
                if (value == null) {
                    sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
                } else {
                    try {
                        str2 = value.toString();
                    } catch (Exception e11) {
                        str2 = "Exception thrown on toString(): " + c.a(e11);
                    }
                    sb2.append(str2);
                }
                sb2.append("]\n");
            }
            sb2.append("---------------------------------");
        }
        return sb2.toString();
    }
}