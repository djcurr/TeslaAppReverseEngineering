package com.google.android.vending.expansion.downloader.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.provider.BaseColumns;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import expo.modules.contacts.EXColumns;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: h  reason: collision with root package name */
    private static e f15890h;

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f15891i = {"FN", "URI", "ETAG", "TOTALBYTES", "CURRENTBYTES", "LASTMOD", "STATUS", "CONTROL", "FAILCOUNT", "RETRYAFTER", "REDIRECTCOUNT", "FILEIDX"};

    /* renamed from: a  reason: collision with root package name */
    final SQLiteOpenHelper f15892a;

    /* renamed from: b  reason: collision with root package name */
    SQLiteStatement f15893b;

    /* renamed from: c  reason: collision with root package name */
    SQLiteStatement f15894c;

    /* renamed from: d  reason: collision with root package name */
    long f15895d;

    /* renamed from: e  reason: collision with root package name */
    int f15896e;

    /* renamed from: f  reason: collision with root package name */
    int f15897f;

    /* renamed from: g  reason: collision with root package name */
    int f15898g;

    /* loaded from: classes3.dex */
    public static class a implements BaseColumns {

        /* renamed from: a  reason: collision with root package name */
        public static final String[][] f15899a = {new String[]{EXColumns.ID, "INTEGER PRIMARY KEY"}, new String[]{"FILEIDX", "INTEGER UNIQUE"}, new String[]{"URI", "TEXT"}, new String[]{"FN", "TEXT UNIQUE"}, new String[]{"ETAG", "TEXT"}, new String[]{"TOTALBYTES", "INTEGER"}, new String[]{"CURRENTBYTES", "INTEGER"}, new String[]{"LASTMOD", "INTEGER"}, new String[]{"STATUS", "INTEGER"}, new String[]{"CONTROL", "INTEGER"}, new String[]{"FAILCOUNT", "INTEGER"}, new String[]{"RETRYAFTER", "INTEGER"}, new String[]{"REDIRECTCOUNT", "INTEGER"}};
    }

    /* loaded from: classes3.dex */
    protected static class b extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        private static final String[][][] f15900a = {a.f15899a, c.f15902a};

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f15901b = {"DownloadColumns", "MetadataColumns"};

        b(Context context) {
            super(context, "DownloadsDB", (SQLiteDatabase.CursorFactory) null, 7);
        }

        private String a(String str, String[][] strArr) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATE TABLE ");
            sb2.append(str);
            sb2.append(" (");
            for (String[] strArr2 : strArr) {
                sb2.append(' ');
                sb2.append(strArr2[0]);
                sb2.append(' ');
                sb2.append(strArr2[1]);
                sb2.append(CoreConstants.COMMA_CHAR);
            }
            sb2.setLength(sb2.length() - 1);
            sb2.append(");");
            return sb2.toString();
        }

        private void g(SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            for (String str : f15901b) {
                try {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            int length = f15900a.length;
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    sQLiteDatabase.execSQL(a(f15901b[i11], f15900a[i11]));
                } catch (Exception e11) {
                    while (true) {
                        e11.printStackTrace();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
            String name = b.class.getName();
            Log.w(name, "Upgrading database from version " + i11 + " to " + i12 + ", which will destroy all old data");
            g(sQLiteDatabase);
            onCreate(sQLiteDatabase);
        }
    }

    /* loaded from: classes3.dex */
    public static class c implements BaseColumns {

        /* renamed from: a  reason: collision with root package name */
        public static final String[][] f15902a = {new String[]{EXColumns.ID, "INTEGER PRIMARY KEY"}, new String[]{"APKVERSION", "INTEGER"}, new String[]{"DOWNLOADSTATUS", "INTEGER"}, new String[]{"DOWNLOADFLAGS", "INTEGER"}};
    }

    private e(Context context) {
        this.f15895d = -1L;
        this.f15896e = -1;
        this.f15897f = -1;
        b bVar = new b(context);
        this.f15892a = bVar;
        Cursor rawQuery = bVar.getReadableDatabase().rawQuery("SELECT APKVERSION,_id,DOWNLOADSTATUS,DOWNLOADFLAGS FROM MetadataColumns LIMIT 1", null);
        if (rawQuery != null && rawQuery.moveToFirst()) {
            this.f15896e = rawQuery.getInt(0);
            this.f15895d = rawQuery.getLong(1);
            this.f15897f = rawQuery.getInt(2);
            this.f15898g = rawQuery.getInt(3);
            rawQuery.close();
        }
        f15890h = this;
    }

    public static synchronized e a(Context context) {
        synchronized (e.class) {
            e eVar = f15890h;
            if (eVar == null) {
                return new e(context);
            }
            return eVar;
        }
    }

    private SQLiteStatement b() {
        if (this.f15893b == null) {
            this.f15893b = this.f15892a.getReadableDatabase().compileStatement("SELECT _id FROM DownloadColumns WHERE FILEIDX = ?");
        }
        return this.f15893b;
    }

    private SQLiteStatement h() {
        if (this.f15894c == null) {
            this.f15894c = this.f15892a.getReadableDatabase().compileStatement("UPDATE DownloadColumns SET CURRENTBYTES = ? WHERE FILEIDX = ?");
        }
        return this.f15894c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.google.android.vending.expansion.downloader.impl.b c(String str) {
        Throwable th2;
        Cursor cursor;
        try {
            cursor = this.f15892a.getReadableDatabase().query("DownloadColumns", f15891i, "FN = ?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        com.google.android.vending.expansion.downloader.impl.b d11 = d(cursor);
                        cursor.close();
                        return d11;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th2;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            cursor = null;
        }
    }

    public com.google.android.vending.expansion.downloader.impl.b d(Cursor cursor) {
        com.google.android.vending.expansion.downloader.impl.b bVar = new com.google.android.vending.expansion.downloader.impl.b(cursor.getInt(11), cursor.getString(0), e.class.getPackage().getName());
        i(bVar, cursor);
        return bVar;
    }

    public com.google.android.vending.expansion.downloader.impl.b[] e() {
        Cursor cursor;
        Throwable th2;
        try {
            cursor = this.f15892a.getReadableDatabase().query("DownloadColumns", f15891i, null, null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        com.google.android.vending.expansion.downloader.impl.b[] bVarArr = new com.google.android.vending.expansion.downloader.impl.b[cursor.getCount()];
                        int i11 = 0;
                        while (true) {
                            int i12 = i11 + 1;
                            bVarArr[i11] = d(cursor);
                            if (!cursor.moveToNext()) {
                                cursor.close();
                                return bVarArr;
                            }
                            i11 = i12;
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th2;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            cursor = null;
            th2 = th4;
        }
    }

    public long f(int i11) {
        SQLiteStatement b11 = b();
        b11.clearBindings();
        b11.bindLong(1, i11);
        try {
            return b11.simpleQueryForLong();
        } catch (SQLiteDoneException unused) {
            return -1L;
        }
    }

    public long g(com.google.android.vending.expansion.downloader.impl.b bVar) {
        return f(bVar.f15843b);
    }

    public void i(com.google.android.vending.expansion.downloader.impl.b bVar, Cursor cursor) {
        bVar.f15842a = cursor.getString(1);
        bVar.f15845d = cursor.getString(2);
        bVar.f15846e = cursor.getLong(3);
        bVar.f15847f = cursor.getLong(4);
        bVar.f15848g = cursor.getLong(5);
        bVar.f15849h = cursor.getInt(6);
        bVar.f15850i = cursor.getInt(7);
        bVar.f15851j = cursor.getInt(8);
        bVar.f15852k = cursor.getInt(9);
        bVar.f15853l = cursor.getInt(10);
    }

    public boolean j(com.google.android.vending.expansion.downloader.impl.b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("FILEIDX", Integer.valueOf(bVar.f15843b));
        contentValues.put("FN", bVar.f15844c);
        contentValues.put("URI", bVar.f15842a);
        contentValues.put("ETAG", bVar.f15845d);
        contentValues.put("TOTALBYTES", Long.valueOf(bVar.f15846e));
        contentValues.put("CURRENTBYTES", Long.valueOf(bVar.f15847f));
        contentValues.put("LASTMOD", Long.valueOf(bVar.f15848g));
        contentValues.put("STATUS", Integer.valueOf(bVar.f15849h));
        contentValues.put("CONTROL", Integer.valueOf(bVar.f15850i));
        contentValues.put("FAILCOUNT", Integer.valueOf(bVar.f15851j));
        contentValues.put("RETRYAFTER", Integer.valueOf(bVar.f15852k));
        contentValues.put("REDIRECTCOUNT", Integer.valueOf(bVar.f15853l));
        return k(bVar, contentValues);
    }

    public boolean k(com.google.android.vending.expansion.downloader.impl.b bVar, ContentValues contentValues) {
        long g11 = bVar == null ? -1L : g(bVar);
        try {
            SQLiteDatabase writableDatabase = this.f15892a.getWritableDatabase();
            if (g11 == -1) {
                return -1 != writableDatabase.insert("DownloadColumns", "URI", contentValues);
            }
            writableDatabase.update("DownloadColumns", contentValues, "DownloadColumns._id = " + g11, null);
            return false;
        } catch (SQLiteException e11) {
            e11.printStackTrace();
            return false;
        }
    }

    public void l(com.google.android.vending.expansion.downloader.impl.b bVar) {
        SQLiteStatement h11 = h();
        h11.clearBindings();
        h11.bindLong(1, bVar.f15847f);
        h11.bindLong(2, bVar.f15843b);
        h11.execute();
    }

    public boolean m(int i11) {
        if (this.f15898g != i11) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("DOWNLOADFLAGS", Integer.valueOf(i11));
            if (p(contentValues)) {
                this.f15898g = i11;
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean n(com.google.android.vending.expansion.downloader.impl.b bVar) {
        Cursor cursor = null;
        try {
            cursor = this.f15892a.getReadableDatabase().query("DownloadColumns", f15891i, "FN= ?", new String[]{bVar.f15844c}, null, null, null);
            if (cursor == null || !cursor.moveToFirst()) {
                return false;
            }
            i(bVar, cursor);
            cursor.close();
            return true;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public boolean o(int i11, int i12) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("APKVERSION", Integer.valueOf(i11));
        contentValues.put("DOWNLOADSTATUS", Integer.valueOf(i12));
        if (p(contentValues)) {
            this.f15896e = i11;
            this.f15897f = i12;
            return true;
        }
        return false;
    }

    public boolean p(ContentValues contentValues) {
        SQLiteDatabase writableDatabase = this.f15892a.getWritableDatabase();
        if (-1 == this.f15895d) {
            long insert = writableDatabase.insert("MetadataColumns", "APKVERSION", contentValues);
            if (-1 == insert) {
                return false;
            }
            this.f15895d = insert;
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_id = ");
        sb2.append(this.f15895d);
        return writableDatabase.update("MetadataColumns", contentValues, sb2.toString(), null) != 0;
    }

    public boolean q(int i11) {
        if (this.f15897f != i11) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("DOWNLOADSTATUS", Integer.valueOf(i11));
            if (p(contentValues)) {
                this.f15897f = i11;
                return true;
            }
            return false;
        }
        return true;
    }
}