package com.stripe.android.stripe3ds2.security;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.s;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class EcKeyFactory {
    private final ErrorReporter errorReporter;
    private final KeyFactory keyFactory;

    public EcKeyFactory(ErrorReporter errorReporter) {
        Object b11;
        s.g(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
        try {
            q.a aVar = q.f54772b;
            b11 = q.b(KeyFactory.getInstance("EC"));
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        Throwable e11 = q.e(b11);
        if (e11 != null) {
            this.errorReporter.reportError(e11);
        }
        Throwable e12 = q.e(b11);
        if (e12 != null) {
            throw new SDKRuntimeException(e12);
        }
        s.f(b11, "runCatching {\n          …xception(error)\n        }");
        this.keyFactory = (KeyFactory) b11;
    }

    public final ECPrivateKey createPrivate(byte[] privateKeyEncoded) {
        Object b11;
        PrivateKey generatePrivate;
        s.g(privateKeyEncoded, "privateKeyEncoded");
        try {
            q.a aVar = q.f54772b;
            generatePrivate = this.keyFactory.generatePrivate(new PKCS8EncodedKeySpec(privateKeyEncoded));
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (generatePrivate != null) {
            b11 = q.b((ECPrivateKey) generatePrivate);
            Throwable e11 = q.e(b11);
            if (e11 == null) {
                return (ECPrivateKey) b11;
            }
            throw new SDKRuntimeException(e11);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
    }

    public final ECPublicKey createPublic(byte[] publicKeyEncoded) {
        Object b11;
        PublicKey generatePublic;
        s.g(publicKeyEncoded, "publicKeyEncoded");
        try {
            q.a aVar = q.f54772b;
            generatePublic = this.keyFactory.generatePublic(new X509EncodedKeySpec(publicKeyEncoded));
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (generatePublic != null) {
            b11 = q.b((ECPublicKey) generatePublic);
            Throwable e11 = q.e(b11);
            if (e11 != null) {
                this.errorReporter.reportError(e11);
            }
            Throwable e12 = q.e(b11);
            if (e12 == null) {
                return (ECPublicKey) b11;
            }
            throw new SDKRuntimeException(e12);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
    }
}