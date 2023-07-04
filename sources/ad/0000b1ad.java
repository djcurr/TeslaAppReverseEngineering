package s2;

/* loaded from: classes.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(char c11, char c12) {
        return Character.isHighSurrogate(c11) && Character.isLowSurrogate(c12);
    }
}