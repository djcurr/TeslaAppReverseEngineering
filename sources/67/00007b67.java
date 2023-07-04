package ja;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33305a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f33306b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f33307c;

    /* renamed from: ja.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0612a extends a {
        C0612a() {
        }

        @Override // ja.a
        public boolean a() {
            return true;
        }

        @Override // ja.a
        public boolean b() {
            return true;
        }

        @Override // ja.a
        public boolean c(com.bumptech.glide.load.a aVar) {
            return aVar == com.bumptech.glide.load.a.REMOTE;
        }

        @Override // ja.a
        public boolean d(boolean z11, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return (aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || aVar == com.bumptech.glide.load.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    class b extends a {
        b() {
        }

        @Override // ja.a
        public boolean a() {
            return false;
        }

        @Override // ja.a
        public boolean b() {
            return false;
        }

        @Override // ja.a
        public boolean c(com.bumptech.glide.load.a aVar) {
            return false;
        }

        @Override // ja.a
        public boolean d(boolean z11, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    class c extends a {
        c() {
        }

        @Override // ja.a
        public boolean a() {
            return true;
        }

        @Override // ja.a
        public boolean b() {
            return false;
        }

        @Override // ja.a
        public boolean c(com.bumptech.glide.load.a aVar) {
            return (aVar == com.bumptech.glide.load.a.DATA_DISK_CACHE || aVar == com.bumptech.glide.load.a.MEMORY_CACHE) ? false : true;
        }

        @Override // ja.a
        public boolean d(boolean z11, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    class d extends a {
        d() {
        }

        @Override // ja.a
        public boolean a() {
            return false;
        }

        @Override // ja.a
        public boolean b() {
            return true;
        }

        @Override // ja.a
        public boolean c(com.bumptech.glide.load.a aVar) {
            return false;
        }

        @Override // ja.a
        public boolean d(boolean z11, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return (aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || aVar == com.bumptech.glide.load.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    class e extends a {
        e() {
        }

        @Override // ja.a
        public boolean a() {
            return true;
        }

        @Override // ja.a
        public boolean b() {
            return true;
        }

        @Override // ja.a
        public boolean c(com.bumptech.glide.load.a aVar) {
            return aVar == com.bumptech.glide.load.a.REMOTE;
        }

        @Override // ja.a
        public boolean d(boolean z11, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return ((z11 && aVar == com.bumptech.glide.load.a.DATA_DISK_CACHE) || aVar == com.bumptech.glide.load.a.LOCAL) && cVar == com.bumptech.glide.load.c.TRANSFORMED;
        }
    }

    static {
        new C0612a();
        f33305a = new b();
        f33306b = new c();
        new d();
        f33307c = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(com.bumptech.glide.load.a aVar);

    public abstract boolean d(boolean z11, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar);
}