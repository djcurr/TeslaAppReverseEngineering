package wj;

import ak.v;
import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class h extends nj.d {

    /* renamed from: n  reason: collision with root package name */
    private final v f55965n;

    /* renamed from: o  reason: collision with root package name */
    private final a f55966o;

    public h() {
        super("WebvttDecoder");
        this.f55965n = new v();
        this.f55966o = new a();
    }

    private static int B(v vVar) {
        int i11 = 0;
        int i12 = -1;
        while (i12 == -1) {
            i11 = vVar.e();
            String o11 = vVar.o();
            if (o11 == null) {
                i12 = 0;
            } else if ("STYLE".equals(o11)) {
                i12 = 2;
            } else {
                i12 = o11.startsWith("NOTE") ? 1 : 3;
            }
        }
        vVar.O(i11);
        return i12;
    }

    private static void C(v vVar) {
        do {
        } while (!TextUtils.isEmpty(vVar.o()));
    }

    @Override // nj.d
    protected nj.f A(byte[] bArr, int i11, boolean z11) {
        e m11;
        this.f55965n.M(bArr, i11);
        ArrayList arrayList = new ArrayList();
        try {
            i.e(this.f55965n);
            do {
            } while (!TextUtils.isEmpty(this.f55965n.o()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int B = B(this.f55965n);
                if (B == 0) {
                    return new k(arrayList2);
                }
                if (B == 1) {
                    C(this.f55965n);
                } else if (B == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f55965n.o();
                        arrayList.addAll(this.f55966o.d(this.f55965n));
                    } else {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                } else if (B == 3 && (m11 = f.m(this.f55965n, arrayList)) != null) {
                    arrayList2.add(m11);
                }
            }
        } catch (ParserException e11) {
            throw new SubtitleDecoderException(e11);
        }
    }
}