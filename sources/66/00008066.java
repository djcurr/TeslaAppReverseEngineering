package kotlinx.serialization.json;

import ch.qos.logback.core.CoreConstants;
import e30.d;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public abstract class f<T> implements c30.b<T> {
    private final n00.d<T> baseClass;
    private final e30.f descriptor;

    public f(n00.d<T> baseClass) {
        kotlin.jvm.internal.s.g(baseClass, "baseClass");
        this.baseClass = baseClass;
        this.descriptor = e30.i.d("JsonContentPolymorphicSerializer<" + baseClass.o() + '>', d.b.f24557a, new e30.f[0], null, 8, null);
    }

    private final Void throwSubtypeNotRegistered(n00.d<?> dVar, n00.d<?> dVar2) {
        String o11 = dVar.o();
        if (o11 == null) {
            o11 = String.valueOf(dVar);
        }
        throw new SerializationException("Class '" + o11 + "' is not registered for polymorphic serialization " + ("in the scope of '" + dVar2.o() + CoreConstants.SINGLE_QUOTE_CHAR) + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    @Override // c30.a
    public final T deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        g d11 = j.d(decoder);
        JsonElement f11 = d11.f();
        return (T) d11.c().d((c30.b) selectDeserializer(f11), f11);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return this.descriptor;
    }

    protected abstract c30.a<? extends T> selectDeserializer(JsonElement jsonElement);

    @Override // c30.h
    public final void serialize(f30.f encoder, T value) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(value, "value");
        c30.h<T> e11 = encoder.a().e(this.baseClass, value);
        if (e11 == null && (e11 = c30.i.d(m0.b(value.getClass()))) == null) {
            throwSubtypeNotRegistered(m0.b(value.getClass()), this.baseClass);
            throw new KotlinNothingValueException();
        } else {
            ((c30.b) e11).serialize(encoder, value);
        }
    }
}