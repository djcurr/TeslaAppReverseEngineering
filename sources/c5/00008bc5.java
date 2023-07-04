package net.time4j.history;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.time4j.engine.m0;
import net.time4j.engine.z;
import net.time4j.format.t;
import net.time4j.g0;
import okhttp3.HttpUrl;

/* loaded from: classes5.dex */
public final class d implements m0, Serializable {
    private static final Map<String, d> A;

    /* renamed from: p  reason: collision with root package name */
    public static final net.time4j.engine.c<p> f41363p = net.time4j.format.a.e("YEAR_DEFINITION", p.class);

    /* renamed from: q  reason: collision with root package name */
    public static final d f41364q;
    private static final long serialVersionUID = 4100690610730913643L;

    /* renamed from: t  reason: collision with root package name */
    public static final d f41365t;

    /* renamed from: w  reason: collision with root package name */
    public static final d f41366w;

    /* renamed from: x  reason: collision with root package name */
    private static final long f41367x;

    /* renamed from: y  reason: collision with root package name */
    private static final d f41368y;

    /* renamed from: z  reason: collision with root package name */
    private static final d f41369z;

    /* renamed from: a  reason: collision with root package name */
    private final transient l30.b f41370a;

    /* renamed from: b  reason: collision with root package name */
    private final transient List<f> f41371b;

    /* renamed from: c  reason: collision with root package name */
    private final transient net.time4j.history.a f41372c;

    /* renamed from: d  reason: collision with root package name */
    private final transient o f41373d;

    /* renamed from: e  reason: collision with root package name */
    private final transient g f41374e;

    /* renamed from: f  reason: collision with root package name */
    private final transient net.time4j.engine.p<h> f41375f;

    /* renamed from: g  reason: collision with root package name */
    private final transient net.time4j.engine.p<j> f41376g;

    /* renamed from: h  reason: collision with root package name */
    private final transient t<Integer> f41377h;

    /* renamed from: i  reason: collision with root package name */
    private final transient net.time4j.engine.p<Integer> f41378i;

    /* renamed from: j  reason: collision with root package name */
    private final transient net.time4j.engine.p<Integer> f41379j;

    /* renamed from: k  reason: collision with root package name */
    private final transient t<Integer> f41380k;

    /* renamed from: l  reason: collision with root package name */
    private final transient t<Integer> f41381l;

    /* renamed from: m  reason: collision with root package name */
    private final transient t<Integer> f41382m;

    /* renamed from: n  reason: collision with root package name */
    private final transient net.time4j.engine.p<Integer> f41383n;

    /* renamed from: o  reason: collision with root package name */
    private final transient Set<net.time4j.engine.p<?>> f41384o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41385a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f41386b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f41387c;

        static {
            int[] iArr = new int[p.values().length];
            f41387c = iArr;
            try {
                iArr[p.DUAL_DATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41387c[p.AFTER_NEW_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41387c[p.BEFORE_NEW_YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[j.values().length];
            f41386b = iArr2;
            try {
                iArr2[j.HISPANIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41386b[j.BYZANTINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41386b[j.AB_URBE_CONDITA.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[l30.b.values().length];
            f41385a = iArr3;
            try {
                iArr3[l30.b.PROLEPTIC_GREGORIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41385a[l30.b.PROLEPTIC_JULIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41385a[l30.b.PROLEPTIC_BYZANTINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41385a[l30.b.SWEDEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41385a[l30.b.INTRODUCTION_ON_1582_10_15.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41385a[l30.b.SINGLE_CUTOVER_DATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        l30.b bVar = l30.b.PROLEPTIC_GREGORIAN;
        c cVar = c.GREGORIAN;
        f41364q = new d(bVar, Collections.singletonList(new f(Long.MIN_VALUE, cVar, cVar)));
        l30.b bVar2 = l30.b.PROLEPTIC_JULIAN;
        c cVar2 = c.JULIAN;
        d dVar = new d(bVar2, Collections.singletonList(new f(Long.MIN_VALUE, cVar2, cVar2)));
        f41365t = dVar;
        l30.b bVar3 = l30.b.PROLEPTIC_BYZANTINE;
        List singletonList = Collections.singletonList(new f(Long.MIN_VALUE, cVar2, cVar2));
        n nVar = n.BEGIN_OF_SEPTEMBER;
        f41366w = new d(bVar3, singletonList, null, new o(nVar, Integer.MAX_VALUE), g.c(g0.r0().G()));
        long longValue = ((Long) g0.N0(1582, 10, 15).l(z.MODIFIED_JULIAN_DATE)).longValue();
        f41367x = longValue;
        f41368y = F(longValue);
        ArrayList arrayList = new ArrayList();
        c cVar3 = c.SWEDISH;
        arrayList.add(new f(-57959L, cVar2, cVar3));
        arrayList.add(new f(-53575L, cVar3, cVar2));
        arrayList.add(new f(-38611L, cVar2, cVar));
        d dVar2 = new d(l30.b.SWEDEN, Collections.unmodifiableList(arrayList));
        f41369z = dVar2;
        HashMap hashMap = new HashMap();
        j jVar = j.AD;
        g0 d11 = dVar.d(h.f(jVar, 988, 3, 1));
        g0 d12 = dVar.d(h.f(jVar, 1382, 12, 24));
        g0 d13 = dVar.d(h.f(jVar, 1421, 12, 24));
        g0 d14 = dVar.d(h.f(jVar, 1699, 12, 31));
        d E = E();
        n nVar2 = n.BEGIN_OF_JANUARY;
        o until = nVar2.until(1383);
        n nVar3 = n.CHRISTMAS_STYLE;
        hashMap.put("ES", E.K(until.b(nVar3.until(1556))).J(g.f(d12)));
        hashMap.put("PT", E().K(nVar2.until(1422).b(nVar3.until(1556))).J(g.f(d13)));
        hashMap.put("FR", G(g0.N0(1582, 12, 20)).K(n.EASTER_STYLE.until(1567)));
        hashMap.put("DE", E().K(nVar3.until(1544)));
        hashMap.put("DE-BAYERN", G(g0.N0(1583, 10, 16)).K(nVar3.until(1544)));
        hashMap.put("DE-PREUSSEN", G(g0.N0(1610, 9, 2)).K(nVar3.until(1559)));
        hashMap.put("DE-PROTESTANT", G(g0.N0(1700, 3, 1)).K(nVar3.until(1559)));
        hashMap.put("NL", G(g0.N0(1583, 1, 1)));
        hashMap.put("AT", G(g0.N0(1584, 1, 17)));
        hashMap.put("CH", G(g0.N0(1584, 1, 22)));
        hashMap.put("HU", G(g0.N0(1587, 11, 1)));
        d G = G(g0.N0(1700, 3, 1));
        n nVar4 = n.MARIA_ANUNCIATA;
        hashMap.put("DK", G.K(nVar4.until(1623)));
        hashMap.put("NO", G(g0.N0(1700, 3, 1)).K(nVar4.until(1623)));
        hashMap.put("IT", E().K(nVar3.until(1583)));
        hashMap.put("IT-FLORENCE", E().K(nVar4.until(1749)));
        hashMap.put("IT-PISA", E().K(n.CALCULUS_PISANUS.until(1749)));
        d E2 = E();
        n nVar5 = n.BEGIN_OF_MARCH;
        hashMap.put("IT-VENICE", E2.K(nVar5.until(1798)));
        hashMap.put("GB", G(g0.N0(1752, 9, 14)).K(nVar3.until(1087).b(nVar2.until(1155)).b(nVar4.until(1752))));
        hashMap.put("GB-SCT", G(g0.N0(1752, 9, 14)).K(nVar3.until(1087).b(nVar2.until(1155)).b(nVar4.until(1600))));
        hashMap.put("RU", G(g0.N0(1918, 2, 14)).K(nVar2.until(988).b(nVar5.until(1493)).b(nVar.until(1700))).J(g.b(d11, d14)));
        hashMap.put("SE", dVar2);
        A = Collections.unmodifiableMap(hashMap);
    }

    private d(l30.b bVar, List<f> list) {
        this(bVar, list, null, null, g.f41392d);
    }

    private boolean A(h hVar) {
        int annoDomini = hVar.c().annoDomini(hVar.d());
        return this == f41366w ? annoDomini < -5508 || (annoDomini == -5508 && hVar.getMonth() < 9) || annoDomini > 999979465 : this == f41365t ? Math.abs(annoDomini) > 999979465 : this == f41364q ? Math.abs(annoDomini) > 999999999 : annoDomini < -44 || annoDomini > 9999;
    }

    public static d D(Locale locale) {
        d dVar;
        String country = locale.getCountry();
        if (locale.getVariant().isEmpty()) {
            dVar = null;
        } else {
            country = country + "-" + locale.getVariant();
            dVar = A.get(country);
        }
        if (dVar == null) {
            dVar = A.get(country);
        }
        return dVar == null ? E() : dVar;
    }

    public static d E() {
        return f41368y;
    }

    private static d F(long j11) {
        return new d(j11 == f41367x ? l30.b.INTRODUCTION_ON_1582_10_15 : l30.b.SINGLE_CUTOVER_DATE, Collections.singletonList(new f(j11, c.JULIAN, c.GREGORIAN)));
    }

    public static d G(g0 g0Var) {
        if (g0Var.equals(g0.r0().G())) {
            return f41365t;
        }
        if (g0Var.equals(g0.r0().H())) {
            return f41364q;
        }
        long longValue = ((Long) g0Var.l(z.MODIFIED_JULIAN_DATE)).longValue();
        c(longValue);
        if (longValue == f41367x) {
            return f41368y;
        }
        return F(longValue);
    }

    public static d H() {
        return f41369z;
    }

    private static void c(long j11) {
        if (j11 < f41367x) {
            throw new IllegalArgumentException("Gregorian calendar did not exist before 1582-10-15");
        }
    }

    public static d k(String str) {
        d H;
        int i11;
        d J;
        if (str.startsWith("historic-")) {
            String[] split = str.substring(9).split(":");
            if (split.length != 0) {
                l30.b valueOf = l30.b.valueOf(split[0]);
                switch (a.f41385a[valueOf.ordinal()]) {
                    case 1:
                        return f41364q;
                    case 2:
                        return f41365t;
                    case 3:
                        return f41366w;
                    case 4:
                        H = H();
                        i11 = 1;
                        break;
                    case 5:
                        if (s(split, str).equals(g0.N0(1582, 10, 15))) {
                            H = E();
                            i11 = 2;
                            break;
                        } else {
                            throw new IllegalArgumentException("Inconsistent cutover date: " + str);
                        }
                    case 6:
                        H = G(s(split, str));
                        i11 = 2;
                        break;
                    default:
                        throw new UnsupportedOperationException(valueOf.name());
                }
                String[] split2 = split[i11].split("=");
                if (split2[0].equals("ancient-julian-leap-years")) {
                    String substring = split2[1].substring(1, split2[1].length() - 1);
                    if (!substring.isEmpty()) {
                        String[] split3 = substring.split(",");
                        int[] iArr = new int[split3.length];
                        for (int i12 = 0; i12 < split3.length; i12++) {
                            iArr[i12] = 1 - Integer.parseInt(split3[i12]);
                        }
                        H = H.I(net.time4j.history.a.f(iArr));
                    }
                }
                String[] split4 = split[i11 + 1].split("=");
                if (split4[0].equals("new-year-strategy")) {
                    o oVar = null;
                    for (String str2 : split4[1].substring(1, split4[1].length() - 1).split(",")) {
                        String[] split5 = str2.split("->");
                        n valueOf2 = n.valueOf(split5[0]);
                        int parseInt = split5.length == 2 ? Integer.parseInt(split5[1]) : Integer.MAX_VALUE;
                        if (oVar == null) {
                            if (valueOf2 != n.BEGIN_OF_JANUARY || parseInt != 567) {
                                oVar = valueOf2.until(parseInt);
                            }
                        } else {
                            oVar = oVar.b(valueOf2.until(parseInt));
                        }
                    }
                    H = H.K(oVar);
                }
                String[] split6 = split[i11 + 2].split("=");
                if (split6[0].equals("era-preference")) {
                    String substring2 = split6[1].substring(1, split6[1].length() - 1);
                    if (substring2.equals("default")) {
                        return H;
                    }
                    String[] split7 = substring2.split(",");
                    try {
                        j valueOf3 = j.valueOf(split7[0].substring(5));
                        g0 i13 = net.time4j.format.expert.l.i(split7[1].substring(7));
                        g0 i14 = net.time4j.format.expert.l.i(split7[2].substring(5));
                        int i15 = a.f41386b[valueOf3.ordinal()];
                        if (i15 == 1) {
                            J = H.J(g.e(i13, i14));
                        } else if (i15 == 2) {
                            J = H.J(g.b(i13, i14));
                        } else if (i15 == 3) {
                            J = H.J(g.a(i13, i14));
                        } else {
                            throw new IllegalArgumentException("BC/AD not allowed as era preference: " + str);
                        }
                        return J;
                    } catch (ParseException unused) {
                        throw new IllegalArgumentException("Invalid date syntax: " + str);
                    }
                }
                return H;
            }
            throw new IllegalArgumentException("Invalid variant description.");
        }
        throw new IllegalArgumentException("Variant does not start with \"historic-\": " + str);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private static g0 s(String[] strArr, String str) {
        String[] split = strArr[1].split("=");
        if (split.length == 2) {
            if (split[0].equals("cutover")) {
                try {
                    return net.time4j.format.expert.l.f41172l.D(split[1]);
                } catch (ParseException unused) {
                }
            }
            throw new IllegalArgumentException("Invalid cutover definition: " + str);
        }
        throw new IllegalArgumentException("Invalid syntax in variant description: " + str);
    }

    private b u() {
        net.time4j.history.a aVar = this.f41372c;
        if (aVar != null) {
            return aVar.d();
        }
        return c.JULIAN;
    }

    private Object writeReplace() {
        return new SPX(this, 3);
    }

    private static boolean z(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public boolean B(h hVar) {
        b l11;
        return (hVar == null || A(hVar) || (l11 = l(hVar)) == null || !l11.isValid(hVar)) ? false : true;
    }

    public t<Integer> C() {
        return this.f41380k;
    }

    public d I(net.time4j.history.a aVar) {
        Objects.requireNonNull(aVar, "Missing ancient julian leap years.");
        return !y() ? this : new d(this.f41370a, this.f41371b, aVar, this.f41373d, this.f41374e);
    }

    public d J(g gVar) {
        return (gVar.equals(this.f41374e) || !y()) ? this : new d(this.f41370a, this.f41371b, this.f41372c, this.f41373d, gVar);
    }

    public d K(o oVar) {
        return oVar.equals(o.f41410d) ? this.f41373d == null ? this : new d(this.f41370a, this.f41371b, this.f41372c, null, this.f41374e) : !y() ? this : new d(this.f41370a, this.f41371b, this.f41372c, oVar, this.f41374e);
    }

    public net.time4j.engine.p<Integer> L(p pVar) {
        int i11 = a.f41387c[pVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return this.f41379j;
                }
                throw new UnsupportedOperationException(pVar.name());
            }
            return this.f41378i;
        }
        return this.f41377h;
    }

    public t<Integer> M() {
        return this.f41377h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h a(h hVar) {
        int maximumDayOfMonth;
        b l11 = l(hVar);
        return (l11 != null && (maximumDayOfMonth = l11.getMaximumDayOfMonth(hVar)) < hVar.b()) ? h.f(hVar.c(), hVar.d(), hVar.getMonth(), maximumDayOfMonth) : hVar;
    }

    public net.time4j.engine.p<Integer> b() {
        return this.f41383n;
    }

    public g0 d(h hVar) {
        if (!A(hVar)) {
            b l11 = l(hVar);
            if (l11 != null) {
                return g0.V0(l11.toMJD(hVar), z.MODIFIED_JULIAN_DATE);
            }
            throw new IllegalArgumentException("Invalid historic date: " + hVar);
        }
        throw new IllegalArgumentException("Out of supported range: " + hVar);
    }

    public h e(g0 g0Var) {
        h hVar;
        long longValue = ((Long) g0Var.l(z.MODIFIED_JULIAN_DATE)).longValue();
        int size = this.f41371b.size() - 1;
        while (true) {
            if (size < 0) {
                hVar = null;
                break;
            }
            f fVar = this.f41371b.get(size);
            if (longValue >= fVar.f41388a) {
                hVar = fVar.f41389b.fromMJD(longValue);
                break;
            }
            size--;
        }
        if (hVar == null) {
            hVar = u().fromMJD(longValue);
        }
        j d11 = this.f41374e.d(hVar, g0Var);
        if (d11 != hVar.c()) {
            hVar = h.f(d11, d11.yearOfEra(hVar.c(), hVar.d()), hVar.getMonth(), hVar.b());
        }
        if (A(hVar)) {
            throw new IllegalArgumentException("Out of supported range: " + hVar);
        }
        return hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f41370a == dVar.f41370a && z(this.f41372c, dVar.f41372c) && z(this.f41373d, dVar.f41373d) && this.f41374e.equals(dVar.f41374e)) {
                return this.f41370a != l30.b.SINGLE_CUTOVER_DATE || this.f41371b.get(0).f41388a == dVar.f41371b.get(0).f41388a;
            }
        }
        return false;
    }

    public net.time4j.engine.p<h> f() {
        return this.f41375f;
    }

    public net.time4j.engine.p<Integer> g() {
        return this.f41381l;
    }

    public net.time4j.engine.p<Integer> h() {
        return this.f41382m;
    }

    public int hashCode() {
        l30.b bVar = this.f41370a;
        if (bVar == l30.b.SINGLE_CUTOVER_DATE) {
            long j11 = this.f41371b.get(0).f41388a;
            return (int) (j11 ^ (j11 << 32));
        }
        return bVar.hashCode();
    }

    @Override // net.time4j.engine.m0
    public String i() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("historic-");
        sb2.append(this.f41370a.name());
        int i11 = a.f41385a[this.f41370a.ordinal()];
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            if (i11 == 5 || i11 == 6) {
                sb2.append(":cutover=");
                sb2.append(r());
            }
            sb2.append(":ancient-julian-leap-years=");
            net.time4j.history.a aVar = this.f41372c;
            if (aVar != null) {
                int[] e11 = aVar.e();
                sb2.append('[');
                sb2.append(e11[0]);
                for (int i12 = 1; i12 < e11.length; i12++) {
                    sb2.append(CoreConstants.COMMA_CHAR);
                    sb2.append(e11[i12]);
                }
                sb2.append(']');
            } else {
                sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            sb2.append(":new-year-strategy=");
            sb2.append(w());
            sb2.append(":era-preference=");
            sb2.append(p());
        } else {
            sb2.append(":no-cutover");
        }
        return sb2.toString();
    }

    public net.time4j.engine.p<j> j() {
        return this.f41376g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b l(h hVar) {
        for (int size = this.f41371b.size() - 1; size >= 0; size--) {
            f fVar = this.f41371b.get(size);
            if (hVar.compareTo(fVar.f41390c) >= 0) {
                return fVar.f41389b;
            }
            if (hVar.compareTo(fVar.f41391d) > 0) {
                return null;
            }
        }
        return u();
    }

    public net.time4j.history.a m() {
        net.time4j.history.a aVar = this.f41372c;
        if (aVar != null) {
            return aVar;
        }
        throw new UnsupportedOperationException("No historic julian leap years were defined.");
    }

    public h n(j jVar, int i11) {
        h d11 = w().d(jVar, i11);
        if (B(d11)) {
            j d12 = this.f41374e.d(d11, d(d11));
            return d12 != jVar ? h.f(d12, d12.yearOfEra(d11.c(), d11.d()), d11.getMonth(), d11.b()) : d11;
        }
        throw new IllegalArgumentException("Cannot determine valid New Year: " + jVar + "-" + i11);
    }

    public Set<net.time4j.engine.p<?>> o() {
        return this.f41384o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g p() {
        return this.f41374e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<f> q() {
        return this.f41371b;
    }

    public g0 r() {
        List<f> list = this.f41371b;
        long j11 = list.get(list.size() - 1).f41388a;
        if (j11 != Long.MIN_VALUE) {
            return g0.V0(j11, z.MODIFIED_JULIAN_DATE);
        }
        throw new UnsupportedOperationException("Proleptic history without any gregorian reform date.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l30.b t() {
        return this.f41370a;
    }

    public String toString() {
        return "ChronoHistory[" + i() + "]";
    }

    public int v(j jVar, int i11) {
        h d11;
        h hVar;
        try {
            o oVar = this.f41373d;
            int i12 = 1;
            if (oVar == null) {
                d11 = h.f(jVar, i11, 1, 1);
                hVar = h.f(jVar, i11, 12, 31);
            } else {
                d11 = oVar.d(jVar, i11);
                if (jVar != j.BC) {
                    h d12 = this.f41373d.d(jVar, i11 + 1);
                    if (jVar == j.BYZANTINE) {
                        hVar = this.f41373d.d(j.AD, jVar.annoDomini(i11));
                        if (hVar.compareTo(d11) > 0) {
                        }
                    }
                    hVar = d12;
                } else if (i11 == 1) {
                    hVar = this.f41373d.d(j.AD, 1);
                } else {
                    hVar = this.f41373d.d(jVar, i11 - 1);
                }
                i12 = 0;
            }
            return (int) (net.time4j.f.DAYS.between(d(d11), d(hVar)) + i12);
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public o w() {
        o oVar = this.f41373d;
        return oVar == null ? o.f41410d : oVar;
    }

    public boolean x() {
        return this.f41372c != null;
    }

    public boolean y() {
        List<f> list = this.f41371b;
        return list.get(list.size() - 1).f41388a > Long.MIN_VALUE;
    }

    private d(l30.b bVar, List<f> list, net.time4j.history.a aVar, o oVar, g gVar) {
        if (!list.isEmpty()) {
            Objects.requireNonNull(bVar, "Missing historic variant.");
            Objects.requireNonNull(gVar, "Missing era preference.");
            this.f41370a = bVar;
            this.f41371b = list;
            this.f41372c = aVar;
            this.f41373d = oVar;
            this.f41374e = gVar;
            i iVar = new i(this);
            this.f41375f = iVar;
            k kVar = new k(this);
            this.f41376g = kVar;
            l lVar = new l('y', 1, 999999999, this, 2);
            this.f41377h = lVar;
            l lVar2 = new l((char) 0, 1, 999999999, this, 6);
            this.f41378i = lVar2;
            l lVar3 = new l((char) 0, 1, 999999999, this, 7);
            this.f41379j = lVar3;
            l lVar4 = new l('M', 1, 12, this, 3);
            this.f41380k = lVar4;
            l lVar5 = new l('d', 1, 31, this, 4);
            this.f41381l = lVar5;
            l lVar6 = new l('D', 1, 365, this, 5);
            this.f41382m = lVar6;
            l lVar7 = new l((char) 0, 1, 10000000, this, 8);
            this.f41383n = lVar7;
            HashSet hashSet = new HashSet();
            hashSet.add(iVar);
            hashSet.add(kVar);
            hashSet.add(lVar);
            hashSet.add(lVar2);
            hashSet.add(lVar3);
            hashSet.add(lVar4);
            hashSet.add(lVar5);
            hashSet.add(lVar6);
            hashSet.add(lVar7);
            this.f41384o = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw new IllegalArgumentException("At least one cutover event must be present in chronological history.");
    }
}