package a10;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import n10.o;

/* loaded from: classes5.dex */
public final class f implements o {

    /* renamed from: c  reason: collision with root package name */
    public static final a f117c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f118a;

    /* renamed from: b  reason: collision with root package name */
    private final o10.a f119b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Class<?> klass) {
            s.g(klass, "klass");
            o10.b bVar = new o10.b();
            c.f115a.b(klass, bVar);
            o10.a l11 = bVar.l();
            if (l11 == null) {
                return null;
            }
            return new f(klass, l11, null);
        }
    }

    private f(Class<?> cls, o10.a aVar) {
        this.f118a = cls;
        this.f119b = aVar;
    }

    public /* synthetic */ f(Class cls, o10.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, aVar);
    }

    @Override // n10.o
    public o10.a a() {
        return this.f119b;
    }

    @Override // n10.o
    public void b(o.d visitor, byte[] bArr) {
        s.g(visitor, "visitor");
        c.f115a.i(this.f118a, visitor);
    }

    @Override // n10.o
    public void c(o.c visitor, byte[] bArr) {
        s.g(visitor, "visitor");
        c.f115a.b(this.f118a, visitor);
    }

    public final Class<?> d() {
        return this.f118a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && s.c(this.f118a, ((f) obj).f118a);
    }

    @Override // n10.o
    public String getLocation() {
        String C;
        String name = this.f118a.getName();
        s.f(name, "klass.name");
        C = v.C(name, CoreConstants.DOT, '/', false, 4, null);
        return s.p(C, ".class");
    }

    public int hashCode() {
        return this.f118a.hashCode();
    }

    @Override // n10.o
    public u10.b j() {
        return b10.b.a(this.f118a);
    }

    public String toString() {
        return f.class.getName() + ": " + this.f118a;
    }
}