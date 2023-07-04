package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f4264a = (IconCompat) versionedParcel.v(remoteActionCompat.f4264a, 1);
        remoteActionCompat.f4265b = versionedParcel.l(remoteActionCompat.f4265b, 2);
        remoteActionCompat.f4266c = versionedParcel.l(remoteActionCompat.f4266c, 3);
        remoteActionCompat.f4267d = (PendingIntent) versionedParcel.r(remoteActionCompat.f4267d, 4);
        remoteActionCompat.f4268e = versionedParcel.h(remoteActionCompat.f4268e, 5);
        remoteActionCompat.f4269f = versionedParcel.h(remoteActionCompat.f4269f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f4264a, 1);
        versionedParcel.D(remoteActionCompat.f4265b, 2);
        versionedParcel.D(remoteActionCompat.f4266c, 3);
        versionedParcel.H(remoteActionCompat.f4267d, 4);
        versionedParcel.z(remoteActionCompat.f4268e, 5);
        versionedParcel.z(remoteActionCompat.f4269f, 6);
    }
}