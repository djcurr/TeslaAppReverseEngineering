package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import ch.qos.logback.core.CoreConstants;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import nh.d;

/* loaded from: classes3.dex */
public abstract class c {

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private ai.a f13019a;

        /* renamed from: b  reason: collision with root package name */
        private Map<d, b> f13020b = new HashMap();

        public a a(d dVar, b bVar) {
            this.f13020b.put(dVar, bVar);
            return this;
        }

        public c b() {
            Objects.requireNonNull(this.f13019a, "missing required property: clock");
            if (this.f13020b.keySet().size() >= d.values().length) {
                Map<d, b> map = this.f13020b;
                this.f13020b = new HashMap();
                return c.d(this.f13019a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        public a c(ai.a aVar) {
            this.f13019a = aVar;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b {

        /* loaded from: classes3.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j11);

            public abstract a c(Set<EnumC0245c> set);

            public abstract a d(long j11);
        }

        public static a a() {
            return new b.C0244b().c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Set<EnumC0245c> c();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long d();
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0245c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i11, long j11) {
        int i12;
        return (long) (Math.pow(3.0d, i11 - 1) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j11 > 1 ? j11 : 2L) * i12)));
    }

    public static a b() {
        return new a();
    }

    static c d(ai.a aVar, Map<d, b> map) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(aVar, map);
    }

    public static c f(ai.a aVar) {
        return b().a(d.DEFAULT, b.a().b(30000L).d(CoreConstants.MILLIS_IN_ONE_DAY).a()).a(d.HIGHEST, b.a().b(1000L).d(CoreConstants.MILLIS_IN_ONE_DAY).a()).a(d.VERY_LOW, b.a().b(CoreConstants.MILLIS_IN_ONE_DAY).d(CoreConstants.MILLIS_IN_ONE_DAY).c(i(EnumC0245c.NETWORK_UNMETERED, EnumC0245c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<EnumC0245c> set) {
        if (set.contains(EnumC0245c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(EnumC0245c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(EnumC0245c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, d dVar, long j11, int i11) {
        builder.setMinimumLatency(g(dVar, j11, i11));
        j(builder, h().get(dVar).c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract ai.a e();

    public long g(d dVar, long j11, int i11) {
        long a11 = j11 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i11, bVar.b()), a11), bVar.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<d, b> h();
}