package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.adyen.checkout.components.model.payments.request.Address;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzlf;
import com.google.android.gms.internal.measurement.zzoz;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public final class zzkt extends zzkh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkt(zzkr zzkrVar) {
        super(zzkrVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean zzA(zzau zzauVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotNull(zzpVar);
        return (TextUtils.isEmpty(zzpVar.zzb) && TextUtils.isEmpty(zzpVar.zzq)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final com.google.android.gms.internal.measurement.zzfs zzB(com.google.android.gms.internal.measurement.zzfo zzfoVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfs zzfsVar : zzfoVar.zzi()) {
            if (zzfsVar.zzg().equals(str)) {
                return zzfsVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object zzC(com.google.android.gms.internal.measurement.zzfo zzfoVar, String str) {
        com.google.android.gms.internal.measurement.zzfs zzB = zzB(zzfoVar, str);
        if (zzB != null) {
            if (zzB.zzy()) {
                return zzB.zzh();
            }
            if (zzB.zzw()) {
                return Long.valueOf(zzB.zzd());
            }
            if (zzB.zzu()) {
                return Double.valueOf(zzB.zza());
            }
            if (zzB.zzc() > 0) {
                List<com.google.android.gms.internal.measurement.zzfs> zzi = zzB.zzi();
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfs zzfsVar : zzi) {
                    if (zzfsVar != null) {
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfs zzfsVar2 : zzfsVar.zzi()) {
                            if (zzfsVar2.zzy()) {
                                bundle.putString(zzfsVar2.zzg(), zzfsVar2.zzh());
                            } else if (zzfsVar2.zzw()) {
                                bundle.putLong(zzfsVar2.zzg(), zzfsVar2.zzd());
                            } else if (zzfsVar2.zzu()) {
                                bundle.putDouble(zzfsVar2.zzg(), zzfsVar2.zza());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    private final void zzD(StringBuilder sb2, int i11, List list) {
        if (list == null) {
            return;
        }
        int i12 = i11 + 1;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) it2.next();
            if (zzfsVar != null) {
                zzF(sb2, i12);
                sb2.append("param {\n");
                zzI(sb2, i12, "name", zzfsVar.zzx() ? this.zzs.zzj().zze(zzfsVar.zzg()) : null);
                zzI(sb2, i12, "string_value", zzfsVar.zzy() ? zzfsVar.zzh() : null);
                zzI(sb2, i12, "int_value", zzfsVar.zzw() ? Long.valueOf(zzfsVar.zzd()) : null);
                zzI(sb2, i12, "double_value", zzfsVar.zzu() ? Double.valueOf(zzfsVar.zza()) : null);
                if (zzfsVar.zzc() > 0) {
                    zzD(sb2, i12, zzfsVar.zzi());
                }
                zzF(sb2, i12);
                sb2.append("}\n");
            }
        }
    }

    private final void zzE(StringBuilder sb2, int i11, com.google.android.gms.internal.measurement.zzel zzelVar) {
        String str;
        if (zzelVar == null) {
            return;
        }
        zzF(sb2, i11);
        sb2.append("filter {\n");
        if (zzelVar.zzh()) {
            zzI(sb2, i11, "complement", Boolean.valueOf(zzelVar.zzg()));
        }
        if (zzelVar.zzj()) {
            zzI(sb2, i11, "param_name", this.zzs.zzj().zze(zzelVar.zze()));
        }
        if (zzelVar.zzk()) {
            int i12 = i11 + 1;
            com.google.android.gms.internal.measurement.zzex zzd = zzelVar.zzd();
            if (zzd != null) {
                zzF(sb2, i12);
                sb2.append("string_filter {\n");
                if (zzd.zzi()) {
                    switch (zzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzI(sb2, i12, "match_type", str);
                }
                if (zzd.zzh()) {
                    zzI(sb2, i12, "expression", zzd.zzd());
                }
                if (zzd.zzg()) {
                    zzI(sb2, i12, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                }
                if (zzd.zza() > 0) {
                    zzF(sb2, i12 + 1);
                    sb2.append("expression_list {\n");
                    for (String str2 : zzd.zze()) {
                        zzF(sb2, i12 + 2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                zzF(sb2, i12);
                sb2.append("}\n");
            }
        }
        if (zzelVar.zzi()) {
            zzJ(sb2, i11 + 1, "number_filter", zzelVar.zzc());
        }
        zzF(sb2, i11);
        sb2.append("}\n");
    }

    private static final void zzF(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("  ");
        }
    }

    private static final String zzG(boolean z11, boolean z12, boolean z13) {
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            sb2.append("Dynamic ");
        }
        if (z12) {
            sb2.append("Sequence ");
        }
        if (z13) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final void zzH(StringBuilder sb2, int i11, String str, com.google.android.gms.internal.measurement.zzgd zzgdVar) {
        if (zzgdVar == null) {
            return;
        }
        zzF(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzgdVar.zzb() != 0) {
            zzF(sb2, 4);
            sb2.append("results: ");
            int i12 = 0;
            for (Long l11 : zzgdVar.zzk()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i12 = i13;
            }
            sb2.append('\n');
        }
        if (zzgdVar.zzd() != 0) {
            zzF(sb2, 4);
            sb2.append("status: ");
            int i14 = 0;
            for (Long l12 : zzgdVar.zzn()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l12);
                i14 = i15;
            }
            sb2.append('\n');
        }
        if (zzgdVar.zza() != 0) {
            zzF(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i16 = 0;
            for (com.google.android.gms.internal.measurement.zzfm zzfmVar : zzgdVar.zzj()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzfmVar.zzh() ? Integer.valueOf(zzfmVar.zza()) : null);
                sb2.append(":");
                sb2.append(zzfmVar.zzg() ? Long.valueOf(zzfmVar.zzb()) : null);
                i16 = i17;
            }
            sb2.append("}\n");
        }
        if (zzgdVar.zzc() != 0) {
            zzF(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i18 = 0;
            for (com.google.android.gms.internal.measurement.zzgf zzgfVar : zzgdVar.zzm()) {
                int i19 = i18 + 1;
                if (i18 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzgfVar.zzi() ? Integer.valueOf(zzgfVar.zzb()) : null);
                sb2.append(": [");
                int i21 = 0;
                for (Long l13 : zzgfVar.zzf()) {
                    long longValue = l13.longValue();
                    int i22 = i21 + 1;
                    if (i21 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i21 = i22;
                }
                sb2.append("]");
                i18 = i19;
            }
            sb2.append("}\n");
        }
        zzF(sb2, 3);
        sb2.append("}\n");
    }

    private static final void zzI(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzF(sb2, i11 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private static final void zzJ(StringBuilder sb2, int i11, String str, com.google.android.gms.internal.measurement.zzeq zzeqVar) {
        if (zzeqVar == null) {
            return;
        }
        zzF(sb2, i11);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzeqVar.zzg()) {
            int zzm = zzeqVar.zzm();
            zzI(sb2, i11, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzeqVar.zzi()) {
            zzI(sb2, i11, "match_as_float", Boolean.valueOf(zzeqVar.zzf()));
        }
        if (zzeqVar.zzh()) {
            zzI(sb2, i11, "comparison_value", zzeqVar.zzc());
        }
        if (zzeqVar.zzk()) {
            zzI(sb2, i11, "min_comparison_value", zzeqVar.zze());
        }
        if (zzeqVar.zzj()) {
            zzI(sb2, i11, "max_comparison_value", zzeqVar.zzd());
        }
        zzF(sb2, i11);
        sb2.append("}\n");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(com.google.android.gms.internal.measurement.zzfx zzfxVar, String str) {
        for (int i11 = 0; i11 < zzfxVar.zzb(); i11++) {
            if (str.equals(zzfxVar.zzaj(i11).zzf())) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlf zzl(zzlf zzlfVar, byte[] bArr) {
        com.google.android.gms.internal.measurement.zzjl zzb = com.google.android.gms.internal.measurement.zzjl.zzb();
        if (zzb != null) {
            return zzlfVar.zzau(bArr, zzb);
        }
        return zzlfVar.zzat(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List zzr(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            long j11 = 0;
            for (int i12 = 0; i12 < 64; i12++) {
                int i13 = (i11 * 64) + i12;
                if (i13 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i13)) {
                    j11 |= 1 << i12;
                }
            }
            arrayList.add(Long.valueOf(j11));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzv(List list, int i11) {
        if (i11 < list.size() * 64) {
            return ((1 << (i11 % 64)) & ((Long) list.get(i11 / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzx(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzz(com.google.android.gms.internal.measurement.zzfn zzfnVar, String str, Object obj) {
        List zzp = zzfnVar.zzp();
        int i11 = 0;
        while (true) {
            if (i11 >= zzp.size()) {
                i11 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzfs) zzp.get(i11)).zzg())) {
                break;
            } else {
                i11++;
            }
        }
        com.google.android.gms.internal.measurement.zzfr zze = com.google.android.gms.internal.measurement.zzfs.zze();
        zze.zzj(str);
        if (obj instanceof Long) {
            zze.zzi(((Long) obj).longValue());
        }
        if (i11 >= 0) {
            zzfnVar.zzj(i11, zze);
        } else {
            zzfnVar.zze(zze);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    protected final boolean zzb() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzd(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzs.zzv().zzg();
        MessageDigest zzE = zzky.zzE();
        if (zzE == null) {
            this.zzs.zzay().zzd().zza("Failed to get MD5");
            return 0L;
        }
        return zzky.zzp(zzE.digest(bArr));
    }

    final Bundle zzf(Map map, boolean z11) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z11) {
                zzoz.zzc();
                if (this.zzs.zzf().zzs(null, zzdw.zzam)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        arrayList2.add(zzf((Map) arrayList.get(i11), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        arrayList4.add(zzf((Map) arrayList3.get(i12), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList4);
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Parcelable zzh(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.zzs.zzay().zzd().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzau zzi(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle zzf = zzf(zzaaVar.zze(), true);
        String obj2 = (!zzf.containsKey("_o") || (obj = zzf.get("_o")) == null) ? Stripe3ds2AuthParams.FIELD_APP : obj.toString();
        String zzb = zzgq.zzb(zzaaVar.zzd());
        if (zzb == null) {
            zzb = zzaaVar.zzd();
        }
        return new zzau(zzb, new zzas(zzf), obj2, zzaaVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.zzfo zzj(zzap zzapVar) {
        com.google.android.gms.internal.measurement.zzfn zze = com.google.android.gms.internal.measurement.zzfo.zze();
        zze.zzl(zzapVar.zze);
        zzar zzarVar = new zzar(zzapVar.zzf);
        while (zzarVar.hasNext()) {
            String next = zzarVar.next();
            com.google.android.gms.internal.measurement.zzfr zze2 = com.google.android.gms.internal.measurement.zzfs.zze();
            zze2.zzj(next);
            Object zzf = zzapVar.zzf.zzf(next);
            Preconditions.checkNotNull(zzf);
            zzt(zze2, zzf);
            zze.zze(zze2);
        }
        return (com.google.android.gms.internal.measurement.zzfo) zze.zzay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzm(com.google.android.gms.internal.measurement.zzfw zzfwVar) {
        if (zzfwVar == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.zzfy zzfyVar : zzfwVar.zzd()) {
            if (zzfyVar != null) {
                zzF(sb2, 1);
                sb2.append("bundle {\n");
                if (zzfyVar.zzbf()) {
                    zzI(sb2, 1, "protocol_version", Integer.valueOf(zzfyVar.zzd()));
                }
                zzI(sb2, 1, "platform", zzfyVar.zzJ());
                if (zzfyVar.zzbb()) {
                    zzI(sb2, 1, "gmp_version", Long.valueOf(zzfyVar.zzn()));
                }
                if (zzfyVar.zzbl()) {
                    zzI(sb2, 1, "uploading_gmp_version", Long.valueOf(zzfyVar.zzs()));
                }
                if (zzfyVar.zzaZ()) {
                    zzI(sb2, 1, "dynamite_version", Long.valueOf(zzfyVar.zzk()));
                }
                if (zzfyVar.zzaW()) {
                    zzI(sb2, 1, "config_version", Long.valueOf(zzfyVar.zzi()));
                }
                zzI(sb2, 1, "gmp_app_id", zzfyVar.zzG());
                zzI(sb2, 1, "admob_app_id", zzfyVar.zzx());
                zzI(sb2, 1, PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, zzfyVar.zzy());
                zzI(sb2, 1, AnalyticsFields.APP_VERSION, zzfyVar.zzB());
                if (zzfyVar.zzaU()) {
                    zzI(sb2, 1, "app_version_major", Integer.valueOf(zzfyVar.zza()));
                }
                zzI(sb2, 1, "firebase_instance_id", zzfyVar.zzF());
                if (zzfyVar.zzaY()) {
                    zzI(sb2, 1, "dev_cert_hash", Long.valueOf(zzfyVar.zzj()));
                }
                zzI(sb2, 1, "app_store", zzfyVar.zzA());
                if (zzfyVar.zzbk()) {
                    zzI(sb2, 1, "upload_timestamp_millis", Long.valueOf(zzfyVar.zzr()));
                }
                if (zzfyVar.zzbi()) {
                    zzI(sb2, 1, "start_timestamp_millis", Long.valueOf(zzfyVar.zzq()));
                }
                if (zzfyVar.zzba()) {
                    zzI(sb2, 1, "end_timestamp_millis", Long.valueOf(zzfyVar.zzm()));
                }
                if (zzfyVar.zzbe()) {
                    zzI(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzfyVar.zzp()));
                }
                if (zzfyVar.zzbd()) {
                    zzI(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzfyVar.zzo()));
                }
                zzI(sb2, 1, "app_instance_id", zzfyVar.zzz());
                zzI(sb2, 1, "resettable_device_id", zzfyVar.zzK());
                zzI(sb2, 1, "ds_id", zzfyVar.zzE());
                if (zzfyVar.zzbc()) {
                    zzI(sb2, 1, "limited_ad_tracking", Boolean.valueOf(zzfyVar.zzaR()));
                }
                zzI(sb2, 1, AnalyticsFields.OS_VERSION, zzfyVar.zzI());
                zzI(sb2, 1, "device_model", zzfyVar.zzD());
                zzI(sb2, 1, "user_default_language", zzfyVar.zzL());
                if (zzfyVar.zzbj()) {
                    zzI(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(zzfyVar.zzf()));
                }
                if (zzfyVar.zzaV()) {
                    zzI(sb2, 1, "bundle_sequential_index", Integer.valueOf(zzfyVar.zzb()));
                }
                if (zzfyVar.zzbh()) {
                    zzI(sb2, 1, "service_upload", Boolean.valueOf(zzfyVar.zzaS()));
                }
                zzI(sb2, 1, "health_monitor", zzfyVar.zzH());
                if (!this.zzs.zzf().zzs(null, zzdw.zzah) && zzfyVar.zzaT() && zzfyVar.zzh() != 0) {
                    zzI(sb2, 1, "android_id", Long.valueOf(zzfyVar.zzh()));
                }
                if (zzfyVar.zzbg()) {
                    zzI(sb2, 1, "retry_counter", Integer.valueOf(zzfyVar.zze()));
                }
                if (zzfyVar.zzaX()) {
                    zzI(sb2, 1, "consent_signals", zzfyVar.zzC());
                }
                List<com.google.android.gms.internal.measurement.zzgh> zzO = zzfyVar.zzO();
                if (zzO != null) {
                    for (com.google.android.gms.internal.measurement.zzgh zzghVar : zzO) {
                        if (zzghVar != null) {
                            zzF(sb2, 2);
                            sb2.append("user_property {\n");
                            zzI(sb2, 2, "set_timestamp_millis", zzghVar.zzs() ? Long.valueOf(zzghVar.zzc()) : null);
                            zzI(sb2, 2, "name", this.zzs.zzj().zzf(zzghVar.zzf()));
                            zzI(sb2, 2, "string_value", zzghVar.zzg());
                            zzI(sb2, 2, "int_value", zzghVar.zzr() ? Long.valueOf(zzghVar.zzb()) : null);
                            zzI(sb2, 2, "double_value", zzghVar.zzq() ? Double.valueOf(zzghVar.zza()) : null);
                            zzF(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfk> zzM = zzfyVar.zzM();
                if (zzM != null) {
                    for (com.google.android.gms.internal.measurement.zzfk zzfkVar : zzM) {
                        if (zzfkVar != null) {
                            zzF(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (zzfkVar.zzk()) {
                                zzI(sb2, 2, "audience_id", Integer.valueOf(zzfkVar.zza()));
                            }
                            if (zzfkVar.zzm()) {
                                zzI(sb2, 2, "new_audience", Boolean.valueOf(zzfkVar.zzj()));
                            }
                            zzH(sb2, 2, "current_data", zzfkVar.zzd());
                            if (zzfkVar.zzn()) {
                                zzH(sb2, 2, "previous_data", zzfkVar.zze());
                            }
                            zzF(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfo> zzN = zzfyVar.zzN();
                if (zzN != null) {
                    for (com.google.android.gms.internal.measurement.zzfo zzfoVar : zzN) {
                        if (zzfoVar != null) {
                            zzF(sb2, 2);
                            sb2.append("event {\n");
                            zzI(sb2, 2, "name", this.zzs.zzj().zzd(zzfoVar.zzh()));
                            if (zzfoVar.zzu()) {
                                zzI(sb2, 2, "timestamp_millis", Long.valueOf(zzfoVar.zzd()));
                            }
                            if (zzfoVar.zzt()) {
                                zzI(sb2, 2, "previous_timestamp_millis", Long.valueOf(zzfoVar.zzc()));
                            }
                            if (zzfoVar.zzs()) {
                                zzI(sb2, 2, "count", Integer.valueOf(zzfoVar.zza()));
                            }
                            if (zzfoVar.zzb() != 0) {
                                zzD(sb2, 2, zzfoVar.zzi());
                            }
                            zzF(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                zzF(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzo(com.google.android.gms.internal.measurement.zzej zzejVar) {
        if (zzejVar == null) {
            return Address.ADDRESS_NULL_PLACEHOLDER;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (zzejVar.zzp()) {
            zzI(sb2, 0, "filter_id", Integer.valueOf(zzejVar.zzb()));
        }
        zzI(sb2, 0, "event_name", this.zzs.zzj().zzd(zzejVar.zzg()));
        String zzG = zzG(zzejVar.zzk(), zzejVar.zzm(), zzejVar.zzn());
        if (!zzG.isEmpty()) {
            zzI(sb2, 0, "filter_type", zzG);
        }
        if (zzejVar.zzo()) {
            zzJ(sb2, 1, "event_count_filter", zzejVar.zzf());
        }
        if (zzejVar.zza() > 0) {
            sb2.append("  filters {\n");
            for (com.google.android.gms.internal.measurement.zzel zzelVar : zzejVar.zzh()) {
                zzE(sb2, 2, zzelVar);
            }
        }
        zzF(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzp(com.google.android.gms.internal.measurement.zzes zzesVar) {
        if (zzesVar == null) {
            return Address.ADDRESS_NULL_PLACEHOLDER;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (zzesVar.zzj()) {
            zzI(sb2, 0, "filter_id", Integer.valueOf(zzesVar.zza()));
        }
        zzI(sb2, 0, "property_name", this.zzs.zzj().zzf(zzesVar.zze()));
        String zzG = zzG(zzesVar.zzg(), zzesVar.zzh(), zzesVar.zzi());
        if (!zzG.isEmpty()) {
            zzI(sb2, 0, "filter_type", zzG);
        }
        zzE(sb2, 1, zzesVar.zzb());
        sb2.append("}\n");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List zzq(List list, List list2) {
        int i11;
        ArrayList arrayList = new ArrayList(list);
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            if (num.intValue() < 0) {
                this.zzs.zzay().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzs.zzay().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i12 = size2;
            i11 = size;
            size = i12;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        if ((r3 instanceof android.os.Parcelable[]) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r5 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r7 >= r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
        r4.add(zzs((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        r3 = (java.util.ArrayList) r3;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
        if (r7 >= r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
        r4.add(zzs((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
        r4.add(zzs((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
        r0.put(r2, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map zzs(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            com.google.android.gms.internal.measurement.zzoz.zzc()
            com.google.android.gms.measurement.internal.zzft r4 = r10.zzs
            com.google.android.gms.measurement.internal.zzaf r4 = r4.zzf()
            r5 = 0
            com.google.android.gms.measurement.internal.zzdv r6 = com.google.android.gms.measurement.internal.zzdw.zzam
            boolean r4 = r4.zzs(r5, r6)
            if (r4 == 0) goto L3c
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L3c:
            boolean r4 = r3 instanceof android.os.Bundle[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L49:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L4f:
            if (r12 == 0) goto Ld
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r3 instanceof android.os.Parcelable[]
            r6 = 0
            if (r5 == 0) goto L73
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r5 = r3.length
            r7 = r6
        L5f:
            if (r7 >= r5) goto La1
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzs(r8, r6)
            r4.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5f
        L73:
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 == 0) goto L94
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r5 = r3.size()
            r7 = r6
        L7e:
            if (r7 >= r5) goto La1
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L91
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzs(r8, r6)
            r4.add(r8)
        L91:
            int r7 = r7 + 1
            goto L7e
        L94:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto La1
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.zzs(r3, r6)
            r4.add(r3)
        La1:
            r0.put(r2, r4)
            goto Ld
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkt.zzs(android.os.Bundle, boolean):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzt(com.google.android.gms.internal.measurement.zzfr zzfrVar, Object obj) {
        Bundle[] bundleArr;
        Preconditions.checkNotNull(obj);
        zzfrVar.zzg();
        zzfrVar.zze();
        zzfrVar.zzd();
        zzfrVar.zzf();
        if (obj instanceof String) {
            zzfrVar.zzk((String) obj);
        } else if (obj instanceof Long) {
            zzfrVar.zzi(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzfrVar.zzh(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    com.google.android.gms.internal.measurement.zzfr zze = com.google.android.gms.internal.measurement.zzfs.zze();
                    for (String str : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.zzfr zze2 = com.google.android.gms.internal.measurement.zzfs.zze();
                        zze2.zzj(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            zze2.zzi(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zze2.zzk((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zze2.zzh(((Double) obj2).doubleValue());
                        }
                        zze.zzc(zze2);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.zzfs) zze.zzay());
                    }
                }
            }
            zzfrVar.zzb(arrayList);
        } else {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) event param value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzu(com.google.android.gms.internal.measurement.zzgg zzggVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzggVar.zzc();
        zzggVar.zzb();
        zzggVar.zza();
        if (obj instanceof String) {
            zzggVar.zzh((String) obj);
        } else if (obj instanceof Long) {
            zzggVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzggVar.zzd(((Double) obj).doubleValue());
        } else {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzw(long j11, long j12) {
        return j11 == 0 || j12 <= 0 || Math.abs(this.zzs.zzav().currentTimeMillis() - j11) > j12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] zzy(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e11) {
            this.zzs.zzay().zzd().zzb("Failed to gzip content", e11);
            throw e11;
        }
    }
}