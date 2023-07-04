package com.google.android.gms.common.api;

import com.google.android.gms.common.api.PendingResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zab implements PendingResult.StatusListener {
    final /* synthetic */ Batch zaa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zab(Batch batch) {
        this.zaa = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        Object obj;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        Status status2;
        PendingResult[] pendingResultArr;
        obj = this.zaa.zai;
        synchronized (obj) {
            if (this.zaa.isCanceled()) {
                return;
            }
            if (status.isCanceled()) {
                this.zaa.zag = true;
            } else if (!status.isSuccess()) {
                this.zaa.zaf = true;
            }
            Batch batch = this.zaa;
            i11 = batch.zae;
            batch.zae = i11 - 1;
            Batch batch2 = this.zaa;
            i12 = batch2.zae;
            if (i12 == 0) {
                z11 = batch2.zag;
                if (z11) {
                    super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                } else {
                    z12 = batch2.zaf;
                    if (z12) {
                        status2 = new Status(13);
                    } else {
                        status2 = Status.RESULT_SUCCESS;
                    }
                    Batch batch3 = this.zaa;
                    pendingResultArr = batch3.zah;
                    batch3.setResult(new BatchResult(status2, pendingResultArr));
                }
            }
        }
    }
}