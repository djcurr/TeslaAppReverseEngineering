package expo.modules.contacts.models;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.google.android.libraries.places.api.model.PlaceTypes;
import expo.modules.contacts.EXColumns;
import java.util.Map;

/* loaded from: classes5.dex */
public class PostalAddressModel extends BaseModel {
    @Override // expo.modules.contacts.models.BaseModel
    public void fromCursor(Cursor cursor) {
        super.fromCursor(cursor);
        putString(cursor, "formattedAddress", EXColumns.DATA);
        putString(cursor, "street", EXColumns.DATA_4);
        putString(cursor, "poBox", EXColumns.DATA_5);
        putString(cursor, PlaceTypes.NEIGHBORHOOD, EXColumns.DATA_6);
        putString(cursor, "city", EXColumns.DATA_7);
        putString(cursor, "region", EXColumns.DATA_8);
        putString(cursor, "state", EXColumns.DATA_8);
        putString(cursor, "postalCode", EXColumns.DATA_9);
        putString(cursor, "country", EXColumns.DATA_10);
    }

    @Override // expo.modules.contacts.models.BaseModel
    public void fromMap(Map<String, Object> map) {
        super.fromMap(map);
        mapValue(map, "region", "state");
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getContentType() {
        return "vnd.android.cursor.item/postal-address_v2";
    }

    @Override // expo.modules.contacts.models.BaseModel
    public ContentValues getContentValues() {
        ContentValues contentValues = super.getContentValues();
        contentValues.put(EXColumns.DATA_4, getString("street"));
        contentValues.put(EXColumns.DATA_7, getString("city"));
        contentValues.put(EXColumns.DATA_8, getString("region"));
        contentValues.put(EXColumns.DATA_10, getString("country"));
        contentValues.put(EXColumns.DATA_9, getString("postalCode"));
        return contentValues;
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return "formattedAddress";
    }

    @Override // expo.modules.contacts.models.BaseModel
    public ContentProviderOperation getInsertOperation(String str) {
        ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        if (str == null) {
            newInsert.withValueBackReference("raw_contact_id", 0);
        } else {
            newInsert.withValue("raw_contact_id", str);
        }
        return newInsert.withValue(EXColumns.MIMETYPE, getContentType()).withValue(EXColumns.TYPE, getType()).withValue(EXColumns.DATA_4, getString("street")).withValue(EXColumns.DATA_7, getString("city")).withValue(EXColumns.DATA_8, getString("region")).withValue(EXColumns.DATA_9, getString("postalCode")).withValue(EXColumns.DATA_10, getString("country")).build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // expo.modules.contacts.models.BaseModel
    public String getLabelFromCursor(Cursor cursor) {
        String labelFromCursor = super.getLabelFromCursor(cursor);
        if (labelFromCursor != null) {
            return labelFromCursor;
        }
        int i11 = cursor.getInt(cursor.getColumnIndex(EXColumns.TYPE));
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? "unknown" : "other" : "work" : "home";
    }

    @Override // expo.modules.contacts.models.BaseModel
    public int mapStringToType(String str) {
        str.hashCode();
        if (str.equals("home")) {
            return 1;
        }
        return !str.equals("work") ? 3 : 2;
    }
}