package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public class y {

    /* renamed from: n  reason: collision with root package name */
    private static final String[] f5885n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b  reason: collision with root package name */
    final String[] f5887b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Set<String>> f5888c;

    /* renamed from: e  reason: collision with root package name */
    final t0 f5890e;

    /* renamed from: h  reason: collision with root package name */
    volatile v4.k f5893h;

    /* renamed from: i  reason: collision with root package name */
    private final b f5894i;

    /* renamed from: k  reason: collision with root package name */
    private z f5896k;

    /* renamed from: d  reason: collision with root package name */
    androidx.room.a f5889d = null;

    /* renamed from: f  reason: collision with root package name */
    AtomicBoolean f5891f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f5892g = false;

    /* renamed from: j  reason: collision with root package name */
    final o.b<c, d> f5895j = new o.b<>();

    /* renamed from: l  reason: collision with root package name */
    private final Object f5897l = new Object();

    /* renamed from: m  reason: collision with root package name */
    Runnable f5898m = new a();

    /* renamed from: a  reason: collision with root package name */
    final HashMap<String, Integer> f5886a = new HashMap<>();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor query = y.this.f5890e.query(new v4.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (query.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(query.getInt(0)));
                } catch (Throwable th2) {
                    query.close();
                    throw th2;
                }
            }
            query.close();
            if (!hashSet.isEmpty()) {
                y.this.f5893h.w();
            }
            return hashSet;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
            if (r0 != null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
            r0.b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
            if (r0 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
            if (r1 == null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
            if (r1.isEmpty() != false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
            r0 = r5.f5899a.f5895j;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
            r2 = r5.f5899a.f5895j.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
            if (r2.hasNext() == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
            r2.next().getValue().a(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00bd, code lost:
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r5 = this;
                androidx.room.y r0 = androidx.room.y.this
                androidx.room.t0 r0 = r0.f5890e
                java.util.concurrent.locks.Lock r0 = r0.getCloseLock()
                r0.lock()
                r1 = 0
                androidx.room.y r2 = androidx.room.y.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                boolean r2 = r2.d()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r2 != 0) goto L21
                r0.unlock()
                androidx.room.y r0 = androidx.room.y.this
                androidx.room.a r0 = r0.f5889d
                if (r0 == 0) goto L20
                r0.b()
            L20:
                return
            L21:
                androidx.room.y r2 = androidx.room.y.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f5891f     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r3 = 1
                r4 = 0
                boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r2 != 0) goto L3a
                r0.unlock()
                androidx.room.y r0 = androidx.room.y.this
                androidx.room.a r0 = r0.f5889d
                if (r0 == 0) goto L39
                r0.b()
            L39:
                return
            L3a:
                androidx.room.y r2 = androidx.room.y.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                androidx.room.t0 r2 = r2.f5890e     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                boolean r2 = r2.inTransaction()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r2 == 0) goto L51
                r0.unlock()
                androidx.room.y r0 = androidx.room.y.this
                androidx.room.a r0 = r0.f5889d
                if (r0 == 0) goto L50
                r0.b()
            L50:
                return
            L51:
                androidx.room.y r2 = androidx.room.y.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                androidx.room.t0 r2 = r2.f5890e     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                v4.h r2 = r2.getOpenHelper()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                v4.g r2 = r2.W0()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r2.Q()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                java.util.Set r1 = r5.a()     // Catch: java.lang.Throwable -> L77
                r2.N()     // Catch: java.lang.Throwable -> L77
                r2.X()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r0.unlock()
                androidx.room.y r0 = androidx.room.y.this
                androidx.room.a r0 = r0.f5889d
                if (r0 == 0) goto L92
            L73:
                r0.b()
                goto L92
            L77:
                r3 = move-exception
                r2.X()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                throw r3     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
            L7c:
                r1 = move-exception
                goto Lc3
            L7e:
                r2 = move-exception
                goto L81
            L80:
                r2 = move-exception
            L81:
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L7c
                r0.unlock()
                androidx.room.y r0 = androidx.room.y.this
                androidx.room.a r0 = r0.f5889d
                if (r0 == 0) goto L92
                goto L73
            L92:
                if (r1 == 0) goto Lc2
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto Lc2
                androidx.room.y r0 = androidx.room.y.this
                o.b<androidx.room.y$c, androidx.room.y$d> r0 = r0.f5895j
                monitor-enter(r0)
                androidx.room.y r2 = androidx.room.y.this     // Catch: java.lang.Throwable -> Lbf
                o.b<androidx.room.y$c, androidx.room.y$d> r2 = r2.f5895j     // Catch: java.lang.Throwable -> Lbf
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lbf
            La7:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lbf
                if (r3 == 0) goto Lbd
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lbf
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Lbf
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Lbf
                androidx.room.y$d r3 = (androidx.room.y.d) r3     // Catch: java.lang.Throwable -> Lbf
                r3.a(r1)     // Catch: java.lang.Throwable -> Lbf
                goto La7
            Lbd:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
                goto Lc2
            Lbf:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
                throw r1
            Lc2:
                return
            Lc3:
                r0.unlock()
                androidx.room.y r0 = androidx.room.y.this
                androidx.room.a r0 = r0.f5889d
                if (r0 == 0) goto Lcf
                r0.b()
            Lcf:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.y.a.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final long[] f5900a;

        /* renamed from: b  reason: collision with root package name */
        final boolean[] f5901b;

        /* renamed from: c  reason: collision with root package name */
        final int[] f5902c;

        /* renamed from: d  reason: collision with root package name */
        boolean f5903d;

        b(int i11) {
            long[] jArr = new long[i11];
            this.f5900a = jArr;
            boolean[] zArr = new boolean[i11];
            this.f5901b = zArr;
            this.f5902c = new int[i11];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            synchronized (this) {
                if (this.f5903d) {
                    int length = this.f5900a.length;
                    for (int i11 = 0; i11 < length; i11++) {
                        int i12 = 1;
                        boolean z11 = this.f5900a[i11] > 0;
                        boolean[] zArr = this.f5901b;
                        if (z11 != zArr[i11]) {
                            int[] iArr = this.f5902c;
                            if (!z11) {
                                i12 = 2;
                            }
                            iArr[i11] = i12;
                        } else {
                            this.f5902c[i11] = 0;
                        }
                        zArr[i11] = z11;
                    }
                    this.f5903d = false;
                    return (int[]) this.f5902c.clone();
                }
                return null;
            }
        }

        boolean b(int... iArr) {
            boolean z11;
            synchronized (this) {
                z11 = false;
                for (int i11 : iArr) {
                    long[] jArr = this.f5900a;
                    long j11 = jArr[i11];
                    jArr[i11] = 1 + j11;
                    if (j11 == 0) {
                        this.f5903d = true;
                        z11 = true;
                    }
                }
            }
            return z11;
        }

        boolean c(int... iArr) {
            boolean z11;
            synchronized (this) {
                z11 = false;
                for (int i11 : iArr) {
                    long[] jArr = this.f5900a;
                    long j11 = jArr[i11];
                    jArr[i11] = j11 - 1;
                    if (j11 == 1) {
                        this.f5903d = true;
                        z11 = true;
                    }
                }
            }
            return z11;
        }

        void d() {
            synchronized (this) {
                Arrays.fill(this.f5901b, false);
                this.f5903d = true;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final String[] f5904a;

        public c(String[] strArr) {
            this.f5904a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final int[] f5905a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f5906b;

        /* renamed from: c  reason: collision with root package name */
        final c f5907c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<String> f5908d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.f5907c = cVar;
            this.f5905a = iArr;
            this.f5906b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.f5908d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f5908d = null;
        }

        void a(Set<Integer> set) {
            int length = this.f5905a.length;
            Set<String> set2 = null;
            for (int i11 = 0; i11 < length; i11++) {
                if (set.contains(Integer.valueOf(this.f5905a[i11]))) {
                    if (length == 1) {
                        set2 = this.f5908d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.f5906b[i11]);
                    }
                }
            }
            if (set2 != null) {
                this.f5907c.b(set2);
            }
        }

        void b(String[] strArr) {
            Set<String> set = null;
            if (this.f5906b.length == 1) {
                int length = strArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    } else if (strArr[i11].equalsIgnoreCase(this.f5906b[0])) {
                        set = this.f5908d;
                        break;
                    } else {
                        i11++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f5906b;
                    int length2 = strArr2.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            String str2 = strArr2[i12];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i12++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f5907c.b(set);
            }
        }
    }

    public y(t0 t0Var, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f5890e = t0Var;
        this.f5894i = new b(strArr.length);
        this.f5888c = map2;
        new w(t0Var);
        int length = strArr.length;
        this.f5887b = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            String str = strArr[i11];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f5886a.put(lowerCase, Integer.valueOf(i11));
            String str2 = map.get(strArr[i11]);
            if (str2 != null) {
                this.f5887b[i11] = str2.toLowerCase(locale);
            } else {
                this.f5887b[i11] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.f5886a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f5886a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb2, String str, String str2) {
        sb2.append("`");
        sb2.append("room_table_modification_trigger_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("`");
    }

    private static void c(v4.g gVar) {
        if (Build.VERSION.SDK_INT >= 16 && gVar.B1()) {
            gVar.Q();
        } else {
            gVar.beginTransaction();
        }
    }

    private String[] j(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f5888c.containsKey(lowerCase)) {
                hashSet.addAll(this.f5888c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void m(v4.g gVar, int i11) {
        String[] strArr;
        gVar.u("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i11 + ", 0)");
        String str = this.f5887b[i11];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f5885n) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            sb2.append("invalidated");
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i11);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            gVar.u(sb2.toString());
        }
    }

    private void o(v4.g gVar, int i11) {
        String[] strArr;
        String str = this.f5887b[i11];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f5885n) {
            sb2.setLength(0);
            sb2.append("DROP TRIGGER IF EXISTS ");
            b(sb2, str, str2);
            gVar.u(sb2.toString());
        }
    }

    public void a(c cVar) {
        d h11;
        String[] j11 = j(cVar.f5904a);
        int[] iArr = new int[j11.length];
        int length = j11.length;
        for (int i11 = 0; i11 < length; i11++) {
            Integer num = this.f5886a.get(j11[i11].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i11] = num.intValue();
            } else {
                throw new IllegalArgumentException("There is no table with name " + j11[i11]);
            }
        }
        d dVar = new d(cVar, iArr, j11);
        synchronized (this.f5895j) {
            h11 = this.f5895j.h(cVar, dVar);
        }
        if (h11 == null && this.f5894i.b(iArr)) {
            p();
        }
    }

    boolean d() {
        if (this.f5890e.isOpen()) {
            if (!this.f5892g) {
                this.f5890e.getOpenHelper().W0();
            }
            if (this.f5892g) {
                return true;
            }
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(v4.g gVar) {
        synchronized (this) {
            if (this.f5892g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            gVar.u("PRAGMA temp_store = MEMORY;");
            gVar.u("PRAGMA recursive_triggers='ON';");
            gVar.u("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            q(gVar);
            this.f5893h = gVar.H0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f5892g = true;
        }
    }

    public void f(String... strArr) {
        synchronized (this.f5895j) {
            Iterator<Map.Entry<c, d>> it2 = this.f5895j.iterator();
            while (it2.hasNext()) {
                Map.Entry<c, d> next = it2.next();
                if (!next.getKey().a()) {
                    next.getValue().b(strArr);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        synchronized (this) {
            this.f5892g = false;
            this.f5894i.d();
        }
    }

    public void h() {
        if (this.f5891f.compareAndSet(false, true)) {
            androidx.room.a aVar = this.f5889d;
            if (aVar != null) {
                aVar.e();
            }
            this.f5890e.getQueryExecutor().execute(this.f5898m);
        }
    }

    public void i(c cVar) {
        d i11;
        synchronized (this.f5895j) {
            i11 = this.f5895j.i(cVar);
        }
        if (i11 == null || !this.f5894i.c(i11.f5905a)) {
            return;
        }
        p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(androidx.room.a aVar) {
        this.f5889d = aVar;
        aVar.h(new Runnable() { // from class: androidx.room.x
            {
                y.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                y.this.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Context context, String str, Intent intent) {
        this.f5896k = new z(context, str, intent, this, this.f5890e.getQueryExecutor());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        z zVar = this.f5896k;
        if (zVar != null) {
            zVar.a();
            this.f5896k = null;
        }
    }

    void p() {
        if (this.f5890e.isOpen()) {
            q(this.f5890e.getOpenHelper().W0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(v4.g gVar) {
        if (gVar.s1()) {
            return;
        }
        try {
            Lock closeLock = this.f5890e.getCloseLock();
            closeLock.lock();
            try {
                synchronized (this.f5897l) {
                    int[] a11 = this.f5894i.a();
                    if (a11 == null) {
                        return;
                    }
                    int length = a11.length;
                    c(gVar);
                    for (int i11 = 0; i11 < length; i11++) {
                        int i12 = a11[i11];
                        if (i12 == 1) {
                            m(gVar, i11);
                        } else if (i12 == 2) {
                            o(gVar, i11);
                        }
                    }
                    gVar.N();
                    gVar.X();
                }
            } finally {
                closeLock.unlock();
            }
        } catch (SQLiteException | IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}