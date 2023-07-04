package g30;

import g30.b0;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class h0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class a<T> implements b0<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c30.b<T> f27596a;

        a(c30.b<T> bVar) {
            this.f27596a = bVar;
        }

        @Override // g30.b0
        public KSerializer<?>[] childSerializers() {
            return new c30.b[]{this.f27596a};
        }

        @Override // c30.a
        public T deserialize(f30.e decoder) {
            kotlin.jvm.internal.s.g(decoder, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // c30.b, c30.h, c30.a
        public e30.f getDescriptor() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // c30.h
        public void serialize(f30.f encoder, T t11) {
            kotlin.jvm.internal.s.g(encoder, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // g30.b0
        public KSerializer<?>[] typeParametersSerializers() {
            return b0.a.a(this);
        }
    }

    public static final <T> e30.f a(String name, c30.b<T> primitiveSerializer) {
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(primitiveSerializer, "primitiveSerializer");
        return new g0(name, new a(primitiveSerializer));
    }
}