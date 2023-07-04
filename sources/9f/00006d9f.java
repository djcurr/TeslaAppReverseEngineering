package f70;

import f70.o;

/* loaded from: classes5.dex */
final class g extends o {

    /* renamed from: e  reason: collision with root package name */
    private final int f25947e;

    /* renamed from: f  reason: collision with root package name */
    private final int f25948f;

    /* renamed from: g  reason: collision with root package name */
    private final int f25949g;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class b extends o.a<b> {

        /* renamed from: e  reason: collision with root package name */
        private int f25950e;

        /* renamed from: f  reason: collision with root package name */
        private int f25951f;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(2);
            this.f25950e = 0;
            this.f25951f = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o k() {
            return new g(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // f70.o.a
        /* renamed from: l */
        public b e() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b m(int i11) {
            this.f25950e = i11;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i11) {
            this.f25951f = i11;
            return this;
        }
    }

    private g(b bVar) {
        super(bVar);
        this.f25947e = 0;
        this.f25948f = bVar.f25950e;
        this.f25949g = bVar.f25951f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f70.o
    public byte[] d() {
        byte[] d11 = super.d();
        r70.i.f(this.f25947e, d11, 16);
        r70.i.f(this.f25948f, d11, 20);
        r70.i.f(this.f25949g, d11, 24);
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return this.f25948f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.f25949g;
    }
}