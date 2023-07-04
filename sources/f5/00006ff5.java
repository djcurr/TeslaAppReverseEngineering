package g30;

import f30.c;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public final class x1<A, B, C> implements c30.b<vz.u<? extends A, ? extends B, ? extends C>> {

    /* renamed from: a  reason: collision with root package name */
    private final c30.b<A> f27683a;

    /* renamed from: b  reason: collision with root package name */
    private final c30.b<B> f27684b;

    /* renamed from: c  reason: collision with root package name */
    private final c30.b<C> f27685c;

    /* renamed from: d  reason: collision with root package name */
    private final e30.f f27686d;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<e30.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x1<A, B, C> f27687a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x1<A, B, C> x1Var) {
            super(1);
            this.f27687a = x1Var;
        }

        public final void a(e30.a buildClassSerialDescriptor) {
            kotlin.jvm.internal.s.g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            e30.a.b(buildClassSerialDescriptor, "first", ((x1) this.f27687a).f27683a.getDescriptor(), null, false, 12, null);
            e30.a.b(buildClassSerialDescriptor, "second", ((x1) this.f27687a).f27684b.getDescriptor(), null, false, 12, null);
            e30.a.b(buildClassSerialDescriptor, "third", ((x1) this.f27687a).f27685c.getDescriptor(), null, false, 12, null);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(e30.a aVar) {
            a(aVar);
            return vz.b0.f54756a;
        }
    }

    public x1(c30.b<A> aSerializer, c30.b<B> bSerializer, c30.b<C> cSerializer) {
        kotlin.jvm.internal.s.g(aSerializer, "aSerializer");
        kotlin.jvm.internal.s.g(bSerializer, "bSerializer");
        kotlin.jvm.internal.s.g(cSerializer, "cSerializer");
        this.f27683a = aSerializer;
        this.f27684b = bSerializer;
        this.f27685c = cSerializer;
        this.f27686d = e30.i.b("kotlin.Triple", new e30.f[0], new a(this));
    }

    private final vz.u<A, B, C> d(f30.c cVar) {
        Object c11 = c.a.c(cVar, getDescriptor(), 0, this.f27683a, null, 8, null);
        Object c12 = c.a.c(cVar, getDescriptor(), 1, this.f27684b, null, 8, null);
        Object c13 = c.a.c(cVar, getDescriptor(), 2, this.f27685c, null, 8, null);
        cVar.d(getDescriptor());
        return new vz.u<>(c11, c12, c13);
    }

    private final vz.u<A, B, C> e(f30.c cVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj = y1.f27690a;
        obj2 = y1.f27690a;
        obj3 = y1.f27690a;
        while (true) {
            int p11 = cVar.p(getDescriptor());
            if (p11 == -1) {
                cVar.d(getDescriptor());
                obj4 = y1.f27690a;
                if (obj != obj4) {
                    obj5 = y1.f27690a;
                    if (obj2 != obj5) {
                        obj6 = y1.f27690a;
                        if (obj3 != obj6) {
                            return new vz.u<>(obj, obj2, obj3);
                        }
                        throw new SerializationException("Element 'third' is missing");
                    }
                    throw new SerializationException("Element 'second' is missing");
                }
                throw new SerializationException("Element 'first' is missing");
            } else if (p11 == 0) {
                obj = c.a.c(cVar, getDescriptor(), 0, this.f27683a, null, 8, null);
            } else if (p11 == 1) {
                obj2 = c.a.c(cVar, getDescriptor(), 1, this.f27684b, null, 8, null);
            } else if (p11 == 2) {
                obj3 = c.a.c(cVar, getDescriptor(), 2, this.f27685c, null, 8, null);
            } else {
                throw new SerializationException("Unexpected index " + p11);
            }
        }
    }

    @Override // c30.a
    /* renamed from: f */
    public vz.u<A, B, C> deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        f30.c b11 = decoder.b(getDescriptor());
        if (b11.n()) {
            return d(b11);
        }
        return e(b11);
    }

    @Override // c30.h
    /* renamed from: g */
    public void serialize(f30.f encoder, vz.u<? extends A, ? extends B, ? extends C> value) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(value, "value");
        f30.d b11 = encoder.b(getDescriptor());
        b11.q(getDescriptor(), 0, this.f27683a, value.d());
        b11.q(getDescriptor(), 1, this.f27684b, value.e());
        b11.q(getDescriptor(), 2, this.f27685c, value.f());
        b11.d(getDescriptor());
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return this.f27686d;
    }
}