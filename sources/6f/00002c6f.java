package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzhj<T> implements zzhw<T> {
    private static final int[] zzzb = new int[0];
    private static final Unsafe zzzc = zziu.zzhj();
    private final int[] zzzd;
    private final Object[] zzze;
    private final int zzzf;
    private final int zzzg;
    private final zzhf zzzh;
    private final boolean zzzi;
    private final boolean zzzj;
    private final boolean zzzk;
    private final boolean zzzl;
    private final int[] zzzm;
    private final int zzzn;
    private final int zzzo;
    private final zzhn zzzp;
    private final zzgp zzzq;
    private final zzio<?, ?> zzzr;
    private final zzfl<?> zzzs;
    private final zzha zzzt;

    private zzhj(int[] iArr, Object[] objArr, int i11, int i12, zzhf zzhfVar, boolean z11, boolean z12, int[] iArr2, int i13, int i14, zzhn zzhnVar, zzgp zzgpVar, zzio<?, ?> zzioVar, zzfl<?> zzflVar, zzha zzhaVar) {
        this.zzzd = iArr;
        this.zzze = objArr;
        this.zzzf = i11;
        this.zzzg = i12;
        this.zzzj = zzhfVar instanceof zzfy;
        this.zzzk = z11;
        this.zzzi = zzflVar != null && zzflVar.zze(zzhfVar);
        this.zzzl = false;
        this.zzzm = iArr2;
        this.zzzn = i13;
        this.zzzo = i14;
        this.zzzp = zzhnVar;
        this.zzzq = zzgpVar;
        this.zzzr = zzioVar;
        this.zzzs = zzflVar;
        this.zzzh = zzhfVar;
        this.zzzt = zzhaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzhj<T> zza(Class<T> cls, zzhd zzhdVar, zzhn zzhnVar, zzgp zzgpVar, zzio<?, ?> zzioVar, zzfl<?> zzflVar, zzha zzhaVar) {
        int i11;
        int charAt;
        int charAt2;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        char charAt3;
        int i18;
        char charAt4;
        int i19;
        char charAt5;
        int i21;
        char charAt6;
        int i22;
        char charAt7;
        int i23;
        char charAt8;
        int i24;
        char charAt9;
        int i25;
        char charAt10;
        int i26;
        int i27;
        boolean z11;
        int i28;
        zzhu zzhuVar;
        int i29;
        int objectFieldOffset;
        int i31;
        int i32;
        Class<?> cls2;
        String str;
        int i33;
        int i34;
        Field zza;
        int i35;
        char charAt11;
        int i36;
        Field zza2;
        Field zza3;
        int i37;
        char charAt12;
        int i38;
        char charAt13;
        int i39;
        char charAt14;
        int i41;
        char charAt15;
        char charAt16;
        if (zzhdVar instanceof zzhu) {
            zzhu zzhuVar2 = (zzhu) zzhdVar;
            int i42 = 0;
            boolean z12 = zzhuVar2.zzge() == zzfy.zzg.zzxg;
            String zzgn = zzhuVar2.zzgn();
            int length = zzgn.length();
            int charAt17 = zzgn.charAt(0);
            if (charAt17 >= 55296) {
                int i43 = charAt17 & 8191;
                int i44 = 1;
                int i45 = 13;
                while (true) {
                    i11 = i44 + 1;
                    charAt16 = zzgn.charAt(i44);
                    if (charAt16 < 55296) {
                        break;
                    }
                    i43 |= (charAt16 & 8191) << i45;
                    i45 += 13;
                    i44 = i11;
                }
                charAt17 = i43 | (charAt16 << i45);
            } else {
                i11 = 1;
            }
            int i46 = i11 + 1;
            int charAt18 = zzgn.charAt(i11);
            if (charAt18 >= 55296) {
                int i47 = charAt18 & 8191;
                int i48 = 13;
                while (true) {
                    i41 = i46 + 1;
                    charAt15 = zzgn.charAt(i46);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i47 |= (charAt15 & 8191) << i48;
                    i48 += 13;
                    i46 = i41;
                }
                charAt18 = i47 | (charAt15 << i48);
                i46 = i41;
            }
            if (charAt18 == 0) {
                i16 = 0;
                charAt = 0;
                i14 = 0;
                charAt2 = 0;
                i15 = 0;
                iArr = zzzb;
                i13 = 0;
            } else {
                int i49 = i46 + 1;
                int charAt19 = zzgn.charAt(i46);
                if (charAt19 >= 55296) {
                    int i51 = charAt19 & 8191;
                    int i52 = 13;
                    while (true) {
                        i25 = i49 + 1;
                        charAt10 = zzgn.charAt(i49);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i51 |= (charAt10 & 8191) << i52;
                        i52 += 13;
                        i49 = i25;
                    }
                    charAt19 = i51 | (charAt10 << i52);
                    i49 = i25;
                }
                int i53 = i49 + 1;
                int charAt20 = zzgn.charAt(i49);
                if (charAt20 >= 55296) {
                    int i54 = charAt20 & 8191;
                    int i55 = 13;
                    while (true) {
                        i24 = i53 + 1;
                        charAt9 = zzgn.charAt(i53);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i54 |= (charAt9 & 8191) << i55;
                        i55 += 13;
                        i53 = i24;
                    }
                    charAt20 = i54 | (charAt9 << i55);
                    i53 = i24;
                }
                int i56 = i53 + 1;
                charAt = zzgn.charAt(i53);
                if (charAt >= 55296) {
                    int i57 = charAt & 8191;
                    int i58 = 13;
                    while (true) {
                        i23 = i56 + 1;
                        charAt8 = zzgn.charAt(i56);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i57 |= (charAt8 & 8191) << i58;
                        i58 += 13;
                        i56 = i23;
                    }
                    charAt = i57 | (charAt8 << i58);
                    i56 = i23;
                }
                int i59 = i56 + 1;
                int charAt21 = zzgn.charAt(i56);
                if (charAt21 >= 55296) {
                    int i61 = charAt21 & 8191;
                    int i62 = 13;
                    while (true) {
                        i22 = i59 + 1;
                        charAt7 = zzgn.charAt(i59);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i61 |= (charAt7 & 8191) << i62;
                        i62 += 13;
                        i59 = i22;
                    }
                    charAt21 = i61 | (charAt7 << i62);
                    i59 = i22;
                }
                int i63 = i59 + 1;
                charAt2 = zzgn.charAt(i59);
                if (charAt2 >= 55296) {
                    int i64 = charAt2 & 8191;
                    int i65 = 13;
                    while (true) {
                        i21 = i63 + 1;
                        charAt6 = zzgn.charAt(i63);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i64 |= (charAt6 & 8191) << i65;
                        i65 += 13;
                        i63 = i21;
                    }
                    charAt2 = i64 | (charAt6 << i65);
                    i63 = i21;
                }
                int i66 = i63 + 1;
                int charAt22 = zzgn.charAt(i63);
                if (charAt22 >= 55296) {
                    int i67 = charAt22 & 8191;
                    int i68 = 13;
                    while (true) {
                        i19 = i66 + 1;
                        charAt5 = zzgn.charAt(i66);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i67 |= (charAt5 & 8191) << i68;
                        i68 += 13;
                        i66 = i19;
                    }
                    charAt22 = i67 | (charAt5 << i68);
                    i66 = i19;
                }
                int i69 = i66 + 1;
                int charAt23 = zzgn.charAt(i66);
                if (charAt23 >= 55296) {
                    int i71 = charAt23 & 8191;
                    int i72 = i69;
                    int i73 = 13;
                    while (true) {
                        i18 = i72 + 1;
                        charAt4 = zzgn.charAt(i72);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i71 |= (charAt4 & 8191) << i73;
                        i73 += 13;
                        i72 = i18;
                    }
                    charAt23 = i71 | (charAt4 << i73);
                    i12 = i18;
                } else {
                    i12 = i69;
                }
                int i74 = i12 + 1;
                int charAt24 = zzgn.charAt(i12);
                if (charAt24 >= 55296) {
                    int i75 = charAt24 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i17 = i76 + 1;
                        charAt3 = zzgn.charAt(i76);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i75 |= (charAt3 & 8191) << i77;
                        i77 += 13;
                        i76 = i17;
                    }
                    charAt24 = i75 | (charAt3 << i77);
                    i74 = i17;
                }
                int i78 = (charAt19 << 1) + charAt20;
                i13 = charAt21;
                i14 = i78;
                i15 = charAt24;
                i42 = charAt19;
                i46 = i74;
                int i79 = charAt22;
                iArr = new int[charAt24 + charAt22 + charAt23];
                i16 = i79;
            }
            Unsafe unsafe = zzzc;
            Object[] zzgo = zzhuVar2.zzgo();
            Class<?> cls3 = zzhuVar2.zzgg().getClass();
            int i81 = i46;
            int[] iArr2 = new int[charAt2 * 3];
            Object[] objArr = new Object[charAt2 << 1];
            int i82 = i15 + i16;
            int i83 = i15;
            int i84 = i81;
            int i85 = i82;
            int i86 = 0;
            int i87 = 0;
            while (i84 < length) {
                int i88 = i84 + 1;
                int charAt25 = zzgn.charAt(i84);
                int i89 = length;
                if (charAt25 >= 55296) {
                    int i90 = charAt25 & 8191;
                    int i91 = i88;
                    int i92 = 13;
                    while (true) {
                        i39 = i91 + 1;
                        charAt14 = zzgn.charAt(i91);
                        i26 = i15;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i90 |= (charAt14 & 8191) << i92;
                        i92 += 13;
                        i91 = i39;
                        i15 = i26;
                    }
                    charAt25 = i90 | (charAt14 << i92);
                    i27 = i39;
                } else {
                    i26 = i15;
                    i27 = i88;
                }
                int i93 = i27 + 1;
                int charAt26 = zzgn.charAt(i27);
                if (charAt26 >= 55296) {
                    int i94 = charAt26 & 8191;
                    int i95 = i93;
                    int i96 = 13;
                    while (true) {
                        i38 = i95 + 1;
                        charAt13 = zzgn.charAt(i95);
                        z11 = z12;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i94 |= (charAt13 & 8191) << i96;
                        i96 += 13;
                        i95 = i38;
                        z12 = z11;
                    }
                    charAt26 = i94 | (charAt13 << i96);
                    i28 = i38;
                } else {
                    z11 = z12;
                    i28 = i93;
                }
                int i97 = charAt26 & 255;
                int i98 = i13;
                if ((charAt26 & 1024) != 0) {
                    iArr[i86] = i87;
                    i86++;
                }
                int i99 = charAt;
                if (i97 >= 51) {
                    int i100 = i28 + 1;
                    int charAt27 = zzgn.charAt(i28);
                    char c11 = 55296;
                    if (charAt27 >= 55296) {
                        int i101 = charAt27 & 8191;
                        int i102 = 13;
                        while (true) {
                            i37 = i100 + 1;
                            charAt12 = zzgn.charAt(i100);
                            if (charAt12 < c11) {
                                break;
                            }
                            i101 |= (charAt12 & 8191) << i102;
                            i102 += 13;
                            i100 = i37;
                            c11 = 55296;
                        }
                        charAt27 = i101 | (charAt12 << i102);
                        i100 = i37;
                    }
                    int i103 = i97 - 51;
                    int i104 = i100;
                    if (i103 == 9 || i103 == 17) {
                        objArr[((i87 / 3) << 1) + 1] = zzgo[i14];
                        i14++;
                    } else if (i103 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i87 / 3) << 1) + 1] = zzgo[i14];
                        i14++;
                    }
                    int i105 = charAt27 << 1;
                    Object obj = zzgo[i105];
                    if (obj instanceof Field) {
                        zza2 = (Field) obj;
                    } else {
                        zza2 = zza(cls3, (String) obj);
                        zzgo[i105] = zza2;
                    }
                    zzhuVar = zzhuVar2;
                    String str2 = zzgn;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zza2);
                    int i106 = i105 + 1;
                    Object obj2 = zzgo[i106];
                    if (obj2 instanceof Field) {
                        zza3 = (Field) obj2;
                    } else {
                        zza3 = zza(cls3, (String) obj2);
                        zzgo[i106] = zza3;
                    }
                    cls2 = cls3;
                    i31 = i14;
                    i28 = i104;
                    str = str2;
                    i34 = 0;
                    i33 = (int) unsafe.objectFieldOffset(zza3);
                    objectFieldOffset = objectFieldOffset2;
                    i32 = i42;
                } else {
                    zzhuVar = zzhuVar2;
                    String str3 = zzgn;
                    int i107 = i14 + 1;
                    Field zza4 = zza(cls3, (String) zzgo[i14]);
                    if (i97 == 9 || i97 == 17) {
                        i29 = 1;
                        objArr[((i87 / 3) << 1) + 1] = zza4.getType();
                    } else {
                        if (i97 == 27 || i97 == 49) {
                            i29 = 1;
                            i36 = i107 + 1;
                            objArr[((i87 / 3) << 1) + 1] = zzgo[i107];
                        } else if (i97 == 12 || i97 == 30 || i97 == 44) {
                            i29 = 1;
                            if ((charAt17 & 1) == 1) {
                                i36 = i107 + 1;
                                objArr[((i87 / 3) << 1) + 1] = zzgo[i107];
                            }
                        } else {
                            if (i97 == 50) {
                                int i108 = i83 + 1;
                                iArr[i83] = i87;
                                int i109 = (i87 / 3) << 1;
                                int i110 = i107 + 1;
                                objArr[i109] = zzgo[i107];
                                if ((charAt26 & 2048) != 0) {
                                    i107 = i110 + 1;
                                    objArr[i109 + 1] = zzgo[i110];
                                    i83 = i108;
                                } else {
                                    i107 = i110;
                                    i29 = 1;
                                    i83 = i108;
                                }
                            }
                            i29 = 1;
                        }
                        i107 = i36;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza4);
                    if ((charAt17 & 1) != i29) {
                        i31 = i107;
                        i32 = i42;
                        cls2 = cls3;
                        str = str3;
                    } else if (i97 <= 17) {
                        int i111 = i28 + 1;
                        str = str3;
                        int charAt28 = str.charAt(i28);
                        if (charAt28 >= 55296) {
                            int i112 = charAt28 & 8191;
                            int i113 = 13;
                            while (true) {
                                i35 = i111 + 1;
                                charAt11 = str.charAt(i111);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i112 |= (charAt11 & 8191) << i113;
                                i113 += 13;
                                i111 = i35;
                            }
                            charAt28 = i112 | (charAt11 << i113);
                            i111 = i35;
                        }
                        int i114 = (i42 << 1) + (charAt28 / 32);
                        Object obj3 = zzgo[i114];
                        i31 = i107;
                        if (obj3 instanceof Field) {
                            zza = (Field) obj3;
                        } else {
                            zza = zza(cls3, (String) obj3);
                            zzgo[i114] = zza;
                        }
                        i32 = i42;
                        cls2 = cls3;
                        i34 = charAt28 % 32;
                        i33 = (int) unsafe.objectFieldOffset(zza);
                        i28 = i111;
                        if (i97 >= 18 && i97 <= 49) {
                            iArr[i85] = objectFieldOffset;
                            i85++;
                        }
                    } else {
                        i31 = i107;
                        i32 = i42;
                        cls2 = cls3;
                        str = str3;
                    }
                    i33 = 0;
                    i34 = 0;
                    if (i97 >= 18) {
                        iArr[i85] = objectFieldOffset;
                        i85++;
                    }
                }
                int i115 = i87 + 1;
                iArr2[i87] = charAt25;
                int i116 = i115 + 1;
                iArr2[i115] = objectFieldOffset | ((charAt26 & 256) != 0 ? 268435456 : 0) | ((charAt26 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | (i97 << 20);
                i87 = i116 + 1;
                iArr2[i116] = (i34 << 20) | i33;
                i42 = i32;
                zzgn = str;
                i84 = i28;
                cls3 = cls2;
                i13 = i98;
                length = i89;
                i15 = i26;
                z12 = z11;
                charAt = i99;
                i14 = i31;
                zzhuVar2 = zzhuVar;
            }
            return new zzhj<>(iArr2, objArr, charAt, i13, zzhuVar2.zzgg(), z12, false, iArr, i15, i82, zzhnVar, zzgpVar, zzioVar, zzflVar, zzhaVar);
        }
        ((zzij) zzhdVar).zzge();
        throw new NoSuchMethodError();
    }

    private final void zzb(T t11, T t12, int i11) {
        int zzbk = zzbk(i11);
        int i12 = this.zzzd[i11];
        long j11 = zzbk & 1048575;
        if (zza((zzhj<T>) t12, i12, i11)) {
            Object zzp = zziu.zzp(t11, j11);
            Object zzp2 = zziu.zzp(t12, j11);
            if (zzp != null && zzp2 != null) {
                zziu.zza(t11, j11, zzga.zza(zzp, zzp2));
                zzb((zzhj<T>) t11, i12, i11);
            } else if (zzp2 != null) {
                zziu.zza(t11, j11, zzp2);
                zzb((zzhj<T>) t11, i12, i11);
            }
        }
    }

    private final zzhw zzbh(int i11) {
        int i12 = (i11 / 3) << 1;
        zzhw zzhwVar = (zzhw) this.zzze[i12];
        if (zzhwVar != null) {
            return zzhwVar;
        }
        zzhw<T> zzf = zzhs.zzgl().zzf((Class) this.zzze[i12 + 1]);
        this.zzze[i12] = zzf;
        return zzf;
    }

    private final Object zzbi(int i11) {
        return this.zzze[(i11 / 3) << 1];
    }

    private final zzgd zzbj(int i11) {
        return (zzgd) this.zzze[((i11 / 3) << 1) + 1];
    }

    private final int zzbk(int i11) {
        return this.zzzd[i11 + 1];
    }

    private final int zzbl(int i11) {
        return this.zzzd[i11 + 2];
    }

    private static boolean zzbm(int i11) {
        return (i11 & PKIFailureInfo.duplicateCertReq) != 0;
    }

    private final int zzbn(int i11) {
        if (i11 < this.zzzf || i11 > this.zzzg) {
            return -1;
        }
        return zzs(i11, 0);
    }

    private static <E> List<E> zze(Object obj, long j11) {
        return (List) zziu.zzp(obj, j11);
    }

    private static <T> double zzf(T t11, long j11) {
        return ((Double) zziu.zzp(t11, j11)).doubleValue();
    }

    private static <T> float zzg(T t11, long j11) {
        return ((Float) zziu.zzp(t11, j11)).floatValue();
    }

    private static <T> int zzh(T t11, long j11) {
        return ((Integer) zziu.zzp(t11, j11)).intValue();
    }

    private static <T> long zzi(T t11, long j11) {
        return ((Long) zziu.zzp(t11, j11)).longValue();
    }

    private static <T> boolean zzj(T t11, long j11) {
        return ((Boolean) zziu.zzp(t11, j11)).booleanValue();
    }

    private static zzip zzq(Object obj) {
        zzfy zzfyVar = (zzfy) obj;
        zzip zzipVar = zzfyVar.zzwj;
        if (zzipVar == zzip.zzhe()) {
            zzip zzhf = zzip.zzhf();
            zzfyVar.zzwj = zzhf;
            return zzhf;
        }
        return zzipVar;
    }

    private final int zzs(int i11, int i12) {
        int length = (this.zzzd.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int i15 = this.zzzd[i14];
            if (i11 == i15) {
                return i14;
            }
            if (i11 < i15) {
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.zziu.zzo(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.zziu.zzo(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
        if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012e, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzm(r10, r6) == com.google.android.gms.internal.vision.zziu.zzm(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0165, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.zziu.zzn(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.zziu.zzn(r11, r6))) goto L85;
     */
    @Override // com.google.android.gms.internal.vision.zzhw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.equals(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final int hashCode(T t11) {
        int i11;
        int zzo;
        int length = this.zzzd.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int zzbk = zzbk(i13);
            int i14 = this.zzzd[i13];
            long j11 = 1048575 & zzbk;
            int i15 = 37;
            switch ((zzbk & 267386880) >>> 20) {
                case 0:
                    i11 = i12 * 53;
                    zzo = zzga.zzo(Double.doubleToLongBits(zziu.zzo(t11, j11)));
                    i12 = i11 + zzo;
                    break;
                case 1:
                    i11 = i12 * 53;
                    zzo = Float.floatToIntBits(zziu.zzn(t11, j11));
                    i12 = i11 + zzo;
                    break;
                case 2:
                    i11 = i12 * 53;
                    zzo = zzga.zzo(zziu.zzl(t11, j11));
                    i12 = i11 + zzo;
                    break;
                case 3:
                    i11 = i12 * 53;
                    zzo = zzga.zzo(zziu.zzl(t11, j11));
                    i12 = i11 + zzo;
                    break;
                case 4:
                    i11 = i12 * 53;
                    zzo = zziu.zzk(t11, j11);
                    i12 = i11 + zzo;
                    break;
                case 5:
                    i11 = i12 * 53;
                    zzo = zzga.zzo(zziu.zzl(t11, j11));
                    i12 = i11 + zzo;
                    break;
                case 6:
                    i11 = i12 * 53;
                    zzo = zziu.zzk(t11, j11);
                    i12 = i11 + zzo;
                    break;
                case 7:
                    i11 = i12 * 53;
                    zzo = zzga.zzj(zziu.zzm(t11, j11));
                    i12 = i11 + zzo;
                    break;
                case 8:
                    i11 = i12 * 53;
                    zzo = ((String) zziu.zzp(t11, j11)).hashCode();
                    i12 = i11 + zzo;
                    break;
                case 9:
                    Object zzp = zziu.zzp(t11, j11);
                    if (zzp != null) {
                        i15 = zzp.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i11 = i12 * 53;
                    zzo = zziu.zzp(t11, j11).hashCode();
                    i12 = i11 + zzo;
                    break;
                case 11:
                    i11 = i12 * 53;
                    zzo = zziu.zzk(t11, j11);
                    i12 = i11 + zzo;
                    break;
                case 12:
                    i11 = i12 * 53;
                    zzo = zziu.zzk(t11, j11);
                    i12 = i11 + zzo;
                    break;
                case 13:
                    i11 = i12 * 53;
                    zzo = zziu.zzk(t11, j11);
                    i12 = i11 + zzo;
                    break;
                case 14:
                    i11 = i12 * 53;
                    zzo = zzga.zzo(zziu.zzl(t11, j11));
                    i12 = i11 + zzo;
                    break;
                case 15:
                    i11 = i12 * 53;
                    zzo = zziu.zzk(t11, j11);
                    i12 = i11 + zzo;
                    break;
                case 16:
                    i11 = i12 * 53;
                    zzo = zzga.zzo(zziu.zzl(t11, j11));
                    i12 = i11 + zzo;
                    break;
                case 17:
                    Object zzp2 = zziu.zzp(t11, j11);
                    if (zzp2 != null) {
                        i15 = zzp2.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
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
                    i11 = i12 * 53;
                    zzo = zziu.zzp(t11, j11).hashCode();
                    i12 = i11 + zzo;
                    break;
                case 50:
                    i11 = i12 * 53;
                    zzo = zziu.zzp(t11, j11).hashCode();
                    i12 = i11 + zzo;
                    break;
                case 51:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zzga.zzo(Double.doubleToLongBits(zzf(t11, j11)));
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = Float.floatToIntBits(zzg(t11, j11));
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zzga.zzo(zzi(t11, j11));
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zzga.zzo(zzi(t11, j11));
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zzh(t11, j11);
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zzga.zzo(zzi(t11, j11));
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zzh(t11, j11);
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zzga.zzj(zzj(t11, j11));
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = ((String) zziu.zzp(t11, j11)).hashCode();
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zziu.zzp(t11, j11).hashCode();
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zziu.zzp(t11, j11).hashCode();
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zzh(t11, j11);
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zzh(t11, j11);
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zzh(t11, j11);
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zzga.zzo(zzi(t11, j11));
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zzh(t11, j11);
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zzga.zzo(zzi(t11, j11));
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza((zzhj<T>) t11, i14, i13)) {
                        i11 = i12 * 53;
                        zzo = zziu.zzp(t11, j11).hashCode();
                        i12 = i11 + zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i12 * 53) + this.zzzr.zzt(t11).hashCode();
        return this.zzzi ? (hashCode * 53) + this.zzzs.zzc(t11).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final T newInstance() {
        return (T) this.zzzp.newInstance(this.zzzh);
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final void zzc(T t11, T t12) {
        Objects.requireNonNull(t12);
        for (int i11 = 0; i11 < this.zzzd.length; i11 += 3) {
            int zzbk = zzbk(i11);
            long j11 = 1048575 & zzbk;
            int i12 = this.zzzd[i11];
            switch ((zzbk & 267386880) >>> 20) {
                case 0:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zza(t11, j11, zziu.zzo(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zza((Object) t11, j11, zziu.zzn(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zza((Object) t11, j11, zziu.zzl(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zza((Object) t11, j11, zziu.zzl(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zzb(t11, j11, zziu.zzk(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zza((Object) t11, j11, zziu.zzl(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zzb(t11, j11, zziu.zzk(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zza(t11, j11, zziu.zzm(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zza(t11, j11, zziu.zzp(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t11, t12, i11);
                    break;
                case 10:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zza(t11, j11, zziu.zzp(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zzb(t11, j11, zziu.zzk(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zzb(t11, j11, zziu.zzk(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zzb(t11, j11, zziu.zzk(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zza((Object) t11, j11, zziu.zzl(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zzb(t11, j11, zziu.zzk(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zza((zzhj<T>) t12, i11)) {
                        zziu.zza((Object) t11, j11, zziu.zzl(t12, j11));
                        zzb((zzhj<T>) t11, i11);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t11, t12, i11);
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
                    this.zzzq.zza(t11, t12, j11);
                    break;
                case 50:
                    zzhy.zza(this.zzzt, t11, t12, j11);
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
                    if (zza((zzhj<T>) t12, i12, i11)) {
                        zziu.zza(t11, j11, zziu.zzp(t12, j11));
                        zzb((zzhj<T>) t11, i12, i11);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t11, t12, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza((zzhj<T>) t12, i12, i11)) {
                        zziu.zza(t11, j11, zziu.zzp(t12, j11));
                        zzb((zzhj<T>) t11, i12, i11);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t11, t12, i11);
                    break;
            }
        }
        if (this.zzzk) {
            return;
        }
        zzhy.zza(this.zzzr, t11, t12);
        if (this.zzzi) {
            zzhy.zza(this.zzzs, t11, t12);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.vision.zzhw
    public final int zzp(T t11) {
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        long j11;
        int zzd;
        int zzc;
        int zzm;
        boolean z13;
        int zzv;
        int zzy;
        int zzav;
        int zzax;
        int zzb;
        int zzy2;
        int zzav2;
        int zzax2;
        int i13 = 267386880;
        if (this.zzzk) {
            Unsafe unsafe = zzzc;
            int i14 = 0;
            int i15 = 0;
            while (i14 < this.zzzd.length) {
                int zzbk = zzbk(i14);
                int i16 = (zzbk & i13) >>> 20;
                int i17 = this.zzzd[i14];
                long j12 = zzbk & 1048575;
                int i18 = (i16 < zzfs.zzva.id() || i16 > zzfs.zzvn.id()) ? 0 : this.zzzd[i14 + 2] & 1048575;
                switch (i16) {
                    case 0:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zzb(i17, 0.0d);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 1:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zzb(i17, (float) BitmapDescriptorFactory.HUE_RED);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 2:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zzd(i17, zziu.zzl(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 3:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zze(i17, zziu.zzl(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 4:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zzi(i17, zziu.zzk(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 5:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zzg(i17, 0L);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 6:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zzl(i17, 0);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 7:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zzc(i17, true);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 8:
                        if (zza((zzhj<T>) t11, i14)) {
                            Object zzp = zziu.zzp(t11, j12);
                            if (zzp instanceof zzeo) {
                                zzb = zzfe.zzc(i17, (zzeo) zzp);
                                break;
                            } else {
                                zzb = zzfe.zzb(i17, (String) zzp);
                                break;
                            }
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 9:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzhy.zzc(i17, zziu.zzp(t11, j12), zzbh(i14));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 10:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zzc(i17, (zzeo) zziu.zzp(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 11:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zzj(i17, zziu.zzk(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 12:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zzn(i17, zziu.zzk(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 13:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zzm(i17, 0);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 14:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zzh(i17, 0L);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 15:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zzk(i17, zziu.zzk(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 16:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zzf(i17, zziu.zzl(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 17:
                        if (zza((zzhj<T>) t11, i14)) {
                            zzb = zzfe.zzc(i17, (zzhf) zziu.zzp(t11, j12), zzbh(i14));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 18:
                        zzb = zzhy.zzw(i17, zze(t11, j12), false);
                        break;
                    case 19:
                        zzb = zzhy.zzv(i17, zze(t11, j12), false);
                        break;
                    case 20:
                        zzb = zzhy.zzo(i17, zze(t11, j12), false);
                        break;
                    case 21:
                        zzb = zzhy.zzp(i17, zze(t11, j12), false);
                        break;
                    case 22:
                        zzb = zzhy.zzs(i17, zze(t11, j12), false);
                        break;
                    case 23:
                        zzb = zzhy.zzw(i17, zze(t11, j12), false);
                        break;
                    case 24:
                        zzb = zzhy.zzv(i17, zze(t11, j12), false);
                        break;
                    case 25:
                        zzb = zzhy.zzx(i17, zze(t11, j12), false);
                        break;
                    case 26:
                        zzb = zzhy.zzc(i17, zze(t11, j12));
                        break;
                    case 27:
                        zzb = zzhy.zzc(i17, (List<?>) zze(t11, j12), zzbh(i14));
                        break;
                    case 28:
                        zzb = zzhy.zzd(i17, zze(t11, j12));
                        break;
                    case 29:
                        zzb = zzhy.zzt(i17, zze(t11, j12), false);
                        break;
                    case 30:
                        zzb = zzhy.zzr(i17, zze(t11, j12), false);
                        break;
                    case 31:
                        zzb = zzhy.zzv(i17, zze(t11, j12), false);
                        break;
                    case 32:
                        zzb = zzhy.zzw(i17, zze(t11, j12), false);
                        break;
                    case 33:
                        zzb = zzhy.zzu(i17, zze(t11, j12), false);
                        break;
                    case 34:
                        zzb = zzhy.zzq(i17, zze(t11, j12), false);
                        break;
                    case 35:
                        zzy2 = zzhy.zzy((List) unsafe.getObject(t11, j12));
                        if (zzy2 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t11, i18, zzy2);
                            }
                            zzav2 = zzfe.zzav(i17);
                            zzax2 = zzfe.zzax(zzy2);
                            zzb = zzav2 + zzax2 + zzy2;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 36:
                        zzy2 = zzhy.zzx((List) unsafe.getObject(t11, j12));
                        if (zzy2 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t11, i18, zzy2);
                            }
                            zzav2 = zzfe.zzav(i17);
                            zzax2 = zzfe.zzax(zzy2);
                            zzb = zzav2 + zzax2 + zzy2;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 37:
                        zzy2 = zzhy.zzq((List) unsafe.getObject(t11, j12));
                        if (zzy2 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t11, i18, zzy2);
                            }
                            zzav2 = zzfe.zzav(i17);
                            zzax2 = zzfe.zzax(zzy2);
                            zzb = zzav2 + zzax2 + zzy2;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 38:
                        zzy2 = zzhy.zzr((List) unsafe.getObject(t11, j12));
                        if (zzy2 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t11, i18, zzy2);
                            }
                            zzav2 = zzfe.zzav(i17);
                            zzax2 = zzfe.zzax(zzy2);
                            zzb = zzav2 + zzax2 + zzy2;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 39:
                        zzy2 = zzhy.zzu((List) unsafe.getObject(t11, j12));
                        if (zzy2 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t11, i18, zzy2);
                            }
                            zzav2 = zzfe.zzav(i17);
                            zzax2 = zzfe.zzax(zzy2);
                            zzb = zzav2 + zzax2 + zzy2;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 40:
                        zzy2 = zzhy.zzy((List) unsafe.getObject(t11, j12));
                        if (zzy2 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t11, i18, zzy2);
                            }
                            zzav2 = zzfe.zzav(i17);
                            zzax2 = zzfe.zzax(zzy2);
                            zzb = zzav2 + zzax2 + zzy2;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 41:
                        zzy2 = zzhy.zzx((List) unsafe.getObject(t11, j12));
                        if (zzy2 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t11, i18, zzy2);
                            }
                            zzav2 = zzfe.zzav(i17);
                            zzax2 = zzfe.zzax(zzy2);
                            zzb = zzav2 + zzax2 + zzy2;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 42:
                        zzy2 = zzhy.zzz((List) unsafe.getObject(t11, j12));
                        if (zzy2 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t11, i18, zzy2);
                            }
                            zzav2 = zzfe.zzav(i17);
                            zzax2 = zzfe.zzax(zzy2);
                            zzb = zzav2 + zzax2 + zzy2;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 43:
                        zzy2 = zzhy.zzv((List) unsafe.getObject(t11, j12));
                        if (zzy2 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t11, i18, zzy2);
                            }
                            zzav2 = zzfe.zzav(i17);
                            zzax2 = zzfe.zzax(zzy2);
                            zzb = zzav2 + zzax2 + zzy2;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 44:
                        zzy2 = zzhy.zzt((List) unsafe.getObject(t11, j12));
                        if (zzy2 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t11, i18, zzy2);
                            }
                            zzav2 = zzfe.zzav(i17);
                            zzax2 = zzfe.zzax(zzy2);
                            zzb = zzav2 + zzax2 + zzy2;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 45:
                        zzy2 = zzhy.zzx((List) unsafe.getObject(t11, j12));
                        if (zzy2 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t11, i18, zzy2);
                            }
                            zzav2 = zzfe.zzav(i17);
                            zzax2 = zzfe.zzax(zzy2);
                            zzb = zzav2 + zzax2 + zzy2;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 46:
                        zzy2 = zzhy.zzy((List) unsafe.getObject(t11, j12));
                        if (zzy2 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t11, i18, zzy2);
                            }
                            zzav2 = zzfe.zzav(i17);
                            zzax2 = zzfe.zzax(zzy2);
                            zzb = zzav2 + zzax2 + zzy2;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 47:
                        zzy2 = zzhy.zzw((List) unsafe.getObject(t11, j12));
                        if (zzy2 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t11, i18, zzy2);
                            }
                            zzav2 = zzfe.zzav(i17);
                            zzax2 = zzfe.zzax(zzy2);
                            zzb = zzav2 + zzax2 + zzy2;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 48:
                        zzy2 = zzhy.zzs((List) unsafe.getObject(t11, j12));
                        if (zzy2 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t11, i18, zzy2);
                            }
                            zzav2 = zzfe.zzav(i17);
                            zzax2 = zzfe.zzax(zzy2);
                            zzb = zzav2 + zzax2 + zzy2;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 49:
                        zzb = zzhy.zzd(i17, zze(t11, j12), zzbh(i14));
                        break;
                    case 50:
                        zzb = this.zzzt.zzb(i17, zziu.zzp(t11, j12), zzbi(i14));
                        break;
                    case 51:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zzb(i17, 0.0d);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 52:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zzb(i17, (float) BitmapDescriptorFactory.HUE_RED);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 53:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zzd(i17, zzi(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 54:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zze(i17, zzi(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 55:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zzi(i17, zzh(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 56:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zzg(i17, 0L);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 57:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zzl(i17, 0);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 58:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zzc(i17, true);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 59:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            Object zzp2 = zziu.zzp(t11, j12);
                            if (zzp2 instanceof zzeo) {
                                zzb = zzfe.zzc(i17, (zzeo) zzp2);
                                break;
                            } else {
                                zzb = zzfe.zzb(i17, (String) zzp2);
                                break;
                            }
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 60:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzhy.zzc(i17, zziu.zzp(t11, j12), zzbh(i14));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 61:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zzc(i17, (zzeo) zziu.zzp(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 62:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zzj(i17, zzh(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 63:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zzn(i17, zzh(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 64:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zzm(i17, 0);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 65:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zzh(i17, 0L);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 66:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zzk(i17, zzh(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 67:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zzf(i17, zzi(t11, j12));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    case 68:
                        if (zza((zzhj<T>) t11, i17, i14)) {
                            zzb = zzfe.zzc(i17, (zzhf) zziu.zzp(t11, j12), zzbh(i14));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i13 = 267386880;
                        }
                    default:
                        i14 += 3;
                        i13 = 267386880;
                }
                i15 += zzb;
                i14 += 3;
                i13 = 267386880;
            }
            return i15 + zza(this.zzzr, t11);
        }
        Unsafe unsafe2 = zzzc;
        int i19 = -1;
        int i21 = 0;
        int i22 = 0;
        for (int i23 = 0; i23 < this.zzzd.length; i23 += 3) {
            int zzbk2 = zzbk(i23);
            int[] iArr = this.zzzd;
            int i24 = iArr[i23];
            int i25 = (zzbk2 & 267386880) >>> 20;
            if (i25 <= 17) {
                int i26 = iArr[i23 + 2];
                int i27 = i26 & 1048575;
                i12 = 1 << (i26 >>> 20);
                if (i27 != i19) {
                    i22 = unsafe2.getInt(t11, i27);
                    i19 = i27;
                }
                i11 = i26;
            } else {
                i11 = (!this.zzzl || i25 < zzfs.zzva.id() || i25 > zzfs.zzvn.id()) ? 0 : this.zzzd[i23 + 2] & 1048575;
                i12 = 0;
            }
            long j13 = zzbk2 & 1048575;
            switch (i25) {
                case 0:
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    if ((i22 & i12) != 0) {
                        i21 += zzfe.zzb(i24, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    z11 = false;
                    j11 = 0;
                    if ((i22 & i12) != 0) {
                        z12 = false;
                        i21 += zzfe.zzb(i24, (float) BitmapDescriptorFactory.HUE_RED);
                        break;
                    }
                    z12 = false;
                case 2:
                    z11 = false;
                    j11 = 0;
                    if ((i22 & i12) != 0) {
                        zzd = zzfe.zzd(i24, unsafe2.getLong(t11, j13));
                        i21 += zzd;
                    }
                    z12 = false;
                    break;
                case 3:
                    z11 = false;
                    j11 = 0;
                    if ((i22 & i12) != 0) {
                        zzd = zzfe.zze(i24, unsafe2.getLong(t11, j13));
                        i21 += zzd;
                    }
                    z12 = false;
                    break;
                case 4:
                    z11 = false;
                    j11 = 0;
                    if ((i22 & i12) != 0) {
                        zzd = zzfe.zzi(i24, unsafe2.getInt(t11, j13));
                        i21 += zzd;
                    }
                    z12 = false;
                    break;
                case 5:
                    z11 = false;
                    j11 = 0;
                    if ((i22 & i12) != 0) {
                        zzd = zzfe.zzg(i24, 0L);
                        i21 += zzd;
                    }
                    z12 = false;
                    break;
                case 6:
                    if ((i22 & i12) != 0) {
                        z11 = false;
                        i21 += zzfe.zzl(i24, 0);
                        z12 = false;
                        j11 = 0;
                        break;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                case 7:
                    if ((i22 & i12) != 0) {
                        zzc = zzfe.zzc(i24, true);
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 8:
                    if ((i22 & i12) != 0) {
                        Object object = unsafe2.getObject(t11, j13);
                        if (object instanceof zzeo) {
                            zzc = zzfe.zzc(i24, (zzeo) object);
                        } else {
                            zzc = zzfe.zzb(i24, (String) object);
                        }
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 9:
                    if ((i22 & i12) != 0) {
                        zzc = zzhy.zzc(i24, unsafe2.getObject(t11, j13), zzbh(i23));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 10:
                    if ((i22 & i12) != 0) {
                        zzc = zzfe.zzc(i24, (zzeo) unsafe2.getObject(t11, j13));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 11:
                    if ((i22 & i12) != 0) {
                        zzc = zzfe.zzj(i24, unsafe2.getInt(t11, j13));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 12:
                    if ((i22 & i12) != 0) {
                        zzc = zzfe.zzn(i24, unsafe2.getInt(t11, j13));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 13:
                    if ((i22 & i12) != 0) {
                        zzm = zzfe.zzm(i24, 0);
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 14:
                    if ((i22 & i12) != 0) {
                        zzc = zzfe.zzh(i24, 0L);
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 15:
                    if ((i22 & i12) != 0) {
                        zzc = zzfe.zzk(i24, unsafe2.getInt(t11, j13));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 16:
                    if ((i22 & i12) != 0) {
                        zzc = zzfe.zzf(i24, unsafe2.getLong(t11, j13));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 17:
                    if ((i22 & i12) != 0) {
                        zzc = zzfe.zzc(i24, (zzhf) unsafe2.getObject(t11, j13), zzbh(i23));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 18:
                    zzc = zzhy.zzw(i24, (List) unsafe2.getObject(t11, j13), false);
                    i21 += zzc;
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 19:
                    z13 = false;
                    zzv = zzhy.zzv(i24, (List) unsafe2.getObject(t11, j13), false);
                    i21 += zzv;
                    z11 = z13;
                    z12 = false;
                    j11 = 0;
                    break;
                case 20:
                    z13 = false;
                    zzv = zzhy.zzo(i24, (List) unsafe2.getObject(t11, j13), false);
                    i21 += zzv;
                    z11 = z13;
                    z12 = false;
                    j11 = 0;
                    break;
                case 21:
                    z13 = false;
                    zzv = zzhy.zzp(i24, (List) unsafe2.getObject(t11, j13), false);
                    i21 += zzv;
                    z11 = z13;
                    z12 = false;
                    j11 = 0;
                    break;
                case 22:
                    z13 = false;
                    zzv = zzhy.zzs(i24, (List) unsafe2.getObject(t11, j13), false);
                    i21 += zzv;
                    z11 = z13;
                    z12 = false;
                    j11 = 0;
                    break;
                case 23:
                    z13 = false;
                    zzv = zzhy.zzw(i24, (List) unsafe2.getObject(t11, j13), false);
                    i21 += zzv;
                    z11 = z13;
                    z12 = false;
                    j11 = 0;
                    break;
                case 24:
                    z13 = false;
                    zzv = zzhy.zzv(i24, (List) unsafe2.getObject(t11, j13), false);
                    i21 += zzv;
                    z11 = z13;
                    z12 = false;
                    j11 = 0;
                    break;
                case 25:
                    z13 = false;
                    zzv = zzhy.zzx(i24, (List) unsafe2.getObject(t11, j13), false);
                    i21 += zzv;
                    z11 = z13;
                    z12 = false;
                    j11 = 0;
                    break;
                case 26:
                    zzc = zzhy.zzc(i24, (List) unsafe2.getObject(t11, j13));
                    i21 += zzc;
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 27:
                    zzc = zzhy.zzc(i24, (List<?>) unsafe2.getObject(t11, j13), zzbh(i23));
                    i21 += zzc;
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 28:
                    zzc = zzhy.zzd(i24, (List) unsafe2.getObject(t11, j13));
                    i21 += zzc;
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 29:
                    zzc = zzhy.zzt(i24, (List) unsafe2.getObject(t11, j13), false);
                    i21 += zzc;
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 30:
                    z13 = false;
                    zzv = zzhy.zzr(i24, (List) unsafe2.getObject(t11, j13), false);
                    i21 += zzv;
                    z11 = z13;
                    z12 = false;
                    j11 = 0;
                    break;
                case 31:
                    z13 = false;
                    zzv = zzhy.zzv(i24, (List) unsafe2.getObject(t11, j13), false);
                    i21 += zzv;
                    z11 = z13;
                    z12 = false;
                    j11 = 0;
                    break;
                case 32:
                    z13 = false;
                    zzv = zzhy.zzw(i24, (List) unsafe2.getObject(t11, j13), false);
                    i21 += zzv;
                    z11 = z13;
                    z12 = false;
                    j11 = 0;
                    break;
                case 33:
                    z13 = false;
                    zzv = zzhy.zzu(i24, (List) unsafe2.getObject(t11, j13), false);
                    i21 += zzv;
                    z11 = z13;
                    z12 = false;
                    j11 = 0;
                    break;
                case 34:
                    z13 = false;
                    zzv = zzhy.zzq(i24, (List) unsafe2.getObject(t11, j13), false);
                    i21 += zzv;
                    z11 = z13;
                    z12 = false;
                    j11 = 0;
                    break;
                case 35:
                    zzy = zzhy.zzy((List) unsafe2.getObject(t11, j13));
                    if (zzy > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t11, i11, zzy);
                        }
                        zzav = zzfe.zzav(i24);
                        zzax = zzfe.zzax(zzy);
                        zzm = zzav + zzax + zzy;
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 36:
                    zzy = zzhy.zzx((List) unsafe2.getObject(t11, j13));
                    if (zzy > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t11, i11, zzy);
                        }
                        zzav = zzfe.zzav(i24);
                        zzax = zzfe.zzax(zzy);
                        zzm = zzav + zzax + zzy;
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 37:
                    zzy = zzhy.zzq((List) unsafe2.getObject(t11, j13));
                    if (zzy > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t11, i11, zzy);
                        }
                        zzav = zzfe.zzav(i24);
                        zzax = zzfe.zzax(zzy);
                        zzm = zzav + zzax + zzy;
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 38:
                    zzy = zzhy.zzr((List) unsafe2.getObject(t11, j13));
                    if (zzy > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t11, i11, zzy);
                        }
                        zzav = zzfe.zzav(i24);
                        zzax = zzfe.zzax(zzy);
                        zzm = zzav + zzax + zzy;
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 39:
                    zzy = zzhy.zzu((List) unsafe2.getObject(t11, j13));
                    if (zzy > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t11, i11, zzy);
                        }
                        zzav = zzfe.zzav(i24);
                        zzax = zzfe.zzax(zzy);
                        zzm = zzav + zzax + zzy;
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 40:
                    zzy = zzhy.zzy((List) unsafe2.getObject(t11, j13));
                    if (zzy > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t11, i11, zzy);
                        }
                        zzav = zzfe.zzav(i24);
                        zzax = zzfe.zzax(zzy);
                        zzm = zzav + zzax + zzy;
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 41:
                    zzy = zzhy.zzx((List) unsafe2.getObject(t11, j13));
                    if (zzy > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t11, i11, zzy);
                        }
                        zzav = zzfe.zzav(i24);
                        zzax = zzfe.zzax(zzy);
                        zzm = zzav + zzax + zzy;
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 42:
                    zzy = zzhy.zzz((List) unsafe2.getObject(t11, j13));
                    if (zzy > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t11, i11, zzy);
                        }
                        zzav = zzfe.zzav(i24);
                        zzax = zzfe.zzax(zzy);
                        zzm = zzav + zzax + zzy;
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 43:
                    zzy = zzhy.zzv((List) unsafe2.getObject(t11, j13));
                    if (zzy > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t11, i11, zzy);
                        }
                        zzav = zzfe.zzav(i24);
                        zzax = zzfe.zzax(zzy);
                        zzm = zzav + zzax + zzy;
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 44:
                    zzy = zzhy.zzt((List) unsafe2.getObject(t11, j13));
                    if (zzy > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t11, i11, zzy);
                        }
                        zzav = zzfe.zzav(i24);
                        zzax = zzfe.zzax(zzy);
                        zzm = zzav + zzax + zzy;
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 45:
                    zzy = zzhy.zzx((List) unsafe2.getObject(t11, j13));
                    if (zzy > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t11, i11, zzy);
                        }
                        zzav = zzfe.zzav(i24);
                        zzax = zzfe.zzax(zzy);
                        zzm = zzav + zzax + zzy;
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 46:
                    zzy = zzhy.zzy((List) unsafe2.getObject(t11, j13));
                    if (zzy > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t11, i11, zzy);
                        }
                        zzav = zzfe.zzav(i24);
                        zzax = zzfe.zzax(zzy);
                        zzm = zzav + zzax + zzy;
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 47:
                    zzy = zzhy.zzw((List) unsafe2.getObject(t11, j13));
                    if (zzy > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t11, i11, zzy);
                        }
                        zzav = zzfe.zzav(i24);
                        zzax = zzfe.zzax(zzy);
                        zzm = zzav + zzax + zzy;
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 48:
                    zzy = zzhy.zzs((List) unsafe2.getObject(t11, j13));
                    if (zzy > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t11, i11, zzy);
                        }
                        zzav = zzfe.zzav(i24);
                        zzax = zzfe.zzax(zzy);
                        zzm = zzav + zzax + zzy;
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 49:
                    zzc = zzhy.zzd(i24, (List) unsafe2.getObject(t11, j13), zzbh(i23));
                    i21 += zzc;
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 50:
                    zzc = this.zzzt.zzb(i24, unsafe2.getObject(t11, j13), zzbi(i23));
                    i21 += zzc;
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 51:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzc = zzfe.zzb(i24, 0.0d);
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 52:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzm = zzfe.zzb(i24, (float) BitmapDescriptorFactory.HUE_RED);
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 53:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzc = zzfe.zzd(i24, zzi(t11, j13));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 54:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzc = zzfe.zze(i24, zzi(t11, j13));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 55:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzc = zzfe.zzi(i24, zzh(t11, j13));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 56:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzc = zzfe.zzg(i24, 0L);
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 57:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzm = zzfe.zzl(i24, 0);
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 58:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzc = zzfe.zzc(i24, true);
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 59:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        Object object2 = unsafe2.getObject(t11, j13);
                        if (object2 instanceof zzeo) {
                            zzc = zzfe.zzc(i24, (zzeo) object2);
                        } else {
                            zzc = zzfe.zzb(i24, (String) object2);
                        }
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 60:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzc = zzhy.zzc(i24, unsafe2.getObject(t11, j13), zzbh(i23));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 61:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzc = zzfe.zzc(i24, (zzeo) unsafe2.getObject(t11, j13));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 62:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzc = zzfe.zzj(i24, zzh(t11, j13));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 63:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzc = zzfe.zzn(i24, zzh(t11, j13));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 64:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzm = zzfe.zzm(i24, 0);
                        i21 += zzm;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 65:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzc = zzfe.zzh(i24, 0L);
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 66:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzc = zzfe.zzk(i24, zzh(t11, j13));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 67:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzc = zzfe.zzf(i24, zzi(t11, j13));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                case 68:
                    if (zza((zzhj<T>) t11, i24, i23)) {
                        zzc = zzfe.zzc(i24, (zzhf) unsafe2.getObject(t11, j13), zzbh(i23));
                        i21 += zzc;
                    }
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
                default:
                    z11 = false;
                    z12 = false;
                    j11 = 0;
                    break;
            }
        }
        int zza = i21 + zza(this.zzzr, t11);
        return this.zzzi ? zza + this.zzzs.zzc(t11).zzeq() : zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.vision.zzhw] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.vision.zzhw] */
    @Override // com.google.android.gms.internal.vision.zzhw
    public final boolean zzr(T t11) {
        int i11;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean z11 = true;
            if (i13 >= this.zzzn) {
                return !this.zzzi || this.zzzs.zzc(t11).isInitialized();
            }
            int i15 = this.zzzm[i13];
            int i16 = this.zzzd[i15];
            int zzbk = zzbk(i15);
            if (this.zzzk) {
                i11 = 0;
            } else {
                int i17 = this.zzzd[i15 + 2];
                int i18 = i17 & 1048575;
                i11 = 1 << (i17 >>> 20);
                if (i18 != i12) {
                    i14 = zzzc.getInt(t11, i18);
                    i12 = i18;
                }
            }
            if (((268435456 & zzbk) != 0) && !zza((zzhj<T>) t11, i15, i14, i11)) {
                return false;
            }
            int i19 = (267386880 & zzbk) >>> 20;
            if (i19 != 9 && i19 != 17) {
                if (i19 != 27) {
                    if (i19 == 60 || i19 == 68) {
                        if (zza((zzhj<T>) t11, i16, i15) && !zza(t11, zzbk, zzbh(i15))) {
                            return false;
                        }
                    } else if (i19 != 49) {
                        if (i19 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzk = this.zzzt.zzk(zziu.zzp(t11, zzbk & 1048575));
                            if (!zzk.isEmpty()) {
                                if (this.zzzt.zzo(zzbi(i15)).zzyx.zzho() == zzji.MESSAGE) {
                                    zzhw<T> zzhwVar = 0;
                                    Iterator<?> it2 = zzk.values().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        Object next = it2.next();
                                        if (zzhwVar == null) {
                                            zzhwVar = zzhs.zzgl().zzf(next.getClass());
                                        }
                                        boolean zzr = zzhwVar.zzr(next);
                                        zzhwVar = zzhwVar;
                                        if (!zzr) {
                                            z11 = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z11) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zziu.zzp(t11, zzbk & 1048575);
                if (!list.isEmpty()) {
                    ?? zzbh = zzbh(i15);
                    int i21 = 0;
                    while (true) {
                        if (i21 >= list.size()) {
                            break;
                        } else if (!zzbh.zzr(list.get(i21))) {
                            z11 = false;
                            break;
                        } else {
                            i21++;
                        }
                    }
                }
                if (!z11) {
                    return false;
                }
            } else if (zza((zzhj<T>) t11, i15, i14, i11) && !zza(t11, zzbk, zzbh(i15))) {
                return false;
            }
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final void zze(T t11) {
        int i11;
        int i12 = this.zzzn;
        while (true) {
            i11 = this.zzzo;
            if (i12 >= i11) {
                break;
            }
            long zzbk = zzbk(this.zzzm[i12]) & 1048575;
            Object zzp = zziu.zzp(t11, zzbk);
            if (zzp != null) {
                zziu.zza(t11, zzbk, this.zzzt.zzm(zzp));
            }
            i12++;
        }
        int length = this.zzzm.length;
        while (i11 < length) {
            this.zzzq.zzb(t11, this.zzzm[i11]);
            i11++;
        }
        this.zzzr.zze(t11);
        if (this.zzzi) {
            this.zzzs.zze(t11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0494  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(T r19, com.google.android.gms.internal.vision.zzjj r20) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zzb(java.lang.Object, com.google.android.gms.internal.vision.zzjj):void");
    }

    private final int zzr(int i11, int i12) {
        if (i11 < this.zzzf || i11 > this.zzzg) {
            return -1;
        }
        return zzs(i11, i12);
    }

    private final boolean zzc(T t11, T t12, int i11) {
        return zza((zzhj<T>) t11, i11) == zza((zzhj<T>) t12, i11);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(arrays);
            throw new RuntimeException(sb2.toString());
        }
    }

    private final void zza(T t11, T t12, int i11) {
        long zzbk = zzbk(i11) & 1048575;
        if (zza((zzhj<T>) t12, i11)) {
            Object zzp = zziu.zzp(t11, zzbk);
            Object zzp2 = zziu.zzp(t12, zzbk);
            if (zzp != null && zzp2 != null) {
                zziu.zza(t11, zzbk, zzga.zza(zzp, zzp2));
                zzb((zzhj<T>) t11, i11);
            } else if (zzp2 != null) {
                zziu.zza(t11, zzbk, zzp2);
                zzb((zzhj<T>) t11, i11);
            }
        }
    }

    private static <UT, UB> int zza(zzio<UT, UB> zzioVar, T t11) {
        return zzioVar.zzp(zzioVar.zzt(t11));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a26  */
    @Override // com.google.android.gms.internal.vision.zzhw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r14, com.google.android.gms.internal.vision.zzjj r15) {
        /*
            Method dump skipped, instructions count: 2912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, com.google.android.gms.internal.vision.zzjj):void");
    }

    private final void zzb(T t11, int i11) {
        if (this.zzzk) {
            return;
        }
        int zzbl = zzbl(i11);
        long j11 = zzbl & 1048575;
        zziu.zzb(t11, j11, zziu.zzk(t11, j11) | (1 << (zzbl >>> 20)));
    }

    private final void zzb(T t11, int i11, int i12) {
        zziu.zzb(t11, zzbl(i12) & 1048575, i11);
    }

    private final <K, V> void zza(zzjj zzjjVar, int i11, Object obj, int i12) {
        if (obj != null) {
            zzjjVar.zza(i11, this.zzzt.zzo(zzbi(i12)), this.zzzt.zzk(obj));
        }
    }

    private static <UT, UB> void zza(zzio<UT, UB> zzioVar, T t11, zzjj zzjjVar) {
        zzioVar.zza((zzio<UT, UB>) zzioVar.zzt(t11), zzjjVar);
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final void zza(T t11, zzhv zzhvVar, zzfk zzfkVar) {
        Objects.requireNonNull(zzfkVar);
        zzio zzioVar = this.zzzr;
        zzfl<?> zzflVar = this.zzzs;
        zzfp<?> zzfpVar = null;
        Object obj = null;
        while (true) {
            try {
                int zzcn = zzhvVar.zzcn();
                int zzbn = zzbn(zzcn);
                if (zzbn >= 0) {
                    int zzbk = zzbk(zzbn);
                    switch ((267386880 & zzbk) >>> 20) {
                        case 0:
                            zziu.zza(t11, zzbk & 1048575, zzhvVar.readDouble());
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 1:
                            zziu.zza((Object) t11, zzbk & 1048575, zzhvVar.readFloat());
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 2:
                            zziu.zza((Object) t11, zzbk & 1048575, zzhvVar.zzcq());
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 3:
                            zziu.zza((Object) t11, zzbk & 1048575, zzhvVar.zzcp());
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 4:
                            zziu.zzb(t11, zzbk & 1048575, zzhvVar.zzcr());
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 5:
                            zziu.zza((Object) t11, zzbk & 1048575, zzhvVar.zzcs());
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 6:
                            zziu.zzb(t11, zzbk & 1048575, zzhvVar.zzct());
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 7:
                            zziu.zza(t11, zzbk & 1048575, zzhvVar.zzcu());
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 8:
                            zza(t11, zzbk, zzhvVar);
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 9:
                            if (zza((zzhj<T>) t11, zzbn)) {
                                long j11 = zzbk & 1048575;
                                zziu.zza(t11, j11, zzga.zza(zziu.zzp(t11, j11), zzhvVar.zza(zzbh(zzbn), zzfkVar)));
                                break;
                            } else {
                                zziu.zza(t11, zzbk & 1048575, zzhvVar.zza(zzbh(zzbn), zzfkVar));
                                zzb((zzhj<T>) t11, zzbn);
                                continue;
                            }
                        case 10:
                            zziu.zza(t11, zzbk & 1048575, zzhvVar.zzcw());
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 11:
                            zziu.zzb(t11, zzbk & 1048575, zzhvVar.zzcx());
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 12:
                            int zzcy = zzhvVar.zzcy();
                            zzgd zzbj = zzbj(zzbn);
                            if (zzbj != null && !zzbj.zzh(zzcy)) {
                                obj = zzhy.zza(zzcn, zzcy, obj, zzioVar);
                                break;
                            }
                            zziu.zzb(t11, zzbk & 1048575, zzcy);
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 13:
                            zziu.zzb(t11, zzbk & 1048575, zzhvVar.zzcz());
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 14:
                            zziu.zza((Object) t11, zzbk & 1048575, zzhvVar.zzda());
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 15:
                            zziu.zzb(t11, zzbk & 1048575, zzhvVar.zzdb());
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 16:
                            zziu.zza((Object) t11, zzbk & 1048575, zzhvVar.zzdc());
                            zzb((zzhj<T>) t11, zzbn);
                            continue;
                        case 17:
                            if (zza((zzhj<T>) t11, zzbn)) {
                                long j12 = zzbk & 1048575;
                                zziu.zza(t11, j12, zzga.zza(zziu.zzp(t11, j12), zzhvVar.zzc(zzbh(zzbn), zzfkVar)));
                                break;
                            } else {
                                zziu.zza(t11, zzbk & 1048575, zzhvVar.zzc(zzbh(zzbn), zzfkVar));
                                zzb((zzhj<T>) t11, zzbn);
                                continue;
                            }
                        case 18:
                            zzhvVar.zza(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 19:
                            zzhvVar.zzb(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 20:
                            zzhvVar.zzd(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 21:
                            zzhvVar.zzc(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 22:
                            zzhvVar.zze(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 23:
                            zzhvVar.zzf(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 24:
                            zzhvVar.zzg(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 25:
                            zzhvVar.zzh(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 26:
                            if (zzbm(zzbk)) {
                                zzhvVar.zzi(this.zzzq.zza(t11, zzbk & 1048575));
                                break;
                            } else {
                                zzhvVar.readStringList(this.zzzq.zza(t11, zzbk & 1048575));
                                continue;
                            }
                        case 27:
                            zzhvVar.zza(this.zzzq.zza(t11, zzbk & 1048575), zzbh(zzbn), zzfkVar);
                            continue;
                        case 28:
                            zzhvVar.zzj(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 29:
                            zzhvVar.zzk(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 30:
                            List<Integer> zza = this.zzzq.zza(t11, zzbk & 1048575);
                            zzhvVar.zzl(zza);
                            obj = zzhy.zza(zzcn, zza, zzbj(zzbn), obj, zzioVar);
                            continue;
                        case 31:
                            zzhvVar.zzm(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 32:
                            zzhvVar.zzn(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 33:
                            zzhvVar.zzo(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 34:
                            zzhvVar.zzp(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 35:
                            zzhvVar.zza(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 36:
                            zzhvVar.zzb(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 37:
                            zzhvVar.zzd(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 38:
                            zzhvVar.zzc(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 39:
                            zzhvVar.zze(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 40:
                            zzhvVar.zzf(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 41:
                            zzhvVar.zzg(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 42:
                            zzhvVar.zzh(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 43:
                            zzhvVar.zzk(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 44:
                            List<Integer> zza2 = this.zzzq.zza(t11, zzbk & 1048575);
                            zzhvVar.zzl(zza2);
                            obj = zzhy.zza(zzcn, zza2, zzbj(zzbn), obj, zzioVar);
                            continue;
                        case 45:
                            zzhvVar.zzm(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 46:
                            zzhvVar.zzn(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 47:
                            zzhvVar.zzo(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 48:
                            zzhvVar.zzp(this.zzzq.zza(t11, zzbk & 1048575));
                            continue;
                        case 49:
                            zzhvVar.zzb(this.zzzq.zza(t11, zzbk & 1048575), zzbh(zzbn), zzfkVar);
                            continue;
                        case 50:
                            Object zzbi = zzbi(zzbn);
                            long zzbk2 = zzbk(zzbn) & 1048575;
                            Object zzp = zziu.zzp(t11, zzbk2);
                            if (zzp == null) {
                                zzp = this.zzzt.zzn(zzbi);
                                zziu.zza(t11, zzbk2, zzp);
                            } else if (this.zzzt.zzl(zzp)) {
                                Object zzn = this.zzzt.zzn(zzbi);
                                this.zzzt.zzb(zzn, zzp);
                                zziu.zza(t11, zzbk2, zzn);
                                zzp = zzn;
                            }
                            zzhvVar.zza(this.zzzt.zzj(zzp), this.zzzt.zzo(zzbi), zzfkVar);
                            continue;
                        case 51:
                            zziu.zza(t11, zzbk & 1048575, Double.valueOf(zzhvVar.readDouble()));
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 52:
                            zziu.zza(t11, zzbk & 1048575, Float.valueOf(zzhvVar.readFloat()));
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 53:
                            zziu.zza(t11, zzbk & 1048575, Long.valueOf(zzhvVar.zzcq()));
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 54:
                            zziu.zza(t11, zzbk & 1048575, Long.valueOf(zzhvVar.zzcp()));
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 55:
                            zziu.zza(t11, zzbk & 1048575, Integer.valueOf(zzhvVar.zzcr()));
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 56:
                            zziu.zza(t11, zzbk & 1048575, Long.valueOf(zzhvVar.zzcs()));
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 57:
                            zziu.zza(t11, zzbk & 1048575, Integer.valueOf(zzhvVar.zzct()));
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 58:
                            zziu.zza(t11, zzbk & 1048575, Boolean.valueOf(zzhvVar.zzcu()));
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 59:
                            zza(t11, zzbk, zzhvVar);
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 60:
                            if (zza((zzhj<T>) t11, zzcn, zzbn)) {
                                long j13 = zzbk & 1048575;
                                zziu.zza(t11, j13, zzga.zza(zziu.zzp(t11, j13), zzhvVar.zza(zzbh(zzbn), zzfkVar)));
                            } else {
                                zziu.zza(t11, zzbk & 1048575, zzhvVar.zza(zzbh(zzbn), zzfkVar));
                                zzb((zzhj<T>) t11, zzbn);
                            }
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 61:
                            zziu.zza(t11, zzbk & 1048575, zzhvVar.zzcw());
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 62:
                            zziu.zza(t11, zzbk & 1048575, Integer.valueOf(zzhvVar.zzcx()));
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 63:
                            int zzcy2 = zzhvVar.zzcy();
                            zzgd zzbj2 = zzbj(zzbn);
                            if (zzbj2 != null && !zzbj2.zzh(zzcy2)) {
                                obj = zzhy.zza(zzcn, zzcy2, obj, zzioVar);
                                break;
                            }
                            zziu.zza(t11, zzbk & 1048575, Integer.valueOf(zzcy2));
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 64:
                            zziu.zza(t11, zzbk & 1048575, Integer.valueOf(zzhvVar.zzcz()));
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 65:
                            zziu.zza(t11, zzbk & 1048575, Long.valueOf(zzhvVar.zzda()));
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 66:
                            zziu.zza(t11, zzbk & 1048575, Integer.valueOf(zzhvVar.zzdb()));
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 67:
                            zziu.zza(t11, zzbk & 1048575, Long.valueOf(zzhvVar.zzdc()));
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        case 68:
                            zziu.zza(t11, zzbk & 1048575, zzhvVar.zzc(zzbh(zzbn), zzfkVar));
                            zzb((zzhj<T>) t11, zzcn, zzbn);
                            continue;
                        default:
                            if (obj == null) {
                                try {
                                    obj = zzioVar.zzhd();
                                } catch (zzgg unused) {
                                    zzioVar.zza(zzhvVar);
                                    if (obj == null) {
                                        obj = zzioVar.zzu(t11);
                                    }
                                    if (!zzioVar.zza((zzio) obj, zzhvVar)) {
                                        for (int i11 = this.zzzn; i11 < this.zzzo; i11++) {
                                            obj = zza((Object) t11, this.zzzm[i11], (int) obj, (zzio<UT, int>) zzioVar);
                                        }
                                        if (obj != null) {
                                            zzioVar.zzf(t11, obj);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!zzioVar.zza((zzio) obj, zzhvVar)) {
                                for (int i12 = this.zzzn; i12 < this.zzzo; i12++) {
                                    obj = zza((Object) t11, this.zzzm[i12], (int) obj, (zzio<UT, int>) zzioVar);
                                }
                                if (obj != null) {
                                    zzioVar.zzf(t11, obj);
                                    return;
                                }
                                return;
                            }
                            continue;
                    }
                } else if (zzcn == Integer.MAX_VALUE) {
                    for (int i13 = this.zzzn; i13 < this.zzzo; i13++) {
                        obj = zza((Object) t11, this.zzzm[i13], (int) obj, (zzio<UT, int>) zzioVar);
                    }
                    if (obj != null) {
                        zzioVar.zzf(t11, obj);
                        return;
                    }
                    return;
                } else {
                    Object zza3 = !this.zzzi ? null : zzflVar.zza(zzfkVar, this.zzzh, zzcn);
                    if (zza3 != null) {
                        if (zzfpVar == null) {
                            zzfpVar = zzflVar.zzd(t11);
                        }
                        zzfp<?> zzfpVar2 = zzfpVar;
                        obj = zzflVar.zza(zzhvVar, zza3, zzfkVar, zzfpVar2, obj, zzioVar);
                        zzfpVar = zzfpVar2;
                    } else {
                        zzioVar.zza(zzhvVar);
                        if (obj == null) {
                            obj = zzioVar.zzu(t11);
                        }
                        if (!zzioVar.zza((zzio) obj, zzhvVar)) {
                            for (int i14 = this.zzzn; i14 < this.zzzo; i14++) {
                                obj = zza((Object) t11, this.zzzm[i14], (int) obj, (zzio<UT, int>) zzioVar);
                            }
                            if (obj != null) {
                                zzioVar.zzf(t11, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th2) {
                for (int i15 = this.zzzn; i15 < this.zzzo; i15++) {
                    obj = zza((Object) t11, this.zzzm[i15], (int) obj, (zzio<UT, int>) zzioVar);
                }
                if (obj != null) {
                    zzioVar.zzf(t11, obj);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zza(zzhw zzhwVar, byte[] bArr, int i11, int i12, zzei zzeiVar) {
        int i13 = i11 + 1;
        int i14 = bArr[i11];
        if (i14 < 0) {
            i13 = zzeh.zza(i14, bArr, i13, zzeiVar);
            i14 = zzeiVar.zzro;
        }
        int i15 = i13;
        if (i14 >= 0 && i14 <= i12 - i15) {
            Object newInstance = zzhwVar.newInstance();
            int i16 = i14 + i15;
            zzhwVar.zza(newInstance, bArr, i15, i16, zzeiVar);
            zzhwVar.zze(newInstance);
            zzeiVar.zzrq = newInstance;
            return i16;
        }
        throw zzgf.zzfh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zza(zzhw zzhwVar, byte[] bArr, int i11, int i12, int i13, zzei zzeiVar) {
        zzhj zzhjVar = (zzhj) zzhwVar;
        Object newInstance = zzhjVar.newInstance();
        int zza = zzhjVar.zza((zzhj) newInstance, bArr, i11, i12, i13, zzeiVar);
        zzhjVar.zze(newInstance);
        zzeiVar.zzrq = newInstance;
        return zza;
    }

    private static int zza(zzhw<?> zzhwVar, int i11, byte[] bArr, int i12, int i13, zzge<?> zzgeVar, zzei zzeiVar) {
        int zza = zza((zzhw) zzhwVar, bArr, i12, i13, zzeiVar);
        zzgeVar.add(zzeiVar.zzrq);
        while (zza < i13) {
            int zza2 = zzeh.zza(bArr, zza, zzeiVar);
            if (i11 != zzeiVar.zzro) {
                break;
            }
            zza = zza((zzhw) zzhwVar, bArr, zza2, i13, zzeiVar);
            zzgeVar.add(zzeiVar.zzrq);
        }
        return zza;
    }

    private static int zza(byte[] bArr, int i11, int i12, zzjd zzjdVar, Class<?> cls, zzei zzeiVar) {
        switch (zzhk.zzrr[zzjdVar.ordinal()]) {
            case 1:
                int zzb = zzeh.zzb(bArr, i11, zzeiVar);
                zzeiVar.zzrq = Boolean.valueOf(zzeiVar.zzrp != 0);
                return zzb;
            case 2:
                return zzeh.zze(bArr, i11, zzeiVar);
            case 3:
                zzeiVar.zzrq = Double.valueOf(zzeh.zzc(bArr, i11));
                return i11 + 8;
            case 4:
            case 5:
                zzeiVar.zzrq = Integer.valueOf(zzeh.zza(bArr, i11));
                return i11 + 4;
            case 6:
            case 7:
                zzeiVar.zzrq = Long.valueOf(zzeh.zzb(bArr, i11));
                return i11 + 8;
            case 8:
                zzeiVar.zzrq = Float.valueOf(zzeh.zzd(bArr, i11));
                return i11 + 4;
            case 9:
            case 10:
            case 11:
                int zza = zzeh.zza(bArr, i11, zzeiVar);
                zzeiVar.zzrq = Integer.valueOf(zzeiVar.zzro);
                return zza;
            case 12:
            case 13:
                int zzb2 = zzeh.zzb(bArr, i11, zzeiVar);
                zzeiVar.zzrq = Long.valueOf(zzeiVar.zzrp);
                return zzb2;
            case 14:
                return zza((zzhw) zzhs.zzgl().zzf(cls), bArr, i11, i12, zzeiVar);
            case 15:
                int zza2 = zzeh.zza(bArr, i11, zzeiVar);
                zzeiVar.zzrq = Integer.valueOf(zzez.zzaq(zzeiVar.zzro));
                return zza2;
            case 16:
                int zzb3 = zzeh.zzb(bArr, i11, zzeiVar);
                zzeiVar.zzrq = Long.valueOf(zzez.zzd(zzeiVar.zzrp));
                return zzb3;
            case 17:
                return zzeh.zzd(bArr, i11, zzeiVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static int zza(int i11, byte[] bArr, int i12, int i13, Object obj, zzei zzeiVar) {
        return zzeh.zza(i11, bArr, i12, i13, zzq(obj), zzeiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0233 -> B:116:0x0234). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x016b -> B:67:0x016c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01e5 -> B:96:0x01e6). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.vision.zzei r29) {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.vision.zzei):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <K, V> int zza(T t11, byte[] bArr, int i11, int i12, int i13, long j11, zzei zzeiVar) {
        Unsafe unsafe = zzzc;
        Object zzbi = zzbi(i13);
        Object object = unsafe.getObject(t11, j11);
        if (this.zzzt.zzl(object)) {
            Object zzn = this.zzzt.zzn(zzbi);
            this.zzzt.zzb(zzn, object);
            unsafe.putObject(t11, j11, zzn);
            object = zzn;
        }
        zzgy<?, ?> zzo = this.zzzt.zzo(zzbi);
        Map<?, ?> zzj = this.zzzt.zzj(object);
        int zza = zzeh.zza(bArr, i11, zzeiVar);
        int i14 = zzeiVar.zzro;
        if (i14 >= 0 && i14 <= i12 - zza) {
            int i15 = i14 + zza;
            Object obj = (K) zzo.zzyw;
            Object obj2 = (V) zzo.zzgq;
            while (zza < i15) {
                int i16 = zza + 1;
                int i17 = bArr[zza];
                if (i17 < 0) {
                    i16 = zzeh.zza(i17, bArr, i16, zzeiVar);
                    i17 = zzeiVar.zzro;
                }
                int i18 = i16;
                int i19 = i17 >>> 3;
                int i21 = i17 & 7;
                if (i19 != 1) {
                    if (i19 == 2 && i21 == zzo.zzyx.zzhp()) {
                        zza = zza(bArr, i18, i12, zzo.zzyx, zzo.zzgq.getClass(), zzeiVar);
                        obj2 = zzeiVar.zzrq;
                    }
                    zza = zzeh.zza(i17, bArr, i18, i12, zzeiVar);
                } else if (i21 == zzo.zzyv.zzhp()) {
                    zza = zza(bArr, i18, i12, zzo.zzyv, (Class<?>) null, zzeiVar);
                    obj = (K) zzeiVar.zzrq;
                } else {
                    zza = zzeh.zza(i17, bArr, i18, i12, zzeiVar);
                }
            }
            if (zza == i15) {
                zzj.put(obj, obj2);
                return i15;
            }
            throw zzgf.zzfo();
        }
        throw zzgf.zzfh();
    }

    private final int zza(T t11, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, int i18, zzei zzeiVar) {
        int zzb;
        Unsafe unsafe = zzzc;
        long j12 = this.zzzd[i18 + 2] & 1048575;
        switch (i17) {
            case 51:
                if (i15 == 1) {
                    unsafe.putObject(t11, j11, Double.valueOf(zzeh.zzc(bArr, i11)));
                    zzb = i11 + 8;
                    unsafe.putInt(t11, j12, i14);
                    return zzb;
                }
                return i11;
            case 52:
                if (i15 == 5) {
                    unsafe.putObject(t11, j11, Float.valueOf(zzeh.zzd(bArr, i11)));
                    zzb = i11 + 4;
                    unsafe.putInt(t11, j12, i14);
                    return zzb;
                }
                return i11;
            case 53:
            case 54:
                if (i15 == 0) {
                    zzb = zzeh.zzb(bArr, i11, zzeiVar);
                    unsafe.putObject(t11, j11, Long.valueOf(zzeiVar.zzrp));
                    unsafe.putInt(t11, j12, i14);
                    return zzb;
                }
                return i11;
            case 55:
            case 62:
                if (i15 == 0) {
                    zzb = zzeh.zza(bArr, i11, zzeiVar);
                    unsafe.putObject(t11, j11, Integer.valueOf(zzeiVar.zzro));
                    unsafe.putInt(t11, j12, i14);
                    return zzb;
                }
                return i11;
            case 56:
            case 65:
                if (i15 == 1) {
                    unsafe.putObject(t11, j11, Long.valueOf(zzeh.zzb(bArr, i11)));
                    zzb = i11 + 8;
                    unsafe.putInt(t11, j12, i14);
                    return zzb;
                }
                return i11;
            case 57:
            case 64:
                if (i15 == 5) {
                    unsafe.putObject(t11, j11, Integer.valueOf(zzeh.zza(bArr, i11)));
                    zzb = i11 + 4;
                    unsafe.putInt(t11, j12, i14);
                    return zzb;
                }
                return i11;
            case 58:
                if (i15 == 0) {
                    zzb = zzeh.zzb(bArr, i11, zzeiVar);
                    unsafe.putObject(t11, j11, Boolean.valueOf(zzeiVar.zzrp != 0));
                    unsafe.putInt(t11, j12, i14);
                    return zzb;
                }
                return i11;
            case 59:
                if (i15 == 2) {
                    int zza = zzeh.zza(bArr, i11, zzeiVar);
                    int i19 = zzeiVar.zzro;
                    if (i19 == 0) {
                        unsafe.putObject(t11, j11, "");
                    } else if ((i16 & PKIFailureInfo.duplicateCertReq) != 0 && !zziw.zzg(bArr, zza, zza + i19)) {
                        throw zzgf.zzfp();
                    } else {
                        unsafe.putObject(t11, j11, new String(bArr, zza, i19, zzga.UTF_8));
                        zza += i19;
                    }
                    unsafe.putInt(t11, j12, i14);
                    return zza;
                }
                return i11;
            case 60:
                if (i15 == 2) {
                    int zza2 = zza(zzbh(i18), bArr, i11, i12, zzeiVar);
                    Object object = unsafe.getInt(t11, j12) == i14 ? unsafe.getObject(t11, j11) : null;
                    if (object == null) {
                        unsafe.putObject(t11, j11, zzeiVar.zzrq);
                    } else {
                        unsafe.putObject(t11, j11, zzga.zza(object, zzeiVar.zzrq));
                    }
                    unsafe.putInt(t11, j12, i14);
                    return zza2;
                }
                return i11;
            case 61:
                if (i15 == 2) {
                    zzb = zzeh.zze(bArr, i11, zzeiVar);
                    unsafe.putObject(t11, j11, zzeiVar.zzrq);
                    unsafe.putInt(t11, j12, i14);
                    return zzb;
                }
                return i11;
            case 63:
                if (i15 == 0) {
                    int zza3 = zzeh.zza(bArr, i11, zzeiVar);
                    int i21 = zzeiVar.zzro;
                    zzgd zzbj = zzbj(i18);
                    if (zzbj != null && !zzbj.zzh(i21)) {
                        zzq(t11).zzb(i13, Long.valueOf(i21));
                        return zza3;
                    }
                    unsafe.putObject(t11, j11, Integer.valueOf(i21));
                    zzb = zza3;
                    unsafe.putInt(t11, j12, i14);
                    return zzb;
                }
                return i11;
            case 66:
                if (i15 == 0) {
                    zzb = zzeh.zza(bArr, i11, zzeiVar);
                    unsafe.putObject(t11, j11, Integer.valueOf(zzez.zzaq(zzeiVar.zzro)));
                    unsafe.putInt(t11, j12, i14);
                    return zzb;
                }
                return i11;
            case 67:
                if (i15 == 0) {
                    zzb = zzeh.zzb(bArr, i11, zzeiVar);
                    unsafe.putObject(t11, j11, Long.valueOf(zzez.zzd(zzeiVar.zzrp)));
                    unsafe.putInt(t11, j12, i14);
                    return zzb;
                }
                return i11;
            case 68:
                if (i15 == 3) {
                    zzb = zza(zzbh(i18), bArr, i11, i12, (i13 & (-8)) | 4, zzeiVar);
                    Object object2 = unsafe.getInt(t11, j12) == i14 ? unsafe.getObject(t11, j11) : null;
                    if (object2 == null) {
                        unsafe.putObject(t11, j11, zzeiVar.zzrq);
                    } else {
                        unsafe.putObject(t11, j11, zzga.zza(object2, zzeiVar.zzrq));
                    }
                    unsafe.putInt(t11, j12, i14);
                    return zzb;
                }
                return i11;
            default:
                return i11;
        }
    }

    private final int zza(T t11, byte[] bArr, int i11, int i12, int i13, zzei zzeiVar) {
        Unsafe unsafe;
        int i14;
        T t12;
        byte b11;
        int i15;
        int zzbn;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        zzei zzeiVar2;
        zzei zzeiVar3;
        int zzb;
        int i24;
        int i25;
        int i26;
        int i27;
        zzhj<T> zzhjVar = this;
        T t13 = t11;
        byte[] bArr2 = bArr;
        int i28 = i12;
        int i29 = i13;
        zzei zzeiVar4 = zzeiVar;
        Unsafe unsafe2 = zzzc;
        int i31 = i11;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = -1;
        int i36 = -1;
        while (true) {
            if (i31 < i28) {
                int i37 = i31 + 1;
                byte b12 = bArr2[i31];
                if (b12 < 0) {
                    i15 = zzeh.zza(b12, bArr2, i37, zzeiVar4);
                    b11 = zzeiVar4.zzro;
                } else {
                    b11 = b12;
                    i15 = i37;
                }
                int i38 = b11 >>> 3;
                int i39 = b11 & 7;
                if (i38 > i35) {
                    zzbn = zzhjVar.zzr(i38, i32 / 3);
                } else {
                    zzbn = zzhjVar.zzbn(i38);
                }
                int i41 = zzbn;
                if (i41 == -1) {
                    i16 = i38;
                    i17 = i15;
                    i18 = b11;
                    unsafe = unsafe2;
                    i14 = i29;
                    i19 = 0;
                } else {
                    int[] iArr = zzhjVar.zzzd;
                    int i42 = iArr[i41 + 1];
                    int i43 = (i42 & 267386880) >>> 20;
                    int i44 = b11;
                    long j11 = i42 & 1048575;
                    if (i43 <= 17) {
                        int i45 = iArr[i41 + 2];
                        int i46 = 1 << (i45 >>> 20);
                        int i47 = i45 & 1048575;
                        if (i47 != i36) {
                            if (i36 != -1) {
                                unsafe2.putInt(t13, i36, i34);
                            }
                            i34 = unsafe2.getInt(t13, i47);
                            i36 = i47;
                        }
                        switch (i43) {
                            case 0:
                                zzeiVar2 = zzeiVar;
                                i21 = i41;
                                i16 = i38;
                                i23 = i44;
                                bArr2 = bArr;
                                i22 = i15;
                                if (i39 == 1) {
                                    zziu.zza(t13, j11, zzeh.zzc(bArr2, i22));
                                    i31 = i22 + 8;
                                    i34 |= i46;
                                    i28 = i12;
                                    i33 = i23;
                                    i32 = i21;
                                    zzeiVar4 = zzeiVar2;
                                    i35 = i16;
                                    i29 = i13;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i18 = i23;
                                    i14 = i13;
                                    break;
                                }
                            case 1:
                                zzeiVar2 = zzeiVar;
                                i21 = i41;
                                i16 = i38;
                                i23 = i44;
                                bArr2 = bArr;
                                i22 = i15;
                                if (i39 == 5) {
                                    zziu.zza((Object) t13, j11, zzeh.zzd(bArr2, i22));
                                    i31 = i22 + 4;
                                    i34 |= i46;
                                    i28 = i12;
                                    i33 = i23;
                                    i32 = i21;
                                    zzeiVar4 = zzeiVar2;
                                    i35 = i16;
                                    i29 = i13;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i18 = i23;
                                    i14 = i13;
                                    break;
                                }
                            case 2:
                            case 3:
                                zzeiVar3 = zzeiVar;
                                i21 = i41;
                                i16 = i38;
                                i23 = i44;
                                bArr2 = bArr;
                                i22 = i15;
                                if (i39 == 0) {
                                    zzb = zzeh.zzb(bArr2, i22, zzeiVar3);
                                    unsafe2.putLong(t11, j11, zzeiVar3.zzrp);
                                    i34 |= i46;
                                    i33 = i23;
                                    i32 = i21;
                                    zzeiVar4 = zzeiVar3;
                                    i31 = zzb;
                                    i35 = i16;
                                    i28 = i12;
                                    i29 = i13;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i18 = i23;
                                    i14 = i13;
                                    break;
                                }
                            case 4:
                            case 11:
                                zzeiVar2 = zzeiVar;
                                i21 = i41;
                                i16 = i38;
                                i23 = i44;
                                bArr2 = bArr;
                                i22 = i15;
                                if (i39 == 0) {
                                    i31 = zzeh.zza(bArr2, i22, zzeiVar2);
                                    unsafe2.putInt(t13, j11, zzeiVar2.zzro);
                                    i34 |= i46;
                                    i28 = i12;
                                    i33 = i23;
                                    i32 = i21;
                                    zzeiVar4 = zzeiVar2;
                                    i35 = i16;
                                    i29 = i13;
                                    break;
                                } else {
                                    i19 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i18 = i23;
                                    i14 = i13;
                                    break;
                                }
                            case 5:
                            case 14:
                                zzeiVar2 = zzeiVar;
                                i21 = i41;
                                i16 = i38;
                                i23 = i44;
                                bArr2 = bArr;
                                if (i39 == 1) {
                                    i22 = i15;
                                    unsafe2.putLong(t11, j11, zzeh.zzb(bArr2, i15));
                                    i31 = i22 + 8;
                                    i34 |= i46;
                                    i28 = i12;
                                    i33 = i23;
                                    i32 = i21;
                                    zzeiVar4 = zzeiVar2;
                                    i35 = i16;
                                    i29 = i13;
                                    break;
                                } else {
                                    i22 = i15;
                                    i19 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i18 = i23;
                                    i14 = i13;
                                    break;
                                }
                            case 6:
                            case 13:
                                zzeiVar2 = zzeiVar;
                                i21 = i41;
                                i16 = i38;
                                i23 = i44;
                                bArr2 = bArr;
                                i28 = i12;
                                if (i39 == 5) {
                                    unsafe2.putInt(t13, j11, zzeh.zza(bArr2, i15));
                                    i31 = i15 + 4;
                                    i34 |= i46;
                                    i33 = i23;
                                    i32 = i21;
                                    zzeiVar4 = zzeiVar2;
                                    i35 = i16;
                                    i29 = i13;
                                    break;
                                } else {
                                    i22 = i15;
                                    i19 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i18 = i23;
                                    i14 = i13;
                                    break;
                                }
                            case 7:
                                zzeiVar2 = zzeiVar;
                                i21 = i41;
                                i16 = i38;
                                i23 = i44;
                                bArr2 = bArr;
                                i28 = i12;
                                if (i39 == 0) {
                                    i31 = zzeh.zzb(bArr2, i15, zzeiVar2);
                                    zziu.zza(t13, j11, zzeiVar2.zzrp != 0);
                                    i34 |= i46;
                                    i33 = i23;
                                    i32 = i21;
                                    zzeiVar4 = zzeiVar2;
                                    i35 = i16;
                                    i29 = i13;
                                    break;
                                } else {
                                    i22 = i15;
                                    i19 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i18 = i23;
                                    i14 = i13;
                                    break;
                                }
                            case 8:
                                zzeiVar2 = zzeiVar;
                                i21 = i41;
                                i16 = i38;
                                i23 = i44;
                                bArr2 = bArr;
                                i28 = i12;
                                if (i39 == 2) {
                                    if ((i42 & PKIFailureInfo.duplicateCertReq) == 0) {
                                        i31 = zzeh.zzc(bArr2, i15, zzeiVar2);
                                    } else {
                                        i31 = zzeh.zzd(bArr2, i15, zzeiVar2);
                                    }
                                    unsafe2.putObject(t13, j11, zzeiVar2.zzrq);
                                    i34 |= i46;
                                    i33 = i23;
                                    i32 = i21;
                                    zzeiVar4 = zzeiVar2;
                                    i35 = i16;
                                    i29 = i13;
                                    break;
                                } else {
                                    i22 = i15;
                                    i19 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i18 = i23;
                                    i14 = i13;
                                    break;
                                }
                            case 9:
                                zzeiVar2 = zzeiVar;
                                i21 = i41;
                                i16 = i38;
                                i23 = i44;
                                bArr2 = bArr;
                                if (i39 == 2) {
                                    i28 = i12;
                                    i31 = zza(zzhjVar.zzbh(i21), bArr2, i15, i28, zzeiVar2);
                                    if ((i34 & i46) == 0) {
                                        unsafe2.putObject(t13, j11, zzeiVar2.zzrq);
                                    } else {
                                        unsafe2.putObject(t13, j11, zzga.zza(unsafe2.getObject(t13, j11), zzeiVar2.zzrq));
                                    }
                                    i34 |= i46;
                                    i33 = i23;
                                    i32 = i21;
                                    zzeiVar4 = zzeiVar2;
                                    i35 = i16;
                                    i29 = i13;
                                    break;
                                } else {
                                    i22 = i15;
                                    i19 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i18 = i23;
                                    i14 = i13;
                                    break;
                                }
                            case 10:
                                zzeiVar2 = zzeiVar;
                                i21 = i41;
                                i16 = i38;
                                i23 = i44;
                                bArr2 = bArr;
                                if (i39 == 2) {
                                    i31 = zzeh.zze(bArr2, i15, zzeiVar2);
                                    unsafe2.putObject(t13, j11, zzeiVar2.zzrq);
                                    i34 |= i46;
                                    i28 = i12;
                                    i33 = i23;
                                    i32 = i21;
                                    zzeiVar4 = zzeiVar2;
                                    i35 = i16;
                                    i29 = i13;
                                    break;
                                } else {
                                    i22 = i15;
                                    i19 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i18 = i23;
                                    i14 = i13;
                                    break;
                                }
                            case 12:
                                zzeiVar2 = zzeiVar;
                                i21 = i41;
                                i16 = i38;
                                i23 = i44;
                                bArr2 = bArr;
                                if (i39 == 0) {
                                    i31 = zzeh.zza(bArr2, i15, zzeiVar2);
                                    int i48 = zzeiVar2.zzro;
                                    zzgd zzbj = zzhjVar.zzbj(i21);
                                    if (zzbj != null && !zzbj.zzh(i48)) {
                                        zzq(t11).zzb(i23, Long.valueOf(i48));
                                        i28 = i12;
                                        i33 = i23;
                                        i32 = i21;
                                        zzeiVar4 = zzeiVar2;
                                        i35 = i16;
                                        i29 = i13;
                                    } else {
                                        unsafe2.putInt(t13, j11, i48);
                                        i34 |= i46;
                                        i28 = i12;
                                        i33 = i23;
                                        i32 = i21;
                                        zzeiVar4 = zzeiVar2;
                                        i35 = i16;
                                        i29 = i13;
                                        break;
                                    }
                                } else {
                                    i22 = i15;
                                    i19 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i18 = i23;
                                    i14 = i13;
                                    break;
                                }
                                break;
                            case 15:
                                zzeiVar2 = zzeiVar;
                                i21 = i41;
                                i16 = i38;
                                i23 = i44;
                                bArr2 = bArr;
                                if (i39 == 0) {
                                    i31 = zzeh.zza(bArr2, i15, zzeiVar2);
                                    unsafe2.putInt(t13, j11, zzez.zzaq(zzeiVar2.zzro));
                                    i34 |= i46;
                                    i28 = i12;
                                    i33 = i23;
                                    i32 = i21;
                                    zzeiVar4 = zzeiVar2;
                                    i35 = i16;
                                    i29 = i13;
                                    break;
                                } else {
                                    i22 = i15;
                                    i19 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i18 = i23;
                                    i14 = i13;
                                    break;
                                }
                            case 16:
                                zzeiVar3 = zzeiVar;
                                i21 = i41;
                                i16 = i38;
                                i23 = i44;
                                if (i39 == 0) {
                                    bArr2 = bArr;
                                    zzb = zzeh.zzb(bArr2, i15, zzeiVar3);
                                    unsafe2.putLong(t11, j11, zzez.zzd(zzeiVar3.zzrp));
                                    i34 |= i46;
                                    i33 = i23;
                                    i32 = i21;
                                    zzeiVar4 = zzeiVar3;
                                    i31 = zzb;
                                    i35 = i16;
                                    i28 = i12;
                                    i29 = i13;
                                    break;
                                } else {
                                    i22 = i15;
                                    i19 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i18 = i23;
                                    i14 = i13;
                                    break;
                                }
                            case 17:
                                if (i39 == 3) {
                                    i21 = i41;
                                    i16 = i38;
                                    i23 = i44;
                                    i31 = zza(zzhjVar.zzbh(i41), bArr, i15, i12, (i38 << 3) | 4, zzeiVar);
                                    if ((i34 & i46) == 0) {
                                        zzeiVar2 = zzeiVar;
                                        unsafe2.putObject(t13, j11, zzeiVar2.zzrq);
                                    } else {
                                        zzeiVar2 = zzeiVar;
                                        unsafe2.putObject(t13, j11, zzga.zza(unsafe2.getObject(t13, j11), zzeiVar2.zzrq));
                                    }
                                    i34 |= i46;
                                    bArr2 = bArr;
                                    i28 = i12;
                                    i33 = i23;
                                    i32 = i21;
                                    zzeiVar4 = zzeiVar2;
                                    i35 = i16;
                                    i29 = i13;
                                    break;
                                } else {
                                    i21 = i41;
                                    i16 = i38;
                                    i23 = i44;
                                    i22 = i15;
                                    i19 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i18 = i23;
                                    i14 = i13;
                                    break;
                                }
                            default:
                                i21 = i41;
                                i16 = i38;
                                i22 = i15;
                                i23 = i44;
                                i19 = i21;
                                unsafe = unsafe2;
                                i17 = i22;
                                i18 = i23;
                                i14 = i13;
                                break;
                        }
                    } else {
                        i16 = i38;
                        bArr2 = bArr;
                        int i49 = i15;
                        if (i43 != 27) {
                            i24 = i34;
                            if (i43 <= 49) {
                                i25 = i36;
                                i26 = i44;
                                i19 = i41;
                                unsafe = unsafe2;
                                i31 = zza((zzhj<T>) t11, bArr, i49, i12, i44, i16, i39, i41, i42, i43, j11, zzeiVar);
                                if (i31 == i49) {
                                    i14 = i13;
                                    i17 = i31;
                                    i34 = i24;
                                    i36 = i25;
                                    i18 = i26;
                                } else {
                                    zzhjVar = this;
                                    t13 = t11;
                                    bArr2 = bArr;
                                    i28 = i12;
                                    i29 = i13;
                                    zzeiVar4 = zzeiVar;
                                    i34 = i24;
                                    i35 = i16;
                                    i32 = i19;
                                    i36 = i25;
                                    i33 = i26;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i25 = i36;
                                i26 = i44;
                                i19 = i41;
                                unsafe = unsafe2;
                                i27 = i49;
                                if (i43 != 50) {
                                    i31 = zza((zzhj<T>) t11, bArr, i27, i12, i26, i16, i39, i42, i43, j11, i19, zzeiVar);
                                    if (i31 != i27) {
                                        zzhjVar = this;
                                        t13 = t11;
                                        bArr2 = bArr;
                                        i28 = i12;
                                        i29 = i13;
                                        i33 = i26;
                                        i34 = i24;
                                        i35 = i16;
                                        i32 = i19;
                                        i36 = i25;
                                        unsafe2 = unsafe;
                                    }
                                } else if (i39 == 2) {
                                    i31 = zza((zzhj<T>) t11, bArr, i27, i12, i19, j11, zzeiVar);
                                    if (i31 != i27) {
                                        zzhjVar = this;
                                        t13 = t11;
                                        bArr2 = bArr;
                                        i28 = i12;
                                        i29 = i13;
                                        zzeiVar4 = zzeiVar;
                                        i34 = i24;
                                        i35 = i16;
                                        i32 = i19;
                                        i36 = i25;
                                        i33 = i26;
                                        unsafe2 = unsafe;
                                    }
                                }
                                i14 = i13;
                                i17 = i31;
                                i34 = i24;
                                i36 = i25;
                                i18 = i26;
                            }
                        } else if (i39 == 2) {
                            zzge zzgeVar = (zzge) unsafe2.getObject(t13, j11);
                            if (!zzgeVar.zzch()) {
                                int size = zzgeVar.size();
                                zzgeVar = zzgeVar.zzah(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t13, j11, zzgeVar);
                            }
                            i31 = zza(zzhjVar.zzbh(i41), i44, bArr, i49, i12, zzgeVar, zzeiVar);
                            i28 = i12;
                            i29 = i13;
                            i33 = i44;
                            i32 = i41;
                            i34 = i34;
                            i35 = i16;
                        } else {
                            i24 = i34;
                            i25 = i36;
                            i26 = i44;
                            i19 = i41;
                            unsafe = unsafe2;
                            i27 = i49;
                        }
                        i14 = i13;
                        i17 = i27;
                        i34 = i24;
                        i36 = i25;
                        i18 = i26;
                    }
                    zzeiVar4 = zzeiVar;
                }
                if (i18 != i14 || i14 == 0) {
                    i31 = zza(i18, bArr, i17, i12, t11, zzeiVar);
                    zzhjVar = this;
                    t13 = t11;
                    bArr2 = bArr;
                    i28 = i12;
                    i29 = i14;
                    i33 = i18;
                    i35 = i16;
                    i32 = i19;
                    unsafe2 = unsafe;
                    zzeiVar4 = zzeiVar;
                } else {
                    i31 = i17;
                    i33 = i18;
                }
            } else {
                unsafe = unsafe2;
                i14 = i29;
            }
        }
        if (i36 != -1) {
            t12 = t11;
            unsafe.putInt(t12, i36, i34);
        } else {
            t12 = t11;
        }
        zzip zzipVar = null;
        for (int i51 = this.zzzn; i51 < this.zzzo; i51++) {
            zzipVar = (zzip) zza((Object) t12, this.zzzm[i51], (int) zzipVar, (zzio<UT, int>) this.zzzr);
        }
        if (zzipVar != null) {
            this.zzzr.zzf(t12, zzipVar);
        }
        if (i14 == 0) {
            if (i31 != i12) {
                throw zzgf.zzfo();
            }
        } else if (i31 > i12 || i33 != i14) {
            throw zzgf.zzfo();
        }
        return i31;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0211, code lost:
        if (r0 == r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0230, code lost:
        if (r0 == r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0232, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e4, code lost:
        if (r0 == r15) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // com.google.android.gms.internal.vision.zzhw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.vision.zzei r32) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.zzei):void");
    }

    private final <UT, UB> UB zza(Object obj, int i11, UB ub2, zzio<UT, UB> zzioVar) {
        zzgd zzbj;
        int i12 = this.zzzd[i11];
        Object zzp = zziu.zzp(obj, zzbk(i11) & 1048575);
        return (zzp == null || (zzbj = zzbj(i11)) == null) ? ub2 : (UB) zza(i11, i12, this.zzzt.zzj(zzp), zzbj, (zzgd) ub2, (zzio<UT, zzgd>) zzioVar);
    }

    private final <K, V, UT, UB> UB zza(int i11, int i12, Map<K, V> map, zzgd zzgdVar, UB ub2, zzio<UT, UB> zzioVar) {
        zzgy<?, ?> zzo = this.zzzt.zzo(zzbi(i11));
        Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<K, V> next = it2.next();
            if (!zzgdVar.zzh(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = zzioVar.zzhd();
                }
                zzev zzaj = zzeo.zzaj(zzgx.zza(zzo, next.getKey(), next.getValue()));
                try {
                    zzgx.zza(zzaj.zzdp(), zzo, next.getKey(), next.getValue());
                    zzioVar.zza((zzio<UT, UB>) ub2, i12, zzaj.zzdo());
                    it2.remove();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return ub2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i11, zzhw zzhwVar) {
        return zzhwVar.zzr(zziu.zzp(obj, i11 & 1048575));
    }

    private static void zza(int i11, Object obj, zzjj zzjjVar) {
        if (obj instanceof String) {
            zzjjVar.zza(i11, (String) obj);
        } else {
            zzjjVar.zza(i11, (zzeo) obj);
        }
    }

    private final void zza(Object obj, int i11, zzhv zzhvVar) {
        if (zzbm(i11)) {
            zziu.zza(obj, i11 & 1048575, zzhvVar.zzcv());
        } else if (this.zzzj) {
            zziu.zza(obj, i11 & 1048575, zzhvVar.readString());
        } else {
            zziu.zza(obj, i11 & 1048575, zzhvVar.zzcw());
        }
    }

    private final boolean zza(T t11, int i11, int i12, int i13) {
        if (this.zzzk) {
            return zza((zzhj<T>) t11, i11);
        }
        return (i12 & i13) != 0;
    }

    private final boolean zza(T t11, int i11) {
        if (this.zzzk) {
            int zzbk = zzbk(i11);
            long j11 = zzbk & 1048575;
            switch ((zzbk & 267386880) >>> 20) {
                case 0:
                    return zziu.zzo(t11, j11) != 0.0d;
                case 1:
                    return zziu.zzn(t11, j11) != BitmapDescriptorFactory.HUE_RED;
                case 2:
                    return zziu.zzl(t11, j11) != 0;
                case 3:
                    return zziu.zzl(t11, j11) != 0;
                case 4:
                    return zziu.zzk(t11, j11) != 0;
                case 5:
                    return zziu.zzl(t11, j11) != 0;
                case 6:
                    return zziu.zzk(t11, j11) != 0;
                case 7:
                    return zziu.zzm(t11, j11);
                case 8:
                    Object zzp = zziu.zzp(t11, j11);
                    if (zzp instanceof String) {
                        return !((String) zzp).isEmpty();
                    } else if (zzp instanceof zzeo) {
                        return !zzeo.zzrx.equals(zzp);
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    return zziu.zzp(t11, j11) != null;
                case 10:
                    return !zzeo.zzrx.equals(zziu.zzp(t11, j11));
                case 11:
                    return zziu.zzk(t11, j11) != 0;
                case 12:
                    return zziu.zzk(t11, j11) != 0;
                case 13:
                    return zziu.zzk(t11, j11) != 0;
                case 14:
                    return zziu.zzl(t11, j11) != 0;
                case 15:
                    return zziu.zzk(t11, j11) != 0;
                case 16:
                    return zziu.zzl(t11, j11) != 0;
                case 17:
                    return zziu.zzp(t11, j11) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int zzbl = zzbl(i11);
        return (zziu.zzk(t11, (long) (zzbl & 1048575)) & (1 << (zzbl >>> 20))) != 0;
    }

    private final boolean zza(T t11, int i11, int i12) {
        return zziu.zzk(t11, (long) (zzbl(i12) & 1048575)) == i11;
    }
}