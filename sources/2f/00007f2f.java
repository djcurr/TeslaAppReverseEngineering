package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import k20.d0;
import k20.w0;

/* loaded from: classes5.dex */
public abstract class h {

    /* loaded from: classes5.dex */
    public static final class a extends h {

        /* renamed from: a */
        public static final a f35151a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.h
        public w00.c a(u10.b classId) {
            kotlin.jvm.internal.s.g(classId, "classId");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.h
        public <S extends d20.h> S b(w00.c classDescriptor, h00.a<? extends S> compute) {
            kotlin.jvm.internal.s.g(classDescriptor, "classDescriptor");
            kotlin.jvm.internal.s.g(compute, "compute");
            return compute.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.h
        public boolean c(w00.x moduleDescriptor) {
            kotlin.jvm.internal.s.g(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.h
        public boolean d(w0 typeConstructor) {
            kotlin.jvm.internal.s.g(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.h
        public Collection<d0> f(w00.c classDescriptor) {
            kotlin.jvm.internal.s.g(classDescriptor, "classDescriptor");
            Collection<d0> a11 = classDescriptor.i().a();
            kotlin.jvm.internal.s.f(a11, "classDescriptor.typeConstructor.supertypes");
            return a11;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.h
        public d0 g(d0 type) {
            kotlin.jvm.internal.s.g(type, "type");
            return type;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.h
        /* renamed from: h */
        public w00.c e(w00.i descriptor) {
            kotlin.jvm.internal.s.g(descriptor, "descriptor");
            return null;
        }
    }

    public abstract w00.c a(u10.b bVar);

    public abstract <S extends d20.h> S b(w00.c cVar, h00.a<? extends S> aVar);

    public abstract boolean c(w00.x xVar);

    public abstract boolean d(w0 w0Var);

    public abstract w00.e e(w00.i iVar);

    public abstract Collection<d0> f(w00.c cVar);

    public abstract d0 g(d0 d0Var);
}