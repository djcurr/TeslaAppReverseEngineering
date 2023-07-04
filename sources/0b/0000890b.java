package n10;

import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k20.d0;
import n10.o;
import w00.n0;
import w00.v0;

/* loaded from: classes5.dex */
public final class b extends n10.a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, y10.g<?>> {

    /* renamed from: c  reason: collision with root package name */
    private final w00.x f40170c;

    /* renamed from: d  reason: collision with root package name */
    private final w00.z f40171d;

    /* renamed from: e  reason: collision with root package name */
    private final g20.e f40172e;

    /* loaded from: classes5.dex */
    public static final class a implements o.a {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<u10.f, y10.g<?>> f40173a = new HashMap<>();

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w00.c f40175c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f40176d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ n0 f40177e;

        /* renamed from: n10.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0783a implements o.a {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ o.a f40178a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ o.a f40179b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f40180c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ u10.f f40181d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f40182e;

            C0783a(o.a aVar, a aVar2, u10.f fVar, ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> arrayList) {
                this.f40179b = aVar;
                this.f40180c = aVar2;
                this.f40181d = fVar;
                this.f40182e = arrayList;
                this.f40178a = aVar;
            }

            @Override // n10.o.a
            public void a() {
                this.f40179b.a();
                this.f40180c.f40173a.put(this.f40181d, new y10.a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) wz.u.C0(this.f40182e)));
            }

            @Override // n10.o.a
            public o.a b(u10.f name, u10.b classId) {
                kotlin.jvm.internal.s.g(name, "name");
                kotlin.jvm.internal.s.g(classId, "classId");
                return this.f40178a.b(name, classId);
            }

            @Override // n10.o.a
            public void c(u10.f name, u10.b enumClassId, u10.f enumEntryName) {
                kotlin.jvm.internal.s.g(name, "name");
                kotlin.jvm.internal.s.g(enumClassId, "enumClassId");
                kotlin.jvm.internal.s.g(enumEntryName, "enumEntryName");
                this.f40178a.c(name, enumClassId, enumEntryName);
            }

            @Override // n10.o.a
            public o.b d(u10.f name) {
                kotlin.jvm.internal.s.g(name, "name");
                return this.f40178a.d(name);
            }

            @Override // n10.o.a
            public void e(u10.f name, y10.f value) {
                kotlin.jvm.internal.s.g(name, "name");
                kotlin.jvm.internal.s.g(value, "value");
                this.f40178a.e(name, value);
            }

            @Override // n10.o.a
            public void f(u10.f fVar, Object obj) {
                this.f40178a.f(fVar, obj);
            }
        }

        /* renamed from: n10.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0784b implements o.b {

            /* renamed from: a  reason: collision with root package name */
            private final ArrayList<y10.g<?>> f40183a = new ArrayList<>();

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ u10.f f40185c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b f40186d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ w00.c f40187e;

            /* renamed from: n10.b$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0785a implements o.a {

                /* renamed from: a  reason: collision with root package name */
                private final /* synthetic */ o.a f40188a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ o.a f40189b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C0784b f40190c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f40191d;

                C0785a(o.a aVar, C0784b c0784b, ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> arrayList) {
                    this.f40189b = aVar;
                    this.f40190c = c0784b;
                    this.f40191d = arrayList;
                    this.f40188a = aVar;
                }

                @Override // n10.o.a
                public void a() {
                    this.f40189b.a();
                    this.f40190c.f40183a.add(new y10.a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) wz.u.C0(this.f40191d)));
                }

                @Override // n10.o.a
                public o.a b(u10.f name, u10.b classId) {
                    kotlin.jvm.internal.s.g(name, "name");
                    kotlin.jvm.internal.s.g(classId, "classId");
                    return this.f40188a.b(name, classId);
                }

                @Override // n10.o.a
                public void c(u10.f name, u10.b enumClassId, u10.f enumEntryName) {
                    kotlin.jvm.internal.s.g(name, "name");
                    kotlin.jvm.internal.s.g(enumClassId, "enumClassId");
                    kotlin.jvm.internal.s.g(enumEntryName, "enumEntryName");
                    this.f40188a.c(name, enumClassId, enumEntryName);
                }

                @Override // n10.o.a
                public o.b d(u10.f name) {
                    kotlin.jvm.internal.s.g(name, "name");
                    return this.f40188a.d(name);
                }

                @Override // n10.o.a
                public void e(u10.f name, y10.f value) {
                    kotlin.jvm.internal.s.g(name, "name");
                    kotlin.jvm.internal.s.g(value, "value");
                    this.f40188a.e(name, value);
                }

                @Override // n10.o.a
                public void f(u10.f fVar, Object obj) {
                    this.f40188a.f(fVar, obj);
                }
            }

            C0784b(u10.f fVar, b bVar, w00.c cVar) {
                this.f40185c = fVar;
                this.f40186d = bVar;
                this.f40187e = cVar;
            }

            @Override // n10.o.b
            public void a() {
                v0 b11 = f10.a.b(this.f40185c, this.f40187e);
                if (b11 != null) {
                    HashMap hashMap = a.this.f40173a;
                    u10.f fVar = this.f40185c;
                    y10.h hVar = y10.h.f58969a;
                    List<? extends y10.g<?>> c11 = s20.a.c(this.f40183a);
                    d0 type = b11.getType();
                    kotlin.jvm.internal.s.f(type, "parameter.type");
                    hashMap.put(fVar, hVar.a(c11, type));
                }
            }

            @Override // n10.o.b
            public void b(u10.b enumClassId, u10.f enumEntryName) {
                kotlin.jvm.internal.s.g(enumClassId, "enumClassId");
                kotlin.jvm.internal.s.g(enumEntryName, "enumEntryName");
                this.f40183a.add(new y10.j(enumClassId, enumEntryName));
            }

            @Override // n10.o.b
            public void c(y10.f value) {
                kotlin.jvm.internal.s.g(value, "value");
                this.f40183a.add(new y10.q(value));
            }

            @Override // n10.o.b
            public void d(Object obj) {
                this.f40183a.add(a.this.i(this.f40185c, obj));
            }

            @Override // n10.o.b
            public o.a e(u10.b classId) {
                kotlin.jvm.internal.s.g(classId, "classId");
                ArrayList arrayList = new ArrayList();
                b bVar = this.f40186d;
                n0 NO_SOURCE = n0.f55303a;
                kotlin.jvm.internal.s.f(NO_SOURCE, "NO_SOURCE");
                o.a w11 = bVar.w(classId, NO_SOURCE, arrayList);
                kotlin.jvm.internal.s.e(w11);
                return new C0785a(w11, this, arrayList);
            }
        }

        a(w00.c cVar, List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list, n0 n0Var) {
            this.f40175c = cVar;
            this.f40176d = list;
            this.f40177e = n0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final y10.g<?> i(u10.f fVar, Object obj) {
            y10.g<?> c11 = y10.h.f58969a.c(obj);
            return c11 == null ? y10.k.f58974b.a(kotlin.jvm.internal.s.p("Unsupported annotation argument: ", fVar)) : c11;
        }

        @Override // n10.o.a
        public void a() {
            this.f40176d.add(new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(this.f40175c.n(), this.f40173a, this.f40177e));
        }

        @Override // n10.o.a
        public o.a b(u10.f name, u10.b classId) {
            kotlin.jvm.internal.s.g(name, "name");
            kotlin.jvm.internal.s.g(classId, "classId");
            ArrayList arrayList = new ArrayList();
            b bVar = b.this;
            n0 NO_SOURCE = n0.f55303a;
            kotlin.jvm.internal.s.f(NO_SOURCE, "NO_SOURCE");
            o.a w11 = bVar.w(classId, NO_SOURCE, arrayList);
            kotlin.jvm.internal.s.e(w11);
            return new C0783a(w11, this, name, arrayList);
        }

        @Override // n10.o.a
        public void c(u10.f name, u10.b enumClassId, u10.f enumEntryName) {
            kotlin.jvm.internal.s.g(name, "name");
            kotlin.jvm.internal.s.g(enumClassId, "enumClassId");
            kotlin.jvm.internal.s.g(enumEntryName, "enumEntryName");
            this.f40173a.put(name, new y10.j(enumClassId, enumEntryName));
        }

        @Override // n10.o.a
        public o.b d(u10.f name) {
            kotlin.jvm.internal.s.g(name, "name");
            return new C0784b(name, b.this, this.f40175c);
        }

        @Override // n10.o.a
        public void e(u10.f name, y10.f value) {
            kotlin.jvm.internal.s.g(name, "name");
            kotlin.jvm.internal.s.g(value, "value");
            this.f40173a.put(name, new y10.q(value));
        }

        @Override // n10.o.a
        public void f(u10.f fVar, Object obj) {
            if (fVar != null) {
                this.f40173a.put(fVar, i(fVar, obj));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w00.x module, w00.z notFoundClasses, j20.n storageManager, m kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        kotlin.jvm.internal.s.g(module, "module");
        kotlin.jvm.internal.s.g(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.s.g(storageManager, "storageManager");
        kotlin.jvm.internal.s.g(kotlinClassFinder, "kotlinClassFinder");
        this.f40170c = module;
        this.f40171d = notFoundClasses;
        this.f40172e = new g20.e(module, notFoundClasses);
    }

    private final w00.c G(u10.b bVar) {
        return w00.s.c(this.f40170c, bVar, this.f40171d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n10.a
    /* renamed from: E */
    public y10.g<?> z(String desc, Object initializer) {
        boolean M;
        kotlin.jvm.internal.s.g(desc, "desc");
        kotlin.jvm.internal.s.g(initializer, "initializer");
        M = kotlin.text.w.M("ZBCS", desc, false, 2, null);
        if (M) {
            int intValue = ((Integer) initializer).intValue();
            int hashCode = desc.hashCode();
            if (hashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) intValue);
                }
                throw new AssertionError(desc);
            } else if (hashCode == 67) {
                if (desc.equals(Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE)) {
                    initializer = Character.valueOf((char) intValue);
                }
                throw new AssertionError(desc);
            } else if (hashCode == 83) {
                if (desc.equals("S")) {
                    initializer = Short.valueOf((short) intValue);
                }
                throw new AssertionError(desc);
            } else {
                if (hashCode == 90 && desc.equals("Z")) {
                    initializer = Boolean.valueOf(intValue != 0);
                }
                throw new AssertionError(desc);
            }
        }
        return y10.h.f58969a.c(initializer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n10.a
    /* renamed from: F */
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c B(p10.b proto, r10.c nameResolver) {
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
        return this.f40172e.a(proto, nameResolver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n10.a
    /* renamed from: H */
    public y10.g<?> D(y10.g<?> constant) {
        y10.g<?> yVar;
        kotlin.jvm.internal.s.g(constant, "constant");
        if (constant instanceof y10.d) {
            yVar = new y10.w(((y10.d) constant).b().byteValue());
        } else if (constant instanceof y10.u) {
            yVar = new y10.z(((y10.u) constant).b().shortValue());
        } else if (constant instanceof y10.m) {
            yVar = new y10.x(((y10.m) constant).b().intValue());
        } else if (!(constant instanceof y10.r)) {
            return constant;
        } else {
            yVar = new y10.y(((y10.r) constant).b().longValue());
        }
        return yVar;
    }

    @Override // n10.a
    protected o.a w(u10.b annotationClassId, n0 source, List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> result) {
        kotlin.jvm.internal.s.g(annotationClassId, "annotationClassId");
        kotlin.jvm.internal.s.g(source, "source");
        kotlin.jvm.internal.s.g(result, "result");
        return new a(G(annotationClassId), result, source);
    }
}