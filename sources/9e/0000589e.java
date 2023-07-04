package com.stripe.android.stripe3ds2.transaction;

import com.nimbusds.jose.b;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertStore;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.s;
import nq.a;
import nq.m;
import nq.n;
import org.json.JSONObject;
import wz.u;
import wz.w;
import zp.o;
import zp.p;

/* loaded from: classes6.dex */
public final class DefaultJwsValidator implements JwsValidator {
    public static final Companion Companion = new Companion(null);
    private final ErrorReporter errorReporter;
    private final boolean isLiveMode;
    private final List<X509Certificate> rootCerts;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateChain(List<? extends a> list, List<? extends X509Certificate> list2) {
            List<X509Certificate> a11 = m.a(list);
            KeyStore createKeyStore = createKeyStore(list2);
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setCertificate(a11.get(0));
            PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(createKeyStore, x509CertSelector);
            pKIXBuilderParameters.setRevocationEnabled(false);
            pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(a11)));
            CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters);
        }

        public final KeyStore createKeyStore(List<? extends X509Certificate> rootCerts) {
            s.g(rootCerts, "rootCerts");
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            int i11 = 0;
            for (Object obj : rootCerts) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    w.s();
                }
                X509Certificate x509Certificate = (X509Certificate) obj;
                q0 q0Var = q0.f34921a;
                String format = String.format(Locale.ROOT, "ca_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
                s.f(format, "format(locale, format, *args)");
                keyStore.setCertificateEntry(format, rootCerts.get(i11));
                i11 = i12;
            }
            s.f(keyStore, "keyStore");
            return keyStore;
        }

        public final o sanitizedJwsHeader$3ds2sdk_release(o jwsHeader) {
            s.g(jwsHeader, "jwsHeader");
            o b11 = new o.a(jwsHeader).f(null).b();
            s.f(b11, "Builder(jwsHeader)\n     …\n                .build()");
            return b11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultJwsValidator(boolean z11, List<? extends X509Certificate> rootCerts, ErrorReporter errorReporter) {
        s.g(rootCerts, "rootCerts");
        s.g(errorReporter, "errorReporter");
        this.isLiveMode = z11;
        this.rootCerts = rootCerts;
        this.errorReporter = errorReporter;
    }

    private final PublicKey getPublicKeyFromHeader(o oVar) {
        List<a> m11 = oVar.m();
        s.f(m11, "jwsHeader.x509CertChain");
        PublicKey publicKey = n.b(((a) u.b0(m11)).a()).getPublicKey();
        s.f(publicKey, "parseWithException(\n    …ode()\n        ).publicKey");
        return publicKey;
    }

    private final p getVerifier(o oVar) {
        cq.a aVar = new cq.a();
        aVar.getJCAContext().c(bq.a.a());
        p c11 = aVar.c(oVar, getPublicKeyFromHeader(oVar));
        s.f(c11, "verifierFactory.createJW…KeyFromHeader(jwsHeader))");
        return c11;
    }

    private final boolean isValid(b bVar, List<? extends X509Certificate> list) {
        if (bVar.h().j() != null) {
            this.errorReporter.reportError(new IllegalArgumentException(s.p("Encountered a JWK in ", bVar.h())));
        }
        Companion companion = Companion;
        o h11 = bVar.h();
        s.f(h11, "jwsObject.header");
        o sanitizedJwsHeader$3ds2sdk_release = companion.sanitizedJwsHeader$3ds2sdk_release(h11);
        if (isCertificateChainValid(sanitizedJwsHeader$3ds2sdk_release.m(), list)) {
            return bVar.n(getVerifier(sanitizedJwsHeader$3ds2sdk_release));
        }
        return false;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.JwsValidator
    public JSONObject getPayload(String jws) {
        s.g(jws, "jws");
        b jwsObject = b.k(jws);
        if (this.isLiveMode) {
            s.f(jwsObject, "jwsObject");
            if (!isValid(jwsObject, this.rootCerts)) {
                throw new IllegalStateException("Could not validate JWS");
            }
        }
        return new JSONObject(jwsObject.b().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0005, B:5:0x000a, B:10:0x0014, B:12:0x0017, B:14:0x001e, B:15:0x002a, B:16:0x0035, B:17:0x0036, B:18:0x0041), top: B:27:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0005, B:5:0x000a, B:10:0x0014, B:12:0x0017, B:14:0x001e, B:15:0x002a, B:16:0x0035, B:17:0x0036, B:18:0x0041), top: B:27:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isCertificateChainValid(java.util.List<? extends nq.a> r3, java.util.List<? extends java.security.cert.X509Certificate> r4) {
        /*
            r2 = this;
            java.lang.String r0 = "rootCerts"
            kotlin.jvm.internal.s.g(r4, r0)
            vz.q$a r0 = vz.q.f54772b     // Catch: java.lang.Throwable -> L42
            r0 = 1
            if (r3 == 0) goto L13
            boolean r1 = r3.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = r0
        L14:
            r1 = r1 ^ r0
            if (r1 == 0) goto L36
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L42
            r0 = r0 ^ r1
            if (r0 == 0) goto L2a
            com.stripe.android.stripe3ds2.transaction.DefaultJwsValidator$Companion r0 = com.stripe.android.stripe3ds2.transaction.DefaultJwsValidator.Companion     // Catch: java.lang.Throwable -> L42
            com.stripe.android.stripe3ds2.transaction.DefaultJwsValidator.Companion.access$validateChain(r0, r3, r4)     // Catch: java.lang.Throwable -> L42
            vz.b0 r3 = vz.b0.f54756a     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = vz.q.b(r3)     // Catch: java.lang.Throwable -> L42
            goto L4d
        L2a:
            java.lang.String r3 = "Root certificates are empty"
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L42
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L42
            throw r4     // Catch: java.lang.Throwable -> L42
        L36:
            java.lang.String r3 = "JWSHeader's X.509 certificate chain is null or empty"
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L42
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L42
            throw r4     // Catch: java.lang.Throwable -> L42
        L42:
            r3 = move-exception
            vz.q$a r4 = vz.q.f54772b
            java.lang.Object r3 = vz.r.a(r3)
            java.lang.Object r3 = vz.q.b(r3)
        L4d:
            java.lang.Throwable r4 = vz.q.e(r3)
            if (r4 != 0) goto L54
            goto L59
        L54:
            com.stripe.android.stripe3ds2.observability.ErrorReporter r0 = r2.errorReporter
            r0.reportError(r4)
        L59:
            boolean r3 = vz.q.h(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.DefaultJwsValidator.isCertificateChainValid(java.util.List, java.util.List):boolean");
    }
}