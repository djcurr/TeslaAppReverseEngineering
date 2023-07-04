package ak;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f439a = new d0();

    long a();

    j b(Looper looper, Handler.Callback callback);

    long elapsedRealtime();
}