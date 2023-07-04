package net.time4j.android.spi;

import android.content.Context;
import android.text.format.DateFormat;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.Set;
import net.time4j.engine.r;
import net.time4j.format.o;
import net.time4j.format.u;
import net.time4j.format.x;
import net.time4j.format.y;
import net.time4j.tz.s;

/* loaded from: classes5.dex */
public class AndroidResourceLoader extends net.time4j.base.d {

    /* renamed from: g  reason: collision with root package name */
    private static final Map<Class<?>, Iterable<?>> f40796g;

    /* renamed from: h  reason: collision with root package name */
    private static final Set<String> f40797h;

    /* renamed from: d  reason: collision with root package name */
    private Context f40798d = null;

    /* renamed from: e  reason: collision with root package name */
    private j30.a f40799e = null;

    /* renamed from: f  reason: collision with root package name */
    private List<net.time4j.format.f> f40800f = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40801a;

        static {
            int[] iArr = new int[net.time4j.format.e.values().length];
            f40801a = iArr;
            try {
                iArr[net.time4j.format.e.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40801a[net.time4j.format.e.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40801a[net.time4j.format.e.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class b implements k30.c {
        private b() {
        }

        private k30.c b() {
            return c.f40803a;
        }

        private String c(String str) {
            StringBuilder sb2 = new StringBuilder();
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                char charAt = str.charAt(i11);
                if (charAt == '\'') {
                    sb2.append(charAt);
                    while (true) {
                        i11++;
                        if (i11 >= length) {
                            break;
                        }
                        char charAt2 = str.charAt(i11);
                        if (charAt2 == '\'') {
                            sb2.append(charAt2);
                            int i12 = i11 + 1;
                            if (i12 < length && str.charAt(i12) == '\'') {
                                i11 = i12;
                            }
                        }
                        sb2.append(charAt2);
                    }
                } else if (charAt == 'h') {
                    sb2.append('H');
                } else if (charAt != 'a') {
                    sb2.append(charAt);
                }
                i11++;
            }
            return sb2.toString();
        }

        @Override // net.time4j.format.f
        public String a(net.time4j.format.e eVar, Locale locale) {
            return i(eVar, locale, false);
        }

        @Override // net.time4j.format.f
        public String e(net.time4j.format.e eVar, Locale locale) {
            return b().e(eVar, locale);
        }

        @Override // k30.c
        public String i(net.time4j.format.e eVar, Locale locale, boolean z11) {
            String i11 = b().i(eVar, locale, z11);
            if (Locale.getDefault().equals(locale)) {
                net.time4j.format.e eVar2 = net.time4j.format.e.SHORT;
                boolean z12 = (eVar != eVar2 ? b().a(eVar2, locale) : i11).indexOf(97) == -1;
                boolean is24HourFormat = DateFormat.is24HourFormat(AndroidResourceLoader.this.f40798d);
                if (is24HourFormat != z12) {
                    if (is24HourFormat) {
                        return c(i11).replace("  ", " ").trim();
                    }
                    String str = locale.getLanguage().equals("en") ? "b" : "B";
                    int i12 = a.f40801a[eVar.ordinal()];
                    if (i12 == 1) {
                        return "h:mm:ss " + str + " zzzz";
                    } else if (i12 == 2) {
                        return "h:mm:ss " + str + " z";
                    } else if (i12 != 3) {
                        return "h:mm " + str;
                    } else {
                        return "h:mm:ss " + str;
                    }
                }
            }
            return i11;
        }

        @Override // net.time4j.format.f
        public String k(net.time4j.format.e eVar, net.time4j.format.e eVar2, Locale locale) {
            return b().k(eVar, eVar2, locale);
        }

        /* synthetic */ b(AndroidResourceLoader androidResourceLoader, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private static final net.time4j.i18n.c f40803a;

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<net.time4j.format.i> f40804b;

        /* renamed from: c  reason: collision with root package name */
        private static final Iterable<y> f40805c;

        /* renamed from: d  reason: collision with root package name */
        private static final Iterable<u> f40806d;

        static {
            net.time4j.i18n.c cVar = new net.time4j.i18n.c();
            f40803a = cVar;
            f40804b = Collections.singleton(net.time4j.i18n.f.f41448d);
            f40805c = Collections.singletonList(new net.time4j.i18n.i());
            f40806d = Collections.unmodifiableList(Arrays.asList(cVar, new net.time4j.calendar.service.b()));
        }
    }

    /* loaded from: classes5.dex */
    private static final class d implements Iterable<r> {
        private d() {
        }

        @Override // java.lang.Iterable
        public Iterator<r> iterator() {
            return l.f40808b.iterator();
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static final class e implements Iterable<m30.c> {
        private e() {
        }

        @Override // java.lang.Iterable
        public Iterator<m30.c> iterator() {
            return m.f40811c.iterator();
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static final class f implements Iterable<net.time4j.format.i> {
        private f() {
        }

        @Override // java.lang.Iterable
        public Iterator<net.time4j.format.i> iterator() {
            return c.f40804b.iterator();
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static final class g implements Iterable<o> {
        private g() {
        }

        @Override // java.lang.Iterable
        public Iterator<o> iterator() {
            return l.f40807a.iterator();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static final class h implements Iterable<u> {
        private h() {
        }

        @Override // java.lang.Iterable
        public Iterator<u> iterator() {
            return c.f40806d.iterator();
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static final class i implements Iterable<y> {
        private i() {
        }

        @Override // java.lang.Iterable
        public Iterator<y> iterator() {
            return c.f40805c.iterator();
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static final class j implements Iterable<s> {
        private j() {
        }

        @Override // java.lang.Iterable
        public Iterator<s> iterator() {
            return m.f40810b.iterator();
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static final class k implements Iterable<net.time4j.tz.r> {
        private k() {
        }

        @Override // java.lang.Iterable
        public Iterator<net.time4j.tz.r> iterator() {
            return m.f40809a.iterator();
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static final class l {

        /* renamed from: a  reason: collision with root package name */
        private static final Iterable<o> f40807a = Collections.singleton(new net.time4j.i18n.a());

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<r> f40808b = Arrays.asList(new net.time4j.i18n.b(), new net.time4j.calendar.service.c());
    }

    /* loaded from: classes5.dex */
    private static final class m {

        /* renamed from: a  reason: collision with root package name */
        private static final Iterable<net.time4j.tz.r> f40809a;

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<s> f40810b;

        /* renamed from: c  reason: collision with root package name */
        private static final Iterable<m30.c> f40811c;

        static {
            m30.c cVar;
            Set singleton = Collections.singleton(new n30.a());
            f40809a = singleton;
            f40810b = Collections.singleton(new n30.b());
            Iterator it2 = singleton.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    cVar = null;
                    break;
                }
                net.time4j.tz.r rVar = (net.time4j.tz.r) it2.next();
                if (rVar instanceof m30.c) {
                    cVar = (m30.c) m30.c.class.cast(rVar);
                    break;
                }
            }
            if (cVar == null) {
                f40811c = Collections.emptyList();
            } else {
                f40811c = Collections.singleton(cVar);
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(u.class, new h(null));
        hashMap.put(net.time4j.tz.r.class, new k(null));
        hashMap.put(s.class, new j(null));
        hashMap.put(m30.c.class, new e(null));
        hashMap.put(r.class, new d(null));
        hashMap.put(net.time4j.format.i.class, new f(null));
        hashMap.put(o.class, new g(null));
        hashMap.put(x.class, Collections.singleton(new net.time4j.i18n.h()));
        hashMap.put(y.class, new i(null));
        hashMap.put(m30.e.class, Collections.singleton(new net.time4j.android.spi.a()));
        f40796g = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add("i18n");
        hashSet.add("calendar");
        hashSet.add("olson");
        hashSet.add("tzdata");
        f40797h = Collections.unmodifiableSet(hashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T i(Object obj) {
        return obj;
    }

    @Override // net.time4j.base.d
    public InputStream e(URI uri, boolean z11) {
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isAbsolute()) {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(uri.toURL().openConnection());
                uRLConnection.setUseCaches(false);
                return uRLConnection.getInputStream();
            }
            j30.a aVar = this.f40799e;
            if (aVar != null) {
                return aVar.a(uri.toString());
            }
            Context context = this.f40798d;
            if (context != null) {
                return context.getAssets().open(uri.toString());
            }
            throw new IllegalStateException("'ApplicationStarter.initialize(context)' must be called first at app start.");
        } catch (IOException | RuntimeException unused) {
            return null;
        }
    }

    @Override // net.time4j.base.d
    public URI f(String str, Class<?> cls, String str2) {
        try {
            if (f40797h.contains(str)) {
                return new URI("net/time4j/" + str + '/' + str2);
            }
            URL resource = cls.getClassLoader().getResource(str2);
            if (resource != null) {
                return resource.toURI();
            }
            return null;
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    @Override // net.time4j.base.d
    public <S> Iterable<S> g(Class<S> cls) {
        Iterable<?> iterable = f40796g.get(cls);
        if (iterable == null) {
            if (cls == net.time4j.format.f.class) {
                iterable = this.f40800f;
            } else {
                return ServiceLoader.load(cls, cls.getClassLoader());
            }
        }
        return (Iterable) i(iterable);
    }

    public void j(Context context, j30.a aVar) {
        Objects.requireNonNull(context, "Missing Android-context.");
        this.f40798d = context;
        this.f40799e = aVar;
        this.f40800f = Collections.singletonList(new b(this, null));
    }
}