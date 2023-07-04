package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0114a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final e f6465a;

            public C0114a() {
                this(e.f6542c);
            }

            public e e() {
                return this.f6465a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0114a.class != obj.getClass()) {
                    return false;
                }
                return this.f6465a.equals(((C0114a) obj).f6465a);
            }

            public int hashCode() {
                return (C0114a.class.getName().hashCode() * 31) + this.f6465a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f6465a + CoreConstants.CURLY_RIGHT;
            }

            public C0114a(e eVar) {
                this.f6465a = eVar;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final e f6466a;

            public c() {
                this(e.f6542c);
            }

            public e e() {
                return this.f6466a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f6466a.equals(((c) obj).f6466a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f6466a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f6466a + CoreConstants.CURLY_RIGHT;
            }

            public c(e eVar) {
                this.f6466a = eVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0114a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(e eVar) {
            return new c(eVar);
        }
    }

    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
            return;
        }
        throw new IllegalArgumentException("WorkerParameters is null");
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    public com.google.common.util.concurrent.c<i> getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.c t11 = androidx.work.impl.utils.futures.c.t();
        t11.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return t11;
    }

    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    public final e getInputData() {
        return this.mWorkerParams.d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.h();
    }

    public m5.a getTaskExecutor() {
        return this.mWorkerParams.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.k();
    }

    public d0 getWorkerFactory() {
        return this.mWorkerParams.l();
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final com.google.common.util.concurrent.c<Void> setForegroundAsync(i iVar) {
        this.mRunInForeground = true;
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), iVar);
    }

    public com.google.common.util.concurrent.c<Void> setProgressAsync(e eVar) {
        return this.mWorkerParams.f().a(getApplicationContext(), getId(), eVar);
    }

    public void setRunInForeground(boolean z11) {
        this.mRunInForeground = z11;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract com.google.common.util.concurrent.c<a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}