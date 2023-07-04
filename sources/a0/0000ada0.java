package q7;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class c {
    public static boolean a(Parcel parcel) {
        return parcel.readInt() == 1;
    }

    public static void b(Parcel parcel, boolean z11) {
        parcel.writeInt(z11 ? 1 : 0);
    }
}