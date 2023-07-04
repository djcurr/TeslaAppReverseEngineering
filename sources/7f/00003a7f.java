package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzad;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzlb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.m;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class k implements i {

    /* renamed from: a  reason: collision with root package name */
    private boolean f17322a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f17323b;

    /* renamed from: c  reason: collision with root package name */
    private final zzad f17324c;

    /* renamed from: d  reason: collision with root package name */
    private final zzoq f17325d;

    /* renamed from: e  reason: collision with root package name */
    private zzaf f17326e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, go.b bVar, zzoq zzoqVar) {
        zzad zzadVar = new zzad();
        this.f17324c = zzadVar;
        this.f17323b = context;
        zzadVar.zza = bVar.a();
        this.f17325d = zzoqVar;
    }

    @Override // com.google.mlkit.vision.barcode.internal.i
    public final List a(ko.a aVar) {
        zzq[] zzf;
        if (this.f17326e == null) {
            zzc();
        }
        zzaf zzafVar = this.f17326e;
        if (zzafVar != null) {
            zzaf zzafVar2 = (zzaf) Preconditions.checkNotNull(zzafVar);
            zzaj zzajVar = new zzaj(aVar.k(), aVar.g(), 0, 0L, lo.b.a(aVar.j()));
            try {
                int f11 = aVar.f();
                if (f11 == -1) {
                    zzf = zzafVar2.zzf(ObjectWrapper.wrap(aVar.c()), zzajVar);
                } else if (f11 == 17) {
                    zzf = zzafVar2.zze(ObjectWrapper.wrap(aVar.d()), zzajVar);
                } else if (f11 == 35) {
                    Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(aVar.i());
                    zzajVar.zza = planeArr[0].getRowStride();
                    zzf = zzafVar2.zze(ObjectWrapper.wrap(planeArr[0].getBuffer()), zzajVar);
                } else if (f11 == 842094169) {
                    zzf = zzafVar2.zze(ObjectWrapper.wrap(lo.c.f().d(aVar, false)), zzajVar);
                } else {
                    throw new MlKitException("Unsupported image format: " + aVar.f(), 3);
                }
                ArrayList arrayList = new ArrayList();
                for (zzq zzqVar : zzf) {
                    arrayList.add(new ho.a(new jo.c(zzqVar), aVar.e()));
                }
                return arrayList;
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to detect with legacy barcode detector", 13, e11);
            }
        }
        throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
    }

    @Override // com.google.mlkit.vision.barcode.internal.i
    public final void zzb() {
        zzaf zzafVar = this.f17326e;
        if (zzafVar != null) {
            try {
                zzafVar.zzd();
            } catch (RemoteException e11) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e11);
            }
            this.f17326e = null;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.i
    public final boolean zzc() {
        if (this.f17326e != null) {
            return false;
        }
        try {
            zzaf zzd = zzah.zza(DynamiteModule.load(this.f17323b, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(ObjectWrapper.wrap(this.f17323b), this.f17324c);
            this.f17326e = zzd;
            if (zzd == null && !this.f17322a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                m.c(this.f17323b, "barcode");
                this.f17322a = true;
                b.e(this.f17325d, zzlb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            b.e(this.f17325d, zzlb.NO_ERROR);
            return false;
        } catch (RemoteException e11) {
            throw new MlKitException("Failed to create legacy barcode detector.", 13, e11);
        } catch (DynamiteModule.LoadingException e12) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e12);
        }
    }
}