package e60;

import e60.s;
import java.security.InvalidParameterException;
import java.security.cert.CertPathParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class r implements CertPathParameters {

    /* renamed from: a  reason: collision with root package name */
    private final s f24901a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<X509Certificate> f24902b;

    /* renamed from: c  reason: collision with root package name */
    private final int f24903c;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final s f24904a;

        /* renamed from: b  reason: collision with root package name */
        private int f24905b;

        /* renamed from: c  reason: collision with root package name */
        private Set<X509Certificate> f24906c;

        public b(s sVar) {
            this.f24905b = 5;
            this.f24906c = new HashSet();
            this.f24904a = sVar;
        }

        public b(PKIXBuilderParameters pKIXBuilderParameters) {
            this.f24905b = 5;
            this.f24906c = new HashSet();
            this.f24904a = new s.b(pKIXBuilderParameters).o();
            this.f24905b = pKIXBuilderParameters.getMaxPathLength();
        }

        public b d(Set<X509Certificate> set) {
            this.f24906c.addAll(set);
            return this;
        }

        public r e() {
            return new r(this);
        }

        public b f(int i11) {
            if (i11 >= -1) {
                this.f24905b = i11;
                return this;
            }
            throw new InvalidParameterException("The maximum path length parameter can not be less than -1.");
        }
    }

    private r(b bVar) {
        this.f24901a = bVar.f24904a;
        this.f24902b = Collections.unmodifiableSet(bVar.f24906c);
        this.f24903c = bVar.f24905b;
    }

    public s a() {
        return this.f24901a;
    }

    public Set b() {
        return this.f24902b;
    }

    public int c() {
        return this.f24903c;
    }

    @Override // java.security.cert.CertPathParameters
    public Object clone() {
        return this;
    }
}