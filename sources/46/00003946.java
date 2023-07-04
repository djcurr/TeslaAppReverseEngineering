package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class o0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<o0> CREATOR = new p0();
    @SafeParcelable.Field(id = 2)

    /* renamed from: a  reason: collision with root package name */
    Bundle f16839a;

    @SafeParcelable.Constructor
    public o0(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f16839a = bundle;
    }

    @KeepForSdk
    public Intent K1() {
        Intent intent = new Intent();
        intent.putExtras(this.f16839a);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p0.c(this, parcel, i11);
    }
}