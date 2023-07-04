package com.facebook.imagepipeline.decoder;

import nf.e;

/* loaded from: classes3.dex */
public class DecodeException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final e f11256a;

    public DecodeException(String str, e eVar) {
        super(str);
        this.f11256a = eVar;
    }

    public e a() {
        return this.f11256a;
    }
}