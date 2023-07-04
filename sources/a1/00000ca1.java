package bk;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class e {

    /* renamed from: c  reason: collision with root package name */
    private boolean f7735c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7736d;

    /* renamed from: f  reason: collision with root package name */
    private int f7738f;

    /* renamed from: a  reason: collision with root package name */
    private a f7733a = new a();

    /* renamed from: b  reason: collision with root package name */
    private a f7734b = new a();

    /* renamed from: e  reason: collision with root package name */
    private long f7737e = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f7739a;

        /* renamed from: b  reason: collision with root package name */
        private long f7740b;

        /* renamed from: c  reason: collision with root package name */
        private long f7741c;

        /* renamed from: d  reason: collision with root package name */
        private long f7742d;

        /* renamed from: e  reason: collision with root package name */
        private long f7743e;

        /* renamed from: f  reason: collision with root package name */
        private long f7744f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean[] f7745g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        private int f7746h;

        private static int c(long j11) {
            return (int) (j11 % 15);
        }

        public long a() {
            long j11 = this.f7743e;
            if (j11 == 0) {
                return 0L;
            }
            return this.f7744f / j11;
        }

        public long b() {
            return this.f7744f;
        }

        public boolean d() {
            long j11 = this.f7742d;
            if (j11 == 0) {
                return false;
            }
            return this.f7745g[c(j11 - 1)];
        }

        public boolean e() {
            return this.f7742d > 15 && this.f7746h == 0;
        }

        public void f(long j11) {
            long j12 = this.f7742d;
            if (j12 == 0) {
                this.f7739a = j11;
            } else if (j12 == 1) {
                long j13 = j11 - this.f7739a;
                this.f7740b = j13;
                this.f7744f = j13;
                this.f7743e = 1L;
            } else {
                long j14 = j11 - this.f7741c;
                int c11 = c(j12);
                if (Math.abs(j14 - this.f7740b) <= 1000000) {
                    this.f7743e++;
                    this.f7744f += j14;
                    boolean[] zArr = this.f7745g;
                    if (zArr[c11]) {
                        zArr[c11] = false;
                        this.f7746h--;
                    }
                } else {
                    boolean[] zArr2 = this.f7745g;
                    if (!zArr2[c11]) {
                        zArr2[c11] = true;
                        this.f7746h++;
                    }
                }
            }
            this.f7742d++;
            this.f7741c = j11;
        }

        public void g() {
            this.f7742d = 0L;
            this.f7743e = 0L;
            this.f7744f = 0L;
            this.f7746h = 0;
            Arrays.fill(this.f7745g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f7733a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f7733a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f7738f;
    }

    public long d() {
        if (e()) {
            return this.f7733a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f7733a.e();
    }

    public void f(long j11) {
        this.f7733a.f(j11);
        if (this.f7733a.e() && !this.f7736d) {
            this.f7735c = false;
        } else if (this.f7737e != -9223372036854775807L) {
            if (!this.f7735c || this.f7734b.d()) {
                this.f7734b.g();
                this.f7734b.f(this.f7737e);
            }
            this.f7735c = true;
            this.f7734b.f(j11);
        }
        if (this.f7735c && this.f7734b.e()) {
            a aVar = this.f7733a;
            this.f7733a = this.f7734b;
            this.f7734b = aVar;
            this.f7735c = false;
            this.f7736d = false;
        }
        this.f7737e = j11;
        this.f7738f = this.f7733a.e() ? 0 : this.f7738f + 1;
    }

    public void g() {
        this.f7733a.g();
        this.f7734b.g();
        this.f7735c = false;
        this.f7737e = -9223372036854775807L;
        this.f7738f = 0;
    }
}