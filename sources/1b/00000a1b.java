package aq;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.crypto.impl.m;
import com.nimbusds.jose.crypto.impl.y;
import com.nimbusds.jose.crypto.impl.z;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.util.Set;
import zp.o;
import zp.p;

/* loaded from: classes2.dex */
public class f extends z implements p {

    /* renamed from: d  reason: collision with root package name */
    private final m f6717d;

    /* renamed from: e  reason: collision with root package name */
    private final RSAPublicKey f6718e;

    public f(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // zp.p
    public boolean a(o oVar, byte[] bArr, nq.c cVar) {
        if (this.f6717d.d(oVar)) {
            Signature c11 = y.c(oVar.r(), getJCAContext().a());
            try {
                c11.initVerify(this.f6718e);
                try {
                    c11.update(bArr);
                    return c11.verify(cVar.a());
                } catch (SignatureException unused) {
                    return false;
                }
            } catch (InvalidKeyException e11) {
                throw new JOSEException("Invalid public RSA key: " + e11.getMessage(), e11);
            }
        }
        return false;
    }

    public f(RSAPublicKey rSAPublicKey, Set<String> set) {
        m mVar = new m();
        this.f6717d = mVar;
        if (rSAPublicKey != null) {
            this.f6718e = rSAPublicKey;
            mVar.e(set);
            return;
        }
        throw new IllegalArgumentException("The public RSA key must not be null");
    }
}