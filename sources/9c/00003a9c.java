package com.google.mlkit.vision.text.internal;

import android.graphics.Matrix;
import android.graphics.Point;
import android.util.SparseArray;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.mlkit_vision_text_common.zzab;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbj;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbm;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oo.a;

/* loaded from: classes2.dex */
final class h {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    static final zzv f17397a = zzv.zza("\n");

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator f17398b = new Comparator() { // from class: po.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public static oo.a a(zzl[] zzlVarArr, final Matrix matrix) {
        SparseArray sparseArray = new SparseArray();
        int i11 = 0;
        for (zzl zzlVar : zzlVarArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzlVar.zzj);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(zzlVar.zzj, sparseArray2);
            }
            sparseArray2.append(zzlVar.zzk, zzlVar);
        }
        zzbj zzg = zzbm.zzg();
        int i12 = 0;
        while (i12 < sparseArray.size()) {
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i12);
            zzbj zzg2 = zzbm.zzg();
            for (int i13 = i11; i13 < sparseArray3.size(); i13++) {
                zzg2.zzb((zzl) sparseArray3.valueAt(i13));
            }
            zzbm zzc = zzg2.zzc();
            List zza = zzbw.zza(zzc, new zzu() { // from class: com.google.mlkit.vision.text.internal.f
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    final Matrix matrix2 = matrix;
                    zzl zzlVar2 = (zzl) obj;
                    List b11 = c.b(zzlVar2.zzb);
                    return new a.b(zzab.zzb(zzlVar2.zze) ? "" : zzlVar2.zze, c.a(b11), b11, zzab.zzb(zzlVar2.zzg) ? RequestHeadersFactory.UNDETERMINED_LANGUAGE : zzlVar2.zzg, matrix2, zzbw.zza(Arrays.asList(zzlVar2.zza), new zzu() { // from class: com.google.mlkit.vision.text.internal.g
                        @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                        public final Object zza(Object obj2) {
                            Matrix matrix3 = matrix2;
                            zzr zzrVar = (zzr) obj2;
                            List b12 = c.b(zzrVar.zzb);
                            return new a.C0856a(zzab.zzb(zzrVar.zzd) ? "" : zzrVar.zzd, c.a(b12), b12, zzab.zzb(zzrVar.zzf) ? RequestHeadersFactory.UNDETERMINED_LANGUAGE : zzrVar.zzf, matrix3, zzrVar.zze, zzrVar.zzb.zze, zzbm.zzj());
                        }
                    }), zzlVar2.zzf, zzlVar2.zzb.zze);
                }
            });
            zzf zzfVar = ((zzl) zzc.get(i11)).zzb;
            zzcr listIterator = zzc.listIterator(i11);
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            int i17 = Integer.MIN_VALUE;
            while (listIterator.hasNext()) {
                zzf zzfVar2 = ((zzl) listIterator.next()).zzb;
                int i18 = zzfVar.zza;
                int i19 = zzfVar.zzb;
                zzcr zzcrVar = listIterator;
                double sin = Math.sin(Math.toRadians(zzfVar.zze));
                SparseArray sparseArray4 = sparseArray;
                int i21 = i12;
                double cos = Math.cos(Math.toRadians(zzfVar.zze));
                zzbj zzbjVar = zzg;
                List list = zza;
                Point point = new Point(zzfVar2.zza, zzfVar2.zzb);
                point.offset(-i18, -i19);
                int i22 = (int) ((r13[0].x * cos) + (r13[0].y * sin));
                int i23 = (int) (((-r13[0].x) * sin) + (r13[0].y * cos));
                r13[0].x = i22;
                r13[0].y = i23;
                Point[] pointArr = {point, new Point(zzfVar2.zzc + i22, i23), new Point(zzfVar2.zzc + i22, zzfVar2.zzd + i23), new Point(i22, i23 + zzfVar2.zzd)};
                for (int i24 = 0; i24 < 4; i24++) {
                    Point point2 = pointArr[i24];
                    i15 = Math.min(i15, point2.x);
                    i14 = Math.max(i14, point2.x);
                    i16 = Math.min(i16, point2.y);
                    i17 = Math.max(i17, point2.y);
                }
                listIterator = zzcrVar;
                sparseArray = sparseArray4;
                i12 = i21;
                zzg = zzbjVar;
                zza = list;
            }
            zzbj zzbjVar2 = zzg;
            SparseArray sparseArray5 = sparseArray;
            int i25 = i12;
            List list2 = zza;
            int i26 = zzfVar.zza;
            int i27 = zzfVar.zzb;
            double sin2 = Math.sin(Math.toRadians(zzfVar.zze));
            double cos2 = Math.cos(Math.toRadians(zzfVar.zze));
            Point[] pointArr2 = {new Point(i15, i16), new Point(i14, i16), new Point(i14, i17), new Point(i15, i17)};
            int i28 = 0;
            for (int i29 = 4; i28 < i29; i29 = 4) {
                int i31 = pointArr2[i28].x;
                int i32 = pointArr2[i28].y;
                int i33 = pointArr2[i28].x;
                int i34 = pointArr2[i28].y;
                pointArr2[i28].x = (int) ((i31 * cos2) - (i32 * sin2));
                pointArr2[i28].y = (int) ((i33 * sin2) + (i34 * cos2));
                pointArr2[i28].offset(i26, i27);
                i28++;
            }
            List asList = Arrays.asList(pointArr2);
            zzbjVar2.zzb(new a.e(f17397a.zzb(zzbw.zza(list2, new zzu() { // from class: po.a
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return ((a.b) obj).c();
                }
            })), c.a(asList), asList, b(list2), matrix, list2));
            i12 = i25 + 1;
            zzg = zzbjVar2;
            sparseArray = sparseArray5;
            i11 = 0;
        }
        zzbm zzc2 = zzg.zzc();
        return new oo.a(f17397a.zzb(zzbw.zza(zzc2, new zzu() { // from class: po.b
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
            public final Object zza(Object obj) {
                return ((a.e) obj).d();
            }
        })), zzc2);
    }

    private static String b(List list) {
        HashMap hashMap = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String a11 = ((a.b) it2.next()).a();
            hashMap.put(a11, Integer.valueOf((hashMap.containsKey(a11) ? ((Integer) hashMap.get(a11)).intValue() : 0) + 1));
        }
        Set entrySet = hashMap.entrySet();
        if (entrySet.isEmpty()) {
            return RequestHeadersFactory.UNDETERMINED_LANGUAGE;
        }
        String str = (String) ((Map.Entry) Collections.max(entrySet, f17398b)).getKey();
        return zzab.zzb(str) ? RequestHeadersFactory.UNDETERMINED_LANGUAGE : str;
    }
}