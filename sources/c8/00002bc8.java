package com.google.android.gms.internal.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import org.spongycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
public final class zzak extends zzm<zzaa> {
    private final zzal zzfa;

    public zzak(Context context, zzal zzalVar) {
        super(context, "TextNativeHandle", TextBundle.TEXT_ENTRY);
        this.zzfa = zzalVar;
        zzq();
    }

    public final zzae[] zza(Bitmap bitmap, zzn zznVar, zzag zzagVar) {
        if (isOperational()) {
            try {
                return zzq().zza(ObjectWrapper.wrap(bitmap), zznVar, zzagVar);
            } catch (RemoteException e11) {
                Log.e("TextNativeHandle", "Error calling native text recognizer", e11);
                return new zzae[0];
            }
        }
        return new zzae[0];
    }

    @Override // com.google.android.gms.internal.vision.zzm
    protected final void zzm() {
        zzq().zzs();
    }

    @Override // com.google.android.gms.internal.vision.zzm
    protected final /* synthetic */ zzaa zza(DynamiteModule dynamiteModule, Context context) {
        zzac zzadVar;
        IBinder instantiate = dynamiteModule.instantiate("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
        if (instantiate == null) {
            zzadVar = null;
        } else {
            IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
            if (queryLocalInterface instanceof zzac) {
                zzadVar = (zzac) queryLocalInterface;
            } else {
                zzadVar = new zzad(instantiate);
            }
        }
        if (zzadVar == null) {
            return null;
        }
        return zzadVar.zza(ObjectWrapper.wrap(context), this.zzfa);
    }
}