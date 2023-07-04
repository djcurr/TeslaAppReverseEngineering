package pn;

import com.google.gson.u;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import pn.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m<T> extends u<T> {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.gson.e f46758a;

    /* renamed from: b  reason: collision with root package name */
    private final u<T> f46759b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f46760c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(com.google.gson.e eVar, u<T> uVar, Type type) {
        this.f46758a = eVar;
        this.f46759b = uVar;
        this.f46760c = type;
    }

    private Type e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // com.google.gson.u
    public T b(tn.a aVar) {
        return this.f46759b.b(aVar);
    }

    @Override // com.google.gson.u
    public void d(com.google.gson.stream.b bVar, T t11) {
        u<T> uVar = this.f46759b;
        Type e11 = e(this.f46760c, t11);
        if (e11 != this.f46760c) {
            uVar = this.f46758a.k(com.google.gson.reflect.a.get(e11));
            if (uVar instanceof k.b) {
                u<T> uVar2 = this.f46759b;
                if (!(uVar2 instanceof k.b)) {
                    uVar = uVar2;
                }
            }
        }
        uVar.d(bVar, t11);
    }
}