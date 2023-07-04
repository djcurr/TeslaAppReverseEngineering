package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f941a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaDescriptionCompat f942b;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaBrowserCompat$MediaItem[] newArray(int i11) {
            return new MediaBrowserCompat$MediaItem[i11];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f941a = parcel.readInt();
        this.f942b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{mFlags=" + this.f941a + ", mDescription=" + this.f942b + CoreConstants.CURLY_RIGHT;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f941a);
        this.f942b.writeToParcel(parcel, i11);
    }
}