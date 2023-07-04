package expo.modules.contacts.models;

import android.database.Cursor;
import expo.modules.contacts.EXColumns;

/* loaded from: classes5.dex */
public class RelationshipModel extends BaseModel {
    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getContentType() {
        return "vnd.android.cursor.item/relation";
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return "name";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // expo.modules.contacts.models.BaseModel
    public String getLabelFromCursor(Cursor cursor) {
        String labelFromCursor = super.getLabelFromCursor(cursor);
        if (labelFromCursor != null) {
            return labelFromCursor;
        }
        switch (cursor.getInt(cursor.getColumnIndex(EXColumns.TYPE))) {
            case 1:
                return "assistant";
            case 2:
                return "bother";
            case 3:
                return "child";
            case 4:
                return "domesticPartner";
            case 5:
                return "father";
            case 6:
                return "friend";
            case 7:
                return "manager";
            case 8:
                return "mother";
            case 9:
                return "parent";
            case 10:
                return "partner";
            case 11:
                return "referredBy";
            case 12:
                return "relative";
            case 13:
                return "sister";
            case 14:
                return "spouse";
            default:
                return "unknown";
        }
    }
}