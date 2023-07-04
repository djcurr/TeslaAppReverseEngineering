package com.android.volley;

/* loaded from: classes.dex */
public class VolleyError extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final h f10249a;

    public VolleyError() {
        this.f10249a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j11) {
    }

    public VolleyError(h hVar) {
        this.f10249a = hVar;
    }

    public VolleyError(Throwable th2) {
        super(th2);
        this.f10249a = null;
    }
}