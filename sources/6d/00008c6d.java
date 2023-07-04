package ni;

import java.util.List;

/* loaded from: classes3.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f41673a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f41674b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f41675a;

        /* renamed from: b  reason: collision with root package name */
        public final long f41676b;

        /* renamed from: c  reason: collision with root package name */
        public final long f41677c;

        public a(String str, String str2, long j11, long j12) {
            this.f41675a = str;
            this.f41676b = j11;
            this.f41677c = j12;
        }
    }

    public b(long j11, List<a> list) {
        this.f41673a = j11;
        this.f41674b = list;
    }

    public cj.b a(long j11) {
        long j12;
        if (this.f41674b.size() < 2) {
            return null;
        }
        long j13 = j11;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        long j17 = -1;
        boolean z11 = false;
        for (int size = this.f41674b.size() - 1; size >= 0; size--) {
            a aVar = this.f41674b.get(size);
            boolean equals = "video/mp4".equals(aVar.f41675a) | z11;
            if (size == 0) {
                j12 = j13 - aVar.f41677c;
                j13 = 0;
            } else {
                long j18 = j13;
                j13 -= aVar.f41676b;
                j12 = j18;
            }
            if (!equals || j13 == j12) {
                z11 = equals;
            } else {
                j17 = j12 - j13;
                j16 = j13;
                z11 = false;
            }
            if (size == 0) {
                j14 = j13;
                j15 = j12;
            }
        }
        if (j16 == -1 || j17 == -1 || j14 == -1 || j15 == -1) {
            return null;
        }
        return new cj.b(j14, j15, this.f41673a, j16, j17);
    }
}