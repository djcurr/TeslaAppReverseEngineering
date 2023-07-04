package androidx.activity;

import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f1020a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayDeque<e> f1021b = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements s, androidx.activity.a {

        /* renamed from: a  reason: collision with root package name */
        private final p f1022a;

        /* renamed from: b  reason: collision with root package name */
        private final e f1023b;

        /* renamed from: c  reason: collision with root package name */
        private androidx.activity.a f1024c;

        LifecycleOnBackPressedCancellable(p pVar, e eVar) {
            this.f1022a = pVar;
            this.f1023b = eVar;
            pVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f1022a.c(this);
            this.f1023b.removeCancellable(this);
            androidx.activity.a aVar = this.f1024c;
            if (aVar != null) {
                aVar.cancel();
                this.f1024c = null;
            }
        }

        @Override // androidx.lifecycle.s
        public void g(v vVar, p.b bVar) {
            if (bVar == p.b.ON_START) {
                this.f1024c = OnBackPressedDispatcher.this.c(this.f1023b);
            } else if (bVar == p.b.ON_STOP) {
                androidx.activity.a aVar = this.f1024c;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (bVar == p.b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements androidx.activity.a {

        /* renamed from: a  reason: collision with root package name */
        private final e f1026a;

        a(e eVar) {
            this.f1026a = eVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f1021b.remove(this.f1026a);
            this.f1026a.removeCancellable(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f1020a = runnable;
    }

    public void a(e eVar) {
        c(eVar);
    }

    public void b(v vVar, e eVar) {
        p lifecycle = vVar.getLifecycle();
        if (lifecycle.b() == p.c.DESTROYED) {
            return;
        }
        eVar.addCancellable(new LifecycleOnBackPressedCancellable(lifecycle, eVar));
    }

    androidx.activity.a c(e eVar) {
        this.f1021b.add(eVar);
        a aVar = new a(eVar);
        eVar.addCancellable(aVar);
        return aVar;
    }

    public void d() {
        Iterator<e> descendingIterator = this.f1021b.descendingIterator();
        while (descendingIterator.hasNext()) {
            e next = descendingIterator.next();
            if (next.isEnabled()) {
                next.handleOnBackPressed();
                return;
            }
        }
        Runnable runnable = this.f1020a;
        if (runnable != null) {
            runnable.run();
        }
    }
}