package com.google.android.gms.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.IMessengerCompat;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public class MessengerCompat implements ReflectedParcelable {
    public static final Parcelable.Creator<MessengerCompat> CREATOR = new zzq();
    private Messenger zzad;
    private zzl zzcd;

    public MessengerCompat(IBinder iBinder) {
        zzl zzmVar;
        if (Build.VERSION.SDK_INT >= 21) {
            this.zzad = new Messenger(iBinder);
            return;
        }
        if (iBinder == null) {
            zzmVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IMessengerCompat.DESCRIPTOR);
            if (queryLocalInterface instanceof zzl) {
                zzmVar = (zzl) queryLocalInterface;
            } else {
                zzmVar = new zzm(iBinder);
            }
        }
        this.zzcd = zzmVar;
    }

    private final IBinder getBinder() {
        Messenger messenger = this.zzad;
        return messenger != null ? messenger.getBinder() : this.zzcd.asBinder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return getBinder().equals(((MessengerCompat) obj).getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return getBinder().hashCode();
    }

    public final void send(Message message) {
        Messenger messenger = this.zzad;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.zzcd.send(message);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        Messenger messenger = this.zzad;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.zzcd.asBinder());
        }
    }
}