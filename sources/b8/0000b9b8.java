package v70;

import e50.q0;
import e50.r0;
import e50.s0;
import e50.u;
import e50.w;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

/* loaded from: classes5.dex */
public class g implements r70.k {

    /* renamed from: a  reason: collision with root package name */
    private a f54345a;

    /* renamed from: b  reason: collision with root package name */
    private b f54346b;

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f54347c;

    /* renamed from: d  reason: collision with root package name */
    private Date f54348d;

    /* renamed from: e  reason: collision with root package name */
    private h f54349e;

    /* renamed from: f  reason: collision with root package name */
    private Collection f54350f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private Collection f54351g = new HashSet();

    public h a() {
        return this.f54349e;
    }

    public Date b() {
        if (this.f54348d != null) {
            return new Date(this.f54348d.getTime());
        }
        return null;
    }

    public a c() {
        return this.f54345a;
    }

    @Override // r70.k
    public Object clone() {
        g gVar = new g();
        gVar.f54349e = this.f54349e;
        gVar.f54348d = b();
        gVar.f54345a = this.f54345a;
        gVar.f54346b = this.f54346b;
        gVar.f54347c = this.f54347c;
        gVar.f54351g = e();
        gVar.f54350f = f();
        return gVar;
    }

    public BigInteger d() {
        return this.f54347c;
    }

    public Collection e() {
        return Collections.unmodifiableCollection(this.f54351g);
    }

    public Collection f() {
        return Collections.unmodifiableCollection(this.f54350f);
    }

    @Override // r70.k
    public boolean match(Object obj) {
        byte[] extensionValue;
        s0[] f11;
        if (obj instanceof h) {
            h hVar = (h) obj;
            h hVar2 = this.f54349e;
            if (hVar2 == null || hVar2.equals(hVar)) {
                if (this.f54347c == null || hVar.getSerialNumber().equals(this.f54347c)) {
                    if (this.f54345a == null || hVar.getHolder().equals(this.f54345a)) {
                        if (this.f54346b == null || hVar.getIssuer().equals(this.f54346b)) {
                            Date date = this.f54348d;
                            if (date != null) {
                                try {
                                    hVar.checkValidity(date);
                                } catch (CertificateExpiredException | CertificateNotYetValidException unused) {
                                    return false;
                                }
                            }
                            if ((!this.f54350f.isEmpty() || !this.f54351g.isEmpty()) && (extensionValue = hVar.getExtensionValue(u.B.t())) != null) {
                                try {
                                    f11 = r0.e(new org.bouncycastle.asn1.h(((org.bouncycastle.asn1.s0) org.bouncycastle.asn1.n.k(extensionValue)).r()).D()).f();
                                    if (!this.f54350f.isEmpty()) {
                                        boolean z11 = false;
                                        for (s0 s0Var : f11) {
                                            q0[] f12 = s0Var.f();
                                            int i11 = 0;
                                            while (true) {
                                                if (i11 >= f12.length) {
                                                    break;
                                                } else if (this.f54350f.contains(w.f(f12[i11].h()))) {
                                                    z11 = true;
                                                    break;
                                                } else {
                                                    i11++;
                                                }
                                            }
                                        }
                                        if (!z11) {
                                            return false;
                                        }
                                    }
                                } catch (IOException | IllegalArgumentException unused2) {
                                }
                                if (!this.f54351g.isEmpty()) {
                                    boolean z12 = false;
                                    for (s0 s0Var2 : f11) {
                                        q0[] f13 = s0Var2.f();
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= f13.length) {
                                                break;
                                            } else if (this.f54351g.contains(w.f(f13[i12].f()))) {
                                                z12 = true;
                                                break;
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                    if (!z12) {
                                        return false;
                                    }
                                }
                            }
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}