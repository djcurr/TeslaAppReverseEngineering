package expo.modules.contacts.models;

import android.database.Cursor;
import expo.modules.contacts.EXColumns;

/* loaded from: classes5.dex */
public class EmailModel extends BaseModel {
    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getContentType() {
        return "vnd.android.cursor.item/email_v2";
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return "email";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // expo.modules.contacts.models.BaseModel
    public String getLabelFromCursor(Cursor cursor) {
        String labelFromCursor = super.getLabelFromCursor(cursor);
        if (labelFromCursor != null) {
            return labelFromCursor;
        }
        int i11 = cursor.getInt(cursor.getColumnIndex(EXColumns.TYPE));
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "unknown" : "mobile" : "other" : "work" : "home";
    }
}