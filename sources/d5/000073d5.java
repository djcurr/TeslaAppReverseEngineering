package hx;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class d implements c {

    /* loaded from: classes5.dex */
    private static class a extends b {

        /* renamed from: g  reason: collision with root package name */
        private final Logger f29478g;

        a(Logger logger) {
            this.f29478g = logger;
        }

        @Override // hx.b
        public void e(String str) {
            this.f29478g.log(Level.SEVERE, str);
        }

        @Override // hx.b
        public void f(String str, Throwable th2) {
            this.f29478g.log(Level.SEVERE, str, th2);
        }

        @Override // hx.b
        public void l(String str) {
            this.f29478g.log(Level.INFO, str);
        }

        @Override // hx.b
        public void m(String str, Throwable th2) {
            this.f29478g.log(Level.INFO, str, th2);
        }

        @Override // hx.b
        public boolean o() {
            return this.f29478g.isLoggable(Level.INFO);
        }

        @Override // hx.b
        public void u(String str) {
            this.f29478g.log(Level.WARNING, str);
        }

        @Override // hx.b
        public void v(String str, Throwable th2) {
            this.f29478g.log(Level.WARNING, str, th2);
        }
    }

    @Override // hx.c
    public b getLogger(String str) {
        return new a(Logger.getLogger(str));
    }
}