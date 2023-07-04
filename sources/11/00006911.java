package expo.modules.contacts.models;

import android.database.Cursor;
import com.google.android.gms.common.Scopes;
import expo.modules.contacts.EXColumns;

/* loaded from: classes5.dex */
public class UrlAddressModel extends BaseModel {
    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getContentType() {
        return "vnd.android.cursor.item/website";
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return "url";
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
                return "homepage";
            case 2:
                return "blog";
            case 3:
                return Scopes.PROFILE;
            case 4:
                return "home";
            case 5:
                return "work";
            case 6:
                return "ftp";
            case 7:
                return "other";
            default:
                return "unknown";
        }
    }
}