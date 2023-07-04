package or;

import kotlin.jvm.internal.s;
import or.e;
import v20.a2;

/* loaded from: classes2.dex */
public final class g implements e.a<g> {

    /* renamed from: a  reason: collision with root package name */
    private final String f42959a;

    /* renamed from: b  reason: collision with root package name */
    private final a2 f42960b;

    /* renamed from: c  reason: collision with root package name */
    private g f42961c;

    public g(String key, a2 job) {
        s.g(key, "key");
        s.g(job, "job");
        this.f42959a = key;
        this.f42960b = job;
    }

    public final a2 c() {
        return this.f42960b;
    }

    public final String d() {
        return this.f42959a;
    }

    @Override // or.e.a
    /* renamed from: e */
    public g a() {
        return this.f42961c;
    }

    @Override // or.e.a
    /* renamed from: f */
    public void b(g gVar) {
        this.f42961c = gVar;
    }
}