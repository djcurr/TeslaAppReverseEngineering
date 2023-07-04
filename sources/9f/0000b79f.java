package ua;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class a implements e<Bitmap, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap.CompressFormat f53396a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53397b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // ua.e
    public ja.c<byte[]> a(ja.c<Bitmap> cVar, ha.e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        cVar.get().compress(this.f53396a, this.f53397b, byteArrayOutputStream);
        cVar.recycle();
        return new qa.b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i11) {
        this.f53396a = compressFormat;
        this.f53397b = i11;
    }
}