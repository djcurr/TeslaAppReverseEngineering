package com.bumptech.glide.load.engine;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class GlideException extends Exception {

    /* renamed from: f  reason: collision with root package name */
    private static final StackTraceElement[] f10533f = new StackTraceElement[0];

    /* renamed from: a  reason: collision with root package name */
    private final List<Throwable> f10534a;

    /* renamed from: b  reason: collision with root package name */
    private ha.b f10535b;

    /* renamed from: c  reason: collision with root package name */
    private com.bumptech.glide.load.a f10536c;

    /* renamed from: d  reason: collision with root package name */
    private Class<?> f10537d;

    /* renamed from: e  reason: collision with root package name */
    private String f10538e;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    private void a(Throwable th2, List<Throwable> list) {
        if (th2 instanceof GlideException) {
            for (Throwable th3 : ((GlideException) th2).e()) {
                a(th3, list);
            }
            return;
        }
        list.add(th2);
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            appendable.append("Cause (").append(String.valueOf(i12)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = list.get(i11);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).h(appendable);
            } else {
                d(th2, appendable);
            }
            i11 = i12;
        }
    }

    private static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.f10534a;
    }

    public List<Throwable> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List<Throwable> f11 = f();
        int size = f11.size();
        int i11 = 0;
        while (i11 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i12 = i11 + 1;
            sb2.append(i12);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), f11.get(i11));
            i11 = i12;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f10538e);
        sb2.append(this.f10537d != null ? ", " + this.f10537d : "");
        sb2.append(this.f10536c != null ? ", " + this.f10536c : "");
        sb2.append(this.f10535b != null ? ", " + this.f10535b : "");
        List<Throwable> f11 = f();
        if (f11.isEmpty()) {
            return sb2.toString();
        }
        if (f11.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(f11.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : f11) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb2.append(th2.getMessage());
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(ha.b bVar, com.bumptech.glide.load.a aVar) {
        j(bVar, aVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(ha.b bVar, com.bumptech.glide.load.a aVar, Class<?> cls) {
        this.f10535b = bVar;
        this.f10536c = aVar;
        this.f10537d = cls;
    }

    public void k(Exception exc) {
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th2) {
        this(str, Collections.singletonList(th2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f10538e = str;
        setStackTrace(f10533f);
        this.f10534a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        private final Appendable f10539a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f10540b = true;

        a(Appendable appendable) {
            this.f10539a = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c11) {
            if (this.f10540b) {
                this.f10540b = false;
                this.f10539a.append("  ");
            }
            this.f10540b = c11 == '\n';
            this.f10539a.append(c11);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence a11 = a(charSequence);
            return append(a11, 0, a11.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i11, int i12) {
            CharSequence a11 = a(charSequence);
            boolean z11 = false;
            if (this.f10540b) {
                this.f10540b = false;
                this.f10539a.append("  ");
            }
            if (a11.length() > 0 && a11.charAt(i12 - 1) == '\n') {
                z11 = true;
            }
            this.f10540b = z11;
            this.f10539a.append(a11, i11, i12);
            return this;
        }
    }
}