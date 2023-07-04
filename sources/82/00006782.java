package e60;

import e50.w;
import e60.q;
import java.security.cert.CertPathParameters;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class s implements CertPathParameters {

    /* renamed from: a  reason: collision with root package name */
    private final PKIXParameters f24907a;

    /* renamed from: b  reason: collision with root package name */
    private final q f24908b;

    /* renamed from: c  reason: collision with root package name */
    private final Date f24909c;

    /* renamed from: d  reason: collision with root package name */
    private final Date f24910d;

    /* renamed from: e  reason: collision with root package name */
    private final List<p> f24911e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<w, p> f24912f;

    /* renamed from: g  reason: collision with root package name */
    private final List<l> f24913g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<w, l> f24914h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f24915i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f24916j;

    /* renamed from: k  reason: collision with root package name */
    private final int f24917k;

    /* renamed from: l  reason: collision with root package name */
    private final Set<TrustAnchor> f24918l;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final PKIXParameters f24919a;

        /* renamed from: b  reason: collision with root package name */
        private final Date f24920b;

        /* renamed from: c  reason: collision with root package name */
        private final Date f24921c;

        /* renamed from: d  reason: collision with root package name */
        private q f24922d;

        /* renamed from: e  reason: collision with root package name */
        private List<p> f24923e;

        /* renamed from: f  reason: collision with root package name */
        private Map<w, p> f24924f;

        /* renamed from: g  reason: collision with root package name */
        private List<l> f24925g;

        /* renamed from: h  reason: collision with root package name */
        private Map<w, l> f24926h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f24927i;

        /* renamed from: j  reason: collision with root package name */
        private int f24928j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f24929k;

        /* renamed from: l  reason: collision with root package name */
        private Set<TrustAnchor> f24930l;

        public b(s sVar) {
            this.f24923e = new ArrayList();
            this.f24924f = new HashMap();
            this.f24925g = new ArrayList();
            this.f24926h = new HashMap();
            this.f24928j = 0;
            this.f24929k = false;
            this.f24919a = sVar.f24907a;
            this.f24920b = sVar.f24909c;
            this.f24921c = sVar.f24910d;
            this.f24922d = sVar.f24908b;
            this.f24923e = new ArrayList(sVar.f24911e);
            this.f24924f = new HashMap(sVar.f24912f);
            this.f24925g = new ArrayList(sVar.f24913g);
            this.f24926h = new HashMap(sVar.f24914h);
            this.f24929k = sVar.f24916j;
            this.f24928j = sVar.f24917k;
            this.f24927i = sVar.z();
            this.f24930l = sVar.t();
        }

        public b(PKIXParameters pKIXParameters) {
            this.f24923e = new ArrayList();
            this.f24924f = new HashMap();
            this.f24925g = new ArrayList();
            this.f24926h = new HashMap();
            this.f24928j = 0;
            this.f24929k = false;
            this.f24919a = (PKIXParameters) pKIXParameters.clone();
            CertSelector targetCertConstraints = pKIXParameters.getTargetCertConstraints();
            if (targetCertConstraints != null) {
                this.f24922d = new q.b(targetCertConstraints).a();
            }
            Date date = pKIXParameters.getDate();
            this.f24920b = date;
            this.f24921c = date == null ? new Date() : date;
            this.f24927i = pKIXParameters.isRevocationEnabled();
            this.f24930l = pKIXParameters.getTrustAnchors();
        }

        public b m(l lVar) {
            this.f24925g.add(lVar);
            return this;
        }

        public b n(p pVar) {
            this.f24923e.add(pVar);
            return this;
        }

        public s o() {
            return new s(this);
        }

        public void p(boolean z11) {
            this.f24927i = z11;
        }

        public b q(q qVar) {
            this.f24922d = qVar;
            return this;
        }

        public b r(TrustAnchor trustAnchor) {
            this.f24930l = Collections.singleton(trustAnchor);
            return this;
        }

        public b s(boolean z11) {
            this.f24929k = z11;
            return this;
        }

        public b t(int i11) {
            this.f24928j = i11;
            return this;
        }
    }

    private s(b bVar) {
        this.f24907a = bVar.f24919a;
        this.f24909c = bVar.f24920b;
        this.f24910d = bVar.f24921c;
        this.f24911e = Collections.unmodifiableList(bVar.f24923e);
        this.f24912f = Collections.unmodifiableMap(new HashMap(bVar.f24924f));
        this.f24913g = Collections.unmodifiableList(bVar.f24925g);
        this.f24914h = Collections.unmodifiableMap(new HashMap(bVar.f24926h));
        this.f24908b = bVar.f24922d;
        this.f24915i = bVar.f24927i;
        this.f24916j = bVar.f24929k;
        this.f24917k = bVar.f24928j;
        this.f24918l = Collections.unmodifiableSet(bVar.f24930l);
    }

    public boolean A() {
        return this.f24916j;
    }

    @Override // java.security.cert.CertPathParameters
    public Object clone() {
        return this;
    }

    public List<l> k() {
        return this.f24913g;
    }

    public List l() {
        return this.f24907a.getCertPathCheckers();
    }

    public List<CertStore> m() {
        return this.f24907a.getCertStores();
    }

    public List<p> n() {
        return this.f24911e;
    }

    public Set o() {
        return this.f24907a.getInitialPolicies();
    }

    public Map<w, l> p() {
        return this.f24914h;
    }

    public Map<w, p> q() {
        return this.f24912f;
    }

    public String r() {
        return this.f24907a.getSigProvider();
    }

    public q s() {
        return this.f24908b;
    }

    public Set t() {
        return this.f24918l;
    }

    public Date u() {
        if (this.f24909c == null) {
            return null;
        }
        return new Date(this.f24909c.getTime());
    }

    public int v() {
        return this.f24917k;
    }

    public boolean w() {
        return this.f24907a.isAnyPolicyInhibited();
    }

    public boolean x() {
        return this.f24907a.isExplicitPolicyRequired();
    }

    public boolean y() {
        return this.f24907a.isPolicyMappingInhibited();
    }

    public boolean z() {
        return this.f24915i;
    }
}