package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes3.dex */
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {
    private AbstractWindowedCursor zza;

    @KeepForSdk
    public CursorWrapper(Cursor cursor) {
        super(cursor);
        for (int i11 = 0; i11 < 10 && (cursor instanceof android.database.CursorWrapper); i11++) {
            cursor = ((android.database.CursorWrapper) cursor).getWrappedCursor();
        }
        if (cursor instanceof AbstractWindowedCursor) {
            this.zza = (AbstractWindowedCursor) cursor;
            return;
        }
        throw new IllegalArgumentException("Unknown type: ".concat(cursor.getClass().getName()));
    }

    @Override // android.database.CrossProcessCursor
    @KeepForSdk
    public void fillWindow(int i11, CursorWindow cursorWindow) {
        this.zza.fillWindow(i11, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @KeepForSdk
    public CursorWindow getWindow() {
        return this.zza.getWindow();
    }

    @Override // android.database.CursorWrapper
    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.zza;
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int i11, int i12) {
        return this.zza.onMove(i11, i12);
    }

    @KeepForSdk
    public void setWindow(CursorWindow cursorWindow) {
        this.zza.setWindow(cursorWindow);
    }
}