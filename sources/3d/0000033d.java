package androidx.camera.core.impl;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class a extends y {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2253a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f2254b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Executor executor, Handler handler) {
        Objects.requireNonNull(executor, "Null cameraExecutor");
        this.f2253a = executor;
        Objects.requireNonNull(handler, "Null schedulerHandler");
        this.f2254b = handler;
    }

    @Override // androidx.camera.core.impl.y
    public Executor b() {
        return this.f2253a;
    }

    @Override // androidx.camera.core.impl.y
    public Handler c() {
        return this.f2254b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return this.f2253a.equals(yVar.b()) && this.f2254b.equals(yVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2253a.hashCode() ^ 1000003) * 1000003) ^ this.f2254b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f2253a + ", schedulerHandler=" + this.f2254b + "}";
    }
}