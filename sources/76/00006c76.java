package ezvcard.util;

import ch.qos.logback.core.CoreConstants;
import expo.modules.imagepicker.ImagePickerConstants;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f25452a;

    /* renamed from: b  reason: collision with root package name */
    private final String f25453b;

    /* renamed from: c  reason: collision with root package name */
    private final String f25454c;

    private d(String str, byte[] bArr, String str2) {
        this.f25454c = str == null ? "" : str.toLowerCase();
        this.f25452a = bArr;
        this.f25453b = str2;
    }

    public static d c(String str) {
        String str2;
        int i11 = 5;
        if (str.length() < 5 || !str.substring(0, 5).equalsIgnoreCase("data:")) {
            throw ezvcard.a.INSTANCE.getIllegalArgumentException(18, "data:");
        }
        byte[] bArr = null;
        String str3 = null;
        String str4 = null;
        int i12 = 5;
        boolean z11 = false;
        while (true) {
            if (i11 >= str.length()) {
                str2 = null;
                break;
            }
            char charAt = str.charAt(i11);
            if (charAt == ';') {
                String substring = str.substring(i12, i11);
                if (str3 == null) {
                    str3 = substring.toLowerCase();
                } else if (substring.toLowerCase().startsWith("charset=")) {
                    str4 = substring.substring(substring.indexOf(61) + 1);
                } else if (ImagePickerConstants.OPTION_BASE64.equalsIgnoreCase(substring)) {
                    z11 = true;
                }
                i12 = i11 + 1;
            } else if (charAt == ',') {
                String substring2 = str.substring(i12, i11);
                if (str3 == null) {
                    str3 = substring2.toLowerCase();
                } else if (substring2.toLowerCase().startsWith("charset=")) {
                    str4 = substring2.substring(substring2.indexOf(61) + 1);
                } else if (ImagePickerConstants.OPTION_BASE64.equalsIgnoreCase(substring2)) {
                    z11 = true;
                }
                str2 = str.substring(i11 + 1);
            }
            i11++;
        }
        if (str2 != null) {
            if (z11) {
                byte[] p11 = ax.a.p(str2.replaceAll("\\s", ""));
                if (str4 != null) {
                    try {
                        str2 = new String(p11, str4);
                    } catch (UnsupportedEncodingException e11) {
                        throw new IllegalArgumentException(ezvcard.a.INSTANCE.getExceptionMessage(43, str4), e11);
                    }
                } else {
                    bArr = p11;
                    str2 = null;
                }
            }
            return new d(str3, bArr, str2);
        }
        throw ezvcard.a.INSTANCE.getIllegalArgumentException(20, new Object[0]);
    }

    public String a() {
        return this.f25454c;
    }

    public byte[] b() {
        return this.f25452a;
    }

    public String d(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("data:");
        sb2.append(this.f25454c);
        if (this.f25452a != null) {
            sb2.append(";base64,");
            sb2.append(ax.a.t(this.f25452a));
        } else {
            String str2 = this.f25453b;
            if (str2 == null) {
                sb2.append(CoreConstants.COMMA_CHAR);
            } else if (str == null) {
                sb2.append(CoreConstants.COMMA_CHAR);
                sb2.append(this.f25453b);
            } else {
                try {
                    byte[] bytes = str2.getBytes(str);
                    sb2.append(";charset=");
                    sb2.append(str);
                    sb2.append(";base64,");
                    sb2.append(ax.a.t(bytes));
                } catch (UnsupportedEncodingException e11) {
                    throw new IllegalArgumentException(ezvcard.a.INSTANCE.getExceptionMessage(44, str), e11);
                }
            }
        }
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f25454c.equals(dVar.f25454c) && Arrays.equals(this.f25452a, dVar.f25452a)) {
                String str = this.f25453b;
                if (str == null) {
                    if (dVar.f25453b != null) {
                        return false;
                    }
                } else if (!str.equals(dVar.f25453b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f25454c.hashCode() + 31) * 31) + Arrays.hashCode(this.f25452a)) * 31;
        String str = this.f25453b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return d(null);
    }
}