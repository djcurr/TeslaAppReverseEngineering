package mr;

import com.squareup.wire.f;
import com.squareup.wire.h;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class j {
    public static final <M extends com.squareup.wire.f<M, B>, B extends f.a<M, B>> k<M, B> a(Class<M> messageType, String str, o syntax) {
        Field[] declaredFields;
        s.g(messageType, "messageType");
        s.g(syntax, "syntax");
        Class b11 = b(messageType);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Field messageField : messageType.getDeclaredFields()) {
            q qVar = (q) messageField.getAnnotation(q.class);
            if (qVar != null) {
                Integer valueOf = Integer.valueOf(qVar.tag());
                s.f(messageField, "messageField");
                linkedHashMap.put(valueOf, new a(qVar, messageField, b11));
            } else {
                s.f(messageField, "messageField");
                if (s.c(messageField.getType(), com.squareup.wire.h.class)) {
                    for (h.a<?> aVar : c(messageField)) {
                        linkedHashMap.put(Integer.valueOf(aVar.e()), new i(messageField, b11, aVar));
                    }
                }
            }
        }
        n00.d e11 = g00.a.e(messageType);
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        s.f(unmodifiableMap, "Collections.unmodifiableMap(fields)");
        return new k<>(new l(e11, b11, unmodifiableMap, str, syntax));
    }

    private static final <M extends com.squareup.wire.f<M, B>, B extends f.a<M, B>> Class<B> b(Class<M> cls) {
        try {
            return (Class<B>) Class.forName(cls.getName() + "$Builder");
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException("No builder class found for message type " + cls.getName());
        }
    }

    private static final <M extends com.squareup.wire.f<M, B>, B extends f.a<M, B>> Set<h.a<?>> c(Field field) {
        Class<?> declaringClass = field.getDeclaringClass();
        String name = field.getName();
        s.f(name, "messageField.name");
        Field keysField = declaringClass.getDeclaredField(d.b(name));
        s.f(keysField, "keysField");
        keysField.setAccessible(true);
        Object obj = keysField.get(null);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.Set<com.squareup.wire.OneOf.Key<*>>");
        return (Set) obj;
    }
}