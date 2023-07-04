package aq;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.crypto.impl.m;
import com.nimbusds.jose.crypto.impl.q;
import com.nimbusds.jose.crypto.impl.r;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.util.Set;
import zp.n;
import zp.o;
import zp.p;

/* loaded from: classes2.dex */
public class c extends r implements p {

    /* renamed from: d  reason: collision with root package name */
    private final m f6712d;

    /* renamed from: e  reason: collision with root package name */
    private final ECPublicKey f6713e;

    public c(ECPublicKey eCPublicKey) {
        this(eCPublicKey, null);
    }

    @Override // zp.p
    public boolean a(o oVar, byte[] bArr, nq.c cVar) {
        n r11 = oVar.r();
        if (c().contains(r11)) {
            if (this.f6712d.d(oVar)) {
                byte[] a11 = cVar.a();
                if (q.a(oVar.r()) != a11.length) {
                    return false;
                }
                try {
                    byte[] e11 = q.e(a11);
                    Signature b11 = q.b(r11, getJCAContext().a());
                    try {
                        b11.initVerify(this.f6713e);
                        b11.update(bArr);
                        return b11.verify(e11);
                    } catch (InvalidKeyException e12) {
                        throw new JOSEException("Invalid EC public key: " + e12.getMessage(), e12);
                    } catch (SignatureException unused) {
                        return false;
                    }
                } catch (JOSEException unused2) {
                    return false;
                }
            }
            return false;
        }
        throw new JOSEException(com.nimbusds.jose.crypto.impl.e.d(r11, c()));
    }

    public c(ECPublicKey eCPublicKey, Set<String> set) {
        super(q.d(eCPublicKey));
        m mVar = new m();
        this.f6712d = mVar;
        this.f6713e = eCPublicKey;
        if (dq.b.b(eCPublicKey, fq.a.b(d()).iterator().next().e())) {
            mVar.e(set);
            return;
        }
        throw new JOSEException("Curve / public key parameters mismatch");
    }
}