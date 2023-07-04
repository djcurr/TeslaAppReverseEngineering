package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.format.expert.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class d0 implements h<net.time4j.tz.k> {

    /* renamed from: g  reason: collision with root package name */
    private static final ConcurrentMap<Locale, a> f41105g = new ConcurrentHashMap();

    /* renamed from: h  reason: collision with root package name */
    private static final ConcurrentMap<Locale, a> f41106h = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f41107a;

    /* renamed from: b  reason: collision with root package name */
    private final h<net.time4j.tz.k> f41108b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<net.time4j.tz.k> f41109c;

    /* renamed from: d  reason: collision with root package name */
    private final net.time4j.format.g f41110d;

    /* renamed from: e  reason: collision with root package name */
    private final Locale f41111e;

    /* renamed from: f  reason: collision with root package name */
    private final int f41112f;

    /* loaded from: classes5.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final g0 f41113a;

        /* renamed from: b  reason: collision with root package name */
        private final g0 f41114b;

        a(g0 g0Var, g0 g0Var2) {
            this.f41113a = g0Var;
            this.f41114b = g0Var2;
        }

        void a(CharSequence charSequence, int i11, List<net.time4j.tz.k> list, List<net.time4j.tz.k> list2, int[] iArr) {
            String f11 = this.f41113a.f(charSequence, i11);
            int length = f11.length();
            iArr[0] = i11 + length;
            String f12 = this.f41114b.f(charSequence, i11);
            int length2 = f12.length();
            iArr[1] = i11 + length2;
            if (length2 > length) {
                list2.addAll(this.f41114b.b(f12));
            } else if (length2 < length) {
                list.addAll(this.f41113a.b(f11));
            } else if (length > 0) {
                list.addAll(this.f41113a.b(f11));
                list2.addAll(this.f41114b.b(f12));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(boolean z11) {
        this.f41107a = z11;
        this.f41108b = new n(z11);
        this.f41109c = null;
        this.f41110d = net.time4j.format.g.SMART;
        this.f41111e = Locale.ROOT;
        this.f41112f = 0;
    }

    private g0 a(Locale locale, boolean z11) {
        net.time4j.tz.d d11 = d(z11);
        g0.b bVar = null;
        for (net.time4j.tz.k kVar : net.time4j.tz.l.t()) {
            String x11 = net.time4j.tz.l.x(kVar, d11, locale);
            if (!x11.equals(kVar.a())) {
                bVar = g0.d(bVar, x11, kVar);
            }
        }
        return new g0(bVar);
    }

    private static List<net.time4j.tz.k> b(List<net.time4j.tz.k> list) {
        if (list.size() > 1) {
            ArrayList arrayList = new ArrayList(list);
            int size = list.size();
            for (int i11 = 1; i11 < size; i11++) {
                net.time4j.tz.k kVar = list.get(i11);
                if (kVar.a().startsWith("WINDOWS~")) {
                    arrayList.remove(kVar);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    private String c(CharSequence charSequence, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        for (int i13 = i11; i13 < i12; i13++) {
            char charAt = charSequence.charAt(i13);
            if (!Character.isLetter(charAt) && (this.f41107a || i13 <= i11 || Character.isDigit(charAt))) {
                break;
            }
            sb2.append(charAt);
        }
        return sb2.toString().trim();
    }

    private net.time4j.tz.d d(boolean z11) {
        return z11 ? this.f41107a ? net.time4j.tz.d.SHORT_DAYLIGHT_TIME : net.time4j.tz.d.LONG_DAYLIGHT_TIME : this.f41107a ? net.time4j.tz.d.SHORT_STANDARD_TIME : net.time4j.tz.d.LONG_STANDARD_TIME;
    }

    private List<net.time4j.tz.k> e(List<net.time4j.tz.k> list, Locale locale, net.time4j.format.g gVar) {
        boolean z11;
        HashMap hashMap = new HashMap();
        hashMap.put("DEFAULT", new ArrayList());
        Iterator<net.time4j.tz.k> it2 = list.iterator();
        while (true) {
            z11 = false;
            if (!it2.hasNext()) {
                break;
            }
            String a11 = it2.next().a();
            Set<net.time4j.tz.k> set = this.f41109c;
            int indexOf = a11.indexOf(126);
            String substring = indexOf >= 0 ? a11.substring(0, indexOf) : "DEFAULT";
            if (set == null) {
                set = net.time4j.tz.l.C(locale, gVar.isSmart(), substring);
            }
            Iterator<net.time4j.tz.k> it3 = set.iterator();
            while (true) {
                if (it3.hasNext()) {
                    net.time4j.tz.k next = it3.next();
                    if (next.a().equals(a11)) {
                        List list2 = (List) hashMap.get(substring);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            hashMap.put(substring, list2);
                        }
                        list2.add(next);
                    }
                }
            }
        }
        List<net.time4j.tz.k> list3 = (List) hashMap.get("DEFAULT");
        if (list3.isEmpty()) {
            hashMap.remove("DEFAULT");
            Iterator it4 = hashMap.keySet().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                List<net.time4j.tz.k> list4 = (List) hashMap.get((String) it4.next());
                if (!list4.isEmpty()) {
                    z11 = true;
                    list = list4;
                    break;
                }
            }
            if (!z11) {
                list = Collections.emptyList();
            }
            return list;
        }
        return list3;
    }

    private static String f(List<net.time4j.tz.k> list) {
        StringBuilder sb2 = new StringBuilder(list.size() * 16);
        sb2.append(CoreConstants.CURLY_LEFT);
        boolean z11 = true;
        for (net.time4j.tz.k kVar : list) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
            sb2.append(kVar.a());
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (this.f41107a == d0Var.f41107a) {
                Set<net.time4j.tz.k> set = this.f41109c;
                Set<net.time4j.tz.k> set2 = d0Var.f41109c;
                if (set == null) {
                    if (set2 == null) {
                        return true;
                    }
                } else if (set.equals(set2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<net.time4j.tz.k> getElement() {
        return b0.TIMEZONE_ID;
    }

    public int hashCode() {
        Set<net.time4j.tz.k> set = this.f41109c;
        return (set == null ? 0 : set.hashCode()) + (this.f41107a ? 1 : 0);
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0216, code lost:
        if (r4 != false) goto L88;
     */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // net.time4j.format.expert.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parse(java.lang.CharSequence r19, net.time4j.format.expert.s r20, net.time4j.engine.d r21, net.time4j.format.expert.t<?> r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.d0.parse(java.lang.CharSequence, net.time4j.format.expert.s, net.time4j.engine.d, net.time4j.format.expert.t, boolean):void");
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        if (oVar.c()) {
            net.time4j.tz.k o11 = oVar.o();
            if (o11 instanceof net.time4j.tz.p) {
                return this.f41108b.print(oVar, appendable, dVar, set, z11);
            }
            if (oVar instanceof net.time4j.base.f) {
                net.time4j.tz.l N = net.time4j.tz.l.N(o11);
                String w11 = N.w(d(N.I((net.time4j.base.f) net.time4j.base.f.class.cast(oVar))), z11 ? this.f41111e : (Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT));
                int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
                appendable.append(w11);
                int length2 = w11.length();
                if (length != -1 && length2 > 0 && set != null) {
                    set.add(new g(b0.TIMEZONE_ID, length, length + length2));
                }
                return length2;
            }
            throw new IllegalArgumentException("Cannot extract timezone name from: " + oVar);
        }
        throw new IllegalArgumentException("Cannot extract timezone name from: " + oVar);
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return new d0(this.f41107a, this.f41108b, this.f41109c, (net.time4j.format.g) dVar.b(net.time4j.format.a.f40998f, net.time4j.format.g.SMART), (Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT), ((Integer) dVar.b(net.time4j.format.a.f41011s, 0)).intValue());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(d0.class.getName());
        sb2.append("[abbreviated=");
        sb2.append(this.f41107a);
        sb2.append(", preferredZones=");
        sb2.append(this.f41109c);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> withElement(net.time4j.engine.p<net.time4j.tz.k> pVar) {
        return this;
    }

    private d0(boolean z11, h<net.time4j.tz.k> hVar, Set<net.time4j.tz.k> set, net.time4j.format.g gVar, Locale locale, int i11) {
        this.f41107a = z11;
        this.f41108b = hVar;
        this.f41109c = set;
        this.f41110d = gVar;
        this.f41111e = locale;
        this.f41112f = i11;
    }
}