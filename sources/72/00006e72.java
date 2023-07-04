package fp;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.NotFoundException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d extends h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(uo.a aVar) {
        super(aVar);
    }

    @Override // fp.j
    public String d() {
        if (c().g() >= 48) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 8);
            int f11 = b().f(48, 2);
            sb2.append("(393");
            sb2.append(f11);
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            int f12 = b().f(50, 10);
            if (f12 / 100 == 0) {
                sb2.append('0');
            }
            if (f12 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(f12);
            sb2.append(b().c(60, null).b());
            return sb2.toString();
        }
        throw NotFoundException.a();
    }
}