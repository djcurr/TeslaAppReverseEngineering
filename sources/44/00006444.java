package cq;

import aq.c;
import aq.d;
import aq.f;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyTypeException;
import com.nimbusds.jose.crypto.impl.r;
import com.nimbusds.jose.crypto.impl.v;
import com.nimbusds.jose.crypto.impl.z;
import eq.b;
import java.security.Key;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import zp.n;
import zp.o;
import zp.p;

/* loaded from: classes2.dex */
public class a implements eq.a {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<n> f23055b;

    /* renamed from: a  reason: collision with root package name */
    private final b f23056a = new b();

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(v.f17953d);
        linkedHashSet.addAll(z.f17957c);
        linkedHashSet.addAll(r.f17948c);
        f23055b = Collections.unmodifiableSet(linkedHashSet);
    }

    public p c(o oVar, Key key) {
        p cVar;
        if (v.f17953d.contains(oVar.r())) {
            if (key instanceof SecretKey) {
                cVar = new d((SecretKey) key);
            } else {
                throw new KeyTypeException(SecretKey.class);
            }
        } else if (z.f17957c.contains(oVar.r())) {
            if (key instanceof RSAPublicKey) {
                cVar = new f((RSAPublicKey) key);
            } else {
                throw new KeyTypeException(RSAPublicKey.class);
            }
        } else if (r.f17948c.contains(oVar.r())) {
            if (key instanceof ECPublicKey) {
                cVar = new c((ECPublicKey) key);
            } else {
                throw new KeyTypeException(ECPublicKey.class);
            }
        } else {
            throw new JOSEException("Unsupported JWS algorithm: " + oVar.r());
        }
        cVar.getJCAContext().c(this.f23056a.a());
        return cVar;
    }

    @Override // eq.a
    public b getJCAContext() {
        return this.f23056a;
    }
}