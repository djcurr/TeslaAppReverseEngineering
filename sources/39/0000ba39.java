package vp;

import ky.i;

/* loaded from: classes2.dex */
class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f54581a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f54582b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f54583c;

    /* renamed from: d  reason: collision with root package name */
    private int f54584d;

    /* renamed from: vp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC1229a<T> extends i<T> {
        @Override // ky.i
        boolean test(T t11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i11) {
        this.f54581a = i11;
        Object[] objArr = new Object[i11 + 1];
        this.f54582b = objArr;
        this.f54583c = objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(T t11) {
        int i11 = this.f54581a;
        int i12 = this.f54584d;
        if (i12 == i11) {
            Object[] objArr = new Object[i11 + 1];
            this.f54583c[i11] = objArr;
            this.f54583c = objArr;
            i12 = 0;
        }
        this.f54583c[i12] = t11;
        this.f54584d = i12 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(InterfaceC1229a<? super T> interfaceC1229a) {
        int i11;
        int i12 = this.f54581a;
        for (Object[] objArr = this.f54582b; objArr != null; objArr = objArr[i12]) {
            while (i11 < i12) {
                Object obj = objArr[i11];
                i11 = (obj == null || interfaceC1229a.test(obj)) ? 0 : i11 + 1;
            }
        }
    }
}