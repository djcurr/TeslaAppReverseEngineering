package com.google.android.gms.internal.vision;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface zzhv {
    int getTag();

    double readDouble();

    float readFloat();

    String readString();

    void readStringList(List<String> list);

    <T> T zza(zzhw<T> zzhwVar, zzfk zzfkVar);

    <T> T zza(Class<T> cls, zzfk zzfkVar);

    void zza(List<Double> list);

    <T> void zza(List<T> list, zzhw<T> zzhwVar, zzfk zzfkVar);

    <K, V> void zza(Map<K, V> map, zzgy<K, V> zzgyVar, zzfk zzfkVar);

    @Deprecated
    <T> T zzb(Class<T> cls, zzfk zzfkVar);

    void zzb(List<Float> list);

    @Deprecated
    <T> void zzb(List<T> list, zzhw<T> zzhwVar, zzfk zzfkVar);

    @Deprecated
    <T> T zzc(zzhw<T> zzhwVar, zzfk zzfkVar);

    void zzc(List<Long> list);

    int zzcn();

    boolean zzco();

    long zzcp();

    long zzcq();

    int zzcr();

    long zzcs();

    int zzct();

    boolean zzcu();

    String zzcv();

    zzeo zzcw();

    int zzcx();

    int zzcy();

    int zzcz();

    void zzd(List<Long> list);

    long zzda();

    int zzdb();

    long zzdc();

    void zze(List<Integer> list);

    void zzf(List<Long> list);

    void zzg(List<Integer> list);

    void zzh(List<Boolean> list);

    void zzi(List<String> list);

    void zzj(List<zzeo> list);

    void zzk(List<Integer> list);

    void zzl(List<Integer> list);

    void zzm(List<Integer> list);

    void zzn(List<Long> list);

    void zzo(List<Integer> list);

    void zzp(List<Long> list);
}