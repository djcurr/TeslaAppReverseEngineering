package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.c;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import fq.b;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Objects;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.s;
import oq.a;
import zp.d;
import zp.h;
import zp.l;

/* loaded from: classes6.dex */
public final class JweEcEncrypter {
    private final DiffieHellmanKeyGenerator dhKeyGenerator;
    private final EphemeralKeyPairGenerator ephemeralKeyPairGenerator;

    private JweEcEncrypter(EphemeralKeyPairGenerator ephemeralKeyPairGenerator, DiffieHellmanKeyGenerator diffieHellmanKeyGenerator) {
        this.ephemeralKeyPairGenerator = ephemeralKeyPairGenerator;
        this.dhKeyGenerator = diffieHellmanKeyGenerator;
    }

    public final String encrypt(String payload, ECPublicKey acsPublicKey, String directoryServerId) {
        s.g(payload, "payload");
        s.g(acsPublicKey, "acsPublicKey");
        s.g(directoryServerId, "directoryServerId");
        a.e(payload);
        KeyPair generate = this.ephemeralKeyPairGenerator.generate();
        DiffieHellmanKeyGenerator diffieHellmanKeyGenerator = this.dhKeyGenerator;
        PrivateKey privateKey = generate.getPrivate();
        Objects.requireNonNull(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        SecretKey generate2 = diffieHellmanKeyGenerator.generate(acsPublicKey, (ECPrivateKey) privateKey, directoryServerId);
        fq.a aVar = fq.a.f26716c;
        PublicKey publicKey = generate.getPublic();
        Objects.requireNonNull(publicKey, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
        com.nimbusds.jose.a aVar2 = new com.nimbusds.jose.a(new l.a(h.f60604k, d.f60576d).i(b.v(new b.a(aVar, (ECPublicKey) publicKey).a().n())).d(), new c(payload));
        aVar2.g(new aq.b(generate2));
        String r11 = aVar2.r();
        s.f(r11, "jweObject.serialize()");
        return r11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JweEcEncrypter(EphemeralKeyPairGenerator ephemeralKeyPairGenerator, ErrorReporter errorReporter) {
        this(ephemeralKeyPairGenerator, new StripeDiffieHellmanKeyGenerator(errorReporter));
        s.g(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        s.g(errorReporter, "errorReporter");
    }
}