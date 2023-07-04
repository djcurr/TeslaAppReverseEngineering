package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;

@KeepForSdk
/* loaded from: classes3.dex */
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {
    private static final String[] zaa = {MessageExtension.FIELD_DATA};
    private final Parcelable.Creator zab;

    @KeepForSdk
    public DataBufferSafeParcelable(DataHolder dataHolder, Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.zab = creator;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void addValue(DataHolder.Builder builder, T t11) {
        Parcel obtain = Parcel.obtain();
        t11.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(MessageExtension.FIELD_DATA, obtain.marshall());
        builder.withRow(contentValues);
        obtain.recycle();
    }

    @KeepForSdk
    public static DataHolder.Builder buildDataHolder() {
        return DataHolder.builder(zaa);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public T get(int i11) {
        DataHolder dataHolder = (DataHolder) Preconditions.checkNotNull(this.mDataHolder);
        byte[] byteArray = dataHolder.getByteArray(MessageExtension.FIELD_DATA, i11, dataHolder.getWindowIndex(i11));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArray, 0, byteArray.length);
        obtain.setDataPosition(0);
        T t11 = (T) this.zab.createFromParcel(obtain);
        obtain.recycle();
        return t11;
    }
}