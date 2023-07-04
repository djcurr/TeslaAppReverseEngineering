package com.th3rdwave.safeareacontext;

/* loaded from: classes6.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    float f22263a;

    /* renamed from: b  reason: collision with root package name */
    float f22264b;

    /* renamed from: c  reason: collision with root package name */
    float f22265c;

    /* renamed from: d  reason: collision with root package name */
    float f22266d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(float f11, float f12, float f13, float f14) {
        this.f22263a = f11;
        this.f22264b = f12;
        this.f22265c = f13;
        this.f22266d = f14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(a aVar) {
        if (this == aVar) {
            return true;
        }
        return this.f22263a == aVar.f22263a && this.f22264b == aVar.f22264b && this.f22265c == aVar.f22265c && this.f22266d == aVar.f22266d;
    }
}