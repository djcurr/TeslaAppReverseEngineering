package g30;

import f30.c;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class x0<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a  reason: collision with root package name */
    private final c30.b<Key> f27681a;

    /* renamed from: b  reason: collision with root package name */
    private final c30.b<Value> f27682b;

    private x0(c30.b<Key> bVar, c30.b<Value> bVar2) {
        super(null);
        this.f27681a = bVar;
        this.f27682b = bVar2;
    }

    public /* synthetic */ x0(c30.b bVar, c30.b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, bVar2);
    }

    @Override // c30.b, c30.h, c30.a
    public abstract e30.f getDescriptor();

    public final c30.b<Key> m() {
        return this.f27681a;
    }

    public final c30.b<Value> n() {
        return this.f27682b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: o */
    public final void g(f30.c decoder, Builder builder, int i11, int i12) {
        m00.i r11;
        m00.g q11;
        kotlin.jvm.internal.s.g(decoder, "decoder");
        kotlin.jvm.internal.s.g(builder, "builder");
        if (i12 >= 0) {
            r11 = m00.l.r(0, i12 * 2);
            q11 = m00.l.q(r11, 2);
            int c11 = q11.c();
            int e11 = q11.e();
            int f11 = q11.f();
            if ((f11 <= 0 || c11 > e11) && (f11 >= 0 || e11 > c11)) {
                return;
            }
            while (true) {
                h(decoder, i11 + c11, builder, false);
                if (c11 == e11) {
                    return;
                }
                c11 += f11;
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: p */
    public final void h(f30.c decoder, int i11, Builder builder, boolean z11) {
        int i12;
        Object c11;
        kotlin.jvm.internal.s.g(decoder, "decoder");
        kotlin.jvm.internal.s.g(builder, "builder");
        Object c12 = c.a.c(decoder, getDescriptor(), i11, this.f27681a, null, 8, null);
        if (z11) {
            i12 = decoder.p(getDescriptor());
            if (!(i12 == i11 + 1)) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i11 + ", returned index for value: " + i12).toString());
            }
        } else {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (builder.containsKey(c12) && !(this.f27682b.getDescriptor().getKind() instanceof e30.e)) {
            c11 = decoder.e(getDescriptor(), i13, this.f27682b, wz.p0.j(builder, c12));
        } else {
            c11 = c.a.c(decoder, getDescriptor(), i13, this.f27682b, null, 8, null);
        }
        builder.put(c12, c11);
    }

    @Override // c30.h
    public void serialize(f30.f encoder, Collection collection) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        int e11 = e(collection);
        e30.f descriptor = getDescriptor();
        f30.d B = encoder.B(descriptor, e11);
        Iterator<Map.Entry<? extends Key, ? extends Value>> d11 = d(collection);
        int i11 = 0;
        while (d11.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = d11.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i12 = i11 + 1;
            B.q(getDescriptor(), i11, m(), key);
            B.q(getDescriptor(), i12, n(), value);
            i11 = i12 + 1;
        }
        B.d(descriptor);
    }
}