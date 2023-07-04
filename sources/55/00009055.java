package on;

import com.google.gson.u;
import com.google.gson.v;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class d implements v, Cloneable {

    /* renamed from: g  reason: collision with root package name */
    public static final d f42795g = new d();

    /* renamed from: d  reason: collision with root package name */
    private boolean f42799d;

    /* renamed from: a  reason: collision with root package name */
    private double f42796a = -1.0d;

    /* renamed from: b  reason: collision with root package name */
    private int f42797b = 136;

    /* renamed from: c  reason: collision with root package name */
    private boolean f42798c = true;

    /* renamed from: e  reason: collision with root package name */
    private List<com.google.gson.a> f42800e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    private List<com.google.gson.a> f42801f = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    class a<T> extends u<T> {

        /* renamed from: a  reason: collision with root package name */
        private u<T> f42802a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f42803b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f42804c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.google.gson.e f42805d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.google.gson.reflect.a f42806e;

        a(boolean z11, boolean z12, com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
            this.f42803b = z11;
            this.f42804c = z12;
            this.f42805d = eVar;
            this.f42806e = aVar;
        }

        private u<T> e() {
            u<T> uVar = this.f42802a;
            if (uVar != null) {
                return uVar;
            }
            u<T> m11 = this.f42805d.m(d.this, this.f42806e);
            this.f42802a = m11;
            return m11;
        }

        @Override // com.google.gson.u
        public T b(tn.a aVar) {
            if (this.f42803b) {
                aVar.y1();
                return null;
            }
            return e().b(aVar);
        }

        @Override // com.google.gson.u
        public void d(com.google.gson.stream.b bVar, T t11) {
            if (this.f42804c) {
                bVar.n0();
            } else {
                e().d(bVar, t11);
            }
        }
    }

    private boolean d(Class<?> cls) {
        if (this.f42796a == -1.0d || l((nn.d) cls.getAnnotation(nn.d.class), (nn.e) cls.getAnnotation(nn.e.class))) {
            return (!this.f42798c && h(cls)) || g(cls);
        }
        return true;
    }

    private boolean e(Class<?> cls, boolean z11) {
        for (com.google.gson.a aVar : z11 ? this.f42800e : this.f42801f) {
            if (aVar.b(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean g(Class<?> cls) {
        return (Enum.class.isAssignableFrom(cls) || i(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    private boolean h(Class<?> cls) {
        return cls.isMemberClass() && !i(cls);
    }

    private boolean i(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean j(nn.d dVar) {
        return dVar == null || dVar.value() <= this.f42796a;
    }

    private boolean k(nn.e eVar) {
        return eVar == null || eVar.value() > this.f42796a;
    }

    private boolean l(nn.d dVar, nn.e eVar) {
        return j(dVar) && k(eVar);
    }

    @Override // com.google.gson.v
    public <T> u<T> a(com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        boolean d11 = d(rawType);
        boolean z11 = d11 || e(rawType, true);
        boolean z12 = d11 || e(rawType, false);
        if (z11 || z12) {
            return new a(z12, z11, eVar, aVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    public boolean c(Class<?> cls, boolean z11) {
        return d(cls) || e(cls, z11);
    }

    public boolean f(Field field, boolean z11) {
        nn.a aVar;
        if ((this.f42797b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f42796a == -1.0d || l((nn.d) field.getAnnotation(nn.d.class), (nn.e) field.getAnnotation(nn.e.class))) && !field.isSynthetic()) {
            if (!this.f42799d || ((aVar = (nn.a) field.getAnnotation(nn.a.class)) != null && (!z11 ? !aVar.deserialize() : !aVar.serialize()))) {
                if ((this.f42798c || !h(field.getType())) && !g(field.getType())) {
                    List<com.google.gson.a> list = z11 ? this.f42800e : this.f42801f;
                    if (list.isEmpty()) {
                        return false;
                    }
                    com.google.gson.b bVar = new com.google.gson.b(field);
                    for (com.google.gson.a aVar2 : list) {
                        if (aVar2.a(bVar)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}