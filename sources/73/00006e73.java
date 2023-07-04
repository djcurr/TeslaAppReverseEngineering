package fp;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.NotFoundException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e extends i {

    /* renamed from: c  reason: collision with root package name */
    private final String f26693c;

    /* renamed from: d  reason: collision with root package name */
    private final String f26694d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(uo.a aVar, String str, String str2) {
        super(aVar);
        this.f26693c = str2;
        this.f26694d = str;
    }

    private void k(StringBuilder sb2, int i11) {
        int f11 = b().f(i11, 16);
        if (f11 == 38400) {
            return;
        }
        sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb2.append(this.f26693c);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        int i12 = f11 % 32;
        int i13 = f11 / 32;
        int i14 = (i13 % 12) + 1;
        int i15 = i13 / 12;
        if (i15 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i15);
        if (i14 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i14);
        if (i12 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i12);
    }

    @Override // fp.j
    public String d() {
        if (c().g() == 84) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 8);
            j(sb2, 48, 20);
            k(sb2, 68);
            return sb2.toString();
        }
        throw NotFoundException.a();
    }

    @Override // fp.i
    protected void h(StringBuilder sb2, int i11) {
        sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb2.append(this.f26694d);
        sb2.append(i11 / 100000);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // fp.i
    protected int i(int i11) {
        return i11 % 100000;
    }
}