package mq;

/* loaded from: classes2.dex */
abstract class z {

    /* renamed from: a  reason: collision with root package name */
    final int f38895a;

    /* renamed from: b  reason: collision with root package name */
    final int f38896b;

    /* renamed from: c  reason: collision with root package name */
    final String f38897c;

    /* renamed from: d  reason: collision with root package name */
    final String f38898d;

    /* renamed from: e  reason: collision with root package name */
    final String f38899e;

    /* renamed from: f  reason: collision with root package name */
    final long f38900f;

    /* renamed from: g  reason: collision with root package name */
    int f38901g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(int i11, int i12, String str, String str2, String str3, long j11) {
        this.f38895a = i11;
        this.f38896b = i12;
        this.f38897c = str;
        this.f38898d = str2;
        this.f38899e = str3;
        this.f38900f = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        if (this.f38901g == 0) {
            this.f38901g = b0.c(this.f38899e);
        }
        return this.f38901g;
    }
}