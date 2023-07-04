package f30;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public interface e {

    /* loaded from: classes5.dex */
    public static final class a {
        public static <T> T a(e eVar, c30.a<T> deserializer) {
            s.g(deserializer, "deserializer");
            return deserializer.deserialize(eVar);
        }
    }

    String B();

    boolean D();

    byte F();

    int G(e30.f fVar);

    c b(e30.f fVar);

    int g();

    Void h();

    long k();

    <T> T m(c30.a<T> aVar);

    short s();

    float t();

    double v();

    e w(e30.f fVar);

    boolean y();

    char z();
}