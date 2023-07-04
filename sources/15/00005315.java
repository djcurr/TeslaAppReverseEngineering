package com.stripe.android.networking;

import com.stripe.android.model.ConfirmPaymentIntentParams;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.s;
import vz.v;
import wz.r0;
import wz.s0;
import wz.x0;

/* loaded from: classes6.dex */
public final class FraudDetectionDataParamsUtils {
    private final Map<String, ?> addFraudDetectionData(Map<String, ?> map, String str, FraudDetectionData fraudDetectionData) {
        Map p11;
        Map f11;
        Map<String, ?> p12;
        Object obj = map.get(str);
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 == null) {
            return map;
        }
        Map<String, String> params = fraudDetectionData != null ? fraudDetectionData.getParams() : null;
        if (params == null) {
            params = s0.i();
        }
        p11 = s0.p(map2, params);
        f11 = r0.f(v.a(str, p11));
        p12 = s0.p(map, f11);
        return p12 == null ? map : p12;
    }

    public final Map<String, ?> addFraudDetectionData$payments_core_release(Map<String, ?> params, FraudDetectionData fraudDetectionData) {
        Set i11;
        Object obj;
        Map<String, ?> addFraudDetectionData;
        s.g(params, "params");
        i11 = x0.i(ConfirmPaymentIntentParams.PARAM_SOURCE_DATA, "payment_method_data");
        Iterator it2 = i11.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (params.containsKey((String) obj)) {
                break;
            }
        }
        String str = (String) obj;
        return (str == null || (addFraudDetectionData = addFraudDetectionData(params, str, fraudDetectionData)) == null) ? params : addFraudDetectionData;
    }
}