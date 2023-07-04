package androidx.room;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements v4.h, q {

    /* renamed from: a */
    private final v4.h f5767a;

    /* renamed from: b */
    private final a f5768b;

    /* renamed from: c */
    private final androidx.room.a f5769c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements v4.g {

        /* renamed from: a */
        private final androidx.room.a f5770a;

        a(androidx.room.a aVar) {
            this.f5770a = aVar;
        }

        public static /* synthetic */ Boolean C(v4.g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                return Boolean.valueOf(gVar.B1());
            }
            return Boolean.FALSE;
        }

        public static /* synthetic */ Object D(v4.g gVar) {
            return null;
        }

        public static /* synthetic */ Object a(String str, Object[] objArr, v4.g gVar) {
            return p(str, objArr, gVar);
        }

        public static /* synthetic */ Object g(String str, v4.g gVar) {
            return m(str, gVar);
        }

        public static /* synthetic */ Boolean j(v4.g gVar) {
            return C(gVar);
        }

        public static /* synthetic */ Object l(v4.g gVar) {
            return D(gVar);
        }

        public static /* synthetic */ Object m(String str, v4.g gVar) {
            gVar.u(str);
            return null;
        }

        public static /* synthetic */ Object p(String str, Object[] objArr, v4.g gVar) {
            gVar.P(str, objArr);
            return null;
        }

        @Override // v4.g
        public boolean B1() {
            return ((Boolean) this.f5770a.c(new p.a() { // from class: androidx.room.d
                @Override // p.a
                public final Object apply(Object obj) {
                    return i.a.j((v4.g) obj);
                }
            })).booleanValue();
        }

        @Override // v4.g
        public v4.k H0(String str) {
            return new b(str, this.f5770a);
        }

        void J() {
            this.f5770a.c(new p.a() { // from class: androidx.room.e
                @Override // p.a
                public final Object apply(Object obj) {
                    return i.a.l((v4.g) obj);
                }
            });
        }

        @Override // v4.g
        public void N() {
            v4.g d11 = this.f5770a.d();
            if (d11 != null) {
                d11.N();
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
        }

        @Override // v4.g
        public void P(final String str, final Object[] objArr) {
            this.f5770a.c(new p.a() { // from class: androidx.room.c
                @Override // p.a
                public final Object apply(Object obj) {
                    return i.a.a(str, objArr, (v4.g) obj);
                }
            });
        }

        @Override // v4.g
        public void Q() {
            try {
                this.f5770a.e().Q();
            } catch (Throwable th2) {
                this.f5770a.b();
                throw th2;
            }
        }

        @Override // v4.g
        public void X() {
            if (this.f5770a.d() != null) {
                try {
                    this.f5770a.d().X();
                    return;
                } finally {
                    this.f5770a.b();
                }
            }
            throw new IllegalStateException("End transaction called but delegateDb is null");
        }

        @Override // v4.g
        public Cursor a1(String str) {
            try {
                return new c(this.f5770a.e().a1(str), this.f5770a);
            } catch (Throwable th2) {
                this.f5770a.b();
                throw th2;
            }
        }

        @Override // v4.g
        public void beginTransaction() {
            try {
                this.f5770a.e().beginTransaction();
            } catch (Throwable th2) {
                this.f5770a.b();
                throw th2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f5770a.a();
        }

        @Override // v4.g
        public Cursor d0(v4.j jVar) {
            try {
                return new c(this.f5770a.e().d0(jVar), this.f5770a);
            } catch (Throwable th2) {
                this.f5770a.b();
                throw th2;
            }
        }

        @Override // v4.g
        public Cursor e1(v4.j jVar, CancellationSignal cancellationSignal) {
            try {
                return new c(this.f5770a.e().e1(jVar, cancellationSignal), this.f5770a);
            } catch (Throwable th2) {
                this.f5770a.b();
                throw th2;
            }
        }

        @Override // v4.g
        public String getPath() {
            return (String) this.f5770a.c(new p.a() { // from class: androidx.room.g
                @Override // p.a
                public final Object apply(Object obj) {
                    return ((v4.g) obj).getPath();
                }
            });
        }

        @Override // v4.g
        public boolean isOpen() {
            v4.g d11 = this.f5770a.d();
            if (d11 == null) {
                return false;
            }
            return d11.isOpen();
        }

        @Override // v4.g
        public List<Pair<String, String>> s() {
            return (List) this.f5770a.c(new p.a() { // from class: androidx.room.f
                @Override // p.a
                public final Object apply(Object obj) {
                    return ((v4.g) obj).s();
                }
            });
        }

        @Override // v4.g
        public boolean s1() {
            if (this.f5770a.d() == null) {
                return false;
            }
            return ((Boolean) this.f5770a.c(new p.a() { // from class: androidx.room.h
                @Override // p.a
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((v4.g) obj).s1());
                }
            })).booleanValue();
        }

        @Override // v4.g
        public void u(final String str) {
            this.f5770a.c(new p.a() { // from class: androidx.room.b
                @Override // p.a
                public final Object apply(Object obj) {
                    return i.a.g(str, (v4.g) obj);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class b implements v4.k {

        /* renamed from: a */
        private final String f5771a;

        /* renamed from: b */
        private final ArrayList<Object> f5772b = new ArrayList<>();

        /* renamed from: c */
        private final androidx.room.a f5773c;

        b(String str, androidx.room.a aVar) {
            this.f5771a = str;
            this.f5773c = aVar;
        }

        public static /* synthetic */ Object a(b bVar, p.a aVar, v4.g gVar) {
            return bVar.l(aVar, gVar);
        }

        private void g(v4.k kVar) {
            int i11 = 0;
            while (i11 < this.f5772b.size()) {
                int i12 = i11 + 1;
                Object obj = this.f5772b.get(i11);
                if (obj == null) {
                    kVar.o1(i12);
                } else if (obj instanceof Long) {
                    kVar.U0(i12, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.A(i12, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.A0(i12, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.V0(i12, (byte[]) obj);
                }
                i11 = i12;
            }
        }

        private <T> T j(final p.a<v4.k, T> aVar) {
            return (T) this.f5773c.c(new p.a() { // from class: androidx.room.j
                {
                    i.b.this = this;
                }

                @Override // p.a
                public final Object apply(Object obj) {
                    return i.b.a(i.b.this, aVar, (v4.g) obj);
                }
            });
        }

        public /* synthetic */ Object l(p.a aVar, v4.g gVar) {
            v4.k H0 = gVar.H0(this.f5771a);
            g(H0);
            return aVar.apply(H0);
        }

        private void m(int i11, Object obj) {
            int i12 = i11 - 1;
            if (i12 >= this.f5772b.size()) {
                for (int size = this.f5772b.size(); size <= i12; size++) {
                    this.f5772b.add(null);
                }
            }
            this.f5772b.set(i12, obj);
        }

        @Override // v4.i
        public void A(int i11, double d11) {
            m(i11, Double.valueOf(d11));
        }

        @Override // v4.i
        public void A0(int i11, String str) {
            m(i11, str);
        }

        @Override // v4.i
        public void U0(int i11, long j11) {
            m(i11, Long.valueOf(j11));
        }

        @Override // v4.i
        public void V0(int i11, byte[] bArr) {
            m(i11, bArr);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // v4.i
        public void o1(int i11) {
            m(i11, null);
        }

        @Override // v4.k
        public long s0() {
            return ((Long) j(new p.a() { // from class: androidx.room.l
                @Override // p.a
                public final Object apply(Object obj) {
                    return Long.valueOf(((v4.k) obj).s0());
                }
            })).longValue();
        }

        @Override // v4.k
        public int w() {
            return ((Integer) j(new p.a() { // from class: androidx.room.k
                @Override // p.a
                public final Object apply(Object obj) {
                    return Integer.valueOf(((v4.k) obj).w());
                }
            })).intValue();
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements Cursor {

        /* renamed from: a */
        private final Cursor f5774a;

        /* renamed from: b */
        private final androidx.room.a f5775b;

        c(Cursor cursor, androidx.room.a aVar) {
            this.f5774a = cursor;
            this.f5775b = aVar;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f5774a.close();
            this.f5775b.b();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i11, CharArrayBuffer charArrayBuffer) {
            this.f5774a.copyStringToBuffer(i11, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @Deprecated
        public void deactivate() {
            this.f5774a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i11) {
            return this.f5774a.getBlob(i11);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f5774a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f5774a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f5774a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i11) {
            return this.f5774a.getColumnName(i11);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f5774a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f5774a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i11) {
            return this.f5774a.getDouble(i11);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f5774a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i11) {
            return this.f5774a.getFloat(i11);
        }

        @Override // android.database.Cursor
        public int getInt(int i11) {
            return this.f5774a.getInt(i11);
        }

        @Override // android.database.Cursor
        public long getLong(int i11) {
            return this.f5774a.getLong(i11);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return v4.c.a(this.f5774a);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return v4.f.a(this.f5774a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f5774a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i11) {
            return this.f5774a.getShort(i11);
        }

        @Override // android.database.Cursor
        public String getString(int i11) {
            return this.f5774a.getString(i11);
        }

        @Override // android.database.Cursor
        public int getType(int i11) {
            return this.f5774a.getType(i11);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f5774a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f5774a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f5774a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f5774a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f5774a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f5774a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i11) {
            return this.f5774a.isNull(i11);
        }

        @Override // android.database.Cursor
        public boolean move(int i11) {
            return this.f5774a.move(i11);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f5774a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f5774a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f5774a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i11) {
            return this.f5774a.moveToPosition(i11);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f5774a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f5774a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f5774a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @Deprecated
        public boolean requery() {
            return this.f5774a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f5774a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            v4.e.a(this.f5774a, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f5774a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver, List<Uri> list) {
            v4.f.b(this.f5774a, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f5774a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f5774a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public i(v4.h hVar, androidx.room.a aVar) {
        this.f5767a = hVar;
        this.f5769c = aVar;
        aVar.f(hVar);
        this.f5768b = new a(aVar);
    }

    @Override // v4.h
    public v4.g W0() {
        this.f5768b.J();
        return this.f5768b;
    }

    public androidx.room.a a() {
        return this.f5769c;
    }

    @Override // v4.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f5768b.close();
        } catch (IOException e11) {
            u4.e.a(e11);
        }
    }

    @Override // v4.h
    public String getDatabaseName() {
        return this.f5767a.getDatabaseName();
    }

    @Override // androidx.room.q
    public v4.h getDelegate() {
        return this.f5767a;
    }

    @Override // v4.h
    public void setWriteAheadLoggingEnabled(boolean z11) {
        this.f5767a.setWriteAheadLoggingEnabled(z11);
    }
}