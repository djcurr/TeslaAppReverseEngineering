package com.google.android.gms.common.data;

import com.google.android.gms.common.data.DataBufferObserver;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class DataBufferObserverSet implements DataBufferObserver, DataBufferObserver.Observable {
    private HashSet zaa = new HashSet();

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void addObserver(DataBufferObserver dataBufferObserver) {
        this.zaa.add(dataBufferObserver);
    }

    public void clear() {
        this.zaa.clear();
    }

    public boolean hasObservers() {
        return !this.zaa.isEmpty();
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataChanged() {
        Iterator it2 = this.zaa.iterator();
        while (it2.hasNext()) {
            ((DataBufferObserver) it2.next()).onDataChanged();
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeChanged(int i11, int i12) {
        Iterator it2 = this.zaa.iterator();
        while (it2.hasNext()) {
            ((DataBufferObserver) it2.next()).onDataRangeChanged(i11, i12);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeInserted(int i11, int i12) {
        Iterator it2 = this.zaa.iterator();
        while (it2.hasNext()) {
            ((DataBufferObserver) it2.next()).onDataRangeInserted(i11, i12);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeMoved(int i11, int i12, int i13) {
        Iterator it2 = this.zaa.iterator();
        while (it2.hasNext()) {
            ((DataBufferObserver) it2.next()).onDataRangeMoved(i11, i12, i13);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeRemoved(int i11, int i12) {
        Iterator it2 = this.zaa.iterator();
        while (it2.hasNext()) {
            ((DataBufferObserver) it2.next()).onDataRangeRemoved(i11, i12);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void removeObserver(DataBufferObserver dataBufferObserver) {
        this.zaa.remove(dataBufferObserver);
    }
}