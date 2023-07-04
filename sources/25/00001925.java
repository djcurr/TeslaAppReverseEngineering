package com.facebook.react.modules.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.ReadableArray;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i11) {
        String[] strArr = new String[i11];
        Arrays.fill(strArr, CallerData.NA);
        return "key IN (" + TextUtils.join(", ", strArr) + ")";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] b(ReadableArray readableArray, int i11, int i12) {
        String[] strArr = new String[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            strArr[i13] = readableArray.getString(i11 + i13);
        }
        return strArr;
    }

    private static void c(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject2.optJSONObject(next);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(next);
            if (optJSONObject != null && optJSONObject2 != null) {
                c(optJSONObject2, optJSONObject);
                jSONObject.put(next, optJSONObject2);
            } else {
                jSONObject.put(next, jSONObject2.get(next));
            }
        }
    }

    public static String d(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("catalystLocalStorage", new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            if (!query.moveToFirst()) {
                return null;
            }
            return query.getString(0);
        } finally {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String d11 = d(sQLiteDatabase, str);
        if (d11 != null) {
            JSONObject jSONObject = new JSONObject(d11);
            c(jSONObject, new JSONObject(str2));
            str2 = jSONObject.toString();
        }
        return f(sQLiteDatabase, str, str2);
    }

    static boolean f(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Action.KEY_ATTRIBUTE, str);
        contentValues.put("value", str2);
        return -1 != sQLiteDatabase.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5);
    }
}