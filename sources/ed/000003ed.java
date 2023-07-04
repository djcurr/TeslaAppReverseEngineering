package androidx.camera.lifecycle;

import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.v;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends LifecycleCameraRepository.a {

    /* renamed from: a  reason: collision with root package name */
    private final v f2575a;

    /* renamed from: b  reason: collision with root package name */
    private final CameraUseCaseAdapter.a f2576b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(v vVar, CameraUseCaseAdapter.a aVar) {
        Objects.requireNonNull(vVar, "Null lifecycleOwner");
        this.f2575a = vVar;
        Objects.requireNonNull(aVar, "Null cameraId");
        this.f2576b = aVar;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.a
    public CameraUseCaseAdapter.a b() {
        return this.f2576b;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.a
    public v c() {
        return this.f2575a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LifecycleCameraRepository.a) {
            LifecycleCameraRepository.a aVar = (LifecycleCameraRepository.a) obj;
            return this.f2575a.equals(aVar.c()) && this.f2576b.equals(aVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2575a.hashCode() ^ 1000003) * 1000003) ^ this.f2576b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f2575a + ", cameraId=" + this.f2576b + "}";
    }
}