package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzds<T> implements zzef<T> {
    private static final Unsafe zzmh = zzfd.zzef();
    private final int[] zzmi;
    private final Object[] zzmj;
    private final int zzmk;
    private final int zzml;
    private final int zzmm;
    private final zzdo zzmn;
    private final boolean zzmo;
    private final boolean zzmp;
    private final boolean zzmq;
    private final boolean zzmr;
    private final int[] zzms;
    private final int[] zzmt;
    private final int[] zzmu;
    private final zzdw zzmv;
    private final zzcy zzmw;
    private final zzex<?, ?> zzmx;
    private final zzbu<?> zzmy;
    private final zzdj zzmz;

    private zzds(int[] iArr, Object[] objArr, int i11, int i12, int i13, zzdo zzdoVar, boolean z11, boolean z12, int[] iArr2, int[] iArr3, int[] iArr4, zzdw zzdwVar, zzcy zzcyVar, zzex<?, ?> zzexVar, zzbu<?> zzbuVar, zzdj zzdjVar) {
        this.zzmi = iArr;
        this.zzmj = objArr;
        this.zzmk = i11;
        this.zzml = i12;
        this.zzmm = i13;
        this.zzmp = zzdoVar instanceof zzcg;
        this.zzmq = z11;
        this.zzmo = zzbuVar != null && zzbuVar.zze(zzdoVar);
        this.zzmr = false;
        this.zzms = iArr2;
        this.zzmt = iArr3;
        this.zzmu = iArr4;
        this.zzmv = zzdwVar;
        this.zzmw = zzcyVar;
        this.zzmx = zzexVar;
        this.zzmy = zzbuVar;
        this.zzmn = zzdoVar;
        this.zzmz = zzdjVar;
    }

    private static int zza(int i11, byte[] bArr, int i12, int i13, Object obj, zzay zzayVar) {
        return zzax.zza(i11, bArr, i12, i13, zzn(obj), zzayVar);
    }

    private static int zza(zzef<?> zzefVar, int i11, byte[] bArr, int i12, int i13, zzcn<?> zzcnVar, zzay zzayVar) {
        int zza = zza((zzef) zzefVar, bArr, i12, i13, zzayVar);
        while (true) {
            zzcnVar.add(zzayVar.zzff);
            if (zza >= i13) {
                break;
            }
            int zza2 = zzax.zza(bArr, zza, zzayVar);
            if (i11 != zzayVar.zzfd) {
                break;
            }
            zza = zza((zzef) zzefVar, bArr, zza2, i13, zzayVar);
        }
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zza(zzef zzefVar, byte[] bArr, int i11, int i12, int i13, zzay zzayVar) {
        zzds zzdsVar = (zzds) zzefVar;
        Object newInstance = zzdsVar.newInstance();
        int zza = zzdsVar.zza((zzds) newInstance, bArr, i11, i12, i13, zzayVar);
        zzdsVar.zzc(newInstance);
        zzayVar.zzff = newInstance;
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zza(zzef zzefVar, byte[] bArr, int i11, int i12, zzay zzayVar) {
        int i13 = i11 + 1;
        int i14 = bArr[i11];
        if (i14 < 0) {
            i13 = zzax.zza(i14, bArr, i13, zzayVar);
            i14 = zzayVar.zzfd;
        }
        int i15 = i13;
        if (i14 < 0 || i14 > i12 - i15) {
            throw zzco.zzbl();
        }
        Object newInstance = zzefVar.newInstance();
        int i16 = i14 + i15;
        zzefVar.zza(newInstance, bArr, i15, i16, zzayVar);
        zzefVar.zzc(newInstance);
        zzayVar.zzff = newInstance;
        return i16;
    }

    private static <UT, UB> int zza(zzex<UT, UB> zzexVar, T t11) {
        return zzexVar.zzm(zzexVar.zzq(t11));
    }

    private final int zza(T t11, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, int i18, zzay zzayVar) {
        Object valueOf;
        Object valueOf2;
        int zzb;
        long j12;
        int i19;
        Object valueOf3;
        int i21;
        Unsafe unsafe = zzmh;
        long j13 = this.zzmi[i18 + 2] & 1048575;
        switch (i17) {
            case 51:
                if (i15 == 1) {
                    valueOf = Double.valueOf(zzax.zze(bArr, i11));
                    unsafe.putObject(t11, j11, valueOf);
                    zzb = i11 + 8;
                    unsafe.putInt(t11, j13, i14);
                    return zzb;
                }
                return i11;
            case 52:
                if (i15 == 5) {
                    valueOf2 = Float.valueOf(zzax.zzf(bArr, i11));
                    unsafe.putObject(t11, j11, valueOf2);
                    zzb = i11 + 4;
                    unsafe.putInt(t11, j13, i14);
                    return zzb;
                }
                return i11;
            case 53:
            case 54:
                if (i15 == 0) {
                    zzb = zzax.zzb(bArr, i11, zzayVar);
                    j12 = zzayVar.zzfe;
                    valueOf3 = Long.valueOf(j12);
                    unsafe.putObject(t11, j11, valueOf3);
                    unsafe.putInt(t11, j13, i14);
                    return zzb;
                }
                return i11;
            case 55:
            case 62:
                if (i15 == 0) {
                    zzb = zzax.zza(bArr, i11, zzayVar);
                    i19 = zzayVar.zzfd;
                    valueOf3 = Integer.valueOf(i19);
                    unsafe.putObject(t11, j11, valueOf3);
                    unsafe.putInt(t11, j13, i14);
                    return zzb;
                }
                return i11;
            case 56:
            case 65:
                if (i15 == 1) {
                    valueOf = Long.valueOf(zzax.zzd(bArr, i11));
                    unsafe.putObject(t11, j11, valueOf);
                    zzb = i11 + 8;
                    unsafe.putInt(t11, j13, i14);
                    return zzb;
                }
                return i11;
            case 57:
            case 64:
                if (i15 == 5) {
                    valueOf2 = Integer.valueOf(zzax.zzc(bArr, i11));
                    unsafe.putObject(t11, j11, valueOf2);
                    zzb = i11 + 4;
                    unsafe.putInt(t11, j13, i14);
                    return zzb;
                }
                return i11;
            case 58:
                if (i15 == 0) {
                    zzb = zzax.zzb(bArr, i11, zzayVar);
                    valueOf3 = Boolean.valueOf(zzayVar.zzfe != 0);
                    unsafe.putObject(t11, j11, valueOf3);
                    unsafe.putInt(t11, j13, i14);
                    return zzb;
                }
                return i11;
            case 59:
                if (i15 == 2) {
                    zzb = zzax.zza(bArr, i11, zzayVar);
                    i21 = zzayVar.zzfd;
                    if (i21 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(t11, j11, valueOf3);
                        unsafe.putInt(t11, j13, i14);
                        return zzb;
                    } else if ((i16 & PKIFailureInfo.duplicateCertReq) == 0 || zzff.zze(bArr, zzb, zzb + i21)) {
                        unsafe.putObject(t11, j11, new String(bArr, zzb, i21, zzci.UTF_8));
                        zzb += i21;
                        unsafe.putInt(t11, j13, i14);
                        return zzb;
                    } else {
                        throw zzco.zzbp();
                    }
                }
                return i11;
            case 60:
                if (i15 == 2) {
                    zzb = zza(zzad(i18), bArr, i11, i12, zzayVar);
                    Object object = unsafe.getInt(t11, j13) == i14 ? unsafe.getObject(t11, j11) : null;
                    valueOf3 = zzayVar.zzff;
                    if (object != null) {
                        valueOf3 = zzci.zza(object, valueOf3);
                    }
                    unsafe.putObject(t11, j11, valueOf3);
                    unsafe.putInt(t11, j13, i14);
                    return zzb;
                }
                return i11;
            case 61:
                if (i15 == 2) {
                    zzb = zzax.zza(bArr, i11, zzayVar);
                    i21 = zzayVar.zzfd;
                    if (i21 == 0) {
                        valueOf3 = zzbb.zzfi;
                        unsafe.putObject(t11, j11, valueOf3);
                        unsafe.putInt(t11, j13, i14);
                        return zzb;
                    }
                    unsafe.putObject(t11, j11, zzbb.zzb(bArr, zzb, i21));
                    zzb += i21;
                    unsafe.putInt(t11, j13, i14);
                    return zzb;
                }
                return i11;
            case 63:
                if (i15 == 0) {
                    int zza = zzax.zza(bArr, i11, zzayVar);
                    int i22 = zzayVar.zzfd;
                    zzck<?> zzaf = zzaf(i18);
                    if (zzaf != null && zzaf.zzb(i22) == null) {
                        zzn(t11).zzb(i13, Long.valueOf(i22));
                        return zza;
                    }
                    unsafe.putObject(t11, j11, Integer.valueOf(i22));
                    zzb = zza;
                    unsafe.putInt(t11, j13, i14);
                    return zzb;
                }
                return i11;
            case 66:
                if (i15 == 0) {
                    zzb = zzax.zza(bArr, i11, zzayVar);
                    i19 = zzbk.zzm(zzayVar.zzfd);
                    valueOf3 = Integer.valueOf(i19);
                    unsafe.putObject(t11, j11, valueOf3);
                    unsafe.putInt(t11, j13, i14);
                    return zzb;
                }
                return i11;
            case 67:
                if (i15 == 0) {
                    zzb = zzax.zzb(bArr, i11, zzayVar);
                    j12 = zzbk.zza(zzayVar.zzfe);
                    valueOf3 = Long.valueOf(j12);
                    unsafe.putObject(t11, j11, valueOf3);
                    unsafe.putInt(t11, j13, i14);
                    return zzb;
                }
                return i11;
            case 68:
                if (i15 == 3) {
                    zzb = zza(zzad(i18), bArr, i11, i12, (i13 & (-8)) | 4, zzayVar);
                    Object object2 = unsafe.getInt(t11, j13) == i14 ? unsafe.getObject(t11, j11) : null;
                    valueOf3 = zzayVar.zzff;
                    if (object2 != null) {
                        valueOf3 = zzci.zza(object2, valueOf3);
                    }
                    unsafe.putObject(t11, j11, valueOf3);
                    unsafe.putInt(t11, j13, i14);
                    return zzb;
                }
                return i11;
            default:
                return i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0233, code lost:
        if (r29.zzfe != 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0235, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0237, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0238, code lost:
        r12.addBoolean(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023b, code lost:
        if (r4 >= r19) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x023d, code lost:
        r6 = com.google.android.gms.internal.clearcut.zzax.zza(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0243, code lost:
        if (r20 != r29.zzfd) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0245, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzax.zzb(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024d, code lost:
        if (r29.zzfe == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0137, code lost:
        if (r4 == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0139, code lost:
        r12.add(com.google.android.gms.internal.clearcut.zzbb.zzfi);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013f, code lost:
        r12.add(com.google.android.gms.internal.clearcut.zzbb.zzb(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0147, code lost:
        if (r1 >= r19) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0149, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzax.zza(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014f, code lost:
        if (r20 != r29.zzfd) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0151, code lost:
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r17, r4, r29);
        r4 = r29.zzfd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0157, code lost:
        if (r4 != 0) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x01e2 -> B:91:0x01bb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x0237 -> B:127:0x0238). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x024d -> B:125:0x0235). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x013f -> B:66:0x0147). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0157 -> B:64:0x0139). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0194 -> B:82:0x0198). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01a8 -> B:79:0x0189). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01ce -> B:96:0x01d2). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.clearcut.zzay r29) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.clearcut.zzay):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <K, V> int zza(T t11, byte[] bArr, int i11, int i12, int i13, int i14, long j11, zzay zzayVar) {
        Unsafe unsafe = zzmh;
        Object zzae = zzae(i13);
        Object object = unsafe.getObject(t11, j11);
        if (this.zzmz.zzi(object)) {
            Object zzk = this.zzmz.zzk(zzae);
            this.zzmz.zzb(zzk, object);
            unsafe.putObject(t11, j11, zzk);
            object = zzk;
        }
        zzdh<?, ?> zzl = this.zzmz.zzl(zzae);
        Map<?, ?> zzg = this.zzmz.zzg(object);
        int zza = zzax.zza(bArr, i11, zzayVar);
        int i15 = zzayVar.zzfd;
        if (i15 < 0 || i15 > i12 - zza) {
            throw zzco.zzbl();
        }
        int i16 = i15 + zza;
        Object obj = (K) zzl.zzmc;
        Object obj2 = (V) zzl.zzdu;
        while (zza < i16) {
            int i17 = zza + 1;
            int i18 = bArr[zza];
            if (i18 < 0) {
                i17 = zzax.zza(i18, bArr, i17, zzayVar);
                i18 = zzayVar.zzfd;
            }
            int i19 = i17;
            int i21 = i18 >>> 3;
            int i22 = i18 & 7;
            if (i21 != 1) {
                if (i21 == 2 && i22 == zzl.zzmd.zzel()) {
                    zza = zza(bArr, i19, i12, zzl.zzmd, zzl.zzdu.getClass(), zzayVar);
                    obj2 = zzayVar.zzff;
                }
                zza = zzax.zza(i18, bArr, i19, i12, zzayVar);
            } else if (i22 == zzl.zzmb.zzel()) {
                zza = zza(bArr, i19, i12, zzl.zzmb, (Class<?>) null, zzayVar);
                obj = (K) zzayVar.zzff;
            } else {
                zza = zzax.zza(i18, bArr, i19, i12, zzayVar);
            }
        }
        if (zza == i16) {
            zzg.put(obj, obj2);
            return i16;
        }
        throw zzco.zzbo();
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0372 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(T r27, byte[] r28, int r29, int r30, int r31, com.google.android.gms.internal.clearcut.zzay r32) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.clearcut.zzay):int");
    }

    private static int zza(byte[] bArr, int i11, int i12, zzfl zzflVar, Class<?> cls, zzay zzayVar) {
        int zzb;
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        int i13;
        long j11;
        switch (zzdt.zzgq[zzflVar.ordinal()]) {
            case 1:
                zzb = zzax.zzb(bArr, i11, zzayVar);
                valueOf = Boolean.valueOf(zzayVar.zzfe != 0);
                zzayVar.zzff = valueOf;
                return zzb;
            case 2:
                return zzax.zze(bArr, i11, zzayVar);
            case 3:
                valueOf2 = Double.valueOf(zzax.zze(bArr, i11));
                zzayVar.zzff = valueOf2;
                return i11 + 8;
            case 4:
            case 5:
                valueOf3 = Integer.valueOf(zzax.zzc(bArr, i11));
                zzayVar.zzff = valueOf3;
                return i11 + 4;
            case 6:
            case 7:
                valueOf2 = Long.valueOf(zzax.zzd(bArr, i11));
                zzayVar.zzff = valueOf2;
                return i11 + 8;
            case 8:
                valueOf3 = Float.valueOf(zzax.zzf(bArr, i11));
                zzayVar.zzff = valueOf3;
                return i11 + 4;
            case 9:
            case 10:
            case 11:
                zzb = zzax.zza(bArr, i11, zzayVar);
                i13 = zzayVar.zzfd;
                valueOf = Integer.valueOf(i13);
                zzayVar.zzff = valueOf;
                return zzb;
            case 12:
            case 13:
                zzb = zzax.zzb(bArr, i11, zzayVar);
                j11 = zzayVar.zzfe;
                valueOf = Long.valueOf(j11);
                zzayVar.zzff = valueOf;
                return zzb;
            case 14:
                return zza((zzef) zzea.zzcm().zze(cls), bArr, i11, i12, zzayVar);
            case 15:
                zzb = zzax.zza(bArr, i11, zzayVar);
                i13 = zzbk.zzm(zzayVar.zzfd);
                valueOf = Integer.valueOf(i13);
                zzayVar.zzff = valueOf;
                return zzb;
            case 16:
                zzb = zzax.zzb(bArr, i11, zzayVar);
                j11 = zzbk.zza(zzayVar.zzfe);
                valueOf = Long.valueOf(j11);
                zzayVar.zzff = valueOf;
                return zzb;
            case 17:
                return zzax.zzd(bArr, i11, zzayVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzds<T> zza(Class<T> cls, zzdm zzdmVar, zzdw zzdwVar, zzcy zzcyVar, zzex<?, ?> zzexVar, zzbu<?> zzbuVar, zzdj zzdjVar) {
        int zzcu;
        int i11;
        int i12;
        int zza;
        int i13;
        int i14;
        if (!(zzdmVar instanceof zzec)) {
            ((zzes) zzdmVar).zzcf();
            throw new NoSuchMethodError();
        }
        zzec zzecVar = (zzec) zzdmVar;
        boolean z11 = zzecVar.zzcf() == zzcg.zzg.zzkm;
        if (zzecVar.getFieldCount() == 0) {
            zzcu = 0;
            i11 = 0;
            i12 = 0;
        } else {
            int zzcp = zzecVar.zzcp();
            int zzcq = zzecVar.zzcq();
            zzcu = zzecVar.zzcu();
            i11 = zzcp;
            i12 = zzcq;
        }
        int[] iArr = new int[zzcu << 2];
        Object[] objArr = new Object[zzcu << 1];
        int[] iArr2 = zzecVar.zzcr() > 0 ? new int[zzecVar.zzcr()] : null;
        int[] iArr3 = zzecVar.zzcs() > 0 ? new int[zzecVar.zzcs()] : null;
        zzed zzco = zzecVar.zzco();
        if (zzco.next()) {
            int zzcx = zzco.zzcx();
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (zzcx >= zzecVar.zzcv() || i15 >= ((zzcx - i11) << 2)) {
                    if (zzco.zzda()) {
                        zza = (int) zzfd.zza(zzco.zzdb());
                        i13 = (int) zzfd.zza(zzco.zzdc());
                        i14 = 0;
                    } else {
                        zza = (int) zzfd.zza(zzco.zzdd());
                        if (zzco.zzde()) {
                            i13 = (int) zzfd.zza(zzco.zzdf());
                            i14 = zzco.zzdg();
                        } else {
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                    iArr[i15] = zzco.zzcx();
                    int i18 = i15 + 1;
                    iArr[i18] = (zzco.zzdi() ? PKIFailureInfo.duplicateCertReq : 0) | (zzco.zzdh() ? 268435456 : 0) | (zzco.zzcy() << 20) | zza;
                    iArr[i15 + 2] = i13 | (i14 << 20);
                    if (zzco.zzdl() != null) {
                        int i19 = (i15 / 4) << 1;
                        objArr[i19] = zzco.zzdl();
                        if (zzco.zzdj() != null) {
                            objArr[i19 + 1] = zzco.zzdj();
                        } else if (zzco.zzdk() != null) {
                            objArr[i19 + 1] = zzco.zzdk();
                        }
                    } else if (zzco.zzdj() != null) {
                        objArr[((i15 / 4) << 1) + 1] = zzco.zzdj();
                    } else if (zzco.zzdk() != null) {
                        objArr[((i15 / 4) << 1) + 1] = zzco.zzdk();
                    }
                    int zzcy = zzco.zzcy();
                    if (zzcy == zzcb.zziw.ordinal()) {
                        iArr2[i16] = i15;
                        i16++;
                    } else if (zzcy >= 18 && zzcy <= 49) {
                        iArr3[i17] = iArr[i18] & 1048575;
                        i17++;
                    }
                    if (!zzco.next()) {
                        break;
                    }
                    zzcx = zzco.zzcx();
                } else {
                    for (int i21 = 0; i21 < 4; i21++) {
                        iArr[i15 + i21] = -1;
                    }
                }
                i15 += 4;
            }
        }
        return new zzds<>(iArr, objArr, i11, i12, zzecVar.zzcv(), zzecVar.zzch(), z11, false, zzecVar.zzct(), iArr2, iArr3, zzdwVar, zzcyVar, zzexVar, zzbuVar, zzdjVar);
    }

    private final <K, V, UT, UB> UB zza(int i11, int i12, Map<K, V> map, zzck<?> zzckVar, UB ub2, zzex<UT, UB> zzexVar) {
        zzdh<?, ?> zzl = this.zzmz.zzl(zzae(i11));
        Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<K, V> next = it2.next();
            if (zzckVar.zzb(((Integer) next.getValue()).intValue()) == null) {
                if (ub2 == null) {
                    ub2 = zzexVar.zzdz();
                }
                zzbg zzk = zzbb.zzk(zzdg.zza(zzl, next.getKey(), next.getValue()));
                try {
                    zzdg.zza(zzk.zzae(), zzl, next.getKey(), next.getValue());
                    zzexVar.zza((zzex<UT, UB>) ub2, i12, zzk.zzad());
                    it2.remove();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return ub2;
    }

    private static void zza(int i11, Object obj, zzfr zzfrVar) {
        if (obj instanceof String) {
            zzfrVar.zza(i11, (String) obj);
        } else {
            zzfrVar.zza(i11, (zzbb) obj);
        }
    }

    private static <UT, UB> void zza(zzex<UT, UB> zzexVar, T t11, zzfr zzfrVar) {
        zzexVar.zza(zzexVar.zzq(t11), zzfrVar);
    }

    private final <K, V> void zza(zzfr zzfrVar, int i11, Object obj, int i12) {
        if (obj != null) {
            zzfrVar.zza(i11, this.zzmz.zzl(zzae(i12)), this.zzmz.zzh(obj));
        }
    }

    private final void zza(T t11, T t12, int i11) {
        long zzag = zzag(i11) & 1048575;
        if (zza((zzds<T>) t12, i11)) {
            Object zzo = zzfd.zzo(t11, zzag);
            Object zzo2 = zzfd.zzo(t12, zzag);
            if (zzo != null && zzo2 != null) {
                zzfd.zza(t11, zzag, zzci.zza(zzo, zzo2));
                zzb((zzds<T>) t11, i11);
            } else if (zzo2 != null) {
                zzfd.zza(t11, zzag, zzo2);
                zzb((zzds<T>) t11, i11);
            }
        }
    }

    private final boolean zza(T t11, int i11) {
        if (!this.zzmq) {
            int zzah = zzah(i11);
            return (zzfd.zzj(t11, (long) (zzah & 1048575)) & (1 << (zzah >>> 20))) != 0;
        }
        int zzag = zzag(i11);
        long j11 = zzag & 1048575;
        switch ((zzag & 267386880) >>> 20) {
            case 0:
                return zzfd.zzn(t11, j11) != 0.0d;
            case 1:
                return zzfd.zzm(t11, j11) != BitmapDescriptorFactory.HUE_RED;
            case 2:
                return zzfd.zzk(t11, j11) != 0;
            case 3:
                return zzfd.zzk(t11, j11) != 0;
            case 4:
                return zzfd.zzj(t11, j11) != 0;
            case 5:
                return zzfd.zzk(t11, j11) != 0;
            case 6:
                return zzfd.zzj(t11, j11) != 0;
            case 7:
                return zzfd.zzl(t11, j11);
            case 8:
                Object zzo = zzfd.zzo(t11, j11);
                if (zzo instanceof String) {
                    return !((String) zzo).isEmpty();
                } else if (zzo instanceof zzbb) {
                    return !zzbb.zzfi.equals(zzo);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzfd.zzo(t11, j11) != null;
            case 10:
                return !zzbb.zzfi.equals(zzfd.zzo(t11, j11));
            case 11:
                return zzfd.zzj(t11, j11) != 0;
            case 12:
                return zzfd.zzj(t11, j11) != 0;
            case 13:
                return zzfd.zzj(t11, j11) != 0;
            case 14:
                return zzfd.zzk(t11, j11) != 0;
            case 15:
                return zzfd.zzj(t11, j11) != 0;
            case 16:
                return zzfd.zzk(t11, j11) != 0;
            case 17:
                return zzfd.zzo(t11, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t11, int i11, int i12) {
        return zzfd.zzj(t11, (long) (zzah(i12) & 1048575)) == i11;
    }

    private final boolean zza(T t11, int i11, int i12, int i13) {
        return this.zzmq ? zza((zzds<T>) t11, i11) : (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i11, zzef zzefVar) {
        return zzefVar.zzo(zzfd.zzo(obj, i11 & 1048575));
    }

    private final zzef zzad(int i11) {
        int i12 = (i11 / 4) << 1;
        zzef zzefVar = (zzef) this.zzmj[i12];
        if (zzefVar != null) {
            return zzefVar;
        }
        zzef<T> zze = zzea.zzcm().zze((Class) this.zzmj[i12 + 1]);
        this.zzmj[i12] = zze;
        return zze;
    }

    private final Object zzae(int i11) {
        return this.zzmj[(i11 / 4) << 1];
    }

    private final zzck<?> zzaf(int i11) {
        return (zzck) this.zzmj[((i11 / 4) << 1) + 1];
    }

    private final int zzag(int i11) {
        return this.zzmi[i11 + 1];
    }

    private final int zzah(int i11) {
        return this.zzmi[i11 + 2];
    }

    private final int zzai(int i11) {
        int i12 = this.zzmk;
        if (i11 >= i12) {
            int i13 = this.zzmm;
            if (i11 < i13) {
                int i14 = (i11 - i12) << 2;
                if (this.zzmi[i14] == i11) {
                    return i14;
                }
                return -1;
            } else if (i11 <= this.zzml) {
                int i15 = i13 - i12;
                int length = (this.zzmi.length / 4) - 1;
                while (i15 <= length) {
                    int i16 = (length + i15) >>> 1;
                    int i17 = i16 << 2;
                    int i18 = this.zzmi[i17];
                    if (i11 == i18) {
                        return i17;
                    }
                    if (i11 < i18) {
                        length = i16 - 1;
                    } else {
                        i15 = i16 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private final void zzb(T t11, int i11) {
        if (this.zzmq) {
            return;
        }
        int zzah = zzah(i11);
        long j11 = zzah & 1048575;
        zzfd.zza((Object) t11, j11, zzfd.zzj(t11, j11) | (1 << (zzah >>> 20)));
    }

    private final void zzb(T t11, int i11, int i12) {
        zzfd.zza((Object) t11, zzah(i12) & 1048575, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0494  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(T r19, com.google.android.gms.internal.clearcut.zzfr r20) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzb(java.lang.Object, com.google.android.gms.internal.clearcut.zzfr):void");
    }

    private final void zzb(T t11, T t12, int i11) {
        int zzag = zzag(i11);
        int i12 = this.zzmi[i11];
        long j11 = zzag & 1048575;
        if (zza((zzds<T>) t12, i12, i11)) {
            Object zzo = zzfd.zzo(t11, j11);
            Object zzo2 = zzfd.zzo(t12, j11);
            if (zzo != null && zzo2 != null) {
                zzfd.zza(t11, j11, zzci.zza(zzo, zzo2));
                zzb((zzds<T>) t11, i12, i11);
            } else if (zzo2 != null) {
                zzfd.zza(t11, j11, zzo2);
                zzb((zzds<T>) t11, i12, i11);
            }
        }
    }

    private final boolean zzc(T t11, T t12, int i11) {
        return zza((zzds<T>) t11, i11) == zza((zzds<T>) t12, i11);
    }

    private static <E> List<E> zzd(Object obj, long j11) {
        return (List) zzfd.zzo(obj, j11);
    }

    private static <T> double zze(T t11, long j11) {
        return ((Double) zzfd.zzo(t11, j11)).doubleValue();
    }

    private static <T> float zzf(T t11, long j11) {
        return ((Float) zzfd.zzo(t11, j11)).floatValue();
    }

    private static <T> int zzg(T t11, long j11) {
        return ((Integer) zzfd.zzo(t11, j11)).intValue();
    }

    private static <T> long zzh(T t11, long j11) {
        return ((Long) zzfd.zzo(t11, j11)).longValue();
    }

    private static <T> boolean zzi(T t11, long j11) {
        return ((Boolean) zzfd.zzo(t11, j11)).booleanValue();
    }

    private static zzey zzn(Object obj) {
        zzcg zzcgVar = (zzcg) obj;
        zzey zzeyVar = zzcgVar.zzjp;
        if (zzeyVar == zzey.zzea()) {
            zzey zzeb = zzey.zzeb();
            zzcgVar.zzjp = zzeb;
            return zzeb;
        }
        return zzeyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a0, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cc, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
        if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f8, code lost:
        if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
        if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0120, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzl(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzl(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0132, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0145, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0156, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0169, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017c, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018d, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L84;
     */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.equals(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ce, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e0, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode(T r9) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.hashCode(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final T newInstance() {
        return (T) this.zzmv.newInstance(this.zzmn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0976  */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r14, com.google.android.gms.internal.clearcut.zzfr r15) {
        /*
            Method dump skipped, instructions count: 2736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, com.google.android.gms.internal.clearcut.zzfr):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0164, code lost:
        if (r0 == r15) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0188, code lost:
        if (r0 == r15) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a1, code lost:
        if (r0 == r15) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a3, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r23, byte[] r24, int r25, int r26, com.google.android.gms.internal.clearcut.zzay r27) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.clearcut.zzay):void");
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(T t11) {
        int[] iArr = this.zzmt;
        if (iArr != null) {
            for (int i11 : iArr) {
                long zzag = zzag(i11) & 1048575;
                Object zzo = zzfd.zzo(t11, zzag);
                if (zzo != null) {
                    zzfd.zza(t11, zzag, this.zzmz.zzj(zzo));
                }
            }
        }
        int[] iArr2 = this.zzmu;
        if (iArr2 != null) {
            for (int i12 : iArr2) {
                this.zzmw.zza(t11, i12);
            }
        }
        this.zzmx.zzc(t11);
        if (this.zzmo) {
            this.zzmy.zzc(t11);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(T t11, T t12) {
        Objects.requireNonNull(t12);
        for (int i11 = 0; i11 < this.zzmi.length; i11 += 4) {
            int zzag = zzag(i11);
            long j11 = 1048575 & zzag;
            int i12 = this.zzmi[i11];
            switch ((zzag & 267386880) >>> 20) {
                case 0:
                    if (zza((zzds<T>) t12, i11)) {
                        zzfd.zza(t11, j11, zzfd.zzn(t12, j11));
                        zzb((zzds<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzds<T>) t12, i11)) {
                        zzfd.zza((Object) t11, j11, zzfd.zzm(t12, j11));
                        zzb((zzds<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zza((zzds<T>) t12, i11)) {
                        break;
                    }
                    zzfd.zza((Object) t11, j11, zzfd.zzk(t12, j11));
                    zzb((zzds<T>) t11, i11);
                    break;
                case 3:
                    if (!zza((zzds<T>) t12, i11)) {
                        break;
                    }
                    zzfd.zza((Object) t11, j11, zzfd.zzk(t12, j11));
                    zzb((zzds<T>) t11, i11);
                    break;
                case 4:
                    if (!zza((zzds<T>) t12, i11)) {
                        break;
                    }
                    zzfd.zza((Object) t11, j11, zzfd.zzj(t12, j11));
                    zzb((zzds<T>) t11, i11);
                    break;
                case 5:
                    if (!zza((zzds<T>) t12, i11)) {
                        break;
                    }
                    zzfd.zza((Object) t11, j11, zzfd.zzk(t12, j11));
                    zzb((zzds<T>) t11, i11);
                    break;
                case 6:
                    if (!zza((zzds<T>) t12, i11)) {
                        break;
                    }
                    zzfd.zza((Object) t11, j11, zzfd.zzj(t12, j11));
                    zzb((zzds<T>) t11, i11);
                    break;
                case 7:
                    if (zza((zzds<T>) t12, i11)) {
                        zzfd.zza(t11, j11, zzfd.zzl(t12, j11));
                        zzb((zzds<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zza((zzds<T>) t12, i11)) {
                        break;
                    }
                    zzfd.zza(t11, j11, zzfd.zzo(t12, j11));
                    zzb((zzds<T>) t11, i11);
                    break;
                case 9:
                case 17:
                    zza(t11, t12, i11);
                    break;
                case 10:
                    if (!zza((zzds<T>) t12, i11)) {
                        break;
                    }
                    zzfd.zza(t11, j11, zzfd.zzo(t12, j11));
                    zzb((zzds<T>) t11, i11);
                    break;
                case 11:
                    if (!zza((zzds<T>) t12, i11)) {
                        break;
                    }
                    zzfd.zza((Object) t11, j11, zzfd.zzj(t12, j11));
                    zzb((zzds<T>) t11, i11);
                    break;
                case 12:
                    if (!zza((zzds<T>) t12, i11)) {
                        break;
                    }
                    zzfd.zza((Object) t11, j11, zzfd.zzj(t12, j11));
                    zzb((zzds<T>) t11, i11);
                    break;
                case 13:
                    if (!zza((zzds<T>) t12, i11)) {
                        break;
                    }
                    zzfd.zza((Object) t11, j11, zzfd.zzj(t12, j11));
                    zzb((zzds<T>) t11, i11);
                    break;
                case 14:
                    if (!zza((zzds<T>) t12, i11)) {
                        break;
                    }
                    zzfd.zza((Object) t11, j11, zzfd.zzk(t12, j11));
                    zzb((zzds<T>) t11, i11);
                    break;
                case 15:
                    if (!zza((zzds<T>) t12, i11)) {
                        break;
                    }
                    zzfd.zza((Object) t11, j11, zzfd.zzj(t12, j11));
                    zzb((zzds<T>) t11, i11);
                    break;
                case 16:
                    if (!zza((zzds<T>) t12, i11)) {
                        break;
                    }
                    zzfd.zza((Object) t11, j11, zzfd.zzk(t12, j11));
                    zzb((zzds<T>) t11, i11);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzmw.zza(t11, t12, j11);
                    break;
                case 50:
                    zzeh.zza(this.zzmz, t11, t12, j11);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zza((zzds<T>) t12, i12, i11)) {
                        break;
                    }
                    zzfd.zza(t11, j11, zzfd.zzo(t12, j11));
                    zzb((zzds<T>) t11, i12, i11);
                    break;
                case 60:
                case 68:
                    zzb(t11, t12, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zza((zzds<T>) t12, i12, i11)) {
                        break;
                    }
                    zzfd.zza(t11, j11, zzfd.zzo(t12, j11));
                    zzb((zzds<T>) t11, i12, i11);
                    break;
            }
        }
        if (this.zzmq) {
            return;
        }
        zzeh.zza(this.zzmx, t11, t12);
        if (this.zzmo) {
            zzeh.zza(this.zzmy, t11, t12);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0181, code lost:
        if (r19.zzmr != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0193, code lost:
        if (r19.zzmr != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a5, code lost:
        if (r19.zzmr != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b6, code lost:
        if (r19.zzmr != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c7, code lost:
        if (r19.zzmr != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d8, code lost:
        if (r19.zzmr != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01e9, code lost:
        if (r19.zzmr != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fa, code lost:
        if (r19.zzmr != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x020b, code lost:
        if (r19.zzmr != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x020d, code lost:
        r2.putInt(r20, r14, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0211, code lost:
        r3 = (com.google.android.gms.internal.clearcut.zzbn.zzr(r3) + com.google.android.gms.internal.clearcut.zzbn.zzt(r5)) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0331, code lost:
        if ((r5 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0334, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzb(r3, (java.lang.String) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0414, code lost:
        if (zza((com.google.android.gms.internal.clearcut.zzds<T>) r20, r15, r5) != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0434, code lost:
        if (zza((com.google.android.gms.internal.clearcut.zzds<T>) r20, r15, r5) != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x043c, code lost:
        if (zza((com.google.android.gms.internal.clearcut.zzds<T>) r20, r15, r5) != false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x045c, code lost:
        if (zza((com.google.android.gms.internal.clearcut.zzds<T>) r20, r15, r5) != false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0464, code lost:
        if (zza((com.google.android.gms.internal.clearcut.zzds<T>) r20, r15, r5) != false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0474, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x047c, code lost:
        if (zza((com.google.android.gms.internal.clearcut.zzds<T>) r20, r15, r5) != false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0514, code lost:
        if (r19.zzmr != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0526, code lost:
        if (r19.zzmr != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0538, code lost:
        if (r19.zzmr != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x054a, code lost:
        if (r19.zzmr != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x055c, code lost:
        if (r19.zzmr != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x056e, code lost:
        if (r19.zzmr != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0580, code lost:
        if (r19.zzmr != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0592, code lost:
        if (r19.zzmr != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x05a3, code lost:
        if (r19.zzmr != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x05b4, code lost:
        if (r19.zzmr != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x05c5, code lost:
        if (r19.zzmr != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x05d6, code lost:
        if (r19.zzmr != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x05e7, code lost:
        if (r19.zzmr != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x05f8, code lost:
        if (r19.zzmr != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x05fa, code lost:
        r2.putInt(r20, r9, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x05fe, code lost:
        r9 = (com.google.android.gms.internal.clearcut.zzbn.zzr(r15) + com.google.android.gms.internal.clearcut.zzbn.zzt(r4)) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x06c4, code lost:
        if ((r12 & r18) != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x06c6, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, (com.google.android.gms.internal.clearcut.zzdo) r2.getObject(r20, r10), zzad(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x06f1, code lost:
        if ((r12 & r18) != 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x06f3, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzh(r15, 0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x06fc, code lost:
        if ((r12 & r18) != 0) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x06fe, code lost:
        r9 = com.google.android.gms.internal.clearcut.zzbn.zzk(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0721, code lost:
        if ((r12 & r18) != 0) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0723, code lost:
        r4 = r2.getObject(r20, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0727, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, (com.google.android.gms.internal.clearcut.zzbb) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0730, code lost:
        if ((r12 & r18) != 0) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0732, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzc(r15, r2.getObject(r20, r10), zzad(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x074a, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x074d, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzb(r15, (java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0757, code lost:
        if ((r12 & r18) != 0) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0759, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
        if ((r5 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0127, code lost:
        if (r19.zzmr != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0139, code lost:
        if (r19.zzmr != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014b, code lost:
        if (r19.zzmr != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015d, code lost:
        if (r19.zzmr != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016f, code lost:
        if (r19.zzmr != false) goto L104;
     */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzm(T r20) {
        /*
            Method dump skipped, instructions count: 2306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzm(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [com.google.android.gms.internal.clearcut.zzef] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27, types: [com.google.android.gms.internal.clearcut.zzef] */
    /* JADX WARN: Type inference failed for: r7v30 */
    @Override // com.google.android.gms.internal.clearcut.zzef
    public final boolean zzo(T t11) {
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        int[] iArr = this.zzms;
        if (iArr != null && iArr.length != 0) {
            int i13 = -1;
            int length = iArr.length;
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15 = i11 + 1) {
                int i16 = iArr[i15];
                int zzai = zzai(i16);
                int zzag = zzag(zzai);
                if (this.zzmq) {
                    i11 = i15;
                    i12 = 0;
                } else {
                    int i17 = this.zzmi[zzai + 2];
                    int i18 = i17 & 1048575;
                    i12 = 1 << (i17 >>> 20);
                    if (i18 != i13) {
                        i11 = i15;
                        i14 = zzmh.getInt(t11, i18);
                        i13 = i18;
                    } else {
                        i11 = i15;
                    }
                }
                if (((268435456 & zzag) != 0) && !zza((zzds<T>) t11, zzai, i14, i12)) {
                    return false;
                }
                int i19 = (267386880 & zzag) >>> 20;
                if (i19 != 9 && i19 != 17) {
                    if (i19 != 27) {
                        if (i19 == 60 || i19 == 68) {
                            if (zza((zzds<T>) t11, i16, zzai) && !zza(t11, zzag, zzad(zzai))) {
                                return false;
                            }
                        } else if (i19 != 49) {
                            if (i19 != 50) {
                                continue;
                            } else {
                                Map<?, ?> zzh = this.zzmz.zzh(zzfd.zzo(t11, zzag & 1048575));
                                if (!zzh.isEmpty()) {
                                    if (this.zzmz.zzl(zzae(zzai)).zzmd.zzek() == zzfq.MESSAGE) {
                                        zzef<T> zzefVar = 0;
                                        for (Object obj : zzh.values()) {
                                            if (zzefVar == null) {
                                                zzefVar = zzea.zzcm().zze(obj.getClass());
                                            }
                                            boolean zzo = zzefVar.zzo(obj);
                                            zzefVar = zzefVar;
                                            if (!zzo) {
                                                z12 = false;
                                                break;
                                            }
                                        }
                                    }
                                }
                                z12 = true;
                                if (!z12) {
                                    return false;
                                }
                            }
                        }
                    }
                    List list = (List) zzfd.zzo(t11, zzag & 1048575);
                    if (!list.isEmpty()) {
                        ?? zzad = zzad(zzai);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (!zzad.zzo(list.get(i21))) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    z11 = true;
                    if (!z11) {
                        return false;
                    }
                } else if (zza((zzds<T>) t11, zzai, i14, i12) && !zza(t11, zzag, zzad(zzai))) {
                    return false;
                }
            }
            if (this.zzmo && !this.zzmy.zza(t11).isInitialized()) {
                return false;
            }
        }
        return true;
    }
}