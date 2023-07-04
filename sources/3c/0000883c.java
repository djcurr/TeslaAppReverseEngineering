package mz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<c, AtomicLong> f39650a;

    public a() {
        e[] values;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (e eVar : e.values()) {
            for (io.sentry.f fVar : io.sentry.f.values()) {
                concurrentHashMap.put(new c(eVar.getReason(), fVar.getCategory()), new AtomicLong(0L));
            }
        }
        this.f39650a = Collections.unmodifiableMap(concurrentHashMap);
    }

    @Override // mz.h
    public void a(c cVar, Long l11) {
        AtomicLong atomicLong = this.f39650a.get(cVar);
        if (atomicLong != null) {
            atomicLong.addAndGet(l11.longValue());
        }
    }

    @Override // mz.h
    public List<f> b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<c, AtomicLong> entry : this.f39650a.entrySet()) {
            Long valueOf = Long.valueOf(entry.getValue().getAndSet(0L));
            if (valueOf.longValue() > 0) {
                arrayList.add(new f(entry.getKey().b(), entry.getKey().a(), valueOf));
            }
        }
        return arrayList;
    }
}