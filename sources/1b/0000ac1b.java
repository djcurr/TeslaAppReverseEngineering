package q00;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.reflect.full.IllegalCallableAccessException;
import n00.l;
import q00.d0;
import w00.s0;
import w00.v0;

/* loaded from: classes5.dex */
public abstract class f<R> implements n00.c<R>, a0 {

    /* renamed from: a  reason: collision with root package name */
    private final d0.a<List<Annotation>> f47114a;

    /* renamed from: b  reason: collision with root package name */
    private final d0.a<ArrayList<n00.l>> f47115b;

    /* renamed from: c  reason: collision with root package name */
    private final d0.a<x> f47116c;

    /* renamed from: d  reason: collision with root package name */
    private final d0.a<List<z>> f47117d;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<List<? extends Annotation>> {
        a() {
            super(0);
        }

        @Override // h00.a
        public final List<? extends Annotation> invoke() {
            return l0.e(f.this.y());
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<ArrayList<n00.l>> {

        /* loaded from: classes5.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                int a11;
                a11 = yz.b.a(((n00.l) t11).getName(), ((n00.l) t12).getName());
                return a11;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q00.f$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1012b extends kotlin.jvm.internal.u implements h00.a<w00.g0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ w00.l0 f47120a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1012b(w00.l0 l0Var) {
                super(0);
                this.f47120a = l0Var;
            }

            @Override // h00.a
            /* renamed from: a */
            public final w00.g0 invoke() {
                return this.f47120a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends kotlin.jvm.internal.u implements h00.a<w00.g0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ w00.l0 f47121a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(w00.l0 l0Var) {
                super(0);
                this.f47121a = l0Var;
            }

            @Override // h00.a
            /* renamed from: a */
            public final w00.g0 invoke() {
                return this.f47121a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class d extends kotlin.jvm.internal.u implements h00.a<w00.g0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.b f47122a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f47123b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, int i11) {
                super(0);
                this.f47122a = bVar;
                this.f47123b = i11;
            }

            @Override // h00.a
            /* renamed from: a */
            public final w00.g0 invoke() {
                v0 v0Var = this.f47122a.h().get(this.f47123b);
                kotlin.jvm.internal.s.f(v0Var, "descriptor.valueParameters[i]");
                return v0Var;
            }
        }

        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final ArrayList<n00.l> invoke() {
            int i11;
            kotlin.reflect.jvm.internal.impl.descriptors.b y11 = f.this.y();
            ArrayList<n00.l> arrayList = new ArrayList<>();
            int i12 = 0;
            if (f.this.A()) {
                i11 = 0;
            } else {
                w00.l0 i13 = l0.i(y11);
                if (i13 != null) {
                    arrayList.add(new q(f.this, 0, l.a.INSTANCE, new C1012b(i13)));
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                w00.l0 N = y11.N();
                if (N != null) {
                    arrayList.add(new q(f.this, i11, l.a.EXTENSION_RECEIVER, new c(N)));
                    i11++;
                }
            }
            List<v0> h11 = y11.h();
            kotlin.jvm.internal.s.f(h11, "descriptor.valueParameters");
            int size = h11.size();
            while (i12 < size) {
                arrayList.add(new q(f.this, i11, l.a.VALUE, new d(y11, i12)));
                i12++;
                i11++;
            }
            if (f.this.z() && (y11 instanceof g10.a) && arrayList.size() > 1) {
                wz.a0.y(arrayList, new a());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<x> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.a<Type> {
            a() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final Type invoke() {
                Type u11 = f.this.u();
                return u11 != null ? u11 : f.this.v().getReturnType();
            }
        }

        c() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final x invoke() {
            k20.d0 returnType = f.this.y().getReturnType();
            kotlin.jvm.internal.s.e(returnType);
            kotlin.jvm.internal.s.f(returnType, "descriptor.returnType!!");
            return new x(returnType, new a());
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.a<List<? extends z>> {
        d() {
            super(0);
        }

        @Override // h00.a
        public final List<? extends z> invoke() {
            int t11;
            List<s0> typeParameters = f.this.y().getTypeParameters();
            kotlin.jvm.internal.s.f(typeParameters, "descriptor.typeParameters");
            t11 = wz.x.t(typeParameters, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (s0 descriptor : typeParameters) {
                f fVar = f.this;
                kotlin.jvm.internal.s.f(descriptor, "descriptor");
                arrayList.add(new z(fVar, descriptor));
            }
            return arrayList;
        }
    }

    public f() {
        d0.a<List<Annotation>> c11 = d0.c(new a());
        kotlin.jvm.internal.s.f(c11, "ReflectProperties.lazySo…or.computeAnnotations() }");
        this.f47114a = c11;
        d0.a<ArrayList<n00.l>> c12 = d0.c(new b());
        kotlin.jvm.internal.s.f(c12, "ReflectProperties.lazySo…ze()\n        result\n    }");
        this.f47115b = c12;
        d0.a<x> c13 = d0.c(new c());
        kotlin.jvm.internal.s.f(c13, "ReflectProperties.lazySo…eturnType\n        }\n    }");
        this.f47116c = c13;
        d0.a<List<z>> c14 = d0.c(new d());
        kotlin.jvm.internal.s.f(c14, "ReflectProperties.lazySo…this, descriptor) }\n    }");
        this.f47117d = c14;
    }

    private final R r(Map<n00.l, ? extends Object> map) {
        int t11;
        Object t12;
        List<n00.l> parameters = getParameters();
        t11 = wz.x.t(parameters, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (n00.l lVar : parameters) {
            if (map.containsKey(lVar)) {
                t12 = map.get(lVar);
                if (t12 == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + lVar + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                }
            } else if (lVar.q()) {
                t12 = null;
            } else if (!lVar.b()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + lVar);
            } else {
                t12 = t(lVar.getType());
            }
            arrayList.add(t12);
        }
        r00.d<?> x11 = x();
        if (x11 != null) {
            try {
                Object[] array = arrayList.toArray(new Object[0]);
                if (array != null) {
                    return (R) x11.call(array);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            } catch (IllegalAccessException e11) {
                throw new IllegalCallableAccessException(e11);
            }
        }
        throw new b0("This callable does not support a default call: " + y());
    }

    private final Object t(n00.p pVar) {
        Class b11 = g00.a.b(p00.b.b(pVar));
        if (b11.isArray()) {
            Object newInstance = Array.newInstance(b11.getComponentType(), 0);
            kotlin.jvm.internal.s.f(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        throw new b0("Cannot instantiate the default empty array of type " + b11.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Type u() {
        Type[] lowerBounds;
        kotlin.reflect.jvm.internal.impl.descriptors.b y11 = y();
        if (!(y11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
            y11 = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) y11;
        if (eVar == null || !eVar.isSuspend()) {
            return null;
        }
        Object p02 = wz.u.p0(v().a());
        if (!(p02 instanceof ParameterizedType)) {
            p02 = null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) p02;
        if (kotlin.jvm.internal.s.c(parameterizedType != null ? parameterizedType.getRawType() : null, zz.d.class)) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            kotlin.jvm.internal.s.f(actualTypeArguments, "continuationType.actualTypeArguments");
            Object g02 = wz.l.g0(actualTypeArguments);
            if (!(g02 instanceof WildcardType)) {
                g02 = null;
            }
            WildcardType wildcardType = (WildcardType) g02;
            if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
                return null;
            }
            return (Type) wz.l.G(lowerBounds);
        }
        return null;
    }

    public abstract boolean A();

    @Override // n00.c
    public R call(Object... args) {
        kotlin.jvm.internal.s.g(args, "args");
        try {
            return (R) v().call(args);
        } catch (IllegalAccessException e11) {
            throw new IllegalCallableAccessException(e11);
        }
    }

    @Override // n00.c
    public R callBy(Map<n00.l, ? extends Object> args) {
        kotlin.jvm.internal.s.g(args, "args");
        return z() ? r(args) : s(args, null);
    }

    @Override // n00.b
    public List<Annotation> getAnnotations() {
        List<Annotation> invoke = this.f47114a.invoke();
        kotlin.jvm.internal.s.f(invoke, "_annotations()");
        return invoke;
    }

    @Override // n00.c
    public List<n00.l> getParameters() {
        ArrayList<n00.l> invoke = this.f47115b.invoke();
        kotlin.jvm.internal.s.f(invoke, "_parameters()");
        return invoke;
    }

    @Override // n00.c
    public n00.p getReturnType() {
        x invoke = this.f47116c.invoke();
        kotlin.jvm.internal.s.f(invoke, "_returnType()");
        return invoke;
    }

    @Override // n00.c
    public List<n00.q> getTypeParameters() {
        List<z> invoke = this.f47117d.invoke();
        kotlin.jvm.internal.s.f(invoke, "_typeParameters()");
        return invoke;
    }

    @Override // n00.c
    public n00.t getVisibility() {
        w00.q visibility = y().getVisibility();
        kotlin.jvm.internal.s.f(visibility, "descriptor.visibility");
        return l0.q(visibility);
    }

    @Override // n00.c
    public boolean isAbstract() {
        return y().p() == kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT;
    }

    @Override // n00.c
    public boolean isFinal() {
        return y().p() == kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL;
    }

    @Override // n00.c
    public boolean isOpen() {
        return y().p() == kotlin.reflect.jvm.internal.impl.descriptors.f.OPEN;
    }

    public final R s(Map<n00.l, ? extends Object> args, zz.d<?> dVar) {
        kotlin.jvm.internal.s.g(args, "args");
        List<n00.l> parameters = getParameters();
        ArrayList arrayList = new ArrayList(parameters.size());
        ArrayList arrayList2 = new ArrayList(1);
        Iterator<n00.l> it2 = parameters.iterator();
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        while (true) {
            if (!it2.hasNext()) {
                if (dVar != null) {
                    arrayList.add(dVar);
                }
                if (!z11) {
                    Object[] array = arrayList.toArray(new Object[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    return call(Arrays.copyOf(array, array.length));
                }
                arrayList2.add(Integer.valueOf(i12));
                r00.d<?> x11 = x();
                if (x11 != null) {
                    arrayList.addAll(arrayList2);
                    arrayList.add(null);
                    try {
                        Object[] array2 = arrayList.toArray(new Object[0]);
                        if (array2 != null) {
                            return (R) x11.call(array2);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    } catch (IllegalAccessException e11) {
                        throw new IllegalCallableAccessException(e11);
                    }
                }
                throw new b0("This callable does not support a default call: " + y());
            }
            n00.l next = it2.next();
            if (i11 != 0 && i11 % 32 == 0) {
                arrayList2.add(Integer.valueOf(i12));
                i12 = 0;
            }
            if (args.containsKey(next)) {
                arrayList.add(args.get(next));
            } else if (next.q()) {
                arrayList.add(l0.k(next.getType()) ? null : l0.g(p00.c.f(next.getType())));
                i12 = (1 << (i11 % 32)) | i12;
                z11 = true;
            } else if (next.b()) {
                arrayList.add(t(next.getType()));
            } else {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + next);
            }
            if (next.getKind() == l.a.VALUE) {
                i11++;
            }
        }
    }

    public abstract r00.d<?> v();

    public abstract k w();

    public abstract r00.d<?> x();

    public abstract kotlin.reflect.jvm.internal.impl.descriptors.b y();

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean z() {
        return kotlin.jvm.internal.s.c(getName(), "<init>") && w().d().isAnnotation();
    }
}