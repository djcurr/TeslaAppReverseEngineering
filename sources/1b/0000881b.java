package mx;

import com.google.common.base.u;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
class i {

    /* renamed from: a  reason: collision with root package name */
    private final Logger f39604a;

    /* renamed from: b  reason: collision with root package name */
    private final Level f39605b;

    /* loaded from: classes5.dex */
    enum a {
        INBOUND,
        OUTBOUND
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);
        
        private final int bit;

        b(int i11) {
            this.bit = i11;
        }

        public int getBit() {
            return this.bit;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Level level, Class<?> cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    private boolean a() {
        return this.f39604a.isLoggable(this.f39605b);
    }

    private static String l(nx.i iVar) {
        b[] values;
        EnumMap enumMap = new EnumMap(b.class);
        for (b bVar : b.values()) {
            if (iVar.d(bVar.getBit())) {
                enumMap.put((EnumMap) bVar, (b) Integer.valueOf(iVar.a(bVar.getBit())));
            }
        }
        return enumMap.toString();
    }

    private static String m(okio.f fVar) {
        if (fVar.P0() <= 64) {
            return fVar.Q0().n();
        }
        return fVar.R0((int) Math.min(fVar.P0(), 64L)).n() + "...";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(a aVar, int i11, okio.f fVar, int i12, boolean z11) {
        if (a()) {
            Logger logger = this.f39604a;
            Level level = this.f39605b;
            logger.log(level, aVar + " DATA: streamId=" + i11 + " endStream=" + z11 + " length=" + i12 + " bytes=" + m(fVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(a aVar, int i11, nx.a aVar2, okio.i iVar) {
        if (a()) {
            Logger logger = this.f39604a;
            Level level = this.f39605b;
            logger.log(level, aVar + " GO_AWAY: lastStreamId=" + i11 + " errorCode=" + aVar2 + " length=" + iVar.z() + " bytes=" + m(new okio.f().w1(iVar)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(a aVar, int i11, List<nx.d> list, boolean z11) {
        if (a()) {
            Logger logger = this.f39604a;
            Level level = this.f39605b;
            logger.log(level, aVar + " HEADERS: streamId=" + i11 + " headers=" + list + " endStream=" + z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(a aVar, long j11) {
        if (a()) {
            Logger logger = this.f39604a;
            Level level = this.f39605b;
            logger.log(level, aVar + " PING: ack=false bytes=" + j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(a aVar, long j11) {
        if (a()) {
            Logger logger = this.f39604a;
            Level level = this.f39605b;
            logger.log(level, aVar + " PING: ack=true bytes=" + j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(a aVar, int i11, int i12, List<nx.d> list) {
        if (a()) {
            Logger logger = this.f39604a;
            Level level = this.f39605b;
            logger.log(level, aVar + " PUSH_PROMISE: streamId=" + i11 + " promisedStreamId=" + i12 + " headers=" + list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(a aVar, int i11, nx.a aVar2) {
        if (a()) {
            Logger logger = this.f39604a;
            Level level = this.f39605b;
            logger.log(level, aVar + " RST_STREAM: streamId=" + i11 + " errorCode=" + aVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(a aVar, nx.i iVar) {
        if (a()) {
            Logger logger = this.f39604a;
            Level level = this.f39605b;
            logger.log(level, aVar + " SETTINGS: ack=false settings=" + l(iVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(a aVar) {
        if (a()) {
            Logger logger = this.f39604a;
            Level level = this.f39605b;
            logger.log(level, aVar + " SETTINGS: ack=true");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(a aVar, int i11, long j11) {
        if (a()) {
            Logger logger = this.f39604a;
            Level level = this.f39605b;
            logger.log(level, aVar + " WINDOW_UPDATE: streamId=" + i11 + " windowSizeIncrement=" + j11);
        }
    }

    i(Level level, Logger logger) {
        this.f39605b = (Level) u.p(level, "level");
        this.f39604a = (Logger) u.p(logger, "logger");
    }
}