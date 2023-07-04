package g30;

import g30.j1;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class l1<Element, Array, Builder extends j1<Array>> extends q<Element, Array, Builder> {

    /* renamed from: b  reason: collision with root package name */
    private final e30.f f27611b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(c30.b<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        kotlin.jvm.internal.s.g(primitiveSerializer, "primitiveSerializer");
        this.f27611b = new k1(primitiveSerializer.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    public final Iterator<Element> d(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // g30.a, c30.a
    public final Array deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return f(decoder, null);
    }

    @Override // g30.q, c30.b, c30.h, c30.a
    public final e30.f getDescriptor() {
        return this.f27611b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: o */
    public final Builder a() {
        return (Builder) k(r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: p */
    public final int b(Builder builder) {
        kotlin.jvm.internal.s.g(builder, "<this>");
        return builder.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: q */
    public final void c(Builder builder, int i11) {
        kotlin.jvm.internal.s.g(builder, "<this>");
        builder.b(i11);
    }

    protected abstract Array r();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.q
    /* renamed from: s */
    public final void n(Builder builder, int i11, Element element) {
        kotlin.jvm.internal.s.g(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    @Override // g30.q, c30.h
    public final void serialize(f30.f encoder, Array array) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        int e11 = e(array);
        e30.f fVar = this.f27611b;
        f30.d B = encoder.B(fVar, e11);
        u(B, array, e11);
        B.d(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: t */
    public final Array l(Builder builder) {
        kotlin.jvm.internal.s.g(builder, "<this>");
        return (Array) builder.a();
    }

    protected abstract void u(f30.d dVar, Array array, int i11);
}