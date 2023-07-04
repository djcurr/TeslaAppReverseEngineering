package oe;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import oe.a;

/* loaded from: classes3.dex */
public class b<T extends a> implements a {

    /* renamed from: a  reason: collision with root package name */
    private T f42354a;

    public b(T t11) {
        this.f42354a = t11;
    }

    @Override // oe.d
    public int a() {
        T t11 = this.f42354a;
        if (t11 == null) {
            return 0;
        }
        return t11.a();
    }

    @Override // oe.d
    public int b() {
        T t11 = this.f42354a;
        if (t11 == null) {
            return 0;
        }
        return t11.b();
    }

    @Override // oe.a
    public int c() {
        T t11 = this.f42354a;
        if (t11 == null) {
            return -1;
        }
        return t11.c();
    }

    @Override // oe.a
    public void clear() {
        T t11 = this.f42354a;
        if (t11 != null) {
            t11.clear();
        }
    }

    @Override // oe.a
    public void d(Rect rect) {
        T t11 = this.f42354a;
        if (t11 != null) {
            t11.d(rect);
        }
    }

    @Override // oe.a
    public int e() {
        T t11 = this.f42354a;
        if (t11 == null) {
            return -1;
        }
        return t11.e();
    }

    @Override // oe.a
    public void f(ColorFilter colorFilter) {
        T t11 = this.f42354a;
        if (t11 != null) {
            t11.f(colorFilter);
        }
    }

    @Override // oe.a
    public boolean g(Drawable drawable, Canvas canvas, int i11) {
        T t11 = this.f42354a;
        return t11 != null && t11.g(drawable, canvas, i11);
    }

    @Override // oe.d
    public int i(int i11) {
        T t11 = this.f42354a;
        if (t11 == null) {
            return 0;
        }
        return t11.i(i11);
    }

    @Override // oe.a
    public void j(int i11) {
        T t11 = this.f42354a;
        if (t11 != null) {
            t11.j(i11);
        }
    }
}