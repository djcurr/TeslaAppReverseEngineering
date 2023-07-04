package ri;

import ak.v;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final f f49588a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final v f49589b = new v(new byte[65025], 0);

    /* renamed from: c  reason: collision with root package name */
    private int f49590c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f49591d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f49592e;

    private int a(int i11) {
        int i12;
        int i13 = 0;
        this.f49591d = 0;
        do {
            int i14 = this.f49591d;
            int i15 = i11 + i14;
            f fVar = this.f49588a;
            if (i15 >= fVar.f49596d) {
                break;
            }
            int[] iArr = fVar.f49599g;
            this.f49591d = i14 + 1;
            i12 = iArr[i14 + i11];
            i13 += i12;
        } while (i12 == 255);
        return i13;
    }

    public f b() {
        return this.f49588a;
    }

    public v c() {
        return this.f49589b;
    }

    public boolean d(ji.i iVar) {
        int i11;
        ak.a.f(iVar != null);
        if (this.f49592e) {
            this.f49592e = false;
            this.f49589b.K(0);
        }
        while (!this.f49592e) {
            if (this.f49590c < 0) {
                if (!this.f49588a.d(iVar) || !this.f49588a.b(iVar, true)) {
                    return false;
                }
                f fVar = this.f49588a;
                int i12 = fVar.f49597e;
                if ((fVar.f49594b & 1) == 1 && this.f49589b.f() == 0) {
                    i12 += a(0);
                    i11 = this.f49591d + 0;
                } else {
                    i11 = 0;
                }
                iVar.k(i12);
                this.f49590c = i11;
            }
            int a11 = a(this.f49590c);
            int i13 = this.f49590c + this.f49591d;
            if (a11 > 0) {
                v vVar = this.f49589b;
                vVar.c(vVar.f() + a11);
                iVar.readFully(this.f49589b.d(), this.f49589b.f(), a11);
                v vVar2 = this.f49589b;
                vVar2.N(vVar2.f() + a11);
                this.f49592e = this.f49588a.f49599g[i13 + (-1)] != 255;
            }
            if (i13 == this.f49588a.f49596d) {
                i13 = -1;
            }
            this.f49590c = i13;
        }
        return true;
    }

    public void e() {
        this.f49588a.c();
        this.f49589b.K(0);
        this.f49590c = -1;
        this.f49592e = false;
    }

    public void f() {
        if (this.f49589b.d().length == 65025) {
            return;
        }
        v vVar = this.f49589b;
        vVar.M(Arrays.copyOf(vVar.d(), Math.max(65025, this.f49589b.f())), this.f49589b.f());
    }
}