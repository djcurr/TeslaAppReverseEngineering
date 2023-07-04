package com.squareup.moshi;

import com.squareup.moshi.f;
import com.squareup.moshi.h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a implements f.d {

    /* renamed from: a  reason: collision with root package name */
    private final List<f> f20461a;

    /* renamed from: b  reason: collision with root package name */
    private final List<f> f20462b;

    /* renamed from: com.squareup.moshi.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0359a extends com.squareup.moshi.f<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f20463a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.squareup.moshi.f f20464b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f20465c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f20466d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Set f20467e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Type f20468f;

        C0359a(a aVar, f fVar, com.squareup.moshi.f fVar2, p pVar, f fVar3, Set set, Type type) {
            this.f20463a = fVar;
            this.f20464b = fVar2;
            this.f20465c = pVar;
            this.f20466d = fVar3;
            this.f20467e = set;
            this.f20468f = type;
        }

        @Override // com.squareup.moshi.f
        public Object b(h hVar) {
            f fVar = this.f20466d;
            if (fVar == null) {
                return this.f20464b.b(hVar);
            }
            if (!fVar.f20485g && hVar.t0() == h.c.NULL) {
                hVar.e0();
                return null;
            }
            try {
                return this.f20466d.b(this.f20465c, hVar);
            } catch (InvocationTargetException e11) {
                Throwable cause = e11.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new JsonDataException(cause + " at " + hVar.getPath(), cause);
            }
        }

        @Override // com.squareup.moshi.f
        public void j(m mVar, Object obj) {
            f fVar = this.f20463a;
            if (fVar == null) {
                this.f20464b.j(mVar, obj);
            } else if (!fVar.f20485g && obj == null) {
                mVar.R();
            } else {
                try {
                    fVar.e(this.f20465c, mVar, obj);
                } catch (InvocationTargetException e11) {
                    Throwable cause = e11.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    throw new JsonDataException(cause + " at " + mVar.getPath(), cause);
                }
            }
        }

        public String toString() {
            return "JsonAdapter" + this.f20467e + "(" + this.f20468f + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends f {
        b(Type type, Set set, Object obj, Method method, int i11, int i12, boolean z11) {
            super(type, set, obj, method, i11, i12, z11);
        }

        @Override // com.squareup.moshi.a.f
        public void e(p pVar, m mVar, Object obj) {
            d(mVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends f {

        /* renamed from: h  reason: collision with root package name */
        private com.squareup.moshi.f<Object> f20469h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Type[] f20470i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Type f20471j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Set f20472k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Set f20473l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Type type, Set set, Object obj, Method method, int i11, int i12, boolean z11, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i11, i12, z11);
            this.f20470i = typeArr;
            this.f20471j = type2;
            this.f20472k = set2;
            this.f20473l = set3;
        }

        @Override // com.squareup.moshi.a.f
        public void a(p pVar, f.d dVar) {
            com.squareup.moshi.f<Object> e11;
            super.a(pVar, dVar);
            if (r.d(this.f20470i[0], this.f20471j) && this.f20472k.equals(this.f20473l)) {
                e11 = pVar.i(dVar, this.f20471j, this.f20473l);
            } else {
                e11 = pVar.e(this.f20471j, this.f20473l);
            }
            this.f20469h = e11;
        }

        @Override // com.squareup.moshi.a.f
        public void e(p pVar, m mVar, Object obj) {
            this.f20469h.j(mVar, c(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends f {
        d(Type type, Set set, Object obj, Method method, int i11, int i12, boolean z11) {
            super(type, set, obj, method, i11, i12, z11);
        }

        @Override // com.squareup.moshi.a.f
        public Object b(p pVar, h hVar) {
            return c(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e extends f {

        /* renamed from: h  reason: collision with root package name */
        com.squareup.moshi.f<Object> f20474h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Type[] f20475i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Type f20476j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Set f20477k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Set f20478l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Type type, Set set, Object obj, Method method, int i11, int i12, boolean z11, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i11, i12, z11);
            this.f20475i = typeArr;
            this.f20476j = type2;
            this.f20477k = set2;
            this.f20478l = set3;
        }

        @Override // com.squareup.moshi.a.f
        public void a(p pVar, f.d dVar) {
            com.squareup.moshi.f<Object> e11;
            super.a(pVar, dVar);
            if (r.d(this.f20475i[0], this.f20476j) && this.f20477k.equals(this.f20478l)) {
                e11 = pVar.i(dVar, this.f20475i[0], this.f20477k);
            } else {
                e11 = pVar.e(this.f20475i[0], this.f20477k);
            }
            this.f20474h = e11;
        }

        @Override // com.squareup.moshi.a.f
        public Object b(p pVar, h hVar) {
            return c(this.f20474h.b(hVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        final Type f20479a;

        /* renamed from: b  reason: collision with root package name */
        final Set<? extends Annotation> f20480b;

        /* renamed from: c  reason: collision with root package name */
        final Object f20481c;

        /* renamed from: d  reason: collision with root package name */
        final Method f20482d;

        /* renamed from: e  reason: collision with root package name */
        final int f20483e;

        /* renamed from: f  reason: collision with root package name */
        final com.squareup.moshi.f<?>[] f20484f;

        /* renamed from: g  reason: collision with root package name */
        final boolean f20485g;

        f(Type type, Set<? extends Annotation> set, Object obj, Method method, int i11, int i12, boolean z11) {
            this.f20479a = kr.b.a(type);
            this.f20480b = set;
            this.f20481c = obj;
            this.f20482d = method;
            this.f20483e = i12;
            this.f20484f = new com.squareup.moshi.f[i11 - i12];
            this.f20485g = z11;
        }

        public void a(p pVar, f.d dVar) {
            com.squareup.moshi.f<?> e11;
            if (this.f20484f.length > 0) {
                Type[] genericParameterTypes = this.f20482d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f20482d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i11 = this.f20483e; i11 < length; i11++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i11]).getActualTypeArguments()[0];
                    Set<? extends Annotation> l11 = kr.b.l(parameterAnnotations[i11]);
                    com.squareup.moshi.f<?>[] fVarArr = this.f20484f;
                    int i12 = i11 - this.f20483e;
                    if (r.d(this.f20479a, type) && this.f20480b.equals(l11)) {
                        e11 = pVar.i(dVar, type, l11);
                    } else {
                        e11 = pVar.e(type, l11);
                    }
                    fVarArr[i12] = e11;
                }
            }
        }

        public Object b(p pVar, h hVar) {
            throw new AssertionError();
        }

        protected Object c(Object obj) {
            com.squareup.moshi.f<?>[] fVarArr = this.f20484f;
            Object[] objArr = new Object[fVarArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(fVarArr, 0, objArr, 1, fVarArr.length);
            try {
                return this.f20482d.invoke(this.f20481c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        protected Object d(Object obj, Object obj2) {
            com.squareup.moshi.f<?>[] fVarArr = this.f20484f;
            Object[] objArr = new Object[fVarArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(fVarArr, 0, objArr, 2, fVarArr.length);
            try {
                return this.f20482d.invoke(this.f20481c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public void e(p pVar, m mVar, Object obj) {
            throw new AssertionError();
        }
    }

    a(List<f> list, List<f> list2) {
        this.f20461a = list;
        this.f20462b = list2;
    }

    static f b(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Set<? extends Annotation> k11 = kr.b.k(method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 1 && genericParameterTypes[0] == h.class && genericReturnType != Void.TYPE && e(1, genericParameterTypes)) {
            return new d(genericReturnType, k11, obj, method, genericParameterTypes.length, 1, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != Void.TYPE) {
            Set<? extends Annotation> l11 = kr.b.l(parameterAnnotations[0]);
            return new e(genericReturnType, k11, obj, method, genericParameterTypes.length, 1, kr.b.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, l11, k11);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
    }

    private static f c(List<f> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = list.get(i11);
            if (r.d(fVar.f20479a, type) && fVar.f20480b.equals(set)) {
                return fVar;
            }
        }
        return null;
    }

    public static a d(Object obj) {
        Method[] declaredMethods;
        f c11;
        f c12;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.isAnnotationPresent(ir.d.class)) {
                    f f11 = f(obj, method);
                    if (c(arrayList, f11.f20479a, f11.f20480b) == null) {
                        arrayList.add(f11);
                    } else {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + c12.f20482d + "\n    " + f11.f20482d);
                    }
                }
                if (method.isAnnotationPresent(ir.a.class)) {
                    f b11 = b(obj, method);
                    if (c(arrayList2, b11.f20479a, b11.f20480b) == null) {
                        arrayList2.add(b11);
                    } else {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + c11.f20482d + "\n    " + b11.f20482d);
                    }
                }
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on " + obj.getClass().getName());
        }
        return new a(arrayList, arrayList2);
    }

    private static boolean e(int i11, Type[] typeArr) {
        int length = typeArr.length;
        while (i11 < length) {
            if (!(typeArr[i11] instanceof ParameterizedType) || ((ParameterizedType) typeArr[i11]).getRawType() != com.squareup.moshi.f.class) {
                return false;
            }
            i11++;
        }
        return true;
    }

    static f f(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == m.class && genericReturnType == Void.TYPE && e(2, genericParameterTypes)) {
            return new b(genericParameterTypes[1], kr.b.l(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
        } else if (genericParameterTypes.length == 1 && genericReturnType != Void.TYPE) {
            Set<? extends Annotation> k11 = kr.b.k(method);
            Set<? extends Annotation> l11 = kr.b.l(parameterAnnotations[0]);
            return new c(genericParameterTypes[0], l11, obj, method, genericParameterTypes.length, 1, kr.b.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, l11, k11);
        } else {
            throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
        }
    }

    @Override // com.squareup.moshi.f.d
    public com.squareup.moshi.f<?> a(Type type, Set<? extends Annotation> set, p pVar) {
        f c11 = c(this.f20461a, type, set);
        f c12 = c(this.f20462b, type, set);
        com.squareup.moshi.f fVar = null;
        if (c11 == null && c12 == null) {
            return null;
        }
        if (c11 == null || c12 == null) {
            try {
                fVar = pVar.i(this, type, set);
            } catch (IllegalArgumentException e11) {
                String str = c11 == null ? "@ToJson" : "@FromJson";
                throw new IllegalArgumentException("No " + str + " adapter for " + kr.b.s(type, set), e11);
            }
        }
        com.squareup.moshi.f fVar2 = fVar;
        if (c11 != null) {
            c11.a(pVar, this);
        }
        if (c12 != null) {
            c12.a(pVar, this);
        }
        return new C0359a(this, c11, fVar2, pVar, c12, set, type);
    }
}