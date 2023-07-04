package aq;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.crypto.impl.m;
import com.nimbusds.jose.crypto.impl.o;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import zp.h;
import zp.j;
import zp.l;

/* loaded from: classes2.dex */
public class a extends o implements j {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6710a;

    /* renamed from: b  reason: collision with root package name */
    private final m f6711b;

    public a(SecretKey secretKey, boolean z11) {
        super(secretKey);
        this.f6711b = new m();
        this.f6710a = z11;
    }

    @Override // zp.j
    public byte[] b(l lVar, nq.c cVar, nq.c cVar2, nq.c cVar3, nq.c cVar4) {
        if (!this.f6710a) {
            h r11 = lVar.r();
            if (!r11.equals(h.f60604k)) {
                throw new JOSEException(com.nimbusds.jose.crypto.impl.e.c(r11, o.SUPPORTED_ALGORITHMS));
            }
            if (cVar != null) {
                throw new JOSEException("Unexpected present JWE encrypted key");
            }
        }
        if (cVar2 != null) {
            if (cVar4 != null) {
                this.f6711b.a(lVar);
                return com.nimbusds.jose.crypto.impl.l.b(lVar, null, cVar2, cVar3, cVar4, getKey(), getJCAContext());
            }
            throw new JOSEException("Missing JWE authentication tag");
        }
        throw new JOSEException("Unexpected present JWE initialization vector (IV)");
    }

    public a(byte[] bArr) {
        this(new SecretKeySpec(bArr, "AES"), false);
    }
}