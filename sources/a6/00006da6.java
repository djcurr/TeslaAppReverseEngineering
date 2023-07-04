package f70;

import f70.o;

/* loaded from: classes5.dex */
final class j extends o {

    /* renamed from: e  reason: collision with root package name */
    private final int f25960e;

    /* renamed from: f  reason: collision with root package name */
    private final int f25961f;

    /* renamed from: g  reason: collision with root package name */
    private final int f25962g;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class b extends o.a<b> {

        /* renamed from: e  reason: collision with root package name */
        private int f25963e;

        /* renamed from: f  reason: collision with root package name */
        private int f25964f;

        /* renamed from: g  reason: collision with root package name */
        private int f25965g;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(0);
            this.f25963e = 0;
            this.f25964f = 0;
            this.f25965g = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o l() {
            return new j(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // f70.o.a
        /* renamed from: m */
        public b e() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i11) {
            this.f25964f = i11;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b o(int i11) {
            this.f25965g = i11;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b p(int i11) {
            this.f25963e = i11;
            return this;
        }
    }

    private j(b bVar) {
        super(bVar);
        this.f25960e = bVar.f25963e;
        this.f25961f = bVar.f25964f;
        this.f25962g = bVar.f25965g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f70.o
    public byte[] d() {
        byte[] d11 = super.d();
        r70.i.f(this.f25960e, d11, 16);
        r70.i.f(this.f25961f, d11, 20);
        r70.i.f(this.f25962g, d11, 24);
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return this.f25961f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.f25962g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int g() {
        return this.f25960e;
    }
}