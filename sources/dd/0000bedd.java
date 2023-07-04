package x20;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class i<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f57009b = new b(null);

    /* renamed from: c  reason: collision with root package name */
    private static final c f57010c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Object f57011a;

    /* loaded from: classes5.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f57012a;

        public a(Throwable th2) {
            this.f57012a = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.s.c(this.f57012a, ((a) obj).f57012a);
        }

        public int hashCode() {
            Throwable th2 = this.f57012a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @Override // x20.i.c
        public String toString() {
            return "Closed(" + this.f57012a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <E> Object a(Throwable th2) {
            return i.c(new a(th2));
        }

        public final <E> Object b() {
            return i.c(i.f57010c);
        }

        public final <E> Object c(E e11) {
            return i.c(e11);
        }
    }

    /* loaded from: classes5.dex */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ i(Object obj) {
        this.f57011a = obj;
    }

    public static final /* synthetic */ i b(Object obj) {
        return new i(obj);
    }

    public static <T> Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof i) && kotlin.jvm.internal.s.c(obj, ((i) obj2).l());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar == null) {
            return null;
        }
        return aVar.f57012a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T g(Object obj) {
        Throwable th2;
        if (obj instanceof c) {
            if (!(obj instanceof a) || (th2 = ((a) obj).f57012a) == null) {
                throw new IllegalStateException(kotlin.jvm.internal.s.p("Trying to call 'getOrThrow' on a failed channel result: ", obj).toString());
            }
            throw th2;
        }
        return obj;
    }

    public static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean i(Object obj) {
        return obj instanceof a;
    }

    public static final boolean j(Object obj) {
        return !(obj instanceof c);
    }

    public static String k(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return d(this.f57011a, obj);
    }

    public int hashCode() {
        return h(this.f57011a);
    }

    public final /* synthetic */ Object l() {
        return this.f57011a;
    }

    public String toString() {
        return k(this.f57011a);
    }
}