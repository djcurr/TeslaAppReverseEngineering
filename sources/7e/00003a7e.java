package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzlb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqk;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.m;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j implements i {

    /* renamed from: h  reason: collision with root package name */
    private static final zzcc f17314h = zzcc.zzi("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: a  reason: collision with root package name */
    private boolean f17315a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f17316b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17317c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f17318d;

    /* renamed from: e  reason: collision with root package name */
    private final go.b f17319e;

    /* renamed from: f  reason: collision with root package name */
    private final zzoq f17320f;

    /* renamed from: g  reason: collision with root package name */
    private zzqb f17321g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Context context, go.b bVar, zzoq zzoqVar) {
        this.f17318d = context;
        this.f17319e = bVar;
        this.f17320f = zzoqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Context context) {
        return DynamiteModule.getLocalVersion(context, "com.google.mlkit.dynamite.barcode") > 0;
    }

    @Override // com.google.mlkit.vision.barcode.internal.i
    public final List a(ko.a aVar) {
        if (this.f17321g == null) {
            zzc();
        }
        zzqb zzqbVar = (zzqb) Preconditions.checkNotNull(this.f17321g);
        if (!this.f17315a) {
            try {
                zzqbVar.zze();
                this.f17315a = true;
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to init barcode scanner.", 13, e11);
            }
        }
        int k11 = aVar.k();
        if (aVar.f() == 35) {
            k11 = ((Image.Plane[]) Preconditions.checkNotNull(aVar.i()))[0].getRowStride();
        }
        try {
            List<zzpr> zzd = zzqbVar.zzd(lo.d.b().a(aVar), new zzqk(aVar.f(), k11, aVar.g(), lo.b.a(aVar.j()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            for (zzpr zzprVar : zzd) {
                arrayList.add(new ho.a(new jo.b(zzprVar), aVar.e()));
            }
            return arrayList;
        } catch (RemoteException e12) {
            throw new MlKitException("Failed to run barcode scanner.", 13, e12);
        }
    }

    final zzqb c(DynamiteModule.VersionPolicy versionPolicy, String str, String str2) {
        return zzqd.zza(DynamiteModule.load(this.f17318d, versionPolicy, str).instantiate(str2)).zzd(ObjectWrapper.wrap(this.f17318d), new zzpt(this.f17319e.a()));
    }

    @Override // com.google.mlkit.vision.barcode.internal.i
    public final void zzb() {
        zzqb zzqbVar = this.f17321g;
        if (zzqbVar != null) {
            try {
                zzqbVar.zzf();
            } catch (RemoteException e11) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e11);
            }
            this.f17321g = null;
            this.f17315a = false;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.i
    public final boolean zzc() {
        if (this.f17321g != null) {
            return this.f17316b;
        }
        if (b(this.f17318d)) {
            this.f17316b = true;
            try {
                this.f17321g = c(DynamiteModule.PREFER_LOCAL, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to create thick barcode scanner.", 13, e11);
            } catch (DynamiteModule.LoadingException e12) {
                throw new MlKitException("Failed to load the bundled barcode module.", 13, e12);
            }
        } else {
            this.f17316b = false;
            if (!m.a(this.f17318d, f17314h)) {
                if (!this.f17317c) {
                    m.d(this.f17318d, zzcc.zzi("barcode", "tflite_dynamite"));
                    this.f17317c = true;
                }
                b.e(this.f17320f, zzlb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f17321g = c(DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e13) {
                b.e(this.f17320f, zzlb.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", 13, e13);
            }
        }
        b.e(this.f17320f, zzlb.NO_ERROR);
        return this.f17316b;
    }
}