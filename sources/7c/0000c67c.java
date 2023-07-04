package zz;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.q;

/* loaded from: classes5.dex */
public final class i<T> implements d<T>, kotlin.coroutines.jvm.internal.e {
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<i<?>, Object> f61281b;

    /* renamed from: a  reason: collision with root package name */
    private final d<T> f61282a;
    private volatile Object result;

    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f61281b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(d<? super T> delegate, Object obj) {
        s.g(delegate, "delegate");
        this.f61282a = delegate;
        this.result = obj;
    }

    public final Object b() {
        Object d11;
        Object d12;
        Object d13;
        Object obj = this.result;
        a00.a aVar = a00.a.UNDECIDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater<i<?>, Object> atomicReferenceFieldUpdater = f61281b;
            d12 = a00.d.d();
            if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, d12)) {
                d13 = a00.d.d();
                return d13;
            }
            obj = this.result;
        }
        if (obj == a00.a.RESUMED) {
            d11 = a00.d.d();
            return d11;
        } else if (obj instanceof q.b) {
            throw ((q.b) obj).f54774a;
        } else {
            return obj;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        d<T> dVar = this.f61282a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // zz.d
    public g getContext() {
        return this.f61282a.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // zz.d
    public void resumeWith(Object obj) {
        Object d11;
        Object d12;
        while (true) {
            Object obj2 = this.result;
            a00.a aVar = a00.a.UNDECIDED;
            if (obj2 != aVar) {
                d11 = a00.d.d();
                if (obj2 != d11) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater<i<?>, Object> atomicReferenceFieldUpdater = f61281b;
                d12 = a00.d.d();
                if (atomicReferenceFieldUpdater.compareAndSet(this, d12, a00.a.RESUMED)) {
                    this.f61282a.resumeWith(obj);
                    return;
                }
            } else if (f61281b.compareAndSet(this, aVar, obj)) {
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f61282a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d<? super T> delegate) {
        this(delegate, a00.a.UNDECIDED);
        s.g(delegate, "delegate");
    }
}