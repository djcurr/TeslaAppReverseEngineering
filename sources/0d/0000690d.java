package expo.modules.contacts.models;

import android.content.ContentValues;
import android.database.Cursor;
import expo.modules.contacts.EXColumns;

/* loaded from: classes5.dex */
public class ImAddressModel extends BaseModel {
    private String serializeService(int i11) {
        switch (i11) {
            case -1:
                return "custom";
            case 0:
                return "aim";
            case 1:
                return "msn";
            case 2:
                return "yahoo";
            case 3:
                return "skype";
            case 4:
                return "qq";
            case 5:
                return "googleTalk";
            case 6:
                return "icq";
            case 7:
                return "jabber";
            case 8:
                return "netmeeting";
            default:
                return "unknown";
        }
    }

    @Override // expo.modules.contacts.models.BaseModel
    public void fromCursor(Cursor cursor) {
        super.fromCursor(cursor);
        this.map.putString("service", serializeService(cursor.getInt(cursor.getColumnIndex(EXColumns.DATA_5))));
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getContentType() {
        return "vnd.android.cursor.item/im";
    }

    @Override // expo.modules.contacts.models.BaseModel
    public ContentValues getContentValues() {
        ContentValues contentValues = super.getContentValues();
        contentValues.put(EXColumns.DATA_5, getString("service"));
        return contentValues;
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return "username";
    }
}