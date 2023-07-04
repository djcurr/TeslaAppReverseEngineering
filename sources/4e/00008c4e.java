package net.time4j;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.time4j.engine.j0;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public final class z<U> implements net.time4j.engine.j0<U>, Comparable<z<U>>, Serializable {

    /* renamed from: d  reason: collision with root package name */
    private static final z<TimeUnit> f41610d;

    /* renamed from: e  reason: collision with root package name */
    private static final z<n0> f41611e;
    private static final long serialVersionUID = -4150291820807606229L;

    /* renamed from: a  reason: collision with root package name */
    private final transient long f41612a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f41613b;

    /* renamed from: c  reason: collision with root package name */
    private final transient m30.f f41614c;

    /* loaded from: classes5.dex */
    private static class b<U> implements net.time4j.engine.h0<TimeUnit, z<U>> {
        private b(m30.f fVar) {
        }
    }

    static {
        m30.f fVar = m30.f.POSIX;
        f41610d = new z<>(0L, 0, fVar);
        m30.f fVar2 = m30.f.UTC;
        f41611e = new z<>(0L, 0, fVar2);
        new b(fVar);
        new b(fVar2);
    }

    private z(long j11, int i11, m30.f fVar) {
        while (i11 < 0) {
            i11 += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            j11 = net.time4j.base.c.m(j11, 1L);
        }
        while (i11 >= 1000000000) {
            i11 -= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            j11 = net.time4j.base.c.f(j11, 1L);
        }
        if (j11 < 0 && i11 > 0) {
            j11++;
            i11 -= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        }
        this.f41612a = j11;
        this.f41613b = i11;
        this.f41614c = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T c(Object obj) {
        return obj;
    }

    private void e(StringBuilder sb2) {
        if (a()) {
            sb2.append(CoreConstants.DASH_CHAR);
            sb2.append(Math.abs(this.f41612a));
        } else {
            sb2.append(this.f41612a);
        }
        if (this.f41613b != 0) {
            sb2.append(CoreConstants.DOT);
            String valueOf = String.valueOf(Math.abs(this.f41613b));
            for (int length = 9 - valueOf.length(); length > 0; length--) {
                sb2.append('0');
            }
            sb2.append(valueOf);
        }
    }

    public static z<TimeUnit> i(long j11, int i11) {
        if (j11 == 0 && i11 == 0) {
            return f41610d;
        }
        return new z<>(j11, i11, m30.f.POSIX);
    }

    public static z<n0> k(long j11, int i11) {
        if (j11 == 0 && i11 == 0) {
            return f41611e;
        }
        return new z<>(j11, i11, m30.f.UTC);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 5);
    }

    @Override // net.time4j.engine.j0
    public boolean a() {
        return this.f41612a < 0 || this.f41613b < 0;
    }

    @Override // net.time4j.engine.j0
    public List<j0.a<U>> b() {
        ArrayList arrayList = new ArrayList(2);
        if (this.f41612a != 0) {
            arrayList.add(j0.a.c(Math.abs(this.f41612a), c(this.f41614c == m30.f.UTC ? n0.SECONDS : TimeUnit.SECONDS)));
        }
        if (this.f41613b != 0) {
            arrayList.add(j0.a.c(Math.abs(this.f41613b), c(this.f41614c == m30.f.UTC ? n0.NANOSECONDS : TimeUnit.NANOSECONDS)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(z<U> zVar) {
        if (this.f41614c == zVar.f41614c) {
            long j11 = this.f41612a;
            long j12 = zVar.f41612a;
            if (j11 < j12) {
                return -1;
            }
            if (j11 > j12) {
                return 1;
            }
            return this.f41613b - zVar.f41613b;
        }
        throw new ClassCastException("Different time scales.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return this.f41612a == zVar.f41612a && this.f41613b == zVar.f41613b && this.f41614c == zVar.f41614c;
        }
        return false;
    }

    public int f() {
        int i11 = this.f41613b;
        return i11 < 0 ? i11 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS : i11;
    }

    public m30.f g() {
        return this.f41614c;
    }

    public long h() {
        long j11 = this.f41612a;
        return this.f41613b < 0 ? j11 - 1 : j11;
    }

    public int hashCode() {
        long j11 = this.f41612a;
        return ((((CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384 + ((int) (j11 ^ (j11 >>> 32)))) * 23) + this.f41613b) * 23) + this.f41614c.hashCode();
    }

    @Override // net.time4j.engine.j0
    public boolean isEmpty() {
        return this.f41612a == 0 && this.f41613b == 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        e(sb2);
        sb2.append("s [");
        sb2.append(this.f41614c.name());
        sb2.append(']');
        return sb2.toString();
    }
}