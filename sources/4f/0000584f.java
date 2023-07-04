package com.stripe.android.stripe3ds2.security;

import android.content.Context;
import android.util.Base64;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.spec.X509EncodedKeySpec;
import java.util.Scanner;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class PublicKeyFactory {
    private final Context context;
    private final ErrorReporter errorReporter;

    public PublicKeyFactory(Context context, ErrorReporter errorReporter) {
        s.g(context, "context");
        s.g(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
        Context applicationContext = context.getApplicationContext();
        s.f(applicationContext, "context.applicationContext");
        this.context = applicationContext;
    }

    private final Certificate generateCertificate(String str) {
        Object b11;
        try {
            q.a aVar = q.f54772b;
            b11 = q.b(CertificateFactory.getInstance("X.509").generateCertificate(readFile(str)));
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
            return (Certificate) b11;
        }
        throw new SDKRuntimeException(e12);
    }

    private final PublicKey generatePublicKey(String str, Algorithm algorithm) {
        Object b11;
        try {
            q.a aVar = q.f54772b;
            b11 = q.b(KeyFactory.getInstance(algorithm.toString()).generatePublic(new X509EncodedKeySpec(readPublicKeyBytes(str))));
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
            return (PublicKey) b11;
        }
        throw new SDKRuntimeException(e12);
    }

    private final InputStream readFile(String str) {
        InputStream open = this.context.getAssets().open(str);
        s.f(open, "context.assets.open(fileName)");
        return open;
    }

    private final byte[] readPublicKeyBytes(String str) {
        Object b11;
        try {
            q.a aVar = q.f54772b;
            String publicKey = new Scanner(readFile(str)).useDelimiter("\\A").next();
            s.f(publicKey, "publicKey");
            byte[] bytes = publicKey.getBytes(d.f35187b);
            s.f(bytes, "this as java.lang.String).getBytes(charset)");
            b11 = q.b(Base64.decode(bytes, 0));
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
            return (byte[]) b11;
        }
        throw new SDKRuntimeException(e12);
    }

    public final PublicKey create(String directoryServerId) {
        s.g(directoryServerId, "directoryServerId");
        DirectoryServer lookup = DirectoryServer.Companion.lookup(directoryServerId);
        if (lookup.isCertificate()) {
            PublicKey publicKey = generateCertificate(lookup.getFileName()).getPublicKey();
            s.f(publicKey, "{\n            generateCe…Name).publicKey\n        }");
            return publicKey;
        }
        return generatePublicKey(lookup.getFileName(), lookup.getAlgorithm());
    }
}