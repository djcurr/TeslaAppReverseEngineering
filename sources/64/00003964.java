package com.google.firebase.perf.application;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.application.a;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class b implements a.b {
    private final WeakReference<a.b> appStateCallback;
    private final a appStateMonitor;
    private com.google.firebase.perf.v1.b currentAppState;
    private boolean isRegisteredForAppState;

    /* JADX INFO: Access modifiers changed from: protected */
    public b() {
        this(a.b());
    }

    public com.google.firebase.perf.v1.b getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public WeakReference<a.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void incrementTsnsCount(int i11) {
        this.appStateMonitor.f(i11);
    }

    @Override // com.google.firebase.perf.application.a.b
    public void onUpdateAppState(com.google.firebase.perf.v1.b bVar) {
        com.google.firebase.perf.v1.b bVar2 = this.currentAppState;
        com.google.firebase.perf.v1.b bVar3 = com.google.firebase.perf.v1.b.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (bVar2 == bVar3) {
            this.currentAppState = bVar;
        } else if (bVar2 == bVar || bVar == bVar3) {
        } else {
            this.currentAppState = com.google.firebase.perf.v1.b.FOREGROUND_BACKGROUND;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.a();
        this.appStateMonitor.k(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.o(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(a aVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = com.google.firebase.perf.v1.b.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = aVar;
        this.appStateCallback = new WeakReference<>(this);
    }
}