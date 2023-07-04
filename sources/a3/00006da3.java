package f70;

import f70.o;

/* loaded from: classes5.dex */
final class i extends o {

    /* renamed from: e  reason: collision with root package name */
    private final int f25954e;

    /* renamed from: f  reason: collision with root package name */
    private final int f25955f;

    /* renamed from: g  reason: collision with root package name */
    private final int f25956g;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class b extends o.a<b> {

        /* renamed from: e  reason: collision with root package name */
        private int f25957e;

        /* renamed from: f  reason: collision with root package name */
        private int f25958f;

        /* renamed from: g  reason: collision with root package name */
        private int f25959g;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(1);
            this.f25957e = 0;
            this.f25958f = 0;
            this.f25959g = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o l() {
            return new i(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // f70.o.a
        /* renamed from: m */
        public b e() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i11) {
            this.f25957e = i11;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b o(int i11) {
            this.f25958f = i11;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b p(int i11) {
            this.f25959g = i11;
            return this;
        }
    }

    private i(b bVar) {
        super(bVar);
        this.f25954e = bVar.f25957e;
        this.f25955f = bVar.f25958f;
        this.f25956g = bVar.f25959g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f70.o
    public byte[] d() {
        byte[] d11 = super.d();
        r70.i.f(this.f25954e, d11, 16);
        r70.i.f(this.f25955f, d11, 20);
        r70.i.f(this.f25956g, d11, 24);
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return this.f25954e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.f25955f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int g() {
        return this.f25956g;
    }
}