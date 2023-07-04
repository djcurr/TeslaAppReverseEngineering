package x8;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public final String f57340d;

    public c(String str) {
        this.f57340d = str;
    }

    @Override // x8.b
    public void a() {
        this.f57337a = (byte) 1;
        byte[] bytes = this.f57340d.getBytes("UTF-8");
        this.f57339c = bytes;
        this.f57338b = (byte) bytes.length;
    }
}