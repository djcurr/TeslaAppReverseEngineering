package com.android.volley.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f10343a;

    /* renamed from: b  reason: collision with root package name */
    private final List<com.android.volley.e> f10344b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10345c;

    /* renamed from: d  reason: collision with root package name */
    private final InputStream f10346d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f10347e;

    public h(int i11, List<com.android.volley.e> list) {
        this(i11, list, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.f10346d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f10347e != null) {
            return new ByteArrayInputStream(this.f10347e);
        }
        return null;
    }

    public final int b() {
        return this.f10345c;
    }

    public final List<com.android.volley.e> c() {
        return Collections.unmodifiableList(this.f10344b);
    }

    public final int d() {
        return this.f10343a;
    }

    public h(int i11, List<com.android.volley.e> list, int i12, InputStream inputStream) {
        this.f10343a = i11;
        this.f10344b = list;
        this.f10345c = i12;
        this.f10346d = inputStream;
        this.f10347e = null;
    }
}