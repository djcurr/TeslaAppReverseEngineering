package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.crypto.impl.k;
import com.nimbusds.jose.crypto.impl.p;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nq.c;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class StripeDiffieHellmanKeyGenerator implements DiffieHellmanKeyGenerator {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String HASH_ALGO = "SHA-256";
    @Deprecated
    private static final int KEY_LENGTH = 256;
    private final ErrorReporter errorReporter;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StripeDiffieHellmanKeyGenerator(ErrorReporter errorReporter) {
        s.g(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    @Override // com.stripe.android.stripe3ds2.security.DiffieHellmanKeyGenerator
    public SecretKey generate(ECPublicKey acsPublicKey, ECPrivateKey sdkPrivateKey, String agreementInfo) {
        Object b11;
        s.g(acsPublicKey, "acsPublicKey");
        s.g(sdkPrivateKey, "sdkPrivateKey");
        s.g(agreementInfo, "agreementInfo");
        try {
            q.a aVar = q.f54772b;
            b11 = q.b(new k("SHA-256").f(p.a(acsPublicKey, sdkPrivateKey, null), 256, k.k(null), k.g(null), k.g(c.d(agreementInfo)), k.i(256), k.j()));
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        Throwable e11 = q.e(b11);
        if (e11 != null) {
            this.errorReporter.reportError(e11);
        }
        Throwable e12 = q.e(b11);
        if (e12 == null) {
            s.f(b11, "runCatching {\n          …meException(it)\n        }");
            return (SecretKey) b11;
        }
        throw new SDKRuntimeException(e12);
    }
}