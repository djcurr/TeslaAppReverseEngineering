package com.facebook.systrace;

import android.os.Trace;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: com.facebook.systrace.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0241a {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');
        
        private final char mCode;

        EnumC0241a(char c11) {
            this.mCode = c11;
        }

        public char getCode() {
            return this.mCode;
        }
    }

    public static void a(long j11, String str, int i11) {
    }

    public static void b(long j11, String str, int i11, long j12) {
    }

    public static void c(long j11, String str) {
        Trace.beginSection(str);
    }

    public static void d(long j11, String str, int i11) {
    }

    public static void e(long j11, String str, int i11) {
    }

    public static void f(long j11, String str, int i11, long j12) {
    }

    public static void g(long j11) {
        Trace.endSection();
    }

    public static boolean h(long j11) {
        return false;
    }

    public static void i(TraceListener traceListener) {
    }

    public static void j(long j11, String str, int i11) {
    }

    public static void k(long j11, String str, int i11) {
    }

    public static void l(long j11, String str, EnumC0241a enumC0241a) {
    }

    public static void m(TraceListener traceListener) {
    }
}