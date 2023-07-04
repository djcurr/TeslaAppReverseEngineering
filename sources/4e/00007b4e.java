package j60;

import java.security.cert.CertStoreParameters;
import java.util.Collection;

/* loaded from: classes5.dex */
public class b implements CertStoreParameters {

    /* renamed from: a  reason: collision with root package name */
    private Collection f33244a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f33245b;

    public Collection a() {
        return this.f33244a;
    }

    public boolean b() {
        return this.f33245b;
    }

    @Override // java.security.cert.CertStoreParameters
    public Object clone() {
        return this;
    }
}