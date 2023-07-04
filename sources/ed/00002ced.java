package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private String zza = null;
        @TransitionTypes
        private int zzb = 0;
        private long zzc = Long.MIN_VALUE;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        public Geofence build() {
            if (this.zza != null) {
                int i11 = this.zzb;
                if (i11 != 0) {
                    if ((i11 & 4) != 0 && this.zzi < 0) {
                        throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
                    }
                    if (this.zzc != Long.MIN_VALUE) {
                        if (this.zzd != -1) {
                            if (this.zzh >= 0) {
                                return new com.google.android.gms.internal.location.zzbj(this.zza, this.zzb, (short) 1, this.zze, this.zzf, this.zzg, this.zzc, this.zzh, this.zzi);
                            }
                            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                        }
                        throw new IllegalArgumentException("Geofence region not set.");
                    }
                    throw new IllegalArgumentException("Expiration not set.");
                }
                throw new IllegalArgumentException("Transitions types not set.");
            }
            throw new IllegalArgumentException("Request ID not set.");
        }

        public Builder setCircularRegion(double d11, double d12, float f11) {
            boolean z11 = d11 >= -90.0d && d11 <= 90.0d;
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("Invalid latitude: ");
            sb2.append(d11);
            Preconditions.checkArgument(z11, sb2.toString());
            boolean z12 = d12 >= -180.0d && d12 <= 180.0d;
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("Invalid longitude: ");
            sb3.append(d12);
            Preconditions.checkArgument(z12, sb3.toString());
            boolean z13 = f11 > BitmapDescriptorFactory.HUE_RED;
            StringBuilder sb4 = new StringBuilder(31);
            sb4.append("Invalid radius: ");
            sb4.append(f11);
            Preconditions.checkArgument(z13, sb4.toString());
            this.zzd = (short) 1;
            this.zze = d11;
            this.zzf = d12;
            this.zzg = f11;
            return this;
        }

        public Builder setExpirationDuration(long j11) {
            if (j11 < 0) {
                this.zzc = -1L;
            } else {
                this.zzc = DefaultClock.getInstance().elapsedRealtime() + j11;
            }
            return this;
        }

        public Builder setLoiteringDelay(int i11) {
            this.zzi = i11;
            return this;
        }

        public Builder setNotificationResponsiveness(int i11) {
            this.zzh = i11;
            return this;
        }

        public Builder setRequestId(String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        public Builder setTransitionTypes(@TransitionTypes int i11) {
            this.zzb = i11;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public @interface GeofenceTransition {
    }

    /* loaded from: classes3.dex */
    public @interface TransitionTypes {
    }

    long getExpirationTime();

    double getLatitude();

    int getLoiteringDelay();

    double getLongitude();

    int getNotificationResponsiveness();

    float getRadius();

    String getRequestId();

    @TransitionTypes
    int getTransitionTypes();
}