package aq;

import com.nimbusds.jose.crypto.impl.m;
import com.nimbusds.jose.crypto.impl.s;
import com.nimbusds.jose.crypto.impl.v;
import java.util.Set;
import javax.crypto.SecretKey;
import zp.o;
import zp.p;

/* loaded from: classes2.dex */
public class d extends v implements p {

    /* renamed from: e  reason: collision with root package name */
    private final m f6714e;

    public d(byte[] bArr) {
        this(bArr, null);
    }

    @Override // zp.p
    public boolean a(o oVar, byte[] bArr, nq.c cVar) {
        if (this.f6714e.d(oVar)) {
            return dq.a.a(s.a(v.d(oVar.r()), e(), bArr, getJCAContext().a()), cVar.a());
        }
        return false;
    }

    public d(SecretKey secretKey) {
        this(secretKey.getEncoded());
    }

    public d(byte[] bArr, Set<String> set) {
        super(bArr, v.f17953d);
        m mVar = new m();
        this.f6714e = mVar;
        mVar.e(set);
    }
}