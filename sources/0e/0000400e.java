package com.plaid.internal.core.analytics.batch;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.s;
import zz.d;

/* loaded from: classes2.dex */
public final class AnalyticsBatchUploadWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsBatchUploadWorker(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        s.g(appContext, "appContext");
        s.g(workerParams, "workerParams");
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(d<? super ListenableWorker.a> dVar) {
        ListenableWorker.a c11 = ListenableWorker.a.c();
        s.f(c11, "success()");
        return c11;
    }
}