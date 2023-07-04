package androidx.transition;

import android.os.IBinder;

/* loaded from: classes.dex */
class y0 implements a1 {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f6265a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(IBinder iBinder) {
        this.f6265a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof y0) && ((y0) obj).f6265a.equals(this.f6265a);
    }

    public int hashCode() {
        return this.f6265a.hashCode();
    }
}