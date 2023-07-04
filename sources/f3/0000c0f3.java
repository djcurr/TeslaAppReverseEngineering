package y0;

import c1.v1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s implements i {

    /* renamed from: a  reason: collision with root package name */
    private final long f58632a;

    /* renamed from: b  reason: collision with root package name */
    private final long f58633b;

    /* renamed from: c  reason: collision with root package name */
    private final long f58634c;

    /* renamed from: d  reason: collision with root package name */
    private final long f58635d;

    /* renamed from: e  reason: collision with root package name */
    private final long f58636e;

    /* renamed from: f  reason: collision with root package name */
    private final long f58637f;

    /* renamed from: g  reason: collision with root package name */
    private final long f58638g;

    /* renamed from: h  reason: collision with root package name */
    private final long f58639h;

    /* renamed from: i  reason: collision with root package name */
    private final long f58640i;

    /* renamed from: j  reason: collision with root package name */
    private final long f58641j;

    /* renamed from: k  reason: collision with root package name */
    private final long f58642k;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f58643a;

        static {
            int[] iArr = new int[m2.a.values().length];
            iArr[m2.a.On.ordinal()] = 1;
            iArr[m2.a.Indeterminate.ordinal()] = 2;
            iArr[m2.a.Off.ordinal()] = 3;
            f58643a = iArr;
        }
    }

    private s(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22) {
        this.f58632a = j11;
        this.f58633b = j12;
        this.f58634c = j13;
        this.f58635d = j14;
        this.f58636e = j15;
        this.f58637f = j16;
        this.f58638g = j17;
        this.f58639h = j18;
        this.f58640i = j19;
        this.f58641j = j21;
        this.f58642k = j22;
    }

    public /* synthetic */ s(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22);
    }

    @Override // y0.i
    public v1<t1.a0> a(boolean z11, m2.a state, c1.i iVar, int i11) {
        long j11;
        v1<t1.a0> m11;
        kotlin.jvm.internal.s.g(state, "state");
        iVar.x(-796406023);
        if (z11) {
            int i12 = a.f58643a[state.ordinal()];
            if (i12 == 1 || i12 == 2) {
                j11 = this.f58639h;
            } else if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                j11 = this.f58640i;
            }
        } else {
            int i13 = a.f58643a[state.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    j11 = this.f58642k;
                } else if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            j11 = this.f58641j;
        }
        long j12 = j11;
        if (z11) {
            iVar.x(-796405338);
            m11 = k0.u.a(j12, l0.j.k(state == m2.a.Off ? 100 : 50, 0, null, 6, null), null, iVar, 0, 4);
            iVar.N();
        } else {
            iVar.x(-796405152);
            m11 = c1.n1.m(t1.a0.h(j12), iVar, 0);
            iVar.N();
        }
        iVar.N();
        return m11;
    }

    @Override // y0.i
    public v1<t1.a0> b(boolean z11, m2.a state, c1.i iVar, int i11) {
        long j11;
        v1<t1.a0> m11;
        kotlin.jvm.internal.s.g(state, "state");
        iVar.x(-2010644300);
        if (z11) {
            int i12 = a.f58643a[state.ordinal()];
            if (i12 == 1 || i12 == 2) {
                j11 = this.f58634c;
            } else if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                j11 = this.f58635d;
            }
        } else {
            int i13 = a.f58643a[state.ordinal()];
            if (i13 == 1) {
                j11 = this.f58636e;
            } else if (i13 == 2) {
                j11 = this.f58638g;
            } else if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                j11 = this.f58637f;
            }
        }
        long j12 = j11;
        if (z11) {
            iVar.x(-2010643579);
            m11 = k0.u.a(j12, l0.j.k(state == m2.a.Off ? 100 : 50, 0, null, 6, null), null, iVar, 0, 4);
            iVar.N();
        } else {
            iVar.x(-2010643393);
            m11 = c1.n1.m(t1.a0.h(j12), iVar, 0);
            iVar.N();
        }
        iVar.N();
        return m11;
    }

    @Override // y0.i
    public v1<t1.a0> c(m2.a state, c1.i iVar, int i11) {
        long j11;
        kotlin.jvm.internal.s.g(state, "state");
        iVar.x(-1523203684);
        m2.a aVar = m2.a.Off;
        if (state == aVar) {
            j11 = this.f58633b;
        } else {
            j11 = this.f58632a;
        }
        v1<t1.a0> a11 = k0.u.a(j11, l0.j.k(state == aVar ? 100 : 50, 0, null, 6, null), null, iVar, 0, 4);
        iVar.N();
        return a11;
    }
}