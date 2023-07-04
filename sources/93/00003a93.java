package com.google.mlkit.vision.text.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_text_common.zzkr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzkt;
import com.google.android.gms.internal.mlkit_vision_text_common.zzku;
import com.google.android.gms.internal.mlkit_vision_text_common.zzmk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzmn;
import com.google.android.gms.internal.mlkit_vision_text_common.zzog;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoj;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class TextRecognizerImpl extends MobileVisionBase<oo.a> implements oo.c {

    /* renamed from: g  reason: collision with root package name */
    private final boolean f17377g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextRecognizerImpl(b bVar, Executor executor, zzog zzogVar, oo.d dVar) {
        super(bVar, executor);
        boolean c11 = dVar.c();
        this.f17377g = c11;
        zzku zzkuVar = new zzku();
        zzkuVar.zze(c11 ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzmk zzmkVar = new zzmk();
        zzmn zzmnVar = new zzmn();
        zzmnVar.zza(a.a(dVar.f()));
        zzmkVar.zze(zzmnVar.zzc());
        zzkuVar.zzh(zzmkVar.zzf());
        zzogVar.zzd(zzoj.zzg(zzkuVar, 1), zzkt.ON_DEVICE_TEXT_CREATE);
    }

    @Override // oo.c
    public final Task<oo.a> c(ko.a aVar) {
        return super.a(aVar);
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.f17377g ? com.google.mlkit.common.sdkinternal.m.f17254a : new Feature[]{com.google.mlkit.common.sdkinternal.m.f17259f};
    }
}