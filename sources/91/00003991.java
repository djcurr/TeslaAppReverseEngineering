package com.google.firebase.perf.session.gauges;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.firebase.perf.v1.GaugeMetric;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ul.t;

@Keep
/* loaded from: classes2.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private com.google.firebase.perf.v1.b applicationProcessState;
    private final com.google.firebase.perf.config.a configResolver;
    private final t<c> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final t<ScheduledExecutorService> gaugeManagerExecutor;
    private i gaugeMetadataManager;
    private final t<l> memoryGaugeCollector;
    private String sessionId;
    private final kn.k transportManager;
    private static final fn.a logger = fn.a.e();
    private static final GaugeManager instance = new GaugeManager();

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16990a;

        static {
            int[] iArr = new int[com.google.firebase.perf.v1.b.values().length];
            f16990a = iArr;
            try {
                iArr[com.google.firebase.perf.v1.b.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16990a[com.google.firebase.perf.v1.b.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private GaugeManager() {
        this(new t(new sm.b() { // from class: com.google.firebase.perf.session.gauges.f
            @Override // sm.b
            public final Object get() {
                return GaugeManager.b();
            }
        }), kn.k.k(), com.google.firebase.perf.config.a.f(), null, new t(new sm.b() { // from class: com.google.firebase.perf.session.gauges.h
            @Override // sm.b
            public final Object get() {
                return GaugeManager.e();
            }
        }), new t(new sm.b() { // from class: com.google.firebase.perf.session.gauges.g
            @Override // sm.b
            public final Object get() {
                return GaugeManager.d();
            }
        }));
    }

    public static /* synthetic */ void a(GaugeManager gaugeManager, String str, com.google.firebase.perf.v1.b bVar) {
        gaugeManager.lambda$startCollectingGauges$3(str, bVar);
    }

    public static /* synthetic */ ScheduledExecutorService b() {
        return lambda$new$0();
    }

    public static /* synthetic */ void c(GaugeManager gaugeManager, String str, com.google.firebase.perf.v1.b bVar) {
        gaugeManager.lambda$stopCollectingGauges$4(str, bVar);
    }

    public static /* synthetic */ l d() {
        return lambda$new$2();
    }

    public static /* synthetic */ c e() {
        return lambda$new$1();
    }

    private long getCpuGaugeCollectionFrequencyMs(com.google.firebase.perf.v1.b bVar) {
        long w11;
        int i11 = a.f16990a[bVar.ordinal()];
        if (i11 != 1) {
            w11 = i11 != 2 ? -1L : this.configResolver.x();
        } else {
            w11 = this.configResolver.w();
        }
        if (c.f(w11)) {
            return -1L;
        }
        return w11;
    }

    private GaugeMetadata getGaugeMetadata() {
        return GaugeMetadata.newBuilder().k(this.gaugeMetadataManager.e()).a(this.gaugeMetadataManager.b()).b(this.gaugeMetadataManager.c()).c(this.gaugeMetadataManager.d()).build();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(com.google.firebase.perf.v1.b bVar) {
        long z11;
        int i11 = a.f16990a[bVar.ordinal()];
        if (i11 != 1) {
            z11 = i11 != 2 ? -1L : this.configResolver.A();
        } else {
            z11 = this.configResolver.z();
        }
        if (l.e(z11)) {
            return -1L;
        }
        return z11;
    }

    public static /* synthetic */ ScheduledExecutorService lambda$new$0() {
        return Executors.newSingleThreadScheduledExecutor();
    }

    public static /* synthetic */ c lambda$new$1() {
        return new c();
    }

    public static /* synthetic */ l lambda$new$2() {
        return new l();
    }

    private boolean startCollectingCpuMetrics(long j11, com.google.firebase.perf.util.h hVar) {
        if (j11 == -1) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.get().k(j11, hVar);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j11, com.google.firebase.perf.util.h hVar) {
        if (j11 == -1) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.get().j(j11, hVar);
        return true;
    }

    /* renamed from: syncFlush */
    public void lambda$stopCollectingGauges$4(String str, com.google.firebase.perf.v1.b bVar) {
        GaugeMetric.b newBuilder = GaugeMetric.newBuilder();
        while (!this.cpuGaugeCollector.get().f16997a.isEmpty()) {
            newBuilder.b(this.cpuGaugeCollector.get().f16997a.poll());
        }
        while (!this.memoryGaugeCollector.get().f17024b.isEmpty()) {
            newBuilder.a(this.memoryGaugeCollector.get().f17024b.poll());
        }
        newBuilder.k(str);
        this.transportManager.A(newBuilder.build(), bVar);
    }

    public void collectGaugeMetricOnce(com.google.firebase.perf.util.h hVar) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), hVar);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new i(context);
    }

    public boolean logGaugeMetadata(String str, com.google.firebase.perf.v1.b bVar) {
        if (this.gaugeMetadataManager != null) {
            this.transportManager.A(GaugeMetric.newBuilder().k(str).c(getGaugeMetadata()).build(), bVar);
            return true;
        }
        return false;
    }

    public void startCollectingGauges(jn.a aVar, final com.google.firebase.perf.v1.b bVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(bVar, aVar.d());
        if (startCollectingGauges == -1) {
            logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String h11 = aVar.h();
        this.sessionId = h11;
        this.applicationProcessState = bVar;
        try {
            long j11 = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.d
                {
                    GaugeManager.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GaugeManager.a(GaugeManager.this, h11, bVar);
                }
            }, j11, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            fn.a aVar2 = logger;
            aVar2.j("Unable to start collecting Gauges: " + e11.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final com.google.firebase.perf.v1.b bVar = this.applicationProcessState;
        this.cpuGaugeCollector.get().l();
        this.memoryGaugeCollector.get().k();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.e
            {
                GaugeManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                GaugeManager.c(GaugeManager.this, str, bVar);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = com.google.firebase.perf.v1.b.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(c cVar, l lVar, com.google.firebase.perf.util.h hVar) {
        cVar.c(hVar);
        lVar.c(hVar);
    }

    GaugeManager(t<ScheduledExecutorService> tVar, kn.k kVar, com.google.firebase.perf.config.a aVar, i iVar, t<c> tVar2, t<l> tVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = com.google.firebase.perf.v1.b.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = tVar;
        this.transportManager = kVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = iVar;
        this.cpuGaugeCollector = tVar2;
        this.memoryGaugeCollector = tVar3;
    }

    private long startCollectingGauges(com.google.firebase.perf.v1.b bVar, com.google.firebase.perf.util.h hVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(bVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, hVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(bVar);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, hVar) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}