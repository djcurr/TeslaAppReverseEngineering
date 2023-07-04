package ak;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public class d0 implements b {
    @Override // ak.b
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // ak.b
    public j b(Looper looper, Handler.Callback callback) {
        return new e0(new Handler(looper, callback));
    }

    @Override // ak.b
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}