package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public enum zzdy implements zzgb {
    CONTACT_INFO(1),
    EMAIL(2),
    ISBN(3),
    PHONE(4),
    PRODUCT(5),
    SMS(6),
    TEXT(7),
    URL(8),
    WIFI(9),
    GEO(10),
    CALENDAR_EVENT(11),
    DRIVER_LICENSE(12);
    
    private static final zzgc<zzdy> zzdv = new zzgc<zzdy>() { // from class: com.google.android.gms.internal.vision.zzdz
        @Override // com.google.android.gms.internal.vision.zzgc
        public final /* synthetic */ zzdy zzf(int i11) {
            return zzdy.zzw(i11);
        }
    };
    private final int value;

    zzdy(int i11) {
        this.value = i11;
    }

    public static zzgd zzah() {
        return zzea.zzhl;
    }

    public static zzdy zzw(int i11) {
        switch (i11) {
            case 1:
                return CONTACT_INFO;
            case 2:
                return EMAIL;
            case 3:
                return ISBN;
            case 4:
                return PHONE;
            case 5:
                return PRODUCT;
            case 6:
                return SMS;
            case 7:
                return TEXT;
            case 8:
                return URL;
            case 9:
                return WIFI;
            case 10:
                return GEO;
            case 11:
                return CALENDAR_EVENT;
            case 12:
                return DRIVER_LICENSE;
            default:
                return null;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzgb
    public final int zzr() {
        return this.value;
    }
}