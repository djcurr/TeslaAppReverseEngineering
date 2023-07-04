package com.google.android.libraries.places.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfa {
    private zza[] addressComponents;
    private String businessStatus;
    private String formattedAddress;
    private zzb geometry;
    private String icon;
    private String iconBackgroundColor;
    private String iconMaskBaseUri;
    private String internationalPhoneNumber;
    private String name;
    private zzc openingHours;
    private zzd[] photos;
    private String placeId;
    private zze plusCode;
    private Integer priceLevel;
    private Double rating;
    private String[] types;
    private Integer userRatingsTotal;
    private Integer utcOffset;
    private String website;

    /* loaded from: classes3.dex */
    class zza {
        private String longName;
        private String shortName;
        private String[] types;

        zza() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final zziy zza() {
            String[] strArr = this.types;
            if (strArr != null) {
                return zziy.zzl(strArr);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String zzb() {
            return this.longName;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String zzc() {
            return this.shortName;
        }
    }

    /* loaded from: classes3.dex */
    class zzb {
        private zza location;
        private C0267zzb viewport;

        /* loaded from: classes3.dex */
        class zza {
            private Double lat;
            private Double lng;

            zza() {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public final Double zza() {
                return this.lat;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public final Double zzb() {
                return this.lng;
            }
        }

        /* renamed from: com.google.android.libraries.places.internal.zzfa$zzb$zzb  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0267zzb {
            private zza northeast;
            private zza southwest;

            C0267zzb() {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public final zza zza() {
                return this.northeast;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public final zza zzb() {
                return this.southwest;
            }
        }

        zzb() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final zza zza() {
            return this.location;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final C0267zzb zzb() {
            return this.viewport;
        }
    }

    /* loaded from: classes3.dex */
    class zzc {
        private zza[] periods;
        private String[] weekdayText;

        /* loaded from: classes3.dex */
        class zza {
            private zzb close;
            private zzb open;

            zza() {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public final zzb zza() {
                return this.close;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public final zzb zzb() {
                return this.open;
            }
        }

        /* loaded from: classes3.dex */
        class zzb {
            private Integer day;
            private String time;

            zzb() {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public final Integer zza() {
                return this.day;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public final String zzb() {
                return this.time;
            }
        }

        zzc() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final zziy zza() {
            zza[] zzaVarArr = this.periods;
            if (zzaVarArr != null) {
                return zziy.zzl(zzaVarArr);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final zziy zzb() {
            String[] strArr = this.weekdayText;
            if (strArr != null) {
                return zziy.zzl(strArr);
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    class zzd {
        private Integer height;
        private String[] htmlAttributions;
        private String photoReference;
        private Integer width;

        zzd() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final zziy zza() {
            String[] strArr = this.htmlAttributions;
            if (strArr != null) {
                return zziy.zzl(strArr);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final Integer zzb() {
            return this.height;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final Integer zzc() {
            return this.width;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String zzd() {
            return this.photoReference;
        }
    }

    /* loaded from: classes3.dex */
    class zze {
        private String compoundCode;
        private String globalCode;

        zze() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String zza() {
            return this.compoundCode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String zzb() {
            return this.globalCode;
        }
    }

    zzfa() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzb zza() {
        return this.geometry;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzc zzb() {
        return this.openingHours;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zze zzc() {
        return this.plusCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zziy zzd() {
        zza[] zzaVarArr = this.addressComponents;
        if (zzaVarArr != null) {
            return zziy.zzl(zzaVarArr);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zziy zze() {
        zzd[] zzdVarArr = this.photos;
        if (zzdVarArr != null) {
            return zziy.zzl(zzdVarArr);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zziy zzf() {
        String[] strArr = this.types;
        if (strArr != null) {
            return zziy.zzl(strArr);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Double zzg() {
        return this.rating;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Integer zzh() {
        return this.priceLevel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Integer zzi() {
        return this.userRatingsTotal;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Integer zzj() {
        return this.utcOffset;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzk() {
        return this.businessStatus;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzl() {
        return this.formattedAddress;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzm() {
        return this.iconBackgroundColor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzn() {
        return this.iconMaskBaseUri;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzo() {
        return this.internationalPhoneNumber;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzp() {
        return this.name;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzq() {
        return this.placeId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzr() {
        return this.website;
    }
}