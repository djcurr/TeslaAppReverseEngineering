package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class j3 {

    /* renamed from: a  reason: collision with root package name */
    private final i3 f32309a;

    /* renamed from: b  reason: collision with root package name */
    private final g3 f32310b;

    public j3(i3 i3Var, g3 g3Var) {
        this.f32309a = (i3) rz.j.a(i3Var, "The SentryStackTraceFactory is required.");
        this.f32310b = (g3) rz.j.a(g3Var, "The SentryOptions is required");
    }

    private io.sentry.protocol.u d(boolean z11, StackTraceElement[] stackTraceElementArr, Thread thread) {
        io.sentry.protocol.u uVar = new io.sentry.protocol.u();
        uVar.o(thread.getName());
        uVar.p(Integer.valueOf(thread.getPriority()));
        uVar.n(Long.valueOf(thread.getId()));
        uVar.m(Boolean.valueOf(thread.isDaemon()));
        uVar.r(thread.getState().name());
        uVar.k(Boolean.valueOf(z11));
        List<io.sentry.protocol.s> a11 = this.f32309a.a(stackTraceElementArr);
        if (this.f32310b.isAttachStacktrace() && a11 != null && !a11.isEmpty()) {
            io.sentry.protocol.t tVar = new io.sentry.protocol.t(a11);
            tVar.d(Boolean.TRUE);
            uVar.q(tVar);
        }
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<io.sentry.protocol.u> a() {
        HashMap hashMap = new HashMap();
        Thread currentThread = Thread.currentThread();
        hashMap.put(currentThread, currentThread.getStackTrace());
        return c(hashMap, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<io.sentry.protocol.u> b(List<Long> list) {
        return c(Thread.getAllStackTraces(), list);
    }

    List<io.sentry.protocol.u> c(Map<Thread, StackTraceElement[]> map, List<Long> list) {
        Thread currentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(currentThread)) {
            map.put(currentThread, currentThread.getStackTrace());
        }
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            Thread key = entry.getKey();
            arrayList.add(d(key == currentThread || (list != null && list.contains(Long.valueOf(key.getId()))), entry.getValue(), entry.getKey()));
        }
        return arrayList;
    }
}