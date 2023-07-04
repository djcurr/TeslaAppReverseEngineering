package g30;

import f30.c;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class q<Element, Collection, Builder> extends a<Element, Collection, Builder> {

    /* renamed from: a  reason: collision with root package name */
    private final c30.b<Element> f27628a;

    private q(c30.b<Element> bVar) {
        super(null);
        this.f27628a = bVar;
    }

    public /* synthetic */ q(c30.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @Override // g30.a
    protected final void g(f30.c decoder, Builder builder, int i11, int i12) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        for (int i13 = 0; i13 < i12; i13++) {
            h(decoder, i11 + i13, builder, false);
        }
    }

    @Override // c30.b, c30.h, c30.a
    public abstract e30.f getDescriptor();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g30.a
    protected void h(f30.c decoder, int i11, Builder builder, boolean z11) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        n(builder, i11, c.a.c(decoder, getDescriptor(), i11, this.f27628a, null, 8, null));
    }

    protected abstract void n(Builder builder, int i11, Element element);

    @Override // c30.h
    public void serialize(f30.f encoder, Collection collection) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        int e11 = e(collection);
        e30.f descriptor = getDescriptor();
        f30.d B = encoder.B(descriptor, e11);
        Iterator<Element> d11 = d(collection);
        for (int i11 = 0; i11 < e11; i11++) {
            B.q(getDescriptor(), i11, this.f27628a, d11.next());
        }
        B.d(descriptor);
    }
}