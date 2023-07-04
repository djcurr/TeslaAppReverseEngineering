package tb;

import bc.l;
import com.drew.imaging.png.PngProcessingException;
import java.io.IOException;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private int f51891a;

    /* renamed from: b  reason: collision with root package name */
    private int f51892b;

    /* renamed from: c  reason: collision with root package name */
    private byte f51893c;

    /* renamed from: d  reason: collision with root package name */
    private com.drew.imaging.png.a f51894d;

    /* renamed from: e  reason: collision with root package name */
    private byte f51895e;

    /* renamed from: f  reason: collision with root package name */
    private byte f51896f;

    /* renamed from: g  reason: collision with root package name */
    private byte f51897g;

    public e(byte[] bArr) {
        if (bArr.length == 13) {
            l lVar = new l(bArr);
            try {
                this.f51891a = lVar.f();
                this.f51892b = lVar.f();
                this.f51893c = lVar.h();
                byte h11 = lVar.h();
                com.drew.imaging.png.a fromNumericValue = com.drew.imaging.png.a.fromNumericValue(h11);
                if (fromNumericValue != null) {
                    this.f51894d = fromNumericValue;
                    this.f51895e = lVar.h();
                    this.f51896f = lVar.h();
                    this.f51897g = lVar.h();
                    return;
                }
                throw new PngProcessingException("Unexpected PNG color type: " + ((int) h11));
            } catch (IOException e11) {
                throw new PngProcessingException(e11);
            }
        }
        throw new PngProcessingException("PNG header chunk must have 13 data bytes");
    }

    public byte a() {
        return this.f51893c;
    }

    public com.drew.imaging.png.a b() {
        return this.f51894d;
    }

    public byte c() {
        return this.f51895e;
    }

    public byte d() {
        return this.f51896f;
    }

    public int e() {
        return this.f51892b;
    }

    public int f() {
        return this.f51891a;
    }

    public byte g() {
        return this.f51897g;
    }
}