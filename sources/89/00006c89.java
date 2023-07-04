package f;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* renamed from: f.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0496a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f25473a;

        public C0496a(T t11) {
            this.f25473a = t11;
        }

        public final T a() {
            return this.f25473a;
        }
    }

    public abstract Intent createIntent(Context context, I i11);

    public C0496a<O> getSynchronousResult(Context context, I i11) {
        s.g(context, "context");
        return null;
    }

    public abstract O parseResult(int i11, Intent intent);
}