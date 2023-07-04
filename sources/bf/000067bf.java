package ec;

import cc.e;
import java.io.IOException;

/* loaded from: classes.dex */
public class c implements xb.a {

    /* renamed from: a  reason: collision with root package name */
    private final b f25060a;

    public c(e eVar) {
        b bVar = new b();
        this.f25060a = bVar;
        eVar.a(bVar);
    }

    @Override // xb.a
    public void a(String str, byte[] bArr) {
        Integer valueOf;
        try {
            if (str.equals("strh")) {
                bc.a aVar = new bc.a(bArr);
                aVar.w(false);
                String str2 = new String(aVar.c(0, 4));
                String str3 = new String(aVar.c(4, 4));
                float e11 = aVar.e(20);
                float e12 = aVar.e(24);
                int h11 = aVar.h(32);
                if (str2.equals("vids")) {
                    if (!this.f25060a.b(1)) {
                        float f11 = e12 / e11;
                        this.f25060a.F(1, f11);
                        double d11 = h11 / f11;
                        int i11 = (int) d11;
                        Integer valueOf2 = Integer.valueOf(i11 / ((int) Math.pow(60.0d, 2.0d)));
                        this.f25060a.R(3, String.format("%1$02d:%2$02d:%3$02d", valueOf2, Integer.valueOf((i11 / ((int) Math.pow(60.0d, 1.0d))) - (valueOf2.intValue() * 60)), Integer.valueOf((int) Math.round((d11 / Math.pow(60.0d, 0.0d)) - (valueOf.intValue() * 60)))));
                        this.f25060a.R(4, str3);
                    }
                } else if (str2.equals("auds") && !this.f25060a.b(2)) {
                    this.f25060a.F(2, e12 / e11);
                }
            } else if (str.equals("avih")) {
                bc.a aVar2 = new bc.a(bArr);
                aVar2.w(false);
                int h12 = aVar2.h(24);
                int h13 = aVar2.h(32);
                int h14 = aVar2.h(36);
                this.f25060a.J(6, h13);
                this.f25060a.J(7, h14);
                this.f25060a.J(8, h12);
            }
        } catch (IOException e13) {
            this.f25060a.a(e13.getMessage());
        }
    }

    @Override // xb.a
    public boolean b(String str) {
        return str.equals("hdrl") || str.equals("strl") || str.equals("AVI ");
    }

    @Override // xb.a
    public boolean c(String str) {
        return str.equals("strh") || str.equals("avih");
    }

    @Override // xb.a
    public boolean d(String str) {
        return str.equals("AVI ");
    }
}