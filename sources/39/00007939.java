package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public final class b4 implements d0 {
    private String e(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // io.sentry.d0
    public void a(f3 f3Var, Throwable th2, String str, Object... objArr) {
        if (th2 == null) {
            c(f3Var, str, objArr);
        } else {
            System.out.println(String.format("%s: %s \n %s\n%s", f3Var, String.format(str, objArr), th2.toString(), e(th2)));
        }
    }

    @Override // io.sentry.d0
    public void b(f3 f3Var, String str, Throwable th2) {
        if (th2 == null) {
            c(f3Var, str, new Object[0]);
        } else {
            System.out.println(String.format("%s: %s\n%s", f3Var, String.format(str, th2.toString()), e(th2)));
        }
    }

    @Override // io.sentry.d0
    public void c(f3 f3Var, String str, Object... objArr) {
        System.out.println(String.format("%s: %s", f3Var, String.format(str, objArr)));
    }

    @Override // io.sentry.d0
    public boolean d(f3 f3Var) {
        return true;
    }
}