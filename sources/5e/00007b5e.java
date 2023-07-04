package j80;

import com.google.gson.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.f;
import retrofit2.t;

/* loaded from: classes4.dex */
public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    private final e f33280a;

    private a(e eVar) {
        this.f33280a = eVar;
    }

    public static a f() {
        return g(new e());
    }

    public static a g(e eVar) {
        Objects.requireNonNull(eVar, "gson == null");
        return new a(eVar);
    }

    @Override // retrofit2.f.a
    public f<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
        return new b(this.f33280a, this.f33280a.k(com.google.gson.reflect.a.get(type)));
    }

    @Override // retrofit2.f.a
    public f<ResponseBody, ?> d(Type type, Annotation[] annotationArr, t tVar) {
        return new c(this.f33280a, this.f33280a.k(com.google.gson.reflect.a.get(type)));
    }
}