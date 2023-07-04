package p4;

import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class z<T> {

    /* renamed from: c */
    public static final l f46178c = new l(null);

    /* renamed from: d */
    public static final z<Integer> f46179d = new f();

    /* renamed from: e */
    public static final z<int[]> f46180e;

    /* renamed from: f */
    public static final z<Long> f46181f;

    /* renamed from: g */
    public static final z<long[]> f46182g;

    /* renamed from: h */
    public static final z<Float> f46183h;

    /* renamed from: i */
    public static final z<float[]> f46184i;

    /* renamed from: j */
    public static final z<Boolean> f46185j;

    /* renamed from: k */
    public static final z<boolean[]> f46186k;

    /* renamed from: l */
    public static final z<String> f46187l;

    /* renamed from: m */
    public static final z<String[]> f46188m;

    /* renamed from: a */
    private final boolean f46189a;

    /* renamed from: b */
    private final String f46190b = "nav_type";

    /* loaded from: classes.dex */
    public static final class a extends z<boolean[]> {
        a() {
            super(true);
        }

        @Override // p4.z
        public String b() {
            return "boolean[]";
        }

        @Override // p4.z
        /* renamed from: g */
        public boolean[] a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // p4.z
        /* renamed from: h */
        public boolean[] e(String value) {
            kotlin.jvm.internal.s.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p4.z
        /* renamed from: i */
        public void f(Bundle bundle, String key, boolean[] zArr) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            bundle.putBooleanArray(key, zArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z<Boolean> {
        b() {
            super(false);
        }

        @Override // p4.z
        public String b() {
            return "boolean";
        }

        @Override // p4.z
        public /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Boolean bool) {
            i(bundle, str, bool.booleanValue());
        }

        @Override // p4.z
        /* renamed from: g */
        public Boolean a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            return (Boolean) bundle.get(key);
        }

        @Override // p4.z
        /* renamed from: h */
        public Boolean e(String value) {
            boolean z11;
            kotlin.jvm.internal.s.g(value, "value");
            if (kotlin.jvm.internal.s.c(value, "true")) {
                z11 = true;
            } else if (!kotlin.jvm.internal.s.c(value, "false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }

        public void i(Bundle bundle, String key, boolean z11) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            bundle.putBoolean(key, z11);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends z<float[]> {
        c() {
            super(true);
        }

        @Override // p4.z
        public String b() {
            return "float[]";
        }

        @Override // p4.z
        /* renamed from: g */
        public float[] a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // p4.z
        /* renamed from: h */
        public float[] e(String value) {
            kotlin.jvm.internal.s.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p4.z
        /* renamed from: i */
        public void f(Bundle bundle, String key, float[] fArr) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            bundle.putFloatArray(key, fArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends z<Float> {
        d() {
            super(false);
        }

        @Override // p4.z
        public String b() {
            return "float";
        }

        @Override // p4.z
        public /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Float f11) {
            i(bundle, str, f11.floatValue());
        }

        @Override // p4.z
        /* renamed from: g */
        public Float a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            Object obj = bundle.get(key);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Float");
            return Float.valueOf(((Float) obj).floatValue());
        }

        @Override // p4.z
        /* renamed from: h */
        public Float e(String value) {
            kotlin.jvm.internal.s.g(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        public void i(Bundle bundle, String key, float f11) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            bundle.putFloat(key, f11);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends z<int[]> {
        e() {
            super(true);
        }

        @Override // p4.z
        public String b() {
            return "integer[]";
        }

        @Override // p4.z
        /* renamed from: g */
        public int[] a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // p4.z
        /* renamed from: h */
        public int[] e(String value) {
            kotlin.jvm.internal.s.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p4.z
        /* renamed from: i */
        public void f(Bundle bundle, String key, int[] iArr) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            bundle.putIntArray(key, iArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends z<Integer> {
        f() {
            super(false);
        }

        @Override // p4.z
        public String b() {
            return "integer";
        }

        @Override // p4.z
        public /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Integer num) {
            i(bundle, str, num.intValue());
        }

        @Override // p4.z
        /* renamed from: g */
        public Integer a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            Object obj = bundle.get(key);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return Integer.valueOf(((Integer) obj).intValue());
        }

        @Override // p4.z
        /* renamed from: h */
        public Integer e(String value) {
            boolean H;
            int parseInt;
            int a11;
            kotlin.jvm.internal.s.g(value, "value");
            H = kotlin.text.v.H(value, "0x", false, 2, null);
            if (H) {
                String substring = value.substring(2);
                kotlin.jvm.internal.s.f(substring, "this as java.lang.String).substring(startIndex)");
                a11 = kotlin.text.b.a(16);
                parseInt = Integer.parseInt(substring, a11);
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        public void i(Bundle bundle, String key, int i11) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            bundle.putInt(key, i11);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends z<long[]> {
        g() {
            super(true);
        }

        @Override // p4.z
        public String b() {
            return "long[]";
        }

        @Override // p4.z
        /* renamed from: g */
        public long[] a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // p4.z
        /* renamed from: h */
        public long[] e(String value) {
            kotlin.jvm.internal.s.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p4.z
        /* renamed from: i */
        public void f(Bundle bundle, String key, long[] jArr) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            bundle.putLongArray(key, jArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends z<Long> {
        h() {
            super(false);
        }

        @Override // p4.z
        public String b() {
            return "long";
        }

        @Override // p4.z
        public /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Long l11) {
            i(bundle, str, l11.longValue());
        }

        @Override // p4.z
        /* renamed from: g */
        public Long a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            Object obj = bundle.get(key);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
            return Long.valueOf(((Long) obj).longValue());
        }

        @Override // p4.z
        /* renamed from: h */
        public Long e(String value) {
            boolean t11;
            String str;
            boolean H;
            long parseLong;
            int a11;
            kotlin.jvm.internal.s.g(value, "value");
            t11 = kotlin.text.v.t(value, "L", false, 2, null);
            if (t11) {
                str = value.substring(0, value.length() - 1);
                kotlin.jvm.internal.s.f(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = value;
            }
            H = kotlin.text.v.H(value, "0x", false, 2, null);
            if (H) {
                String substring = str.substring(2);
                kotlin.jvm.internal.s.f(substring, "this as java.lang.String).substring(startIndex)");
                a11 = kotlin.text.b.a(16);
                parseLong = Long.parseLong(substring, a11);
            } else {
                parseLong = Long.parseLong(str);
            }
            return Long.valueOf(parseLong);
        }

        public void i(Bundle bundle, String key, long j11) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            bundle.putLong(key, j11);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends z<Integer> {
        i() {
            super(false);
        }

        @Override // p4.z
        public String b() {
            return "reference";
        }

        @Override // p4.z
        public /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Integer num) {
            i(bundle, str, num.intValue());
        }

        @Override // p4.z
        /* renamed from: g */
        public Integer a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            Object obj = bundle.get(key);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return Integer.valueOf(((Integer) obj).intValue());
        }

        @Override // p4.z
        /* renamed from: h */
        public Integer e(String value) {
            boolean H;
            int parseInt;
            int a11;
            kotlin.jvm.internal.s.g(value, "value");
            H = kotlin.text.v.H(value, "0x", false, 2, null);
            if (H) {
                String substring = value.substring(2);
                kotlin.jvm.internal.s.f(substring, "this as java.lang.String).substring(startIndex)");
                a11 = kotlin.text.b.a(16);
                parseInt = Integer.parseInt(substring, a11);
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        public void i(Bundle bundle, String key, int i11) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            bundle.putInt(key, i11);
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends z<String[]> {
        j() {
            super(true);
        }

        @Override // p4.z
        public String b() {
            return "string[]";
        }

        @Override // p4.z
        /* renamed from: g */
        public String[] a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // p4.z
        /* renamed from: h */
        public String[] e(String value) {
            kotlin.jvm.internal.s.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p4.z
        /* renamed from: i */
        public void f(Bundle bundle, String key, String[] strArr) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            bundle.putStringArray(key, strArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends z<String> {
        k() {
            super(true);
        }

        @Override // p4.z
        public String b() {
            return "string";
        }

        @Override // p4.z
        /* renamed from: g */
        public String a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            return (String) bundle.get(key);
        }

        @Override // p4.z
        /* renamed from: h */
        public String e(String value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value;
        }

        @Override // p4.z
        /* renamed from: i */
        public void f(Bundle bundle, String key, String str) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            bundle.putString(key, str);
        }
    }

    /* loaded from: classes.dex */
    public static final class l {
        private l() {
        }

        public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z<Object> a(Object obj) {
            z<Object> qVar;
            if (obj instanceof Integer) {
                return z.f46179d;
            }
            if (obj instanceof int[]) {
                return z.f46180e;
            }
            if (obj instanceof Long) {
                return z.f46181f;
            }
            if (obj instanceof long[]) {
                return z.f46182g;
            }
            if (obj instanceof Float) {
                return z.f46183h;
            }
            if (obj instanceof float[]) {
                return z.f46184i;
            }
            if (obj instanceof Boolean) {
                return z.f46185j;
            }
            if (obj instanceof boolean[]) {
                return z.f46186k;
            }
            if (!(obj instanceof String) && obj != null) {
                if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    return z.f46188m;
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    kotlin.jvm.internal.s.e(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        Objects.requireNonNull(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        qVar = new n<>(componentType2);
                        return qVar;
                    }
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    kotlin.jvm.internal.s.e(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        Objects.requireNonNull(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        qVar = new p<>(componentType4);
                        return qVar;
                    }
                }
                if (obj instanceof Parcelable) {
                    qVar = new o<>(obj.getClass());
                } else if (obj instanceof Enum) {
                    qVar = new m<>(obj.getClass());
                } else if (!(obj instanceof Serializable)) {
                    throw new IllegalArgumentException("Object of type " + ((Object) obj.getClass().getName()) + " is not supported for navigation arguments.");
                } else {
                    qVar = new q<>(obj.getClass());
                }
                return qVar;
            }
            return z.f46187l;
        }
    }

    /* loaded from: classes.dex */
    public static final class m<D extends Enum<?>> extends q<D> {

        /* renamed from: o */
        private final Class<D> f46191o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Class<D> type) {
            super(false, type);
            kotlin.jvm.internal.s.g(type, "type");
            if (type.isEnum()) {
                this.f46191o = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // p4.z.q, p4.z
        public String b() {
            String name = this.f46191o.getName();
            kotlin.jvm.internal.s.f(name, "type.name");
            return name;
        }

        @Override // p4.z.q
        /* renamed from: j */
        public D h(String value) {
            D d11;
            boolean u11;
            kotlin.jvm.internal.s.g(value, "value");
            D[] enumConstants = this.f46191o.getEnumConstants();
            kotlin.jvm.internal.s.f(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    d11 = null;
                    break;
                }
                d11 = enumConstants[i11];
                i11++;
                u11 = kotlin.text.v.u(d11.name(), value, true);
                if (u11) {
                    break;
                }
            }
            D d12 = d11;
            if (d12 != null) {
                return d12;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + ((Object) this.f46191o.getName()) + CoreConstants.DOT);
        }
    }

    /* loaded from: classes.dex */
    public static final class n<D extends Parcelable> extends z<D[]> {

        /* renamed from: n */
        private final Class<D[]> f46192n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Class<D> type) {
            super(true);
            kotlin.jvm.internal.s.g(type, "type");
            if (Parcelable.class.isAssignableFrom(type)) {
                try {
                    this.f46192n = (Class<D[]>) Class.forName("[L" + ((Object) type.getName()) + ';');
                    return;
                } catch (ClassNotFoundException e11) {
                    throw new RuntimeException(e11);
                }
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
        }

        @Override // p4.z
        public String b() {
            String name = this.f46192n.getName();
            kotlin.jvm.internal.s.f(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.s.c(n.class, obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.s.c(this.f46192n, ((n) obj).f46192n);
        }

        @Override // p4.z
        /* renamed from: g */
        public D[] a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // p4.z
        /* renamed from: h */
        public D[] e(String value) {
            kotlin.jvm.internal.s.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public int hashCode() {
            return this.f46192n.hashCode();
        }

        @Override // p4.z
        /* renamed from: i */
        public void f(Bundle bundle, String key, D[] dArr) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            this.f46192n.cast(dArr);
            bundle.putParcelableArray(key, dArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class o<D> extends z<D> {

        /* renamed from: n */
        private final Class<D> f46193n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Class<D> type) {
            super(true);
            kotlin.jvm.internal.s.g(type, "type");
            boolean z11 = true;
            if (!Parcelable.class.isAssignableFrom(type) && !Serializable.class.isAssignableFrom(type)) {
                z11 = false;
            }
            if (z11) {
                this.f46193n = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // p4.z
        public D a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            return (D) bundle.get(key);
        }

        @Override // p4.z
        public String b() {
            String name = this.f46193n.getName();
            kotlin.jvm.internal.s.f(name, "type.name");
            return name;
        }

        @Override // p4.z
        public D e(String value) {
            kotlin.jvm.internal.s.g(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.s.c(o.class, obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.s.c(this.f46193n, ((o) obj).f46193n);
        }

        @Override // p4.z
        public void f(Bundle bundle, String key, D d11) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            this.f46193n.cast(d11);
            if (d11 != null && !(d11 instanceof Parcelable)) {
                if (d11 instanceof Serializable) {
                    bundle.putSerializable(key, (Serializable) d11);
                    return;
                }
                return;
            }
            bundle.putParcelable(key, (Parcelable) d11);
        }

        public int hashCode() {
            return this.f46193n.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class p<D extends Serializable> extends z<D[]> {

        /* renamed from: n */
        private final Class<D[]> f46194n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Class<D> type) {
            super(true);
            kotlin.jvm.internal.s.g(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                try {
                    this.f46194n = (Class<D[]>) Class.forName("[L" + ((Object) type.getName()) + ';');
                    return;
                } catch (ClassNotFoundException e11) {
                    throw new RuntimeException(e11);
                }
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        @Override // p4.z
        public String b() {
            String name = this.f46194n.getName();
            kotlin.jvm.internal.s.f(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.s.c(p.class, obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.s.c(this.f46194n, ((p) obj).f46194n);
        }

        @Override // p4.z
        /* renamed from: g */
        public D[] a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // p4.z
        /* renamed from: h */
        public D[] e(String value) {
            kotlin.jvm.internal.s.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public int hashCode() {
            return this.f46194n.hashCode();
        }

        @Override // p4.z
        /* renamed from: i */
        public void f(Bundle bundle, String key, D[] dArr) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            this.f46194n.cast(dArr);
            bundle.putSerializable(key, (Serializable) dArr);
        }
    }

    static {
        new i();
        f46180e = new e();
        f46181f = new h();
        f46182g = new g();
        f46183h = new d();
        f46184i = new c();
        f46185j = new b();
        f46186k = new a();
        f46187l = new k();
        f46188m = new j();
    }

    public z(boolean z11) {
        this.f46189a = z11;
    }

    public abstract T a(Bundle bundle, String str);

    public abstract String b();

    public boolean c() {
        return this.f46189a;
    }

    public final T d(Bundle bundle, String key, String value) {
        kotlin.jvm.internal.s.g(bundle, "bundle");
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(value, "value");
        T e11 = e(value);
        f(bundle, key, e11);
        return e11;
    }

    public abstract T e(String str);

    public abstract void f(Bundle bundle, String str, T t11);

    public String toString() {
        return b();
    }

    /* loaded from: classes.dex */
    public static class q<D extends Serializable> extends z<D> {

        /* renamed from: n */
        private final Class<D> f46195n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Class<D> type) {
            super(true);
            kotlin.jvm.internal.s.g(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                if (true ^ type.isEnum()) {
                    this.f46195n = type;
                    return;
                }
                throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        @Override // p4.z
        public String b() {
            String name = this.f46195n.getName();
            kotlin.jvm.internal.s.f(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                return kotlin.jvm.internal.s.c(this.f46195n, ((q) obj).f46195n);
            }
            return false;
        }

        @Override // p4.z
        /* renamed from: g */
        public D a(Bundle bundle, String key) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            return (D) bundle.get(key);
        }

        @Override // p4.z
        /* renamed from: h */
        public D e(String value) {
            kotlin.jvm.internal.s.g(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public int hashCode() {
            return this.f46195n.hashCode();
        }

        @Override // p4.z
        /* renamed from: i */
        public void f(Bundle bundle, String key, D value) {
            kotlin.jvm.internal.s.g(bundle, "bundle");
            kotlin.jvm.internal.s.g(key, "key");
            kotlin.jvm.internal.s.g(value, "value");
            this.f46195n.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(boolean z11, Class<D> type) {
            super(z11);
            kotlin.jvm.internal.s.g(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.f46195n = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }
}