package com.google.mlkit.vision.barcode.internal;

import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzla;
import com.google.android.gms.internal.mlkit_vision_barcode.zzlb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzlc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzld;
import com.google.android.gms.internal.mlkit_vision_barcode.zzln;
import com.google.android.gms.internal.mlkit_vision_barcode.zzlo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzls;
import com.google.android.gms.internal.mlkit_vision_barcode.zznx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzny;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoa;
import com.google.android.gms.internal.mlkit_vision_barcode.zzof;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzot;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray f17291a;

    /* renamed from: b  reason: collision with root package name */
    private static final SparseArray f17292b;

    /* renamed from: c  reason: collision with root package name */
    static final AtomicReference f17293c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map f17294d;

    static {
        SparseArray sparseArray = new SparseArray();
        f17291a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f17292b = sparseArray2;
        f17293c = new AtomicReference();
        sparseArray.put(-1, zzln.FORMAT_UNKNOWN);
        sparseArray.put(1, zzln.FORMAT_CODE_128);
        sparseArray.put(2, zzln.FORMAT_CODE_39);
        sparseArray.put(4, zzln.FORMAT_CODE_93);
        sparseArray.put(8, zzln.FORMAT_CODABAR);
        sparseArray.put(16, zzln.FORMAT_DATA_MATRIX);
        sparseArray.put(32, zzln.FORMAT_EAN_13);
        sparseArray.put(64, zzln.FORMAT_EAN_8);
        sparseArray.put(128, zzln.FORMAT_ITF);
        sparseArray.put(256, zzln.FORMAT_QR_CODE);
        sparseArray.put(512, zzln.FORMAT_UPC_A);
        sparseArray.put(1024, zzln.FORMAT_UPC_E);
        sparseArray.put(2048, zzln.FORMAT_PDF417);
        sparseArray.put(4096, zzln.FORMAT_AZTEC);
        sparseArray2.put(0, zzlo.TYPE_UNKNOWN);
        sparseArray2.put(1, zzlo.TYPE_CONTACT_INFO);
        sparseArray2.put(2, zzlo.TYPE_EMAIL);
        sparseArray2.put(3, zzlo.TYPE_ISBN);
        sparseArray2.put(4, zzlo.TYPE_PHONE);
        sparseArray2.put(5, zzlo.TYPE_PRODUCT);
        sparseArray2.put(6, zzlo.TYPE_SMS);
        sparseArray2.put(7, zzlo.TYPE_TEXT);
        sparseArray2.put(8, zzlo.TYPE_URL);
        sparseArray2.put(9, zzlo.TYPE_WIFI);
        sparseArray2.put(10, zzlo.TYPE_GEO);
        sparseArray2.put(11, zzlo.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, zzlo.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        f17294d = hashMap;
        hashMap.put(1, zznx.CODE_128);
        hashMap.put(2, zznx.CODE_39);
        hashMap.put(4, zznx.CODE_93);
        hashMap.put(8, zznx.CODABAR);
        hashMap.put(16, zznx.DATA_MATRIX);
        hashMap.put(32, zznx.EAN_13);
        hashMap.put(64, zznx.EAN_8);
        hashMap.put(128, zznx.ITF);
        hashMap.put(256, zznx.QR_CODE);
        hashMap.put(512, zznx.UPC_A);
        hashMap.put(1024, zznx.UPC_E);
        hashMap.put(2048, zznx.PDF417);
        hashMap.put(4096, zznx.AZTEC);
    }

    public static zzln a(int i11) {
        zzln zzlnVar = (zzln) f17291a.get(i11);
        return zzlnVar == null ? zzln.FORMAT_UNKNOWN : zzlnVar;
    }

    public static zzlo b(int i11) {
        zzlo zzloVar = (zzlo) f17292b.get(i11);
        return zzloVar == null ? zzlo.TYPE_UNKNOWN : zzloVar;
    }

    public static zzoa c(go.b bVar) {
        int a11 = bVar.a();
        zzbz zzbzVar = new zzbz();
        if (a11 == 0) {
            zzbzVar.zze(f17294d.values());
        } else {
            for (Map.Entry entry : f17294d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & a11) != 0) {
                    zzbzVar.zzd((zznx) entry.getValue());
                }
            }
        }
        zzny zznyVar = new zzny();
        zznyVar.zzb(zzbzVar.zzf());
        return zznyVar.zzc();
    }

    public static String d() {
        return true != f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(zzoq zzoqVar, final zzlb zzlbVar) {
        zzoqVar.zzf(new zzoo() { // from class: com.google.mlkit.vision.barcode.internal.a
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzoo
            public final zzof zza() {
                zzlb zzlbVar2 = zzlb.this;
                zzld zzldVar = new zzld();
                zzldVar.zze(b.f() ? zzla.TYPE_THICK : zzla.TYPE_THIN);
                zzls zzlsVar = new zzls();
                zzlsVar.zzb(zzlbVar2);
                zzldVar.zzh(zzlsVar.zzc());
                return zzot.zzf(zzldVar);
            }
        }, zzlc.ON_DEVICE_BARCODE_LOAD);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f() {
        AtomicReference atomicReference = f17293c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean b11 = j.b(com.google.mlkit.common.sdkinternal.i.c().b());
        atomicReference.set(Boolean.valueOf(b11));
        return b11;
    }
}