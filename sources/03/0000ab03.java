package pn;

import com.google.gson.u;
import com.google.gson.v;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a<E> extends u<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final v f46692c = new C0997a();

    /* renamed from: a  reason: collision with root package name */
    private final Class<E> f46693a;

    /* renamed from: b  reason: collision with root package name */
    private final u<E> f46694b;

    /* renamed from: pn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0997a implements v {
        C0997a() {
        }

        @Override // com.google.gson.v
        public <T> u<T> a(com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar) {
            Type type = aVar.getType();
            if ((type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray())) {
                Type g11 = on.b.g(type);
                return new a(eVar, eVar.k(com.google.gson.reflect.a.get(g11)), on.b.k(g11));
            }
            return null;
        }
    }

    public a(com.google.gson.e eVar, u<E> uVar, Class<E> cls) {
        this.f46694b = new m(eVar, uVar, cls);
        this.f46693a = cls;
    }

    @Override // com.google.gson.u
    public Object b(tn.a aVar) {
        if (aVar.Q0() == com.google.gson.stream.a.NULL) {
            aVar.G0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.R()) {
            arrayList.add(this.f46694b.b(aVar));
        }
        aVar.p();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f46693a, size);
        for (int i11 = 0; i11 < size; i11++) {
            Array.set(newInstance, i11, arrayList.get(i11));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.u
    public void d(com.google.gson.stream.b bVar, Object obj) {
        if (obj == null) {
            bVar.n0();
            return;
        }
        bVar.j();
        int length = Array.getLength(obj);
        for (int i11 = 0; i11 < length; i11++) {
            this.f46694b.d(bVar, Array.get(obj, i11));
        }
        bVar.p();
    }
}