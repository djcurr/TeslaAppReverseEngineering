package k80;

import com.squareup.moshi.p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.f;
import retrofit2.t;

/* loaded from: classes4.dex */
public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    private final p f34491a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f34492b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f34493c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f34494d;

    private a(p pVar, boolean z11, boolean z12, boolean z13) {
        this.f34491a = pVar;
        this.f34492b = z11;
        this.f34493c = z12;
        this.f34494d = z13;
    }

    public static a f() {
        return g(new p.b().d());
    }

    public static a g(p pVar) {
        Objects.requireNonNull(pVar, "moshi == null");
        return new a(pVar, false, false, false);
    }

    private static Set<? extends Annotation> h(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(ir.c.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    @Override // retrofit2.f.a
    public f<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
        com.squareup.moshi.f e11 = this.f34491a.e(type, h(annotationArr));
        if (this.f34492b) {
            e11 = e11.f();
        }
        if (this.f34493c) {
            e11 = e11.a();
        }
        if (this.f34494d) {
            e11 = e11.h();
        }
        return new b(e11);
    }

    @Override // retrofit2.f.a
    public f<ResponseBody, ?> d(Type type, Annotation[] annotationArr, t tVar) {
        com.squareup.moshi.f e11 = this.f34491a.e(type, h(annotationArr));
        if (this.f34492b) {
            e11 = e11.f();
        }
        if (this.f34493c) {
            e11 = e11.a();
        }
        if (this.f34494d) {
            e11 = e11.h();
        }
        return new c(e11);
    }
}