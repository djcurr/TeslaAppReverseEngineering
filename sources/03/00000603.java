package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4423a = versionedParcel.p(iconCompat.f4423a, 1);
        iconCompat.f4425c = versionedParcel.j(iconCompat.f4425c, 2);
        iconCompat.f4426d = versionedParcel.r(iconCompat.f4426d, 3);
        iconCompat.f4427e = versionedParcel.p(iconCompat.f4427e, 4);
        iconCompat.f4428f = versionedParcel.p(iconCompat.f4428f, 5);
        iconCompat.f4429g = (ColorStateList) versionedParcel.r(iconCompat.f4429g, 6);
        iconCompat.f4431i = versionedParcel.t(iconCompat.f4431i, 7);
        iconCompat.f4432j = versionedParcel.t(iconCompat.f4432j, 8);
        iconCompat.n();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.o(versionedParcel.f());
        int i11 = iconCompat.f4423a;
        if (-1 != i11) {
            versionedParcel.F(i11, 1);
        }
        byte[] bArr = iconCompat.f4425c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f4426d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i12 = iconCompat.f4427e;
        if (i12 != 0) {
            versionedParcel.F(i12, 4);
        }
        int i13 = iconCompat.f4428f;
        if (i13 != 0) {
            versionedParcel.F(i13, 5);
        }
        ColorStateList colorStateList = iconCompat.f4429g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f4431i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
        String str2 = iconCompat.f4432j;
        if (str2 != null) {
            versionedParcel.J(str2, 8);
        }
    }
}