package ko;

import android.media.Image;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Image f34886a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Image image) {
        this.f34886a = image;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Image a() {
        return this.f34886a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Image.Plane[] b() {
        return this.f34886a.getPlanes();
    }
}