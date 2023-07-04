package cd;

import cc.e;
import com.drew.metadata.MetadataException;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public class c implements xb.a {

    /* renamed from: a  reason: collision with root package name */
    private final b f9064a;

    /* renamed from: b  reason: collision with root package name */
    private String f9065b = "";

    public c(e eVar) {
        b bVar = new b();
        this.f9064a = bVar;
        eVar.a(bVar);
    }

    @Override // xb.a
    public void a(String str, byte[] bArr) {
        try {
            if (str.equals("fmt ")) {
                bc.a aVar = new bc.a(bArr);
                aVar.w(false);
                short f11 = aVar.f(0);
                short f12 = aVar.f(2);
                int h11 = aVar.h(4);
                int h12 = aVar.h(8);
                short f13 = aVar.f(12);
                if (f11 != 1) {
                    HashMap<Integer, String> hashMap = b.f9063g;
                    if (hashMap.containsKey(Integer.valueOf(f11))) {
                        this.f9064a.R(1, hashMap.get(Integer.valueOf(f11)));
                    } else {
                        this.f9064a.R(1, "Unknown");
                    }
                } else {
                    this.f9064a.J(6, aVar.f(14));
                    this.f9064a.R(1, b.f9063g.get(Integer.valueOf(f11)));
                }
                this.f9064a.J(2, f12);
                this.f9064a.J(3, h11);
                this.f9064a.J(4, h12);
                this.f9064a.J(5, f13);
            } else if (str.equals(MessageExtension.FIELD_DATA)) {
                try {
                    if (this.f9064a.b(4)) {
                        double length = bArr.length / this.f9064a.g(4);
                        int i11 = (int) length;
                        Integer valueOf = Integer.valueOf(i11 / ((int) Math.pow(60.0d, 2.0d)));
                        Integer valueOf2 = Integer.valueOf((i11 / ((int) Math.pow(60.0d, 1.0d))) - (valueOf.intValue() * 60));
                        this.f9064a.R(16, String.format("%1$02d:%2$02d:%3$02d", valueOf, valueOf2, Integer.valueOf((int) Math.round((length / Math.pow(60.0d, 0.0d)) - (valueOf2.intValue() * 60)))));
                    }
                } catch (MetadataException unused) {
                    this.f9064a.a("Error calculating duration: bytes per second not found");
                }
            } else {
                HashMap<String, Integer> hashMap2 = b.f9062f;
                if (hashMap2.containsKey(str)) {
                    this.f9064a.R(hashMap2.get(str).intValue(), new String(bArr).substring(0, bArr.length - 1));
                }
            }
        } catch (IOException e11) {
            this.f9064a.a(e11.getMessage());
        }
    }

    @Override // xb.a
    public boolean b(String str) {
        if (str.equals("INFO")) {
            this.f9065b = "INFO";
            return true;
        }
        this.f9065b = "";
        return false;
    }

    @Override // xb.a
    public boolean c(String str) {
        return str.equals("fmt ") || (this.f9065b.equals("INFO") && b.f9062f.containsKey(str)) || str.equals(MessageExtension.FIELD_DATA);
    }

    @Override // xb.a
    public boolean d(String str) {
        return str.equals("WAVE");
    }
}