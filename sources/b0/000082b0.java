package l6;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f36995a;

    /* renamed from: b  reason: collision with root package name */
    private int f36996b;

    /* renamed from: c  reason: collision with root package name */
    private String f36997c;

    public a(int i11) {
        this.f36997c = null;
        this.f36995a = new byte[i11];
        this.f36996b = 0;
    }

    public a(InputStream inputStream) {
        this.f36997c = null;
        this.f36996b = 0;
        this.f36995a = new byte[16384];
        while (true) {
            int read = inputStream.read(this.f36995a, this.f36996b, 16384);
            if (read <= 0) {
                return;
            }
            int i11 = this.f36996b + read;
            this.f36996b = i11;
            if (read != 16384) {
                return;
            }
            e(i11 + 16384);
        }
    }

    public a(byte[] bArr) {
        this.f36997c = null;
        this.f36995a = bArr;
        this.f36996b = bArr.length;
    }

    public a(byte[] bArr, int i11, int i12) {
        this.f36997c = null;
        if (i12 > bArr.length - i11) {
            throw new ArrayIndexOutOfBoundsException("Valid length exceeds the buffer length.");
        }
        byte[] bArr2 = new byte[i12];
        this.f36995a = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        this.f36996b = i12;
    }

    private void e(int i11) {
        byte[] bArr = this.f36995a;
        if (i11 > bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            this.f36995a = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
    }

    public void a(byte b11) {
        e(this.f36996b + 1);
        byte[] bArr = this.f36995a;
        int i11 = this.f36996b;
        this.f36996b = i11 + 1;
        bArr[i11] = b11;
    }

    public void b(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    public void c(byte[] bArr, int i11, int i12) {
        e(this.f36996b + i12);
        System.arraycopy(bArr, i11, this.f36995a, this.f36996b, i12);
        this.f36996b += i12;
    }

    public int d(int i11) {
        if (i11 < this.f36996b) {
            return this.f36995a[i11] & 255;
        }
        throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
    }

    public InputStream f() {
        return new ByteArrayInputStream(this.f36995a, 0, this.f36996b);
    }

    public String g() {
        String str;
        if (this.f36997c == null) {
            int i11 = this.f36996b;
            if (i11 >= 2) {
                byte[] bArr = this.f36995a;
                if (bArr[0] == 0) {
                    if (i11 < 4 || bArr[1] != 0) {
                        str = "UTF-16BE";
                    } else {
                        if ((bArr[2] & 255) == 254 && (bArr[3] & 255) == 255) {
                            str = "UTF-32BE";
                        }
                        this.f36997c = "UTF-32";
                    }
                    this.f36997c = str;
                } else if ((bArr[0] & 255) < 128) {
                    if (bArr[1] == 0) {
                        str = (i11 < 4 || bArr[2] != 0) ? "UTF-16LE" : "UTF-32LE";
                        this.f36997c = str;
                    }
                } else if ((bArr[0] & 255) != 239) {
                    if ((bArr[0] & 255) == 254 || i11 < 4 || bArr[2] != 0) {
                        this.f36997c = "UTF-16";
                    }
                    this.f36997c = "UTF-32";
                }
            }
            this.f36997c = "UTF-8";
        }
        return this.f36997c;
    }

    public int h() {
        return this.f36996b;
    }
}