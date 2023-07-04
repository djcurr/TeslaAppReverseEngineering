package cy;

import android.util.Log;

/* loaded from: classes5.dex */
public class c {

    /* loaded from: classes5.dex */
    private static class b implements cy.b {
        private b() {
        }

        private String f(String str, Object... objArr) {
            return objArr.length == 0 ? str : String.format(str, objArr);
        }

        private String g() {
            return new Exception().getStackTrace()[3].getMethodName();
        }

        @Override // cy.b
        public void a(String str, Object... objArr) {
            Log.i(g(), f(str, objArr));
        }

        @Override // cy.b
        public void b(String str, Object... objArr) {
            Log.d(g(), f(str, objArr));
        }

        @Override // cy.b
        public void c(String str, Object... objArr) {
            Log.e(g(), f(str, objArr));
        }

        @Override // cy.b
        public void d(String str, Object... objArr) {
            Log.w(g(), f(str, objArr));
        }

        @Override // cy.b
        public void e(Throwable th2, String str, Object... objArr) {
            Log.e(g(), f(str, objArr), th2);
        }
    }

    /* renamed from: cy.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static class C0442c implements cy.b {
        private C0442c() {
        }

        @Override // cy.b
        public void a(String str, Object... objArr) {
        }

        @Override // cy.b
        public void b(String str, Object... objArr) {
        }

        @Override // cy.b
        public void c(String str, Object... objArr) {
        }

        @Override // cy.b
        public void d(String str, Object... objArr) {
        }

        @Override // cy.b
        public void e(Throwable th2, String str, Object... objArr) {
        }
    }

    public static cy.b a(boolean z11) {
        return z11 ? new b() : new C0442c();
    }
}