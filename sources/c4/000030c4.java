package com.google.android.gms.wallet.callback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

@SafeParcelable.Class(creator = "CallbackInputCreator")
/* loaded from: classes3.dex */
public class CallbackInput extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CallbackInput> CREATOR = new zzh();
    @SafeParcelable.Field(id = 1)
    int zza;
    @SafeParcelable.Field(id = 2)
    byte[] zzb;

    /* loaded from: classes3.dex */
    public final class Builder {
        /* synthetic */ Builder(zzg zzgVar) {
        }

        public CallbackInput build() {
            return CallbackInput.this;
        }

        public Builder setCallbackType(int i11) {
            CallbackInput.this.zza = i11;
            return this;
        }

        public Builder setRequestBytes(byte[] bArr) {
            CallbackInput.this.zzb = bArr;
            return this;
        }
    }

    private CallbackInput() {
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public <T extends AbstractSafeParcelable> T deserializeRequest(Parcelable.Creator<T> creator) {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return null;
        }
        return (T) SafeParcelableSerializer.deserializeFromBytes(bArr, creator);
    }

    public int getCallbackType() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CallbackInput(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = i11;
        this.zzb = bArr;
    }
}