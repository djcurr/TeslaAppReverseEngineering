package com.google.mlkit.vision.face.internal;

import com.google.android.gms.internal.mlkit_vision_face.zzjx;
import com.google.android.gms.internal.mlkit_vision_face.zzjy;
import com.google.android.gms.internal.mlkit_vision_face.zzjz;
import com.google.android.gms.internal.mlkit_vision_face.zzka;
import com.google.android.gms.internal.mlkit_vision_face.zzkb;
import com.google.android.gms.internal.mlkit_vision_face.zzkd;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlm;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    static final AtomicReference f17368a = new AtomicReference();

    public static zzkd a(mo.e eVar) {
        zzka zzkaVar;
        zzjy zzjyVar;
        zzkb zzkbVar;
        zzjz zzjzVar;
        zzjx zzjxVar = new zzjx();
        int d11 = eVar.d();
        if (d11 == 1) {
            zzkaVar = zzka.NO_LANDMARKS;
        } else if (d11 != 2) {
            zzkaVar = zzka.UNKNOWN_LANDMARKS;
        } else {
            zzkaVar = zzka.ALL_LANDMARKS;
        }
        zzjxVar.zzd(zzkaVar);
        int b11 = eVar.b();
        if (b11 == 1) {
            zzjyVar = zzjy.NO_CLASSIFICATIONS;
        } else if (b11 != 2) {
            zzjyVar = zzjy.UNKNOWN_CLASSIFICATIONS;
        } else {
            zzjyVar = zzjy.ALL_CLASSIFICATIONS;
        }
        zzjxVar.zza(zzjyVar);
        int e11 = eVar.e();
        if (e11 == 1) {
            zzkbVar = zzkb.FAST;
        } else if (e11 != 2) {
            zzkbVar = zzkb.UNKNOWN_PERFORMANCE;
        } else {
            zzkbVar = zzkb.ACCURATE;
        }
        zzjxVar.zzf(zzkbVar);
        int c11 = eVar.c();
        if (c11 == 1) {
            zzjzVar = zzjz.NO_CONTOURS;
        } else if (c11 != 2) {
            zzjzVar = zzjz.UNKNOWN_CONTOURS;
        } else {
            zzjzVar = zzjz.ALL_CONTOURS;
        }
        zzjxVar.zzb(zzjzVar);
        zzjxVar.zzc(Boolean.valueOf(eVar.g()));
        zzjxVar.zze(Float.valueOf(eVar.a()));
        return zzjxVar.zzk();
    }

    public static String b() {
        return true != d() ? "play-services-mlkit-face-detection" : "face-detection";
    }

    public static void c(zzoc zzocVar, final boolean z11, final zzks zzksVar) {
        zzocVar.zzf(new zzoa() { // from class: no.b
            @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
            public final zznr zza() {
                boolean z12 = z11;
                zzks zzksVar2 = zzksVar;
                zzku zzkuVar = new zzku();
                zzkuVar.zze(z12 ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
                zzlm zzlmVar = new zzlm();
                zzlmVar.zzb(zzksVar2);
                zzkuVar.zzh(zzlmVar.zzc());
                return zzof.zzf(zzkuVar);
            }
        }, zzkt.ON_DEVICE_FACE_LOAD);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d() {
        AtomicReference atomicReference = f17368a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean b11 = a.b(com.google.mlkit.common.sdkinternal.i.c().b());
        atomicReference.set(Boolean.valueOf(b11));
        return b11;
    }
}