package androidx.work;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private static q f6696a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final int f6697b = 20;

    /* loaded from: classes.dex */
    public static class a extends q {

        /* renamed from: c  reason: collision with root package name */
        private int f6698c;

        public a(int i11) {
            super(i11);
            this.f6698c = i11;
        }

        @Override // androidx.work.q
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f6698c <= 3) {
                if (thArr != null && thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // androidx.work.q
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f6698c <= 6) {
                if (thArr != null && thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // androidx.work.q
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f6698c <= 4) {
                if (thArr != null && thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // androidx.work.q
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f6698c <= 2) {
                if (thArr != null && thArr.length >= 1) {
                    Log.v(str, str2, thArr[0]);
                } else {
                    Log.v(str, str2);
                }
            }
        }

        @Override // androidx.work.q
        public void h(String str, String str2, Throwable... thArr) {
            if (this.f6698c <= 5) {
                if (thArr != null && thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public q(int i11) {
    }

    public static synchronized q c() {
        q qVar;
        synchronized (q.class) {
            if (f6696a == null) {
                f6696a = new a(3);
            }
            qVar = f6696a;
        }
        return qVar;
    }

    public static synchronized void e(q qVar) {
        synchronized (q.class) {
            f6696a = qVar;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i11 = f6697b;
        if (length >= i11) {
            sb2.append(str.substring(0, i11));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}