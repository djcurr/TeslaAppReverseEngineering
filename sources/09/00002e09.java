package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzx;

/* loaded from: classes3.dex */
public final class Marker {
    private final zzx zza;

    public Marker(zzx zzxVar) {
        this.zza = (zzx) Preconditions.checkNotNull(zzxVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Marker) {
            try {
                return this.zza.zzC(((Marker) obj).zza);
            } catch (RemoteException e11) {
                throw new RuntimeRemoteException(e11);
            }
        }
        return false;
    }

    public float getAlpha() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public String getId() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public LatLng getPosition() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public float getRotation() {
        try {
            return this.zza.zze();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public String getSnippet() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.zza.zzh());
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public String getTitle() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public float getZIndex() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public int hashCode() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public void hideInfoWindow() {
        try {
            this.zza.zzm();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public boolean isDraggable() {
        try {
            return this.zza.zzD();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public boolean isFlat() {
        try {
            return this.zza.zzE();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public boolean isInfoWindowShown() {
        try {
            return this.zza.zzF();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzG();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public void remove() {
        try {
            this.zza.zzn();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public void setAlpha(float f11) {
        try {
            this.zza.zzo(f11);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public void setAnchor(float f11, float f12) {
        try {
            this.zza.zzp(f11, f12);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public void setDraggable(boolean z11) {
        try {
            this.zza.zzq(z11);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public void setFlat(boolean z11) {
        try {
            this.zza.zzr(z11);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        try {
            if (bitmapDescriptor == null) {
                this.zza.zzs(null);
                return;
            }
            this.zza.zzs(bitmapDescriptor.zza());
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public void setInfoWindowAnchor(float f11, float f12) {
        try {
            this.zza.zzt(f11, f12);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public void setPosition(LatLng latLng) {
        if (latLng != null) {
            try {
                this.zza.zzu(latLng);
                return;
            } catch (RemoteException e11) {
                throw new RuntimeRemoteException(e11);
            }
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public void setRotation(float f11) {
        try {
            this.zza.zzv(f11);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public void setSnippet(String str) {
        try {
            this.zza.zzw(str);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public void setTag(Object obj) {
        try {
            this.zza.zzx(ObjectWrapper.wrap(obj));
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public void setTitle(String str) {
        try {
            this.zza.zzy(str);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public void setVisible(boolean z11) {
        try {
            this.zza.zzz(z11);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public void setZIndex(float f11) {
        try {
            this.zza.zzA(f11);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public void showInfoWindow() {
        try {
            this.zza.zzB();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }
}