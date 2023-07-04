package vz;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class a0 implements Comparable<a0> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f54753b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final short f54754a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ a0(short s11) {
        this.f54754a = s11;
    }

    public static final /* synthetic */ a0 a(short s11) {
        return new a0(s11);
    }

    public static short b(short s11) {
        return s11;
    }

    public static boolean c(short s11, Object obj) {
        return (obj instanceof a0) && s11 == ((a0) obj).f();
    }

    public static int d(short s11) {
        return s11;
    }

    public static String e(short s11) {
        return String.valueOf(s11 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(a0 a0Var) {
        return kotlin.jvm.internal.s.i(f() & 65535, a0Var.f() & 65535);
    }

    public boolean equals(Object obj) {
        return c(this.f54754a, obj);
    }

    public final /* synthetic */ short f() {
        return this.f54754a;
    }

    public int hashCode() {
        return d(this.f54754a);
    }

    public String toString() {
        return e(this.f54754a);
    }
}