package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int f982a;

    /* renamed from: b  reason: collision with root package name */
    final long f983b;

    /* renamed from: c  reason: collision with root package name */
    final long f984c;

    /* renamed from: d  reason: collision with root package name */
    final float f985d;

    /* renamed from: e  reason: collision with root package name */
    final long f986e;

    /* renamed from: f  reason: collision with root package name */
    final int f987f;

    /* renamed from: g  reason: collision with root package name */
    final CharSequence f988g;

    /* renamed from: h  reason: collision with root package name */
    final long f989h;

    /* renamed from: i  reason: collision with root package name */
    List<CustomAction> f990i;

    /* renamed from: j  reason: collision with root package name */
    final long f991j;

    /* renamed from: k  reason: collision with root package name */
    final Bundle f992k;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i11) {
            return new PlaybackStateCompat[i11];
        }
    }

    PlaybackStateCompat(int i11, long j11, long j12, float f11, long j13, int i12, CharSequence charSequence, long j14, List<CustomAction> list, long j15, Bundle bundle) {
        this.f982a = i11;
        this.f983b = j11;
        this.f984c = j12;
        this.f985d = f11;
        this.f986e = j13;
        this.f987f = i12;
        this.f988g = charSequence;
        this.f989h = j14;
        this.f990i = new ArrayList(list);
        this.f991j = j15;
        this.f992k = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                arrayList2.add(CustomAction.a(customAction));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = playbackState.getExtras();
            MediaSessionCompat.a(bundle);
        }
        return new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f982a + ", position=" + this.f983b + ", buffered position=" + this.f984c + ", speed=" + this.f985d + ", updated=" + this.f989h + ", actions=" + this.f986e + ", error code=" + this.f987f + ", error message=" + this.f988g + ", custom actions=" + this.f990i + ", active item id=" + this.f991j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f982a);
        parcel.writeLong(this.f983b);
        parcel.writeFloat(this.f985d);
        parcel.writeLong(this.f989h);
        parcel.writeLong(this.f984c);
        parcel.writeLong(this.f986e);
        TextUtils.writeToParcel(this.f988g, parcel, i11);
        parcel.writeTypedList(this.f990i);
        parcel.writeLong(this.f991j);
        parcel.writeBundle(this.f992k);
        parcel.writeInt(this.f987f);
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f993a;

        /* renamed from: b  reason: collision with root package name */
        private final CharSequence f994b;

        /* renamed from: c  reason: collision with root package name */
        private final int f995c;

        /* renamed from: d  reason: collision with root package name */
        private final Bundle f996d;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public CustomAction[] newArray(int i11) {
                return new CustomAction[i11];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i11, Bundle bundle) {
            this.f993a = str;
            this.f994b = charSequence;
            this.f995c = i11;
            this.f996d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle extras = customAction.getExtras();
            MediaSessionCompat.a(extras);
            return new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), extras);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f994b) + ", mIcon=" + this.f995c + ", mExtras=" + this.f996d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.f993a);
            TextUtils.writeToParcel(this.f994b, parcel, i11);
            parcel.writeInt(this.f995c);
            parcel.writeBundle(this.f996d);
        }

        CustomAction(Parcel parcel) {
            this.f993a = parcel.readString();
            this.f994b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f995c = parcel.readInt();
            this.f996d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f982a = parcel.readInt();
        this.f983b = parcel.readLong();
        this.f985d = parcel.readFloat();
        this.f989h = parcel.readLong();
        this.f984c = parcel.readLong();
        this.f986e = parcel.readLong();
        this.f988g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f990i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f991j = parcel.readLong();
        this.f992k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f987f = parcel.readInt();
    }
}