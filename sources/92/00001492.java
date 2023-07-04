package com.android.volley.toolbox;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class c implements com.android.volley.f {

    /* renamed from: a  reason: collision with root package name */
    private final b f10321a;

    /* renamed from: b  reason: collision with root package name */
    protected final d f10322b;

    @Deprecated
    public c(i iVar) {
        this(iVar, new d(4096));
    }

    @Override // com.android.volley.f
    public com.android.volley.h a(com.android.volley.i<?> iVar) {
        IOException iOException;
        h hVar;
        byte[] bArr;
        h b11;
        int d11;
        List<com.android.volley.e> c11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                b11 = this.f10321a.b(iVar, g.c(iVar.getCacheEntry()));
                try {
                    d11 = b11.d();
                    c11 = b11.c();
                    break;
                } catch (IOException e11) {
                    bArr = null;
                    hVar = b11;
                    iOException = e11;
                }
            } catch (IOException e12) {
                iOException = e12;
                hVar = null;
                bArr = null;
            }
            n.a(iVar, n.e(iVar, iOException, elapsedRealtime, hVar, bArr));
        }
        if (d11 == 304) {
            return n.b(iVar, SystemClock.elapsedRealtime() - elapsedRealtime, c11);
        }
        InputStream a11 = b11.a();
        byte[] c12 = a11 != null ? n.c(a11, b11.b(), this.f10322b) : new byte[0];
        n.d(SystemClock.elapsedRealtime() - elapsedRealtime, iVar, c12, d11);
        if (d11 >= 200 && d11 <= 299) {
            return new com.android.volley.h(d11, c12, false, SystemClock.elapsedRealtime() - elapsedRealtime, c11);
        }
        throw new IOException();
    }

    @Deprecated
    public c(i iVar, d dVar) {
        this.f10321a = new a(iVar);
        this.f10322b = dVar;
    }

    public c(b bVar) {
        this(bVar, new d(4096));
    }

    public c(b bVar, d dVar) {
        this.f10321a = bVar;
        this.f10322b = dVar;
    }
}