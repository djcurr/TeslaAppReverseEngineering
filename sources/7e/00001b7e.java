package com.google.android.exoplayer2.drm;

import ak.k0;
import ak.o;
import ch.qos.logback.core.CoreConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class a {
    public static byte[] a(byte[] bArr) {
        return k0.f477a >= 27 ? bArr : k0.l0(c(k0.E(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (k0.f477a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(k0.E(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                if (i11 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return k0.l0(sb2.toString());
        } catch (JSONException e11) {
            String valueOf = String.valueOf(k0.E(bArr));
            o.d("ClearKeyUtil", valueOf.length() != 0 ? "Failed to adjust response data: ".concat(valueOf) : new String("Failed to adjust response data: "), e11);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', CoreConstants.DASH_CHAR).replace('/', '_');
    }

    private static String d(String str) {
        return str.replace(CoreConstants.DASH_CHAR, '+').replace('_', '/');
    }
}