package yh;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.status.model.StatusResponse;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.stripe.android.model.PaymentMethodOptionsParams;
import expo.modules.contacts.EXColumns;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import ph.i;
import th.a;
import th.c;
import zh.a;

/* loaded from: classes3.dex */
public class m0 implements yh.d, zh.a, yh.c {

    /* renamed from: f */
    private static final nh.b f59538f = nh.b.b("proto");

    /* renamed from: a */
    private final t0 f59539a;

    /* renamed from: b */
    private final ai.a f59540b;

    /* renamed from: c */
    private final ai.a f59541c;

    /* renamed from: d */
    private final e f59542d;

    /* renamed from: e */
    private final rh.a<String> f59543e;

    /* loaded from: classes3.dex */
    public interface b<T, U> {
        U apply(T t11);
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a */
        final String f59544a;

        /* renamed from: b */
        final String f59545b;

        private c(String str, String str2) {
            this.f59544a = str;
            this.f59545b = str2;
        }
    }

    /* loaded from: classes3.dex */
    public interface d<T> {
        T a();
    }

    public m0(ai.a aVar, ai.a aVar2, e eVar, t0 t0Var, rh.a<String> aVar3) {
        this.f59539a = t0Var;
        this.f59540b = aVar;
        this.f59541c = aVar2;
        this.f59542d = eVar;
        this.f59543e = aVar3;
    }

    public static /* synthetic */ th.f C(long j11, Cursor cursor) {
        return U1(j11, cursor);
    }

    public static /* synthetic */ th.a C0(m0 m0Var, String str, Map map, a.C1154a c1154a, SQLiteDatabase sQLiteDatabase) {
        return m0Var.c2(str, map, c1154a, sQLiteDatabase);
    }

    public static /* synthetic */ List D(m0 m0Var, ph.o oVar, SQLiteDatabase sQLiteDatabase) {
        return m0Var.a2(oVar, sQLiteDatabase);
    }

    public static /* synthetic */ Object D0(m0 m0Var, List list, ph.o oVar, Cursor cursor) {
        return m0Var.d2(list, oVar, cursor);
    }

    private long D1() {
        return v1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public static /* synthetic */ Object F0(m0 m0Var, SQLiteDatabase sQLiteDatabase) {
        return m0Var.m2(sQLiteDatabase);
    }

    private th.f F1() {
        final long a11 = this.f59540b.a();
        return (th.f) L1(new b() { // from class: yh.w
            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.t0(a11, (SQLiteDatabase) obj);
            }
        });
    }

    public static /* synthetic */ Long G0(Cursor cursor) {
        return W1(cursor);
    }

    public static /* synthetic */ Object I0(m0 m0Var, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        return m0Var.i2(str, str2, sQLiteDatabase);
    }

    public static /* synthetic */ Object J(SQLiteDatabase sQLiteDatabase) {
        return Q1(sQLiteDatabase);
    }

    public static /* synthetic */ Long J0(m0 m0Var, ph.i iVar, ph.o oVar, SQLiteDatabase sQLiteDatabase) {
        return m0Var.f2(iVar, oVar, sQLiteDatabase);
    }

    private Long K1(SQLiteDatabase sQLiteDatabase, ph.o oVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(bi.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) v2(sQLiteDatabase.query("transport_contexts", new String[]{EXColumns.ID}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: yh.v
            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.G0((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object L(long j11, ph.o oVar, SQLiteDatabase sQLiteDatabase) {
        return l2(j11, oVar, sQLiteDatabase);
    }

    private boolean M1() {
        return z1() * D1() >= this.f59542d.f();
    }

    private List<k> N1(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a l11 = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l11.c(cVar.f59544a, cVar.f59545b);
                }
                listIterator.set(k.a(next.c(), next.d(), l11.d()));
            }
        }
        return list;
    }

    public /* synthetic */ Object O1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i11 = cursor.getInt(0);
            j(i11, c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object P0(Map map, Cursor cursor) {
        return e2(map, cursor);
    }

    public /* synthetic */ Integer P1(long j11, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j11)};
        v2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: yh.h0
            {
                m0.this = this;
            }

            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.n0(m0.this, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ th.a Q0(m0 m0Var, Map map, a.C1154a c1154a, Cursor cursor) {
        return m0Var.b2(map, c1154a, cursor);
    }

    public static /* synthetic */ Object Q1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ byte[] R(Cursor cursor) {
        return g2(cursor);
    }

    public static /* synthetic */ Object R0(m0 m0Var, Cursor cursor) {
        return m0Var.h2(cursor);
    }

    public static /* synthetic */ Object R1(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th2);
    }

    public static /* synthetic */ Integer S0(m0 m0Var, long j11, SQLiteDatabase sQLiteDatabase) {
        return m0Var.P1(j11, sQLiteDatabase);
    }

    public static /* synthetic */ SQLiteDatabase S1(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to open db.", th2);
    }

    public static /* synthetic */ Long T1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ th.f U1(long j11, Cursor cursor) {
        cursor.moveToNext();
        return th.f.c().c(cursor.getLong(0)).b(j11).a();
    }

    public static /* synthetic */ th.f V1(final long j11, SQLiteDatabase sQLiteDatabase) {
        return (th.f) v2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: yh.l
            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.C(j11, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long W1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ List X0(SQLiteDatabase sQLiteDatabase) {
        return Y1(sQLiteDatabase);
    }

    public /* synthetic */ Boolean X1(ph.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long K1 = K1(sQLiteDatabase, oVar);
        if (K1 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) v2(v1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{K1.toString()}), new b() { // from class: yh.y
            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ List Y1(SQLiteDatabase sQLiteDatabase) {
        return (List) v2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: yh.t
            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.a0((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Boolean Z0(Cursor cursor) {
        return j2(cursor);
    }

    public static /* synthetic */ List Z1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(ph.o.a().b(cursor.getString(1)).d(bi.a.b(cursor.getInt(2))).c(p2(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ List a0(Cursor cursor) {
        return Z1(cursor);
    }

    public /* synthetic */ List a2(ph.o oVar, SQLiteDatabase sQLiteDatabase) {
        List<k> n22 = n2(sQLiteDatabase, oVar);
        return N1(n22, o2(sQLiteDatabase, n22));
    }

    private c.b b1(int i11) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i11 == bVar.getNumber()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i11 == bVar2.getNumber()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i11 == bVar3.getNumber()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i11 == bVar4.getNumber()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i11 == bVar5.getNumber()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i11 == bVar6.getNumber()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i11 == bVar7.getNumber()) {
            return bVar7;
        }
        uh.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i11));
        return bVar;
    }

    public /* synthetic */ th.a b2(Map map, a.C1154a c1154a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b b12 = b1(cursor.getInt(1));
            long j11 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(th.c.c().c(b12).b(j11).a());
        }
        q2(c1154a, map);
        c1154a.e(F1());
        c1154a.d(y1());
        c1154a.c(this.f59543e.get());
        return c1154a.b();
    }

    public /* synthetic */ th.a c2(String str, final Map map, final a.C1154a c1154a, SQLiteDatabase sQLiteDatabase) {
        return (th.a) v2(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: yh.o
            {
                m0.this = this;
            }

            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.Q0(m0.this, map, c1154a, (Cursor) obj);
            }
        });
    }

    public /* synthetic */ Object d2(List list, ph.o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j11 = cursor.getLong(0);
            boolean z11 = cursor.getInt(7) != 0;
            i.a k11 = ph.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z11) {
                k11.h(new ph.h(t2(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k11.h(new ph.h(t2(cursor.getString(4)), r2(j11)));
            }
            if (!cursor.isNull(6)) {
                k11.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j11, oVar, k11.d()));
        }
        return null;
    }

    public static /* synthetic */ Object e0(String str, c.b bVar, long j11, SQLiteDatabase sQLiteDatabase) {
        return k2(str, bVar, j11, sQLiteDatabase);
    }

    public static /* synthetic */ Object e2(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j11 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j11));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j11), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public /* synthetic */ Long f2(ph.i iVar, ph.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (M1()) {
            j(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long p12 = p1(sQLiteDatabase, oVar);
        int e11 = this.f59542d.e();
        byte[] a11 = iVar.e().a();
        boolean z11 = a11.length <= e11;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(p12));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put(PaymentMethodOptionsParams.Blik.PARAM_CODE, iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z11));
        contentValues.put(StatusResponse.PAYLOAD, z11 ? a11 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z11) {
            int ceil = (int) Math.ceil(a11.length / e11);
            for (int i11 = 1; i11 <= ceil; i11++) {
                byte[] copyOfRange = Arrays.copyOfRange(a11, (i11 - 1) * e11, Math.min(i11 * e11, a11.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i11));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    public static /* synthetic */ byte[] g2(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i11 += blob.length;
        }
        byte[] bArr = new byte[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            byte[] bArr2 = (byte[]) arrayList.get(i13);
            System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
            i12 += bArr2.length;
        }
        return bArr;
    }

    private void h1(final SQLiteDatabase sQLiteDatabase) {
        s2(new d() { // from class: yh.c0
            @Override // yh.m0.d
            public final Object a() {
                return m0.J(sQLiteDatabase);
            }
        }, new b() { // from class: yh.b0
            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.p((Throwable) obj);
            }
        });
    }

    public /* synthetic */ Object h2(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i11 = cursor.getInt(0);
            j(i11, c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public /* synthetic */ Object i2(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        v2(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: yh.i0
            {
                m0.this = this;
            }

            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.R0(m0.this, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean j2(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    public static /* synthetic */ Object k2(String str, c.b bVar, long j11, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) v2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: yh.x
            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.Z0((Cursor) obj);
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j11));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j11 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
        }
        return null;
    }

    public static /* synthetic */ Object l2(long j11, ph.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j11));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(bi.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(bi.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ SQLiteDatabase m(Throwable th2) {
        return S1(th2);
    }

    public /* synthetic */ Object m2(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f59540b.a()).execute();
        return null;
    }

    public static /* synthetic */ Object n0(m0 m0Var, Cursor cursor) {
        return m0Var.O1(cursor);
    }

    private List<k> n2(SQLiteDatabase sQLiteDatabase, final ph.o oVar) {
        final ArrayList arrayList = new ArrayList();
        Long K1 = K1(sQLiteDatabase, oVar);
        if (K1 == null) {
            return arrayList;
        }
        v2(sQLiteDatabase.query("events", new String[]{EXColumns.ID, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", StatusResponse.PAYLOAD, PaymentMethodOptionsParams.Blik.PARAM_CODE, "inline"}, "context_id = ?", new String[]{K1.toString()}, null, null, null, String.valueOf(this.f59542d.d())), new b() { // from class: yh.n
            {
                m0.this = this;
            }

            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.D0(m0.this, arrayList, oVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> o2(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(list.get(i11).c());
            if (i11 < list.size() - 1) {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        v2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: yh.g0
            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.P0(hashMap, (Cursor) obj);
            }
        });
        return hashMap;
    }

    public static /* synthetic */ Object p(Throwable th2) {
        return R1(th2);
    }

    public static /* synthetic */ Boolean p0(m0 m0Var, ph.o oVar, SQLiteDatabase sQLiteDatabase) {
        return m0Var.X1(oVar, sQLiteDatabase);
    }

    private long p1(SQLiteDatabase sQLiteDatabase, ph.o oVar) {
        Long K1 = K1(sQLiteDatabase, oVar);
        if (K1 != null) {
            return K1.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(bi.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private static byte[] p2(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void q2(a.C1154a c1154a, Map<String, List<th.c>> map) {
        for (Map.Entry<String, List<th.c>> entry : map.entrySet()) {
            c1154a.a(th.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private byte[] r2(long j11) {
        return (byte[]) v2(v1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j11)}, null, null, "sequence_num"), new b() { // from class: yh.s
            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.R((Cursor) obj);
            }
        });
    }

    private <T> T s2(d<T> dVar, b<Throwable, T> bVar) {
        long a11 = this.f59541c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e11) {
                if (this.f59541c.a() >= this.f59542d.b() + a11) {
                    return bVar.apply(e11);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public static /* synthetic */ th.f t0(long j11, SQLiteDatabase sQLiteDatabase) {
        return V1(j11, sQLiteDatabase);
    }

    private static nh.b t2(String str) {
        if (str == null) {
            return f59538f;
        }
        return nh.b.b(str);
    }

    public static /* synthetic */ Long u0(Cursor cursor) {
        return T1(cursor);
    }

    private static String u2(Iterable<k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<k> it2 = iterable.iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next().c());
            if (it2.hasNext()) {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    static <T> T v2(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private th.b y1() {
        return th.b.b().b(th.e.c().b(t1()).c(e.f59514a.f()).a()).a();
    }

    private long z1() {
        return v1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    @Override // yh.d
    public Iterable<ph.o> F() {
        return (Iterable) L1(new b() { // from class: yh.z
            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.X0((SQLiteDatabase) obj);
            }
        });
    }

    <T> T L1(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase v12 = v1();
        v12.beginTransaction();
        try {
            T apply = bVar.apply(v12);
            v12.setTransactionSuccessful();
            return apply;
        } finally {
            v12.endTransaction();
        }
    }

    @Override // yh.d
    public long S(ph.o oVar) {
        return ((Long) v2(v1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(bi.a.a(oVar.d()))}), new b() { // from class: yh.u
            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.u0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // yh.d
    public boolean W(final ph.o oVar) {
        return ((Boolean) L1(new b() { // from class: yh.r
            {
                m0.this = this;
            }

            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.p0(m0.this, oVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // yh.c
    public void a() {
        L1(new b() { // from class: yh.j0
            {
                m0.this = this;
            }

            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.F0(m0.this, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f59539a.close();
    }

    @Override // yh.d
    public int e() {
        final long a11 = this.f59540b.a() - this.f59542d.c();
        return ((Integer) L1(new b() { // from class: yh.k0
            {
                m0.this = this;
            }

            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.S0(m0.this, a11, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // zh.a
    public <T> T g(a.InterfaceC1382a<T> interfaceC1382a) {
        SQLiteDatabase v12 = v1();
        h1(v12);
        try {
            T execute = interfaceC1382a.execute();
            v12.setTransactionSuccessful();
            return execute;
        } finally {
            v12.endTransaction();
        }
    }

    @Override // yh.d
    public Iterable<k> g0(final ph.o oVar) {
        return (Iterable) L1(new b() { // from class: yh.q
            {
                m0.this = this;
            }

            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.D(m0.this, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // yh.d
    public void h0(final ph.o oVar, final long j11) {
        L1(new b() { // from class: yh.e0
            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.L(j11, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // yh.c
    public void j(final long j11, final c.b bVar, final String str) {
        L1(new b() { // from class: yh.f0
            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.e0(str, bVar, j11, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // yh.c
    public th.a l() {
        final a.C1154a e11 = th.a.e();
        final HashMap hashMap = new HashMap();
        return (th.a) L1(new b() { // from class: yh.m
            {
                m0.this = this;
            }

            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.C0(m0.this, r2, hashMap, e11, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // yh.d
    public void l0(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + u2(iterable);
            L1(new b() { // from class: yh.l0
                {
                    m0.this = this;
                }

                @Override // yh.m0.b
                public final Object apply(Object obj) {
                    return m0.I0(m0.this, str, r3, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // yh.d
    public k q1(final ph.o oVar, final ph.i iVar) {
        uh.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long longValue = ((Long) L1(new b() { // from class: yh.p
            {
                m0.this = this;
            }

            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.J0(m0.this, iVar, oVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return k.a(longValue, oVar, iVar);
    }

    @Override // yh.d
    public void r(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            v1().compileStatement("DELETE FROM events WHERE _id in " + u2(iterable)).execute();
        }
    }

    long t1() {
        return z1() * D1();
    }

    SQLiteDatabase v1() {
        final t0 t0Var = this.f59539a;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) s2(new d() { // from class: yh.d0
            @Override // yh.m0.d
            public final Object a() {
                return t0Var.getWritableDatabase();
            }
        }, new b() { // from class: yh.a0
            @Override // yh.m0.b
            public final Object apply(Object obj) {
                return m0.m((Throwable) obj);
            }
        });
    }
}