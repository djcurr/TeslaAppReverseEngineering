package androidx.room;

import android.database.Cursor;
import java.util.List;
import v4.h;

/* loaded from: classes.dex */
public class v0 extends h.a {

    /* renamed from: b  reason: collision with root package name */
    private p f5860b;

    /* renamed from: c  reason: collision with root package name */
    private final a f5861c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5862d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5863e;

    /* loaded from: classes.dex */
    public static abstract class a {
        public final int version;

        public a(int i11) {
            this.version = i11;
        }

        protected abstract void createAllTables(v4.g gVar);

        protected abstract void dropAllTables(v4.g gVar);

        protected abstract void onCreate(v4.g gVar);

        protected abstract void onOpen(v4.g gVar);

        protected abstract void onPostMigrate(v4.g gVar);

        protected abstract void onPreMigrate(v4.g gVar);

        protected abstract b onValidateSchema(v4.g gVar);

        @Deprecated
        protected void validateMigration(v4.g gVar) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f5864a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5865b;

        public b(boolean z11, String str) {
            this.f5864a = z11;
            this.f5865b = str;
        }
    }

    public v0(p pVar, a aVar, String str, String str2) {
        super(aVar.version);
        this.f5860b = pVar;
        this.f5861c = aVar;
        this.f5862d = str;
        this.f5863e = str2;
    }

    private void h(v4.g gVar) {
        if (k(gVar)) {
            Cursor d02 = gVar.d0(new v4.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                String string = d02.moveToFirst() ? d02.getString(0) : null;
                d02.close();
                if (!this.f5862d.equals(string) && !this.f5863e.equals(string)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
                return;
            } catch (Throwable th2) {
                d02.close();
                throw th2;
            }
        }
        b onValidateSchema = this.f5861c.onValidateSchema(gVar);
        if (onValidateSchema.f5864a) {
            this.f5861c.onPostMigrate(gVar);
            l(gVar);
            return;
        }
        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f5865b);
    }

    private void i(v4.g gVar) {
        gVar.u("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(v4.g gVar) {
        Cursor a12 = gVar.a1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z11 = false;
            if (a12.moveToFirst()) {
                if (a12.getInt(0) == 0) {
                    z11 = true;
                }
            }
            return z11;
        } finally {
            a12.close();
        }
    }

    private static boolean k(v4.g gVar) {
        Cursor a12 = gVar.a1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z11 = false;
            if (a12.moveToFirst()) {
                if (a12.getInt(0) != 0) {
                    z11 = true;
                }
            }
            return z11;
        } finally {
            a12.close();
        }
    }

    private void l(v4.g gVar) {
        i(gVar);
        gVar.u(u0.a(this.f5862d));
    }

    @Override // v4.h.a
    public void b(v4.g gVar) {
        super.b(gVar);
    }

    @Override // v4.h.a
    public void d(v4.g gVar) {
        boolean j11 = j(gVar);
        this.f5861c.createAllTables(gVar);
        if (!j11) {
            b onValidateSchema = this.f5861c.onValidateSchema(gVar);
            if (!onValidateSchema.f5864a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f5865b);
            }
        }
        l(gVar);
        this.f5861c.onCreate(gVar);
    }

    @Override // v4.h.a
    public void e(v4.g gVar, int i11, int i12) {
        g(gVar, i11, i12);
    }

    @Override // v4.h.a
    public void f(v4.g gVar) {
        super.f(gVar);
        h(gVar);
        this.f5861c.onOpen(gVar);
        this.f5860b = null;
    }

    @Override // v4.h.a
    public void g(v4.g gVar, int i11, int i12) {
        boolean z11;
        List<t4.b> c11;
        p pVar = this.f5860b;
        if (pVar == null || (c11 = pVar.f5808d.c(i11, i12)) == null) {
            z11 = false;
        } else {
            this.f5861c.onPreMigrate(gVar);
            for (t4.b bVar : c11) {
                bVar.a(gVar);
            }
            b onValidateSchema = this.f5861c.onValidateSchema(gVar);
            if (onValidateSchema.f5864a) {
                this.f5861c.onPostMigrate(gVar);
                l(gVar);
                z11 = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f5865b);
            }
        }
        if (z11) {
            return;
        }
        p pVar2 = this.f5860b;
        if (pVar2 != null && !pVar2.a(i11, i12)) {
            this.f5861c.dropAllTables(gVar);
            this.f5861c.createAllTables(gVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i11 + " to " + i12 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}