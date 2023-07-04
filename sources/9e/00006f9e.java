package g30;

import f30.c;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public abstract class b<T> implements c30.b<T> {
    /* JADX INFO: Access modifiers changed from: private */
    public final T b(f30.c cVar) {
        return (T) c.a.c(cVar, getDescriptor(), 1, c30.e.a(this, cVar, cVar.i(getDescriptor(), 0)), null, 8, null);
    }

    public c30.a<? extends T> c(f30.c decoder, String str) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return decoder.a().d(e(), str);
    }

    public c30.h<T> d(f30.f encoder, T value) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(value, "value");
        return encoder.a().e(e(), value);
    }

    @Override // c30.a
    public final T deserialize(f30.e decoder) {
        T t11;
        kotlin.jvm.internal.s.g(decoder, "decoder");
        e30.f descriptor = getDescriptor();
        f30.c b11 = decoder.b(descriptor);
        kotlin.jvm.internal.l0 l0Var = new kotlin.jvm.internal.l0();
        if (b11.n()) {
            t11 = (T) b(b11);
        } else {
            t11 = null;
            while (true) {
                int p11 = b11.p(getDescriptor());
                if (p11 != -1) {
                    if (p11 == 0) {
                        l0Var.f34916a = (T) b11.i(getDescriptor(), p11);
                    } else if (p11 != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) l0Var.f34916a;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(p11);
                        throw new SerializationException(sb2.toString());
                    } else {
                        T t12 = l0Var.f34916a;
                        if (t12 != null) {
                            l0Var.f34916a = t12;
                            t11 = (T) c.a.c(b11, getDescriptor(), p11, c30.e.a(this, b11, (String) t12), null, 8, null);
                        } else {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                    }
                } else if (t11 == null) {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) l0Var.f34916a)).toString());
                }
            }
        }
        b11.d(descriptor);
        return t11;
    }

    public abstract n00.d<T> e();

    @Override // c30.h
    public final void serialize(f30.f encoder, T value) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(value, "value");
        c30.h<? super T> b11 = c30.e.b(this, encoder, value);
        e30.f descriptor = getDescriptor();
        f30.d b12 = encoder.b(descriptor);
        b12.p(getDescriptor(), 0, b11.getDescriptor().h());
        b12.q(getDescriptor(), 1, b11, value);
        b12.d(descriptor);
    }
}