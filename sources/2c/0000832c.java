package lm;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f37234a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Object> f37235b;

    /* renamed from: lm.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0705b {

        /* renamed from: a  reason: collision with root package name */
        private final String f37236a;

        /* renamed from: b  reason: collision with root package name */
        private Map<Class<?>, Object> f37237b = null;

        C0705b(String str) {
            this.f37236a = str;
        }

        public b a() {
            Map unmodifiableMap;
            String str = this.f37236a;
            if (this.f37237b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f37237b));
            }
            return new b(str, unmodifiableMap);
        }

        public <T extends Annotation> C0705b b(T t11) {
            if (this.f37237b == null) {
                this.f37237b = new HashMap();
            }
            this.f37237b.put(t11.annotationType(), t11);
            return this;
        }
    }

    public static C0705b a(String str) {
        return new C0705b(str);
    }

    public static b d(String str) {
        return new b(str, Collections.emptyMap());
    }

    public String b() {
        return this.f37234a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f37235b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f37234a.equals(bVar.f37234a) && this.f37235b.equals(bVar.f37235b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f37234a.hashCode() * 31) + this.f37235b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f37234a + ", properties=" + this.f37235b.values() + "}";
    }

    private b(String str, Map<Class<?>, Object> map) {
        this.f37234a = str;
        this.f37235b = map;
    }
}