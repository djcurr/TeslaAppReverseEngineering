package x20;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.f0;
import v20.r0;
import vz.b0;

/* loaded from: classes5.dex */
public class d<E> extends x20.a<E> {

    /* renamed from: d  reason: collision with root package name */
    private final int f56999d;

    /* renamed from: e  reason: collision with root package name */
    private final kotlinx.coroutines.channels.a f57000e;

    /* renamed from: f  reason: collision with root package name */
    private final ReentrantLock f57001f;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f57002g;

    /* renamed from: h  reason: collision with root package name */
    private int f57003h;
    private volatile /* synthetic */ int size;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f57004a;

        static {
            int[] iArr = new int[kotlinx.coroutines.channels.a.values().length];
            iArr[kotlinx.coroutines.channels.a.SUSPEND.ordinal()] = 1;
            iArr[kotlinx.coroutines.channels.a.DROP_LATEST.ordinal()] = 2;
            iArr[kotlinx.coroutines.channels.a.DROP_OLDEST.ordinal()] = 3;
            f57004a = iArr;
        }
    }

    public d(int i11, kotlinx.coroutines.channels.a aVar, h00.l<? super E, b0> lVar) {
        super(lVar);
        this.f56999d = i11;
        this.f57000e = aVar;
        if (i11 >= 1) {
            this.f57001f = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i11, 8)];
            wz.o.v(objArr, b.f56988a, 0, 0, 6, null);
            this.f57002g = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i11 + " was specified").toString());
    }

    private final void c0(int i11, E e11) {
        if (i11 < this.f56999d) {
            d0(i11);
            Object[] objArr = this.f57002g;
            objArr[(this.f57003h + i11) % objArr.length] = e11;
            return;
        }
        if (r0.a()) {
            if (!(this.f57000e == kotlinx.coroutines.channels.a.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.f57002g;
        int i12 = this.f57003h;
        objArr2[i12 % objArr2.length] = null;
        objArr2[(i11 + i12) % objArr2.length] = e11;
        this.f57003h = (i12 + 1) % objArr2.length;
    }

    private final void d0(int i11) {
        Object[] objArr = this.f57002g;
        if (i11 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f56999d);
            Object[] objArr2 = new Object[min];
            for (int i12 = 0; i12 < i11; i12++) {
                Object[] objArr3 = this.f57002g;
                objArr2[i12] = objArr3[(this.f57003h + i12) % objArr3.length];
            }
            wz.o.t(objArr2, b.f56988a, i11, min);
            this.f57002g = objArr2;
            this.f57003h = 0;
        }
    }

    private final f0 e0(int i11) {
        if (i11 < this.f56999d) {
            this.size = i11 + 1;
            return null;
        }
        int i12 = a.f57004a[this.f57000e.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            return b.f56989b;
        }
        return b.f56990c;
    }

    @Override // x20.c
    protected Object B(E e11) {
        u<E> F;
        f0 q11;
        ReentrantLock reentrantLock = this.f57001f;
        reentrantLock.lock();
        try {
            int i11 = this.size;
            m<?> p11 = p();
            if (p11 == null) {
                f0 e02 = e0(i11);
                if (e02 == null) {
                    if (i11 == 0) {
                        do {
                            F = F();
                            if (F != null) {
                                if (F instanceof m) {
                                    this.size = i11;
                                    return F;
                                }
                                q11 = F.q(e11, null);
                            }
                        } while (q11 == null);
                        if (r0.a()) {
                            if (!(q11 == v20.q.f53988a)) {
                                throw new AssertionError();
                            }
                        }
                        this.size = i11;
                        b0 b0Var = b0.f54756a;
                        reentrantLock.unlock();
                        F.i(e11);
                        return F.b();
                    }
                    c0(i11, e11);
                    return b.f56989b;
                }
                return e02;
            }
            return p11;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // x20.a
    protected boolean N(s<? super E> sVar) {
        ReentrantLock reentrantLock = this.f57001f;
        reentrantLock.lock();
        try {
            return super.N(sVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // x20.a
    protected final boolean P() {
        return false;
    }

    @Override // x20.a
    protected final boolean Q() {
        return this.size == 0;
    }

    @Override // x20.a
    protected void S(boolean z11) {
        h00.l<E, b0> lVar = this.f56995a;
        ReentrantLock reentrantLock = this.f57001f;
        reentrantLock.lock();
        try {
            int i11 = this.size;
            UndeliveredElementException undeliveredElementException = null;
            int i12 = 0;
            while (i12 < i11) {
                i12++;
                Object obj = this.f57002g[this.f57003h];
                if (lVar != null && obj != b.f56988a) {
                    undeliveredElementException = kotlinx.coroutines.internal.z.c(lVar, obj, undeliveredElementException);
                }
                Object[] objArr = this.f57002g;
                int i13 = this.f57003h;
                objArr[i13] = b.f56988a;
                this.f57003h = (i13 + 1) % objArr.length;
            }
            this.size = 0;
            b0 b0Var = b0.f54756a;
            reentrantLock.unlock();
            super.S(z11);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // x20.a
    protected Object W() {
        ReentrantLock reentrantLock = this.f57001f;
        reentrantLock.lock();
        try {
            int i11 = this.size;
            if (i11 == 0) {
                Object p11 = p();
                if (p11 == null) {
                    p11 = b.f56991d;
                }
                return p11;
            }
            Object[] objArr = this.f57002g;
            int i12 = this.f57003h;
            Object obj = objArr[i12];
            w wVar = null;
            objArr[i12] = null;
            this.size = i11 - 1;
            Object obj2 = b.f56991d;
            if (i11 == this.f56999d) {
                w wVar2 = null;
                while (true) {
                    w G = G();
                    if (G == null) {
                        wVar = wVar2;
                        break;
                    }
                    f0 Y = G.Y(null);
                    if (Y != null) {
                        if (r0.a()) {
                            if (!(Y == v20.q.f53988a)) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = G.W();
                        r6 = true;
                        wVar = G;
                    } else {
                        G.Z();
                        wVar2 = G;
                    }
                }
            }
            if (obj2 != b.f56991d && !(obj2 instanceof m)) {
                this.size = i11;
                Object[] objArr2 = this.f57002g;
                objArr2[(this.f57003h + i11) % objArr2.length] = obj2;
            }
            this.f57003h = (this.f57003h + 1) % this.f57002g.length;
            b0 b0Var = b0.f54756a;
            if (r6) {
                kotlin.jvm.internal.s.e(wVar);
                wVar.V();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0092 A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #0 {all -> 0x00bb, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:10:0x0015, B:12:0x0029, B:14:0x0033, B:32:0x0078, B:34:0x007c, B:36:0x0080, B:42:0x00a2, B:37:0x008c, B:39:0x0092, B:15:0x0043, B:18:0x0048, B:21:0x004d, B:23:0x0053, B:26:0x005f, B:29:0x0067, B:30:0x0076), top: B:50:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    @Override // x20.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object X(kotlinx.coroutines.selects.d<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f57001f
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> Lbb
            if (r1 != 0) goto L15
            x20.m r9 = r8.p()     // Catch: java.lang.Throwable -> Lbb
            if (r9 != 0) goto L11
            kotlinx.coroutines.internal.f0 r9 = x20.b.f56991d     // Catch: java.lang.Throwable -> Lbb
        L11:
            r0.unlock()
            return r9
        L15:
            java.lang.Object[] r2 = r8.f57002g     // Catch: java.lang.Throwable -> Lbb
            int r3 = r8.f57003h     // Catch: java.lang.Throwable -> Lbb
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lbb
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> Lbb
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> Lbb
            kotlinx.coroutines.internal.f0 r2 = x20.b.f56991d     // Catch: java.lang.Throwable -> Lbb
            int r3 = r8.f56999d     // Catch: java.lang.Throwable -> Lbb
            r6 = 1
            if (r1 != r3) goto L77
        L29:
            x20.a$g r3 = r8.L()     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r7 = r9.n(r3)     // Catch: java.lang.Throwable -> Lbb
            if (r7 != 0) goto L43
            java.lang.Object r5 = r3.o()     // Catch: java.lang.Throwable -> Lbb
            kotlin.jvm.internal.s.e(r5)     // Catch: java.lang.Throwable -> Lbb
            r2 = r5
            x20.w r2 = (x20.w) r2     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r2 = r2.W()     // Catch: java.lang.Throwable -> Lbb
            r3 = r6
            goto L78
        L43:
            kotlinx.coroutines.internal.f0 r3 = x20.b.f56991d     // Catch: java.lang.Throwable -> Lbb
            if (r7 != r3) goto L48
            goto L77
        L48:
            java.lang.Object r3 = kotlinx.coroutines.internal.c.f35451b     // Catch: java.lang.Throwable -> Lbb
            if (r7 != r3) goto L4d
            goto L29
        L4d:
            java.lang.Object r2 = kotlinx.coroutines.selects.e.d()     // Catch: java.lang.Throwable -> Lbb
            if (r7 != r2) goto L5f
            r8.size = r1     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object[] r9 = r8.f57002g     // Catch: java.lang.Throwable -> Lbb
            int r1 = r8.f57003h     // Catch: java.lang.Throwable -> Lbb
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lbb
            r0.unlock()
            return r7
        L5f:
            boolean r2 = r7 instanceof x20.m     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto L67
            r3 = r6
            r2 = r7
            r5 = r2
            goto L78
        L67:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.String r1 = kotlin.jvm.internal.s.p(r1, r7)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lbb
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lbb
            throw r9     // Catch: java.lang.Throwable -> Lbb
        L77:
            r3 = 0
        L78:
            kotlinx.coroutines.internal.f0 r7 = x20.b.f56991d     // Catch: java.lang.Throwable -> Lbb
            if (r2 == r7) goto L8c
            boolean r7 = r2 instanceof x20.m     // Catch: java.lang.Throwable -> Lbb
            if (r7 != 0) goto L8c
            r8.size = r1     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object[] r9 = r8.f57002g     // Catch: java.lang.Throwable -> Lbb
            int r7 = r8.f57003h     // Catch: java.lang.Throwable -> Lbb
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> Lbb
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> Lbb
            goto La2
        L8c:
            boolean r9 = r9.k()     // Catch: java.lang.Throwable -> Lbb
            if (r9 != 0) goto La2
            r8.size = r1     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object[] r9 = r8.f57002g     // Catch: java.lang.Throwable -> Lbb
            int r1 = r8.f57003h     // Catch: java.lang.Throwable -> Lbb
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r9 = kotlinx.coroutines.selects.e.d()     // Catch: java.lang.Throwable -> Lbb
            r0.unlock()
            return r9
        La2:
            int r9 = r8.f57003h     // Catch: java.lang.Throwable -> Lbb
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.f57002g     // Catch: java.lang.Throwable -> Lbb
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lbb
            int r9 = r9 % r1
            r8.f57003h = r9     // Catch: java.lang.Throwable -> Lbb
            vz.b0 r9 = vz.b0.f54756a     // Catch: java.lang.Throwable -> Lbb
            r0.unlock()
            if (r3 == 0) goto Lba
            kotlin.jvm.internal.s.e(r5)
            x20.w r5 = (x20.w) r5
            r5.V()
        Lba:
            return r4
        Lbb:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x20.d.X(kotlinx.coroutines.selects.d):java.lang.Object");
    }

    @Override // x20.a, x20.t
    public boolean c() {
        ReentrantLock reentrantLock = this.f57001f;
        reentrantLock.lock();
        try {
            return super.c();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // x20.c
    protected Object m(w wVar) {
        ReentrantLock reentrantLock = this.f57001f;
        reentrantLock.lock();
        try {
            return super.m(wVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // x20.c
    protected String n() {
        return "(buffer:capacity=" + this.f56999d + ",size=" + this.size + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // x20.c
    protected final boolean y() {
        return false;
    }

    @Override // x20.c
    protected final boolean z() {
        return this.size == this.f56999d && this.f57000e == kotlinx.coroutines.channels.a.SUSPEND;
    }
}