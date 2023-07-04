package jh;

import java.util.BitSet;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final BitSet f33678a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f33679b;

    public a(BitSet bitSet, boolean z11) {
        this.f33678a = bitSet;
        this.f33679b = z11;
    }

    public boolean c(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt >= 128) {
                if (!this.f33679b) {
                    return false;
                }
            } else if (!this.f33678a.get(charAt)) {
                return false;
            }
        }
        return true;
    }

    public a d() {
        BitSet bitSet = (BitSet) this.f33678a.clone();
        bitSet.flip(0, 128);
        return new a(bitSet, !this.f33679b);
    }

    public String e(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        for (int i11 = 0; i11 < 128; i11++) {
            if (this.f33678a.get(i11)) {
                String str = null;
                char c11 = (char) i11;
                if (c11 == '\t') {
                    str = "\\t";
                } else if (c11 == '\n') {
                    str = "\\n";
                } else if (c11 == '\r') {
                    str = "\\r";
                } else if (c11 == ' ') {
                    str = "<space>";
                } else if (i11 < 32 || i11 == 127) {
                    if (!z11) {
                        str = "(" + i11 + ")";
                    }
                }
                sb2.append(' ');
                if (str == null) {
                    sb2.append(c11);
                } else {
                    sb2.append(str);
                }
            }
        }
        sb2.append(" ]");
        return sb2.toString();
    }

    public String toString() {
        return e(false);
    }

    /* renamed from: jh.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0615a {

        /* renamed from: a  reason: collision with root package name */
        private final BitSet f33680a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f33681b;

        public C0615a() {
            this.f33680a = new BitSet(128);
            this.f33681b = false;
        }

        private void j(String str, boolean z11) {
            for (int i11 = 0; i11 < str.length(); i11++) {
                this.f33680a.set(str.charAt(i11), z11);
            }
        }

        public C0615a a(char c11) {
            this.f33680a.set(c11);
            return this;
        }

        public C0615a b(int i11, int i12) {
            this.f33680a.set(i11, i12 + 1);
            return this;
        }

        public C0615a c(String str) {
            j(str, true);
            return this;
        }

        public C0615a d() {
            this.f33680a.set(0, 128);
            this.f33681b = true;
            return this;
        }

        public C0615a e() {
            this.f33681b = true;
            return this;
        }

        public C0615a f() {
            return b(32, 126);
        }

        public a g() {
            return new a(this.f33680a, this.f33681b);
        }

        public C0615a h(char c11) {
            this.f33680a.set((int) c11, false);
            return this;
        }

        public C0615a i(String str) {
            j(str, false);
            return this;
        }

        public C0615a(a aVar) {
            this.f33680a = (BitSet) aVar.f33678a.clone();
            this.f33681b = aVar.f33679b;
        }
    }
}