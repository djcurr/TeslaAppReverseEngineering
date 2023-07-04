package com.stripe.android.stripe3ds2.security;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import kotlin.jvm.internal.s;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class DefaultJweEncrypter implements JweEncrypter {
    private final ErrorReporter errorReporter;
    private final JweEcEncrypter jweEcEncrypter;
    private final JweRsaEncrypter jweRsaEncrypter;

    private DefaultJweEncrypter(JweRsaEncrypter jweRsaEncrypter, JweEcEncrypter jweEcEncrypter, ErrorReporter errorReporter) {
        this.jweRsaEncrypter = jweRsaEncrypter;
        this.jweEcEncrypter = jweEcEncrypter;
        this.errorReporter = errorReporter;
    }

    @Override // com.stripe.android.stripe3ds2.security.JweEncrypter
    public String encrypt(String payload, PublicKey acsPublicKey, String directoryServerId, String str) {
        Object b11;
        s.g(payload, "payload");
        s.g(acsPublicKey, "acsPublicKey");
        s.g(directoryServerId, "directoryServerId");
        if (acsPublicKey instanceof RSAPublicKey) {
            q.a aVar = q.f54772b;
            b11 = q.b(this.jweRsaEncrypter.encrypt(payload, (RSAPublicKey) acsPublicKey, str));
        } else if (acsPublicKey instanceof ECPublicKey) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(this.jweEcEncrypter.encrypt(payload, (ECPublicKey) acsPublicKey, directoryServerId));
        } else {
            q.a aVar3 = q.f54772b;
            b11 = q.b(r.a(new SDKRuntimeException(s.p("Unsupported public key algorithm: ", acsPublicKey.getAlgorithm()), null, 2, null)));
        }
        Throwable e11 = q.e(b11);
        if (e11 != null) {
            this.errorReporter.reportError(e11);
        }
        r.b(b11);
        return (String) b11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultJweEncrypter(EphemeralKeyPairGenerator ephemeralKeyPairGenerator, ErrorReporter errorReporter) {
        this(new JweRsaEncrypter(), new JweEcEncrypter(ephemeralKeyPairGenerator, errorReporter), errorReporter);
        s.g(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        s.g(errorReporter, "errorReporter");
    }
}