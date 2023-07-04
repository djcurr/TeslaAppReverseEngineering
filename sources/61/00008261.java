package l5;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class k implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}