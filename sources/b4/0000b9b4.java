package v70;

import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class c extends d {

    /* renamed from: k  reason: collision with root package name */
    private int f54332k;

    /* renamed from: l  reason: collision with root package name */
    private Set f54333l;

    public c(Set set, r70.k kVar) {
        super(set);
        this.f54332k = 5;
        this.f54333l = Collections.EMPTY_SET;
        j(kVar);
    }

    @Override // v70.d, java.security.cert.PKIXParameters, java.security.cert.CertPathParameters
    public Object clone() {
        try {
            c cVar = new c(getTrustAnchors(), f());
            cVar.i(this);
            return cVar;
        } catch (Exception e11) {
            throw new RuntimeException(e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v70.d
    public void i(PKIXParameters pKIXParameters) {
        super.i(pKIXParameters);
        if (pKIXParameters instanceof c) {
            c cVar = (c) pKIXParameters;
            this.f54332k = cVar.f54332k;
            this.f54333l = new HashSet(cVar.f54333l);
        }
        if (pKIXParameters instanceof PKIXBuilderParameters) {
            this.f54332k = ((PKIXBuilderParameters) pKIXParameters).getMaxPathLength();
        }
    }

    public Set k() {
        return Collections.unmodifiableSet(this.f54333l);
    }

    public int l() {
        return this.f54332k;
    }
}