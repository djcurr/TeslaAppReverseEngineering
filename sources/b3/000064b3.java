package d0;

import androidx.camera.core.impl.d0;
import androidx.camera.core.impl.f1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface f extends f1 {

    /* renamed from: q  reason: collision with root package name */
    public static final d0.a<Executor> f23254q = d0.a.a("camerax.core.thread.backgroundExecutor", Executor.class);

    default Executor B(Executor executor) {
        return (Executor) g(f23254q, executor);
    }
}