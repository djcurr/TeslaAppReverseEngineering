package s0;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final k f49911a;

    /* renamed from: b  reason: collision with root package name */
    private final r0.k f49912b;

    /* renamed from: c  reason: collision with root package name */
    private final x f49913c;

    /* renamed from: d  reason: collision with root package name */
    private final long f49914d;

    private v(long j11, boolean z11, k kVar, r0.k kVar2, x xVar) {
        this.f49911a = kVar;
        this.f49912b = kVar2;
        this.f49913c = xVar;
        this.f49914d = x2.c.b(0, z11 ? x2.b.n(j11) : Integer.MAX_VALUE, 0, z11 ? Integer.MAX_VALUE : x2.b.m(j11), 5, null);
    }

    public /* synthetic */ v(long j11, boolean z11, k kVar, r0.k kVar2, x xVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, z11, kVar, kVar2, xVar);
    }

    public final u a(int i11) {
        return this.f49913c.a(i11, this.f49911a.d(i11), this.f49912b.a(i11, b()));
    }

    public final long b() {
        return this.f49914d;
    }

    public final Map<Object, Integer> c() {
        return this.f49911a.a();
    }
}