package com.google.firebase.installations;

import com.google.firebase.installations.f;
import java.util.Objects;

/* loaded from: classes2.dex */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f16672a;

    /* renamed from: b  reason: collision with root package name */
    private final long f16673b;

    /* renamed from: c  reason: collision with root package name */
    private final long f16674c;

    /* loaded from: classes2.dex */
    static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f16675a;

        /* renamed from: b  reason: collision with root package name */
        private Long f16676b;

        /* renamed from: c  reason: collision with root package name */
        private Long f16677c;

        @Override // com.google.firebase.installations.f.a
        public f a() {
            String str = "";
            if (this.f16675a == null) {
                str = " token";
            }
            if (this.f16676b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f16677c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f16675a, this.f16676b.longValue(), this.f16677c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.f.a
        public f.a b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f16675a = str;
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a c(long j11) {
            this.f16677c = Long.valueOf(j11);
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a d(long j11) {
            this.f16676b = Long.valueOf(j11);
            return this;
        }
    }

    @Override // com.google.firebase.installations.f
    public String b() {
        return this.f16672a;
    }

    @Override // com.google.firebase.installations.f
    public long c() {
        return this.f16674c;
    }

    @Override // com.google.firebase.installations.f
    public long d() {
        return this.f16673b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f16672a.equals(fVar.b()) && this.f16673b == fVar.d() && this.f16674c == fVar.c();
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f16673b;
        long j12 = this.f16674c;
        return ((((this.f16672a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f16672a + ", tokenExpirationTimestamp=" + this.f16673b + ", tokenCreationTimestamp=" + this.f16674c + "}";
    }

    private a(String str, long j11, long j12) {
        this.f16672a = str;
        this.f16673b = j11;
        this.f16674c = j12;
    }
}