package com.google.android.gms.common.util;

import com.adyen.checkout.components.model.payments.request.Address;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;

@KeepForSdk
/* loaded from: classes3.dex */
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(StringBuilder sb2, HashMap<String, String> hashMap) {
        sb2.append("{");
        boolean z11 = true;
        for (String str : hashMap.keySet()) {
            if (!z11) {
                sb2.append(",");
            }
            String str2 = hashMap.get(str);
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
            } else {
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\"");
            }
            z11 = false;
        }
        sb2.append("}");
    }
}