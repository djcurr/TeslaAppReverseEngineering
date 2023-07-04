package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import retrofit2.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class n extends f.a {

    /* renamed from: a  reason: collision with root package name */
    static final f.a f49430a = new n();

    /* loaded from: classes4.dex */
    static final class a<T> implements f<ResponseBody, Optional<T>> {

        /* renamed from: a  reason: collision with root package name */
        final f<ResponseBody, T> f49431a;

        a(f<ResponseBody, T> fVar) {
            this.f49431a = fVar;
        }

        @Override // retrofit2.f
        /* renamed from: a */
        public Optional<T> convert(ResponseBody responseBody) {
            return Optional.ofNullable(this.f49431a.convert(responseBody));
        }
    }

    n() {
    }

    @Override // retrofit2.f.a
    public f<ResponseBody, ?> d(Type type, Annotation[] annotationArr, t tVar) {
        if (f.a.b(type) != Optional.class) {
            return null;
        }
        return new a(tVar.h(f.a.a(0, (ParameterizedType) type), annotationArr));
    }
}