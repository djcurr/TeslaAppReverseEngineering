package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

@KeepForSdk
/* loaded from: classes3.dex */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList zab;

    @KeepForSdk
    protected EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            if (!this.zaa) {
                int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                ArrayList arrayList = new ArrayList();
                this.zab = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                    String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                    for (int i11 = 1; i11 < count; i11++) {
                        int windowIndex = this.mDataHolder.getWindowIndex(i11);
                        String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i11, windowIndex);
                        if (string2 != null) {
                            if (!string2.equals(string)) {
                                this.zab.add(Integer.valueOf(i11));
                                string = string2;
                            }
                        } else {
                            throw new NullPointerException("Missing value for markerColumn: " + primaryDataMarkerColumn + ", at row: " + i11 + ", for window: " + windowIndex);
                        }
                    }
                }
                this.zaa = true;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public final T get(int i11) {
        int intValue;
        int intValue2;
        zab();
        int zaa = zaa(i11);
        int i12 = 0;
        if (i11 >= 0 && i11 != this.zab.size()) {
            if (i11 == this.zab.size() - 1) {
                intValue = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                intValue2 = ((Integer) this.zab.get(i11)).intValue();
            } else {
                intValue = ((Integer) this.zab.get(i11 + 1)).intValue();
                intValue2 = ((Integer) this.zab.get(i11)).intValue();
            }
            int i13 = intValue - intValue2;
            if (i13 == 1) {
                int zaa2 = zaa(i11);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(zaa2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, zaa2, windowIndex) != null) {
                    i12 = 1;
                }
            } else {
                i12 = i13;
            }
        }
        return getEntry(zaa, i12);
    }

    @KeepForSdk
    protected String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        zab();
        return this.zab.size();
    }

    @KeepForSdk
    protected abstract T getEntry(int i11, int i12);

    @KeepForSdk
    protected abstract String getPrimaryDataMarkerColumn();

    final int zaa(int i11) {
        if (i11 >= 0 && i11 < this.zab.size()) {
            return ((Integer) this.zab.get(i11)).intValue();
        }
        throw new IllegalArgumentException("Position " + i11 + " is out of bounds for this buffer");
    }
}