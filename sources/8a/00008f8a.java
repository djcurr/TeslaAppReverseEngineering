package okio;

import java.util.concurrent.atomic.AtomicReference;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: c  reason: collision with root package name */
    private static final int f42635c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReference<z>[] f42636d;

    /* renamed from: e  reason: collision with root package name */
    public static final a0 f42637e = new a0();

    /* renamed from: a  reason: collision with root package name */
    private static final int f42633a = 65536;

    /* renamed from: b  reason: collision with root package name */
    private static final z f42634b = new z(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f42635c = highestOneBit;
        AtomicReference<z>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i11 = 0; i11 < highestOneBit; i11++) {
            atomicReferenceArr[i11] = new AtomicReference<>();
        }
        f42636d = atomicReferenceArr;
    }

    private a0() {
    }

    private final AtomicReference<z> a() {
        Thread currentThread = Thread.currentThread();
        kotlin.jvm.internal.s.f(currentThread, "Thread.currentThread()");
        return f42636d[(int) (currentThread.getId() & (f42635c - 1))];
    }

    public static final void b(z segment) {
        AtomicReference<z> a11;
        z zVar;
        kotlin.jvm.internal.s.g(segment, "segment");
        if (segment.f42706f == null && segment.f42707g == null) {
            if (segment.f42704d || (zVar = (a11 = f42637e.a()).get()) == f42634b) {
                return;
            }
            int i11 = zVar != null ? zVar.f42703c : 0;
            if (i11 >= f42633a) {
                return;
            }
            segment.f42706f = zVar;
            segment.f42702b = 0;
            segment.f42703c = i11 + PKIFailureInfo.certRevoked;
            if (a11.compareAndSet(zVar, segment)) {
                return;
            }
            segment.f42706f = null;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final z c() {
        AtomicReference<z> a11 = f42637e.a();
        z zVar = f42634b;
        z andSet = a11.getAndSet(zVar);
        if (andSet == zVar) {
            return new z();
        }
        if (andSet == null) {
            a11.set(null);
            return new z();
        }
        a11.set(andSet.f42706f);
        andSet.f42706f = null;
        andSet.f42703c = 0;
        return andSet;
    }
}