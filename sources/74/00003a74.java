package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zzla;
import com.google.android.gms.internal.mlkit_vision_barcode.zzlc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzld;
import com.google.android.gms.internal.mlkit_vision_barcode.zzlp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzlr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzot;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.m;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import go.b;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class BarcodeScannerImpl extends MobileVisionBase<List<ho.a>> implements go.a {

    /* renamed from: g  reason: collision with root package name */
    private final boolean f17289g;

    static {
        new b.a().a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BarcodeScannerImpl(go.b bVar, h hVar, Executor executor, zzoq zzoqVar) {
        super(hVar, executor);
        boolean f11 = b.f();
        this.f17289g = f11;
        zzlp zzlpVar = new zzlp();
        zzlpVar.zzi(b.c(bVar));
        zzlr zzj = zzlpVar.zzj();
        zzld zzldVar = new zzld();
        zzldVar.zze(f11 ? zzla.TYPE_THICK : zzla.TYPE_THIN);
        zzldVar.zzg(zzj);
        zzoqVar.zzd(zzot.zzg(zzldVar, 1), zzlc.ON_DEVICE_BARCODE_CREATE);
    }

    @Override // go.a
    public final Task<List<ho.a>> c(ko.a aVar) {
        return super.a(aVar);
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.f17289g ? m.f17254a : new Feature[]{m.f17255b};
    }
}