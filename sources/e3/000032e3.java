package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
final class zzdq {
    private String description;
    private Integer distanceMeters;
    private zzb[] matchedSubstrings;
    private String placeId;
    private zza structuredFormatting;
    private String[] types;

    /* loaded from: classes3.dex */
    class zza {
        private String mainText;
        private zzb[] mainTextMatchedSubstrings;
        private String secondaryText;
        private zzb[] secondaryTextMatchedSubstrings;

        zza() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final zziy zza() {
            zzb[] zzbVarArr = this.mainTextMatchedSubstrings;
            if (zzbVarArr != null) {
                return zziy.zzl(zzbVarArr);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final zziy zzb() {
            zzb[] zzbVarArr = this.secondaryTextMatchedSubstrings;
            if (zzbVarArr != null) {
                return zziy.zzl(zzbVarArr);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String zzc() {
            return this.mainText;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String zzd() {
            return this.secondaryText;
        }
    }

    /* loaded from: classes3.dex */
    class zzb {
        Integer length;
        Integer offset;

        zzb() {
        }
    }

    zzdq() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zza zza() {
        return this.structuredFormatting;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zziy zzb() {
        zzb[] zzbVarArr = this.matchedSubstrings;
        if (zzbVarArr != null) {
            return zziy.zzl(zzbVarArr);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zziy zzc() {
        String[] strArr = this.types;
        if (strArr != null) {
            return zziy.zzl(strArr);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Integer zzd() {
        return this.distanceMeters;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zze() {
        return this.description;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzf() {
        return this.placeId;
    }
}