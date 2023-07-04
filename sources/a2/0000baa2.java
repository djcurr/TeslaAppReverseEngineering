package vz;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class y implements Comparable<y> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f54788b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final long f54789a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ y(long j11) {
        this.f54789a = j11;
    }

    public static final /* synthetic */ y a(long j11) {
        return new y(j11);
    }

    public static long b(long j11) {
        return j11;
    }

    public static boolean c(long j11, Object obj) {
        return (obj instanceof y) && j11 == ((y) obj).f();
    }

    public static int d(long j11) {
        return (int) (j11 ^ (j11 >>> 32));
    }

    public static String e(long j11) {
        return d0.f(j11);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(y yVar) {
        return d0.c(f(), yVar.f());
    }

    public boolean equals(Object obj) {
        return c(this.f54789a, obj);
    }

    public final /* synthetic */ long f() {
        return this.f54789a;
    }

    public int hashCode() {
        return d(this.f54789a);
    }

    public String toString() {
        return e(this.f54789a);
    }
}