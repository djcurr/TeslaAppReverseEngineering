package net.time4j;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: d  reason: collision with root package name */
    private static final SortedMap<h0, String> f41464d;

    /* renamed from: e  reason: collision with root package name */
    private static l f41465e;

    /* renamed from: f  reason: collision with root package name */
    private static final net.time4j.engine.c<l> f41466f;

    /* renamed from: a  reason: collision with root package name */
    private final transient Locale f41467a;

    /* renamed from: b  reason: collision with root package name */
    private final transient String f41468b;

    /* renamed from: c  reason: collision with root package name */
    private final transient SortedMap<h0, String> f41469c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41470a;

        static {
            int[] iArr = new int[net.time4j.format.v.values().length];
            f41470a = iArr;
            try {
                iArr[net.time4j.format.v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41470a[net.time4j.format.v.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b extends net.time4j.engine.e<String> implements net.time4j.format.t<String>, net.time4j.engine.y<net.time4j.engine.q<?>, String> {
        private static final long serialVersionUID = 5589976208326940032L;

        /* renamed from: a  reason: collision with root package name */
        private final transient boolean f41471a;

        /* renamed from: b  reason: collision with root package name */
        private final transient l f41472b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(boolean z11, Locale locale, String str) {
            this(z11, l.r(locale, str));
        }

        private String C(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar, net.time4j.format.m mVar) {
            String str;
            Map map;
            String str2;
            String str3;
            String str4;
            boolean z11;
            String k11;
            net.time4j.format.m mVar2 = mVar;
            ArrayList arrayList = new ArrayList();
            String str5 = "pm";
            String str6 = "am";
            if (this.f41471a) {
                arrayList.add("am");
                arrayList.add("pm");
                arrayList.add("midnight");
                arrayList.add("noon");
            } else {
                arrayList.addAll(new LinkedHashSet(this.f41472b.f41469c.values()));
                if (this.f41472b.p()) {
                    arrayList.add("midnight");
                    arrayList.add("noon");
                }
            }
            Map q11 = this.f41472b.p() ? l.q(v(), p()) : null;
            net.time4j.format.v vVar = (net.time4j.format.v) dVar.b(net.time4j.format.a.f40999g, net.time4j.format.v.WIDE);
            boolean booleanValue = ((Boolean) dVar.b(net.time4j.format.a.f41001i, Boolean.TRUE)).booleanValue();
            boolean booleanValue2 = ((Boolean) dVar.b(net.time4j.format.a.f41002j, Boolean.FALSE)).booleanValue();
            int index = parsePosition.getIndex();
            int length = charSequence.length();
            Iterator it2 = arrayList.iterator();
            String str7 = null;
            int i11 = 0;
            while (it2.hasNext()) {
                Iterator it3 = it2;
                String str8 = (String) it2.next();
                if (this.f41472b.p()) {
                    if (this.f41471a) {
                        k11 = l.k(q11, vVar, mVar2, str8);
                        if (!q11.containsKey(k11)) {
                            if (str8.equals("midnight")) {
                                k11 = l.k(q11, vVar, mVar2, str6);
                            } else if (str8.equals("noon")) {
                                k11 = l.k(q11, vVar, mVar2, str5);
                            }
                        }
                    } else {
                        k11 = l.k(q11, vVar, mVar2, str8);
                    }
                    str = q11.containsKey(k11) ? (String) q11.get(k11) : null;
                } else {
                    str = str8;
                }
                if (str != null) {
                    int length2 = str.length();
                    map = q11;
                    int i12 = index;
                    int i13 = 0;
                    boolean z12 = true;
                    while (z12 && i13 < length2) {
                        String str9 = str5;
                        int i14 = index + i13;
                        if (i14 >= length) {
                            str4 = str6;
                            z12 = false;
                        } else {
                            str4 = str6;
                            char charAt = charSequence.charAt(i14);
                            char charAt2 = str.charAt(i13);
                            if (booleanValue) {
                                z11 = o(charAt, charAt2);
                            } else {
                                z11 = charAt == charAt2;
                            }
                            if (z11) {
                                i12++;
                            }
                            z12 = z11;
                        }
                        i13++;
                        str5 = str9;
                        str6 = str4;
                    }
                    str2 = str5;
                    str3 = str6;
                    if (booleanValue2 || length2 == 1) {
                        length2 = i12 - index;
                        if (i11 >= length2) {
                            if (str7 != null && i11 == length2) {
                                if (!this.f41471a) {
                                    str7 = str7 + "|" + str8;
                                }
                                str7 = null;
                            }
                        }
                        i11 = length2;
                        str7 = str8;
                    } else if (z12) {
                        if (str7 != null) {
                            if (this.f41471a) {
                                i11 = length2;
                                str7 = null;
                            } else {
                                str7 = str7 + "|" + str8;
                                i11 = length2;
                            }
                        }
                        i11 = length2;
                        str7 = str8;
                    }
                } else {
                    map = q11;
                    str2 = str5;
                    str3 = str6;
                }
                mVar2 = mVar;
                q11 = map;
                it2 = it3;
                str5 = str2;
                str6 = str3;
            }
            if (str7 == null) {
                parsePosition.setErrorIndex(index);
            } else {
                parsePosition.setIndex(index + i11);
            }
            return str7;
        }

        private boolean o(char c11, char c12) {
            if (c11 >= 'a' && c11 <= 'z') {
                c11 = (char) ((c11 - 'a') + 65);
            }
            if (c12 >= 'a' && c12 <= 'z') {
                c12 = (char) ((c12 - 'a') + 65);
            }
            if (c11 >= 'A' && c11 <= 'Z') {
                return c11 == c12;
            }
            Locale v11 = v();
            return String.valueOf(c11).toUpperCase(v11).equals(String.valueOf(c12).toUpperCase(v11));
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("Serialization proxy required.");
        }

        private Object writeReplace() {
            return new SPX(this, 7);
        }

        @Override // net.time4j.engine.y
        /* renamed from: A */
        public boolean isValid(net.time4j.engine.q<?> qVar, String str) {
            return false;
        }

        @Override // net.time4j.format.t
        /* renamed from: B */
        public String parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            int index = parsePosition.getIndex();
            net.time4j.engine.c<net.time4j.format.m> cVar = net.time4j.format.a.f41000h;
            net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
            net.time4j.format.m mVar2 = (net.time4j.format.m) dVar.b(cVar, mVar);
            String C = C(charSequence, parsePosition, dVar, mVar2);
            if (C == null && ((Boolean) dVar.b(net.time4j.format.a.f41003k, Boolean.TRUE)).booleanValue()) {
                parsePosition.setErrorIndex(-1);
                parsePosition.setIndex(index);
                if (mVar2 == mVar) {
                    mVar = net.time4j.format.m.STANDALONE;
                }
                return C(charSequence, parsePosition, dVar, mVar);
            }
            return C;
        }

        @Override // net.time4j.engine.y
        /* renamed from: D */
        public net.time4j.engine.q<?> withValue(net.time4j.engine.q<?> qVar, String str, boolean z11) {
            throw new IllegalArgumentException("Day period element cannot be set.");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.engine.e
        public <T extends net.time4j.engine.q<T>> net.time4j.engine.y<T, String> f(net.time4j.engine.w<T> wVar) {
            if (wVar.v(h0.f41328p)) {
                return this;
            }
            return null;
        }

        @Override // net.time4j.engine.e
        protected boolean g(net.time4j.engine.e<?> eVar) {
            return this.f41472b.equals(((b) eVar).f41472b);
        }

        @Override // net.time4j.engine.e, net.time4j.engine.p
        public char getSymbol() {
            return this.f41471a ? 'b' : 'B';
        }

        @Override // net.time4j.engine.p
        public Class<String> getType() {
            return String.class;
        }

        @Override // net.time4j.engine.p
        public boolean isDateElement() {
            return false;
        }

        @Override // net.time4j.engine.p
        public boolean isTimeElement() {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String p() {
            return this.f41472b.f41468b;
        }

        @Override // net.time4j.format.t
        public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) {
            String apply;
            net.time4j.format.v vVar = (net.time4j.format.v) dVar.b(net.time4j.format.a.f40999g, net.time4j.format.v.WIDE);
            net.time4j.format.m mVar = (net.time4j.format.m) dVar.b(net.time4j.format.a.f41000h, net.time4j.format.m.FORMAT);
            if (this.f41471a) {
                apply = this.f41472b.l(vVar, mVar).apply(oVar);
            } else {
                apply = this.f41472b.j(vVar, mVar).apply(oVar);
            }
            appendable.append(apply);
        }

        @Override // net.time4j.engine.y
        /* renamed from: q */
        public net.time4j.engine.p<?> getChildAtCeiling(net.time4j.engine.q<?> qVar) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: r */
        public net.time4j.engine.p<?> getChildAtFloor(net.time4j.engine.q<?> qVar) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Object s() {
            return this.f41472b.f41469c;
        }

        @Override // net.time4j.engine.p
        /* renamed from: t */
        public String getDefaultMaximum() {
            if (this.f41471a) {
                return "pm";
            }
            return (String) this.f41472b.f41469c.get((h0) this.f41472b.f41469c.lastKey());
        }

        @Override // net.time4j.engine.e
        public String toString() {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(name());
            sb2.append('@');
            sb2.append(this.f41472b);
            return sb2.toString();
        }

        @Override // net.time4j.engine.p
        /* renamed from: u */
        public String getDefaultMinimum() {
            if (this.f41471a) {
                return "am";
            }
            return (String) this.f41472b.f41469c.get((h0) this.f41472b.f41469c.firstKey());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Locale v() {
            return this.f41472b.f41467a;
        }

        @Override // net.time4j.engine.y
        /* renamed from: w */
        public String getMaximum(net.time4j.engine.q<?> qVar) {
            return getDefaultMaximum();
        }

        @Override // net.time4j.engine.y
        /* renamed from: x */
        public String getMinimum(net.time4j.engine.q<?> qVar) {
            return getDefaultMinimum();
        }

        @Override // net.time4j.engine.y
        /* renamed from: y */
        public String getValue(net.time4j.engine.q<?> qVar) {
            h0 h0Var = (h0) qVar.l(h0.f41328p);
            if (this.f41471a) {
                return l.n(h0Var);
            }
            if (this.f41472b.p()) {
                Map q11 = l.q(v(), p());
                String str = null;
                if (h0Var.C0()) {
                    str = "midnight";
                } else if (h0Var.D0(h0.K0(12))) {
                    str = "noon";
                }
                if (str != null && q11.containsKey(l.k(q11, net.time4j.format.v.ABBREVIATED, net.time4j.format.m.FORMAT, str))) {
                    return str;
                }
            }
            return (String) this.f41472b.f41469c.get(this.f41472b.o(h0Var));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean z() {
            return this.f41471a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(boolean z11, l lVar) {
            super(z11 ? "FIXED_DAY_PERIOD" : "APPROXIMATE_DAY_PERIOD");
            this.f41471a = z11;
            this.f41472b = lVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class c implements net.time4j.engine.r {
        private static l e(Locale locale, net.time4j.engine.d dVar) {
            if (dVar.c(l.f41466f)) {
                return (l) dVar.a(l.f41466f);
            }
            return l.r(locale, (String) dVar.b(net.time4j.format.a.f40994b, "iso8601"));
        }

        private static int f(net.time4j.engine.q<?> qVar) {
            net.time4j.c<Integer, h0> cVar = h0.f41331t;
            if (qVar.q(cVar)) {
                int intValue = ((Integer) qVar.l(cVar)).intValue();
                if (intValue == 12) {
                    return 0;
                }
                return intValue;
            }
            k0<Integer, h0> k0Var = h0.f41333x;
            if (qVar.q(k0Var)) {
                return ((Integer) qVar.l(k0Var)).intValue();
            }
            return -1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x012b A[LOOP:0: B:14:0x003f->B:77:0x012b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x011a A[EDGE_INSN: B:89:0x011a->B:73:0x011a ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0115 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v2, types: [net.time4j.engine.q] */
        /* JADX WARN: Type inference failed for: r0v5, types: [net.time4j.engine.q<?>, net.time4j.engine.q] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        @Override // net.time4j.engine.r
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public net.time4j.engine.q<?> a(net.time4j.engine.q<?> r17, java.util.Locale r18, net.time4j.engine.d r19) {
            /*
                Method dump skipped, instructions count: 359
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.l.c.a(net.time4j.engine.q, java.util.Locale, net.time4j.engine.d):net.time4j.engine.q");
        }

        @Override // net.time4j.engine.r
        public Set<net.time4j.engine.p<?>> b(Locale locale, net.time4j.engine.d dVar) {
            l e11 = e(locale, dVar);
            HashSet hashSet = new HashSet();
            hashSet.add(new b(false, e11));
            if (!dVar.c(l.f41466f)) {
                hashSet.add(new b(true, e11));
            }
            return Collections.unmodifiableSet(hashSet);
        }

        @Override // net.time4j.engine.r
        public boolean c(net.time4j.engine.p<?> pVar) {
            return pVar instanceof b;
        }

        @Override // net.time4j.engine.r
        public boolean d(Class<?> cls) {
            return h0.class.isAssignableFrom(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class d implements net.time4j.engine.s<net.time4j.engine.o, String> {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f41473a;

        /* renamed from: b  reason: collision with root package name */
        private final net.time4j.format.v f41474b;

        /* renamed from: c  reason: collision with root package name */
        private final net.time4j.format.m f41475c;

        d(boolean z11, net.time4j.format.v vVar, net.time4j.format.m mVar) {
            Objects.requireNonNull(vVar, "Missing text width.");
            Objects.requireNonNull(mVar, "Missing output context.");
            this.f41473a = z11;
            this.f41474b = vVar;
            this.f41475c = mVar;
        }

        @Override // net.time4j.engine.s
        /* renamed from: a */
        public String apply(net.time4j.engine.o oVar) {
            h0 h0Var = (h0) oVar.l(h0.f41328p);
            l lVar = l.this;
            Locale locale = lVar.f41467a;
            if (this.f41473a) {
                String n11 = l.n(h0Var);
                if (!lVar.p()) {
                    return n11;
                }
                Map q11 = l.q(locale, lVar.f41468b);
                String k11 = l.k(q11, this.f41474b, this.f41475c, n11);
                if (!q11.containsKey(k11)) {
                    if (n11.equals("midnight")) {
                        k11 = l.k(q11, this.f41474b, this.f41475c, "am");
                    } else if (n11.equals("noon")) {
                        k11 = l.k(q11, this.f41474b, this.f41475c, "pm");
                    }
                }
                if (q11.containsKey(k11)) {
                    return (String) q11.get(k11);
                }
            } else if (lVar.p()) {
                Map q12 = l.q(locale, lVar.f41468b);
                if (h0Var.C0()) {
                    String k12 = l.k(q12, this.f41474b, this.f41475c, "midnight");
                    if (q12.containsKey(k12)) {
                        return (String) q12.get(k12);
                    }
                } else if (h0Var.D0(h0.K0(12))) {
                    String k13 = l.k(q12, this.f41474b, this.f41475c, "noon");
                    if (q12.containsKey(k13)) {
                        return (String) q12.get(k13);
                    }
                }
                String k14 = l.k(q12, this.f41474b, this.f41475c, (String) lVar.f41469c.get(lVar.o(h0Var)));
                if (q12.containsKey(k14)) {
                    return (String) q12.get(k14);
                }
            } else {
                return (String) lVar.f41469c.get(lVar.o(h0Var));
            }
            a0 a0Var = (a0) h0Var.l(h0.f41330q);
            if (locale == null) {
                locale = Locale.ROOT;
            }
            return a0Var.getDisplayName(locale);
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        treeMap.put(h0.H0(), "am");
        treeMap.put(h0.K0(12), "pm");
        SortedMap<h0, String> unmodifiableSortedMap = Collections.unmodifiableSortedMap(treeMap);
        f41464d = unmodifiableSortedMap;
        f41465e = new l(Locale.ROOT, "iso8601", unmodifiableSortedMap);
        f41466f = net.time4j.format.a.e("CUSTOM_DAY_PERIOD", l.class);
    }

    private l(Locale locale, String str, SortedMap<h0, String> sortedMap) {
        this.f41467a = locale;
        this.f41468b = str;
        this.f41469c = Collections.unmodifiableSortedMap(sortedMap);
    }

    private static boolean a(String str) {
        return str.charAt(0) == 'T' && str.length() == 5 && Character.isDigit(str.charAt(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String k(Map<String, String> map, net.time4j.format.v vVar, net.time4j.format.m mVar, String str) {
        if (vVar == net.time4j.format.v.SHORT) {
            vVar = net.time4j.format.v.ABBREVIATED;
        }
        String str2 = t(vVar, mVar) + str;
        if (map.containsKey(str2)) {
            return str2;
        }
        if (mVar == net.time4j.format.m.STANDALONE) {
            net.time4j.format.v vVar2 = net.time4j.format.v.ABBREVIATED;
            if (vVar == vVar2) {
                return k(map, vVar, net.time4j.format.m.FORMAT, str);
            }
            return k(map, vVar2, mVar, str);
        }
        net.time4j.format.v vVar3 = net.time4j.format.v.ABBREVIATED;
        return vVar != vVar3 ? k(map, vVar3, mVar, str) : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String n(h0 h0Var) {
        int intValue = ((Integer) h0Var.l(h0.B)).intValue();
        return (intValue == 0 || intValue == 1440) ? "midnight" : intValue < 720 ? "am" : intValue == 720 ? "noon" : "pm";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        return this.f41467a != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> q(Locale locale, String str) {
        Map<String, String> m11 = net.time4j.format.b.c(str, locale).m();
        return (str.equals("iso8601") || "true".equals(m11.get("hasDayPeriods"))) ? m11 : net.time4j.format.b.d(locale).m();
    }

    static l r(Locale locale, String str) {
        String language = locale.getLanguage();
        if (language.equals("nn")) {
            locale = new Locale("nb");
        }
        Map<String, String> q11 = q(locale, str);
        TreeMap treeMap = new TreeMap();
        for (String str2 : q11.keySet()) {
            if (a(str2)) {
                int parseInt = Integer.parseInt(str2.substring(1, 3));
                int parseInt2 = Integer.parseInt(str2.substring(3, 5));
                h0 H0 = h0.H0();
                if (parseInt == 24) {
                    if (parseInt2 != 0) {
                        throw new IllegalStateException("Invalid time key: " + str2);
                    }
                } else if (parseInt >= 0 && parseInt < 24 && parseInt2 >= 0 && parseInt2 < 60) {
                    H0 = H0.G((parseInt * 60) + parseInt2, h.MINUTES);
                } else {
                    throw new IllegalStateException("Invalid time key: " + str2);
                }
                treeMap.put(H0, q11.get(str2));
            }
        }
        if (!treeMap.isEmpty() && !language.isEmpty()) {
            Iterator it2 = treeMap.keySet().iterator();
            String str3 = "";
            while (it2.hasNext()) {
                String str4 = (String) treeMap.get((h0) it2.next());
                if (str4.equals(str3)) {
                    it2.remove();
                } else {
                    str3 = str4;
                }
            }
            return new l(locale, str, treeMap);
        }
        return f41465e;
    }

    public static l s(Map<h0, String> map) {
        if (!map.isEmpty()) {
            TreeMap treeMap = new TreeMap(map);
            for (h0 h0Var : map.keySet()) {
                if (h0Var.p() == 24) {
                    treeMap.put(h0.H0(), map.get(h0Var));
                    treeMap.remove(h0Var);
                } else if (map.get(h0Var).isEmpty()) {
                    throw new IllegalArgumentException("Map has empty label: " + map);
                }
            }
            return new l(null, "", treeMap);
        }
        throw new IllegalArgumentException("Label map is empty.");
    }

    private static String t(net.time4j.format.v vVar, net.time4j.format.m mVar) {
        int i11 = a.f41470a[vVar.ordinal()];
        char c11 = i11 != 1 ? i11 != 2 ? 'a' : 'n' : 'w';
        if (mVar == net.time4j.format.m.STANDALONE) {
            c11 = Character.toUpperCase(c11);
        }
        return "P(" + c11 + ")_";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            Locale locale = this.f41467a;
            if (locale == null) {
                if (lVar.f41467a != null) {
                    return false;
                }
            } else if (!locale.equals(lVar.f41467a)) {
                return false;
            }
            return this.f41469c.equals(lVar.f41469c) && this.f41468b.equals(lVar.f41468b);
        }
        return false;
    }

    public int hashCode() {
        return this.f41469c.hashCode();
    }

    public net.time4j.engine.s<net.time4j.engine.o, String> j(net.time4j.format.v vVar, net.time4j.format.m mVar) {
        return new d(false, vVar, mVar);
    }

    public net.time4j.engine.s<net.time4j.engine.o, String> l(net.time4j.format.v vVar, net.time4j.format.m mVar) {
        return new d(true, vVar, mVar);
    }

    public h0 m(h0 h0Var) {
        if (h0Var.p() == 24) {
            h0Var = h0.H0();
        }
        for (h0 h0Var2 : this.f41469c.keySet()) {
            if (h0Var.z0(h0Var2)) {
                return h0Var2;
            }
        }
        return this.f41469c.firstKey();
    }

    public h0 o(h0 h0Var) {
        if (h0Var.p() == 24) {
            h0Var = h0.H0();
        }
        h0 lastKey = this.f41469c.lastKey();
        for (h0 h0Var2 : this.f41469c.keySet()) {
            if (h0Var.D0(h0Var2)) {
                return h0Var2;
            }
            if (h0Var.z0(h0Var2)) {
                break;
            }
            lastKey = h0Var2;
        }
        return lastKey;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("DayPeriod[");
        if (p()) {
            sb2.append("locale=");
            sb2.append(this.f41467a);
            sb2.append(CoreConstants.COMMA_CHAR);
            if (!this.f41468b.equals("iso8601")) {
                sb2.append(",calendar-type=");
                sb2.append(this.f41468b);
                sb2.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb2.append(this.f41469c);
        sb2.append(']');
        return sb2.toString();
    }
}