package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public interface f<F, T> {

    /* loaded from: classes4.dex */
    public static abstract class a {
        /* JADX INFO: Access modifiers changed from: protected */
        public static Type a(int i11, ParameterizedType parameterizedType) {
            return x.g(i11, parameterizedType);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static Class<?> b(Type type) {
            return x.h(type);
        }

        public f<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
            return null;
        }

        public f<ResponseBody, ?> d(Type type, Annotation[] annotationArr, t tVar) {
            return null;
        }

        public f<?, String> e(Type type, Annotation[] annotationArr, t tVar) {
            return null;
        }
    }

    T convert(F f11);
}