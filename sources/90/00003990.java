package com.google.firebase.perf.session;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.application.b;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Keep
/* loaded from: classes2.dex */
public class SessionManager extends b {
    private static final SessionManager instance = new SessionManager();
    private final a appStateMonitor;
    private final Set<WeakReference<jn.b>> clients;
    private final GaugeManager gaugeManager;
    private jn.a perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), jn.a.c(), a.b());
    }

    public static /* synthetic */ void b(SessionManager sessionManager, Context context, jn.a aVar) {
        sessionManager.lambda$setApplicationContext$0(context, aVar);
    }

    public static SessionManager getInstance() {
        return instance;
    }

    public /* synthetic */ void lambda$setApplicationContext$0(Context context, jn.a aVar) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (aVar.f()) {
            this.gaugeManager.logGaugeMetadata(aVar.h(), com.google.firebase.perf.v1.b.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(com.google.firebase.perf.v1.b bVar) {
        if (this.perfSession.f()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.h(), bVar);
        }
    }

    private void startOrStopCollectingGauges(com.google.firebase.perf.v1.b bVar) {
        if (this.perfSession.f()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, bVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    @VisibleForTesting
    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        com.google.firebase.perf.v1.b bVar = com.google.firebase.perf.v1.b.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(bVar);
        startOrStopCollectingGauges(bVar);
    }

    @Override // com.google.firebase.perf.application.b, com.google.firebase.perf.application.a.b
    public void onUpdateAppState(com.google.firebase.perf.v1.b bVar) {
        super.onUpdateAppState(bVar);
        if (this.appStateMonitor.g()) {
            return;
        }
        if (bVar == com.google.firebase.perf.v1.b.FOREGROUND) {
            updatePerfSession(bVar);
        } else if (updatePerfSessionIfExpired()) {
        } else {
            startOrStopCollectingGauges(bVar);
        }
    }

    public final jn.a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<jn.b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final jn.a aVar = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: jn.c
            {
                SessionManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SessionManager.b(SessionManager.this, context, aVar);
            }
        });
    }

    @VisibleForTesting
    public void setPerfSession(jn.a aVar) {
        this.perfSession = aVar;
    }

    public void unregisterForSessionUpdates(WeakReference<jn.b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(com.google.firebase.perf.v1.b bVar) {
        synchronized (this.clients) {
            this.perfSession = jn.a.c();
            Iterator<WeakReference<jn.b>> it2 = this.clients.iterator();
            while (it2.hasNext()) {
                jn.b bVar2 = it2.next().get();
                if (bVar2 != null) {
                    bVar2.a(this.perfSession);
                } else {
                    it2.remove();
                }
            }
        }
        logGaugeMetadataIfCollectionEnabled(bVar);
        startOrStopCollectingGauges(bVar);
    }

    public boolean updatePerfSessionIfExpired() {
        if (this.perfSession.e()) {
            updatePerfSession(this.appStateMonitor.a());
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public SessionManager(GaugeManager gaugeManager, jn.a aVar, a aVar2) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = aVar;
        this.appStateMonitor = aVar2;
        registerForAppState();
    }
}