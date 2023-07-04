package v3;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;

/* loaded from: classes.dex */
public class b {
    public static void a(Object obj, StringBuilder sb2) {
        int lastIndexOf;
        if (obj == null) {
            sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append(CoreConstants.CURLY_LEFT);
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}