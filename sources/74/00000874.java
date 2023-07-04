package androidx.room;

import androidx.room.t0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class k0 implements v4.h, q {

    /* renamed from: a  reason: collision with root package name */
    private final v4.h f5785a;

    /* renamed from: b  reason: collision with root package name */
    private final t0.f f5786b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f5787c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(v4.h hVar, t0.f fVar, Executor executor) {
        this.f5785a = hVar;
        this.f5786b = fVar;
        this.f5787c = executor;
    }

    @Override // v4.h
    public v4.g W0() {
        return new j0(this.f5785a.W0(), this.f5786b, this.f5787c);
    }

    @Override // v4.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5785a.close();
    }

    @Override // v4.h
    public String getDatabaseName() {
        return this.f5785a.getDatabaseName();
    }

    @Override // androidx.room.q
    public v4.h getDelegate() {
        return this.f5785a;
    }

    @Override // v4.h
    public void setWriteAheadLoggingEnabled(boolean z11) {
        this.f5785a.setWriteAheadLoggingEnabled(z11);
    }
}