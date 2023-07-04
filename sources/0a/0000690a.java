package expo.modules.contacts.models;

import android.database.Cursor;
import expo.modules.contacts.EXColumns;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public class DateModel extends BaseModel {
    @Override // expo.modules.contacts.models.BaseModel
    public void fromMap(Map<String, Object> map) {
        super.fromMap(map);
        String str = (String) map.get("date");
        Boolean valueOf = Boolean.valueOf(!str.startsWith("--"));
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("--MM-dd", Locale.getDefault());
        try {
            if (valueOf.booleanValue()) {
                calendar.setTime(simpleDateFormat.parse(str));
            } else {
                calendar.setTime(simpleDateFormat2.parse(str));
            }
        } catch (Exception unused) {
        }
        if (valueOf.booleanValue()) {
            this.map.putInt("year", calendar.get(1));
        }
        this.map.putInt("month", calendar.get(2) + 1);
        this.map.putInt("day", calendar.get(5));
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getContentType() {
        return "vnd.android.cursor.item/contact_event";
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return "date";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // expo.modules.contacts.models.BaseModel
    public String getLabelFromCursor(Cursor cursor) {
        String labelFromCursor = super.getLabelFromCursor(cursor);
        if (labelFromCursor != null) {
            return labelFromCursor;
        }
        int i11 = cursor.getInt(cursor.getColumnIndex(EXColumns.TYPE));
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? "unknown" : "birthday" : "other" : "anniversary";
    }

    @Override // expo.modules.contacts.models.BaseModel
    public int mapStringToType(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -940675184:
                if (str.equals("anniversary")) {
                    c11 = 0;
                    break;
                }
                break;
            case 106069776:
                if (str.equals("other")) {
                    c11 = 1;
                    break;
                }
                break;
            case 1069376125:
                if (str.equals("birthday")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 0;
        }
    }
}