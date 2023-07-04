package com.auth0.android.jwt;

import com.google.gson.k;

/* loaded from: classes.dex */
class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final k f10356a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(k kVar) {
        this.f10356a = kVar;
    }

    @Override // com.auth0.android.jwt.a, ba.a
    public String asString() {
        if (this.f10356a.k()) {
            return this.f10356a.f();
        }
        return null;
    }
}