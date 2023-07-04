package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzks;
import com.google.android.gms.internal.mlkit_vision_text_common.zzog;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoy;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f17385a;

    /* renamed from: b  reason: collision with root package name */
    private final oo.d f17386b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17387c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17388d;

    /* renamed from: e  reason: collision with root package name */
    private final zzog f17389e;

    /* renamed from: f  reason: collision with root package name */
    private zzow f17390f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, oo.d dVar, zzog zzogVar) {
        this.f17385a = context;
        this.f17386b = dVar;
        this.f17389e = zzogVar;
    }

    @Override // com.google.mlkit.vision.text.internal.i
    public final oo.a a(ko.a aVar) {
        if (this.f17390f == null) {
            zzb();
        }
        zzow zzowVar = (zzow) Preconditions.checkNotNull(this.f17390f);
        if (!this.f17387c) {
            try {
                zzowVar.zze();
                this.f17387c = true;
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to init text recognizer ".concat(String.valueOf(this.f17386b.b())), 13, e11);
            }
        }
        try {
            return new oo.a(zzowVar.zzd(lo.d.b().a(aVar), new zzou(aVar.f(), aVar.k(), aVar.g(), lo.b.a(aVar.j()), SystemClock.elapsedRealtime())), aVar.e());
        } catch (RemoteException e12) {
            throw new MlKitException("Failed to run text recognizer ".concat(String.valueOf(this.f17386b.b())), 13, e12);
        }
    }

    @Override // com.google.mlkit.vision.text.internal.i
    public final void zzb() {
        DynamiteModule.VersionPolicy versionPolicy;
        if (this.f17390f == null) {
            try {
                Context context = this.f17385a;
                if (this.f17386b.c()) {
                    versionPolicy = DynamiteModule.PREFER_LOCAL;
                } else {
                    versionPolicy = DynamiteModule.PREFER_REMOTE;
                }
                this.f17390f = zzoy.zza(DynamiteModule.load(context, versionPolicy, this.f17386b.e()).instantiate(this.f17386b.g())).zzd(ObjectWrapper.wrap(this.f17385a));
                a.b(this.f17389e, this.f17386b.c(), zzks.NO_ERROR);
            } catch (RemoteException e11) {
                a.b(this.f17389e, this.f17386b.c(), zzks.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create text recognizer ".concat(String.valueOf(this.f17386b.b())), 13, e11);
            } catch (DynamiteModule.LoadingException e12) {
                a.b(this.f17389e, this.f17386b.c(), zzks.OPTIONAL_MODULE_NOT_AVAILABLE);
                if (!this.f17386b.c()) {
                    if (!this.f17388d) {
                        com.google.mlkit.common.sdkinternal.m.c(this.f17385a, "ocr");
                        this.f17388d = true;
                    }
                    throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
                }
                throw new MlKitException(String.format("Failed to load text module %s. %s", this.f17386b.b(), e12.getMessage()), 13, e12);
            }
        }
    }

    @Override // com.google.mlkit.vision.text.internal.i
    public final void zzc() {
        zzow zzowVar = this.f17390f;
        if (zzowVar != null) {
            try {
                zzowVar.zzf();
            } catch (RemoteException e11) {
                Log.e("DecoupledTextDelegate", "Failed to release text recognizer ".concat(String.valueOf(this.f17386b.b())), e11);
            }
            this.f17390f = null;
        }
        this.f17387c = false;
    }
}