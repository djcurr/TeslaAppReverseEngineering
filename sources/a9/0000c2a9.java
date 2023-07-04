package yh;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class t0 extends SQLiteOpenHelper {

    /* renamed from: c */
    private static final String f59571c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d */
    static int f59572d = 5;

    /* renamed from: e */
    private static final a f59573e;

    /* renamed from: f */
    private static final a f59574f;

    /* renamed from: g */
    private static final a f59575g;

    /* renamed from: h */
    private static final a f59576h;

    /* renamed from: i */
    private static final a f59577i;

    /* renamed from: j */
    private static final List<a> f59578j;

    /* renamed from: a */
    private final int f59579a;

    /* renamed from: b */
    private boolean f59580b;

    /* loaded from: classes3.dex */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        r0 r0Var = new a() { // from class: yh.r0
            @Override // yh.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.l(sQLiteDatabase);
            }
        };
        f59573e = r0Var;
        o0 o0Var = new a() { // from class: yh.o0
            @Override // yh.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.a(sQLiteDatabase);
            }
        };
        f59574f = o0Var;
        p0 p0Var = new a() { // from class: yh.p0
            @Override // yh.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.g(sQLiteDatabase);
            }
        };
        f59575g = p0Var;
        q0 q0Var = new a() { // from class: yh.q0
            @Override // yh.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.j(sQLiteDatabase);
            }
        };
        f59576h = q0Var;
        s0 s0Var = new a() { // from class: yh.s0
            @Override // yh.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.m(sQLiteDatabase);
            }
        };
        f59577i = s0Var;
        f59578j = Arrays.asList(r0Var, o0Var, p0Var, q0Var, s0Var);
    }

    public t0(Context context, String str, int i11) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i11);
        this.f59580b = false;
        this.f59579a = i11;
    }

    public static /* synthetic */ void C(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void D(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void L(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    public static /* synthetic */ void R(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f59571c);
    }

    public static /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        D(sQLiteDatabase);
    }

    private void a0(SQLiteDatabase sQLiteDatabase, int i11) {
        p(sQLiteDatabase);
        e0(sQLiteDatabase, 0, i11);
    }

    private void e0(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        List<a> list = f59578j;
        if (i12 <= list.size()) {
            while (i11 < i12) {
                f59578j.get(i11).a(sQLiteDatabase);
                i11++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i11 + " to " + i12 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public static /* synthetic */ void g(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }

    public static /* synthetic */ void j(SQLiteDatabase sQLiteDatabase) {
        L(sQLiteDatabase);
    }

    public static /* synthetic */ void l(SQLiteDatabase sQLiteDatabase) {
        C(sQLiteDatabase);
    }

    public static /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
        R(sQLiteDatabase);
    }

    private void p(SQLiteDatabase sQLiteDatabase) {
        if (this.f59580b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f59580b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a0(sQLiteDatabase, this.f59579a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        a0(sQLiteDatabase, i12);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        p(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        p(sQLiteDatabase);
        e0(sQLiteDatabase, i11, i12);
    }
}