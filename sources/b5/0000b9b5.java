package v70;

import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public class d extends PKIXParameters {

    /* renamed from: a  reason: collision with root package name */
    private List f54334a;

    /* renamed from: b  reason: collision with root package name */
    private r70.k f54335b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f54336c;

    /* renamed from: d  reason: collision with root package name */
    private List f54337d;

    /* renamed from: e  reason: collision with root package name */
    private Set f54338e;

    /* renamed from: f  reason: collision with root package name */
    private Set f54339f;

    /* renamed from: g  reason: collision with root package name */
    private Set f54340g;

    /* renamed from: h  reason: collision with root package name */
    private Set f54341h;

    /* renamed from: i  reason: collision with root package name */
    private int f54342i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f54343j;

    public d(Set set) {
        super(set);
        this.f54342i = 0;
        this.f54343j = false;
        this.f54334a = new ArrayList();
        this.f54337d = new ArrayList();
        this.f54338e = new HashSet();
        this.f54339f = new HashSet();
        this.f54340g = new HashSet();
        this.f54341h = new HashSet();
    }

    public List a() {
        return Collections.unmodifiableList(this.f54337d);
    }

    public Set b() {
        return Collections.unmodifiableSet(this.f54341h);
    }

    public Set c() {
        return Collections.unmodifiableSet(this.f54339f);
    }

    @Override // java.security.cert.PKIXParameters, java.security.cert.CertPathParameters
    public Object clone() {
        try {
            d dVar = new d(getTrustAnchors());
            dVar.i(this);
            return dVar;
        } catch (Exception e11) {
            throw new RuntimeException(e11.getMessage());
        }
    }

    public Set d() {
        return Collections.unmodifiableSet(this.f54340g);
    }

    public List e() {
        return Collections.unmodifiableList(new ArrayList(this.f54334a));
    }

    public r70.k f() {
        r70.k kVar = this.f54335b;
        if (kVar != null) {
            return (r70.k) kVar.clone();
        }
        return null;
    }

    public int g() {
        return this.f54342i;
    }

    public boolean h() {
        return this.f54343j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(PKIXParameters pKIXParameters) {
        setDate(pKIXParameters.getDate());
        setCertPathCheckers(pKIXParameters.getCertPathCheckers());
        setCertStores(pKIXParameters.getCertStores());
        setAnyPolicyInhibited(pKIXParameters.isAnyPolicyInhibited());
        setExplicitPolicyRequired(pKIXParameters.isExplicitPolicyRequired());
        setPolicyMappingInhibited(pKIXParameters.isPolicyMappingInhibited());
        setRevocationEnabled(pKIXParameters.isRevocationEnabled());
        setInitialPolicies(pKIXParameters.getInitialPolicies());
        setPolicyQualifiersRejected(pKIXParameters.getPolicyQualifiersRejected());
        setSigProvider(pKIXParameters.getSigProvider());
        setTargetCertConstraints(pKIXParameters.getTargetCertConstraints());
        try {
            setTrustAnchors(pKIXParameters.getTrustAnchors());
            if (pKIXParameters instanceof d) {
                d dVar = (d) pKIXParameters;
                this.f54342i = dVar.f54342i;
                this.f54343j = dVar.f54343j;
                this.f54336c = dVar.f54336c;
                r70.k kVar = dVar.f54335b;
                this.f54335b = kVar == null ? null : (r70.k) kVar.clone();
                this.f54334a = new ArrayList(dVar.f54334a);
                this.f54337d = new ArrayList(dVar.f54337d);
                this.f54338e = new HashSet(dVar.f54338e);
                this.f54340g = new HashSet(dVar.f54340g);
                this.f54339f = new HashSet(dVar.f54339f);
                this.f54341h = new HashSet(dVar.f54341h);
            }
        } catch (Exception e11) {
            throw new RuntimeException(e11.getMessage());
        }
    }

    public void j(r70.k kVar) {
        this.f54335b = kVar != null ? (r70.k) kVar.clone() : null;
    }

    @Override // java.security.cert.PKIXParameters
    public void setCertStores(List list) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                addCertStore((CertStore) it2.next());
            }
        }
    }

    @Override // java.security.cert.PKIXParameters
    public void setTargetCertConstraints(CertSelector certSelector) {
        super.setTargetCertConstraints(certSelector);
        this.f54335b = certSelector != null ? k.a((X509CertSelector) certSelector) : null;
    }
}