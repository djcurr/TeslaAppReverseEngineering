package gq;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    protected Field f28056a;

    /* renamed from: b  reason: collision with root package name */
    protected Method f28057b;

    /* renamed from: c  reason: collision with root package name */
    protected Method f28058c;

    /* renamed from: d  reason: collision with root package name */
    protected int f28059d;

    /* renamed from: e  reason: collision with root package name */
    protected Class<?> f28060e;

    /* renamed from: f  reason: collision with root package name */
    protected String f28061f;

    public b(Class<?> cls, Field field, j jVar) {
        String c11;
        this.f28061f = field.getName();
        int modifiers = field.getModifiers();
        if ((modifiers & 136) > 0) {
            return;
        }
        if ((modifiers & 1) > 0) {
            this.f28056a = field;
        }
        try {
            this.f28057b = cls.getDeclaredMethod(a.e(field.getName()), field.getType());
        } catch (Exception unused) {
        }
        boolean equals = field.getType().equals(Boolean.TYPE);
        if (equals) {
            c11 = a.d(field.getName());
        } else {
            c11 = a.c(field.getName());
        }
        try {
            this.f28058c = cls.getDeclaredMethod(c11, new Class[0]);
        } catch (Exception unused2) {
        }
        if (this.f28058c == null && equals) {
            try {
                this.f28058c = cls.getDeclaredMethod(a.c(field.getName()), new Class[0]);
            } catch (Exception unused3) {
            }
        }
        if (this.f28056a == null && this.f28058c == null && this.f28057b == null) {
            return;
        }
        Method method = this.f28058c;
        if (method != null && !jVar.a(field, method)) {
            this.f28058c = null;
        }
        Method method2 = this.f28057b;
        if (method2 != null && !jVar.a(field, method2)) {
            this.f28057b = null;
        }
        if (this.f28058c == null && this.f28057b == null && this.f28056a == null) {
            return;
        }
        this.f28060e = field.getType();
        field.getGenericType();
    }

    public int a() {
        return this.f28059d;
    }

    public String b() {
        return this.f28061f;
    }

    public Class<?> c() {
        return this.f28060e;
    }

    public boolean d() {
        return this.f28060e.isEnum();
    }

    public boolean e() {
        return this.f28057b == null && this.f28058c == null;
    }

    public boolean f() {
        return (this.f28056a == null && this.f28058c == null) ? false : true;
    }

    public boolean g() {
        return (this.f28056a == null && this.f28058c == null && this.f28057b == null) ? false : true;
    }

    public boolean h() {
        return (this.f28056a == null && this.f28058c == null) ? false : true;
    }
}