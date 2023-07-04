package com.google.firebase.crashlytics.internal.common;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
class f {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicLong f16489a = new AtomicLong(0);

    /* renamed from: b  reason: collision with root package name */
    private static String f16490b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(v vVar) {
        byte[] bArr = new byte[10];
        e(bArr);
        d(bArr);
        c(bArr);
        String B = g.B(vVar.a());
        String v11 = g.v(bArr);
        Locale locale = Locale.US;
        f16490b = String.format(locale, "%s%s%s%s", v11.substring(0, 12), v11.substring(12, 16), v11.subSequence(16, 20), B.substring(0, 12)).toUpperCase(locale);
    }

    private static byte[] a(long j11) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j11);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private static byte[] b(long j11) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j11);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private void c(byte[] bArr) {
        byte[] b11 = b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b11[0];
        bArr[9] = b11[1];
    }

    private void d(byte[] bArr) {
        byte[] b11 = b(f16489a.incrementAndGet());
        bArr[6] = b11[0];
        bArr[7] = b11[1];
    }

    private void e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a11 = a(time / 1000);
        bArr[0] = a11[0];
        bArr[1] = a11[1];
        bArr[2] = a11[2];
        bArr[3] = a11[3];
        byte[] b11 = b(time % 1000);
        bArr[4] = b11[0];
        bArr[5] = b11[1];
    }

    public String toString() {
        return f16490b;
    }
}