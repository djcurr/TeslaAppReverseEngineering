package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.c;
import java.util.Map;
import java.util.Objects;
import nh.d;

/* loaded from: classes3.dex */
final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private final ai.a f13011a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<d, c.b> f13012b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(ai.a aVar, Map<d, c.b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f13011a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f13012b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c
    ai.a e() {
        return this.f13011a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f13011a.equals(cVar.e()) && this.f13012b.equals(cVar.h());
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c
    Map<d, c.b> h() {
        return this.f13012b;
    }

    public int hashCode() {
        return ((this.f13011a.hashCode() ^ 1000003) * 1000003) ^ this.f13012b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f13011a + ", values=" + this.f13012b + "}";
    }
}