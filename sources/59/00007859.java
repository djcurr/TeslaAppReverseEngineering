package io.realm.internal;

import io.realm.f0;
import io.realm.internal.j;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

@Keep
/* loaded from: classes5.dex */
public abstract class RealmNotifier implements Closeable {
    private OsSharedRealm sharedRealm;
    private j<b> realmObserverPairs = new j<>();
    private final j.a<b> onChangeCallBack = new a();
    private List<Runnable> transactionCallbacks = new ArrayList();
    private List<Runnable> startSendingNotificationsCallbacks = new ArrayList();
    private List<Runnable> finishedSendingNotificationsCallbacks = new ArrayList();

    /* loaded from: classes5.dex */
    class a implements j.a<b> {
        a() {
        }

        @Override // io.realm.internal.j.a
        /* renamed from: b */
        public void a(b bVar, Object obj) {
            if (RealmNotifier.this.sharedRealm == null || RealmNotifier.this.sharedRealm.isClosed()) {
                return;
            }
            bVar.b(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b<T> extends j.b<T, f0<T>> {
        b(T t11, f0<T> f0Var) {
            super(t11, f0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(T t11) {
            if (t11 != null) {
                ((f0) this.f31939b).a(t11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RealmNotifier(OsSharedRealm osSharedRealm) {
        this.sharedRealm = osSharedRealm;
    }

    private void removeAllChangeListeners() {
        this.realmObserverPairs.b();
    }

    public void addBeginSendingNotificationsCallback(Runnable runnable) {
        this.startSendingNotificationsCallbacks.add(runnable);
    }

    public <T> void addChangeListener(T t11, f0<T> f0Var) {
        this.realmObserverPairs.a(new b(t11, f0Var));
    }

    public void addFinishedSendingNotificationsCallback(Runnable runnable) {
        this.finishedSendingNotificationsCallbacks.add(runnable);
    }

    public void addTransactionCallback(Runnable runnable) {
        this.transactionCallbacks.add(runnable);
    }

    void beforeNotify() {
        this.sharedRealm.invalidateIterators();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        removeAllChangeListeners();
        this.startSendingNotificationsCallbacks.clear();
        this.finishedSendingNotificationsCallbacks.clear();
    }

    void didChange() {
        this.realmObserverPairs.c(this.onChangeCallBack);
        if (this.transactionCallbacks.isEmpty()) {
            return;
        }
        List<Runnable> list = this.transactionCallbacks;
        this.transactionCallbacks = new ArrayList();
        for (Runnable runnable : list) {
            runnable.run();
        }
    }

    void didSendNotifications() {
        for (int i11 = 0; i11 < this.startSendingNotificationsCallbacks.size(); i11++) {
            this.finishedSendingNotificationsCallbacks.get(i11).run();
        }
    }

    public int getListenersListSize() {
        return this.realmObserverPairs.g();
    }

    public abstract boolean post(Runnable runnable);

    public <E> void removeChangeListener(E e11, f0<E> f0Var) {
        this.realmObserverPairs.e(e11, f0Var);
    }

    public <E> void removeChangeListeners(E e11) {
        this.realmObserverPairs.f(e11);
    }

    void willSendNotifications() {
        for (int i11 = 0; i11 < this.startSendingNotificationsCallbacks.size(); i11++) {
            this.startSendingNotificationsCallbacks.get(i11).run();
        }
    }
}