package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "ActivityTransitionResultCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new zzs();
    @SafeParcelable.Field(getter = "getTransitionEvents", id = 1)
    private final List zza;
    @SafeParcelable.Field(getter = "getExtras", id = 2)
    private Bundle zzb;

    public ActivityTransitionResult(@SafeParcelable.Param(id = 1) List<ActivityTransitionEvent> list) {
        this.zzb = null;
        Preconditions.checkNotNull(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i11 = 1; i11 < list.size(); i11++) {
                Preconditions.checkArgument(list.get(i11).getElapsedRealTimeNanos() >= list.get(i11 + (-1)).getElapsedRealTimeNanos());
            }
        }
        this.zza = Collections.unmodifiableList(list);
    }

    public static ActivityTransitionResult extractResult(Intent intent) {
        if (hasResult(intent)) {
            return (ActivityTransitionResult) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
        }
        return null;
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((ActivityTransitionResult) obj).zza);
    }

    public List<ActivityTransitionEvent> getTransitionEvents() {
        return this.zza;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getTransitionEvents(), false);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public ActivityTransitionResult(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) Bundle bundle) {
        this(list);
        this.zzb = bundle;
    }
}