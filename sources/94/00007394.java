package hn;

import com.google.firebase.perf.v1.TraceMetric;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    private static final fn.a f29349b = fn.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final TraceMetric f29350a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(TraceMetric traceMetric) {
        this.f29350a = traceMetric;
    }

    private boolean g(TraceMetric traceMetric) {
        return h(traceMetric, 0);
    }

    private boolean h(TraceMetric traceMetric, int i11) {
        if (traceMetric == null) {
            return false;
        }
        if (i11 > 1) {
            f29349b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : traceMetric.getCountersMap().entrySet()) {
            if (!l(entry.getKey())) {
                fn.a aVar = f29349b;
                aVar.j("invalid CounterId:" + entry.getKey());
                return false;
            } else if (!m(entry.getValue())) {
                fn.a aVar2 = f29349b;
                aVar2.j("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        for (TraceMetric traceMetric2 : traceMetric.getSubtracesList()) {
            if (!h(traceMetric2, i11 + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean i(TraceMetric traceMetric) {
        boolean z11;
        if (traceMetric.getCountersCount() > 0) {
            return true;
        }
        for (TraceMetric traceMetric2 : traceMetric.getSubtracesList()) {
            if (traceMetric2.getCountersCount() > 0) {
                z11 = true;
                continue;
            } else {
                z11 = false;
                continue;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    private boolean j(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String d11 = e.d(entry);
            if (d11 != null) {
                f29349b.j(d11);
                return false;
            }
        }
        return true;
    }

    private boolean k(TraceMetric traceMetric) {
        return traceMetric.getName().startsWith("_st_");
    }

    private boolean l(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            f29349b.j("counterId is empty");
            return false;
        } else if (trim.length() > 100) {
            f29349b.j("counterId exceeded max length 100");
            return false;
        } else {
            return true;
        }
    }

    private boolean m(Long l11) {
        return l11 != null;
    }

    private boolean n(TraceMetric traceMetric) {
        Long l11 = traceMetric.getCountersMap().get(com.google.firebase.perf.util.b.FRAMES_TOTAL.toString());
        return l11 != null && l11.compareTo((Long) 0L) > 0;
    }

    private boolean o(TraceMetric traceMetric, int i11) {
        if (traceMetric == null) {
            f29349b.j("TraceMetric is null");
            return false;
        } else if (i11 > 1) {
            f29349b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!q(traceMetric.getName())) {
            fn.a aVar = f29349b;
            aVar.j("invalid TraceId:" + traceMetric.getName());
            return false;
        } else if (!p(traceMetric)) {
            fn.a aVar2 = f29349b;
            aVar2.j("invalid TraceDuration:" + traceMetric.getDurationUs());
            return false;
        } else if (!traceMetric.hasClientStartTimeUs()) {
            f29349b.j("clientStartTimeUs is null.");
            return false;
        } else if (k(traceMetric) && !n(traceMetric)) {
            fn.a aVar3 = f29349b;
            aVar3.j("non-positive totalFrames in screen trace " + traceMetric.getName());
            return false;
        } else {
            for (TraceMetric traceMetric2 : traceMetric.getSubtracesList()) {
                if (!o(traceMetric2, i11 + 1)) {
                    return false;
                }
            }
            return j(traceMetric.getCustomAttributesMap());
        }
    }

    private boolean p(TraceMetric traceMetric) {
        return traceMetric != null && traceMetric.getDurationUs() > 0;
    }

    private boolean q(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        return !trim.isEmpty() && trim.length() <= 100;
    }

    @Override // hn.e
    public boolean c() {
        if (!o(this.f29350a, 0)) {
            fn.a aVar = f29349b;
            aVar.j("Invalid Trace:" + this.f29350a.getName());
            return false;
        } else if (!i(this.f29350a) || g(this.f29350a)) {
            return true;
        } else {
            fn.a aVar2 = f29349b;
            aVar2.j("Invalid Counters for Trace:" + this.f29350a.getName());
            return false;
        }
    }
}