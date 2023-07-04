package ei;

import ak.k0;
import android.media.AudioAttributes;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static final d f25128f = new b().a();

    /* renamed from: a  reason: collision with root package name */
    public final int f25129a;

    /* renamed from: b  reason: collision with root package name */
    public final int f25130b;

    /* renamed from: c  reason: collision with root package name */
    public final int f25131c;

    /* renamed from: d  reason: collision with root package name */
    public final int f25132d;

    /* renamed from: e  reason: collision with root package name */
    private AudioAttributes f25133e;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f25134a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f25135b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f25136c = 1;

        /* renamed from: d  reason: collision with root package name */
        private int f25137d = 1;

        public d a() {
            return new d(this.f25134a, this.f25135b, this.f25136c, this.f25137d);
        }
    }

    public AudioAttributes a() {
        if (this.f25133e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f25129a).setFlags(this.f25130b).setUsage(this.f25131c);
            if (k0.f477a >= 29) {
                usage.setAllowedCapturePolicy(this.f25132d);
            }
            this.f25133e = usage.build();
        }
        return this.f25133e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f25129a == dVar.f25129a && this.f25130b == dVar.f25130b && this.f25131c == dVar.f25131c && this.f25132d == dVar.f25132d;
    }

    public int hashCode() {
        return ((((((527 + this.f25129a) * 31) + this.f25130b) * 31) + this.f25131c) * 31) + this.f25132d;
    }

    private d(int i11, int i12, int i13, int i14) {
        this.f25129a = i11;
        this.f25130b = i12;
        this.f25131c = i13;
        this.f25132d = i14;
    }
}