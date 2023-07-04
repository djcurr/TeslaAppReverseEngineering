package com.squareup.moshi;

import com.squareup.moshi.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class e<C extends Collection<T>, T> extends f<C> {

    /* renamed from: b  reason: collision with root package name */
    public static final f.d f20506b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f20507a;

    /* loaded from: classes2.dex */
    class a implements f.d {
        a() {
        }

        @Override // com.squareup.moshi.f.d
        public f<?> a(Type type, Set<? extends Annotation> set, p pVar) {
            Class<?> h11 = r.h(type);
            if (set.isEmpty()) {
                if (h11 != List.class && h11 != Collection.class) {
                    if (h11 == Set.class) {
                        return e.o(type, pVar).g();
                    }
                    return null;
                }
                return e.m(type, pVar).g();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends e<Collection<T>, T> {
        b(f fVar) {
            super(fVar, null);
        }

        @Override // com.squareup.moshi.f
        public /* bridge */ /* synthetic */ Object b(h hVar) {
            return super.l(hVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.f
        public /* bridge */ /* synthetic */ void j(m mVar, Object obj) {
            super.p(mVar, (Collection) obj);
        }

        @Override // com.squareup.moshi.e
        Collection<T> n() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends e<Set<T>, T> {
        c(f fVar) {
            super(fVar, null);
        }

        @Override // com.squareup.moshi.f
        public /* bridge */ /* synthetic */ Object b(h hVar) {
            return super.l(hVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.f
        public /* bridge */ /* synthetic */ void j(m mVar, Object obj) {
            super.p(mVar, (Collection) obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.squareup.moshi.e
        /* renamed from: q */
        public Set<T> n() {
            return new LinkedHashSet();
        }
    }

    /* synthetic */ e(f fVar, a aVar) {
        this(fVar);
    }

    static <T> f<Collection<T>> m(Type type, p pVar) {
        return new b(pVar.d(r.c(type, Collection.class)));
    }

    static <T> f<Set<T>> o(Type type, p pVar) {
        return new c(pVar.d(r.c(type, Collection.class)));
    }

    public C l(h hVar) {
        C n11 = n();
        hVar.a();
        while (hVar.p()) {
            n11.add(this.f20507a.b(hVar));
        }
        hVar.j();
        return n11;
    }

    abstract C n();

    /* JADX WARN: Multi-variable type inference failed */
    public void p(m mVar, C c11) {
        mVar.a();
        for (Object obj : c11) {
            this.f20507a.j(mVar, obj);
        }
        mVar.m();
    }

    public String toString() {
        return this.f20507a + ".collection()";
    }

    private e(f<T> fVar) {
        this.f20507a = fVar;
    }
}