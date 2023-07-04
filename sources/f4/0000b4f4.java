package tb;

import bc.l;
import com.drew.imaging.png.PngProcessingException;
import java.io.IOException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f51862a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51863b;

    /* renamed from: c  reason: collision with root package name */
    private final int f51864c;

    /* renamed from: d  reason: collision with root package name */
    private final int f51865d;

    /* renamed from: e  reason: collision with root package name */
    private final int f51866e;

    /* renamed from: f  reason: collision with root package name */
    private final int f51867f;

    /* renamed from: g  reason: collision with root package name */
    private final int f51868g;

    /* renamed from: h  reason: collision with root package name */
    private final int f51869h;

    public a(byte[] bArr) {
        if (bArr.length == 32) {
            l lVar = new l(bArr);
            try {
                this.f51862a = lVar.f();
                this.f51863b = lVar.f();
                this.f51864c = lVar.f();
                this.f51865d = lVar.f();
                this.f51866e = lVar.f();
                this.f51867f = lVar.f();
                this.f51868g = lVar.f();
                this.f51869h = lVar.f();
                return;
            } catch (IOException e11) {
                throw new PngProcessingException(e11);
            }
        }
        throw new PngProcessingException("Invalid number of bytes");
    }

    public int a() {
        return this.f51868g;
    }

    public int b() {
        return this.f51869h;
    }

    public int c() {
        return this.f51866e;
    }

    public int d() {
        return this.f51867f;
    }

    public int e() {
        return this.f51864c;
    }

    public int f() {
        return this.f51865d;
    }

    public int g() {
        return this.f51862a;
    }

    public int h() {
        return this.f51863b;
    }
}