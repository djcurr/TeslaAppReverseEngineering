package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.Locale;

/* loaded from: classes5.dex */
public class CheckedRow extends UncheckedRow {
    private CheckedRow(g gVar, Table table, long j11) {
        super(gVar, table, j11);
    }

    public static CheckedRow d(g gVar, Table table, long j11) {
        return new CheckedRow(gVar, table, table.nativeGetRowPtr(table.getNativePtr(), j11));
    }

    public static CheckedRow e(UncheckedRow uncheckedRow) {
        return new CheckedRow(uncheckedRow);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.o
    public OsList getModelList(long j11) {
        if (getTable().m(j11) == RealmFieldType.LIST) {
            return super.getModelList(j11);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' is not a 'RealmList'.", getTable().k(j11)));
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.o
    public OsMap getModelMap(long j11) {
        if (getTable().m(j11) == RealmFieldType.STRING_TO_LINK_MAP) {
            return super.c(j11);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' is not a 'RealmDictionary'.", getTable().k(j11)));
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.o
    public OsSet getModelSet(long j11) {
        return super.getModelSet(j11);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.o
    public OsList getValueList(long j11, RealmFieldType realmFieldType) {
        if (realmFieldType == getTable().m(j11)) {
            return super.getValueList(j11, realmFieldType);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", getTable().k(j11), realmFieldType.name()));
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.o
    public OsMap getValueMap(long j11, RealmFieldType realmFieldType) {
        if (realmFieldType == getTable().m(j11)) {
            return super.getValueMap(j11, realmFieldType);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", getTable().k(j11), realmFieldType.name()));
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.o
    public OsSet getValueSet(long j11, RealmFieldType realmFieldType) {
        if (realmFieldType == getTable().m(j11)) {
            return super.getValueSet(j11, realmFieldType);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", getTable().k(j11), realmFieldType.name()));
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.o
    public boolean isNull(long j11) {
        return super.isNull(j11);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.o
    public boolean isNullLink(long j11) {
        RealmFieldType columnType = getColumnType(j11);
        if (columnType == RealmFieldType.OBJECT || columnType == RealmFieldType.LIST) {
            return super.isNullLink(j11);
        }
        return false;
    }

    @Override // io.realm.internal.UncheckedRow
    protected native boolean nativeGetBoolean(long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    protected native byte[] nativeGetByteArray(long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetColumnCount(long j11);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetColumnKey(long j11, String str);

    @Override // io.realm.internal.UncheckedRow
    protected native int nativeGetColumnType(long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    protected native long[] nativeGetDecimal128(long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    protected native double nativeGetDouble(long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    protected native float nativeGetFloat(long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetLink(long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetLong(long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    protected native String nativeGetObjectId(long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    protected native String nativeGetString(long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetTimestamp(long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    protected native boolean nativeIsNullLink(long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeNullifyLink(long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetBoolean(long j11, long j12, boolean z11);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetByteArray(long j11, long j12, byte[] bArr);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetDecimal128(long j11, long j12, long j13, long j14);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetDouble(long j11, long j12, double d11);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetFloat(long j11, long j12, float f11);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetLink(long j11, long j12, long j13);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetLong(long j11, long j12, long j13);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetObjectId(long j11, long j12, String str);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetString(long j11, long j12, String str);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetTimestamp(long j11, long j12, long j13);

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.o
    public void setNull(long j11) {
        if (getColumnType(j11) == RealmFieldType.BINARY) {
            super.setBinaryByteArray(j11, null);
        } else {
            super.setNull(j11);
        }
    }

    public CheckedRow(UncheckedRow uncheckedRow) {
        super(uncheckedRow);
    }
}