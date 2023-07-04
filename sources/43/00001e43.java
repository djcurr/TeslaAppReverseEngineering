package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
/* loaded from: classes3.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    private static final Builder zaf = new zab(new String[0], null);
    @SafeParcelable.VersionField(id = 1000)
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;
    @SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] zag;
    @SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] zah;
    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zai;
    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final Bundle zaj;
    private boolean zak;

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class Builder {
        private final String[] zaa;
        private final ArrayList zab = new ArrayList();
        private final HashMap zac = new HashMap();

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        @KeepForSdk
        public DataHolder build(int i11) {
            return new DataHolder(this, i11);
        }

        @KeepForSdk
        public Builder withRow(ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap hashMap = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return zaa(hashMap);
        }

        public Builder zaa(HashMap hashMap) {
            Asserts.checkNotNull(hashMap);
            this.zab.add(hashMap);
            return this;
        }

        @KeepForSdk
        public DataHolder build(int i11, Bundle bundle) {
            return new DataHolder(this, i11, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param(id = 1000) int i11, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i11;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i12;
        this.zaj = bundle;
    }

    @KeepForSdk
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, null, null);
    }

    @KeepForSdk
    public static DataHolder empty(int i11) {
        return new DataHolder(zaf, i11, (Bundle) null);
    }

    private final void zae(String str, int i11) {
        Bundle bundle = this.zab;
        if (bundle != null && bundle.containsKey(str)) {
            if (!isClosed()) {
                if (i11 < 0 || i11 >= this.zad) {
                    throw new CursorIndexOutOfBoundsException(i11, this.zad);
                }
                return;
            }
            throw new IllegalArgumentException("Buffer is closed.");
        }
        throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0133, code lost:
        if (r5 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0135, code lost:
        android.util.Log.d("DataHolder", "Couldn't populate window data for row " + r4 + " - allocating new window.");
        r2.freeLastRow();
        r2 = new android.database.CursorWindow(false);
        r2.setStartPosition(r4);
        r2.setNumColumns(r13.zaa.length);
        r3.add(r2);
        r4 = r4 - 1;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0167, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0171, code lost:
        throw new com.google.android.gms.common.data.zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.database.CursorWindow[] zaf(com.google.android.gms.common.data.DataHolder.Builder r13, int r14) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.zaf(com.google.android.gms.common.data.DataHolder$Builder, int):android.database.CursorWindow[]");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            if (!this.zae) {
                this.zae = true;
                int i11 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.zah;
                    if (i11 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i11].close();
                    i11++;
                }
            }
        }
    }

    protected final void finalize() {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + obj + ")");
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(String str, int i11, int i12) {
        zae(str, i11);
        return Long.valueOf(this.zah[i12].getLong(i11, this.zab.getInt(str))).longValue() == 1;
    }

    @KeepForSdk
    public byte[] getByteArray(String str, int i11, int i12) {
        zae(str, i11);
        return this.zah[i12].getBlob(i11, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getCount() {
        return this.zad;
    }

    @KeepForSdk
    public int getInteger(String str, int i11, int i12) {
        zae(str, i11);
        return this.zah[i12].getInt(i11, this.zab.getInt(str));
    }

    @KeepForSdk
    public long getLong(String str, int i11, int i12) {
        zae(str, i11);
        return this.zah[i12].getLong(i11, this.zab.getInt(str));
    }

    @KeepForSdk
    public Bundle getMetadata() {
        return this.zaj;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.zai;
    }

    @KeepForSdk
    public String getString(String str, int i11, int i12) {
        zae(str, i11);
        return this.zah[i12].getString(i11, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getWindowIndex(int i11) {
        int length;
        int i12 = 0;
        Preconditions.checkState(i11 >= 0 && i11 < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i12 >= length) {
                break;
            } else if (i11 < iArr[i12]) {
                i12--;
                break;
            } else {
                i12++;
            }
        }
        return i12 == length ? i12 - 1 : i12;
    }

    @KeepForSdk
    public boolean hasColumn(String str) {
        return this.zab.containsKey(str);
    }

    @KeepForSdk
    public boolean hasNull(String str, int i11, int i12) {
        zae(str, i11);
        return this.zah[i12].isNull(i11, this.zab.getInt(str));
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z11;
        synchronized (this) {
            z11 = this.zae;
        }
        return z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.zag, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i11, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i11 & 1) != 0) {
            close();
        }
    }

    public final double zaa(String str, int i11, int i12) {
        zae(str, i11);
        return this.zah[i12].getDouble(i11, this.zab.getInt(str));
    }

    public final float zab(String str, int i11, int i12) {
        zae(str, i11);
        return this.zah[i12].getFloat(i11, this.zab.getInt(str));
    }

    public final void zac(String str, int i11, int i12, CharArrayBuffer charArrayBuffer) {
        zae(str, i11);
        this.zah[i12].copyStringToBuffer(i11, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new Bundle();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i12 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i12], i12);
            i12++;
        }
        this.zac = new int[this.zah.length];
        int i13 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i11 >= cursorWindowArr.length) {
                this.zad = i13;
                return;
            }
            this.zac[i11] = i13;
            i13 += this.zah[i11].getNumRows() - (i13 - cursorWindowArr[i11].getStartPosition());
            i11++;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DataHolder(android.database.Cursor r8, int r9, android.os.Bundle r10) {
        /*
            r7 = this;
            com.google.android.gms.common.sqlite.CursorWrapper r0 = new com.google.android.gms.common.sqlite.CursorWrapper
            r0.<init>(r8)
            java.lang.String[] r8 = r0.getColumnNames()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L76
            android.database.CursorWindow r3 = r0.getWindow()     // Catch: java.lang.Throwable -> L76
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L2e
            int r6 = r3.getStartPosition()     // Catch: java.lang.Throwable -> L76
            if (r6 != 0) goto L2e
            r3.acquireReference()     // Catch: java.lang.Throwable -> L76
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L76
            r1.add(r3)     // Catch: java.lang.Throwable -> L76
            int r3 = r3.getNumRows()     // Catch: java.lang.Throwable -> L76
            goto L2f
        L2e:
            r3 = r5
        L2f:
            if (r3 >= r2) goto L63
            boolean r6 = r0.moveToPosition(r3)     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L63
            android.database.CursorWindow r6 = r0.getWindow()     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L44
            r6.acquireReference()     // Catch: java.lang.Throwable -> L76
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L76
            goto L4f
        L44:
            android.database.CursorWindow r6 = new android.database.CursorWindow     // Catch: java.lang.Throwable -> L76
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L76
            r6.setStartPosition(r3)     // Catch: java.lang.Throwable -> L76
            r0.fillWindow(r3, r6)     // Catch: java.lang.Throwable -> L76
        L4f:
            int r3 = r6.getNumRows()     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L56
            goto L63
        L56:
            r1.add(r6)     // Catch: java.lang.Throwable -> L76
            int r3 = r6.getStartPosition()     // Catch: java.lang.Throwable -> L76
            int r6 = r6.getNumRows()     // Catch: java.lang.Throwable -> L76
            int r3 = r3 + r6
            goto L2f
        L63:
            r0.close()
            int r0 = r1.size()
            android.database.CursorWindow[] r0 = new android.database.CursorWindow[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.database.CursorWindow[] r0 = (android.database.CursorWindow[]) r0
            r7.<init>(r8, r0, r9, r10)
            return
        L76:
            r8 = move-exception
            r0.close()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.<init>(android.database.Cursor, int, android.os.Bundle):void");
    }

    private DataHolder(Builder builder, int i11, Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i11, (Bundle) null);
    }

    @KeepForSdk
    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (String[]) Preconditions.checkNotNull(strArr);
        this.zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i11;
        this.zaj = bundle;
        zad();
    }
}