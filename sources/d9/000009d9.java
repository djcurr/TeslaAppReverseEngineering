package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import androidx.work.q;
import d5.b;
import d5.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* renamed from: c  reason: collision with root package name */
    private static final String f6614c = q.f("SystemJobService");

    /* renamed from: a  reason: collision with root package name */
    private i f6615a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, JobParameters> f6616b = new HashMap();

    private static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // d5.b
    public void e(String str, boolean z11) {
        JobParameters remove;
        q.c().a(f6614c, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f6616b) {
            remove = this.f6616b.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z11);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            i r11 = i.r(getApplicationContext());
            this.f6615a = r11;
            r11.t().c(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                q.c().h(f6614c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        i iVar = this.f6615a;
        if (iVar != null) {
            iVar.t().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f6615a == null) {
            q.c().a(f6614c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String a11 = a(jobParameters);
        if (TextUtils.isEmpty(a11)) {
            q.c().b(f6614c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f6616b) {
            if (this.f6616b.containsKey(a11)) {
                q.c().a(f6614c, String.format("Job is already being executed by SystemJobService: %s", a11), new Throwable[0]);
                return false;
            }
            q.c().a(f6614c, String.format("onStartJob for %s", a11), new Throwable[0]);
            this.f6616b.put(a11, jobParameters);
            WorkerParameters.a aVar = null;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.f6481b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.f6480a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i11 >= 28) {
                    aVar.f6482c = jobParameters.getNetwork();
                }
            }
            this.f6615a.C(a11, aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f6615a == null) {
            q.c().a(f6614c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a11 = a(jobParameters);
        if (TextUtils.isEmpty(a11)) {
            q.c().b(f6614c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        q.c().a(f6614c, String.format("onStopJob for %s", a11), new Throwable[0]);
        synchronized (this.f6616b) {
            this.f6616b.remove(a11);
        }
        this.f6615a.E(a11);
        return !this.f6615a.t().f(a11);
    }
}