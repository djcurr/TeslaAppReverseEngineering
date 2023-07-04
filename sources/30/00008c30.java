package net.time4j.tz.model;

import java.util.Objects;
import net.time4j.g0;
import net.time4j.h0;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private final transient long f41572a;

    /* renamed from: b  reason: collision with root package name */
    private final transient h0 f41573b;

    /* renamed from: c  reason: collision with root package name */
    private final transient i f41574c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f41575d;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(int i11, i iVar, int i12) {
        Objects.requireNonNull(iVar, "Missing offset indicator.");
        if (i12 != Integer.MAX_VALUE && (i12 < -64800 || i12 > 64800)) {
            throw new IllegalArgumentException("DST out of range: " + i12);
        }
        if (i11 == 86400) {
            this.f41572a = 0L;
            this.f41573b = h0.F0();
        } else {
            net.time4j.k W0 = h0.H0().W0(i11, net.time4j.h.SECONDS);
            this.f41572a = W0.a();
            this.f41573b = W0.b();
        }
        this.f41574c = iVar;
        this.f41575d = i12 == Integer.MAX_VALUE ? 0 : i12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a() {
        net.time4j.format.c cVar = (net.time4j.format.c) getClass().getAnnotation(net.time4j.format.c.class);
        if (cVar != null) {
            return cVar.value();
        }
        throw new IllegalStateException("Cannot find calendar type annotation: " + getClass());
    }

    public abstract g0 b(int i11);

    /* JADX INFO: Access modifiers changed from: protected */
    public final long c() {
        return this.f41572a;
    }

    public final i d() {
        return this.f41574c;
    }

    public final int e() {
        return this.f41575d;
    }

    public final h0 f() {
        return this.f41573b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int h(long j11);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int i(net.time4j.base.a aVar);
}