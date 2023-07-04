package atd.e;

import java.util.Locale;

/* loaded from: classes.dex */
public enum b {
    SINGLE_TEXT_INPUT(1),
    SINGLE_SELECT(2),
    MULTI_SELECT(3),
    OUT_OF_BAND(4),
    HTML_UI(5);
    
    public static final String MESSAGE_FORMAT_INVALID_ID = atd.s0.a.a(-91545891826240L);
    private int mId;

    b(int i11) {
        this.mId = i11;
    }

    public static b a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return a(Integer.parseInt(str));
        } catch (NumberFormatException e11) {
            throw new atd.a0.a(String.format(Locale.ENGLISH, atd.s0.a.a(-91674740845120L), str), e11, c.DATA_ELEMENT_INVALID_FORMAT);
        }
    }

    public static b a(int i11) {
        b[] values;
        for (b bVar : values()) {
            if (bVar.mId == i11) {
                return bVar;
            }
        }
        throw new atd.a0.a(String.format(Locale.ENGLISH, atd.s0.a.a(-91747755289152L), Integer.valueOf(i11)), c.DATA_ELEMENT_INVALID_FORMAT);
    }

    public int a() {
        return this.mId;
    }
}