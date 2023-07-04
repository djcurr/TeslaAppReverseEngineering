package l6;

import com.adobe.xmp.XMPException;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(m mVar, String str, String str2) {
        m mVar2 = new m(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, str2, null);
        m mVar3 = new m("xml:lang", str, null);
        mVar2.c(mVar3);
        if ("x-default".equals(mVar3.z())) {
            mVar.a(1, mVar2);
        } else {
            mVar.b(mVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] b(m mVar, String str, String str2) {
        if (mVar.t().j()) {
            m mVar2 = null;
            if (mVar.A()) {
                Iterator H = mVar.H();
                m mVar3 = null;
                int i11 = 0;
                while (H.hasNext()) {
                    m mVar4 = (m) H.next();
                    if (mVar4.t().m()) {
                        throw new XMPException("Alt-text array item is not simple", 102);
                    }
                    if (!mVar4.B() || !"xml:lang".equals(mVar4.w(1).s())) {
                        throw new XMPException("Alt-text array item has no language qualifier", 102);
                    }
                    String z11 = mVar4.w(1).z();
                    if (str2.equals(z11)) {
                        return new Object[]{new Integer(1), mVar4};
                    }
                    if (str != null && z11.startsWith(str)) {
                        if (mVar2 == null) {
                            mVar2 = mVar4;
                        }
                        i11++;
                    } else if ("x-default".equals(z11)) {
                        mVar3 = mVar4;
                    }
                }
                return i11 == 1 ? new Object[]{new Integer(2), mVar2} : i11 > 1 ? new Object[]{new Integer(3), mVar2} : mVar3 != null ? new Object[]{new Integer(4), mVar3} : new Object[]{new Integer(5), mVar.l(1)};
            }
            return new Object[]{new Integer(0), null};
        }
        throw new XMPException("Localized text array is not alt-text", 102);
    }

    static void c(m mVar) {
        m u11 = mVar.u();
        if (mVar.t().n()) {
            u11.N(mVar);
        } else {
            u11.K(mVar);
        }
        if (u11.A() || !u11.t().o()) {
            return;
        }
        u11.u().K(u11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(m mVar) {
        if (mVar.t().k() && mVar.A()) {
            boolean z11 = false;
            Iterator H = mVar.H();
            while (true) {
                if (!H.hasNext()) {
                    break;
                } else if (((m) H.next()).t().h()) {
                    z11 = true;
                    break;
                }
            }
            if (z11) {
                mVar.t().t(true);
                o(mVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m e(m mVar, String str, boolean z11) {
        if (!mVar.t().o() && !mVar.t().q()) {
            if (!mVar.E()) {
                throw new XMPException("Named children only allowed for schemas and structs", 102);
            }
            if (mVar.t().i()) {
                throw new XMPException("Named children not allowed for arrays", 102);
            }
            if (z11) {
                mVar.t().B(true);
            }
        }
        m i11 = mVar.i(str);
        if (i11 == null && z11) {
            m mVar2 = new m(str, new n6.e());
            mVar2.U(true);
            mVar.b(mVar2);
            return mVar2;
        }
        return i11;
    }

    private static int f(m mVar, String str, boolean z11) {
        try {
            int parseInt = Integer.parseInt(str.substring(1, str.length() - 1));
            if (parseInt < 1) {
                throw new XMPException("Array index must be larger than zero", 102);
            }
            if (z11 && parseInt == mVar.o() + 1) {
                m mVar2 = new m(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, null);
                mVar2.U(true);
                mVar.b(mVar2);
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            throw new XMPException("Array index not digits.", 102);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m g(m mVar, m6.b bVar, boolean z11, n6.e eVar) {
        m mVar2;
        if (bVar == null || bVar.c() == 0) {
            throw new XMPException("Empty XMPPath", 102);
        }
        m j11 = j(mVar, bVar.b(0).c(), z11);
        if (j11 == null) {
            return null;
        }
        if (j11.E()) {
            j11.U(false);
            mVar2 = j11;
        } else {
            mVar2 = null;
        }
        for (int i11 = 1; i11 < bVar.c(); i11++) {
            try {
                j11 = k(j11, bVar.b(i11), z11);
                if (j11 == null) {
                    if (z11) {
                        c(mVar2);
                    }
                    return null;
                }
                if (j11.E()) {
                    j11.U(false);
                    if (i11 == 1 && bVar.b(i11).d() && bVar.b(i11).a() != 0) {
                        j11.t().f(bVar.b(i11).a(), true);
                    } else if (i11 < bVar.c() - 1 && bVar.b(i11).b() == 1 && !j11.t().m()) {
                        j11.t().B(true);
                    }
                    if (mVar2 == null) {
                        mVar2 = j11;
                    }
                }
            } catch (XMPException e11) {
                if (mVar2 != null) {
                    c(mVar2);
                }
                throw e11;
            }
        }
        if (mVar2 != null) {
            j11.t().r(eVar);
            j11.W(j11.t());
        }
        return j11;
    }

    private static m h(m mVar, String str, boolean z11) {
        m k11 = mVar.k(str);
        if (k11 == null && z11) {
            m mVar2 = new m(str, null);
            mVar2.U(true);
            mVar.c(mVar2);
            return mVar2;
        }
        return k11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m i(m mVar, String str, String str2, boolean z11) {
        m i11 = mVar.i(str);
        if (i11 == null && z11) {
            i11 = new m(str, new n6.e().A(true));
            i11.U(true);
            String a11 = k6.d.a().a(str);
            if (a11 == null) {
                if (str2 == null || str2.length() == 0) {
                    throw new XMPException("Unregistered schema namespace URI", 101);
                }
                a11 = k6.d.a().b(str, str2);
            }
            i11.Y(a11);
            mVar.b(i11);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m j(m mVar, String str, boolean z11) {
        return i(mVar, str, null, z11);
    }

    private static m k(m mVar, m6.d dVar, boolean z11) {
        int n11;
        int b11 = dVar.b();
        if (b11 == 1) {
            return e(mVar, dVar.c(), z11);
        }
        if (b11 == 2) {
            return h(mVar, dVar.c().substring(1), z11);
        }
        if (mVar.t().i()) {
            if (b11 == 3) {
                n11 = f(mVar, dVar.c(), z11);
            } else if (b11 == 4) {
                n11 = mVar.o();
            } else if (b11 == 6) {
                String[] i11 = h.i(dVar.c());
                n11 = l(mVar, i11[0], i11[1]);
            } else if (b11 != 5) {
                throw new XMPException("Unknown array indexing step in FollowXPathStep", 9);
            } else {
                String[] i12 = h.i(dVar.c());
                n11 = n(mVar, i12[0], i12[1], dVar.a());
            }
            if (1 > n11 || n11 > mVar.o()) {
                return null;
            }
            return mVar.l(n11);
        }
        throw new XMPException("Indexing applied to non-array", 102);
    }

    private static int l(m mVar, String str, String str2) {
        int i11 = -1;
        for (int i12 = 1; i12 <= mVar.o() && i11 < 0; i12++) {
            m l11 = mVar.l(i12);
            if (!l11.t().q()) {
                throw new XMPException("Field selector must be used on array of struct", 102);
            }
            int i13 = 1;
            while (true) {
                if (i13 <= l11.o()) {
                    m l12 = l11.l(i13);
                    if (str.equals(l12.s()) && str2.equals(l12.z())) {
                        i11 = i12;
                        break;
                    }
                    i13++;
                }
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(m mVar, String str) {
        if (mVar.t().i()) {
            for (int i11 = 1; i11 <= mVar.o(); i11++) {
                m l11 = mVar.l(i11);
                if (l11.B() && "xml:lang".equals(l11.w(1).s()) && str.equals(l11.w(1).z())) {
                    return i11;
                }
            }
            return -1;
        }
        throw new XMPException("Language item must be used on array", 102);
    }

    private static int n(m mVar, String str, String str2, int i11) {
        if ("xml:lang".equals(str)) {
            int m11 = m(mVar, h.h(str2));
            if (m11 >= 0 || (i11 & 4096) <= 0) {
                return m11;
            }
            m mVar2 = new m(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, null);
            mVar2.c(new m("xml:lang", "x-default", null));
            mVar.a(1, mVar2);
            return 1;
        }
        for (int i12 = 1; i12 < mVar.o(); i12++) {
            Iterator I = mVar.l(i12).I();
            while (I.hasNext()) {
                m mVar3 = (m) I.next();
                if (str.equals(mVar3.s()) && str2.equals(mVar3.z())) {
                    return i12;
                }
            }
        }
        return -1;
    }

    static void o(m mVar) {
        if (mVar.t().j()) {
            for (int i11 = 2; i11 <= mVar.o(); i11++) {
                m l11 = mVar.l(i11);
                if (l11.B() && "x-default".equals(l11.w(1).z())) {
                    try {
                        mVar.J(i11);
                        mVar.a(1, l11);
                    } catch (XMPException unused) {
                    }
                    if (i11 == 2) {
                        mVar.l(2).Y(l11.z());
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n6.e p(n6.e eVar, Object obj) {
        if (eVar == null) {
            eVar = new n6.e();
        }
        if (eVar.j()) {
            eVar.u(true);
        }
        if (eVar.k()) {
            eVar.v(true);
        }
        if (eVar.l()) {
            eVar.s(true);
        }
        if (!eVar.m() || obj == null || obj.toString().length() <= 0) {
            eVar.a(eVar.d());
            return eVar;
        }
        throw new XMPException("Structs and arrays can't have values", 103);
    }
}