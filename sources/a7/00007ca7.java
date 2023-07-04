package k0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34156a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final m f34157b = new n(new a0(null, null, null, null, 15, null));

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            return m.f34157b;
        }
    }

    private m() {
    }

    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract a0 b();

    public final m c(m exit) {
        kotlin.jvm.internal.s.g(exit, "exit");
        p b11 = b().b();
        if (b11 == null) {
            b11 = exit.b().b();
        }
        v d11 = b().d();
        if (d11 == null) {
            d11 = exit.b().d();
        }
        f a11 = b().a();
        if (a11 == null) {
            a11 = exit.b().a();
        }
        b().c();
        return new n(new a0(b11, d11, a11, exit.b().c()));
    }

    public boolean equals(Object obj) {
        return (obj instanceof m) && kotlin.jvm.internal.s.c(((m) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }
}