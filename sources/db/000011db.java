package ch.qos.logback.core.util;

/* loaded from: classes.dex */
class CharSequenceState {

    /* renamed from: c  reason: collision with root package name */
    final char f9140c;
    int occurrences = 1;

    public CharSequenceState(char c11) {
        this.f9140c = c11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void incrementOccurrences() {
        this.occurrences++;
    }
}