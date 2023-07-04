package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import ph.o;
import ph.t;

/* loaded from: classes3.dex */
public class JobInfoSchedulerService extends JobService {
    public static /* synthetic */ void a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        jobInfoSchedulerService.b(jobParameters);
    }

    public /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i11 = jobParameters.getExtras().getInt("priority");
        int i12 = jobParameters.getExtras().getInt("attemptNumber");
        t.f(getApplicationContext());
        o.a d11 = o.a().b(string).d(bi.a.b(i11));
        if (string2 != null) {
            d11.c(Base64.decode(string2, 0));
        }
        t.c().e().v(d11.a(), i12, new Runnable() { // from class: xh.d
            {
                JobInfoSchedulerService.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.a(JobInfoSchedulerService.this, jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}