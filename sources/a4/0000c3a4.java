package yy;

/* loaded from: classes5.dex */
public final class d {
    public static void a() {
        if (az.a.j()) {
            if ((Thread.currentThread() instanceof vy.i) || az.a.p()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}