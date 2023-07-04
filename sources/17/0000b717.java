package u4;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public class b {
    public static Cursor a(Cursor cursor) {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                for (int i11 = 0; i11 < cursor.getColumnCount(); i11++) {
                    int type = cursor.getType(i11);
                    if (type == 0) {
                        objArr[i11] = null;
                    } else if (type == 1) {
                        objArr[i11] = Long.valueOf(cursor.getLong(i11));
                    } else if (type == 2) {
                        objArr[i11] = Double.valueOf(cursor.getDouble(i11));
                    } else if (type == 3) {
                        objArr[i11] = cursor.getString(i11);
                    } else if (type == 4) {
                        objArr[i11] = cursor.getBlob(i11);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            return matrixCursor;
        } finally {
            cursor.close();
        }
    }

    private static int b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            return c(cursor.getColumnNames(), str);
        }
        return -1;
    }

    static int c(String[] strArr, String str) {
        String str2 = "." + str;
        String str3 = "." + str + "`";
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str4 = strArr[i11];
            if (str4.length() >= str.length() + 2) {
                if (str4.endsWith(str2)) {
                    return i11;
                }
                if (str4.charAt(0) == '`' && str4.endsWith(str3)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    public static int d(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + "`");
        return columnIndex2 >= 0 ? columnIndex2 : b(cursor, str);
    }

    public static int e(Cursor cursor, String str) {
        String str2;
        int d11 = d(cursor, str);
        if (d11 >= 0) {
            return d11;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e11) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e11);
            str2 = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}