package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzj;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f17391a;

    /* renamed from: b  reason: collision with root package name */
    private final zzp f17392b = new zzp(null);

    /* renamed from: c  reason: collision with root package name */
    private boolean f17393c;

    /* renamed from: d  reason: collision with root package name */
    private zzh f17394d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context) {
        this.f17391a = context;
    }

    @Override // com.google.mlkit.vision.text.internal.i
    public final oo.a a(ko.a aVar) {
        Bitmap e11;
        int i11;
        if (this.f17394d == null) {
            zzb();
        }
        if (this.f17394d != null) {
            if (aVar.f() == -1) {
                e11 = aVar.c();
                i11 = lo.b.a(aVar.j());
            } else {
                e11 = lo.c.f().e(aVar);
                i11 = 0;
            }
            try {
                return h.a(((zzh) Preconditions.checkNotNull(this.f17394d)).zze(ObjectWrapper.wrap(e11), new zzd(aVar.k(), aVar.g(), 0, 0L, i11)), aVar.e());
            } catch (RemoteException e12) {
                throw new MlKitException("Failed to run legacy text recognizer.", 13, e12);
            }
        }
        throw new MlKitException("Waiting for the text recognition module to be downloaded. Please wait.", 14);
    }

    @Override // com.google.mlkit.vision.text.internal.i
    public final void zzb() {
        if (this.f17394d == null) {
            try {
                zzh zzd = zzj.zza(DynamiteModule.load(this.f17391a, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).zzd(ObjectWrapper.wrap(this.f17391a), this.f17392b);
                this.f17394d = zzd;
                if (zzd != null || this.f17393c) {
                    return;
                }
                Log.d("LegacyTextDelegate", "Request OCR optional module download.");
                com.google.mlkit.common.sdkinternal.m.c(this.f17391a, "ocr");
                this.f17393c = true;
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to create legacy text recognizer.", 13, e11);
            } catch (DynamiteModule.LoadingException e12) {
                throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e12);
            }
        }
    }

    @Override // com.google.mlkit.vision.text.internal.i
    public final void zzc() {
        zzh zzhVar = this.f17394d;
        if (zzhVar != null) {
            try {
                zzhVar.zzd();
            } catch (RemoteException e11) {
                Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e11);
            }
            this.f17394d = null;
        }
    }
}