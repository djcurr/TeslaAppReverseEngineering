package net.time4j.tz;

import android.util.TimeUtils;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public abstract class l implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f41535a;

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator<k> f41536b;

    /* renamed from: c  reason: collision with root package name */
    public static final o f41537c;

    /* renamed from: d  reason: collision with root package name */
    public static final o f41538d;

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f41539e;

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f41540f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile e f41541g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile l f41542h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile boolean f41543i;

    /* renamed from: j  reason: collision with root package name */
    private static int f41544j;

    /* renamed from: k  reason: collision with root package name */
    private static final Map<String, k> f41545k;

    /* renamed from: l  reason: collision with root package name */
    private static final Map<String, k> f41546l;

    /* renamed from: m  reason: collision with root package name */
    private static final r f41547m;

    /* renamed from: n  reason: collision with root package name */
    private static final r f41548n;

    /* renamed from: o  reason: collision with root package name */
    private static final ConcurrentMap<String, c> f41549o;

    /* renamed from: p  reason: collision with root package name */
    private static final ReferenceQueue<l> f41550p;

    /* renamed from: q  reason: collision with root package name */
    private static final LinkedList<l> f41551q;

    /* renamed from: t  reason: collision with root package name */
    private static final ConcurrentMap<String, r> f41552t;

    /* renamed from: w  reason: collision with root package name */
    static final s f41553w;

    /* renamed from: x  reason: collision with root package name */
    private static final l f41554x;

    /* loaded from: classes5.dex */
    static class a implements Comparator<k> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(k kVar, k kVar2) {
            return kVar.a().compareTo(kVar2.a());
        }
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static void a() {
            synchronized (l.class) {
                while (l.f41550p.poll() != null) {
                }
                l.f41551q.clear();
            }
            e unused = l.f41541g = new e();
            l.f41549o.clear();
            if (l.f41540f) {
                l unused2 = l.f41542h = l.f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c extends SoftReference<l> {

        /* renamed from: a  reason: collision with root package name */
        private final String f41555a;

        c(l lVar, ReferenceQueue<l> referenceQueue) {
            super(lVar, referenceQueue);
            this.f41555a = lVar.z().a();
        }
    }

    /* loaded from: classes5.dex */
    private static class d implements r, s {
        private d() {
        }

        @Override // net.time4j.tz.r
        public s a() {
            return this;
        }

        @Override // net.time4j.tz.s
        public Set<String> b(Locale locale, boolean z11) {
            return Collections.emptySet();
        }

        @Override // net.time4j.tz.r
        public Map<String, String> c() {
            return Collections.emptyMap();
        }

        @Override // net.time4j.tz.s
        public String d(boolean z11, Locale locale) {
            return z11 ? "GMT" : "GMT±hh:mm";
        }

        @Override // net.time4j.tz.s
        public String e(String str, net.time4j.tz.d dVar, Locale locale) {
            Objects.requireNonNull(locale, "Missing locale.");
            if (str.isEmpty()) {
                return "";
            }
            TimeZone R = h.R(str);
            return R.getID().equals(str) ? R.getDisplayName(dVar.isDaylightSaving(), !dVar.isAbbreviation(), locale) : "";
        }

        @Override // net.time4j.tz.r
        public Set<String> f() {
            HashSet hashSet = new HashSet();
            hashSet.addAll(Arrays.asList(TimeZone.getAvailableIDs()));
            return hashSet;
        }

        @Override // net.time4j.tz.r
        public String g() {
            return "";
        }

        @Override // net.time4j.tz.r
        public String getLocation() {
            return "";
        }

        @Override // net.time4j.tz.r
        public String getName() {
            return "java.util.TimeZone";
        }

        @Override // net.time4j.tz.r
        public String getVersion() {
            return TimeUtils.getTimeZoneDatabaseVersion();
        }

        @Override // net.time4j.tz.r
        public m load(String str) {
            return null;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static class e {

        /* renamed from: a  reason: collision with root package name */
        private final List<k> f41556a;

        /* renamed from: b  reason: collision with root package name */
        private final List<k> f41557b;

        e() {
            ArrayList arrayList = new ArrayList(1024);
            ArrayList arrayList2 = new ArrayList(1024);
            arrayList.add(p.f41597k);
            for (Map.Entry entry : l.f41552t.entrySet()) {
                r rVar = (r) entry.getValue();
                if (rVar != l.f41547m || l.f41548n == l.f41547m) {
                    for (String str : rVar.f()) {
                        k P = l.P(str);
                        if (!arrayList.contains(P)) {
                            arrayList.add(P);
                        }
                    }
                    arrayList2.addAll(arrayList);
                    for (String str2 : rVar.c().keySet()) {
                        k P2 = l.P(str2);
                        if (!arrayList2.contains(P2)) {
                            arrayList2.add(P2);
                        }
                    }
                }
            }
            Collections.sort(arrayList, l.f41536b);
            Collections.sort(arrayList2, l.f41536b);
            this.f41556a = Collections.unmodifiableList(arrayList);
            this.f41557b = Collections.unmodifiableList(arrayList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01aa  */
    static {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.tz.l.<clinit>():void");
    }

    public static Set<k> C(Locale locale, boolean z11, String str) {
        r D = D(str);
        if (D == null) {
            return Collections.emptySet();
        }
        s a11 = D.a();
        if (a11 == null) {
            a11 = f41553w;
        }
        HashSet hashSet = new HashSet();
        for (String str2 : a11.b(locale, z11)) {
            hashSet.add(P(str2));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static r D(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Missing zone model provider.");
        }
        return str.equals("DEFAULT") ? f41548n : f41552t.get(str);
    }

    private static l F(k kVar, String str, boolean z11) {
        l lVar;
        String str2;
        ConcurrentMap<String, c> concurrentMap = f41549o;
        c cVar = concurrentMap.get(str);
        if (cVar != null) {
            lVar = cVar.get();
            if (lVar == null) {
                concurrentMap.remove(cVar.f41555a);
            }
        } else {
            lVar = null;
        }
        if (lVar != null) {
            return lVar;
        }
        String str3 = "";
        int length = str.length();
        boolean z12 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                str2 = str;
                break;
            } else if (str.charAt(i11) == '~') {
                str3 = str.substring(0, i11);
                str2 = str.substring(i11 + 1);
                break;
            } else {
                i11++;
            }
        }
        if (str2.isEmpty()) {
            if (z11) {
                throw new IllegalArgumentException("Timezone key is empty.");
            }
            return null;
        }
        r rVar = f41548n;
        if (str3.isEmpty() || str3.equals("DEFAULT")) {
            z12 = true;
        }
        if (!z12 && (rVar = f41552t.get(str3)) == null) {
            if (z11) {
                throw new IllegalArgumentException((str3.equals("TZDB") ? "TZDB provider not available: " : "Timezone model provider not registered: ") + str);
            }
            return null;
        }
        if (kVar == null) {
            if (z12) {
                kVar = P(str2);
                if (kVar instanceof p) {
                    return ((p) kVar).l();
                }
            } else {
                kVar = new net.time4j.tz.e(str);
            }
        }
        if (rVar == f41547m) {
            h hVar = new h(kVar, str2);
            if (!hVar.T() || str2.equals("GMT") || str2.startsWith("UT") || str2.equals("Z")) {
                lVar = hVar;
            }
        } else {
            m load = rVar.load(str2);
            if (load == null) {
                lVar = H(rVar, kVar, str2);
            } else {
                lVar = new net.time4j.tz.c(kVar, load);
            }
        }
        if (lVar == null) {
            if (z11) {
                if (TimeZone.getDefault().getID().equals(str)) {
                    return new h(new net.time4j.tz.e(str));
                }
                throw new IllegalArgumentException("Unknown timezone: " + str);
            }
            return null;
        } else if (f41543i) {
            c putIfAbsent = f41549o.putIfAbsent(str, new c(lVar, f41550p));
            if (putIfAbsent == null) {
                synchronized (l.class) {
                    f41551q.addFirst(lVar);
                    while (true) {
                        LinkedList<l> linkedList = f41551q;
                        if (linkedList.size() >= f41544j) {
                            linkedList.removeLast();
                        }
                    }
                }
                return lVar;
            }
            l lVar2 = putIfAbsent.get();
            return lVar2 != null ? lVar2 : lVar;
        } else {
            return lVar;
        }
    }

    private static l G(k kVar, boolean z11) {
        if (kVar instanceof p) {
            return ((p) kVar).l();
        }
        return F(kVar, kVar.a(), z11);
    }

    private static l H(r rVar, k kVar, String str) {
        Map<String, String> c11 = rVar.c();
        String str2 = str;
        m mVar = null;
        while (mVar == null) {
            str2 = c11.get(str2);
            if (str2 == null) {
                break;
            }
            mVar = rVar.load(str2);
        }
        if (mVar == null) {
            String g11 = rVar.g();
            if (g11.isEmpty()) {
                return null;
            }
            if (!g11.equals(rVar.getName())) {
                return new net.time4j.tz.a(kVar, M(g11 + "~" + str));
            }
            throw new IllegalArgumentException("Circular zone model provider fallback: " + rVar.getName());
        }
        return new net.time4j.tz.c(kVar, mVar);
    }

    private static List<Class<? extends k>> L(ClassLoader classLoader, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Class<?> cls = Class.forName("net.time4j.tz.olson." + str, true, classLoader);
            if (k.class.isAssignableFrom(cls)) {
                arrayList.add(cls);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static l M(String str) {
        return F(null, str, true);
    }

    public static l N(k kVar) {
        return G(kVar, true);
    }

    public static l O() {
        if (f41540f && f41542h != null) {
            return f41542h;
        }
        return f41554x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static k P(String str) {
        k kVar = f41545k.get(str);
        if (kVar == null) {
            if (str.startsWith("GMT")) {
                str = "UTC" + str.substring(3);
            }
            p v11 = p.v(str, false);
            return v11 == null ? new net.time4j.tz.e(str) : v11;
        }
        return kVar;
    }

    static /* synthetic */ l f() {
        return v();
    }

    private static r r(r rVar, r rVar2) {
        String version = rVar.getVersion();
        if (!version.isEmpty()) {
            String str = f41535a;
            if (version.equals(str)) {
                return rVar;
            }
            if (str == null) {
                if (rVar2 == null || version.compareTo(rVar2.getVersion()) > 0) {
                    return rVar;
                }
                if (version.compareTo(rVar2.getVersion()) == 0 && !rVar.getLocation().contains("{java.home}")) {
                    return rVar;
                }
            }
        }
        return rVar2;
    }

    private static void s(Map<String, k> map) {
        p pVar = p.f41597k;
        map.put("Etc/GMT", pVar);
        map.put("Etc/Greenwich", pVar);
        map.put("Etc/Universal", pVar);
        map.put("Etc/Zulu", pVar);
        map.put("Etc/GMT+0", pVar);
        map.put("Etc/GMT-0", pVar);
        map.put("Etc/GMT0", pVar);
        map.put("Etc/UTC", pVar);
        map.put("Etc/UCT", pVar);
        map.put("Etc/GMT-14", p.s(50400));
        map.put("Etc/GMT-13", p.s(46800));
        map.put("Etc/GMT-12", p.s(43200));
        map.put("Etc/GMT-11", p.s(39600));
        map.put("Etc/GMT-10", p.s(36000));
        map.put("Etc/GMT-9", p.s(32400));
        map.put("Etc/GMT-8", p.s(28800));
        map.put("Etc/GMT-7", p.s(25200));
        map.put("Etc/GMT-6", p.s(21600));
        map.put("Etc/GMT-5", p.s(18000));
        map.put("Etc/GMT-4", p.s(14400));
        map.put("Etc/GMT-3", p.s(10800));
        map.put("Etc/GMT-2", p.s(7200));
        map.put("Etc/GMT-1", p.s(3600));
        map.put("Etc/GMT+1", p.s(-3600));
        map.put("Etc/GMT+2", p.s(-7200));
        map.put("Etc/GMT+3", p.s(-10800));
        map.put("Etc/GMT+4", p.s(-14400));
        map.put("Etc/GMT+5", p.s(-18000));
        map.put("Etc/GMT+6", p.s(-21600));
        map.put("Etc/GMT+7", p.s(-25200));
        map.put("Etc/GMT+8", p.s(-28800));
        map.put("Etc/GMT+9", p.s(-32400));
        map.put("Etc/GMT+10", p.s(-36000));
        map.put("Etc/GMT+11", p.s(-39600));
        map.put("Etc/GMT+12", p.s(-43200));
    }

    public static List<k> t() {
        return f41541g.f41556a;
    }

    public static List<k> u(String str) {
        if (str.equals("INCLUDE_ALIAS")) {
            return f41541g.f41557b;
        }
        r D = D(str);
        if (D == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : D.f()) {
            arrayList.add(P(str2));
        }
        Collections.sort(arrayList, f41536b);
        return Collections.unmodifiableList(arrayList);
    }

    private static l v() {
        String id2 = TimeZone.getDefault().getID();
        l F = F(null, id2, false);
        return F == null ? new h(new net.time4j.tz.e(id2)) : F;
    }

    public static String x(k kVar, net.time4j.tz.d dVar, Locale locale) {
        String str;
        String a11 = kVar.a();
        int indexOf = a11.indexOf(126);
        r rVar = f41548n;
        if (indexOf >= 0) {
            String substring = a11.substring(0, indexOf);
            if (!substring.equals("DEFAULT") && (rVar = f41552t.get(substring)) == null) {
                return a11;
            }
            str = a11.substring(indexOf + 1);
        } else {
            str = a11;
        }
        s a12 = rVar.a();
        if (a12 == null) {
            a12 = f41553w;
        }
        String e11 = a12.e(str, dVar, locale);
        if (e11.isEmpty()) {
            s sVar = f41553w;
            if (a12 != sVar) {
                e11 = sVar.e(str, dVar, locale);
            }
            if (!e11.isEmpty()) {
                a11 = e11;
            }
            return a11;
        }
        return e11;
    }

    public abstract p A(net.time4j.base.a aVar, net.time4j.base.g gVar);

    public abstract p B(net.time4j.base.f fVar);

    public abstract o E();

    public abstract boolean I(net.time4j.base.f fVar);

    public abstract boolean J();

    public abstract boolean K(net.time4j.base.a aVar, net.time4j.base.g gVar);

    public abstract l Q(o oVar);

    public String w(net.time4j.tz.d dVar, Locale locale) {
        return x(z(), dVar, locale);
    }

    public abstract m y();

    public abstract k z();
}