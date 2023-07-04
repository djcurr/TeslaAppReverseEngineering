package com.stripe.android.stripe3ds2.security;

import java.io.Serializable;
import javax.crypto.SecretKey;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public interface MessageTransformer extends Serializable {
    JSONObject decrypt(String str, SecretKey secretKey);

    String encrypt(JSONObject jSONObject, SecretKey secretKey);
}