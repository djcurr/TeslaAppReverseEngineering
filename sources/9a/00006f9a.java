package g30;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class a<Element, Collection, Builder> implements c30.b<Collection> {
    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void i(a aVar, f30.c cVar, int i11, Object obj, boolean z11, int i12, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i12 & 8) != 0) {
            z11 = true;
        }
        aVar.h(cVar, i11, obj, z11);
    }

    private final int j(f30.c cVar, Builder builder) {
        int j11 = cVar.j(getDescriptor());
        c(builder, j11);
        return j11;
    }

    protected abstract Builder a();

    protected abstract int b(Builder builder);

    protected abstract void c(Builder builder, int i11);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Iterator<Element> d(Collection collection);

    @Override // c30.a
    public Collection deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return f(decoder, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int e(Collection collection);

    public final Collection f(f30.e decoder, Collection collection) {
        Builder a11;
        kotlin.jvm.internal.s.g(decoder, "decoder");
        if (collection == null || (a11 = k(collection)) == null) {
            a11 = a();
        }
        int b11 = b(a11);
        f30.c b12 = decoder.b(getDescriptor());
        if (!b12.n()) {
            while (true) {
                int p11 = b12.p(getDescriptor());
                if (p11 == -1) {
                    break;
                }
                i(this, b12, b11 + p11, a11, false, 8, null);
            }
        } else {
            g(b12, a11, b11, j(b12, a11));
        }
        b12.d(getDescriptor());
        return l(a11);
    }

    protected abstract void g(f30.c cVar, Builder builder, int i11, int i12);

    protected abstract void h(f30.c cVar, int i11, Builder builder, boolean z11);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Builder k(Collection collection);

    protected abstract Collection l(Builder builder);
}