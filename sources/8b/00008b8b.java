package net.time4j.format;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    private static final p f41251a;

    /* renamed from: b  reason: collision with root package name */
    private static final p f41252b;

    /* renamed from: c  reason: collision with root package name */
    private static final p f41253c;

    /* renamed from: d  reason: collision with root package name */
    private static final p f41254d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, p> f41255e;

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, p> f41256f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41257a;

        static {
            int[] iArr = new int[k.values().length];
            f41257a = iArr;
            try {
                iArr[k.CARDINALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41257a[k.ORDINALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes5.dex */
    private static class b implements o {
        private b() {
        }

        @Override // net.time4j.format.o
        public p a(Locale locale, k kVar) {
            boolean equals = locale.getLanguage().equals("en");
            int i11 = a.f41257a[kVar.ordinal()];
            if (i11 == 1) {
                return equals ? p.f41251a : p.f41252b;
            } else if (i11 == 2) {
                return equals ? p.f41253c : p.f41254d;
            } else {
                throw new UnsupportedOperationException(kVar.name());
            }
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static class c extends p {
        /* synthetic */ c(k kVar, boolean z11, a aVar) {
            this(kVar, z11);
        }

        private c(k kVar, boolean z11) {
        }
    }

    /* loaded from: classes5.dex */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        private static final o f41258a;

        static {
            Iterator it2 = net.time4j.base.d.c().g(o.class).iterator();
            o oVar = it2.hasNext() ? (o) it2.next() : null;
            if (oVar == null) {
                oVar = new b(null);
            }
            f41258a = oVar;
        }
    }

    static {
        k kVar = k.CARDINALS;
        f41251a = new c(kVar, true, null);
        f41252b = new c(kVar, false, null);
        k kVar2 = k.ORDINALS;
        f41253c = new c(kVar2, true, null);
        f41254d = new c(kVar2, false, null);
        f41255e = new ConcurrentHashMap();
        f41256f = new ConcurrentHashMap();
    }

    private static Map<String, p> e(k kVar) {
        int i11 = a.f41257a[kVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return f41256f;
            }
            throw new UnsupportedOperationException(kVar.name());
        }
        return f41255e;
    }

    public static p f(Locale locale, k kVar) {
        Map<String, p> e11 = e(kVar);
        if (!e11.isEmpty()) {
            r2 = locale.getCountry().equals("") ? null : e11.get(g(locale));
            if (r2 == null) {
                r2 = e11.get(locale.getLanguage());
            }
        }
        return r2 == null ? d.f41258a.a(locale, kVar) : r2;
    }

    private static String g(Locale locale) {
        return locale.getLanguage() + '_' + locale.getCountry();
    }
}