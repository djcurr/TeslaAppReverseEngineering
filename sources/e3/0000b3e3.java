package t00;

import java.util.List;
import k20.d0;
import k20.e0;
import k20.p0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.reflect.KProperty;
import t00.k;
import w00.s0;
import w00.x;
import w00.z;
import wz.u;
import wz.v;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final z f51301a;

    /* renamed from: b  reason: collision with root package name */
    private final vz.k f51302b;

    /* renamed from: c  reason: collision with root package name */
    private final a f51303c;

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f51300e = {m0.j(new f0(m0.b(j.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), m0.j(new f0(m0.b(j.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), m0.j(new f0(m0.b(j.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), m0.j(new f0(m0.b(j.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), m0.j(new f0(m0.b(j.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), m0.j(new f0(m0.b(j.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), m0.j(new f0(m0.b(j.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), m0.j(new f0(m0.b(j.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* renamed from: d  reason: collision with root package name */
    public static final b f51299d = new b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f51304a;

        public a(int i11) {
            this.f51304a = i11;
        }

        public final w00.c a(j types, n00.m<?> property) {
            s.g(types, "types");
            s.g(property, "property");
            return types.b(q20.a.a(property.getName()), this.f51304a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d0 a(x module) {
            List d11;
            s.g(module, "module");
            w00.c a11 = w00.s.a(module, k.a.S);
            if (a11 == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b11 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
            List<s0> parameters = a11.i().getParameters();
            s.f(parameters, "kPropertyClass.typeConstructor.parameters");
            Object C0 = u.C0(parameters);
            s.f(C0, "kPropertyClass.typeConstructor.parameters.single()");
            d11 = v.d(new p0((s0) C0));
            return e0.g(b11, a11, d11);
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.a<d20.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f51305a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(x xVar) {
            super(0);
            this.f51305a = xVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final d20.h invoke() {
            return this.f51305a.R(k.f51314i).m();
        }
    }

    public j(x module, z notFoundClasses) {
        vz.k b11;
        s.g(module, "module");
        s.g(notFoundClasses, "notFoundClasses");
        this.f51301a = notFoundClasses;
        b11 = vz.m.b(kotlin.b.PUBLICATION, new c(module));
        this.f51302b = b11;
        this.f51303c = new a(1);
        new a(1);
        new a(1);
        new a(2);
        new a(3);
        new a(1);
        new a(2);
        new a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w00.c b(String str, int i11) {
        List<Integer> d11;
        u10.f f11 = u10.f.f(str);
        s.f(f11, "identifier(className)");
        w00.e e11 = d().e(f11, d10.d.FROM_REFLECTION);
        w00.c cVar = e11 instanceof w00.c ? (w00.c) e11 : null;
        if (cVar == null) {
            z zVar = this.f51301a;
            u10.b bVar = new u10.b(k.f51314i, f11);
            d11 = v.d(Integer.valueOf(i11));
            return zVar.d(bVar, d11);
        }
        return cVar;
    }

    private final d20.h d() {
        return (d20.h) this.f51302b.getValue();
    }

    public final w00.c c() {
        return this.f51303c.a(this, f51300e[0]);
    }
}