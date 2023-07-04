package j$.time.format;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private j$.time.temporal.k f32928a;

    /* renamed from: b  reason: collision with root package name */
    private DateTimeFormatter f32929b;

    /* renamed from: c  reason: collision with root package name */
    private int f32930c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q(j$.time.temporal.k r10, j$.time.format.DateTimeFormatter r11) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.q.<init>(j$.time.temporal.k, j$.time.format.DateTimeFormatter):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f32930c--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s b() {
        return this.f32929b.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locale c() {
        return this.f32929b.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j$.time.temporal.k d() {
        return this.f32928a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Long e(j$.time.temporal.l lVar) {
        try {
            return Long.valueOf(this.f32928a.e(lVar));
        } catch (j$.time.c e11) {
            if (this.f32930c > 0) {
                return null;
            }
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object f(j$.time.temporal.u uVar) {
        Object d11 = this.f32928a.d(uVar);
        if (d11 == null && this.f32930c == 0) {
            throw new j$.time.c("Unable to extract value: " + this.f32928a.getClass());
        }
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        this.f32930c++;
    }

    public String toString() {
        return this.f32928a.toString();
    }
}