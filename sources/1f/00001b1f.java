package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.b;
import java.util.Objects;

/* loaded from: classes3.dex */
final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f13009a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13010b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b.a aVar, long j11) {
        Objects.requireNonNull(aVar, "Null status");
        this.f13009a = aVar;
        this.f13010b = j11;
    }

    @Override // com.google.android.datatransport.runtime.backends.b
    public long b() {
        return this.f13010b;
    }

    @Override // com.google.android.datatransport.runtime.backends.b
    public b.a c() {
        return this.f13009a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f13009a.equals(bVar.c()) && this.f13010b == bVar.b();
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f13010b;
        return ((this.f13009a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f13009a + ", nextRequestWaitMillis=" + this.f13010b + "}";
    }
}