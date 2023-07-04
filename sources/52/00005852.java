package com.stripe.android.stripe3ds2.security;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import fq.a;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class StripeEphemeralKeyPairGenerator implements EphemeralKeyPairGenerator {
    private final ErrorReporter errorReporter;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String ALGORITHM = Algorithm.EC.toString();

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StripeEphemeralKeyPairGenerator(ErrorReporter errorReporter) {
        s.g(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    @Override // com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator
    public KeyPair generate() {
        Object b11;
        try {
            q.a aVar = q.f54772b;
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(ALGORITHM);
            keyPairGenerator.initialize(new ECGenParameterSpec(a.f26716c.c()));
            b11 = q.b(keyPairGenerator.generateKeyPair());
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
            return (KeyPair) b11;
        }
        throw new SDKRuntimeException(e12);
    }
}