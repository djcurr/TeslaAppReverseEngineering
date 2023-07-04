package io.sentry;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes5.dex */
public class g3 {
    static final f3 DEFAULT_DIAGNOSTIC_LEVEL = f3.DEBUG;
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private a beforeBreadcrumb;
    private b beforeSend;
    private String cacheDirPath;
    mz.g clientReportRecorder;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private boolean debug;
    private f3 diagnosticLevel;
    private String dist;
    private String distinctId;
    private String dsn;
    private String dsnHash;
    private boolean enableAutoSessionTracking;
    private boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enableNdk;
    private boolean enableScopeSync;
    private boolean enableShutdownHook;
    private boolean enableUncaughtExceptionHandler;
    private lz.e envelopeDiskCache;
    private a0 envelopeReader;
    private String environment;
    private final List<r> eventProcessors;
    private g0 executorService;
    private long flushTimeoutMillis;
    private HostnameVerifier hostnameVerifier;
    private Long idleTimeout;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private final List<m0> integrations;
    private d0 logger;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private d maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private final List<e0> observers;
    private boolean printUncaughtStackTrace;
    private boolean profilingEnabled;
    private String proguardUuid;
    private c proxy;
    private int readTimeoutMillis;
    private String release;
    private Double sampleRate;
    private io.sentry.protocol.m sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private String sentryClientName;
    private h0 serializer;
    private String serverName;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private SSLSocketFactory sslSocketFactory;
    private final Map<String, String> tags;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private e tracesSampler;
    private final List<String> tracingOrigins;
    private k0 transactionProfiler;
    private l0 transportFactory;
    private qz.q transportGate;

    /* loaded from: classes5.dex */
    public interface a {
        io.sentry.c a(io.sentry.c cVar, t tVar);
    }

    /* loaded from: classes5.dex */
    public interface b {
        b3 a(b3 b3Var, t tVar);
    }

    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private String f32265a;

        /* renamed from: b  reason: collision with root package name */
        private String f32266b;

        /* renamed from: c  reason: collision with root package name */
        private String f32267c;

        /* renamed from: d  reason: collision with root package name */
        private String f32268d;

        public c(String str, String str2, String str3, String str4) {
            this.f32265a = str;
            this.f32266b = str2;
            this.f32267c = str3;
            this.f32268d = str4;
        }

        public String a() {
            return this.f32265a;
        }

        public String b() {
            return this.f32268d;
        }

        public String c() {
            return this.f32266b;
        }

        public String d() {
            return this.f32267c;
        }
    }

    /* loaded from: classes5.dex */
    public enum d {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    /* loaded from: classes5.dex */
    public interface e {
        Double a(t1 t1Var);
    }

    public g3() {
        this(false);
    }

    private io.sentry.protocol.m createSdkVersion() {
        io.sentry.protocol.m mVar = new io.sentry.protocol.m("sentry.java", "6.1.4");
        mVar.k("6.1.4");
        mVar.d("maven:io.sentry:sentry", "6.1.4");
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g3 empty() {
        return new g3(true);
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(r rVar) {
        this.eventProcessors.add(rVar);
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(m0 m0Var) {
        this.integrations.add(m0Var);
    }

    public void addScopeObserver(e0 e0Var) {
        this.observers.add(e0Var);
    }

    public void addTracingOrigin(String str) {
        this.tracingOrigins.add(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean containsIgnoredExceptionForType(Throwable th2) {
        return this.ignoredExceptionsForType.contains(th2.getClass());
    }

    public a getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public b getBeforeSend() {
        return this.beforeSend;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    @ApiStatus.Internal
    public mz.g getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public f3 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    @ApiStatus.Internal
    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    public lz.e getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public a0 getEnvelopeReader() {
        return this.envelopeReader;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public List<r> getEventProcessors() {
        return this.eventProcessors;
    }

    @ApiStatus.Internal
    public g0 getExecutorService() {
        return this.executorService;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public List<m0> getIntegrations() {
        return this.integrations;
    }

    public d0 getLogger() {
        return this.logger;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public d getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    @ApiStatus.Experimental
    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public c getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<e0> getScopeObservers() {
        return this.observers;
    }

    public io.sentry.protocol.m getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public h0 getSerializer() {
        return this.serializer;
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    @ApiStatus.ScheduledForRemoval
    @Deprecated
    public long getShutdownTimeout() {
        return this.shutdownTimeoutMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public e getTracesSampler() {
        return this.tracesSampler;
    }

    public List<String> getTracingOrigins() {
        return this.tracingOrigins;
    }

    public k0 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public l0 getTransportFactory() {
        return this.transportFactory;
    }

    public qz.q getTransportGate() {
        return this.transportGate;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        return this.profilingEnabled;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    @ApiStatus.Experimental
    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        return (getTracesSampleRate() == null && getTracesSampler() == null) ? false : true;
    }

    public void merge(s sVar) {
        if (sVar.j() != null) {
            setDsn(sVar.j());
        }
        if (sVar.m() != null) {
            setEnvironment(sVar.m());
        }
        if (sVar.u() != null) {
            setRelease(sVar.u());
        }
        if (sVar.i() != null) {
            setDist(sVar.i());
        }
        if (sVar.w() != null) {
            setServerName(sVar.w());
        }
        if (sVar.t() != null) {
            setProxy(sVar.t());
        }
        if (sVar.l() != null) {
            setEnableUncaughtExceptionHandler(sVar.l().booleanValue());
        }
        if (sVar.r() != null) {
            setPrintUncaughtStackTrace(sVar.r().booleanValue());
        }
        if (sVar.y() != null) {
            setTracesSampleRate(sVar.y());
        }
        if (sVar.h() != null) {
            setDebug(sVar.h().booleanValue());
        }
        if (sVar.k() != null) {
            setEnableDeduplication(sVar.k().booleanValue());
        }
        if (sVar.v() != null) {
            setSendClientReports(sVar.v().booleanValue());
        }
        for (Map.Entry entry : new HashMap(sVar.x()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        for (String str : new ArrayList(sVar.q())) {
            addInAppInclude(str);
        }
        for (String str2 : new ArrayList(sVar.p())) {
            addInAppExclude(str2);
        }
        Iterator it2 = new HashSet(sVar.o()).iterator();
        while (it2.hasNext()) {
            addIgnoredExceptionForType((Class) it2.next());
        }
        for (String str3 : new ArrayList(sVar.z())) {
            addTracingOrigin(str3);
        }
        for (String str4 : new ArrayList(sVar.g())) {
            addContextTag(str4);
        }
        if (sVar.s() != null) {
            setProguardUuid(sVar.s());
        }
        if (sVar.n() != null) {
            setIdleTimeout(sVar.n());
        }
    }

    public void setAttachServerName(boolean z11) {
        this.attachServerName = z11;
    }

    public void setAttachStacktrace(boolean z11) {
        this.attachStacktrace = z11;
    }

    public void setAttachThreads(boolean z11) {
        this.attachThreads = z11;
    }

    public void setBeforeBreadcrumb(a aVar) {
        this.beforeBreadcrumb = aVar;
    }

    public void setBeforeSend(b bVar) {
        this.beforeSend = bVar;
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setConnectionTimeoutMillis(int i11) {
        this.connectionTimeoutMillis = i11;
    }

    public void setDebug(boolean z11) {
        this.debug = z11;
    }

    public void setDiagnosticLevel(f3 f3Var) {
        if (f3Var == null) {
            f3Var = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = f3Var;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    @ApiStatus.Internal
    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
        this.dsnHash = rz.m.a(str, this.logger);
    }

    public void setEnableAutoSessionTracking(boolean z11) {
        this.enableAutoSessionTracking = z11;
    }

    public void setEnableDeduplication(boolean z11) {
        this.enableDeduplication = z11;
    }

    public void setEnableExternalConfiguration(boolean z11) {
        this.enableExternalConfiguration = z11;
    }

    public void setEnableNdk(boolean z11) {
        this.enableNdk = z11;
    }

    public void setEnableScopeSync(boolean z11) {
        this.enableScopeSync = z11;
    }

    public void setEnableShutdownHook(boolean z11) {
        this.enableShutdownHook = z11;
    }

    public void setEnableUncaughtExceptionHandler(boolean z11) {
        this.enableUncaughtExceptionHandler = z11;
    }

    public void setEnvelopeDiskCache(lz.e eVar) {
        if (eVar == null) {
            eVar = qz.r.b();
        }
        this.envelopeDiskCache = eVar;
    }

    public void setEnvelopeReader(a0 a0Var) {
        if (a0Var == null) {
            a0Var = a1.b();
        }
        this.envelopeReader = a0Var;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    void setExecutorService(g0 g0Var) {
        if (g0Var != null) {
            this.executorService = g0Var;
        }
    }

    public void setFlushTimeoutMillis(long j11) {
        this.flushTimeoutMillis = j11;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    public void setIdleTimeout(Long l11) {
        this.idleTimeout = l11;
    }

    public void setLogger(d0 d0Var) {
        this.logger = d0Var == null ? c1.e() : new h(this, d0Var);
    }

    public void setMaxAttachmentSize(long j11) {
        this.maxAttachmentSize = j11;
    }

    public void setMaxBreadcrumbs(int i11) {
        this.maxBreadcrumbs = i11;
    }

    public void setMaxCacheItems(int i11) {
        this.maxCacheItems = i11;
    }

    public void setMaxDepth(int i11) {
        this.maxDepth = i11;
    }

    public void setMaxQueueSize(int i11) {
        if (i11 > 0) {
            this.maxQueueSize = i11;
        }
    }

    public void setMaxRequestBodySize(d dVar) {
        this.maxRequestBodySize = dVar;
    }

    @ApiStatus.Experimental
    public void setMaxSpans(int i11) {
        this.maxSpans = i11;
    }

    public void setMaxTraceFileSize(long j11) {
        this.maxTraceFileSize = j11;
    }

    public void setPrintUncaughtStackTrace(boolean z11) {
        this.printUncaughtStackTrace = z11;
    }

    public void setProfilingEnabled(boolean z11) {
        this.profilingEnabled = z11;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(c cVar) {
        this.proxy = cVar;
    }

    public void setReadTimeoutMillis(int i11) {
        this.readTimeoutMillis = i11;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setSampleRate(Double d11) {
        if (d11 != null && (d11.doubleValue() > 1.0d || d11.doubleValue() <= 0.0d)) {
            throw new IllegalArgumentException("The value " + d11 + " is not valid. Use null to disable or values > 0.0 and <= 1.0.");
        }
        this.sampleRate = d11;
    }

    @ApiStatus.Internal
    public void setSdkVersion(io.sentry.protocol.m mVar) {
        this.sdkVersion = mVar;
    }

    public void setSendClientReports(boolean z11) {
        this.sendClientReports = z11;
        if (z11) {
            this.clientReportRecorder = new mz.d(this);
        } else {
            this.clientReportRecorder = new mz.i();
        }
    }

    public void setSendDefaultPii(boolean z11) {
        this.sendDefaultPii = z11;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(h0 h0Var) {
        if (h0Var == null) {
            h0Var = g1.f();
        }
        this.serializer = h0Var;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionTrackingIntervalMillis(long j11) {
        this.sessionTrackingIntervalMillis = j11;
    }

    @ApiStatus.ScheduledForRemoval
    @Deprecated
    public void setShutdownTimeout(long j11) {
        this.shutdownTimeoutMillis = j11;
    }

    public void setShutdownTimeoutMillis(long j11) {
        this.shutdownTimeoutMillis = j11;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    @ApiStatus.Experimental
    public void setTraceSampling(boolean z11) {
        this.traceSampling = z11;
    }

    public void setTracesSampleRate(Double d11) {
        if (d11 != null && (d11.doubleValue() > 1.0d || d11.doubleValue() < 0.0d)) {
            throw new IllegalArgumentException("The value " + d11 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
        }
        this.tracesSampleRate = d11;
    }

    public void setTracesSampler(e eVar) {
        this.tracesSampler = eVar;
    }

    public void setTransactionProfiler(k0 k0Var) {
        if (k0Var == null) {
            k0Var = j1.c();
        }
        this.transactionProfiler = k0Var;
    }

    public void setTransportFactory(l0 l0Var) {
        if (l0Var == null) {
            l0Var = k1.b();
        }
        this.transportFactory = l0Var;
    }

    public void setTransportGate(qz.q qVar) {
        if (qVar == null) {
            qVar = qz.t.a();
        }
        this.transportGate = qVar;
    }

    private g3(boolean z11) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.enableNdk = true;
        this.logger = c1.e();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.envelopeReader = new m(new y0(this));
        this.serializer = new y0(this);
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = k1.b();
        this.transportGate = qz.t.a();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = f1.e();
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = qz.r.b();
        this.sendDefaultPii = false;
        this.observers = new ArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = d.NONE;
        this.traceSampling = false;
        this.profilingEnabled = false;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = j1.c();
        this.tracingOrigins = new CopyOnWriteArrayList();
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new mz.d(this);
        if (z11) {
            return;
        }
        this.executorService = new d3();
        copyOnWriteArrayList2.add(new h4());
        copyOnWriteArrayList2.add(new s3());
        copyOnWriteArrayList.add(new z0(this));
        copyOnWriteArrayList.add(new l(this));
        if (rz.l.a()) {
            copyOnWriteArrayList.add(new h3());
        }
        setSentryClientName("sentry.java/6.1.4");
        setSdkVersion(createSdkVersion());
    }
}