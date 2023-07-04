package z00;

import kotlin.jvm.internal.s;
import w00.y0;
import w00.z0;

/* loaded from: classes5.dex */
public final class b extends z0 {

    /* renamed from: c  reason: collision with root package name */
    public static final b f60039c = new b();

    private b() {
        super("protected_and_package", true);
    }

    @Override // w00.z0
    public Integer a(z0 visibility) {
        s.g(visibility, "visibility");
        if (s.c(this, visibility)) {
            return 0;
        }
        if (visibility == y0.b.f55334c) {
            return null;
        }
        return Integer.valueOf(y0.f55331a.b(visibility) ? 1 : -1);
    }

    @Override // w00.z0
    public String b() {
        return "protected/*protected and package*/";
    }

    @Override // w00.z0
    public z0 d() {
        return y0.g.f55339c;
    }
}