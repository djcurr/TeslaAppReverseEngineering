package v4;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public interface h extends Closeable {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f54035a;

        public a(int i11) {
            this.f54035a = i11;
        }

        private void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    v4.b.c(new File(str));
                } else {
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e11) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e11);
                    }
                }
            } catch (Exception e12) {
                Log.w("SupportSQLite", "delete failed: ", e12);
            }
        }

        public void b(g gVar) {
        }

        public void c(g gVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + gVar.getPath());
            if (!gVar.isOpen()) {
                a(gVar.getPath());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = gVar.s();
                } finally {
                    if (list != null) {
                        for (Pair<String, String> next : list) {
                            a((String) next.second);
                        }
                    } else {
                        a(gVar.getPath());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                gVar.close();
            } catch (IOException unused2) {
            }
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i11, int i12);

        public void f(g gVar) {
        }

        public abstract void g(g gVar, int i11, int i12);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f54036a;

        /* renamed from: b  reason: collision with root package name */
        public final String f54037b;

        /* renamed from: c  reason: collision with root package name */
        public final a f54038c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f54039d;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            Context f54040a;

            /* renamed from: b  reason: collision with root package name */
            String f54041b;

            /* renamed from: c  reason: collision with root package name */
            a f54042c;

            /* renamed from: d  reason: collision with root package name */
            boolean f54043d;

            a(Context context) {
                this.f54040a = context;
            }

            public b a() {
                if (this.f54042c != null) {
                    if (this.f54040a != null) {
                        if (this.f54043d && TextUtils.isEmpty(this.f54041b)) {
                            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                        }
                        return new b(this.f54040a, this.f54041b, this.f54042c, this.f54043d);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            public a b(a aVar) {
                this.f54042c = aVar;
                return this;
            }

            public a c(String str) {
                this.f54041b = str;
                return this;
            }

            public a d(boolean z11) {
                this.f54043d = z11;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z11) {
            this.f54036a = context;
            this.f54037b = str;
            this.f54038c = aVar;
            this.f54039d = z11;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        h a(b bVar);
    }

    g W0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z11);
}