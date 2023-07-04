package d5;

import android.os.Handler;
import android.os.Looper;
import androidx.work.y;

/* loaded from: classes.dex */
public class a implements y {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f23609a = r3.f.a(Looper.getMainLooper());

    @Override // androidx.work.y
    public void a(Runnable runnable) {
        this.f23609a.removeCallbacks(runnable);
    }

    @Override // androidx.work.y
    public void b(long j11, Runnable runnable) {
        this.f23609a.postDelayed(runnable, j11);
    }
}