package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v20.r0;

/* loaded from: classes5.dex */
public final class v<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    private final int f35517a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f35518b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35519c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ AtomicReferenceArray f35520d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f35513e = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final f0 f35516h = new f0("REMOVE_FROZEN");

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35514f = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "_next");

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f35515g = AtomicLongFieldUpdater.newUpdater(v.class, "_state");

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(long j11) {
            return (j11 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j11, int i11) {
            return d(j11, 1073741823L) | (i11 << 0);
        }

        public final long c(long j11, int i11) {
            return d(j11, 1152921503533105152L) | (i11 << 30);
        }

        public final long d(long j11, long j12) {
            return j11 & (~j12);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f35521a;

        public b(int i11) {
            this.f35521a = i11;
        }
    }

    public v(int i11, boolean z11) {
        this.f35517a = i11;
        this.f35518b = z11;
        int i12 = i11 - 1;
        this.f35519c = i12;
        this.f35520d = new AtomicReferenceArray(i11);
        if (!(i12 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i11 & i12) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final v<E> b(long j11) {
        v<E> vVar = new v<>(this.f35517a * 2, this.f35518b);
        int i11 = (int) ((1073741823 & j11) >> 0);
        int i12 = (int) ((1152921503533105152L & j11) >> 30);
        while (true) {
            int i13 = this.f35519c;
            if ((i11 & i13) != (i12 & i13)) {
                Object obj = this.f35520d.get(i13 & i11);
                if (obj == null) {
                    obj = new b(i11);
                }
                vVar.f35520d.set(vVar.f35519c & i11, obj);
                i11++;
            } else {
                vVar._state = f35513e.d(j11, 1152921504606846976L);
                return vVar;
            }
        }
    }

    private final v<E> c(long j11) {
        while (true) {
            v<E> vVar = (v) this._next;
            if (vVar != null) {
                return vVar;
            }
            f35514f.compareAndSet(this, null, b(j11));
        }
    }

    private final v<E> e(int i11, E e11) {
        Object obj = this.f35520d.get(this.f35519c & i11);
        if ((obj instanceof b) && ((b) obj).f35521a == i11) {
            this.f35520d.set(i11 & this.f35519c, e11);
            return this;
        }
        return null;
    }

    private final long h() {
        long j11;
        long j12;
        do {
            j11 = this._state;
            if ((j11 & 1152921504606846976L) != 0) {
                return j11;
            }
            j12 = j11 | 1152921504606846976L;
        } while (!f35515g.compareAndSet(this, j11, j12));
        return j12;
    }

    private final v<E> k(int i11, int i12) {
        long j11;
        a aVar;
        int i13;
        do {
            j11 = this._state;
            aVar = f35513e;
            i13 = (int) ((1073741823 & j11) >> 0);
            if (r0.a()) {
                if (!(i13 == i11)) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j11) != 0) {
                return i();
            }
        } while (!f35515g.compareAndSet(this, j11, aVar.b(j11, i12)));
        this.f35520d.set(this.f35519c & i13, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(E r14) {
        /*
            r13 = this;
        L0:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L12
            kotlinx.coroutines.internal.v$a r14 = kotlinx.coroutines.internal.v.f35513e
            int r14 = r14.a(r2)
            return r14
        L12:
            kotlinx.coroutines.internal.v$a r0 = kotlinx.coroutines.internal.v.f35513e
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.f35519c
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L30
            return r11
        L30:
            boolean r4 = r13.f35518b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.f35520d
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r0 = r13.f35517a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L4e:
            return r11
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.internal.v.f35515g
            long r11 = r0.c(r2, r1)
            r0 = r4
            r1 = r13
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f35520d
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L69:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L73
            goto L7d
        L73:
            kotlinx.coroutines.internal.v r0 = r0.i()
            kotlinx.coroutines.internal.v r0 = r0.e(r9, r14)
            if (r0 != 0) goto L69
        L7d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.v.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j11;
        do {
            j11 = this._state;
            if ((j11 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j11) != 0) {
                return false;
            }
        } while (!f35515g.compareAndSet(this, j11, j11 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j11 = this._state;
        return (((int) ((j11 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j11) >> 0))) & 1073741823;
    }

    public final boolean g() {
        long j11 = this._state;
        return ((int) ((1073741823 & j11) >> 0)) == ((int) ((j11 & 1152921503533105152L) >> 30));
    }

    public final v<E> i() {
        return c(h());
    }

    public final Object j() {
        while (true) {
            long j11 = this._state;
            if ((1152921504606846976L & j11) != 0) {
                return f35516h;
            }
            a aVar = f35513e;
            int i11 = (int) ((1073741823 & j11) >> 0);
            int i12 = (int) ((1152921503533105152L & j11) >> 30);
            int i13 = this.f35519c;
            if ((i12 & i13) == (i11 & i13)) {
                return null;
            }
            Object obj = this.f35520d.get(i13 & i11);
            if (obj == null) {
                if (this.f35518b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i14 = (i11 + 1) & 1073741823;
                if (f35515g.compareAndSet(this, j11, aVar.b(j11, i14))) {
                    this.f35520d.set(this.f35519c & i11, null);
                    return obj;
                } else if (this.f35518b) {
                    v<E> vVar = this;
                    do {
                        vVar = vVar.k(i11, i14);
                    } while (vVar != null);
                    return obj;
                }
            }
        }
    }
}