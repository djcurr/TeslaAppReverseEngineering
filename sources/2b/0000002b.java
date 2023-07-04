package a10;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.s;
import w00.n0;
import w00.o0;

/* loaded from: classes5.dex */
public final class b implements n0 {

    /* renamed from: b  reason: collision with root package name */
    private final Annotation f114b;

    public b(Annotation annotation) {
        s.g(annotation, "annotation");
        this.f114b = annotation;
    }

    @Override // w00.n0
    public o0 b() {
        o0 NO_SOURCE_FILE = o0.f55304a;
        s.f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final Annotation d() {
        return this.f114b;
    }
}