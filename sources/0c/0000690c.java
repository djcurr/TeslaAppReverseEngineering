package expo.modules.contacts.models;

import android.database.Cursor;
import expo.modules.contacts.EXColumns;
import java.util.Map;

/* loaded from: classes5.dex */
public class ExtraNameModel extends BaseModel {
    @Override // expo.modules.contacts.models.BaseModel
    public void fromMap(Map<String, Object> map) {
        super.fromMap(map);
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getContentType() {
        return "vnd.android.cursor.item/nickname";
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return "value";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // expo.modules.contacts.models.BaseModel
    public String getLabelFromCursor(Cursor cursor) {
        String labelFromCursor = super.getLabelFromCursor(cursor);
        if (labelFromCursor != null) {
            return labelFromCursor;
        }
        int i11 = cursor.getInt(cursor.getColumnIndex(EXColumns.TYPE));
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? "unknown" : "initials" : "shortName" : "maidenName" : "otherName" : "nickname";
    }

    @Override // expo.modules.contacts.models.BaseModel
    public int mapStringToType(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2028219097:
                if (str.equals("shortName")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1946065477:
                if (str.equals("otherName")) {
                    c11 = 1;
                    break;
                }
                break;
            case 269062575:
                if (str.equals("initials")) {
                    c11 = 2;
                    break;
                }
                break;
            case 688538947:
                if (str.equals("maidenName")) {
                    c11 = 3;
                    break;
                }
                break;
            case 1544803905:
                if (str.equals("default")) {
                    c11 = 4;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return 4;
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 3;
            case 4:
                return 1;
            default:
                return 0;
        }
    }
}