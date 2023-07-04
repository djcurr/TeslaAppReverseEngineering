package vz;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class w implements Comparable<w> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f54784b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final byte f54785a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ w(byte b11) {
        this.f54785a = b11;
    }

    public static final /* synthetic */ w a(byte b11) {
        return new w(b11);
    }

    public static byte b(byte b11) {
        return b11;
    }

    public static boolean c(byte b11, Object obj) {
        return (obj instanceof w) && b11 == ((w) obj).f();
    }

    public static int d(byte b11) {
        return b11;
    }

    public static String e(byte b11) {
        return String.valueOf(b11 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(w wVar) {
        return kotlin.jvm.internal.s.i(f() & 255, wVar.f() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.f54785a, obj);
    }

    public final /* synthetic */ byte f() {
        return this.f54785a;
    }

    public int hashCode() {
        return d(this.f54785a);
    }

    public String toString() {
        return e(this.f54785a);
    }
}