package com.google.mlkit.vision.face.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.m;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import mo.e;

/* loaded from: classes2.dex */
public class FaceDetectorImpl extends MobileVisionBase<List<mo.a>> implements mo.d {

    /* renamed from: g  reason: collision with root package name */
    private final boolean f17341g;

    static {
        new e.a().a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ FaceDetectorImpl(com.google.mlkit.vision.face.internal.g r1, com.google.mlkit.common.sdkinternal.d r2, mo.e r3, no.a r4) {
        /*
            r0 = this;
            java.util.concurrent.Executor r4 = r3.f()
            java.util.concurrent.Executor r2 = r2.a(r4)
            java.lang.String r4 = com.google.mlkit.vision.face.internal.h.b()
            com.google.android.gms.internal.mlkit_vision_face.zzoc r4 = com.google.android.gms.internal.mlkit_vision_face.zzon.zzb(r4)
            r0.<init>(r1, r2)
            boolean r1 = com.google.mlkit.vision.face.internal.h.d()
            r0.f17341g = r1
            com.google.android.gms.internal.mlkit_vision_face.zzku r2 = new com.google.android.gms.internal.mlkit_vision_face.zzku
            r2.<init>()
            if (r1 == 0) goto L23
            com.google.android.gms.internal.mlkit_vision_face.zzkr r1 = com.google.android.gms.internal.mlkit_vision_face.zzkr.TYPE_THICK
            goto L25
        L23:
            com.google.android.gms.internal.mlkit_vision_face.zzkr r1 = com.google.android.gms.internal.mlkit_vision_face.zzkr.TYPE_THIN
        L25:
            r2.zze(r1)
            com.google.android.gms.internal.mlkit_vision_face.zzlj r1 = new com.google.android.gms.internal.mlkit_vision_face.zzlj
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_face.zzkd r3 = com.google.mlkit.vision.face.internal.h.a(r3)
            r1.zze(r3)
            com.google.android.gms.internal.mlkit_vision_face.zzll r1 = r1.zzi()
            r2.zzg(r1)
            r1 = 1
            com.google.android.gms.internal.mlkit_vision_face.zznr r1 = com.google.android.gms.internal.mlkit_vision_face.zzof.zzg(r2, r1)
            com.google.android.gms.internal.mlkit_vision_face.zzkt r2 = com.google.android.gms.internal.mlkit_vision_face.zzkt.ON_DEVICE_FACE_CREATE
            r4.zzd(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.internal.FaceDetectorImpl.<init>(com.google.mlkit.vision.face.internal.g, com.google.mlkit.common.sdkinternal.d, mo.e, no.a):void");
    }

    @Override // mo.d
    public final Task<List<mo.a>> c(ko.a aVar) {
        return super.a(aVar);
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.f17341g ? m.f17254a : new Feature[]{m.f17257d};
    }
}