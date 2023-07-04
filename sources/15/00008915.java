package n10;

/* loaded from: classes5.dex */
public final class f implements g20.g {

    /* renamed from: a  reason: collision with root package name */
    private final m f40201a;

    /* renamed from: b  reason: collision with root package name */
    private final e f40202b;

    public f(m kotlinClassFinder, e deserializedDescriptorResolver) {
        kotlin.jvm.internal.s.g(kotlinClassFinder, "kotlinClassFinder");
        kotlin.jvm.internal.s.g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f40201a = kotlinClassFinder;
        this.f40202b = deserializedDescriptorResolver;
    }

    @Override // g20.g
    public g20.f a(u10.b classId) {
        kotlin.jvm.internal.s.g(classId, "classId");
        o b11 = n.b(this.f40201a, classId);
        if (b11 == null) {
            return null;
        }
        kotlin.jvm.internal.s.c(b11.j(), classId);
        return this.f40202b.j(b11);
    }
}