package net.time4j.history;

import net.time4j.engine.z;
import net.time4j.g0;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    final long f41388a;

    /* renamed from: b  reason: collision with root package name */
    final c f41389b;

    /* renamed from: c  reason: collision with root package name */
    final h f41390c;

    /* renamed from: d  reason: collision with root package name */
    final h f41391d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(long j11, c cVar, c cVar2) {
        this.f41388a = j11;
        this.f41389b = cVar2;
        if (j11 == Long.MIN_VALUE) {
            h hVar = new h(j.BC, Http2Connection.DEGRADED_PONG_TIMEOUT_NS, 1, 1);
            this.f41390c = hVar;
            this.f41391d = hVar;
            return;
        }
        this.f41390c = cVar2.fromMJD(j11);
        this.f41391d = cVar.fromMJD(j11 - 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f41388a == fVar.f41388a && this.f41389b == fVar.f41389b && this.f41391d.equals(fVar.f41391d);
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f41388a;
        return (int) (j11 ^ (j11 >>> 32));
    }

    public String toString() {
        return f.class.getName() + "[start=" + this.f41388a + " (" + g0.V0(this.f41388a, z.MODIFIED_JULIAN_DATE) + "),algorithm=" + this.f41389b + ",date-before-cutover=" + this.f41391d + ",date-at-cutover=" + this.f41390c + ']';
    }
}