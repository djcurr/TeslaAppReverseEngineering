package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.c;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
final class b extends c.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f13013a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13014b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<c.EnumC0245c> f13015c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0244b extends c.b.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f13016a;

        /* renamed from: b  reason: collision with root package name */
        private Long f13017b;

        /* renamed from: c  reason: collision with root package name */
        private Set<c.EnumC0245c> f13018c;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c.b.a
        public c.b a() {
            String str = "";
            if (this.f13016a == null) {
                str = " delta";
            }
            if (this.f13017b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f13018c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new b(this.f13016a.longValue(), this.f13017b.longValue(), this.f13018c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c.b.a
        public c.b.a b(long j11) {
            this.f13016a = Long.valueOf(j11);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c.b.a
        public c.b.a c(Set<c.EnumC0245c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f13018c = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c.b.a
        public c.b.a d(long j11) {
            this.f13017b = Long.valueOf(j11);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c.b
    long b() {
        return this.f13013a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c.b
    Set<c.EnumC0245c> c() {
        return this.f13015c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c.b
    long d() {
        return this.f13014b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c.b) {
            c.b bVar = (c.b) obj;
            return this.f13013a == bVar.b() && this.f13014b == bVar.d() && this.f13015c.equals(bVar.c());
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f13013a;
        long j12 = this.f13014b;
        return ((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f13015c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f13013a + ", maxAllowedDelay=" + this.f13014b + ", flags=" + this.f13015c + "}";
    }

    private b(long j11, long j12, Set<c.EnumC0245c> set) {
        this.f13013a = j11;
        this.f13014b = j12;
        this.f13015c = set;
    }
}