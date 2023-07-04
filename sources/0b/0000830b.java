package lf;

import java.io.IOException;
import java.io.InputStream;
import md.k;
import md.p;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: g  reason: collision with root package name */
    private boolean f37177g;

    /* renamed from: h  reason: collision with root package name */
    private final pd.a f37178h;

    /* renamed from: c  reason: collision with root package name */
    private int f37173c = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f37172b = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f37174d = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f37176f = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f37175e = 0;

    /* renamed from: a  reason: collision with root package name */
    private int f37171a = 0;

    public e(pd.a aVar) {
        this.f37178h = (pd.a) k.g(aVar);
    }

    private boolean a(InputStream inputStream) {
        int read;
        int i11 = this.f37175e;
        while (this.f37171a != 6 && (read = inputStream.read()) != -1) {
            try {
                int i12 = this.f37173c + 1;
                this.f37173c = i12;
                if (this.f37177g) {
                    this.f37171a = 6;
                    this.f37177g = false;
                    return false;
                }
                int i13 = this.f37171a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 4) {
                                    this.f37171a = 5;
                                } else if (i13 != 5) {
                                    k.i(false);
                                } else {
                                    int i14 = ((this.f37172b << 8) + read) - 2;
                                    ud.c.a(inputStream, i14);
                                    this.f37173c += i14;
                                    this.f37171a = 2;
                                }
                            } else if (read == 255) {
                                this.f37171a = 3;
                            } else if (read == 0) {
                                this.f37171a = 2;
                            } else if (read == 217) {
                                this.f37177g = true;
                                f(i12 - 2);
                                this.f37171a = 2;
                            } else {
                                if (read == 218) {
                                    f(i12 - 2);
                                }
                                if (b(read)) {
                                    this.f37171a = 4;
                                } else {
                                    this.f37171a = 2;
                                }
                            }
                        } else if (read == 255) {
                            this.f37171a = 3;
                        }
                    } else if (read == 216) {
                        this.f37171a = 2;
                    } else {
                        this.f37171a = 6;
                    }
                } else if (read == 255) {
                    this.f37171a = 1;
                } else {
                    this.f37171a = 6;
                }
                this.f37172b = read;
            } catch (IOException e11) {
                p.a(e11);
            }
        }
        return (this.f37171a == 6 || this.f37175e == i11) ? false : true;
    }

    private static boolean b(int i11) {
        if (i11 == 1) {
            return false;
        }
        if (i11 < 208 || i11 > 215) {
            return (i11 == 217 || i11 == 216) ? false : true;
        }
        return false;
    }

    private void f(int i11) {
        int i12 = this.f37174d;
        if (i12 > 0) {
            this.f37176f = i11;
        }
        this.f37174d = i12 + 1;
        this.f37175e = i12;
    }

    public int c() {
        return this.f37176f;
    }

    public int d() {
        return this.f37175e;
    }

    public boolean e() {
        return this.f37177g;
    }

    public boolean g(nf.e eVar) {
        if (this.f37171a != 6 && eVar.p0() > this.f37173c) {
            pd.f fVar = new pd.f(eVar.a0(), this.f37178h.get(16384), this.f37178h);
            try {
                ud.c.a(fVar, this.f37173c);
                return a(fVar);
            } catch (IOException e11) {
                p.a(e11);
                return false;
            } finally {
                md.b.b(fVar);
            }
        }
        return false;
    }
}