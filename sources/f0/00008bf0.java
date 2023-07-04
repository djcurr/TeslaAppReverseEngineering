package net.time4j.i18n;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentMap<b, a> f41437e = new ConcurrentHashMap(32);

    /* renamed from: f  reason: collision with root package name */
    private static final ReferenceQueue<Object> f41438f = new ReferenceQueue<>();

    /* renamed from: a  reason: collision with root package name */
    private final e f41439a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f41440b;

    /* renamed from: c  reason: collision with root package name */
    private final String f41441c;

    /* renamed from: d  reason: collision with root package name */
    private final Locale f41442d;

    /* loaded from: classes5.dex */
    private static class a extends SoftReference<e> {

        /* renamed from: a  reason: collision with root package name */
        private b f41443a;

        a(e eVar, b bVar) {
            super(eVar, e.f41438f);
            this.f41443a = bVar;
        }
    }

    /* loaded from: classes5.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f41444a;

        /* renamed from: b  reason: collision with root package name */
        private final Locale f41445b;

        b(String str, Locale locale) {
            this.f41444a = str;
            this.f41445b = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f41444a.equals(bVar.f41444a) && this.f41445b.equals(bVar.f41445b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f41444a.hashCode() << 3) ^ this.f41445b.hashCode();
        }

        public String toString() {
            return this.f41444a + "/" + this.f41445b;
        }
    }

    private e(g gVar, String str, Locale locale) {
        int i11;
        this.f41439a = null;
        this.f41441c = str;
        this.f41442d = locale;
        HashMap hashMap = new HashMap();
        while (true) {
            String g11 = gVar.g();
            if (g11 != null) {
                String trim = g11.trim();
                if (!trim.isEmpty() && trim.charAt(0) != '#') {
                    int length = trim.length();
                    int i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            if (trim.charAt(i12) == '=' && (i11 = i12 + 1) < length) {
                                hashMap.put(trim.substring(0, i12), trim.substring(i11));
                                break;
                            }
                            i12++;
                        } else {
                            break;
                        }
                    }
                }
            } else {
                this.f41440b = Collections.unmodifiableMap(hashMap);
                return;
            }
        }
    }

    public static List<Locale> c(Locale locale) {
        String alias = d.getAlias(locale);
        String country = locale.getCountry();
        String variant = locale.getVariant();
        LinkedList linkedList = new LinkedList();
        if (!variant.isEmpty()) {
            linkedList.add(new Locale(alias, country, variant));
        }
        if (!country.isEmpty()) {
            linkedList.add(new Locale(alias, country, ""));
        }
        if (!alias.isEmpty()) {
            linkedList.add(new Locale(alias, "", ""));
            if (alias.equals("nn")) {
                linkedList.add(new Locale("nb", "", ""));
            }
        }
        linkedList.add(Locale.ROOT);
        return linkedList;
    }

    public static e h(String str, Locale locale) {
        e eVar;
        if (!str.isEmpty()) {
            Objects.requireNonNull(locale, "Missing locale.");
            b bVar = new b(str, locale);
            a aVar = f41437e.get(bVar);
            if (aVar == null || (eVar = aVar.get()) == null) {
                while (true) {
                    Reference<? extends Object> poll = f41438f.poll();
                    if (poll == null) {
                        break;
                    }
                    f41437e.remove(((a) poll).f41443a);
                }
                ArrayList arrayList = new ArrayList();
                for (Locale locale2 : c(locale)) {
                    try {
                        e i11 = i(str, locale2);
                        if (i11 != null) {
                            arrayList.add(i11);
                        }
                    } catch (IOException e11) {
                        throw new IllegalStateException(e11);
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (int size = arrayList.size() - 1; size >= 1; size--) {
                        int i12 = size - 1;
                        arrayList.set(i12, ((e) arrayList.get(i12)).k((e) arrayList.get(size)));
                    }
                    e eVar2 = (e) arrayList.get(0);
                    f41437e.putIfAbsent(bVar, new a(eVar2, bVar));
                    return eVar2;
                }
                throw new MissingResourceException("Cannot find resource bundle for: " + j(str, locale), e.class.getName(), "");
            }
            return eVar;
        }
        throw new IllegalArgumentException("Base name must not be empty.");
    }

    private static e i(String str, Locale locale) {
        g gVar;
        int indexOf = str.indexOf(47);
        String substring = str.substring(0, indexOf);
        String j11 = j(str.substring(indexOf + 1), locale);
        InputStream e11 = net.time4j.base.d.c().e(net.time4j.base.d.c().f(substring, e.class, j11), true);
        e eVar = null;
        g gVar2 = null;
        if (e11 == null) {
            try {
                e11 = net.time4j.base.d.c().d(e.class, j11, true);
            } catch (IOException unused) {
                return null;
            }
        }
        if (e11 != null) {
            try {
                gVar = new g(e11);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                eVar = new e(gVar, str, locale);
                gVar.close();
            } catch (Throwable th3) {
                th = th3;
                gVar2 = gVar;
                if (gVar2 != null) {
                    gVar2.close();
                }
                throw th;
            }
        }
        return eVar;
    }

    private static String j(String str, Locale locale) {
        String alias = d.getAlias(locale);
        String country = locale.getCountry();
        String variant = locale.getVariant();
        StringBuilder sb2 = new StringBuilder(str.length() + 20);
        sb2.append(str.replace(CoreConstants.DOT, '/'));
        if (!alias.isEmpty()) {
            sb2.append('_');
            sb2.append(alias);
            if (!variant.isEmpty()) {
                sb2.append('_');
                sb2.append(country);
                sb2.append('_');
                sb2.append(variant);
            } else if (!country.isEmpty()) {
                sb2.append('_');
                sb2.append(country);
            }
        }
        sb2.append(".properties");
        return sb2.toString();
    }

    private e k(e eVar) {
        return eVar == null ? this : new e(this, eVar);
    }

    public boolean b(String str) {
        Objects.requireNonNull(str, "Missing resource key.");
        e eVar = this;
        while (eVar.f41440b.get(str) == null) {
            eVar = eVar.f41439a;
            if (eVar == null) {
                return false;
            }
        }
        return true;
    }

    public Set<String> d() {
        return this.f41440b.keySet();
    }

    public Locale e() {
        return this.f41442d;
    }

    public String f(String str) {
        Objects.requireNonNull(str, "Missing resource key.");
        e eVar = this;
        do {
            String str2 = eVar.f41440b.get(str);
            if (str2 != null) {
                return str2;
            }
            eVar = eVar.f41439a;
        } while (eVar != null);
        throw new MissingResourceException("Cannot find property resource for: " + j(this.f41441c, this.f41442d) + "=>" + str, e.class.getName(), str);
    }

    public Set<String> g() {
        HashSet hashSet = new HashSet(this.f41440b.keySet());
        e eVar = this;
        while (true) {
            eVar = eVar.f41439a;
            if (eVar != null) {
                hashSet.addAll(eVar.f41440b.keySet());
            } else {
                return Collections.unmodifiableSet(hashSet);
            }
        }
    }

    private e(e eVar, e eVar2) {
        this.f41439a = eVar2;
        this.f41441c = eVar.f41441c;
        this.f41442d = eVar.f41442d;
        this.f41440b = eVar.f41440b;
    }
}