package com.android.volley;

/* loaded from: classes.dex */
public class c implements m {

    /* renamed from: a  reason: collision with root package name */
    private int f10267a;

    /* renamed from: b  reason: collision with root package name */
    private int f10268b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10269c;

    /* renamed from: d  reason: collision with root package name */
    private final float f10270d;

    public c() {
        this(2500, 1, 1.0f);
    }

    @Override // com.android.volley.m
    public int a() {
        return this.f10268b;
    }

    @Override // com.android.volley.m
    public void b(VolleyError volleyError) {
        this.f10268b++;
        int i11 = this.f10267a;
        this.f10267a = i11 + ((int) (i11 * this.f10270d));
        if (!d()) {
            throw volleyError;
        }
    }

    @Override // com.android.volley.m
    public int c() {
        return this.f10267a;
    }

    protected boolean d() {
        return this.f10268b <= this.f10269c;
    }

    public c(int i11, int i12, float f11) {
        this.f10267a = i11;
        this.f10269c = i12;
        this.f10270d = f11;
    }
}