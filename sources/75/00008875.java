package n0;

import c1.n1;
import c1.v1;

/* loaded from: classes.dex */
public final class g0 {

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<Float, Float> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v1<h00.l<Float, Float>> f39774a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(v1<? extends h00.l<? super Float, Float>> v1Var) {
            super(1);
            this.f39774a = v1Var;
        }

        public final Float a(float f11) {
            return this.f39774a.getValue().invoke(Float.valueOf(f11));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Float invoke(Float f11) {
            return a(f11.floatValue());
        }
    }

    public static final f0 a(h00.l<? super Float, Float> consumeScrollDelta) {
        kotlin.jvm.internal.s.g(consumeScrollDelta, "consumeScrollDelta");
        return new h(consumeScrollDelta);
    }

    public static final f0 b(h00.l<? super Float, Float> consumeScrollDelta, c1.i iVar, int i11) {
        kotlin.jvm.internal.s.g(consumeScrollDelta, "consumeScrollDelta");
        iVar.x(-624382454);
        v1 m11 = n1.m(consumeScrollDelta, iVar, i11 & 14);
        iVar.x(-3687241);
        Object y11 = iVar.y();
        if (y11 == c1.i.f8486a.a()) {
            y11 = a(new a(m11));
            iVar.p(y11);
        }
        iVar.N();
        f0 f0Var = (f0) y11;
        iVar.N();
        return f0Var;
    }
}