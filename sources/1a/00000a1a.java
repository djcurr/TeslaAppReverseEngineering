package aq;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.crypto.impl.a0;
import com.nimbusds.jose.crypto.impl.b0;
import com.nimbusds.jose.crypto.impl.w;
import com.nimbusds.jose.crypto.impl.x;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import zp.h;
import zp.i;
import zp.k;
import zp.l;

/* loaded from: classes2.dex */
public class e extends x implements k {

    /* renamed from: c  reason: collision with root package name */
    private final RSAPublicKey f6715c;

    /* renamed from: d  reason: collision with root package name */
    private final SecretKey f6716d;

    public e(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // zp.k
    public i encrypt(l lVar, byte[] bArr) {
        nq.c e11;
        h r11 = lVar.r();
        zp.d t11 = lVar.t();
        SecretKey secretKey = this.f6716d;
        if (secretKey == null) {
            secretKey = com.nimbusds.jose.crypto.impl.l.d(t11, getJCAContext().b());
        }
        if (r11.equals(h.f60596c)) {
            e11 = nq.c.e(w.a(this.f6715c, secretKey, getJCAContext().e()));
        } else if (r11.equals(h.f60597d)) {
            e11 = nq.c.e(a0.a(this.f6715c, secretKey, getJCAContext().e()));
        } else if (r11.equals(h.f60598e)) {
            e11 = nq.c.e(b0.a(this.f6715c, secretKey, 256, getJCAContext().e()));
        } else if (r11.equals(h.f60599f)) {
            e11 = nq.c.e(b0.a(this.f6715c, secretKey, 384, getJCAContext().e()));
        } else if (r11.equals(h.f60600g)) {
            e11 = nq.c.e(b0.a(this.f6715c, secretKey, 512, getJCAContext().e()));
        } else {
            throw new JOSEException(com.nimbusds.jose.crypto.impl.e.c(r11, x.f17955a));
        }
        return com.nimbusds.jose.crypto.impl.l.c(lVar, bArr, secretKey, e11, getJCAContext());
    }

    public e(RSAPublicKey rSAPublicKey, SecretKey secretKey) {
        if (rSAPublicKey != null) {
            this.f6715c = rSAPublicKey;
            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList("AES", "ChaCha20")));
            if (secretKey != null) {
                if (secretKey.getAlgorithm() != null && unmodifiableSet.contains(secretKey.getAlgorithm())) {
                    this.f6716d = secretKey;
                    return;
                }
                throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES or ChaCha20");
            }
            this.f6716d = null;
            return;
        }
        throw new IllegalArgumentException("The public RSA key must not be null");
    }
}