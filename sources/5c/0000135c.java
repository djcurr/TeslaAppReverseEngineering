package com.adyen.threeds2.internal;

import java.security.GeneralSecurityException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static atd.f0.h a(atd.f0.b bVar, JSONObject jSONObject) {
        try {
            return bVar.a().a(jSONObject.toString().getBytes(b.f9630a));
        } catch (GeneralSecurityException | JSONException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }
}