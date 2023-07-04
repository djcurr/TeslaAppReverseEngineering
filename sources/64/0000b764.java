package u50;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final int f53269a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53270b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53271c;

    /* renamed from: d  reason: collision with root package name */
    private final int f53272d;

    /* renamed from: e  reason: collision with root package name */
    private final SecureRandom f53273e;

    public q(int i11, int i12, int i13, SecureRandom secureRandom) {
        this(i11, i12, i13, secureRandom, -1);
    }

    public q(int i11, int i12, int i13, SecureRandom secureRandom, int i14) {
        this.f53269a = i11;
        this.f53270b = i12;
        this.f53272d = i13;
        this.f53271c = i14;
        this.f53273e = secureRandom;
    }

    public int a() {
        return this.f53272d;
    }

    public int b() {
        return this.f53269a;
    }

    public int c() {
        return this.f53270b;
    }

    public SecureRandom d() {
        return this.f53273e;
    }

    public int e() {
        return this.f53271c;
    }
}