package qi;

import ak.v;
import ch.qos.logback.core.CoreConstants;
import cj.c;
import com.google.android.exoplayer2.ParserException;
import com.google.common.base.x;
import java.util.ArrayList;
import java.util.List;
import ji.u;
import wi.a;

/* loaded from: classes3.dex */
final class m {

    /* renamed from: d  reason: collision with root package name */
    private static final x f48283d = x.e(CoreConstants.COLON_CHAR);

    /* renamed from: e  reason: collision with root package name */
    private static final x f48284e = x.e('*');

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f48285a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f48286b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f48287c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f48288a;

        /* renamed from: b  reason: collision with root package name */
        public final int f48289b;

        public a(int i11, long j11, int i12) {
            this.f48288a = j11;
            this.f48289b = i12;
        }
    }

    private void a(ji.i iVar, u uVar) {
        v vVar = new v(8);
        iVar.readFully(vVar.d(), 0, 8);
        this.f48287c = vVar.p() + 8;
        if (vVar.m() != 1397048916) {
            uVar.f33770a = 0L;
            return;
        }
        uVar.f33770a = iVar.getPosition() - (this.f48287c - 12);
        this.f48286b = 2;
    }

    private static int b(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c11 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c11 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c11 = 4;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw new ParserException("Invalid SEF name");
        }
    }

    private void d(ji.i iVar, u uVar) {
        long length = iVar.getLength();
        int i11 = (this.f48287c - 12) - 8;
        v vVar = new v(i11);
        iVar.readFully(vVar.d(), 0, i11);
        for (int i12 = 0; i12 < i11 / 12; i12++) {
            vVar.P(2);
            short r11 = vVar.r();
            if (r11 != 2192 && r11 != 2816 && r11 != 2817 && r11 != 2819 && r11 != 2820) {
                vVar.P(8);
            } else {
                this.f48285a.add(new a(r11, (length - this.f48287c) - vVar.p(), vVar.p()));
            }
        }
        if (this.f48285a.isEmpty()) {
            uVar.f33770a = 0L;
            return;
        }
        this.f48286b = 3;
        uVar.f33770a = this.f48285a.get(0).f48288a;
    }

    private void e(ji.i iVar, List<a.b> list) {
        long position = iVar.getPosition();
        int length = (int) ((iVar.getLength() - iVar.getPosition()) - this.f48287c);
        v vVar = new v(length);
        iVar.readFully(vVar.d(), 0, length);
        for (int i11 = 0; i11 < this.f48285a.size(); i11++) {
            a aVar = this.f48285a.get(i11);
            vVar.O((int) (aVar.f48288a - position));
            vVar.P(4);
            int p11 = vVar.p();
            int b11 = b(vVar.z(p11));
            int i12 = aVar.f48289b - (p11 + 8);
            if (b11 == 2192) {
                list.add(f(vVar, i12));
            } else if (b11 != 2816 && b11 != 2817 && b11 != 2819 && b11 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static cj.c f(v vVar, int i11) {
        ArrayList arrayList = new ArrayList();
        List<String> k11 = f48284e.k(vVar.z(i11));
        for (int i12 = 0; i12 < k11.size(); i12++) {
            List<String> k12 = f48283d.k(k11.get(i12));
            if (k12.size() == 3) {
                try {
                    arrayList.add(new c.b(Long.parseLong(k12.get(0)), Long.parseLong(k12.get(1)), 1 << (Integer.parseInt(k12.get(2)) - 1)));
                } catch (NumberFormatException e11) {
                    throw new ParserException(e11);
                }
            } else {
                throw new ParserException();
            }
        }
        return new cj.c(arrayList);
    }

    public int c(ji.i iVar, u uVar, List<a.b> list) {
        int i11 = this.f48286b;
        long j11 = 0;
        if (i11 == 0) {
            long length = iVar.getLength();
            if (length != -1 && length >= 8) {
                j11 = length - 8;
            }
            uVar.f33770a = j11;
            this.f48286b = 1;
        } else if (i11 == 1) {
            a(iVar, uVar);
        } else if (i11 == 2) {
            d(iVar, uVar);
        } else if (i11 == 3) {
            e(iVar, list);
            uVar.f33770a = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    public void g() {
        this.f48285a.clear();
        this.f48286b = 0;
    }
}