package com.facebook.react.modules.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes3.dex */
public class c extends SQLiteOpenHelper {

    /* renamed from: d  reason: collision with root package name */
    private static c f12106d;

    /* renamed from: a  reason: collision with root package name */
    private Context f12107a;

    /* renamed from: b  reason: collision with root package name */
    private SQLiteDatabase f12108b;

    /* renamed from: c  reason: collision with root package name */
    private long f12109c;

    private c(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f12109c = 6291456L;
        this.f12107a = context;
    }

    public static c C(Context context) {
        if (f12106d == null) {
            f12106d = new c(context.getApplicationContext());
        }
        return f12106d;
    }

    private synchronized void j() {
        SQLiteDatabase sQLiteDatabase = this.f12108b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f12108b.close();
            this.f12108b = null;
        }
    }

    private synchronized boolean l() {
        j();
        return this.f12107a.deleteDatabase("RKStorage");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        p().delete("catalystLocalStorage", null, null);
    }

    public synchronized void g() {
        try {
            a();
            j();
            nd.a.b("ReactNative", "Cleaned RKStorage");
        } catch (Exception unused) {
            if (l()) {
                nd.a.b("ReactNative", "Deleted Local Database RKStorage");
                return;
            }
            throw new RuntimeException("Clearing and deleting database RKStorage failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean m() {
        SQLiteDatabase sQLiteDatabase = this.f12108b;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            SQLiteException e11 = null;
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 > 0) {
                    try {
                        l();
                    } catch (SQLiteException e12) {
                        e11 = e12;
                        try {
                            Thread.sleep(30L);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                this.f12108b = getWritableDatabase();
            }
            SQLiteDatabase sQLiteDatabase2 = this.f12108b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.setMaximumSize(this.f12109c);
                return true;
            }
            throw e11;
        }
        return true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        if (i11 != i12) {
            l();
            onCreate(sQLiteDatabase);
        }
    }

    public synchronized SQLiteDatabase p() {
        m();
        return this.f12108b;
    }
}