package zj;

import ak.k0;
import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.net.URLDecoder;

/* loaded from: classes3.dex */
public final class g extends e {

    /* renamed from: e  reason: collision with root package name */
    private com.google.android.exoplayer2.upstream.b f60436e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f60437f;

    /* renamed from: g  reason: collision with root package name */
    private int f60438g;

    /* renamed from: h  reason: collision with root package name */
    private int f60439h;

    public g() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        if (this.f60437f != null) {
            this.f60437f = null;
            p();
        }
        this.f60436e = null;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long i(com.google.android.exoplayer2.upstream.b bVar) {
        q(bVar);
        this.f60436e = bVar;
        this.f60439h = (int) bVar.f14637f;
        Uri uri = bVar.f14632a;
        String scheme = uri.getScheme();
        if (!MessageExtension.FIELD_DATA.equals(scheme)) {
            String valueOf = String.valueOf(scheme);
            throw new ParserException(valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        }
        String[] L0 = k0.L0(uri.getSchemeSpecificPart(), ",");
        if (L0.length == 2) {
            String str = L0[1];
            if (L0[0].contains(";base64")) {
                try {
                    this.f60437f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e11) {
                    String valueOf2 = String.valueOf(str);
                    throw new ParserException(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e11);
                }
            } else {
                this.f60437f = k0.l0(URLDecoder.decode(str, com.google.common.base.f.f15918a.name()));
            }
            long j11 = bVar.f14638g;
            int length = j11 != -1 ? ((int) j11) + this.f60439h : this.f60437f.length;
            this.f60438g = length;
            if (length <= this.f60437f.length && this.f60439h <= length) {
                r(bVar);
                return this.f60438g - this.f60439h;
            }
            this.f60437f = null;
            throw new DataSourceException(0);
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(valueOf3.length() + 23);
        sb2.append("Unexpected URI format: ");
        sb2.append(valueOf3);
        throw new ParserException(sb2.toString());
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri m() {
        com.google.android.exoplayer2.upstream.b bVar = this.f60436e;
        if (bVar != null) {
            return bVar.f14632a;
        }
        return null;
    }

    @Override // zj.f
    public int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.f60438g - this.f60439h;
        if (i13 == 0) {
            return -1;
        }
        int min = Math.min(i12, i13);
        System.arraycopy(k0.j(this.f60437f), this.f60439h, bArr, i11, min);
        this.f60439h += min;
        o(min);
        return min;
    }
}