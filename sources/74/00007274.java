package h30;

import e30.j;
import e30.k;
import i30.d;
import java.util.List;

/* loaded from: classes5.dex */
public final class c0 implements i30.d {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f28808a;

    /* renamed from: b  reason: collision with root package name */
    private final String f28809b;

    public c0(boolean z11, String discriminator) {
        kotlin.jvm.internal.s.g(discriminator, "discriminator");
        this.f28808a = z11;
        this.f28809b = discriminator;
    }

    private final void f(e30.f fVar, n00.d<?> dVar) {
        int d11 = fVar.d();
        for (int i11 = 0; i11 < d11; i11++) {
            String e11 = fVar.e(i11);
            if (kotlin.jvm.internal.s.c(e11, this.f28809b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + dVar + " has property '" + e11 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void g(e30.f fVar, n00.d<?> dVar) {
        e30.j kind = fVar.getKind();
        if (!(kind instanceof e30.d) && !kotlin.jvm.internal.s.c(kind, j.a.f24588a)) {
            if (this.f28808a) {
                return;
            }
            if (kotlin.jvm.internal.s.c(kind, k.b.f24591a) || kotlin.jvm.internal.s.c(kind, k.c.f24592a) || (kind instanceof e30.e) || (kind instanceof j.b)) {
                throw new IllegalArgumentException("Serializer for " + dVar.o() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
            }
            return;
        }
        throw new IllegalArgumentException("Serializer for " + dVar.o() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }

    @Override // i30.d
    public <Base, Sub extends Base> void a(n00.d<Base> baseClass, n00.d<Sub> actualClass, c30.b<Sub> actualSerializer) {
        kotlin.jvm.internal.s.g(baseClass, "baseClass");
        kotlin.jvm.internal.s.g(actualClass, "actualClass");
        kotlin.jvm.internal.s.g(actualSerializer, "actualSerializer");
        e30.f descriptor = actualSerializer.getDescriptor();
        g(descriptor, actualClass);
        if (this.f28808a) {
            return;
        }
        f(descriptor, actualClass);
    }

    @Override // i30.d
    public <T> void b(n00.d<T> kClass, h00.l<? super List<? extends c30.b<?>>, ? extends c30.b<?>> provider) {
        kotlin.jvm.internal.s.g(kClass, "kClass");
        kotlin.jvm.internal.s.g(provider, "provider");
    }

    @Override // i30.d
    public <Base> void c(n00.d<Base> baseClass, h00.l<? super Base, ? extends c30.h<? super Base>> defaultSerializerProvider) {
        kotlin.jvm.internal.s.g(baseClass, "baseClass");
        kotlin.jvm.internal.s.g(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // i30.d
    public <T> void d(n00.d<T> dVar, c30.b<T> bVar) {
        d.a.a(this, dVar, bVar);
    }

    @Override // i30.d
    public <Base> void e(n00.d<Base> baseClass, h00.l<? super String, ? extends c30.a<? extends Base>> defaultDeserializerProvider) {
        kotlin.jvm.internal.s.g(baseClass, "baseClass");
        kotlin.jvm.internal.s.g(defaultDeserializerProvider, "defaultDeserializerProvider");
    }
}