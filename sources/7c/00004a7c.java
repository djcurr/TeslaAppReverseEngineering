package com.squareup.moshi;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final f.d f20594a = new c();

    /* renamed from: b  reason: collision with root package name */
    static final com.squareup.moshi.f<Boolean> f20595b = new d();

    /* renamed from: c  reason: collision with root package name */
    static final com.squareup.moshi.f<Byte> f20596c = new e();

    /* renamed from: d  reason: collision with root package name */
    static final com.squareup.moshi.f<Character> f20597d = new f();

    /* renamed from: e  reason: collision with root package name */
    static final com.squareup.moshi.f<Double> f20598e = new g();

    /* renamed from: f  reason: collision with root package name */
    static final com.squareup.moshi.f<Float> f20599f = new h();

    /* renamed from: g  reason: collision with root package name */
    static final com.squareup.moshi.f<Integer> f20600g = new i();

    /* renamed from: h  reason: collision with root package name */
    static final com.squareup.moshi.f<Long> f20601h = new j();

    /* renamed from: i  reason: collision with root package name */
    static final com.squareup.moshi.f<Short> f20602i = new k();

    /* renamed from: j  reason: collision with root package name */
    static final com.squareup.moshi.f<String> f20603j = new a();

    /* loaded from: classes2.dex */
    class a extends com.squareup.moshi.f<String> {
        a() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: l */
        public String b(com.squareup.moshi.h hVar) {
            return hVar.n0();
        }

        @Override // com.squareup.moshi.f
        /* renamed from: m */
        public void j(com.squareup.moshi.m mVar, String str) {
            mVar.I0(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* loaded from: classes2.dex */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20604a;

        static {
            int[] iArr = new int[h.c.values().length];
            f20604a = iArr;
            try {
                iArr[h.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20604a[h.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20604a[h.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20604a[h.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20604a[h.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20604a[h.c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes2.dex */
    class c implements f.d {
        c() {
        }

        @Override // com.squareup.moshi.f.d
        public com.squareup.moshi.f<?> a(Type type, Set<? extends Annotation> set, p pVar) {
            if (set.isEmpty()) {
                if (type == Boolean.TYPE) {
                    return q.f20595b;
                }
                if (type == Byte.TYPE) {
                    return q.f20596c;
                }
                if (type == Character.TYPE) {
                    return q.f20597d;
                }
                if (type == Double.TYPE) {
                    return q.f20598e;
                }
                if (type == Float.TYPE) {
                    return q.f20599f;
                }
                if (type == Integer.TYPE) {
                    return q.f20600g;
                }
                if (type == Long.TYPE) {
                    return q.f20601h;
                }
                if (type == Short.TYPE) {
                    return q.f20602i;
                }
                if (type == Boolean.class) {
                    return q.f20595b.g();
                }
                if (type == Byte.class) {
                    return q.f20596c.g();
                }
                if (type == Character.class) {
                    return q.f20597d.g();
                }
                if (type == Double.class) {
                    return q.f20598e.g();
                }
                if (type == Float.class) {
                    return q.f20599f.g();
                }
                if (type == Integer.class) {
                    return q.f20600g.g();
                }
                if (type == Long.class) {
                    return q.f20601h.g();
                }
                if (type == Short.class) {
                    return q.f20602i.g();
                }
                if (type == String.class) {
                    return q.f20603j.g();
                }
                if (type == Object.class) {
                    return new m(pVar).g();
                }
                Class<?> h11 = r.h(type);
                com.squareup.moshi.f<?> d11 = kr.b.d(pVar, type, h11);
                if (d11 != null) {
                    return d11;
                }
                if (h11.isEnum()) {
                    return new l(h11).g();
                }
                return null;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    class d extends com.squareup.moshi.f<Boolean> {
        d() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: l */
        public Boolean b(com.squareup.moshi.h hVar) {
            return Boolean.valueOf(hVar.D());
        }

        @Override // com.squareup.moshi.f
        /* renamed from: m */
        public void j(com.squareup.moshi.m mVar, Boolean bool) {
            mVar.J0(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* loaded from: classes2.dex */
    class e extends com.squareup.moshi.f<Byte> {
        e() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: l */
        public Byte b(com.squareup.moshi.h hVar) {
            return Byte.valueOf((byte) q.a(hVar, "a byte", -128, 255));
        }

        @Override // com.squareup.moshi.f
        /* renamed from: m */
        public void j(com.squareup.moshi.m mVar, Byte b11) {
            mVar.F0(b11.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* loaded from: classes2.dex */
    class f extends com.squareup.moshi.f<Character> {
        f() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: l */
        public Character b(com.squareup.moshi.h hVar) {
            String n02 = hVar.n0();
            if (n02.length() <= 1) {
                return Character.valueOf(n02.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", "a char", CoreConstants.DOUBLE_QUOTE_CHAR + n02 + CoreConstants.DOUBLE_QUOTE_CHAR, hVar.getPath()));
        }

        @Override // com.squareup.moshi.f
        /* renamed from: m */
        public void j(com.squareup.moshi.m mVar, Character ch2) {
            mVar.I0(ch2.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* loaded from: classes2.dex */
    class g extends com.squareup.moshi.f<Double> {
        g() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: l */
        public Double b(com.squareup.moshi.h hVar) {
            return Double.valueOf(hVar.J());
        }

        @Override // com.squareup.moshi.f
        /* renamed from: m */
        public void j(com.squareup.moshi.m mVar, Double d11) {
            mVar.D0(d11.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* loaded from: classes2.dex */
    class h extends com.squareup.moshi.f<Float> {
        h() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: l */
        public Float b(com.squareup.moshi.h hVar) {
            float J = (float) hVar.J();
            if (!hVar.C() && Float.isInfinite(J)) {
                throw new JsonDataException("JSON forbids NaN and infinities: " + J + " at path " + hVar.getPath());
            }
            return Float.valueOf(J);
        }

        @Override // com.squareup.moshi.f
        /* renamed from: m */
        public void j(com.squareup.moshi.m mVar, Float f11) {
            Objects.requireNonNull(f11);
            mVar.G0(f11);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* loaded from: classes2.dex */
    class i extends com.squareup.moshi.f<Integer> {
        i() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: l */
        public Integer b(com.squareup.moshi.h hVar) {
            return Integer.valueOf(hVar.L());
        }

        @Override // com.squareup.moshi.f
        /* renamed from: m */
        public void j(com.squareup.moshi.m mVar, Integer num) {
            mVar.F0(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* loaded from: classes2.dex */
    class j extends com.squareup.moshi.f<Long> {
        j() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: l */
        public Long b(com.squareup.moshi.h hVar) {
            return Long.valueOf(hVar.R());
        }

        @Override // com.squareup.moshi.f
        /* renamed from: m */
        public void j(com.squareup.moshi.m mVar, Long l11) {
            mVar.F0(l11.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* loaded from: classes2.dex */
    class k extends com.squareup.moshi.f<Short> {
        k() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: l */
        public Short b(com.squareup.moshi.h hVar) {
            return Short.valueOf((short) q.a(hVar, "a short", -32768, 32767));
        }

        @Override // com.squareup.moshi.f
        /* renamed from: m */
        public void j(com.squareup.moshi.m mVar, Short sh2) {
            mVar.F0(sh2.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* loaded from: classes2.dex */
    static final class l<T extends Enum<T>> extends com.squareup.moshi.f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f20605a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f20606b;

        /* renamed from: c  reason: collision with root package name */
        private final T[] f20607c;

        /* renamed from: d  reason: collision with root package name */
        private final h.b f20608d;

        l(Class<T> cls) {
            this.f20605a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f20607c = enumConstants;
                this.f20606b = new String[enumConstants.length];
                int i11 = 0;
                while (true) {
                    T[] tArr = this.f20607c;
                    if (i11 < tArr.length) {
                        T t11 = tArr[i11];
                        ir.b bVar = (ir.b) cls.getField(t11.name()).getAnnotation(ir.b.class);
                        this.f20606b[i11] = bVar != null ? bVar.name() : t11.name();
                        i11++;
                    } else {
                        this.f20608d = h.b.a(this.f20606b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e11) {
                throw new AssertionError("Missing field in " + cls.getName(), e11);
            }
        }

        @Override // com.squareup.moshi.f
        /* renamed from: l */
        public T b(com.squareup.moshi.h hVar) {
            int I0 = hVar.I0(this.f20608d);
            if (I0 != -1) {
                return this.f20607c[I0];
            }
            String path = hVar.getPath();
            String n02 = hVar.n0();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f20606b) + " but was " + n02 + " at path " + path);
        }

        @Override // com.squareup.moshi.f
        /* renamed from: m */
        public void j(com.squareup.moshi.m mVar, T t11) {
            mVar.I0(this.f20606b[t11.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f20605a.getName() + ")";
        }
    }

    /* loaded from: classes2.dex */
    static final class m extends com.squareup.moshi.f<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final p f20609a;

        /* renamed from: b  reason: collision with root package name */
        private final com.squareup.moshi.f<List> f20610b;

        /* renamed from: c  reason: collision with root package name */
        private final com.squareup.moshi.f<Map> f20611c;

        /* renamed from: d  reason: collision with root package name */
        private final com.squareup.moshi.f<String> f20612d;

        /* renamed from: e  reason: collision with root package name */
        private final com.squareup.moshi.f<Double> f20613e;

        /* renamed from: f  reason: collision with root package name */
        private final com.squareup.moshi.f<Boolean> f20614f;

        m(p pVar) {
            this.f20609a = pVar;
            this.f20610b = pVar.c(List.class);
            this.f20611c = pVar.c(Map.class);
            this.f20612d = pVar.c(String.class);
            this.f20613e = pVar.c(Double.class);
            this.f20614f = pVar.c(Boolean.class);
        }

        private Class<?> l(Class<?> cls) {
            return Map.class.isAssignableFrom(cls) ? Map.class : Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // com.squareup.moshi.f
        public Object b(com.squareup.moshi.h hVar) {
            switch (b.f20604a[hVar.t0().ordinal()]) {
                case 1:
                    return this.f20610b.b(hVar);
                case 2:
                    return this.f20611c.b(hVar);
                case 3:
                    return this.f20612d.b(hVar);
                case 4:
                    return this.f20613e.b(hVar);
                case 5:
                    return this.f20614f.b(hVar);
                case 6:
                    return hVar.e0();
                default:
                    throw new IllegalStateException("Expected a value but was " + hVar.t0() + " at path " + hVar.getPath());
            }
        }

        @Override // com.squareup.moshi.f
        public void j(com.squareup.moshi.m mVar, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                mVar.j();
                mVar.C();
                return;
            }
            this.f20609a.e(l(cls), kr.b.f35689a).j(mVar, obj);
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    static int a(com.squareup.moshi.h hVar, String str, int i11, int i12) {
        int L = hVar.L();
        if (L < i11 || L > i12) {
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(L), hVar.getPath()));
        }
        return L;
    }
}