package vz;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class q<T> implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f54772b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Object f54773a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f54774a;

        public b(Throwable exception) {
            kotlin.jvm.internal.s.g(exception, "exception");
            this.f54774a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.s.c(this.f54774a, ((b) obj).f54774a);
        }

        public int hashCode() {
            return this.f54774a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f54774a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    private /* synthetic */ q(Object obj) {
        this.f54773a = obj;
    }

    public static final /* synthetic */ q a(Object obj) {
        return new q(obj);
    }

    public static <T> Object b(Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof q) && kotlin.jvm.internal.s.c(obj, ((q) obj2).j());
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.s.c(obj, obj2);
    }

    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f54774a;
        }
        return null;
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean g(Object obj) {
        return obj instanceof b;
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof b);
    }

    public static String i(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return c(this.f54773a, obj);
    }

    public int hashCode() {
        return f(this.f54773a);
    }

    public final /* synthetic */ Object j() {
        return this.f54773a;
    }

    public String toString() {
        return i(this.f54773a);
    }
}