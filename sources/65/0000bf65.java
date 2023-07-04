package xh;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* loaded from: classes3.dex */
public class c implements v {

    /* renamed from: a  reason: collision with root package name */
    private final Context f57391a;

    /* renamed from: b  reason: collision with root package name */
    private final yh.d f57392b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.c f57393c;

    public c(Context context, yh.d dVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar) {
        this.f57391a = context;
        this.f57392b = dVar;
        this.f57393c = cVar;
    }

    private boolean d(JobScheduler jobScheduler, int i11, int i12) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i13 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i11) {
                return i13 >= i12;
            }
        }
        return false;
    }

    @Override // xh.v
    public void a(ph.o oVar, int i11) {
        b(oVar, i11, false);
    }

    @Override // xh.v
    public void b(ph.o oVar, int i11, boolean z11) {
        ComponentName componentName = new ComponentName(this.f57391a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f57391a.getSystemService("jobscheduler");
        int c11 = c(oVar);
        if (!z11 && d(jobScheduler, c11, i11)) {
            uh.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long S = this.f57392b.S(oVar);
        JobInfo.Builder c12 = this.f57393c.c(new JobInfo.Builder(c11, componentName), oVar.d(), S, i11);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i11);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt("priority", bi.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        c12.setExtras(persistableBundle);
        uh.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c11), Long.valueOf(this.f57393c.g(oVar.d(), S, i11)), Long.valueOf(S), Integer.valueOf(i11));
        jobScheduler.schedule(c12.build());
    }

    int c(ph.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f57391a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(bi.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}