package ta;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public class j implements ha.f<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    private final List<ImageHeaderParser> f51859a;

    /* renamed from: b  reason: collision with root package name */
    private final ha.f<ByteBuffer, c> f51860b;

    /* renamed from: c  reason: collision with root package name */
    private final ka.b f51861c;

    public j(List<ImageHeaderParser> list, ha.f<ByteBuffer, c> fVar, ka.b bVar) {
        this.f51859a = list;
        this.f51860b = fVar;
        this.f51861c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e11) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e11);
                return null;
            }
            return null;
        }
    }

    @Override // ha.f
    /* renamed from: c */
    public ja.c<c> b(InputStream inputStream, int i11, int i12, ha.e eVar) {
        byte[] e11 = e(inputStream);
        if (e11 == null) {
            return null;
        }
        return this.f51860b.b(ByteBuffer.wrap(e11), i11, i12, eVar);
    }

    @Override // ha.f
    /* renamed from: d */
    public boolean a(InputStream inputStream, ha.e eVar) {
        return !((Boolean) eVar.c(i.f51858b)).booleanValue() && com.bumptech.glide.load.d.e(this.f51859a, inputStream, this.f51861c) == ImageHeaderParser.ImageType.GIF;
    }
}