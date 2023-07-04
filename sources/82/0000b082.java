package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public interface c<R, T> {

    /* loaded from: classes4.dex */
    public static abstract class a {
        /* JADX INFO: Access modifiers changed from: protected */
        public static Type getParameterUpperBound(int i11, ParameterizedType parameterizedType) {
            return x.g(i11, parameterizedType);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static Class<?> getRawType(Type type) {
            return x.h(type);
        }

        public abstract c<?, ?> get(Type type, Annotation[] annotationArr, t tVar);
    }

    T adapt(b<R> bVar);

    Type responseType();
}