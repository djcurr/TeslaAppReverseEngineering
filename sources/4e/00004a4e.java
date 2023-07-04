package com.squareup.moshi;

import com.squareup.moshi.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes2.dex */
final class b extends f<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final f.d f20486c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f20487a;

    /* renamed from: b  reason: collision with root package name */
    private final f<Object> f20488b;

    /* loaded from: classes2.dex */
    class a implements f.d {
        a() {
        }

        @Override // com.squareup.moshi.f.d
        public f<?> a(Type type, Set<? extends Annotation> set, p pVar) {
            Type a11 = r.a(type);
            if (a11 != null && set.isEmpty()) {
                return new b(r.h(a11), pVar.d(a11)).g();
            }
            return null;
        }
    }

    b(Class<?> cls, f<Object> fVar) {
        this.f20487a = cls;
        this.f20488b = fVar;
    }

    @Override // com.squareup.moshi.f
    public Object b(h hVar) {
        ArrayList arrayList = new ArrayList();
        hVar.a();
        while (hVar.p()) {
            arrayList.add(this.f20488b.b(hVar));
        }
        hVar.j();
        Object newInstance = Array.newInstance(this.f20487a, arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Array.set(newInstance, i11, arrayList.get(i11));
        }
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    public void j(m mVar, Object obj) {
        mVar.a();
        int length = Array.getLength(obj);
        for (int i11 = 0; i11 < length; i11++) {
            this.f20488b.j(mVar, Array.get(obj, i11));
        }
        mVar.m();
    }

    public String toString() {
        return this.f20488b + ".array()";
    }
}