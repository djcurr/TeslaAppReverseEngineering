package a10;

import g20.q;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class j implements q {

    /* renamed from: b  reason: collision with root package name */
    public static final j f123b = new j();

    private j() {
    }

    @Override // g20.q
    public void a(kotlin.reflect.jvm.internal.impl.descriptors.b descriptor) {
        s.g(descriptor, "descriptor");
        throw new IllegalStateException(s.p("Cannot infer visibility for ", descriptor));
    }

    @Override // g20.q
    public void b(w00.c descriptor, List<String> unresolvedSuperClasses) {
        s.g(descriptor, "descriptor");
        s.g(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }
}