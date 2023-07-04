package com.google.firebase.remoteconfig.internal;

/* loaded from: classes2.dex */
public class p implements mn.g {

    /* renamed from: a  reason: collision with root package name */
    private final String f17161a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17162b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(String str, int i11) {
        this.f17161a = str;
        this.f17162b = i11;
    }

    private String b() {
        return asString().trim();
    }

    private void c() {
        if (this.f17161a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // mn.g
    public long a() {
        if (this.f17162b == 0) {
            return 0L;
        }
        String b11 = b();
        try {
            return Long.valueOf(b11).longValue();
        } catch (NumberFormatException e11) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", b11, "long"), e11);
        }
    }

    @Override // mn.g
    public boolean asBoolean() {
        if (this.f17162b == 0) {
            return false;
        }
        String b11 = b();
        if (l.f17141e.matcher(b11).matches()) {
            return true;
        }
        if (l.f17142f.matcher(b11).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", b11, "boolean"));
    }

    @Override // mn.g
    public double asDouble() {
        if (this.f17162b == 0) {
            return 0.0d;
        }
        String b11 = b();
        try {
            return Double.valueOf(b11).doubleValue();
        } catch (NumberFormatException e11) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", b11, "double"), e11);
        }
    }

    @Override // mn.g
    public String asString() {
        if (this.f17162b == 0) {
            return "";
        }
        c();
        return this.f17161a;
    }

    @Override // mn.g
    public int f() {
        return this.f17162b;
    }
}