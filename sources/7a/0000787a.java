package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public interface o {
    byte[] getBinaryByteArray(long j11);

    boolean getBoolean(long j11);

    long getColumnKey(String str);

    String[] getColumnNames();

    RealmFieldType getColumnType(long j11);

    Date getDate(long j11);

    Decimal128 getDecimal128(long j11);

    double getDouble(long j11);

    float getFloat(long j11);

    long getLong(long j11);

    OsList getModelList(long j11);

    OsMap getModelMap(long j11);

    OsSet getModelSet(long j11);

    NativeRealmAny getNativeRealmAny(long j11);

    ObjectId getObjectId(long j11);

    long getObjectKey();

    String getString(long j11);

    Table getTable();

    UUID getUUID(long j11);

    OsList getValueList(long j11, RealmFieldType realmFieldType);

    OsMap getValueMap(long j11, RealmFieldType realmFieldType);

    OsSet getValueSet(long j11, RealmFieldType realmFieldType);

    boolean isNull(long j11);

    boolean isNullLink(long j11);

    boolean isValid();

    void setBinaryByteArray(long j11, byte[] bArr);

    void setNull(long j11);

    void setString(long j11, String str);
}