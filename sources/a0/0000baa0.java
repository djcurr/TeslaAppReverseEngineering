package vz;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class x implements Comparable<x> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f54786b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f54787a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ x(int i11) {
        this.f54787a = i11;
    }

    public static final /* synthetic */ x a(int i11) {
        return new x(i11);
    }

    public static int b(int i11) {
        return i11;
    }

    public static boolean c(int i11, Object obj) {
        return (obj instanceof x) && i11 == ((x) obj).f();
    }

    public static int d(int i11) {
        return i11;
    }

    public static String e(int i11) {
        return String.valueOf(i11 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(x xVar) {
        return d0.a(f(), xVar.f());
    }

    public boolean equals(Object obj) {
        return c(this.f54787a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f54787a;
    }

    public int hashCode() {
        return d(this.f54787a);
    }

    public String toString() {
        return e(this.f54787a);
    }
}