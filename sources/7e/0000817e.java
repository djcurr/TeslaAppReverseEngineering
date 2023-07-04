package l0;

import c1.v1;
import l0.j0;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ T f36189a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j0.a<T, V> f36190b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f36191c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i0<T> f36192d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(T t11, j0.a<T, V> aVar, T t12, i0<T> i0Var) {
            super(0);
            this.f36189a = t11;
            this.f36190b = aVar;
            this.f36191c = t12;
            this.f36192d = i0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (kotlin.jvm.internal.s.c(this.f36189a, this.f36190b.b()) && kotlin.jvm.internal.s.c(this.f36191c, this.f36190b.c())) {
                return;
            }
            this.f36190b.i(this.f36189a, this.f36191c, this.f36192d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<c1.z, c1.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j0 f36193a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j0.a<T, V> f36194b;

        /* loaded from: classes.dex */
        public static final class a implements c1.y {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j0 f36195a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ j0.a f36196b;

            public a(j0 j0Var, j0.a aVar) {
                this.f36195a = j0Var;
                this.f36196b = aVar;
            }

            @Override // c1.y
            public void dispose() {
                this.f36195a.g(this.f36196b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j0 j0Var, j0.a<T, V> aVar) {
            super(1);
            this.f36193a = j0Var;
            this.f36194b = aVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ c1.y invoke(c1.z zVar) {
            return invoke2(zVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final c1.y invoke2(c1.z DisposableEffect) {
            kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
            this.f36193a.c(this.f36194b);
            return new a(this.f36193a, this.f36194b);
        }
    }

    public static final v1<Float> a(j0 j0Var, float f11, float f12, i0<Float> animationSpec, c1.i iVar, int i11) {
        kotlin.jvm.internal.s.g(j0Var, "<this>");
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        iVar.x(1399864148);
        v1<Float> b11 = b(j0Var, Float.valueOf(f11), Float.valueOf(f12), f1.b(kotlin.jvm.internal.l.f34915a), animationSpec, iVar, (i11 & 112) | 8 | (i11 & 896) | ((i11 << 3) & 57344));
        iVar.N();
        return b11;
    }

    public static final <T, V extends p> v1<T> b(j0 j0Var, T t11, T t12, d1<T, V> typeConverter, i0<T> animationSpec, c1.i iVar, int i11) {
        kotlin.jvm.internal.s.g(j0Var, "<this>");
        kotlin.jvm.internal.s.g(typeConverter, "typeConverter");
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        iVar.x(1847699412);
        iVar.x(-3687241);
        Object y11 = iVar.y();
        if (y11 == c1.i.f8486a.a()) {
            y11 = new j0.a(j0Var, t11, t12, typeConverter, animationSpec);
            iVar.p(y11);
        }
        iVar.N();
        j0.a aVar = (j0.a) y11;
        c1.b0.h(new a(t11, aVar, t12, animationSpec), iVar, 0);
        c1.b0.a(aVar, new b(j0Var, aVar), iVar, 6);
        iVar.N();
        return aVar;
    }

    public static final j0 c(c1.i iVar, int i11) {
        iVar.x(353815743);
        iVar.x(-3687241);
        Object y11 = iVar.y();
        if (y11 == c1.i.f8486a.a()) {
            y11 = new j0();
            iVar.p(y11);
        }
        iVar.N();
        j0 j0Var = (j0) y11;
        j0Var.h(iVar, 8);
        iVar.N();
        return j0Var;
    }
}