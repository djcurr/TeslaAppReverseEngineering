package kotlin.text;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f35215a = new l();

    /* renamed from: b  reason: collision with root package name */
    public static final i f35216b;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        f35216b = new i("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + (CoreConstants.LEFT_PARENTHESIS_CHAR + "(\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)" + CoreConstants.RIGHT_PARENTHESIS_CHAR) + ")[pP][+-]?(\\p{Digit}+)" + CoreConstants.RIGHT_PARENTHESIS_CHAR) + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private l() {
    }
}