package com.google.common.base;

/* loaded from: classes3.dex */
final class a<T> extends r<T> {

    /* renamed from: a  reason: collision with root package name */
    static final a<Object> f15903a = new a<>();

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> r<T> e() {
        return f15903a;
    }

    @Override // com.google.common.base.r
    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.r
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}