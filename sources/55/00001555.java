package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f10734a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f10735b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface Reader {

        /* loaded from: classes.dex */
        public static final class EndOfFileException extends IOException {
            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(byte[] bArr, int i11);

        short c();

        long skip(long j11);
    }

    /* loaded from: classes.dex */
    private static final class a implements Reader {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f10736a;

        a(ByteBuffer byteBuffer) {
            this.f10736a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i11) {
            int min = Math.min(i11, this.f10736a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f10736a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() {
            if (this.f10736a.remaining() >= 1) {
                return (short) (this.f10736a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j11) {
            int min = (int) Math.min(this.f10736a.remaining(), j11);
            ByteBuffer byteBuffer = this.f10736a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f10737a;

        b(byte[] bArr, int i11) {
            this.f10737a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i11);
        }

        private boolean c(int i11, int i12) {
            return this.f10737a.remaining() - i11 >= i12;
        }

        short a(int i11) {
            if (c(i11, 2)) {
                return this.f10737a.getShort(i11);
            }
            return (short) -1;
        }

        int b(int i11) {
            if (c(i11, 4)) {
                return this.f10737a.getInt(i11);
            }
            return -1;
        }

        int d() {
            return this.f10737a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.f10737a.order(byteOrder);
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements Reader {

        /* renamed from: a  reason: collision with root package name */
        private final InputStream f10738a;

        c(InputStream inputStream) {
            this.f10738a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i11) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11 && (i13 = this.f10738a.read(bArr, i12, i11 - i12)) != -1) {
                i12 += i13;
            }
            if (i12 == 0 && i13 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i12;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() {
            int read = this.f10738a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j11) {
            if (j11 < 0) {
                return 0L;
            }
            long j12 = j11;
            while (j12 > 0) {
                long skip = this.f10738a.skip(j12);
                if (skip <= 0) {
                    if (this.f10738a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j12 -= skip;
            }
            return j11 - j12;
        }
    }

    private static int d(int i11, int i12) {
        return i11 + 2 + (i12 * 12);
    }

    private int e(Reader reader, ka.b bVar) {
        try {
            int a11 = reader.a();
            if (!g(a11)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a11);
                }
                return -1;
            }
            int i11 = i(reader);
            if (i11 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.f(i11, byte[].class);
            int k11 = k(reader, bArr, i11);
            bVar.e(bArr);
            return k11;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    private ImageHeaderParser.ImageType f(Reader reader) {
        try {
            int a11 = reader.a();
            if (a11 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int c11 = (a11 << 8) | reader.c();
            if (c11 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int c12 = (c11 << 8) | reader.c();
            if (c12 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (c12 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                reader.skip(4L);
                if (((reader.a() << 16) | reader.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int a12 = (reader.a() << 16) | reader.a();
                if ((a12 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i11 = a12 & 255;
                if (i11 == 88) {
                    reader.skip(4L);
                    return (reader.c() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else if (i11 == 76) {
                    reader.skip(4L);
                    return (reader.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean g(int i11) {
        return (i11 & 65496) == 65496 || i11 == 19789 || i11 == 18761;
    }

    private boolean h(byte[] bArr, int i11) {
        boolean z11 = bArr != null && i11 > f10734a.length;
        if (z11) {
            int i12 = 0;
            while (true) {
                byte[] bArr2 = f10734a;
                if (i12 >= bArr2.length) {
                    break;
                } else if (bArr[i12] != bArr2[i12]) {
                    return false;
                } else {
                    i12++;
                }
            }
        }
        return z11;
    }

    private int i(Reader reader) {
        short c11;
        short c12;
        int a11;
        long j11;
        long skip;
        do {
            if (reader.c() != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) c11));
                }
                return -1;
            }
            c12 = reader.c();
            if (c12 == 218) {
                return -1;
            }
            if (c12 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a11 = reader.a() - 2;
            if (c12 == 225) {
                return a11;
            }
            j11 = a11;
            skip = reader.skip(j11);
        } while (skip == j11);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) c12) + ", wanted to skip: " + a11 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    private static int j(b bVar) {
        ByteOrder byteOrder;
        short a11 = bVar.a(6);
        if (a11 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a11 != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a11));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.e(byteOrder);
        int b11 = bVar.b(10) + 6;
        short a12 = bVar.a(b11);
        for (int i11 = 0; i11 < a12; i11++) {
            int d11 = d(b11, i11);
            short a13 = bVar.a(d11);
            if (a13 == 274) {
                short a14 = bVar.a(d11 + 2);
                if (a14 >= 1 && a14 <= 12) {
                    int b12 = bVar.b(d11 + 4);
                    if (b12 < 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i11 + " tagType=" + ((int) a13) + " formatCode=" + ((int) a14) + " componentCount=" + b12);
                        }
                        int i12 = b12 + f10735b[a14];
                        if (i12 > 4) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) a14));
                            }
                        } else {
                            int i13 = d11 + 8;
                            if (i13 >= 0 && i13 <= bVar.d()) {
                                if (i12 >= 0 && i12 + i13 <= bVar.d()) {
                                    return bVar.a(i13);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) a13));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i13 + " tagType=" + ((int) a13));
                            }
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) a14));
                }
            }
        }
        return -1;
    }

    private int k(Reader reader, byte[] bArr, int i11) {
        int b11 = reader.b(bArr, i11);
        if (b11 != i11) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i11 + ", actually read: " + b11);
            }
            return -1;
        } else if (h(bArr, i11)) {
            return j(new b(bArr, i11));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return f(new a((ByteBuffer) bb.j.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(InputStream inputStream) {
        return f(new c((InputStream) bb.j.d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(InputStream inputStream, ka.b bVar) {
        return e(new c((InputStream) bb.j.d(inputStream)), (ka.b) bb.j.d(bVar));
    }
}