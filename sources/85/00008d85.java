package o2;

import java.text.CharacterIterator;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b implements CharacterIterator {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f42131a;

    /* renamed from: b  reason: collision with root package name */
    private final int f42132b;

    /* renamed from: c  reason: collision with root package name */
    private final int f42133c;

    /* renamed from: d  reason: collision with root package name */
    private int f42134d;

    public b(CharSequence charSequence, int i11, int i12) {
        s.g(charSequence, "charSequence");
        this.f42131a = charSequence;
        this.f42132b = i11;
        this.f42133c = i12;
        this.f42134d = i11;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            Object clone = super.clone();
            s.f(clone, "{\n            @Suppress(…  super.clone()\n        }");
            return clone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i11 = this.f42134d;
        if (i11 == this.f42133c) {
            return (char) 65535;
        }
        return this.f42131a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f42134d = this.f42132b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f42132b;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f42133c;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f42134d;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i11 = this.f42132b;
        int i12 = this.f42133c;
        if (i11 == i12) {
            this.f42134d = i12;
            return (char) 65535;
        }
        int i13 = i12 - 1;
        this.f42134d = i13;
        return this.f42131a.charAt(i13);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i11 = this.f42134d + 1;
        this.f42134d = i11;
        int i12 = this.f42133c;
        if (i11 >= i12) {
            this.f42134d = i12;
            return (char) 65535;
        }
        return this.f42131a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i11 = this.f42134d;
        if (i11 <= this.f42132b) {
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f42134d = i12;
        return this.f42131a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i11) {
        int i12 = this.f42132b;
        boolean z11 = false;
        if (i11 <= this.f42133c && i12 <= i11) {
            z11 = true;
        }
        if (z11) {
            this.f42134d = i11;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}