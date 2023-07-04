package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
class z0 implements a1 {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f6266a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(View view) {
        this.f6266a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof z0) && ((z0) obj).f6266a.equals(this.f6266a);
    }

    public int hashCode() {
        return this.f6266a.hashCode();
    }
}