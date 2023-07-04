package k0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class k {

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        new l(new a0(null, null, null, null, 15, null));
    }

    private k() {
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract a0 a();

    public final k b(k enter) {
        kotlin.jvm.internal.s.g(enter, "enter");
        p b11 = a().b();
        if (b11 == null) {
            b11 = enter.a().b();
        }
        v d11 = a().d();
        if (d11 == null) {
            d11 = enter.a().d();
        }
        f a11 = a().a();
        if (a11 == null) {
            a11 = enter.a().a();
        }
        a().c();
        return new l(new a0(b11, d11, a11, enter.a().c()));
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && kotlin.jvm.internal.s.c(((k) obj).a(), a());
    }

    public int hashCode() {
        return a().hashCode();
    }
}