package dd;

import cc.e;
import hc.i;
import java.io.IOException;

/* loaded from: classes.dex */
public class c implements xb.a {

    /* renamed from: a  reason: collision with root package name */
    private final e f23915a;

    public c(e eVar) {
        this.f23915a = eVar;
    }

    @Override // xb.a
    public void a(String str, byte[] bArr) {
        b bVar = new b();
        if (str.equals("EXIF")) {
            new i().c(new bc.a(bArr), this.f23915a);
        } else if (str.equals("ICCP")) {
            new lc.c().c(new bc.a(bArr), this.f23915a);
        } else if (str.equals("XMP ")) {
            new ed.c().f(bArr, this.f23915a);
        } else if (str.equals("VP8X") && bArr.length == 10) {
            bc.a aVar = new bc.a(bArr);
            aVar.w(false);
            try {
                boolean a11 = aVar.a(1);
                boolean a12 = aVar.a(4);
                int g11 = aVar.g(4);
                int g12 = aVar.g(7);
                bVar.J(2, g11 + 1);
                bVar.J(1, g12 + 1);
                bVar.B(3, a12);
                bVar.B(4, a11);
                this.f23915a.a(bVar);
            } catch (IOException e11) {
                e11.printStackTrace(System.err);
            }
        } else if (str.equals("VP8L") && bArr.length > 4) {
            bc.a aVar2 = new bc.a(bArr);
            aVar2.w(false);
            try {
                if (aVar2.j(0) != 47) {
                    return;
                }
                short u11 = aVar2.u(1);
                short u12 = aVar2.u(2);
                short u13 = aVar2.u(3);
                bVar.J(2, (u11 | ((u12 & 63) << 8)) + 1);
                bVar.J(1, (((aVar2.u(4) & 15) << 10) | (u13 << 2) | ((u12 & 192) >> 6)) + 1);
                this.f23915a.a(bVar);
            } catch (IOException e12) {
                e12.printStackTrace(System.err);
            }
        } else if (!str.equals("VP8 ") || bArr.length <= 9) {
        } else {
            bc.a aVar3 = new bc.a(bArr);
            aVar3.w(false);
            try {
                if (aVar3.u(3) == 157 && aVar3.u(4) == 1 && aVar3.u(5) == 42) {
                    int s11 = aVar3.s(6);
                    int s12 = aVar3.s(8);
                    bVar.J(2, s11);
                    bVar.J(1, s12);
                    this.f23915a.a(bVar);
                }
            } catch (IOException e13) {
                bVar.a(e13.getMessage());
            }
        }
    }

    @Override // xb.a
    public boolean b(String str) {
        return false;
    }

    @Override // xb.a
    public boolean c(String str) {
        return str.equals("VP8X") || str.equals("VP8L") || str.equals("VP8 ") || str.equals("EXIF") || str.equals("ICCP") || str.equals("XMP ");
    }

    @Override // xb.a
    public boolean d(String str) {
        return str.equals("WEBP");
    }
}