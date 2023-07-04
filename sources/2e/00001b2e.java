package com.google.android.exoplayer2;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ExoPlaybackException extends Exception {

    /* renamed from: a */
    public final int f13021a;

    /* renamed from: b */
    public final String f13022b;

    /* renamed from: c */
    public final int f13023c;

    /* renamed from: d */
    public final ci.i f13024d;

    /* renamed from: e */
    public final int f13025e;

    /* renamed from: f */
    public final long f13026f;

    /* renamed from: g */
    public final fj.i f13027g;

    /* renamed from: h */
    final boolean f13028h;

    /* renamed from: i */
    private final Throwable f13029i;

    private ExoPlaybackException(int i11, Throwable th2) {
        this(i11, th2, null, null, -1, null, 4, false);
    }

    public static ExoPlaybackException b(Exception exc) {
        return new ExoPlaybackException(1, exc, null, null, -1, null, 4, false);
    }

    public static ExoPlaybackException c(Throwable th2, String str, int i11, ci.i iVar, int i12, boolean z11) {
        if (iVar == null) {
            i12 = 4;
        }
        return new ExoPlaybackException(1, th2, null, str, i11, iVar, i12, z11);
    }

    public static ExoPlaybackException d(IOException iOException) {
        return new ExoPlaybackException(0, iOException);
    }

    public static ExoPlaybackException e(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, runtimeException);
    }

    private static String f(int i11, String str, String str2, int i12, ci.i iVar, int i13) {
        String str3;
        if (i11 == 0) {
            str3 = "Source error";
        } else if (i11 != 1) {
            str3 = i11 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            String valueOf = String.valueOf(iVar);
            String b11 = ci.b.b(i13);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 53 + valueOf.length() + String.valueOf(b11).length());
            sb2.append(str2);
            sb2.append(" error, index=");
            sb2.append(i12);
            sb2.append(", format=");
            sb2.append(valueOf);
            sb2.append(", format_supported=");
            sb2.append(b11);
            str3 = sb2.toString();
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        String valueOf2 = String.valueOf(str3);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 2 + String.valueOf(str).length());
        sb3.append(valueOf2);
        sb3.append(": ");
        sb3.append(str);
        return sb3.toString();
    }

    public ExoPlaybackException a(fj.i iVar) {
        return new ExoPlaybackException(getMessage(), this.f13029i, this.f13021a, this.f13022b, this.f13023c, this.f13024d, this.f13025e, iVar, this.f13026f, this.f13028h);
    }

    public Exception g() {
        ak.a.f(this.f13021a == 1);
        return (Exception) ak.a.e(this.f13029i);
    }

    public IOException h() {
        ak.a.f(this.f13021a == 0);
        return (IOException) ak.a.e(this.f13029i);
    }

    private ExoPlaybackException(int i11, Throwable th2, String str, String str2, int i12, ci.i iVar, int i13, boolean z11) {
        this(f(i11, str, str2, i12, iVar, i13), th2, i11, str2, i12, iVar, i13, null, SystemClock.elapsedRealtime(), z11);
    }

    private ExoPlaybackException(String str, Throwable th2, int i11, String str2, int i12, ci.i iVar, int i13, fj.i iVar2, long j11, boolean z11) {
        super(str, th2);
        this.f13021a = i11;
        this.f13029i = th2;
        this.f13022b = str2;
        this.f13023c = i12;
        this.f13024d = iVar;
        this.f13025e = i13;
        this.f13027g = iVar2;
        this.f13026f = j11;
        this.f13028h = z11;
    }
}