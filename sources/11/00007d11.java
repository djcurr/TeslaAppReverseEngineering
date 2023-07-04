package k20;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class i extends p {

    /* renamed from: c  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f34290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k0 delegate, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations) {
        super(delegate);
        kotlin.jvm.internal.s.g(delegate, "delegate");
        kotlin.jvm.internal.s.g(annotations, "annotations");
        this.f34290c = annotations;
    }

    @Override // k20.o
    /* renamed from: U0 */
    public i S0(k0 delegate) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        return new i(delegate, getAnnotations());
    }

    @Override // k20.o, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f34290c;
    }
}