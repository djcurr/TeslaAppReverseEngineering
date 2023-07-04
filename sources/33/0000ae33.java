package qm;

/* loaded from: classes3.dex */
public interface k {

    /* loaded from: classes3.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        a(int i11) {
            this.code = i11;
        }

        public int getCode() {
            return this.code;
        }
    }

    a b(String str);
}