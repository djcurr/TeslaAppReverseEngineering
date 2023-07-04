package kotlinx.coroutines.flow;

import java.util.Arrays;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import v20.g1;
import v20.r0;
import vz.q;

/* loaded from: classes5.dex */
public class z<T> extends y20.a<b0> implements t<T>, y20.n<T>, y20.n {

    /* renamed from: e  reason: collision with root package name */
    private final int f35425e;

    /* renamed from: f  reason: collision with root package name */
    private final int f35426f;

    /* renamed from: g  reason: collision with root package name */
    private final kotlinx.coroutines.channels.a f35427g;

    /* renamed from: h  reason: collision with root package name */
    private Object[] f35428h;

    /* renamed from: i  reason: collision with root package name */
    private long f35429i;

    /* renamed from: j  reason: collision with root package name */
    private long f35430j;

    /* renamed from: k  reason: collision with root package name */
    private int f35431k;

    /* renamed from: l  reason: collision with root package name */
    private int f35432l;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a implements g1 {

        /* renamed from: a  reason: collision with root package name */
        public final z<?> f35433a;

        /* renamed from: b  reason: collision with root package name */
        public long f35434b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f35435c;

        /* renamed from: d  reason: collision with root package name */
        public final zz.d<vz.b0> f35436d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(z<?> zVar, long j11, Object obj, zz.d<? super vz.b0> dVar) {
            this.f35433a = zVar;
            this.f35434b = j11;
            this.f35435c = obj;
            this.f35436d = dVar;
        }

        @Override // v20.g1
        public void dispose() {
            this.f35433a.x(this);
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f35437a;

        static {
            int[] iArr = new int[kotlinx.coroutines.channels.a.values().length];
            iArr[kotlinx.coroutines.channels.a.SUSPEND.ordinal()] = 1;
            iArr[kotlinx.coroutines.channels.a.DROP_LATEST.ordinal()] = 2;
            iArr[kotlinx.coroutines.channels.a.DROP_OLDEST.ordinal()] = 3;
            f35437a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {373, 380, 383}, m = "collect$suspendImpl")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f35438a;

        /* renamed from: b  reason: collision with root package name */
        Object f35439b;

        /* renamed from: c  reason: collision with root package name */
        Object f35440c;

        /* renamed from: d  reason: collision with root package name */
        Object f35441d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f35442e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z<T> f35443f;

        /* renamed from: g  reason: collision with root package name */
        int f35444g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z<T> zVar, zz.d<? super c> dVar) {
            super(dVar);
            this.f35443f = zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35442e = obj;
            this.f35444g |= Integer.MIN_VALUE;
            return z.z(this.f35443f, null, this);
        }
    }

    public z(int i11, int i12, kotlinx.coroutines.channels.a aVar) {
        this.f35425e = i11;
        this.f35426f = i12;
        this.f35427g = aVar;
    }

    private final void A(long j11) {
        y20.c[] f11;
        if (y20.a.e(this) != 0 && (f11 = y20.a.f(this)) != null) {
            int i11 = 0;
            int length = f11.length;
            while (i11 < length) {
                y20.c cVar = f11[i11];
                i11++;
                if (cVar != null) {
                    b0 b0Var = (b0) cVar;
                    long j12 = b0Var.f35240a;
                    if (j12 >= 0 && j12 < j11) {
                        b0Var.f35240a = j11;
                    }
                }
            }
        }
        this.f35430j = j11;
    }

    private final void D() {
        Object[] objArr = this.f35428h;
        kotlin.jvm.internal.s.e(objArr);
        a0.d(objArr, J(), null);
        this.f35431k--;
        long J = J() + 1;
        if (this.f35429i < J) {
            this.f35429i = J;
        }
        if (this.f35430j < J) {
            A(J);
        }
        if (r0.a()) {
            if (!(J() == J)) {
                throw new AssertionError();
            }
        }
    }

    static /* synthetic */ Object E(z zVar, Object obj, zz.d dVar) {
        Object d11;
        if (zVar.b(obj)) {
            return vz.b0.f54756a;
        }
        Object F = zVar.F(obj, dVar);
        d11 = a00.d.d();
        return F == d11 ? F : vz.b0.f54756a;
    }

    private final Object F(T t11, zz.d<? super vz.b0> dVar) {
        zz.d c11;
        zz.d[] dVarArr;
        a aVar;
        Object d11;
        Object d12;
        c11 = a00.c.c(dVar);
        v20.p pVar = new v20.p(c11, 1);
        pVar.y();
        zz.d[] dVarArr2 = y20.b.f58995a;
        synchronized (this) {
            if (Q(t11)) {
                q.a aVar2 = vz.q.f54772b;
                pVar.resumeWith(vz.q.b(vz.b0.f54756a));
                dVarArr = H(dVarArr2);
                aVar = null;
            } else {
                a aVar3 = new a(this, O() + J(), t11, pVar);
                G(aVar3);
                this.f35432l++;
                if (this.f35426f == 0) {
                    dVarArr2 = H(dVarArr2);
                }
                dVarArr = dVarArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            v20.r.a(pVar, aVar);
        }
        int i11 = 0;
        int length = dVarArr.length;
        while (i11 < length) {
            zz.d dVar2 = dVarArr[i11];
            i11++;
            if (dVar2 != null) {
                q.a aVar4 = vz.q.f54772b;
                dVar2.resumeWith(vz.q.b(vz.b0.f54756a));
            }
        }
        Object s11 = pVar.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        d12 = a00.d.d();
        return s11 == d12 ? s11 : vz.b0.f54756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(Object obj) {
        int O = O();
        Object[] objArr = this.f35428h;
        if (objArr == null) {
            objArr = P(null, 0, 2);
        } else if (O >= objArr.length) {
            objArr = P(objArr, O, objArr.length * 2);
        }
        a0.d(objArr, J() + O, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final Continuation<Unit>[] H(Continuation<Unit>[] continuationArr) {
        y20.c[] f11;
        b0 b0Var;
        zz.d<? super vz.b0> dVar;
        int length = continuationArr.length;
        if (y20.a.e(this) != 0 && (f11 = y20.a.f(this)) != null) {
            int i11 = 0;
            int length2 = f11.length;
            while (i11 < length2) {
                y20.c cVar = f11[i11];
                i11++;
                if (cVar != null && (dVar = (b0Var = (b0) cVar).f35241b) != null && S(b0Var) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
                        continuationArr = copyOf;
                    }
                    ((zz.d[]) continuationArr)[length] = dVar;
                    b0Var.f35241b = null;
                    length++;
                }
            }
        }
        return (zz.d[]) continuationArr;
    }

    private final long I() {
        return J() + this.f35431k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long J() {
        return Math.min(this.f35430j, this.f35429i);
    }

    private final Object L(long j11) {
        Object[] objArr = this.f35428h;
        kotlin.jvm.internal.s.e(objArr);
        Object c11 = a0.c(objArr, j11);
        return c11 instanceof a ? ((a) c11).f35435c : c11;
    }

    private final long M() {
        return J() + this.f35431k + this.f35432l;
    }

    private final int N() {
        return (int) ((J() + this.f35431k) - this.f35429i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int O() {
        return this.f35431k + this.f35432l;
    }

    private final Object[] P(Object[] objArr, int i11, int i12) {
        if (i12 > 0) {
            Object[] objArr2 = new Object[i12];
            this.f35428h = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long J = J();
            for (int i13 = 0; i13 < i11; i13++) {
                long j11 = i13 + J;
                a0.d(objArr2, j11, a0.c(objArr, j11));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Q(T t11) {
        if (k() == 0) {
            return R(t11);
        }
        if (this.f35431k >= this.f35426f && this.f35430j <= this.f35429i) {
            int i11 = b.f35437a[this.f35427g.ordinal()];
            if (i11 == 1) {
                return false;
            }
            if (i11 == 2) {
                return true;
            }
        }
        G(t11);
        int i12 = this.f35431k + 1;
        this.f35431k = i12;
        if (i12 > this.f35426f) {
            D();
        }
        if (N() > this.f35425e) {
            U(this.f35429i + 1, this.f35430j, I(), M());
        }
        return true;
    }

    private final boolean R(T t11) {
        if (r0.a()) {
            if (!(k() == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f35425e == 0) {
            return true;
        }
        G(t11);
        int i11 = this.f35431k + 1;
        this.f35431k = i11;
        if (i11 > this.f35425e) {
            D();
        }
        this.f35430j = J() + this.f35431k;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long S(b0 b0Var) {
        long j11 = b0Var.f35240a;
        if (j11 < I()) {
            return j11;
        }
        if (this.f35426f <= 0 && j11 <= J() && this.f35432l != 0) {
            return j11;
        }
        return -1L;
    }

    private final Object T(b0 b0Var) {
        Object obj;
        zz.d[] dVarArr = y20.b.f58995a;
        synchronized (this) {
            long S = S(b0Var);
            if (S < 0) {
                obj = a0.f35234a;
            } else {
                long j11 = b0Var.f35240a;
                Object L = L(S);
                b0Var.f35240a = S + 1;
                dVarArr = V(j11);
                obj = L;
            }
        }
        int i11 = 0;
        int length = dVarArr.length;
        while (i11 < length) {
            zz.d dVar = dVarArr[i11];
            i11++;
            if (dVar != null) {
                q.a aVar = vz.q.f54772b;
                dVar.resumeWith(vz.q.b(vz.b0.f54756a));
            }
        }
        return obj;
    }

    private final void U(long j11, long j12, long j13, long j14) {
        long min = Math.min(j12, j11);
        if (r0.a()) {
            if (!(min >= J())) {
                throw new AssertionError();
            }
        }
        for (long J = J(); J < min; J = 1 + J) {
            Object[] objArr = this.f35428h;
            kotlin.jvm.internal.s.e(objArr);
            a0.d(objArr, J, null);
        }
        this.f35429i = j11;
        this.f35430j = j12;
        this.f35431k = (int) (j13 - min);
        this.f35432l = (int) (j14 - j13);
        if (r0.a()) {
            if (!(this.f35431k >= 0)) {
                throw new AssertionError();
            }
        }
        if (r0.a()) {
            if (!(this.f35432l >= 0)) {
                throw new AssertionError();
            }
        }
        if (r0.a()) {
            if (!(this.f35429i <= J() + ((long) this.f35431k))) {
                throw new AssertionError();
            }
        }
    }

    private final Object w(b0 b0Var, zz.d<? super vz.b0> dVar) {
        zz.d c11;
        vz.b0 b0Var2;
        Object d11;
        Object d12;
        c11 = a00.c.c(dVar);
        v20.p pVar = new v20.p(c11, 1);
        pVar.y();
        synchronized (this) {
            if (S(b0Var) < 0) {
                b0Var.f35241b = pVar;
                b0Var.f35241b = pVar;
            } else {
                q.a aVar = vz.q.f54772b;
                pVar.resumeWith(vz.q.b(vz.b0.f54756a));
            }
            b0Var2 = vz.b0.f54756a;
        }
        Object s11 = pVar.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        d12 = a00.d.d();
        return s11 == d12 ? s11 : b0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(a aVar) {
        synchronized (this) {
            if (aVar.f35434b < J()) {
                return;
            }
            Object[] objArr = this.f35428h;
            kotlin.jvm.internal.s.e(objArr);
            if (a0.c(objArr, aVar.f35434b) != aVar) {
                return;
            }
            a0.d(objArr, aVar.f35434b, a0.f35234a);
            y();
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    private final void y() {
        if (this.f35426f != 0 || this.f35432l > 1) {
            Object[] objArr = this.f35428h;
            kotlin.jvm.internal.s.e(objArr);
            while (this.f35432l > 0 && a0.c(objArr, (J() + O()) - 1) == a0.f35234a) {
                this.f35432l--;
                a0.d(objArr, J() + O(), null);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:42|43))(1:44)|12|13|14|15|(3:16|(4:26|(1:28)(1:34)|29|(2:31|32)(1:33))(3:18|19|(2:21|22)(1:24))|25))(4:45|46|47|48)|38|39)(5:54|55|56|(2:58|(1:60))|62)|49|50|15|(3:16|(0)(0)|25)))|65|6|(0)(0)|49|50|15|(3:16|(0)(0)|25)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object z(kotlinx.coroutines.flow.z r8, kotlinx.coroutines.flow.f r9, zz.d r10) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.z.z(kotlinx.coroutines.flow.z, kotlinx.coroutines.flow.f, zz.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y20.a
    /* renamed from: B */
    public b0 h() {
        return new b0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y20.a
    /* renamed from: C */
    public b0[] i(int i11) {
        return new b0[i11];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T K() {
        Object[] objArr = this.f35428h;
        kotlin.jvm.internal.s.e(objArr);
        return (T) a0.c(objArr, (this.f35429i + N()) - 1);
    }

    public final Continuation<Unit>[] V(long j11) {
        int i11;
        long j12;
        y20.c[] f11;
        if (r0.a()) {
            if (!(j11 >= this.f35430j)) {
                throw new AssertionError();
            }
        }
        if (j11 > this.f35430j) {
            return y20.b.f58995a;
        }
        long J = J();
        long j13 = this.f35431k + J;
        long j14 = 1;
        if (this.f35426f == 0 && this.f35432l > 0) {
            j13++;
        }
        if (y20.a.e(this) != 0 && (f11 = y20.a.f(this)) != null) {
            int length = f11.length;
            int i12 = 0;
            while (i12 < length) {
                y20.c cVar = f11[i12];
                i12++;
                if (cVar != null) {
                    long j15 = ((b0) cVar).f35240a;
                    if (j15 >= 0 && j15 < j13) {
                        j13 = j15;
                    }
                }
            }
        }
        if (r0.a()) {
            if (!(j13 >= this.f35430j)) {
                throw new AssertionError();
            }
        }
        if (j13 <= this.f35430j) {
            return y20.b.f58995a;
        }
        long I = I();
        if (k() > 0) {
            i11 = Math.min(this.f35432l, this.f35426f - ((int) (I - j13)));
        } else {
            i11 = this.f35432l;
        }
        zz.d[] dVarArr = y20.b.f58995a;
        long j16 = this.f35432l + I;
        if (i11 > 0) {
            dVarArr = new zz.d[i11];
            Object[] objArr = this.f35428h;
            kotlin.jvm.internal.s.e(objArr);
            long j17 = I;
            int i13 = 0;
            while (true) {
                if (I >= j16) {
                    j12 = j13;
                    break;
                }
                long j18 = I + j14;
                Object c11 = a0.c(objArr, I);
                kotlinx.coroutines.internal.f0 f0Var = a0.f35234a;
                if (c11 != f0Var) {
                    j12 = j13;
                    Objects.requireNonNull(c11, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) c11;
                    int i14 = i13 + 1;
                    dVarArr[i13] = aVar.f35436d;
                    a0.d(objArr, I, f0Var);
                    a0.d(objArr, j17, aVar.f35435c);
                    j17++;
                    if (i14 >= i11) {
                        break;
                    }
                    i13 = i14;
                    I = j18;
                    j13 = j12;
                } else {
                    I = j18;
                }
                j14 = 1;
            }
            I = j17;
        } else {
            j12 = j13;
        }
        int i15 = (int) (I - J);
        long j19 = k() == 0 ? I : j12;
        long max = Math.max(this.f35429i, I - Math.min(this.f35425e, i15));
        if (this.f35426f == 0 && max < j16) {
            Object[] objArr2 = this.f35428h;
            kotlin.jvm.internal.s.e(objArr2);
            if (kotlin.jvm.internal.s.c(a0.c(objArr2, max), a0.f35234a)) {
                I++;
                max++;
            }
        }
        U(max, j19, I, j16);
        y();
        return true ^ (dVarArr.length == 0) ? H(dVarArr) : dVarArr;
    }

    public final long W() {
        long j11 = this.f35429i;
        if (j11 < this.f35430j) {
            this.f35430j = j11;
        }
        return j11;
    }

    @Override // y20.n
    public e<T> a(zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        return a0.e(this, gVar, i11, aVar);
    }

    @Override // kotlinx.coroutines.flow.t
    public boolean b(T t11) {
        int i11;
        boolean z11;
        Continuation<Unit>[] continuationArr = y20.b.f58995a;
        synchronized (this) {
            i11 = 0;
            if (Q(t11)) {
                continuationArr = H(continuationArr);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        int length = continuationArr.length;
        while (i11 < length) {
            Continuation<Unit> continuation = continuationArr[i11];
            i11++;
            if (continuation != null) {
                q.a aVar = vz.q.f54772b;
                continuation.resumeWith(vz.q.b(vz.b0.f54756a));
            }
        }
        return z11;
    }

    @Override // kotlinx.coroutines.flow.y, kotlinx.coroutines.flow.e
    public Object collect(f<? super T> fVar, zz.d<?> dVar) {
        return z(this, fVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.t
    public void d() {
        synchronized (this) {
            U(I(), this.f35430j, I(), M());
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    @Override // kotlinx.coroutines.flow.t, kotlinx.coroutines.flow.f
    public Object emit(T t11, zz.d<? super vz.b0> dVar) {
        return E(this, t11, dVar);
    }
}