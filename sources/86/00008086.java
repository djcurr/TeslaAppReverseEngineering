package kq;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: c  reason: collision with root package name */
    public static final kq.e<hq.f> f35674c = new j();

    /* renamed from: d  reason: collision with root package name */
    public static final kq.e<hq.f> f35675d = new k();

    /* renamed from: e  reason: collision with root package name */
    public static final kq.e<hq.c> f35676e = new l();

    /* renamed from: f  reason: collision with root package name */
    public static final kq.e<hq.b> f35677f = new m();

    /* renamed from: g  reason: collision with root package name */
    public static final kq.e<Iterable<? extends Object>> f35678g = new n();

    /* renamed from: h  reason: collision with root package name */
    public static final kq.e<Enum<?>> f35679h = new o();

    /* renamed from: i  reason: collision with root package name */
    public static final kq.e<Map<String, ? extends Object>> f35680i = new p();

    /* renamed from: j  reason: collision with root package name */
    public static final kq.e<Object> f35681j = new kq.c();

    /* renamed from: k  reason: collision with root package name */
    public static final kq.e<Object> f35682k;

    /* renamed from: l  reason: collision with root package name */
    public static final kq.e<Object> f35683l;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<Class<?>, kq.e<?>> f35684a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private LinkedList<s> f35685b = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements kq.e<Double> {
        a(d dVar) {
        }

        @Override // kq.e
        /* renamed from: b */
        public void a(Double d11, Appendable appendable, hq.g gVar) {
            if (d11.isInfinite()) {
                appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
            } else {
                appendable.append(d11.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements kq.e<Date> {
        b(d dVar) {
        }

        @Override // kq.e
        /* renamed from: b */
        public void a(Date date, Appendable appendable, hq.g gVar) {
            appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            hq.i.a(date.toString(), appendable, gVar);
            appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements kq.e<Float> {
        c(d dVar) {
        }

        @Override // kq.e
        /* renamed from: b */
        public void a(Float f11, Appendable appendable, hq.g gVar) {
            if (f11.isInfinite()) {
                appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
            } else {
                appendable.append(f11.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kq.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0679d implements kq.e<int[]> {
        C0679d(d dVar) {
        }

        @Override // kq.e
        /* renamed from: b */
        public void a(int[] iArr, Appendable appendable, hq.g gVar) {
            gVar.c(appendable);
            boolean z11 = false;
            for (int i11 : iArr) {
                if (z11) {
                    gVar.m(appendable);
                } else {
                    z11 = true;
                }
                appendable.append(Integer.toString(i11));
            }
            gVar.d(appendable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements kq.e<short[]> {
        e(d dVar) {
        }

        @Override // kq.e
        /* renamed from: b */
        public void a(short[] sArr, Appendable appendable, hq.g gVar) {
            gVar.c(appendable);
            boolean z11 = false;
            for (short s11 : sArr) {
                if (z11) {
                    gVar.m(appendable);
                } else {
                    z11 = true;
                }
                appendable.append(Short.toString(s11));
            }
            gVar.d(appendable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements kq.e<long[]> {
        f(d dVar) {
        }

        @Override // kq.e
        /* renamed from: b */
        public void a(long[] jArr, Appendable appendable, hq.g gVar) {
            gVar.c(appendable);
            boolean z11 = false;
            for (long j11 : jArr) {
                if (z11) {
                    gVar.m(appendable);
                } else {
                    z11 = true;
                }
                appendable.append(Long.toString(j11));
            }
            gVar.d(appendable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements kq.e<float[]> {
        g(d dVar) {
        }

        @Override // kq.e
        /* renamed from: b */
        public void a(float[] fArr, Appendable appendable, hq.g gVar) {
            gVar.c(appendable);
            boolean z11 = false;
            for (float f11 : fArr) {
                if (z11) {
                    gVar.m(appendable);
                } else {
                    z11 = true;
                }
                appendable.append(Float.toString(f11));
            }
            gVar.d(appendable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h implements kq.e<double[]> {
        h(d dVar) {
        }

        @Override // kq.e
        /* renamed from: b */
        public void a(double[] dArr, Appendable appendable, hq.g gVar) {
            gVar.c(appendable);
            boolean z11 = false;
            for (double d11 : dArr) {
                if (z11) {
                    gVar.m(appendable);
                } else {
                    z11 = true;
                }
                appendable.append(Double.toString(d11));
            }
            gVar.d(appendable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class i implements kq.e<boolean[]> {
        i(d dVar) {
        }

        @Override // kq.e
        /* renamed from: b */
        public void a(boolean[] zArr, Appendable appendable, hq.g gVar) {
            gVar.c(appendable);
            boolean z11 = false;
            for (boolean z12 : zArr) {
                if (z11) {
                    gVar.m(appendable);
                } else {
                    z11 = true;
                }
                appendable.append(Boolean.toString(z12));
            }
            gVar.d(appendable);
        }
    }

    /* loaded from: classes2.dex */
    class j implements kq.e<hq.f> {
        j() {
        }

        @Override // kq.e
        /* renamed from: b */
        public <E extends hq.f> void a(E e11, Appendable appendable, hq.g gVar) {
            e11.b(appendable);
        }
    }

    /* loaded from: classes2.dex */
    class k implements kq.e<hq.f> {
        k() {
        }

        @Override // kq.e
        /* renamed from: b */
        public <E extends hq.f> void a(E e11, Appendable appendable, hq.g gVar) {
            e11.c(appendable, gVar);
        }
    }

    /* loaded from: classes2.dex */
    class l implements kq.e<hq.c> {
        l() {
        }

        @Override // kq.e
        /* renamed from: b */
        public <E extends hq.c> void a(E e11, Appendable appendable, hq.g gVar) {
            appendable.append(e11.f(gVar));
        }
    }

    /* loaded from: classes2.dex */
    class m implements kq.e<hq.b> {
        m() {
        }

        @Override // kq.e
        /* renamed from: b */
        public <E extends hq.b> void a(E e11, Appendable appendable, hq.g gVar) {
            appendable.append(e11.e());
        }
    }

    /* loaded from: classes2.dex */
    class n implements kq.e<Iterable<? extends Object>> {
        n() {
        }

        @Override // kq.e
        /* renamed from: b */
        public <E extends Iterable<? extends Object>> void a(E e11, Appendable appendable, hq.g gVar) {
            gVar.c(appendable);
            boolean z11 = true;
            for (Object obj : e11) {
                if (z11) {
                    z11 = false;
                    gVar.e(appendable);
                } else {
                    gVar.a(appendable);
                }
                if (obj == null) {
                    appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
                } else {
                    hq.i.b(obj, appendable, gVar);
                }
                gVar.b(appendable);
            }
            gVar.d(appendable);
        }
    }

    /* loaded from: classes2.dex */
    class o implements kq.e<Enum<?>> {
        o() {
        }

        @Override // kq.e
        /* renamed from: b */
        public <E extends Enum<?>> void a(E e11, Appendable appendable, hq.g gVar) {
            gVar.p(appendable, e11.name());
        }
    }

    /* loaded from: classes2.dex */
    class p implements kq.e<Map<String, ? extends Object>> {
        p() {
        }

        @Override // kq.e
        /* renamed from: b */
        public <E extends Map<String, ? extends Object>> void a(E e11, Appendable appendable, hq.g gVar) {
            gVar.n(appendable);
            boolean z11 = true;
            for (Map.Entry entry : e11.entrySet()) {
                Object value = entry.getValue();
                if (value != null || !gVar.g()) {
                    if (z11) {
                        gVar.l(appendable);
                        z11 = false;
                    } else {
                        gVar.m(appendable);
                    }
                    d.g(entry.getKey().toString(), value, appendable, gVar);
                }
            }
            gVar.o(appendable);
        }
    }

    /* loaded from: classes2.dex */
    class q implements kq.e<Object> {
        q() {
        }

        @Override // kq.e
        public void a(Object obj, Appendable appendable, hq.g gVar) {
            appendable.append(obj.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class r implements kq.e<String> {
        r(d dVar) {
        }

        @Override // kq.e
        /* renamed from: b */
        public void a(String str, Appendable appendable, hq.g gVar) {
            gVar.p(appendable, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class s {

        /* renamed from: a  reason: collision with root package name */
        public Class<?> f35686a;

        /* renamed from: b  reason: collision with root package name */
        public kq.e<?> f35687b;

        public s(Class<?> cls, kq.e<?> eVar) {
            this.f35686a = cls;
            this.f35687b = eVar;
        }
    }

    static {
        new kq.b();
        f35682k = new kq.a();
        f35683l = new q();
    }

    public d() {
        c();
    }

    public static void g(String str, Object obj, Appendable appendable, hq.g gVar) {
        if (str == null) {
            appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else if (!gVar.h(str)) {
            appendable.append(str);
        } else {
            appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            hq.i.a(str, appendable, gVar);
            appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
        gVar.k(appendable);
        if (obj instanceof String) {
            gVar.p(appendable, (String) obj);
        } else {
            hq.i.b(obj, appendable, gVar);
        }
        gVar.j(appendable);
    }

    public kq.e a(Class cls) {
        return this.f35684a.get(cls);
    }

    public kq.e b(Class<?> cls) {
        Iterator<s> it2 = this.f35685b.iterator();
        while (it2.hasNext()) {
            s next = it2.next();
            if (next.f35686a.isAssignableFrom(cls)) {
                return next.f35687b;
            }
        }
        return null;
    }

    public void c() {
        d(new r(this), String.class);
        d(new a(this), Double.class);
        d(new b(this), Date.class);
        d(new c(this), Float.class);
        kq.e<?> eVar = f35683l;
        d(eVar, Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class);
        d(eVar, Boolean.class);
        d(new C0679d(this), int[].class);
        d(new e(this), short[].class);
        d(new f(this), long[].class);
        d(new g(this), float[].class);
        d(new h(this), double[].class);
        d(new i(this), boolean[].class);
        e(hq.f.class, f35675d);
        e(hq.e.class, f35674c);
        e(hq.c.class, f35676e);
        e(hq.b.class, f35677f);
        e(Map.class, f35680i);
        e(Iterable.class, f35678g);
        e(Enum.class, f35679h);
        e(Number.class, eVar);
    }

    public <T> void d(kq.e<T> eVar, Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.f35684a.put(cls, eVar);
        }
    }

    public void e(Class<?> cls, kq.e<?> eVar) {
        f(cls, eVar);
    }

    public void f(Class<?> cls, kq.e<?> eVar) {
        this.f35685b.addLast(new s(cls, eVar));
    }
}