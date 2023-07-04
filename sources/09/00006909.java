package expo.modules.contacts.models;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import expo.modules.contacts.CommonProvider;
import expo.modules.contacts.EXColumns;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class BaseModel implements CommonProvider {
    protected final Bundle map = new Bundle();

    public static ArrayList decodeList(List list, Class cls) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            BaseModel baseModel = (BaseModel) cls.newInstance();
            baseModel.fromMap((Map) list.get(i11));
            arrayList.add(baseModel);
        }
        return arrayList;
    }

    public void fromCursor(Cursor cursor) {
        putString(cursor, getIdAlias(), EXColumns.ID);
        this.map.putString(getLabelAlias(), getLabelFromCursor(cursor));
        putString(cursor, getDataAlias(), EXColumns.DATA);
        putString(cursor, EXColumns.LABEL, EXColumns.LABEL);
        putString(cursor, getTypeAlias(), EXColumns.TYPE);
        putInt(cursor, getIsPrimaryAlias(), EXColumns.IS_PRIMARY);
    }

    public void fromMap(Map<String, Object> map) {
        for (String str : map.keySet()) {
            mapValue(map, str);
        }
    }

    @Override // expo.modules.contacts.CommonProvider
    public String getContentType() {
        return null;
    }

    public ContentValues getContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(EXColumns.MIMETYPE, getContentType());
        contentValues.put(EXColumns.DATA, getData());
        contentValues.put(EXColumns.TYPE, getType());
        contentValues.put(EXColumns.LABEL, getLabel());
        contentValues.put(EXColumns.ID, getId());
        contentValues.put(EXColumns.IS_PRIMARY, Integer.valueOf(getIsPrimary()));
        return contentValues;
    }

    public String getData() {
        return getString(getDataAlias());
    }

    @Override // expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return EXColumns.DATA;
    }

    public ContentProviderOperation getDeleteOperation(String str) {
        return ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection(String.format("%s=? AND %s=?", EXColumns.MIMETYPE, "raw_contact_id"), new String[]{getContentType(), str}).build();
    }

    public String getId() {
        return getString(getIdAlias());
    }

    @Override // expo.modules.contacts.CommonProvider
    public String getIdAlias() {
        return "id";
    }

    public final ContentProviderOperation getInsertOperation() {
        return getInsertOperation(null);
    }

    public int getIsPrimary() {
        if (this.map.containsKey(getIsPrimaryAlias())) {
            return this.map.getInt(getIsPrimaryAlias());
        }
        return 0;
    }

    public String getIsPrimaryAlias() {
        return "isPrimary";
    }

    public String getLabel() {
        return getString(getLabelAlias());
    }

    @Override // expo.modules.contacts.CommonProvider
    public String getLabelAlias() {
        return "label";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getLabelFromCursor(Cursor cursor) {
        if (cursor.getInt(cursor.getColumnIndex(EXColumns.TYPE)) != 0) {
            return null;
        }
        String string = cursor.getString(cursor.getColumnIndex(EXColumns.LABEL));
        return string != null ? string : "unknown";
    }

    public Bundle getMap() {
        return this.map;
    }

    public String getString(String str) {
        if (this.map.containsKey(str)) {
            return this.map.getString(str);
        }
        return null;
    }

    public String getType() {
        return getString(getTypeAlias());
    }

    public String getTypeAlias() {
        return "type";
    }

    public int mapStringToType(String str) {
        return 0;
    }

    protected void mapValue(Map<String, Object> map, String str) {
        mapValue(map, str, null);
    }

    protected void putInt(Cursor cursor, String str, String str2) {
        int columnIndex = cursor.getColumnIndex(str2);
        if (columnIndex == -1) {
            return;
        }
        this.map.putInt(str, cursor.getInt(columnIndex));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void putString(Cursor cursor, String str, String str2) {
        int columnIndex = cursor.getColumnIndex(str2);
        if (columnIndex == -1) {
            return;
        }
        String string = cursor.getString(columnIndex);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.map.putString(str, string);
    }

    public ContentProviderOperation getInsertOperation(String str) {
        ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        if (str == null) {
            newInsert.withValueBackReference("raw_contact_id", 0);
        } else {
            newInsert.withValue("raw_contact_id", str);
        }
        return newInsert.withValue(EXColumns.MIMETYPE, getContentType()).withValue(EXColumns.TYPE, Integer.valueOf(mapStringToType(getLabel()))).withValue(EXColumns.DATA, getData()).withValue(EXColumns.ID, getId()).build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void mapValue(Map<String, Object> map, String str, String str2) {
        if (map.containsKey(str)) {
            if (map.get(str) instanceof Boolean) {
                Bundle bundle = this.map;
                if (str2 == null) {
                    str2 = str;
                }
                bundle.putBoolean(str2, ((Boolean) map.get(str)).booleanValue());
                return;
            }
            Bundle bundle2 = this.map;
            if (str2 == null) {
                str2 = str;
            }
            bundle2.putString(str2, (String) map.get(str));
        }
    }
}