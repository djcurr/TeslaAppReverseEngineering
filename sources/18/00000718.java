package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final String f4971a;

    /* renamed from: b  reason: collision with root package name */
    final String f4972b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f4973c;

    /* renamed from: d  reason: collision with root package name */
    final int f4974d;

    /* renamed from: e  reason: collision with root package name */
    final int f4975e;

    /* renamed from: f  reason: collision with root package name */
    final String f4976f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f4977g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f4978h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f4979i;

    /* renamed from: j  reason: collision with root package name */
    final Bundle f4980j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f4981k;

    /* renamed from: l  reason: collision with root package name */
    final int f4982l;

    /* renamed from: m  reason: collision with root package name */
    Bundle f4983m;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<w> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public w createFromParcel(Parcel parcel) {
            return new w(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public w[] newArray(int i11) {
            return new w[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Fragment fragment) {
        this.f4971a = fragment.getClass().getName();
        this.f4972b = fragment.mWho;
        this.f4973c = fragment.mFromLayout;
        this.f4974d = fragment.mFragmentId;
        this.f4975e = fragment.mContainerId;
        this.f4976f = fragment.mTag;
        this.f4977g = fragment.mRetainInstance;
        this.f4978h = fragment.mRemoving;
        this.f4979i = fragment.mDetached;
        this.f4980j = fragment.mArguments;
        this.f4981k = fragment.mHidden;
        this.f4982l = fragment.mMaxState.ordinal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment a(l lVar, ClassLoader classLoader) {
        Fragment instantiate = lVar.instantiate(classLoader, this.f4971a);
        Bundle bundle = this.f4980j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        instantiate.setArguments(this.f4980j);
        instantiate.mWho = this.f4972b;
        instantiate.mFromLayout = this.f4973c;
        instantiate.mRestored = true;
        instantiate.mFragmentId = this.f4974d;
        instantiate.mContainerId = this.f4975e;
        instantiate.mTag = this.f4976f;
        instantiate.mRetainInstance = this.f4977g;
        instantiate.mRemoving = this.f4978h;
        instantiate.mDetached = this.f4979i;
        instantiate.mHidden = this.f4981k;
        instantiate.mMaxState = p.c.values()[this.f4982l];
        Bundle bundle2 = this.f4983m;
        if (bundle2 != null) {
            instantiate.mSavedFragmentState = bundle2;
        } else {
            instantiate.mSavedFragmentState = new Bundle();
        }
        return instantiate;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f4971a);
        sb2.append(" (");
        sb2.append(this.f4972b);
        sb2.append(")}:");
        if (this.f4973c) {
            sb2.append(" fromLayout");
        }
        if (this.f4975e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f4975e));
        }
        String str = this.f4976f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f4976f);
        }
        if (this.f4977g) {
            sb2.append(" retainInstance");
        }
        if (this.f4978h) {
            sb2.append(" removing");
        }
        if (this.f4979i) {
            sb2.append(" detached");
        }
        if (this.f4981k) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f4971a);
        parcel.writeString(this.f4972b);
        parcel.writeInt(this.f4973c ? 1 : 0);
        parcel.writeInt(this.f4974d);
        parcel.writeInt(this.f4975e);
        parcel.writeString(this.f4976f);
        parcel.writeInt(this.f4977g ? 1 : 0);
        parcel.writeInt(this.f4978h ? 1 : 0);
        parcel.writeInt(this.f4979i ? 1 : 0);
        parcel.writeBundle(this.f4980j);
        parcel.writeInt(this.f4981k ? 1 : 0);
        parcel.writeBundle(this.f4983m);
        parcel.writeInt(this.f4982l);
    }

    w(Parcel parcel) {
        this.f4971a = parcel.readString();
        this.f4972b = parcel.readString();
        this.f4973c = parcel.readInt() != 0;
        this.f4974d = parcel.readInt();
        this.f4975e = parcel.readInt();
        this.f4976f = parcel.readString();
        this.f4977g = parcel.readInt() != 0;
        this.f4978h = parcel.readInt() != 0;
        this.f4979i = parcel.readInt() != 0;
        this.f4980j = parcel.readBundle();
        this.f4981k = parcel.readInt() != 0;
        this.f4983m = parcel.readBundle();
        this.f4982l = parcel.readInt();
    }
}