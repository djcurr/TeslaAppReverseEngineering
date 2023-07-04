package f2;

import f2.k;
import f2.m0;
import java.util.Map;

/* loaded from: classes.dex */
public interface b0 extends k {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: f2.b0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0501a implements a0 {

            /* renamed from: a  reason: collision with root package name */
            private final int f25554a;

            /* renamed from: b  reason: collision with root package name */
            private final int f25555b;

            /* renamed from: c  reason: collision with root package name */
            private final Map<f2.a, Integer> f25556c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f25557d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f25558e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Map<f2.a, Integer> f25559f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ b0 f25560g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ h00.l<m0.a, vz.b0> f25561h;

            /* JADX WARN: Multi-variable type inference failed */
            C0501a(int i11, int i12, Map<f2.a, Integer> map, b0 b0Var, h00.l<? super m0.a, vz.b0> lVar) {
                this.f25557d = i11;
                this.f25558e = i12;
                this.f25559f = map;
                this.f25560g = b0Var;
                this.f25561h = lVar;
                this.f25554a = i11;
                this.f25555b = i12;
                this.f25556c = map;
            }

            @Override // f2.a0
            public void b() {
                int h11;
                x2.q g11;
                m0.a.C0504a c0504a = m0.a.f25586a;
                int i11 = this.f25557d;
                x2.q layoutDirection = this.f25560g.getLayoutDirection();
                h00.l<m0.a, vz.b0> lVar = this.f25561h;
                h11 = c0504a.h();
                g11 = c0504a.g();
                m0.a.f25588c = i11;
                m0.a.f25587b = layoutDirection;
                lVar.invoke(c0504a);
                m0.a.f25588c = h11;
                m0.a.f25587b = g11;
            }

            @Override // f2.a0
            public Map<f2.a, Integer> c() {
                return this.f25556c;
            }

            @Override // f2.a0
            public int getHeight() {
                return this.f25555b;
            }

            @Override // f2.a0
            public int getWidth() {
                return this.f25554a;
            }
        }

        public static a0 a(b0 b0Var, int i11, int i12, Map<f2.a, Integer> alignmentLines, h00.l<? super m0.a, vz.b0> placementBlock) {
            kotlin.jvm.internal.s.g(b0Var, "this");
            kotlin.jvm.internal.s.g(alignmentLines, "alignmentLines");
            kotlin.jvm.internal.s.g(placementBlock, "placementBlock");
            return new C0501a(i11, i12, alignmentLines, b0Var, placementBlock);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a0 b(b0 b0Var, int i11, int i12, Map map, h00.l lVar, int i13, Object obj) {
            if (obj == null) {
                if ((i13 & 4) != 0) {
                    map = wz.s0.i();
                }
                return b0Var.I(i11, i12, map, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }

        public static int c(b0 b0Var, long j11) {
            kotlin.jvm.internal.s.g(b0Var, "this");
            return k.a.a(b0Var, j11);
        }

        public static int d(b0 b0Var, float f11) {
            kotlin.jvm.internal.s.g(b0Var, "this");
            return k.a.b(b0Var, f11);
        }

        public static float e(b0 b0Var, int i11) {
            kotlin.jvm.internal.s.g(b0Var, "this");
            return k.a.c(b0Var, i11);
        }

        public static float f(b0 b0Var, long j11) {
            kotlin.jvm.internal.s.g(b0Var, "this");
            return k.a.d(b0Var, j11);
        }

        public static float g(b0 b0Var, float f11) {
            kotlin.jvm.internal.s.g(b0Var, "this");
            return k.a.e(b0Var, f11);
        }

        public static long h(b0 b0Var, long j11) {
            kotlin.jvm.internal.s.g(b0Var, "this");
            return k.a.f(b0Var, j11);
        }
    }

    a0 I(int i11, int i12, Map<f2.a, Integer> map, h00.l<? super m0.a, vz.b0> lVar);
}