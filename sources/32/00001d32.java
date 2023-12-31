package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;

/* loaded from: classes3.dex */
final class zzr extends zzp<Bundle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzr(int i11, int i12, Bundle bundle) {
        super(i11, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.zzp
    public final void zza(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(MessageExtension.FIELD_DATA);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        zzd(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.zzp
    public final boolean zzb() {
        return false;
    }
}