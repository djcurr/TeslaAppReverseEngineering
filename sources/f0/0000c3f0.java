package z00;

import kotlin.jvm.internal.s;
import w00.y0;
import w00.z0;

/* loaded from: classes5.dex */
public final class a extends z0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f60038c = new a();

    private a() {
        super("package", false);
    }

    @Override // w00.z0
    public Integer a(z0 visibility) {
        s.g(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        return y0.f55331a.b(visibility) ? 1 : -1;
    }

    @Override // w00.z0
    public String b() {
        return "public/*package*/";
    }

    @Override // w00.z0
    public z0 d() {
        return y0.g.f55339c;
    }
}