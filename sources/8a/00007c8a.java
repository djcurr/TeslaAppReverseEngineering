package k0;

import androidx.compose.ui.platform.l0;
import c1.a2;
import c1.g1;
import c1.v1;
import h2.a;
import l0.a1;
import l0.b1;
import l0.c0;
import l0.d1;
import l0.f1;
import o1.f;
import t1.f0;
import t1.g0;
import vz.b0;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ T f34102a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f34103b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c0<Float> f34104c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.q<T, c1.i, Integer, b0> f34105d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f34106e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34107f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(T t11, o1.f fVar, c0<Float> c0Var, h00.q<? super T, ? super c1.i, ? super Integer, b0> qVar, int i11, int i12) {
            super(2);
            this.f34102a = t11;
            this.f34103b = fVar;
            this.f34104c = c0Var;
            this.f34105d = qVar;
            this.f34106e = i11;
            this.f34107f = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            h.a(this.f34102a, this.f34103b, this.f34104c, this.f34105d, iVar, this.f34106e | 1, this.f34107f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> extends kotlin.jvm.internal.u implements h00.l<T, T> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34108a = new b();

        static {
        }

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public final T mo12invoke(T t11) {
            return t11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class c<T> extends kotlin.jvm.internal.u implements h00.l<T, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a1<T> f34109a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a1<T> a1Var) {
            super(1);
            this.f34109a = a1Var;
        }

        public final Boolean a(T t11) {
            return Boolean.valueOf(!kotlin.jvm.internal.s.c(t11, this.f34109a.m()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean mo12invoke(Object obj) {
            return a(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a1<T> f34110a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34111b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c0<Float> f34112c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ T f34113d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.q<T, c1.i, Integer, b0> f34114e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<g0, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v1<Float> f34115a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v1<Float> v1Var) {
                super(1);
                this.f34115a = v1Var;
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ b0 mo12invoke(g0 g0Var) {
                invoke2(g0Var);
                return b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(g0 graphicsLayer) {
                kotlin.jvm.internal.s.g(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.b(d.b(this.f34115a));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [T] */
        /* loaded from: classes.dex */
        public static final class b<T> extends kotlin.jvm.internal.u implements h00.q<a1.b<T>, c1.i, Integer, c0<Float>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c0<Float> f34116a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c0<Float> c0Var) {
                super(3);
                this.f34116a = c0Var;
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ c0<Float> invoke(Object obj, c1.i iVar, Integer num) {
                return invoke((a1.b) obj, iVar, num.intValue());
            }

            public final c0<Float> invoke(a1.b<T> animateFloat, c1.i iVar, int i11) {
                kotlin.jvm.internal.s.g(animateFloat, "$this$animateFloat");
                iVar.x(2090120679);
                c0<Float> c0Var = this.f34116a;
                iVar.N();
                return c0Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(a1<T> a1Var, int i11, c0<Float> c0Var, T t11, h00.q<? super T, ? super c1.i, ? super Integer, b0> qVar) {
            super(2);
            this.f34110a = a1Var;
            this.f34111b = i11;
            this.f34112c = c0Var;
            this.f34113d = t11;
            this.f34114e = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float b(v1<Float> v1Var) {
            return v1Var.getValue().floatValue();
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            a1<T> a1Var = this.f34110a;
            b bVar = new b(this.f34112c);
            T t11 = this.f34113d;
            int i12 = this.f34111b & 14;
            iVar.x(1399891485);
            d1<Float, l0.m> b11 = f1.b(kotlin.jvm.internal.l.f34915a);
            int i13 = i12 & 14;
            int i14 = i12 << 3;
            int i15 = (i14 & 57344) | i13 | (i14 & 896) | (i14 & 7168);
            iVar.x(1847725064);
            Object g11 = a1Var.g();
            iVar.x(2090120715);
            float f11 = kotlin.jvm.internal.s.c(g11, t11) ? 1.0f : 0.0f;
            iVar.N();
            Float valueOf = Float.valueOf(f11);
            Object m11 = a1Var.m();
            iVar.x(2090120715);
            float f12 = kotlin.jvm.internal.s.c(m11, t11) ? 1.0f : 0.0f;
            iVar.N();
            v1 c11 = b1.c(a1Var, valueOf, Float.valueOf(f12), bVar.invoke((b) a1Var.k(), (a1.b) iVar, (c1.i) Integer.valueOf((i15 >> 3) & 112)), b11, "FloatAnimation", iVar, (i15 & 14) | (57344 & (i15 << 9)) | ((i15 << 6) & 458752));
            iVar.N();
            iVar.N();
            f.a aVar = o1.f.f42062f1;
            iVar.x(-3686930);
            boolean O = iVar.O(c11);
            Object y11 = iVar.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new a(c11);
                iVar.p(y11);
            }
            iVar.N();
            o1.f a11 = f0.a(aVar, (h00.l) y11);
            h00.q<T, c1.i, Integer, b0> qVar = this.f34114e;
            T t12 = this.f34113d;
            int i16 = this.f34111b;
            iVar.x(-1990474327);
            f2.z i17 = p0.c.i(o1.a.f42039a.k(), false, iVar, 0);
            iVar.x(1376089335);
            x2.d dVar = (x2.d) iVar.A(l0.d());
            x2.q qVar2 = (x2.q) iVar.A(l0.i());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            h00.q<g1<h2.a>, c1.i, Integer, b0> b12 = f2.u.b(a11);
            if (!(iVar.k() instanceof c1.e)) {
                c1.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.s(a12);
            } else {
                iVar.o();
            }
            iVar.E();
            c1.i a13 = a2.a(iVar);
            a2.c(a13, i17, c0551a.d());
            a2.c(a13, dVar, c0551a.b());
            a2.c(a13, qVar2, c0551a.c());
            iVar.c();
            b12.invoke(g1.a(g1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-1253629305);
            p0.d dVar2 = p0.d.f45270a;
            iVar.x(2090120846);
            qVar.invoke(t12, iVar, Integer.valueOf((i16 >> 9) & 112));
            iVar.N();
            iVar.N();
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a1<T> f34117a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f34118b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c0<Float> f34119c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.l<T, Object> f34120d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.q<T, c1.i, Integer, b0> f34121e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34122f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f34123g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(a1<T> a1Var, o1.f fVar, c0<Float> c0Var, h00.l<? super T, ? extends Object> lVar, h00.q<? super T, ? super c1.i, ? super Integer, b0> qVar, int i11, int i12) {
            super(2);
            this.f34117a = a1Var;
            this.f34118b = fVar;
            this.f34119c = c0Var;
            this.f34120d = lVar;
            this.f34121e = qVar;
            this.f34122f = i11;
            this.f34123g = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            h.b(this.f34117a, this.f34118b, this.f34119c, this.f34120d, this.f34121e, iVar, this.f34122f | 1, this.f34123g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void a(T r15, o1.f r16, l0.c0<java.lang.Float> r17, h00.q<? super T, ? super c1.i, ? super java.lang.Integer, vz.b0> r18, c1.i r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.h.a(java.lang.Object, o1.f, l0.c0, h00.q, c1.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void b(l0.a1<T> r21, o1.f r22, l0.c0<java.lang.Float> r23, h00.l<? super T, ? extends java.lang.Object> r24, h00.q<? super T, ? super c1.i, ? super java.lang.Integer, vz.b0> r25, c1.i r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.h.b(l0.a1, o1.f, l0.c0, h00.l, h00.q, c1.i, int, int):void");
    }
}