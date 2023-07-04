package com.google.common.base;

/* loaded from: classes3.dex */
final class w<T> extends r<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f15938a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(T t11) {
        this.f15938a = t11;
    }

    @Override // com.google.common.base.r
    public T b() {
        return this.f15938a;
    }

    @Override // com.google.common.base.r
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f15938a.equals(((w) obj).f15938a);
        }
        return false;
    }

    public int hashCode() {
        return this.f15938a.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f15938a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}