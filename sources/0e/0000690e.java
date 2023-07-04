package expo.modules.contacts.models;

import android.database.Cursor;
import expo.modules.contacts.EXColumns;
import java.util.Map;

/* loaded from: classes5.dex */
public class PhoneNumberModel extends BaseModel {
    @Override // expo.modules.contacts.models.BaseModel
    public void fromMap(Map<String, Object> map) {
        super.fromMap(map);
        this.map.putString("digits", getData().replaceAll("[^\\d.]", ""));
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getContentType() {
        return "vnd.android.cursor.item/phone_v2";
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return "number";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // expo.modules.contacts.models.BaseModel
    public String getLabelFromCursor(Cursor cursor) {
        String labelFromCursor = super.getLabelFromCursor(cursor);
        if (labelFromCursor != null) {
            return labelFromCursor;
        }
        int i11 = cursor.getInt(cursor.getColumnIndex(EXColumns.TYPE));
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 7 ? "unknown" : "other" : "work" : "mobile" : "home";
    }

    @Override // expo.modules.contacts.models.BaseModel
    public int mapStringToType(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1171162643:
                if (str.equals("otherFax")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1073799780:
                if (str.equals("faxHome")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1073745133:
                if (str.equals("workMobile")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1073352754:
                if (str.equals("faxWork")) {
                    c11 = 3;
                    break;
                }
                break;
            case -1068855134:
                if (str.equals("mobile")) {
                    c11 = 4;
                    break;
                }
                break;
            case -863168709:
                if (str.equals("ttyTdd")) {
                    c11 = 5;
                    break;
                }
                break;
            case -508612650:
                if (str.equals("companyMain")) {
                    c11 = 6;
                    break;
                }
                break;
            case -172220347:
                if (str.equals("callback")) {
                    c11 = 7;
                    break;
                }
                break;
            case 98260:
                if (str.equals("car")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 108243:
                if (str.equals("mms")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 3208415:
                if (str.equals("home")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 3241780:
                if (str.equals("isdn")) {
                    c11 = 11;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 3655441:
                if (str.equals("work")) {
                    c11 = '\r';
                    break;
                }
                break;
            case 106069776:
                if (str.equals("other")) {
                    c11 = 14;
                    break;
                }
                break;
            case 106426307:
                if (str.equals("pager")) {
                    c11 = 15;
                    break;
                }
                break;
            case 108270587:
                if (str.equals("radio")) {
                    c11 = 16;
                    break;
                }
                break;
            case 110244366:
                if (str.equals("telex")) {
                    c11 = 17;
                    break;
                }
                break;
            case 1076099890:
                if (str.equals("workPager")) {
                    c11 = 18;
                    break;
                }
                break;
            case 1429828318:
                if (str.equals("assistant")) {
                    c11 = 19;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return 13;
            case 1:
                return 5;
            case 2:
                return 17;
            case 3:
                return 4;
            case 4:
                return 2;
            case 5:
                return 16;
            case 6:
                return 10;
            case 7:
                return 8;
            case '\b':
                return 9;
            case '\t':
                return 20;
            case '\n':
                return 1;
            case 11:
                return 11;
            case '\f':
                return 12;
            case '\r':
                return 3;
            case 14:
                return 7;
            case 15:
                return 6;
            case 16:
                return 14;
            case 17:
                return 15;
            case 18:
                return 18;
            case 19:
                return 19;
            default:
                return 0;
        }
    }
}