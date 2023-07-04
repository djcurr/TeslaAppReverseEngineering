package jr;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.squareup.moshi.r;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a<T> implements f.d {

    /* renamed from: a  reason: collision with root package name */
    final Class<T> f33931a;

    /* renamed from: b  reason: collision with root package name */
    final String f33932b;

    /* renamed from: c  reason: collision with root package name */
    final List<String> f33933c;

    /* renamed from: d  reason: collision with root package name */
    final List<Type> f33934d;

    /* renamed from: e  reason: collision with root package name */
    final f<Object> f33935e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0619a extends f<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f33936a;

        C0619a(Object obj) {
            this.f33936a = obj;
        }

        @Override // com.squareup.moshi.f
        public Object b(h hVar) {
            hVar.R0();
            return this.f33936a;
        }

        @Override // com.squareup.moshi.f
        public void j(m mVar, Object obj) {
            throw new IllegalArgumentException("Expected one of " + a.this.f33934d + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends f<Object> {

        /* renamed from: a  reason: collision with root package name */
        final String f33938a;

        /* renamed from: b  reason: collision with root package name */
        final List<String> f33939b;

        /* renamed from: c  reason: collision with root package name */
        final List<Type> f33940c;

        /* renamed from: d  reason: collision with root package name */
        final List<f<Object>> f33941d;

        /* renamed from: e  reason: collision with root package name */
        final f<Object> f33942e;

        /* renamed from: f  reason: collision with root package name */
        final h.b f33943f;

        /* renamed from: g  reason: collision with root package name */
        final h.b f33944g;

        b(String str, List<String> list, List<Type> list2, List<f<Object>> list3, f<Object> fVar) {
            this.f33938a = str;
            this.f33939b = list;
            this.f33940c = list2;
            this.f33941d = list3;
            this.f33942e = fVar;
            this.f33943f = h.b.a(str);
            this.f33944g = h.b.a((String[]) list.toArray(new String[0]));
        }

        private int l(h hVar) {
            hVar.g();
            while (hVar.p()) {
                if (hVar.G0(this.f33943f) == -1) {
                    hVar.Q0();
                    hVar.R0();
                } else {
                    int I0 = hVar.I0(this.f33944g);
                    if (I0 == -1 && this.f33942e == null) {
                        throw new JsonDataException("Expected one of " + this.f33939b + " for key '" + this.f33938a + "' but found '" + hVar.n0() + "'. Register a subtype for this label.");
                    }
                    return I0;
                }
            }
            throw new JsonDataException("Missing label for " + this.f33938a);
        }

        @Override // com.squareup.moshi.f
        public Object b(h hVar) {
            h u02 = hVar.u0();
            u02.J0(false);
            try {
                int l11 = l(u02);
                u02.close();
                if (l11 == -1) {
                    return this.f33942e.b(hVar);
                }
                return this.f33941d.get(l11).b(hVar);
            } catch (Throwable th2) {
                u02.close();
                throw th2;
            }
        }

        @Override // com.squareup.moshi.f
        public void j(m mVar, Object obj) {
            f<Object> fVar;
            int indexOf = this.f33940c.indexOf(obj.getClass());
            if (indexOf == -1) {
                fVar = this.f33942e;
                if (fVar == null) {
                    throw new IllegalArgumentException("Expected one of " + this.f33940c + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
                }
            } else {
                fVar = this.f33941d.get(indexOf);
            }
            mVar.j();
            if (fVar != this.f33942e) {
                mVar.L(this.f33938a).I0(this.f33939b.get(indexOf));
            }
            int g11 = mVar.g();
            fVar.j(mVar, obj);
            mVar.p(g11);
            mVar.C();
        }

        public String toString() {
            return "PolymorphicJsonAdapter(" + this.f33938a + ")";
        }
    }

    a(Class<T> cls, String str, List<String> list, List<Type> list2, f<Object> fVar) {
        this.f33931a = cls;
        this.f33932b = str;
        this.f33933c = list;
        this.f33934d = list2;
        this.f33935e = fVar;
    }

    private f<Object> b(T t11) {
        return new C0619a(t11);
    }

    public static <T> a<T> c(Class<T> cls, String str) {
        Objects.requireNonNull(cls, "baseType == null");
        Objects.requireNonNull(str, "labelKey == null");
        return new a<>(cls, str, Collections.emptyList(), Collections.emptyList(), null);
    }

    @Override // com.squareup.moshi.f.d
    public f<?> a(Type type, Set<? extends Annotation> set, p pVar) {
        if (r.h(type) == this.f33931a && set.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f33934d.size());
            int size = this.f33934d.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(pVar.d(this.f33934d.get(i11)));
            }
            return new b(this.f33932b, this.f33933c, this.f33934d, arrayList, this.f33935e).g();
        }
        return null;
    }

    public a<T> d(T t11) {
        return e(b(t11));
    }

    public a<T> e(f<Object> fVar) {
        return new a<>(this.f33931a, this.f33932b, this.f33933c, this.f33934d, fVar);
    }

    public a<T> f(Class<? extends T> cls, String str) {
        Objects.requireNonNull(cls, "subtype == null");
        Objects.requireNonNull(str, "label == null");
        if (!this.f33933c.contains(str)) {
            ArrayList arrayList = new ArrayList(this.f33933c);
            arrayList.add(str);
            ArrayList arrayList2 = new ArrayList(this.f33934d);
            arrayList2.add(cls);
            return new a<>(this.f33931a, this.f33932b, arrayList, arrayList2, this.f33935e);
        }
        throw new IllegalArgumentException("Labels must be unique.");
    }
}