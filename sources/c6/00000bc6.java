package b10;

import java.lang.annotation.Annotation;

/* loaded from: classes5.dex */
public final class e extends d implements l10.c {

    /* renamed from: c  reason: collision with root package name */
    private final Annotation f7297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u10.f fVar, Annotation annotation) {
        super(fVar, null);
        kotlin.jvm.internal.s.g(annotation, "annotation");
        this.f7297c = annotation;
    }

    @Override // l10.c
    public l10.a a() {
        return new c(this.f7297c);
    }
}