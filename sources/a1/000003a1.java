package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class y {
    public static y a(Executor executor, Handler handler) {
        return new a(executor, handler);
    }

    public abstract Executor b();

    public abstract Handler c();
}