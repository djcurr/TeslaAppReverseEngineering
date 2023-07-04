package androidx.work;

import android.os.Build;
import androidx.work.c0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class v extends c0 {

    /* loaded from: classes.dex */
    public static final class a extends c0.a<a, v> {
        public a(Class<? extends ListenableWorker> cls, long j11, TimeUnit timeUnit, long j12, TimeUnit timeUnit2) {
            super(cls);
            this.f6535c.f(timeUnit.toMillis(j11), timeUnit2.toMillis(j12));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.c0.a
        /* renamed from: i */
        public v c() {
            if (this.f6533a && Build.VERSION.SDK_INT >= 23 && this.f6535c.f34414j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (!this.f6535c.f34421q) {
                return new v(this);
            }
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.c0.a
        /* renamed from: j */
        public a d() {
            return this;
        }
    }

    v(a aVar) {
        super(aVar.f6534b, aVar.f6535c, aVar.f6536d);
    }
}