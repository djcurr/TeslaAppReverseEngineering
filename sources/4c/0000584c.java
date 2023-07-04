package com.stripe.android.stripe3ds2.security;

import aq.e;
import com.nimbusds.jose.a;
import com.nimbusds.jose.c;
import java.security.interfaces.RSAPublicKey;
import kotlin.jvm.internal.s;
import zp.d;
import zp.h;
import zp.l;

/* loaded from: classes6.dex */
public final class JweRsaEncrypter {
    public final a createJweObject(String payload, String str) {
        s.g(payload, "payload");
        return new a(new l.a(h.f60598e, d.f60576d).m(str).d(), new c(payload));
    }

    public final String encrypt(String payload, RSAPublicKey publicKey, String str) {
        s.g(payload, "payload");
        s.g(publicKey, "publicKey");
        a createJweObject = createJweObject(payload, str);
        createJweObject.g(new e(publicKey));
        String r11 = createJweObject.r();
        s.f(r11, "jwe.serialize()");
        return r11;
    }
}