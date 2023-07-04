package j$.time.format;

import java.util.Objects;
import org.slf4j.Marker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class k implements g {

    /* renamed from: c  reason: collision with root package name */
    static final String[] f32914c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

    /* renamed from: d  reason: collision with root package name */
    static final k f32915d = new k("+HH:MM:ss", "Z");

    /* renamed from: a  reason: collision with root package name */
    private final String f32916a;

    /* renamed from: b  reason: collision with root package name */
    private final int f32917b;

    static {
        new k("+HH:MM:ss", "0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        int i11 = 0;
        while (true) {
            String[] strArr = f32914c;
            if (i11 >= strArr.length) {
                throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
            } else if (strArr[i11].equals(str)) {
                this.f32917b = i11;
                this.f32916a = str2;
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // j$.time.format.g
    public boolean c(q qVar, StringBuilder sb2) {
        Long e11 = qVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        if (e11 == null) {
            return false;
        }
        int intExact = Math.toIntExact(e11.longValue());
        if (intExact != 0) {
            int abs = Math.abs((intExact / 3600) % 100);
            int abs2 = Math.abs((intExact / 60) % 60);
            int abs3 = Math.abs(intExact % 60);
            int length = sb2.length();
            sb2.append(intExact < 0 ? "-" : Marker.ANY_NON_NULL_MARKER);
            sb2.append((char) ((abs / 10) + 48));
            sb2.append((char) ((abs % 10) + 48));
            int i11 = this.f32917b;
            if (i11 >= 3 || (i11 >= 1 && abs2 > 0)) {
                sb2.append(i11 % 2 == 0 ? ":" : "");
                sb2.append((char) ((abs2 / 10) + 48));
                sb2.append((char) ((abs2 % 10) + 48));
                abs += abs2;
                int i12 = this.f32917b;
                if (i12 >= 7 || (i12 >= 5 && abs3 > 0)) {
                    sb2.append(i12 % 2 != 0 ? "" : ":");
                    sb2.append((char) ((abs3 / 10) + 48));
                    sb2.append((char) ((abs3 % 10) + 48));
                    abs += abs3;
                }
            }
            if (abs == 0) {
                sb2.setLength(length);
            }
            return true;
        }
        sb2.append(this.f32916a);
        return true;
    }

    public String toString() {
        String replace = this.f32916a.replace("'", "''");
        return "Offset(" + f32914c[this.f32917b] + ",'" + replace + "')";
    }
}