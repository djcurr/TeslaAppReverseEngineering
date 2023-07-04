package com.android.volley;

import android.content.Intent;

/* loaded from: classes.dex */
public class AuthFailureError extends VolleyError {

    /* renamed from: b  reason: collision with root package name */
    private Intent f10248b;

    public AuthFailureError() {
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f10248b != null ? "User needs to (re)enter credentials." : super.getMessage();
    }

    public AuthFailureError(h hVar) {
        super(hVar);
    }
}