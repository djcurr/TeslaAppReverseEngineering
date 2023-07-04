package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f943a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f944b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f945c;

    /* renamed from: d  reason: collision with root package name */
    private final CharSequence f946d;

    /* renamed from: e  reason: collision with root package name */
    private final Bitmap f947e;

    /* renamed from: f  reason: collision with root package name */
    private final Uri f948f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f949g;

    /* renamed from: h  reason: collision with root package name */
    private final Uri f950h;

    /* renamed from: i  reason: collision with root package name */
    private MediaDescription f951i;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i11) {
            return new MediaDescriptionCompat[i11];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f952a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f953b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f954c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f955d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f956e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f957f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f958g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f959h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f952a, this.f953b, this.f954c, this.f955d, this.f956e, this.f957f, this.f958g, this.f959h);
        }

        public b b(CharSequence charSequence) {
            this.f955d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f958g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f956e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f957f = uri;
            return this;
        }

        public b f(String str) {
            this.f952a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f959h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f954c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f953b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f943a = str;
        this.f944b = charSequence;
        this.f945c = charSequence2;
        this.f946d = charSequence3;
        this.f947e = bitmap;
        this.f948f = uri;
        this.f949g = bundle;
        this.f950h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L83
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L83
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = r9.getMediaId()
            r2.f(r3)
            java.lang.CharSequence r3 = r9.getTitle()
            r2.i(r3)
            java.lang.CharSequence r3 = r9.getSubtitle()
            r2.h(r3)
            java.lang.CharSequence r3 = r9.getDescription()
            r2.b(r3)
            android.graphics.Bitmap r3 = r9.getIconBitmap()
            r2.d(r3)
            android.net.Uri r3 = r9.getIconUri()
            r2.e(r3)
            android.os.Bundle r3 = r9.getExtras()
            if (r3 == 0) goto L44
            android.os.Bundle r3 = android.support.v4.media.session.MediaSessionCompat.b(r3)
        L44:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L4f
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L50
        L4f:
            r5 = r0
        L50:
            if (r5 == 0) goto L68
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L62
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L62
            goto L69
        L62:
            r3.remove(r4)
            r3.remove(r6)
        L68:
            r0 = r3
        L69:
            r2.c(r0)
            if (r5 == 0) goto L72
            r2.g(r5)
            goto L7d
        L72:
            r0 = 23
            if (r1 < r0) goto L7d
            android.net.Uri r0 = r9.getMediaUri()
            r2.g(r0)
        L7d:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.f951i = r9
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object b() {
        int i11;
        MediaDescription mediaDescription = this.f951i;
        if (mediaDescription != null || (i11 = Build.VERSION.SDK_INT) < 21) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f943a);
        builder.setTitle(this.f944b);
        builder.setSubtitle(this.f945c);
        builder.setDescription(this.f946d);
        builder.setIconBitmap(this.f947e);
        builder.setIconUri(this.f948f);
        Bundle bundle = this.f949g;
        if (i11 < 23 && this.f950h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f950h);
        }
        builder.setExtras(bundle);
        if (i11 >= 23) {
            builder.setMediaUri(this.f950h);
        }
        MediaDescription build = builder.build();
        this.f951i = build;
        return build;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f944b) + ", " + ((Object) this.f945c) + ", " + ((Object) this.f946d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f943a);
            TextUtils.writeToParcel(this.f944b, parcel, i11);
            TextUtils.writeToParcel(this.f945c, parcel, i11);
            TextUtils.writeToParcel(this.f946d, parcel, i11);
            parcel.writeParcelable(this.f947e, i11);
            parcel.writeParcelable(this.f948f, i11);
            parcel.writeBundle(this.f949g);
            parcel.writeParcelable(this.f950h, i11);
            return;
        }
        ((MediaDescription) b()).writeToParcel(parcel, i11);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f943a = parcel.readString();
        this.f944b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f945c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f946d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f947e = (Bitmap) parcel.readParcelable(classLoader);
        this.f948f = (Uri) parcel.readParcelable(classLoader);
        this.f949g = parcel.readBundle(classLoader);
        this.f950h = (Uri) parcel.readParcelable(classLoader);
    }
}