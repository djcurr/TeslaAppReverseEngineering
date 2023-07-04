package androidx.lifecycle;

import androidx.lifecycle.p;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private o.b<g0<? super T>, LiveData<T>.c> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements s {

        /* renamed from: e */
        final v f5039e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        LifecycleBoundObserver(v vVar, g0<? super T> g0Var) {
            super(g0Var);
            LiveData.this = r1;
            this.f5039e = vVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        void b() {
            this.f5039e.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean d(v vVar) {
            return this.f5039e == vVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean e() {
            return this.f5039e.getLifecycle().b().isAtLeast(p.c.STARTED);
        }

        @Override // androidx.lifecycle.s
        public void g(v vVar, p.b bVar) {
            p.c b11 = this.f5039e.getLifecycle().b();
            if (b11 == p.c.DESTROYED) {
                LiveData.this.removeObserver(this.f5042a);
                return;
            }
            p.c cVar = null;
            while (cVar != b11) {
                a(e());
                cVar = b11;
                b11 = this.f5039e.getLifecycle().b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            LiveData.this = r1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        b(LiveData liveData, g0<? super T> g0Var) {
            super(g0Var);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean e() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: a */
        final g0<? super T> f5042a;

        /* renamed from: b */
        boolean f5043b;

        /* renamed from: c */
        int f5044c = -1;

        c(g0<? super T> g0Var) {
            LiveData.this = r1;
            this.f5042a = g0Var;
        }

        void a(boolean z11) {
            if (z11 == this.f5043b) {
                return;
            }
            this.f5043b = z11;
            LiveData.this.changeActiveCounter(z11 ? 1 : -1);
            if (this.f5043b) {
                LiveData.this.dispatchingValue(this);
            }
        }

        void b() {
        }

        boolean d(v vVar) {
            return false;
        }

        abstract boolean e();
    }

    public LiveData(T t11) {
        this.mDataLock = new Object();
        this.mObservers = new o.b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = t11;
        this.mVersion = 0;
    }

    static void assertMainThread(String str) {
        if (n.a.e().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void considerNotify(LiveData<T>.c cVar) {
        if (cVar.f5043b) {
            if (!cVar.e()) {
                cVar.a(false);
                return;
            }
            int i11 = cVar.f5044c;
            int i12 = this.mVersion;
            if (i11 >= i12) {
                return;
            }
            cVar.f5044c = i12;
            cVar.f5042a.onChanged((Object) this.mData);
        }
    }

    void changeActiveCounter(int i11) {
        int i12 = this.mActiveCount;
        this.mActiveCount = i11 + i12;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i13 = this.mActiveCount;
                if (i12 == i13) {
                    return;
                }
                boolean z11 = i12 == 0 && i13 > 0;
                boolean z12 = i12 > 0 && i13 == 0;
                if (z11) {
                    onActive();
                } else if (z12) {
                    onInactive();
                }
                i12 = i13;
            } finally {
                this.mChangingActiveState = false;
            }
        }
    }

    void dispatchingValue(LiveData<T>.c cVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (cVar != null) {
                considerNotify(cVar);
                cVar = null;
            } else {
                o.b<g0<? super T>, LiveData<T>.c>.d d11 = this.mObservers.d();
                while (d11.hasNext()) {
                    considerNotify((c) d11.next().getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t11 = (T) this.mData;
        if (t11 != NOT_SET) {
            return t11;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public void observe(v vVar, g0<? super T> g0Var) {
        assertMainThread("observe");
        if (vVar.getLifecycle().b() == p.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(vVar, g0Var);
        LiveData<T>.c h11 = this.mObservers.h(g0Var, lifecycleBoundObserver);
        if (h11 != null && !h11.d(vVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (h11 != null) {
            return;
        }
        vVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void observeForever(g0<? super T> g0Var) {
        assertMainThread("observeForever");
        b bVar = new b(this, g0Var);
        LiveData<T>.c h11 = this.mObservers.h(g0Var, bVar);
        if (h11 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (h11 != null) {
            return;
        }
        bVar.a(true);
    }

    protected void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t11) {
        boolean z11;
        synchronized (this.mDataLock) {
            z11 = this.mPendingData == NOT_SET;
            this.mPendingData = t11;
        }
        if (z11) {
            n.a.e().c(this.mPostValueRunnable);
        }
    }

    public void removeObserver(g0<? super T> g0Var) {
        assertMainThread("removeObserver");
        LiveData<T>.c i11 = this.mObservers.i(g0Var);
        if (i11 == null) {
            return;
        }
        i11.b();
        i11.a(false);
    }

    public void removeObservers(v vVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<g0<? super T>, LiveData<T>.c>> it2 = this.mObservers.iterator();
        while (it2.hasNext()) {
            Map.Entry<g0<? super T>, LiveData<T>.c> next = it2.next();
            if (next.getValue().d(vVar)) {
                removeObserver(next.getKey());
            }
        }
    }

    public void setValue(T t11) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t11;
        dispatchingValue(null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new o.b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }
}