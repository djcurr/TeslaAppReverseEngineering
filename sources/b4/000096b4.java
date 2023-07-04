package org.bouncycastle.x509.util;

import e50.n;
import e50.p;
import expo.modules.interfaces.permissions.PermissionsResponse;
import j60.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.provider.X509AttrCertParser;
import org.bouncycastle.jce.provider.X509CRLParser;
import org.bouncycastle.jce.provider.X509CertPairParser;
import org.bouncycastle.jce.provider.X509CertParser;
import org.bouncycastle.util.StoreException;
import org.slf4j.Marker;
import v70.g;
import v70.h;
import v70.i;
import v70.j;
import v70.k;
import v70.l;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static String f43219c = "com.sun.jndi.ldap.LdapCtxFactory";

    /* renamed from: d  reason: collision with root package name */
    private static String f43220d = "ignore";

    /* renamed from: e  reason: collision with root package name */
    private static int f43221e = 32;

    /* renamed from: f  reason: collision with root package name */
    private static long f43222f = 60000;

    /* renamed from: a  reason: collision with root package name */
    private d f43223a;

    /* renamed from: b  reason: collision with root package name */
    private Map f43224b = new HashMap(f43221e);

    public a(d dVar) {
        this.f43223a = dVar;
    }

    private String[] A(String str) {
        return str.split("\\s+");
    }

    private synchronized void a(String str, List list) {
        Map map;
        Date date = new Date(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        arrayList.add(date);
        arrayList.add(list);
        if (this.f43224b.containsKey(str)) {
            map = this.f43224b;
        } else {
            if (this.f43224b.size() >= f43221e) {
                long time = date.getTime();
                Object obj = null;
                for (Map.Entry entry : this.f43224b.entrySet()) {
                    long time2 = ((Date) ((List) entry.getValue()).get(0)).getTime();
                    if (time2 < time) {
                        obj = entry.getKey();
                        time = time2;
                    }
                }
                this.f43224b.remove(obj);
            }
            map = this.f43224b;
        }
        map.put(str, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c A[LOOP:0: B:28:0x009c->B:30:0x009f, LOOP_START, PHI: r4 
      PHI: (r4v5 int) = (r4v1 int), (r4v6 int) binds: [B:27:0x009a, B:30:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9 A[LOOP:1: B:36:0x00d3->B:38:0x00d9, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List b(v70.g r7, java.lang.String[] r8, java.lang.String[] r9, java.lang.String[] r10) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            v70.a r2 = r7.c()
            r3 = 0
            if (r2 == 0) goto L3d
            v70.a r2 = r7.c()
            java.math.BigInteger r2 = r2.h()
            if (r2 == 0) goto L2a
            v70.a r2 = r7.c()
            java.math.BigInteger r2 = r2.h()
            java.lang.String r2 = r2.toString()
            r1.add(r2)
        L2a:
            v70.a r2 = r7.c()
            java.security.Principal[] r2 = r2.c()
            if (r2 == 0) goto L3d
            v70.a r2 = r7.c()
            java.security.Principal[] r2 = r2.c()
            goto L3e
        L3d:
            r2 = r3
        L3e:
            v70.h r4 = r7.a()
            if (r4 == 0) goto L6d
            v70.h r4 = r7.a()
            v70.a r4 = r4.getHolder()
            java.security.Principal[] r4 = r4.c()
            if (r4 == 0) goto L5e
            v70.h r2 = r7.a()
            v70.a r2 = r2.getHolder()
            java.security.Principal[] r2 = r2.c()
        L5e:
            v70.h r4 = r7.a()
            java.math.BigInteger r4 = r4.getSerialNumber()
            java.lang.String r4 = r4.toString()
            r1.add(r4)
        L6d:
            r4 = 0
            if (r2 == 0) goto L87
            r3 = r2[r4]
            boolean r3 = r3 instanceof javax.security.auth.x500.X500Principal
            if (r3 == 0) goto L81
            r2 = r2[r4]
            javax.security.auth.x500.X500Principal r2 = (javax.security.auth.x500.X500Principal) r2
            java.lang.String r3 = "RFC1779"
            java.lang.String r3 = r2.getName(r3)
            goto L87
        L81:
            r2 = r2[r4]
            java.lang.String r3 = r2.getName()
        L87:
            java.math.BigInteger r2 = r7.d()
            if (r2 == 0) goto L98
            java.math.BigInteger r7 = r7.d()
            java.lang.String r7 = r7.toString()
            r1.add(r7)
        L98:
            java.lang.String r7 = "*"
            if (r3 == 0) goto Lc1
        L9c:
            int r2 = r10.length
            if (r4 >= r2) goto Lc1
            r2 = r10[r4]
            java.lang.String r2 = r6.y(r3, r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r2)
            r5.append(r7)
            java.lang.String r2 = r5.toString()
            java.util.List r2 = r6.z(r9, r2, r8)
            r0.addAll(r2)
            int r4 = r4 + 1
            goto L9c
        Lc1:
            int r10 = r1.size()
            if (r10 <= 0) goto Lf1
            j60.d r10 = r6.f43223a
            java.lang.String r10 = r10.J()
            if (r10 == 0) goto Lf1
            java.util.Iterator r10 = r1.iterator()
        Ld3:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lf1
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            j60.d r4 = r6.f43223a
            java.lang.String r4 = r4.J()
            java.lang.String[] r4 = r6.A(r4)
            java.util.List r2 = r6.z(r4, r2, r8)
            r0.addAll(r2)
            goto Ld3
        Lf1:
            int r10 = r1.size()
            if (r10 != 0) goto L100
            if (r3 != 0) goto L100
            java.util.List r7 = r6.z(r9, r7, r8)
            r0.addAll(r7)
        L100:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.util.a.b(v70.g, java.lang.String[], java.lang.String[], java.lang.String[]):java.util.List");
    }

    private List c(i iVar, String[] strArr, String[] strArr2, String[] strArr3) {
        ArrayList arrayList = new ArrayList();
        HashSet<X500Principal> hashSet = new HashSet();
        if (iVar.getIssuers() != null) {
            hashSet.addAll(iVar.getIssuers());
        }
        if (iVar.getCertificateChecking() != null) {
            hashSet.add(r(iVar.getCertificateChecking()));
        }
        if (iVar.a() != null) {
            Principal[] b11 = iVar.a().getIssuer().b();
            for (int i11 = 0; i11 < b11.length; i11++) {
                if (b11[i11] instanceof X500Principal) {
                    hashSet.add(b11[i11]);
                }
            }
        }
        String str = null;
        for (X500Principal x500Principal : hashSet) {
            str = x500Principal.getName("RFC1779");
            for (String str2 : strArr3) {
                arrayList.addAll(z(strArr2, Marker.ANY_MARKER + y(str, str2) + Marker.ANY_MARKER, strArr));
            }
        }
        if (str == null) {
            arrayList.addAll(z(strArr2, Marker.ANY_MARKER, strArr));
        }
        return arrayList;
    }

    private List d(k kVar, String[] strArr, String[] strArr2, String[] strArr3) {
        ArrayList arrayList = new ArrayList();
        String w11 = w(kVar);
        String bigInteger = kVar.getSerialNumber() != null ? kVar.getSerialNumber().toString() : null;
        if (kVar.getCertificate() != null) {
            w11 = kVar.getCertificate().getSubjectX500Principal().getName("RFC1779");
            bigInteger = kVar.getCertificate().getSerialNumber().toString();
        }
        if (w11 != null) {
            for (String str : strArr3) {
                arrayList.addAll(z(strArr2, Marker.ANY_MARKER + y(w11, str) + Marker.ANY_MARKER, strArr));
            }
        }
        if (bigInteger != null && this.f43223a.J() != null) {
            arrayList.addAll(z(A(this.f43223a.J()), bigInteger, strArr));
        }
        if (bigInteger == null && w11 == null) {
            arrayList.addAll(z(strArr2, Marker.ANY_MARKER, strArr));
        }
        return arrayList;
    }

    private DirContext e() {
        Properties properties = new Properties();
        properties.setProperty("java.naming.factory.initial", f43219c);
        properties.setProperty("java.naming.batchsize", "0");
        properties.setProperty("java.naming.provider.url", this.f43223a.H());
        properties.setProperty("java.naming.factory.url.pkgs", "com.sun.jndi.url");
        properties.setProperty("java.naming.referral", f43220d);
        properties.setProperty("java.naming.security.authentication", PermissionsResponse.SCOPE_NONE);
        return new InitialDirContext(properties);
    }

    private Set f(List list, g gVar) {
        HashSet hashSet = new HashSet();
        Iterator it2 = list.iterator();
        X509AttrCertParser x509AttrCertParser = new X509AttrCertParser();
        while (it2.hasNext()) {
            try {
                x509AttrCertParser.engineInit(new ByteArrayInputStream((byte[]) it2.next()));
                h hVar = (h) x509AttrCertParser.engineRead();
                if (gVar.match(hVar)) {
                    hashSet.add(hVar);
                }
            } catch (StreamParsingException unused) {
            }
        }
        return hashSet;
    }

    private Set g(List list, i iVar) {
        HashSet hashSet = new HashSet();
        X509CRLParser x509CRLParser = new X509CRLParser();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                x509CRLParser.engineInit(new ByteArrayInputStream((byte[]) it2.next()));
                X509CRL x509crl = (X509CRL) x509CRLParser.engineRead();
                if (iVar.match((Object) x509crl)) {
                    hashSet.add(x509crl);
                }
            } catch (StreamParsingException unused) {
            }
        }
        return hashSet;
    }

    private Set h(List list, k kVar) {
        HashSet hashSet = new HashSet();
        Iterator it2 = list.iterator();
        X509CertParser x509CertParser = new X509CertParser();
        while (it2.hasNext()) {
            try {
                x509CertParser.engineInit(new ByteArrayInputStream((byte[]) it2.next()));
                X509Certificate x509Certificate = (X509Certificate) x509CertParser.engineRead();
                if (kVar.match((Object) x509Certificate)) {
                    hashSet.add(x509Certificate);
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }

    private Set i(List list, j jVar) {
        l lVar;
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (i11 < list.size()) {
            try {
                try {
                    X509CertPairParser x509CertPairParser = new X509CertPairParser();
                    x509CertPairParser.engineInit(new ByteArrayInputStream((byte[]) list.get(i11)));
                    lVar = (l) x509CertPairParser.engineRead();
                } catch (StreamParsingException unused) {
                    int i12 = i11 + 1;
                    i11 = i12;
                    lVar = new l(new p(n.f(new org.bouncycastle.asn1.h((byte[]) list.get(i11)).D()), n.f(new org.bouncycastle.asn1.h((byte[]) list.get(i12)).D())));
                }
                if (jVar.match(lVar)) {
                    hashSet.add(lVar);
                }
            } catch (IOException | CertificateParsingException unused2) {
            }
            i11++;
        }
        return hashSet;
    }

    private List j(j jVar, String[] strArr, String[] strArr2, String[] strArr3) {
        ArrayList arrayList = new ArrayList();
        String w11 = jVar.b() != null ? w(jVar.b()) : null;
        if (jVar.a() != null && jVar.a().a() != null) {
            w11 = jVar.a().a().getSubjectX500Principal().getName("RFC1779");
        }
        if (w11 != null) {
            for (String str : strArr3) {
                arrayList.addAll(z(strArr2, Marker.ANY_MARKER + y(w11, str) + Marker.ANY_MARKER, strArr));
            }
        }
        if (w11 == null) {
            arrayList.addAll(z(strArr2, Marker.ANY_MARKER, strArr));
        }
        return arrayList;
    }

    private X500Principal r(X509Certificate x509Certificate) {
        return x509Certificate.getIssuerX500Principal();
    }

    private List v(String str) {
        List list = (List) this.f43224b.get(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (list == null || ((Date) list.get(0)).getTime() < currentTimeMillis - f43222f) {
            return null;
        }
        return (List) list.get(1);
    }

    private String w(k kVar) {
        try {
            byte[] subjectAsBytes = kVar.getSubjectAsBytes();
            if (subjectAsBytes != null) {
                return new X500Principal(subjectAsBytes).getName("RFC1779");
            }
            return null;
        } catch (IOException e11) {
            throw new StoreException("exception processing name: " + e11.getMessage(), e11);
        }
    }

    private String y(String str, String str2) {
        String lowerCase = str.toLowerCase();
        int indexOf = lowerCase.indexOf(str2.toLowerCase() + "=");
        if (indexOf == -1) {
            return "";
        }
        String substring = str.substring(indexOf + str2.length());
        int indexOf2 = substring.indexOf(44);
        if (indexOf2 == -1) {
            indexOf2 = substring.length();
        }
        while (substring.charAt(indexOf2 - 1) == '\\') {
            indexOf2 = substring.indexOf(44, indexOf2 + 1);
            if (indexOf2 == -1) {
                indexOf2 = substring.length();
            }
        }
        String substring2 = substring.substring(0, indexOf2);
        String substring3 = substring2.substring(substring2.indexOf(61) + 1);
        if (substring3.charAt(0) == ' ') {
            substring3 = substring3.substring(1);
        }
        if (substring3.startsWith("\"")) {
            substring3 = substring3.substring(1);
        }
        return substring3.endsWith("\"") ? substring3.substring(0, substring3.length() - 1) : substring3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
        if (r3 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List z(java.lang.String[] r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.util.a.z(java.lang.String[], java.lang.String, java.lang.String[]):java.util.List");
    }

    public Collection k(g gVar) {
        String[] A = A(this.f43223a.b());
        String[] A2 = A(this.f43223a.w());
        String[] A3 = A(this.f43223a.c());
        Set f11 = f(b(gVar, A, A2, A3), gVar);
        if (f11.size() == 0) {
            f11.addAll(f(b(new g(), A, A2, A3), gVar));
        }
        return f11;
    }

    public Collection l(i iVar) {
        String[] A = A(this.f43223a.d());
        String[] A2 = A(this.f43223a.x());
        String[] A3 = A(this.f43223a.e());
        Set g11 = g(c(iVar, A, A2, A3), iVar);
        if (g11.size() == 0) {
            g11.addAll(g(c(new i(), A, A2, A3), iVar));
        }
        return g11;
    }

    public Collection m(g gVar) {
        String[] A = A(this.f43223a.f());
        String[] A2 = A(this.f43223a.y());
        String[] A3 = A(this.f43223a.g());
        Set f11 = f(b(gVar, A, A2, A3), gVar);
        if (f11.size() == 0) {
            f11.addAll(f(b(new g(), A, A2, A3), gVar));
        }
        return f11;
    }

    public Collection n(i iVar) {
        String[] A = A(this.f43223a.h());
        String[] A2 = A(this.f43223a.z());
        String[] A3 = A(this.f43223a.i());
        Set g11 = g(c(iVar, A, A2, A3), iVar);
        if (g11.size() == 0) {
            g11.addAll(g(c(new i(), A, A2, A3), iVar));
        }
        return g11;
    }

    public Collection o(g gVar) {
        String[] A = A(this.f43223a.j());
        String[] A2 = A(this.f43223a.A());
        String[] A3 = A(this.f43223a.k());
        Set f11 = f(b(gVar, A, A2, A3), gVar);
        if (f11.size() == 0) {
            f11.addAll(f(b(new g(), A, A2, A3), gVar));
        }
        return f11;
    }

    public Collection p(i iVar) {
        String[] A = A(this.f43223a.l());
        String[] A2 = A(this.f43223a.B());
        String[] A3 = A(this.f43223a.m());
        Set g11 = g(c(iVar, A, A2, A3), iVar);
        if (g11.size() == 0) {
            g11.addAll(g(c(new i(), A, A2, A3), iVar));
        }
        return g11;
    }

    public Collection q(k kVar) {
        String[] A = A(this.f43223a.o());
        String[] A2 = A(this.f43223a.C());
        String[] A3 = A(this.f43223a.p());
        Set h11 = h(d(kVar, A, A2, A3), kVar);
        if (h11.size() == 0) {
            h11.addAll(h(d(new k(), A, A2, A3), kVar));
        }
        return h11;
    }

    public Collection s(i iVar) {
        String[] A = A(this.f43223a.q());
        String[] A2 = A(this.f43223a.E());
        String[] A3 = A(this.f43223a.r());
        Set g11 = g(c(iVar, A, A2, A3), iVar);
        if (g11.size() == 0) {
            g11.addAll(g(c(new i(), A, A2, A3), iVar));
        }
        return g11;
    }

    public Collection t(j jVar) {
        String[] A = A(this.f43223a.s());
        String[] A2 = A(this.f43223a.F());
        String[] A3 = A(this.f43223a.t());
        Set i11 = i(j(jVar, A, A2, A3), jVar);
        if (i11.size() == 0) {
            k kVar = new k();
            j jVar2 = new j();
            jVar2.c(kVar);
            jVar2.d(kVar);
            i11.addAll(i(j(jVar2, A, A2, A3), jVar));
        }
        return i11;
    }

    public Collection u(i iVar) {
        String[] A = A(this.f43223a.u());
        String[] A2 = A(this.f43223a.G());
        String[] A3 = A(this.f43223a.v());
        Set g11 = g(c(iVar, A, A2, A3), iVar);
        if (g11.size() == 0) {
            g11.addAll(g(c(new i(), A, A2, A3), iVar));
        }
        return g11;
    }

    public Collection x(k kVar) {
        String[] A = A(this.f43223a.K());
        String[] A2 = A(this.f43223a.I());
        String[] A3 = A(this.f43223a.L());
        Set h11 = h(d(kVar, A, A2, A3), kVar);
        if (h11.size() == 0) {
            h11.addAll(h(d(new k(), A, A2, A3), kVar));
        }
        return h11;
    }
}