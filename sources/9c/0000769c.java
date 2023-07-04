package io.grpc.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final k2 f31065a;

    /* renamed from: b  reason: collision with root package name */
    private final d1 f31066b = e1.a();

    /* renamed from: c  reason: collision with root package name */
    private final d1 f31067c = e1.a();

    /* renamed from: d  reason: collision with root package name */
    private final d1 f31068d = e1.a();

    /* loaded from: classes5.dex */
    class a implements b {
        a() {
        }

        @Override // io.grpc.internal.m.b
        public m create() {
            return new m(k2.f31033a);
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        m create();
    }

    static {
        new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(k2 k2Var) {
        this.f31065a = k2Var;
    }

    public void a(boolean z11) {
        if (z11) {
            this.f31067c.a(1L);
        } else {
            this.f31068d.a(1L);
        }
    }

    public void b() {
        this.f31066b.a(1L);
        this.f31065a.a();
    }
}