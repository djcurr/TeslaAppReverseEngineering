package aq;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.crypto.impl.o;
import fq.j;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import zp.h;
import zp.i;
import zp.k;
import zp.l;

/* loaded from: classes2.dex */
public class b extends o implements k {
    public b(SecretKey secretKey) {
        super(secretKey);
    }

    @Override // zp.k
    public i encrypt(l lVar, byte[] bArr) {
        h r11 = lVar.r();
        if (r11.equals(h.f60604k)) {
            zp.d t11 = lVar.t();
            if (t11.b() == nq.e.f(getKey().getEncoded())) {
                return com.nimbusds.jose.crypto.impl.l.c(lVar, bArr, getKey(), null, getJCAContext());
            }
            throw new KeyLengthException(t11.b(), t11);
        }
        throw new JOSEException(com.nimbusds.jose.crypto.impl.e.c(r11, o.SUPPORTED_ALGORITHMS));
    }

    public b(byte[] bArr) {
        this(new SecretKeySpec(bArr, "AES"));
    }

    public b(j jVar) {
        this(jVar.r("AES"));
    }
}