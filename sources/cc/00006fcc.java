package g30;

import f30.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public abstract class m0<K, V, R> implements c30.b<R> {

    /* renamed from: a  reason: collision with root package name */
    private final c30.b<K> f27612a;

    /* renamed from: b  reason: collision with root package name */
    private final c30.b<V> f27613b;

    private m0(c30.b<K> bVar, c30.b<V> bVar2) {
        this.f27612a = bVar;
        this.f27613b = bVar2;
    }

    public /* synthetic */ m0(c30.b bVar, c30.b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, bVar2);
    }

    protected abstract K a(R r11);

    protected abstract V b(R r11);

    protected abstract R c(K k11, V v11);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c30.a
    public R deserialize(f30.e decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        kotlin.jvm.internal.s.g(decoder, "decoder");
        f30.c b11 = decoder.b(getDescriptor());
        if (!b11.n()) {
            obj = y1.f27690a;
            obj2 = y1.f27690a;
            Object obj5 = obj2;
            while (true) {
                int p11 = b11.p(getDescriptor());
                if (p11 == -1) {
                    b11.d(getDescriptor());
                    obj3 = y1.f27690a;
                    if (obj != obj3) {
                        obj4 = y1.f27690a;
                        if (obj5 != obj4) {
                            return (R) c(obj, obj5);
                        }
                        throw new SerializationException("Element 'value' is missing");
                    }
                    throw new SerializationException("Element 'key' is missing");
                } else if (p11 == 0) {
                    obj = c.a.c(b11, getDescriptor(), 0, this.f27612a, null, 8, null);
                } else if (p11 == 1) {
                    obj5 = c.a.c(b11, getDescriptor(), 1, this.f27613b, null, 8, null);
                } else {
                    throw new SerializationException("Invalid index: " + p11);
                }
            }
        } else {
            return (R) c(c.a.c(b11, getDescriptor(), 0, this.f27612a, null, 8, null), c.a.c(b11, getDescriptor(), 1, this.f27613b, null, 8, null));
        }
    }

    @Override // c30.h
    public void serialize(f30.f encoder, R r11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        f30.d b11 = encoder.b(getDescriptor());
        b11.q(getDescriptor(), 0, this.f27612a, a(r11));
        b11.q(getDescriptor(), 1, this.f27613b, b(r11));
        b11.d(getDescriptor());
    }
}