package fe;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static final c f26211b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f26212c = true;

    /* renamed from: a  reason: collision with root package name */
    private final Queue<a> f26213a = new ArrayBlockingQueue(20);

    /* loaded from: classes.dex */
    public enum a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    private c() {
    }

    public static c a() {
        return f26212c ? new c() : f26211b;
    }

    public void b(a aVar) {
        if (f26212c) {
            if (this.f26213a.size() + 1 > 20) {
                this.f26213a.poll();
            }
            this.f26213a.add(aVar);
        }
    }

    public String toString() {
        return this.f26213a.toString();
    }
}