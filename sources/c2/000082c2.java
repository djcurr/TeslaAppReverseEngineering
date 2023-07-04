package l6;

import com.adobe.xmp.XMPException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static Map f37048a;

    static {
        d();
    }

    private static void a(m mVar, m mVar2, boolean z11) {
        if (!mVar.z().equals(mVar2.z()) || mVar.o() != mVar2.o()) {
            throw new XMPException("Mismatch between alias and base nodes", 203);
        }
        if (!z11 && (!mVar.s().equals(mVar2.s()) || !mVar.t().equals(mVar2.t()) || mVar.x() != mVar2.x())) {
            throw new XMPException("Mismatch between alias and base nodes", 203);
        }
        Iterator H = mVar.H();
        Iterator H2 = mVar2.H();
        while (H.hasNext() && H2.hasNext()) {
            a((m) H.next(), (m) H2.next(), false);
        }
        Iterator I = mVar.I();
        Iterator I2 = mVar2.I();
        while (I.hasNext() && I2.hasNext()) {
            a((m) I.next(), (m) I2.next(), false);
        }
    }

    private static void b(m mVar) {
        Iterator H = mVar.H();
        while (H.hasNext()) {
            if (!((m) H.next()).A()) {
                H.remove();
            }
        }
    }

    private static void c(m mVar) {
        m e11 = n.e(mVar, "exif:GPSTimeStamp", false);
        if (e11 == null) {
            return;
        }
        try {
            k6.a b11 = k6.f.b(e11.z());
            if (b11.getYear() == 0 && b11.getMonth() == 0 && b11.X0() == 0) {
                m e12 = n.e(mVar, "exif:DateTimeOriginal", false);
                if (e12 == null) {
                    e12 = n.e(mVar, "exif:DateTimeDigitized", false);
                }
                k6.a b12 = k6.f.b(e12.z());
                Calendar C = b11.C();
                C.set(1, b12.getYear());
                C.set(2, b12.getMonth());
                C.set(5, b12.X0());
                e11.Y(k6.f.a(new i(C)));
            }
        } catch (XMPException unused) {
        }
    }

    private static void d() {
        f37048a = new HashMap();
        n6.e eVar = new n6.e();
        eVar.s(true);
        f37048a.put("dc:contributor", eVar);
        f37048a.put("dc:language", eVar);
        f37048a.put("dc:publisher", eVar);
        f37048a.put("dc:relation", eVar);
        f37048a.put("dc:subject", eVar);
        f37048a.put("dc:type", eVar);
        n6.e eVar2 = new n6.e();
        eVar2.s(true);
        eVar2.v(true);
        f37048a.put("dc:creator", eVar2);
        f37048a.put("dc:date", eVar2);
        n6.e eVar3 = new n6.e();
        eVar3.s(true);
        eVar3.v(true);
        eVar3.u(true);
        eVar3.t(true);
        f37048a.put("dc:description", eVar3);
        f37048a.put("dc:rights", eVar3);
        f37048a.put("dc:title", eVar3);
    }

    private static void e(k6.c cVar, m mVar) {
        String z11;
        m e11;
        int i11;
        String str;
        try {
            m j11 = n.j(((k) cVar).a(), "http://purl.org/dc/elements/1.1/", true);
            z11 = mVar.z();
            e11 = n.e(j11, "dc:rights", false);
        } catch (XMPException unused) {
            return;
        }
        if (e11 != null && e11.A()) {
            int m11 = n.m(e11, "x-default");
            if (m11 < 0) {
                cVar.a0("http://purl.org/dc/elements/1.1/", "rights", "", "x-default", e11.l(1).z(), null);
                m11 = n.m(e11, "x-default");
            }
            m l11 = e11.l(m11);
            String z12 = l11.z();
            int indexOf = z12.indexOf("\n\n");
            if (indexOf < 0) {
                if (!z11.equals(z12)) {
                    str = z12 + "\n\n" + z11;
                    l11.Y(str);
                }
                mVar.u().K(mVar);
            }
            if (!z12.substring(indexOf + 2).equals(z11)) {
                str = z12.substring(0, i11) + z11;
                l11.Y(str);
            }
            mVar.u().K(mVar);
            return;
        }
        cVar.a0("http://purl.org/dc/elements/1.1/", "rights", "", "x-default", "\n\n" + z11, null);
        mVar.u().K(mVar);
    }

    private static void f(m mVar, n6.d dVar) {
        if (mVar.q()) {
            mVar.S(false);
            boolean m11 = dVar.m();
            for (m mVar2 : mVar.y()) {
                if (mVar2.q()) {
                    Iterator H = mVar2.H();
                    while (H.hasNext()) {
                        m mVar3 = (m) H.next();
                        if (mVar3.D()) {
                            mVar3.Q(false);
                            o6.a d11 = k6.d.a().d(mVar3.s());
                            if (d11 != null) {
                                m mVar4 = null;
                                m i11 = n.i(mVar, d11.a(), null, true);
                                i11.U(false);
                                m e11 = n.e(i11, d11.b() + d11.c(), false);
                                if (e11 != null) {
                                    if (!d11.d().j()) {
                                        if (d11.d().i()) {
                                            int m12 = n.m(e11, "x-default");
                                            if (m12 != -1) {
                                                mVar4 = e11.l(m12);
                                            }
                                        } else if (e11.A()) {
                                            mVar4 = e11.l(1);
                                        }
                                        if (mVar4 == null) {
                                            k(H, mVar3, e11);
                                        } else if (m11) {
                                            a(mVar3, mVar4, true);
                                        }
                                    } else if (m11) {
                                        a(mVar3, e11, true);
                                    }
                                    H.remove();
                                } else if (d11.d().j()) {
                                    mVar3.V(d11.b() + d11.c());
                                    i11.b(mVar3);
                                    H.remove();
                                } else {
                                    m mVar5 = new m(d11.b() + d11.c(), d11.d().m());
                                    i11.b(mVar5);
                                    k(H, mVar3, mVar5);
                                }
                            }
                        }
                    }
                    mVar2.S(false);
                }
            }
        }
    }

    private static void g(m mVar) {
        for (int i11 = 1; i11 <= mVar.o(); i11++) {
            m l11 = mVar.l(i11);
            n6.e eVar = (n6.e) f37048a.get(l11.s());
            if (eVar != null) {
                if (l11.t().p()) {
                    m mVar2 = new m(l11.s(), eVar);
                    l11.V(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                    mVar2.b(l11);
                    mVar.P(i11, mVar2);
                    if (eVar.j() && !l11.t().h()) {
                        l11.c(new m("xml:lang", "x-default", null));
                    }
                } else {
                    l11.t().f(7680, false);
                    l11.t().r(eVar);
                    if (eVar.j()) {
                        i(l11);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k6.c h(k kVar, n6.d dVar) {
        m a11 = kVar.a();
        j(kVar);
        f(a11, dVar);
        l(a11);
        b(a11);
        return kVar;
    }

    private static void i(m mVar) {
        if (mVar == null || !mVar.t().i()) {
            return;
        }
        mVar.t().v(true).u(true).t(true);
        Iterator H = mVar.H();
        while (H.hasNext()) {
            m mVar2 = (m) H.next();
            if (!mVar2.t().m()) {
                if (!mVar2.t().h()) {
                    String z11 = mVar2.z();
                    if (z11 != null && z11.length() != 0) {
                        mVar2.c(new m("xml:lang", "x-repair", null));
                    }
                }
            }
            H.remove();
        }
    }

    private static void j(k kVar) {
        m e11;
        n.j(kVar.a(), "http://purl.org/dc/elements/1.1/", true);
        Iterator H = kVar.a().H();
        while (H.hasNext()) {
            m mVar = (m) H.next();
            if ("http://purl.org/dc/elements/1.1/".equals(mVar.s())) {
                g(mVar);
            } else if ("http://ns.adobe.com/exif/1.0/".equals(mVar.s())) {
                c(mVar);
                e11 = n.e(mVar, "exif:UserComment", false);
                if (e11 != null) {
                    i(e11);
                }
            } else if ("http://ns.adobe.com/xmp/1.0/DynamicMedia/".equals(mVar.s())) {
                m e12 = n.e(mVar, "xmpDM:copyright", false);
                if (e12 != null) {
                    e(kVar, e12);
                }
            } else if ("http://ns.adobe.com/xap/1.0/rights/".equals(mVar.s()) && (e11 = n.e(mVar, "xmpRights:UsageTerms", false)) != null) {
                i(e11);
            }
        }
    }

    private static void k(Iterator it2, m mVar, m mVar2) {
        if (mVar2.t().j()) {
            if (mVar.t().h()) {
                throw new XMPException("Alias to x-default already has a language qualifier", 203);
            }
            mVar.c(new m("xml:lang", "x-default", null));
        }
        it2.remove();
        mVar.V(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        mVar2.b(mVar);
    }

    private static void l(m mVar) {
        if (mVar.s() == null || mVar.s().length() < 36) {
            return;
        }
        String lowerCase = mVar.s().toLowerCase();
        if (lowerCase.startsWith("uuid:")) {
            lowerCase = lowerCase.substring(5);
        }
        if (h.a(lowerCase)) {
            m g11 = n.g(mVar, m6.c.a("http://ns.adobe.com/xap/1.0/mm/", "InstanceID"), true, null);
            if (g11 == null) {
                throw new XMPException("Failure creating xmpMM:InstanceID", 9);
            }
            g11.W(null);
            g11.Y("uuid:" + lowerCase);
            g11.M();
            g11.O();
            mVar.V(null);
        }
    }
}